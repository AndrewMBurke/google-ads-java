// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/keyword_plan.proto

package com.google.ads.googleads.v2.resources;

/**
 * <pre>
 * The forecasting period associated with the keyword plan.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.resources.KeywordPlanForecastPeriod}
 */
public  final class KeywordPlanForecastPeriod extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.resources.KeywordPlanForecastPeriod)
    KeywordPlanForecastPeriodOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanForecastPeriod.newBuilder() to construct.
  private KeywordPlanForecastPeriod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanForecastPeriod() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanForecastPeriod(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();
            intervalCase_ = 1;
            interval_ = rawValue;
            break;
          }
          case 18: {
            com.google.ads.googleads.v2.common.DateRange.Builder subBuilder = null;
            if (intervalCase_ == 2) {
              subBuilder = ((com.google.ads.googleads.v2.common.DateRange) interval_).toBuilder();
            }
            interval_ =
                input.readMessage(com.google.ads.googleads.v2.common.DateRange.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.ads.googleads.v2.common.DateRange) interval_);
              interval_ = subBuilder.buildPartial();
            }
            intervalCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v2.resources.KeywordPlanProto.internal_static_google_ads_googleads_v2_resources_KeywordPlanForecastPeriod_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.resources.KeywordPlanProto.internal_static_google_ads_googleads_v2_resources_KeywordPlanForecastPeriod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod.class, com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod.Builder.class);
  }

  private int intervalCase_ = 0;
  private java.lang.Object interval_;
  public enum IntervalCase
      implements com.google.protobuf.Internal.EnumLite {
    DATE_INTERVAL(1),
    DATE_RANGE(2),
    INTERVAL_NOT_SET(0);
    private final int value;
    private IntervalCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IntervalCase valueOf(int value) {
      return forNumber(value);
    }

    public static IntervalCase forNumber(int value) {
      switch (value) {
        case 1: return DATE_INTERVAL;
        case 2: return DATE_RANGE;
        case 0: return INTERVAL_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public IntervalCase
  getIntervalCase() {
    return IntervalCase.forNumber(
        intervalCase_);
  }

  public static final int DATE_INTERVAL_FIELD_NUMBER = 1;
  /**
   * <pre>
   * A future date range relative to the current date used for forecasting.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
   */
  public int getDateIntervalValue() {
    if (intervalCase_ == 1) {
      return (java.lang.Integer) interval_;
    }
    return 0;
  }
  /**
   * <pre>
   * A future date range relative to the current date used for forecasting.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
   */
  public com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval getDateInterval() {
    if (intervalCase_ == 1) {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval result = com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval.valueOf(
          (java.lang.Integer) interval_);
      return result == null ? com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval.UNRECOGNIZED : result;
    }
    return com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval.UNSPECIFIED;
  }

  public static final int DATE_RANGE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The custom date range used for forecasting.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * The start and end dates are inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
   */
  public boolean hasDateRange() {
    return intervalCase_ == 2;
  }
  /**
   * <pre>
   * The custom date range used for forecasting.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * The start and end dates are inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
   */
  public com.google.ads.googleads.v2.common.DateRange getDateRange() {
    if (intervalCase_ == 2) {
       return (com.google.ads.googleads.v2.common.DateRange) interval_;
    }
    return com.google.ads.googleads.v2.common.DateRange.getDefaultInstance();
  }
  /**
   * <pre>
   * The custom date range used for forecasting.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * The start and end dates are inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
   */
  public com.google.ads.googleads.v2.common.DateRangeOrBuilder getDateRangeOrBuilder() {
    if (intervalCase_ == 2) {
       return (com.google.ads.googleads.v2.common.DateRange) interval_;
    }
    return com.google.ads.googleads.v2.common.DateRange.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (intervalCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) interval_));
    }
    if (intervalCase_ == 2) {
      output.writeMessage(2, (com.google.ads.googleads.v2.common.DateRange) interval_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (intervalCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) interval_));
    }
    if (intervalCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.ads.googleads.v2.common.DateRange) interval_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod other = (com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod) obj;

    if (!getIntervalCase().equals(other.getIntervalCase())) return false;
    switch (intervalCase_) {
      case 1:
        if (getDateIntervalValue()
            != other.getDateIntervalValue()) return false;
        break;
      case 2:
        if (!getDateRange()
            .equals(other.getDateRange())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (intervalCase_) {
      case 1:
        hash = (37 * hash) + DATE_INTERVAL_FIELD_NUMBER;
        hash = (53 * hash) + getDateIntervalValue();
        break;
      case 2:
        hash = (37 * hash) + DATE_RANGE_FIELD_NUMBER;
        hash = (53 * hash) + getDateRange().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The forecasting period associated with the keyword plan.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.resources.KeywordPlanForecastPeriod}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.resources.KeywordPlanForecastPeriod)
      com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.resources.KeywordPlanProto.internal_static_google_ads_googleads_v2_resources_KeywordPlanForecastPeriod_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.resources.KeywordPlanProto.internal_static_google_ads_googleads_v2_resources_KeywordPlanForecastPeriod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod.class, com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      intervalCase_ = 0;
      interval_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.resources.KeywordPlanProto.internal_static_google_ads_googleads_v2_resources_KeywordPlanForecastPeriod_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod build() {
      com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod buildPartial() {
      com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod result = new com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod(this);
      if (intervalCase_ == 1) {
        result.interval_ = interval_;
      }
      if (intervalCase_ == 2) {
        if (dateRangeBuilder_ == null) {
          result.interval_ = interval_;
        } else {
          result.interval_ = dateRangeBuilder_.build();
        }
      }
      result.intervalCase_ = intervalCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod) {
        return mergeFrom((com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod other) {
      if (other == com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod.getDefaultInstance()) return this;
      switch (other.getIntervalCase()) {
        case DATE_INTERVAL: {
          setDateIntervalValue(other.getDateIntervalValue());
          break;
        }
        case DATE_RANGE: {
          mergeDateRange(other.getDateRange());
          break;
        }
        case INTERVAL_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int intervalCase_ = 0;
    private java.lang.Object interval_;
    public IntervalCase
        getIntervalCase() {
      return IntervalCase.forNumber(
          intervalCase_);
    }

    public Builder clearInterval() {
      intervalCase_ = 0;
      interval_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * A future date range relative to the current date used for forecasting.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
     */
    public int getDateIntervalValue() {
      if (intervalCase_ == 1) {
        return ((java.lang.Integer) interval_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * A future date range relative to the current date used for forecasting.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
     */
    public Builder setDateIntervalValue(int value) {
      intervalCase_ = 1;
      interval_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A future date range relative to the current date used for forecasting.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
     */
    public com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval getDateInterval() {
      if (intervalCase_ == 1) {
        @SuppressWarnings("deprecation")
        com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval result = com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval.valueOf(
            (java.lang.Integer) interval_);
        return result == null ? com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval.UNRECOGNIZED : result;
      }
      return com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval.UNSPECIFIED;
    }
    /**
     * <pre>
     * A future date range relative to the current date used for forecasting.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
     */
    public Builder setDateInterval(com.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval value) {
      if (value == null) {
        throw new NullPointerException();
      }
      intervalCase_ = 1;
      interval_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A future date range relative to the current date used for forecasting.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
     */
    public Builder clearDateInterval() {
      if (intervalCase_ == 1) {
        intervalCase_ = 0;
        interval_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v2.common.DateRange, com.google.ads.googleads.v2.common.DateRange.Builder, com.google.ads.googleads.v2.common.DateRangeOrBuilder> dateRangeBuilder_;
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public boolean hasDateRange() {
      return intervalCase_ == 2;
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public com.google.ads.googleads.v2.common.DateRange getDateRange() {
      if (dateRangeBuilder_ == null) {
        if (intervalCase_ == 2) {
          return (com.google.ads.googleads.v2.common.DateRange) interval_;
        }
        return com.google.ads.googleads.v2.common.DateRange.getDefaultInstance();
      } else {
        if (intervalCase_ == 2) {
          return dateRangeBuilder_.getMessage();
        }
        return com.google.ads.googleads.v2.common.DateRange.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public Builder setDateRange(com.google.ads.googleads.v2.common.DateRange value) {
      if (dateRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        interval_ = value;
        onChanged();
      } else {
        dateRangeBuilder_.setMessage(value);
      }
      intervalCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public Builder setDateRange(
        com.google.ads.googleads.v2.common.DateRange.Builder builderForValue) {
      if (dateRangeBuilder_ == null) {
        interval_ = builderForValue.build();
        onChanged();
      } else {
        dateRangeBuilder_.setMessage(builderForValue.build());
      }
      intervalCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public Builder mergeDateRange(com.google.ads.googleads.v2.common.DateRange value) {
      if (dateRangeBuilder_ == null) {
        if (intervalCase_ == 2 &&
            interval_ != com.google.ads.googleads.v2.common.DateRange.getDefaultInstance()) {
          interval_ = com.google.ads.googleads.v2.common.DateRange.newBuilder((com.google.ads.googleads.v2.common.DateRange) interval_)
              .mergeFrom(value).buildPartial();
        } else {
          interval_ = value;
        }
        onChanged();
      } else {
        if (intervalCase_ == 2) {
          dateRangeBuilder_.mergeFrom(value);
        }
        dateRangeBuilder_.setMessage(value);
      }
      intervalCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public Builder clearDateRange() {
      if (dateRangeBuilder_ == null) {
        if (intervalCase_ == 2) {
          intervalCase_ = 0;
          interval_ = null;
          onChanged();
        }
      } else {
        if (intervalCase_ == 2) {
          intervalCase_ = 0;
          interval_ = null;
        }
        dateRangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public com.google.ads.googleads.v2.common.DateRange.Builder getDateRangeBuilder() {
      return getDateRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    public com.google.ads.googleads.v2.common.DateRangeOrBuilder getDateRangeOrBuilder() {
      if ((intervalCase_ == 2) && (dateRangeBuilder_ != null)) {
        return dateRangeBuilder_.getMessageOrBuilder();
      } else {
        if (intervalCase_ == 2) {
          return (com.google.ads.googleads.v2.common.DateRange) interval_;
        }
        return com.google.ads.googleads.v2.common.DateRange.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The custom date range used for forecasting.
     * The start and end dates must be in the future. Otherwise, an error will
     * be returned when the forecasting action is performed.
     * The start and end dates are inclusive.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.DateRange date_range = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v2.common.DateRange, com.google.ads.googleads.v2.common.DateRange.Builder, com.google.ads.googleads.v2.common.DateRangeOrBuilder> 
        getDateRangeFieldBuilder() {
      if (dateRangeBuilder_ == null) {
        if (!(intervalCase_ == 2)) {
          interval_ = com.google.ads.googleads.v2.common.DateRange.getDefaultInstance();
        }
        dateRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v2.common.DateRange, com.google.ads.googleads.v2.common.DateRange.Builder, com.google.ads.googleads.v2.common.DateRangeOrBuilder>(
                (com.google.ads.googleads.v2.common.DateRange) interval_,
                getParentForChildren(),
                isClean());
        interval_ = null;
      }
      intervalCase_ = 2;
      onChanged();;
      return dateRangeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.resources.KeywordPlanForecastPeriod)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.KeywordPlanForecastPeriod)
  private static final com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod();
  }

  public static com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanForecastPeriod>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanForecastPeriod>() {
    @java.lang.Override
    public KeywordPlanForecastPeriod parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanForecastPeriod(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanForecastPeriod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanForecastPeriod> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.resources.KeywordPlanForecastPeriod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

