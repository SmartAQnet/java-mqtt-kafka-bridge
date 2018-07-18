/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package main.java.pw.oliver.jmkb.avroclasses;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** A Thing has Locations and one or more Datastreams to collect Observations. */
@org.apache.avro.specific.AvroGenerated
public class Thing extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5294454331165028019L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Thing\",\"namespace\":\"main.java.pw.oliver.jmkb.avroclasses\",\"doc\":\"A Thing has Locations and one or more Datastreams to collect Observations.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the Thing\"},{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Description of the Thing\"},{\"name\":\"properties\",\"type\":\"null\",\"doc\":\"Properties of the Thing (currently unused)\"},{\"name\":\"Locations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Location\",\"doc\":\"A Things Location entity is defined as the last known location of the Thing. A Thing can have multiple Locations if all Locations are different representations of same Location with different encodingType.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the Location\"},{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Description of the Location\"},{\"name\":\"encodingType\",\"type\":\"string\",\"doc\":\"Representation/encoding type of the Location\"},{\"name\":\"location\",\"type\":{\"type\":\"record\",\"name\":\"LocationType\",\"doc\":\"The type of the location, for example Point\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"doc\":\"Name of the LocationType\"},{\"name\":\"coordinates\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"doc\":\"Coordinates for the LocationType\"}]},\"doc\":\"LocationType containing the actual location of the Thing\"}]}}],\"doc\":\"Optional Location(s) of the Thing\"},{\"name\":\"HistoricalLocations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Location\"}],\"doc\":\"Optional HistoricalLocation(s) of the Thing\"},{\"name\":\"Datastreams\",\"type\":\"null\",\"doc\":\"Unused optional Datastream(s) of the Thing\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Thing> ENCODER =
      new BinaryMessageEncoder<Thing>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Thing> DECODER =
      new BinaryMessageDecoder<Thing>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Thing> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Thing> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Thing>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Thing to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Thing from a ByteBuffer. */
  public static Thing fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Name of the Thing */
  @Deprecated public java.lang.CharSequence name;
  /** Description of the Thing */
  @Deprecated public java.lang.CharSequence description;
  /** Properties of the Thing (currently unused) */
  @Deprecated public java.lang.Void properties;
  /** Optional Location(s) of the Thing */
  @Deprecated public java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> Locations;
  /** Optional HistoricalLocation(s) of the Thing */
  @Deprecated public java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> HistoricalLocations;
  /** Unused optional Datastream(s) of the Thing */
  @Deprecated public java.lang.Void Datastreams;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Thing() {}

  /**
   * All-args constructor.
   * @param name Name of the Thing
   * @param description Description of the Thing
   * @param properties Properties of the Thing (currently unused)
   * @param Locations Optional Location(s) of the Thing
   * @param HistoricalLocations Optional HistoricalLocation(s) of the Thing
   * @param Datastreams Unused optional Datastream(s) of the Thing
   */
  public Thing(java.lang.CharSequence name, java.lang.CharSequence description, java.lang.Void properties, java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> Locations, java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> HistoricalLocations, java.lang.Void Datastreams) {
    this.name = name;
    this.description = description;
    this.properties = properties;
    this.Locations = Locations;
    this.HistoricalLocations = HistoricalLocations;
    this.Datastreams = Datastreams;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return description;
    case 2: return properties;
    case 3: return Locations;
    case 4: return HistoricalLocations;
    case 5: return Datastreams;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: description = (java.lang.CharSequence)value$; break;
    case 2: properties = (java.lang.Void)value$; break;
    case 3: Locations = (java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location>)value$; break;
    case 4: HistoricalLocations = (java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location>)value$; break;
    case 5: Datastreams = (java.lang.Void)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return Name of the Thing
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Name of the Thing
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return Description of the Thing
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Description of the Thing
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'properties' field.
   * @return Properties of the Thing (currently unused)
   */
  public java.lang.Void getProperties() {
    return properties;
  }

  /**
   * Sets the value of the 'properties' field.
   * Properties of the Thing (currently unused)
   * @param value the value to set.
   */
  public void setProperties(java.lang.Void value) {
    this.properties = value;
  }

  /**
   * Gets the value of the 'Locations' field.
   * @return Optional Location(s) of the Thing
   */
  public java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> getLocations() {
    return Locations;
  }

  /**
   * Sets the value of the 'Locations' field.
   * Optional Location(s) of the Thing
   * @param value the value to set.
   */
  public void setLocations(java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> value) {
    this.Locations = value;
  }

  /**
   * Gets the value of the 'HistoricalLocations' field.
   * @return Optional HistoricalLocation(s) of the Thing
   */
  public java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> getHistoricalLocations() {
    return HistoricalLocations;
  }

  /**
   * Sets the value of the 'HistoricalLocations' field.
   * Optional HistoricalLocation(s) of the Thing
   * @param value the value to set.
   */
  public void setHistoricalLocations(java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> value) {
    this.HistoricalLocations = value;
  }

  /**
   * Gets the value of the 'Datastreams' field.
   * @return Unused optional Datastream(s) of the Thing
   */
  public java.lang.Void getDatastreams() {
    return Datastreams;
  }

  /**
   * Sets the value of the 'Datastreams' field.
   * Unused optional Datastream(s) of the Thing
   * @param value the value to set.
   */
  public void setDatastreams(java.lang.Void value) {
    this.Datastreams = value;
  }

  /**
   * Creates a new Thing RecordBuilder.
   * @return A new Thing RecordBuilder
   */
  public static main.java.pw.oliver.jmkb.avroclasses.Thing.Builder newBuilder() {
    return new main.java.pw.oliver.jmkb.avroclasses.Thing.Builder();
  }

  /**
   * Creates a new Thing RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Thing RecordBuilder
   */
  public static main.java.pw.oliver.jmkb.avroclasses.Thing.Builder newBuilder(main.java.pw.oliver.jmkb.avroclasses.Thing.Builder other) {
    return new main.java.pw.oliver.jmkb.avroclasses.Thing.Builder(other);
  }

  /**
   * Creates a new Thing RecordBuilder by copying an existing Thing instance.
   * @param other The existing instance to copy.
   * @return A new Thing RecordBuilder
   */
  public static main.java.pw.oliver.jmkb.avroclasses.Thing.Builder newBuilder(main.java.pw.oliver.jmkb.avroclasses.Thing other) {
    return new main.java.pw.oliver.jmkb.avroclasses.Thing.Builder(other);
  }

  /**
   * RecordBuilder for Thing instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Thing>
    implements org.apache.avro.data.RecordBuilder<Thing> {

    /** Name of the Thing */
    private java.lang.CharSequence name;
    /** Description of the Thing */
    private java.lang.CharSequence description;
    /** Properties of the Thing (currently unused) */
    private java.lang.Void properties;
    /** Optional Location(s) of the Thing */
    private java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> Locations;
    /** Optional HistoricalLocation(s) of the Thing */
    private java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> HistoricalLocations;
    /** Unused optional Datastream(s) of the Thing */
    private java.lang.Void Datastreams;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(main.java.pw.oliver.jmkb.avroclasses.Thing.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.properties)) {
        this.properties = data().deepCopy(fields()[2].schema(), other.properties);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Locations)) {
        this.Locations = data().deepCopy(fields()[3].schema(), other.Locations);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.HistoricalLocations)) {
        this.HistoricalLocations = data().deepCopy(fields()[4].schema(), other.HistoricalLocations);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Datastreams)) {
        this.Datastreams = data().deepCopy(fields()[5].schema(), other.Datastreams);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Thing instance
     * @param other The existing instance to copy.
     */
    private Builder(main.java.pw.oliver.jmkb.avroclasses.Thing other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.properties)) {
        this.properties = data().deepCopy(fields()[2].schema(), other.properties);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Locations)) {
        this.Locations = data().deepCopy(fields()[3].schema(), other.Locations);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.HistoricalLocations)) {
        this.HistoricalLocations = data().deepCopy(fields()[4].schema(), other.HistoricalLocations);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Datastreams)) {
        this.Datastreams = data().deepCopy(fields()[5].schema(), other.Datastreams);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * Name of the Thing
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Name of the Thing
      * @param value The value of 'name'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Name of the Thing
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * Name of the Thing
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * Description of the Thing
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * Description of the Thing
      * @param value The value of 'description'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * Description of the Thing
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'description' field.
      * Description of the Thing
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'properties' field.
      * Properties of the Thing (currently unused)
      * @return The value.
      */
    public java.lang.Void getProperties() {
      return properties;
    }

    /**
      * Sets the value of the 'properties' field.
      * Properties of the Thing (currently unused)
      * @param value The value of 'properties'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder setProperties(java.lang.Void value) {
      validate(fields()[2], value);
      this.properties = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'properties' field has been set.
      * Properties of the Thing (currently unused)
      * @return True if the 'properties' field has been set, false otherwise.
      */
    public boolean hasProperties() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'properties' field.
      * Properties of the Thing (currently unused)
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder clearProperties() {
      properties = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Locations' field.
      * Optional Location(s) of the Thing
      * @return The value.
      */
    public java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> getLocations() {
      return Locations;
    }

    /**
      * Sets the value of the 'Locations' field.
      * Optional Location(s) of the Thing
      * @param value The value of 'Locations'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder setLocations(java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> value) {
      validate(fields()[3], value);
      this.Locations = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Locations' field has been set.
      * Optional Location(s) of the Thing
      * @return True if the 'Locations' field has been set, false otherwise.
      */
    public boolean hasLocations() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Locations' field.
      * Optional Location(s) of the Thing
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder clearLocations() {
      Locations = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'HistoricalLocations' field.
      * Optional HistoricalLocation(s) of the Thing
      * @return The value.
      */
    public java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> getHistoricalLocations() {
      return HistoricalLocations;
    }

    /**
      * Sets the value of the 'HistoricalLocations' field.
      * Optional HistoricalLocation(s) of the Thing
      * @param value The value of 'HistoricalLocations'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder setHistoricalLocations(java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location> value) {
      validate(fields()[4], value);
      this.HistoricalLocations = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'HistoricalLocations' field has been set.
      * Optional HistoricalLocation(s) of the Thing
      * @return True if the 'HistoricalLocations' field has been set, false otherwise.
      */
    public boolean hasHistoricalLocations() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'HistoricalLocations' field.
      * Optional HistoricalLocation(s) of the Thing
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder clearHistoricalLocations() {
      HistoricalLocations = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'Datastreams' field.
      * Unused optional Datastream(s) of the Thing
      * @return The value.
      */
    public java.lang.Void getDatastreams() {
      return Datastreams;
    }

    /**
      * Sets the value of the 'Datastreams' field.
      * Unused optional Datastream(s) of the Thing
      * @param value The value of 'Datastreams'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder setDatastreams(java.lang.Void value) {
      validate(fields()[5], value);
      this.Datastreams = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'Datastreams' field has been set.
      * Unused optional Datastream(s) of the Thing
      * @return True if the 'Datastreams' field has been set, false otherwise.
      */
    public boolean hasDatastreams() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'Datastreams' field.
      * Unused optional Datastream(s) of the Thing
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.Thing.Builder clearDatastreams() {
      Datastreams = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Thing build() {
      try {
        Thing record = new Thing();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.properties = fieldSetFlags()[2] ? this.properties : (java.lang.Void) defaultValue(fields()[2]);
        record.Locations = fieldSetFlags()[3] ? this.Locations : (java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location>) defaultValue(fields()[3]);
        record.HistoricalLocations = fieldSetFlags()[4] ? this.HistoricalLocations : (java.util.List<main.java.pw.oliver.jmkb.avroclasses.Location>) defaultValue(fields()[4]);
        record.Datastreams = fieldSetFlags()[5] ? this.Datastreams : (java.lang.Void) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Thing>
    WRITER$ = (org.apache.avro.io.DatumWriter<Thing>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Thing>
    READER$ = (org.apache.avro.io.DatumReader<Thing>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
