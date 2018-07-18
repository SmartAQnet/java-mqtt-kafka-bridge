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
/** In the case of remote sensing, the FeatureOfInterest can be the geographical area or volume that is being sensed. */
@org.apache.avro.specific.AvroGenerated
public class FeatureOfInterest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1946619323316476751L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FeatureOfInterest\",\"namespace\":\"main.java.pw.oliver.jmkb.avroclasses\",\"doc\":\"In the case of remote sensing, the FeatureOfInterest can be the geographical area or volume that is being sensed.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the FeatureOfInterest\"},{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Description of the FeatureOfInterest\"},{\"name\":\"encodingType\",\"type\":\"string\",\"doc\":\"Representation/encoding type of the FeatureOfInterest\"},{\"name\":\"feature\",\"type\":{\"type\":\"record\",\"name\":\"LocationType\",\"doc\":\"The type of the location, for example Point\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"doc\":\"Name of the LocationType\"},{\"name\":\"coordinates\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"doc\":\"Coordinates for the LocationType\"}]},\"doc\":\"LocationType object containing the feature of the Thing\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FeatureOfInterest> ENCODER =
      new BinaryMessageEncoder<FeatureOfInterest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FeatureOfInterest> DECODER =
      new BinaryMessageDecoder<FeatureOfInterest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<FeatureOfInterest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<FeatureOfInterest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FeatureOfInterest>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this FeatureOfInterest to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a FeatureOfInterest from a ByteBuffer. */
  public static FeatureOfInterest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Name of the FeatureOfInterest */
  @Deprecated public java.lang.CharSequence name;
  /** Description of the FeatureOfInterest */
  @Deprecated public java.lang.CharSequence description;
  /** Representation/encoding type of the FeatureOfInterest */
  @Deprecated public java.lang.CharSequence encodingType;
  /** LocationType object containing the feature of the Thing */
  @Deprecated public main.java.pw.oliver.jmkb.avroclasses.LocationType feature;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FeatureOfInterest() {}

  /**
   * All-args constructor.
   * @param name Name of the FeatureOfInterest
   * @param description Description of the FeatureOfInterest
   * @param encodingType Representation/encoding type of the FeatureOfInterest
   * @param feature LocationType object containing the feature of the Thing
   */
  public FeatureOfInterest(java.lang.CharSequence name, java.lang.CharSequence description, java.lang.CharSequence encodingType, main.java.pw.oliver.jmkb.avroclasses.LocationType feature) {
    this.name = name;
    this.description = description;
    this.encodingType = encodingType;
    this.feature = feature;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return description;
    case 2: return encodingType;
    case 3: return feature;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: description = (java.lang.CharSequence)value$; break;
    case 2: encodingType = (java.lang.CharSequence)value$; break;
    case 3: feature = (main.java.pw.oliver.jmkb.avroclasses.LocationType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return Name of the FeatureOfInterest
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Name of the FeatureOfInterest
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return Description of the FeatureOfInterest
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Description of the FeatureOfInterest
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'encodingType' field.
   * @return Representation/encoding type of the FeatureOfInterest
   */
  public java.lang.CharSequence getEncodingType() {
    return encodingType;
  }

  /**
   * Sets the value of the 'encodingType' field.
   * Representation/encoding type of the FeatureOfInterest
   * @param value the value to set.
   */
  public void setEncodingType(java.lang.CharSequence value) {
    this.encodingType = value;
  }

  /**
   * Gets the value of the 'feature' field.
   * @return LocationType object containing the feature of the Thing
   */
  public main.java.pw.oliver.jmkb.avroclasses.LocationType getFeature() {
    return feature;
  }

  /**
   * Sets the value of the 'feature' field.
   * LocationType object containing the feature of the Thing
   * @param value the value to set.
   */
  public void setFeature(main.java.pw.oliver.jmkb.avroclasses.LocationType value) {
    this.feature = value;
  }

  /**
   * Creates a new FeatureOfInterest RecordBuilder.
   * @return A new FeatureOfInterest RecordBuilder
   */
  public static main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder newBuilder() {
    return new main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder();
  }

  /**
   * Creates a new FeatureOfInterest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FeatureOfInterest RecordBuilder
   */
  public static main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder newBuilder(main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder other) {
    return new main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder(other);
  }

  /**
   * Creates a new FeatureOfInterest RecordBuilder by copying an existing FeatureOfInterest instance.
   * @param other The existing instance to copy.
   * @return A new FeatureOfInterest RecordBuilder
   */
  public static main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder newBuilder(main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest other) {
    return new main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder(other);
  }

  /**
   * RecordBuilder for FeatureOfInterest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FeatureOfInterest>
    implements org.apache.avro.data.RecordBuilder<FeatureOfInterest> {

    /** Name of the FeatureOfInterest */
    private java.lang.CharSequence name;
    /** Description of the FeatureOfInterest */
    private java.lang.CharSequence description;
    /** Representation/encoding type of the FeatureOfInterest */
    private java.lang.CharSequence encodingType;
    /** LocationType object containing the feature of the Thing */
    private main.java.pw.oliver.jmkb.avroclasses.LocationType feature;
    private main.java.pw.oliver.jmkb.avroclasses.LocationType.Builder featureBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.encodingType)) {
        this.encodingType = data().deepCopy(fields()[2].schema(), other.encodingType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.feature)) {
        this.feature = data().deepCopy(fields()[3].schema(), other.feature);
        fieldSetFlags()[3] = true;
      }
      if (other.hasFeatureBuilder()) {
        this.featureBuilder = main.java.pw.oliver.jmkb.avroclasses.LocationType.newBuilder(other.getFeatureBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing FeatureOfInterest instance
     * @param other The existing instance to copy.
     */
    private Builder(main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.encodingType)) {
        this.encodingType = data().deepCopy(fields()[2].schema(), other.encodingType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.feature)) {
        this.feature = data().deepCopy(fields()[3].schema(), other.feature);
        fieldSetFlags()[3] = true;
      }
      this.featureBuilder = null;
    }

    /**
      * Gets the value of the 'name' field.
      * Name of the FeatureOfInterest
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Name of the FeatureOfInterest
      * @param value The value of 'name'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Name of the FeatureOfInterest
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * Name of the FeatureOfInterest
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * Description of the FeatureOfInterest
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * Description of the FeatureOfInterest
      * @param value The value of 'description'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * Description of the FeatureOfInterest
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'description' field.
      * Description of the FeatureOfInterest
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'encodingType' field.
      * Representation/encoding type of the FeatureOfInterest
      * @return The value.
      */
    public java.lang.CharSequence getEncodingType() {
      return encodingType;
    }

    /**
      * Sets the value of the 'encodingType' field.
      * Representation/encoding type of the FeatureOfInterest
      * @param value The value of 'encodingType'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder setEncodingType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.encodingType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'encodingType' field has been set.
      * Representation/encoding type of the FeatureOfInterest
      * @return True if the 'encodingType' field has been set, false otherwise.
      */
    public boolean hasEncodingType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'encodingType' field.
      * Representation/encoding type of the FeatureOfInterest
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder clearEncodingType() {
      encodingType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'feature' field.
      * LocationType object containing the feature of the Thing
      * @return The value.
      */
    public main.java.pw.oliver.jmkb.avroclasses.LocationType getFeature() {
      return feature;
    }

    /**
      * Sets the value of the 'feature' field.
      * LocationType object containing the feature of the Thing
      * @param value The value of 'feature'.
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder setFeature(main.java.pw.oliver.jmkb.avroclasses.LocationType value) {
      validate(fields()[3], value);
      this.featureBuilder = null;
      this.feature = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'feature' field has been set.
      * LocationType object containing the feature of the Thing
      * @return True if the 'feature' field has been set, false otherwise.
      */
    public boolean hasFeature() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'feature' field and creates one if it doesn't exist yet.
     * LocationType object containing the feature of the Thing
     * @return This builder.
     */
    public main.java.pw.oliver.jmkb.avroclasses.LocationType.Builder getFeatureBuilder() {
      if (featureBuilder == null) {
        if (hasFeature()) {
          setFeatureBuilder(main.java.pw.oliver.jmkb.avroclasses.LocationType.newBuilder(feature));
        } else {
          setFeatureBuilder(main.java.pw.oliver.jmkb.avroclasses.LocationType.newBuilder());
        }
      }
      return featureBuilder;
    }

    /**
     * Sets the Builder instance for the 'feature' field
     * LocationType object containing the feature of the Thing
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder setFeatureBuilder(main.java.pw.oliver.jmkb.avroclasses.LocationType.Builder value) {
      clearFeature();
      featureBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'feature' field has an active Builder instance
     * LocationType object containing the feature of the Thing
     * @return True if the 'feature' field has an active Builder instance
     */
    public boolean hasFeatureBuilder() {
      return featureBuilder != null;
    }

    /**
      * Clears the value of the 'feature' field.
      * LocationType object containing the feature of the Thing
      * @return This builder.
      */
    public main.java.pw.oliver.jmkb.avroclasses.FeatureOfInterest.Builder clearFeature() {
      feature = null;
      featureBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FeatureOfInterest build() {
      try {
        FeatureOfInterest record = new FeatureOfInterest();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.encodingType = fieldSetFlags()[2] ? this.encodingType : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (featureBuilder != null) {
          record.feature = this.featureBuilder.build();
        } else {
          record.feature = fieldSetFlags()[3] ? this.feature : (main.java.pw.oliver.jmkb.avroclasses.LocationType) defaultValue(fields()[3]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FeatureOfInterest>
    WRITER$ = (org.apache.avro.io.DatumWriter<FeatureOfInterest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FeatureOfInterest>
    READER$ = (org.apache.avro.io.DatumReader<FeatureOfInterest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
