package main.java.pw.oliver.jmkb;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.avro.specific.SpecificRecordBase;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import main.java.pw.oliver.jmkb.avroclasses.Datastream;
import main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest;
import main.java.pw.oliver.jmkb.avroclasses.Location;
import main.java.pw.oliver.jmkb.avroclasses.LocationType;
import main.java.pw.oliver.jmkb.avroclasses.Observation;
import main.java.pw.oliver.jmkb.avroclasses.ObservedProperty;
import main.java.pw.oliver.jmkb.avroclasses.Sensor;
import main.java.pw.oliver.jmkb.avroclasses.Thing;
import main.java.pw.oliver.jmkb.avroclasses.UnitOfMeasurement;

/**
 * This class handles the conversion of MqttMessages to a different format.
 * @author Oliver
 *
 */
public class MqttMessageConverter {

	private static final Logger LOGGER = Logger.getLogger(MqttMessageConverter.class.getName());

	private FrostIotIdConverter conv;

	/**
	 * Default constructor.
	 */
	public MqttMessageConverter() {
		conv = new FrostIotIdConverter();
	}

	/**
	 * Converts an MqttMessage to a SpecificRecordBase object based on the type of FROST topic.
	 * The returned object will actually be an instance of one of the seven classes defined in the
	 * avroclasses subpackage.
	 * @param topic The topic of the MqttMessage
	 * @param message The MqttMessage
	 * @return a SpecificRecordBase object
	 */
	public SpecificRecordBase mqttMessageToAvro(String topic, MqttMessage message) {
		// This repo might contain a better implementation of this method:
		// https://github.com/allegro/json-avro-converter
		JSONObject m;
		try {
			m = (JSONObject) new JSONParser().parse(new String(message.getPayload()));
		} catch (ParseException e) {
			LOGGER.log(Level.WARNING, e.toString(), e);
			return null;
		}
		SpecificRecordBase sr = null;
		try {
			switch (topic) {
			case "Datastreams":
				JSONObject uom = (JSONObject) m.get("unitOfMeasurement");
				sr = Datastream.newBuilder()
						.setIotId(m.get("@iot.id").toString())
						.setName(m.get("name").toString())
						.setDescription(m.get("description").toString())
						.setUnitOfMeasurement(UnitOfMeasurement.newBuilder()
								.setName(uom.get("name").toString())
								.setDefinition(uom.get("definition").toString())
								.setSymbol(uom.get("symbol").toString())
								.build())
						.setObservationType(m.get("observationType").toString())
						.setObservedArea((m.get("observedArea") == null) ? null : m.get("observedArea").toString())
						.setPhenomenonTime((m.get("phenomenonTime") == null) ? null : m.get("phenomenonTime").toString())
						.setResultTime((m.get("resultTime") == null) ? null : m.get("resultTime").toString())
						.setThing(conv.getSingleIotId(m.get("Thing@iot.navigationLink").toString()))
						.setObservedProperty(conv.getSingleIotId(m.get("ObservedProperty@iot.navigationLink").toString()))
						.setSensor(conv.getSingleIotId(m.get("Sensor@iot.navigationLink").toString()))
						.setObservations((m.get("Observations@iot.navigationLink") == null) ? null : conv.getMultipleIotIds(m.get("Observations@iot.navigationLink").toString()))
						.build();
				break;
			case "Sensors":
				sr = Sensor.newBuilder()
						.setIotId(m.get("@iot.id").toString())
						.setName(m.get("name").toString())
						.setDescription(m.get("description").toString())
						.setEncodingType(m.get("encodingType").toString())
						.setMetadata(m.get("metadata").toString())
						.setDatastreams((m.get("Datastreams@iot.navigationLink") == null) ? null : conv.getMultipleIotIds(m.get("Datastreams@iot.navigationLink").toString()))
						.build();
				break;
			case "ObservedProperties":
				sr = ObservedProperty.newBuilder()
						.setIotId(m.get("@iot.id").toString())
						.setName(m.get("name").toString())
						.setDescription(m.get("description").toString())
						.setDefinition(m.get("definition").toString())
						.setDatastreams((m.get("Datastreams@iot.navigationLink") == null) ? null : conv.getMultipleIotIds(m.get("Datastreams@iot.navigationLink").toString()))
						.build();
				break;
			case "Observations":
				sr = Observation.newBuilder()
						.setIotId(m.get("@iot.id").toString())
						.setPhenomenonTime(m.get("phenomenonTime").toString())
						.setResult(m.get("result").toString())
						.setResultTime(m.get("resultTime").toString())
						.setResultQuality((m.get("resultQuality") == null) ? null : m.get("resultQuality").toString())
						.setValidTime((m.get("validTime") == null) ? null : m.get("validTime").toString())
						.setDatastream(conv.getSingleIotId(m.get("Datastream@iot.navigationLink").toString()))
						.setFeatureOfInterest((m.get("FeatureOfInterest@iot.navigationLink") == null) ? null : conv.getSingleIotId(m.get("FeatureOfInterest@iot.navigationLink").toString()))
						.build();
				break;
			case "FeaturesOfInterest":
				JSONObject feat = (JSONObject) m.get("feature");
				String featCoordinates = ((JSONArray) feat.get("coordinates")).toString();
				// format the same way as iot.id lists
				if (featCoordinates != null && featCoordinates.length() >= 2) {
					featCoordinates = featCoordinates.substring(1, featCoordinates.length() - 1);
				} else {
					featCoordinates = "";
				}

				sr = FeatureOfInterest.newBuilder()
						.setIotId(m.get("@iot.id").toString())
						.setName(m.get("name").toString())
						.setDescription(m.get("description").toString())
						.setEncodingType(m.get("encodingType").toString())
						.setFeature(LocationType.newBuilder()
								.setType(feat.get("type").toString())
								.setCoordinates(featCoordinates)
								.build())
						.setObservations((m.get("Observations@iot.navigationLink") == null) ? null : conv.getMultipleIotIds(m.get("Observations@iot.navigationLink").toString()))
						.build();
				break;
			case "Things":
				sr = Thing.newBuilder()
						.setIotId(m.get("@iot.id").toString())
						.setName(m.get("name").toString())
						.setDescription(m.get("description").toString())
						.setLocations((m.get("Locations@iot.navigationLink") == null) ? null : conv.getMultipleIotIds(m.get("Locations@iot.navigationLink").toString()))
						.setDatastreams((m.get("Datastreams@iot.navigationLink") == null) ? null : conv.getMultipleIotIds(m.get("Datastreams@iot.navigationLink").toString()))
						.build();
				break;
			case "HistoricalLocations":
				sr = null;
				break;
			case "Locations":
				JSONObject loc = (JSONObject) m.get("feature");
				String locCoordinates = ((JSONArray) loc.get("coordinates")).toString();
				// format the same way as iot.id lists
				if (locCoordinates != null && locCoordinates.length() >= 2) {
					locCoordinates = locCoordinates.substring(1, locCoordinates.length() - 1);
				} else {
					locCoordinates = "";
				}

				sr = Location.newBuilder()
						.setIotId(m.get("@iot.id").toString())
						.setName(m.get("name").toString())
						.setDescription(m.get("description").toString())
						.setEncodingType(m.get("encodingType").toString())
						.setLocation(LocationType.newBuilder()
								.setType(loc.get("type").toString())
								.setCoordinates(locCoordinates)
								.build())
						.setThings((m.get("Things@iot.navigationLink") == null) ? null : conv.getMultipleIotIds(m.get("Things@iot.navigationLink").toString()))
						.build();
				break;
			default:
				sr = null;
				break;
			}
		} catch (NullPointerException e) {
			LOGGER.log(Level.SEVERE, e.toString(), e);
			return null;
		}
		return sr;
	}
}
