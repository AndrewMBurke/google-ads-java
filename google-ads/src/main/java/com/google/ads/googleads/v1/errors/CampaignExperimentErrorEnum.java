// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/campaign_experiment_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible campaign experiment errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.CampaignExperimentErrorEnum}
 */
public  final class CampaignExperimentErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.CampaignExperimentErrorEnum)
    CampaignExperimentErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignExperimentErrorEnum.newBuilder() to construct.
  private CampaignExperimentErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignExperimentErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CampaignExperimentErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    return com.google.ads.googleads.v1.errors.CampaignExperimentErrorProto.internal_static_google_ads_googleads_v1_errors_CampaignExperimentErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.CampaignExperimentErrorProto.internal_static_google_ads_googleads_v1_errors_CampaignExperimentErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.class, com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible campaign experiment errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.CampaignExperimentError}
   */
  public enum CampaignExperimentError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * An active campaign or experiment with this name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    DUPLICATE_NAME(2),
    /**
     * <pre>
     * Experiment cannot be updated from the current state to the
     * requested target state. For example, an experiment can only graduate
     * if its status is ENABLED.
     * </pre>
     *
     * <code>INVALID_TRANSITION = 3;</code>
     */
    INVALID_TRANSITION(3),
    /**
     * <pre>
     * Cannot create an experiment from a campaign using an explicitly shared
     * budget.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_WITH_SHARED_BUDGET = 4;</code>
     */
    CANNOT_CREATE_EXPERIMENT_WITH_SHARED_BUDGET(4),
    /**
     * <pre>
     * Cannot create an experiment for a removed base campaign.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_FOR_REMOVED_BASE_CAMPAIGN = 5;</code>
     */
    CANNOT_CREATE_EXPERIMENT_FOR_REMOVED_BASE_CAMPAIGN(5),
    /**
     * <pre>
     * Cannot create an experiment from a draft, which has a status other than
     * proposed.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_FOR_NON_PROPOSED_DRAFT = 6;</code>
     */
    CANNOT_CREATE_EXPERIMENT_FOR_NON_PROPOSED_DRAFT(6),
    /**
     * <pre>
     * This customer is not allowed to create an experiment.
     * </pre>
     *
     * <code>CUSTOMER_CANNOT_CREATE_EXPERIMENT = 7;</code>
     */
    CUSTOMER_CANNOT_CREATE_EXPERIMENT(7),
    /**
     * <pre>
     * This campaign is not allowed to create an experiment.
     * </pre>
     *
     * <code>CAMPAIGN_CANNOT_CREATE_EXPERIMENT = 8;</code>
     */
    CAMPAIGN_CANNOT_CREATE_EXPERIMENT(8),
    /**
     * <pre>
     * Trying to set an experiment duration which overlaps with another
     * experiment.
     * </pre>
     *
     * <code>EXPERIMENT_DURATIONS_MUST_NOT_OVERLAP = 9;</code>
     */
    EXPERIMENT_DURATIONS_MUST_NOT_OVERLAP(9),
    /**
     * <pre>
     * All non-removed experiments must start and end within their campaign's
     * duration.
     * </pre>
     *
     * <code>EXPERIMENT_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION = 10;</code>
     */
    EXPERIMENT_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION(10),
    /**
     * <pre>
     * The experiment cannot be modified because its status is in a terminal
     * state, such as REMOVED.
     * </pre>
     *
     * <code>CANNOT_MUTATE_EXPERIMENT_DUE_TO_STATUS = 11;</code>
     */
    CANNOT_MUTATE_EXPERIMENT_DUE_TO_STATUS(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * An active campaign or experiment with this name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 2;
    /**
     * <pre>
     * Experiment cannot be updated from the current state to the
     * requested target state. For example, an experiment can only graduate
     * if its status is ENABLED.
     * </pre>
     *
     * <code>INVALID_TRANSITION = 3;</code>
     */
    public static final int INVALID_TRANSITION_VALUE = 3;
    /**
     * <pre>
     * Cannot create an experiment from a campaign using an explicitly shared
     * budget.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_WITH_SHARED_BUDGET = 4;</code>
     */
    public static final int CANNOT_CREATE_EXPERIMENT_WITH_SHARED_BUDGET_VALUE = 4;
    /**
     * <pre>
     * Cannot create an experiment for a removed base campaign.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_FOR_REMOVED_BASE_CAMPAIGN = 5;</code>
     */
    public static final int CANNOT_CREATE_EXPERIMENT_FOR_REMOVED_BASE_CAMPAIGN_VALUE = 5;
    /**
     * <pre>
     * Cannot create an experiment from a draft, which has a status other than
     * proposed.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_FOR_NON_PROPOSED_DRAFT = 6;</code>
     */
    public static final int CANNOT_CREATE_EXPERIMENT_FOR_NON_PROPOSED_DRAFT_VALUE = 6;
    /**
     * <pre>
     * This customer is not allowed to create an experiment.
     * </pre>
     *
     * <code>CUSTOMER_CANNOT_CREATE_EXPERIMENT = 7;</code>
     */
    public static final int CUSTOMER_CANNOT_CREATE_EXPERIMENT_VALUE = 7;
    /**
     * <pre>
     * This campaign is not allowed to create an experiment.
     * </pre>
     *
     * <code>CAMPAIGN_CANNOT_CREATE_EXPERIMENT = 8;</code>
     */
    public static final int CAMPAIGN_CANNOT_CREATE_EXPERIMENT_VALUE = 8;
    /**
     * <pre>
     * Trying to set an experiment duration which overlaps with another
     * experiment.
     * </pre>
     *
     * <code>EXPERIMENT_DURATIONS_MUST_NOT_OVERLAP = 9;</code>
     */
    public static final int EXPERIMENT_DURATIONS_MUST_NOT_OVERLAP_VALUE = 9;
    /**
     * <pre>
     * All non-removed experiments must start and end within their campaign's
     * duration.
     * </pre>
     *
     * <code>EXPERIMENT_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION = 10;</code>
     */
    public static final int EXPERIMENT_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION_VALUE = 10;
    /**
     * <pre>
     * The experiment cannot be modified because its status is in a terminal
     * state, such as REMOVED.
     * </pre>
     *
     * <code>CANNOT_MUTATE_EXPERIMENT_DUE_TO_STATUS = 11;</code>
     */
    public static final int CANNOT_MUTATE_EXPERIMENT_DUE_TO_STATUS_VALUE = 11;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CampaignExperimentError valueOf(int value) {
      return forNumber(value);
    }

    public static CampaignExperimentError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_NAME;
        case 3: return INVALID_TRANSITION;
        case 4: return CANNOT_CREATE_EXPERIMENT_WITH_SHARED_BUDGET;
        case 5: return CANNOT_CREATE_EXPERIMENT_FOR_REMOVED_BASE_CAMPAIGN;
        case 6: return CANNOT_CREATE_EXPERIMENT_FOR_NON_PROPOSED_DRAFT;
        case 7: return CUSTOMER_CANNOT_CREATE_EXPERIMENT;
        case 8: return CAMPAIGN_CANNOT_CREATE_EXPERIMENT;
        case 9: return EXPERIMENT_DURATIONS_MUST_NOT_OVERLAP;
        case 10: return EXPERIMENT_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION;
        case 11: return CANNOT_MUTATE_EXPERIMENT_DUE_TO_STATUS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignExperimentError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignExperimentError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignExperimentError>() {
            public CampaignExperimentError findValueByNumber(int number) {
              return CampaignExperimentError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignExperimentError[] VALUES = values();

    public static CampaignExperimentError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CampaignExperimentError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.CampaignExperimentError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum other = (com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum prototype) {
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
   * Container for enum describing possible campaign experiment errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.CampaignExperimentErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.CampaignExperimentErrorEnum)
      com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.CampaignExperimentErrorProto.internal_static_google_ads_googleads_v1_errors_CampaignExperimentErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.CampaignExperimentErrorProto.internal_static_google_ads_googleads_v1_errors_CampaignExperimentErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.class, com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.errors.CampaignExperimentErrorProto.internal_static_google_ads_googleads_v1_errors_CampaignExperimentErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum build() {
      com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum result = new com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.CampaignExperimentErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.CampaignExperimentErrorEnum)
  private static final com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignExperimentErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignExperimentErrorEnum>() {
    @java.lang.Override
    public CampaignExperimentErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CampaignExperimentErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CampaignExperimentErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignExperimentErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.CampaignExperimentErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

