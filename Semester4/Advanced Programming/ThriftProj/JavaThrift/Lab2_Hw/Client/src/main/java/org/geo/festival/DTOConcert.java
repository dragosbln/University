/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.geo.festival;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-05-07")
public class DTOConcert implements org.apache.thrift.TBase<DTOConcert, DTOConcert._Fields>, java.io.Serializable, Cloneable, Comparable<DTOConcert> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DTOConcert");

  private static final org.apache.thrift.protocol.TField CONCERT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("concertId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ARTIST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("artistName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOCATION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("locationName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NUM_OF_SEATS_FIELD_DESC = new org.apache.thrift.protocol.TField("numOfSeats", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField SOLD_SEATS_FIELD_DESC = new org.apache.thrift.protocol.TField("soldSeats", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField FREE_SEATS_FIELD_DESC = new org.apache.thrift.protocol.TField("freeSeats", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DTOConcertStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DTOConcertTupleSchemeFactory();

  public int concertId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String artistName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String date; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String locationName; // required
  public int numOfSeats; // required
  public int soldSeats; // required
  public int freeSeats; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONCERT_ID((short)1, "concertId"),
    ARTIST_NAME((short)2, "artistName"),
    DATE((short)3, "date"),
    LOCATION_NAME((short)4, "locationName"),
    NUM_OF_SEATS((short)5, "numOfSeats"),
    SOLD_SEATS((short)6, "soldSeats"),
    FREE_SEATS((short)7, "freeSeats");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONCERT_ID
          return CONCERT_ID;
        case 2: // ARTIST_NAME
          return ARTIST_NAME;
        case 3: // DATE
          return DATE;
        case 4: // LOCATION_NAME
          return LOCATION_NAME;
        case 5: // NUM_OF_SEATS
          return NUM_OF_SEATS;
        case 6: // SOLD_SEATS
          return SOLD_SEATS;
        case 7: // FREE_SEATS
          return FREE_SEATS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CONCERTID_ISSET_ID = 0;
  private static final int __NUMOFSEATS_ISSET_ID = 1;
  private static final int __SOLDSEATS_ISSET_ID = 2;
  private static final int __FREESEATS_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONCERT_ID, new org.apache.thrift.meta_data.FieldMetaData("concertId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ARTIST_NAME, new org.apache.thrift.meta_data.FieldMetaData("artistName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCATION_NAME, new org.apache.thrift.meta_data.FieldMetaData("locationName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUM_OF_SEATS, new org.apache.thrift.meta_data.FieldMetaData("numOfSeats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SOLD_SEATS, new org.apache.thrift.meta_data.FieldMetaData("soldSeats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_SEATS, new org.apache.thrift.meta_data.FieldMetaData("freeSeats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DTOConcert.class, metaDataMap);
  }

  public DTOConcert() {
  }

  public DTOConcert(
    int concertId,
    java.lang.String artistName,
    java.lang.String date,
    java.lang.String locationName,
    int numOfSeats,
    int soldSeats,
    int freeSeats)
  {
    this();
    this.concertId = concertId;
    setConcertIdIsSet(true);
    this.artistName = artistName;
    this.date = date;
    this.locationName = locationName;
    this.numOfSeats = numOfSeats;
    setNumOfSeatsIsSet(true);
    this.soldSeats = soldSeats;
    setSoldSeatsIsSet(true);
    this.freeSeats = freeSeats;
    setFreeSeatsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DTOConcert(DTOConcert other) {
    __isset_bitfield = other.__isset_bitfield;
    this.concertId = other.concertId;
    if (other.isSetArtistName()) {
      this.artistName = other.artistName;
    }
    if (other.isSetDate()) {
      this.date = other.date;
    }
    if (other.isSetLocationName()) {
      this.locationName = other.locationName;
    }
    this.numOfSeats = other.numOfSeats;
    this.soldSeats = other.soldSeats;
    this.freeSeats = other.freeSeats;
  }

  public DTOConcert deepCopy() {
    return new DTOConcert(this);
  }

  @Override
  public void clear() {
    setConcertIdIsSet(false);
    this.concertId = 0;
    this.artistName = null;
    this.date = null;
    this.locationName = null;
    setNumOfSeatsIsSet(false);
    this.numOfSeats = 0;
    setSoldSeatsIsSet(false);
    this.soldSeats = 0;
    setFreeSeatsIsSet(false);
    this.freeSeats = 0;
  }

  public int getConcertId() {
    return this.concertId;
  }

  public DTOConcert setConcertId(int concertId) {
    this.concertId = concertId;
    setConcertIdIsSet(true);
    return this;
  }

  public void unsetConcertId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CONCERTID_ISSET_ID);
  }

  /** Returns true if field concertId is set (has been assigned a value) and false otherwise */
  public boolean isSetConcertId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CONCERTID_ISSET_ID);
  }

  public void setConcertIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CONCERTID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getArtistName() {
    return this.artistName;
  }

  public DTOConcert setArtistName(@org.apache.thrift.annotation.Nullable java.lang.String artistName) {
    this.artistName = artistName;
    return this;
  }

  public void unsetArtistName() {
    this.artistName = null;
  }

  /** Returns true if field artistName is set (has been assigned a value) and false otherwise */
  public boolean isSetArtistName() {
    return this.artistName != null;
  }

  public void setArtistNameIsSet(boolean value) {
    if (!value) {
      this.artistName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDate() {
    return this.date;
  }

  public DTOConcert setDate(@org.apache.thrift.annotation.Nullable java.lang.String date) {
    this.date = date;
    return this;
  }

  public void unsetDate() {
    this.date = null;
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return this.date != null;
  }

  public void setDateIsSet(boolean value) {
    if (!value) {
      this.date = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLocationName() {
    return this.locationName;
  }

  public DTOConcert setLocationName(@org.apache.thrift.annotation.Nullable java.lang.String locationName) {
    this.locationName = locationName;
    return this;
  }

  public void unsetLocationName() {
    this.locationName = null;
  }

  /** Returns true if field locationName is set (has been assigned a value) and false otherwise */
  public boolean isSetLocationName() {
    return this.locationName != null;
  }

  public void setLocationNameIsSet(boolean value) {
    if (!value) {
      this.locationName = null;
    }
  }

  public int getNumOfSeats() {
    return this.numOfSeats;
  }

  public DTOConcert setNumOfSeats(int numOfSeats) {
    this.numOfSeats = numOfSeats;
    setNumOfSeatsIsSet(true);
    return this;
  }

  public void unsetNumOfSeats() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUMOFSEATS_ISSET_ID);
  }

  /** Returns true if field numOfSeats is set (has been assigned a value) and false otherwise */
  public boolean isSetNumOfSeats() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUMOFSEATS_ISSET_ID);
  }

  public void setNumOfSeatsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUMOFSEATS_ISSET_ID, value);
  }

  public int getSoldSeats() {
    return this.soldSeats;
  }

  public DTOConcert setSoldSeats(int soldSeats) {
    this.soldSeats = soldSeats;
    setSoldSeatsIsSet(true);
    return this;
  }

  public void unsetSoldSeats() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SOLDSEATS_ISSET_ID);
  }

  /** Returns true if field soldSeats is set (has been assigned a value) and false otherwise */
  public boolean isSetSoldSeats() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SOLDSEATS_ISSET_ID);
  }

  public void setSoldSeatsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SOLDSEATS_ISSET_ID, value);
  }

  public int getFreeSeats() {
    return this.freeSeats;
  }

  public DTOConcert setFreeSeats(int freeSeats) {
    this.freeSeats = freeSeats;
    setFreeSeatsIsSet(true);
    return this;
  }

  public void unsetFreeSeats() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FREESEATS_ISSET_ID);
  }

  /** Returns true if field freeSeats is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeSeats() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FREESEATS_ISSET_ID);
  }

  public void setFreeSeatsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FREESEATS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONCERT_ID:
      if (value == null) {
        unsetConcertId();
      } else {
        setConcertId((java.lang.Integer)value);
      }
      break;

    case ARTIST_NAME:
      if (value == null) {
        unsetArtistName();
      } else {
        setArtistName((java.lang.String)value);
      }
      break;

    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((java.lang.String)value);
      }
      break;

    case LOCATION_NAME:
      if (value == null) {
        unsetLocationName();
      } else {
        setLocationName((java.lang.String)value);
      }
      break;

    case NUM_OF_SEATS:
      if (value == null) {
        unsetNumOfSeats();
      } else {
        setNumOfSeats((java.lang.Integer)value);
      }
      break;

    case SOLD_SEATS:
      if (value == null) {
        unsetSoldSeats();
      } else {
        setSoldSeats((java.lang.Integer)value);
      }
      break;

    case FREE_SEATS:
      if (value == null) {
        unsetFreeSeats();
      } else {
        setFreeSeats((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONCERT_ID:
      return getConcertId();

    case ARTIST_NAME:
      return getArtistName();

    case DATE:
      return getDate();

    case LOCATION_NAME:
      return getLocationName();

    case NUM_OF_SEATS:
      return getNumOfSeats();

    case SOLD_SEATS:
      return getSoldSeats();

    case FREE_SEATS:
      return getFreeSeats();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONCERT_ID:
      return isSetConcertId();
    case ARTIST_NAME:
      return isSetArtistName();
    case DATE:
      return isSetDate();
    case LOCATION_NAME:
      return isSetLocationName();
    case NUM_OF_SEATS:
      return isSetNumOfSeats();
    case SOLD_SEATS:
      return isSetSoldSeats();
    case FREE_SEATS:
      return isSetFreeSeats();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DTOConcert)
      return this.equals((DTOConcert)that);
    return false;
  }

  public boolean equals(DTOConcert that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_concertId = true;
    boolean that_present_concertId = true;
    if (this_present_concertId || that_present_concertId) {
      if (!(this_present_concertId && that_present_concertId))
        return false;
      if (this.concertId != that.concertId)
        return false;
    }

    boolean this_present_artistName = true && this.isSetArtistName();
    boolean that_present_artistName = true && that.isSetArtistName();
    if (this_present_artistName || that_present_artistName) {
      if (!(this_present_artistName && that_present_artistName))
        return false;
      if (!this.artistName.equals(that.artistName))
        return false;
    }

    boolean this_present_date = true && this.isSetDate();
    boolean that_present_date = true && that.isSetDate();
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (!this.date.equals(that.date))
        return false;
    }

    boolean this_present_locationName = true && this.isSetLocationName();
    boolean that_present_locationName = true && that.isSetLocationName();
    if (this_present_locationName || that_present_locationName) {
      if (!(this_present_locationName && that_present_locationName))
        return false;
      if (!this.locationName.equals(that.locationName))
        return false;
    }

    boolean this_present_numOfSeats = true;
    boolean that_present_numOfSeats = true;
    if (this_present_numOfSeats || that_present_numOfSeats) {
      if (!(this_present_numOfSeats && that_present_numOfSeats))
        return false;
      if (this.numOfSeats != that.numOfSeats)
        return false;
    }

    boolean this_present_soldSeats = true;
    boolean that_present_soldSeats = true;
    if (this_present_soldSeats || that_present_soldSeats) {
      if (!(this_present_soldSeats && that_present_soldSeats))
        return false;
      if (this.soldSeats != that.soldSeats)
        return false;
    }

    boolean this_present_freeSeats = true;
    boolean that_present_freeSeats = true;
    if (this_present_freeSeats || that_present_freeSeats) {
      if (!(this_present_freeSeats && that_present_freeSeats))
        return false;
      if (this.freeSeats != that.freeSeats)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + concertId;

    hashCode = hashCode * 8191 + ((isSetArtistName()) ? 131071 : 524287);
    if (isSetArtistName())
      hashCode = hashCode * 8191 + artistName.hashCode();

    hashCode = hashCode * 8191 + ((isSetDate()) ? 131071 : 524287);
    if (isSetDate())
      hashCode = hashCode * 8191 + date.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocationName()) ? 131071 : 524287);
    if (isSetLocationName())
      hashCode = hashCode * 8191 + locationName.hashCode();

    hashCode = hashCode * 8191 + numOfSeats;

    hashCode = hashCode * 8191 + soldSeats;

    hashCode = hashCode * 8191 + freeSeats;

    return hashCode;
  }

  @Override
  public int compareTo(DTOConcert other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetConcertId()).compareTo(other.isSetConcertId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConcertId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.concertId, other.concertId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetArtistName()).compareTo(other.isSetArtistName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArtistName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.artistName, other.artistName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, other.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLocationName()).compareTo(other.isSetLocationName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocationName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locationName, other.locationName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNumOfSeats()).compareTo(other.isSetNumOfSeats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumOfSeats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numOfSeats, other.numOfSeats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSoldSeats()).compareTo(other.isSetSoldSeats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSoldSeats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.soldSeats, other.soldSeats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFreeSeats()).compareTo(other.isSetFreeSeats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeSeats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeSeats, other.freeSeats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DTOConcert(");
    boolean first = true;

    sb.append("concertId:");
    sb.append(this.concertId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("artistName:");
    if (this.artistName == null) {
      sb.append("null");
    } else {
      sb.append(this.artistName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("date:");
    if (this.date == null) {
      sb.append("null");
    } else {
      sb.append(this.date);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locationName:");
    if (this.locationName == null) {
      sb.append("null");
    } else {
      sb.append(this.locationName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("numOfSeats:");
    sb.append(this.numOfSeats);
    first = false;
    if (!first) sb.append(", ");
    sb.append("soldSeats:");
    sb.append(this.soldSeats);
    first = false;
    if (!first) sb.append(", ");
    sb.append("freeSeats:");
    sb.append(this.freeSeats);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DTOConcertStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DTOConcertStandardScheme getScheme() {
      return new DTOConcertStandardScheme();
    }
  }

  private static class DTOConcertStandardScheme extends org.apache.thrift.scheme.StandardScheme<DTOConcert> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DTOConcert struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONCERT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.concertId = iprot.readI32();
              struct.setConcertIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ARTIST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.artistName = iprot.readString();
              struct.setArtistNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.date = iprot.readString();
              struct.setDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCATION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locationName = iprot.readString();
              struct.setLocationNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NUM_OF_SEATS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numOfSeats = iprot.readI32();
              struct.setNumOfSeatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SOLD_SEATS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.soldSeats = iprot.readI32();
              struct.setSoldSeatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FREE_SEATS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeSeats = iprot.readI32();
              struct.setFreeSeatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DTOConcert struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CONCERT_ID_FIELD_DESC);
      oprot.writeI32(struct.concertId);
      oprot.writeFieldEnd();
      if (struct.artistName != null) {
        oprot.writeFieldBegin(ARTIST_NAME_FIELD_DESC);
        oprot.writeString(struct.artistName);
        oprot.writeFieldEnd();
      }
      if (struct.date != null) {
        oprot.writeFieldBegin(DATE_FIELD_DESC);
        oprot.writeString(struct.date);
        oprot.writeFieldEnd();
      }
      if (struct.locationName != null) {
        oprot.writeFieldBegin(LOCATION_NAME_FIELD_DESC);
        oprot.writeString(struct.locationName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NUM_OF_SEATS_FIELD_DESC);
      oprot.writeI32(struct.numOfSeats);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SOLD_SEATS_FIELD_DESC);
      oprot.writeI32(struct.soldSeats);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FREE_SEATS_FIELD_DESC);
      oprot.writeI32(struct.freeSeats);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DTOConcertTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DTOConcertTupleScheme getScheme() {
      return new DTOConcertTupleScheme();
    }
  }

  private static class DTOConcertTupleScheme extends org.apache.thrift.scheme.TupleScheme<DTOConcert> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DTOConcert struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetConcertId()) {
        optionals.set(0);
      }
      if (struct.isSetArtistName()) {
        optionals.set(1);
      }
      if (struct.isSetDate()) {
        optionals.set(2);
      }
      if (struct.isSetLocationName()) {
        optionals.set(3);
      }
      if (struct.isSetNumOfSeats()) {
        optionals.set(4);
      }
      if (struct.isSetSoldSeats()) {
        optionals.set(5);
      }
      if (struct.isSetFreeSeats()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetConcertId()) {
        oprot.writeI32(struct.concertId);
      }
      if (struct.isSetArtistName()) {
        oprot.writeString(struct.artistName);
      }
      if (struct.isSetDate()) {
        oprot.writeString(struct.date);
      }
      if (struct.isSetLocationName()) {
        oprot.writeString(struct.locationName);
      }
      if (struct.isSetNumOfSeats()) {
        oprot.writeI32(struct.numOfSeats);
      }
      if (struct.isSetSoldSeats()) {
        oprot.writeI32(struct.soldSeats);
      }
      if (struct.isSetFreeSeats()) {
        oprot.writeI32(struct.freeSeats);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DTOConcert struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.concertId = iprot.readI32();
        struct.setConcertIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.artistName = iprot.readString();
        struct.setArtistNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.date = iprot.readString();
        struct.setDateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.locationName = iprot.readString();
        struct.setLocationNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.numOfSeats = iprot.readI32();
        struct.setNumOfSeatsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.soldSeats = iprot.readI32();
        struct.setSoldSeatsIsSet(true);
      }
      if (incoming.get(6)) {
        struct.freeSeats = iprot.readI32();
        struct.setFreeSeatsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
