// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/campaign_budget_error.proto

package com.google.ads.googleads.v2.errors;

/**
 * <pre>
 * Container for enum describing possible campaign budget errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.errors.CampaignBudgetErrorEnum}
 */
public  final class CampaignBudgetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.errors.CampaignBudgetErrorEnum)
    CampaignBudgetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignBudgetErrorEnum.newBuilder() to construct.
  private CampaignBudgetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignBudgetErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CampaignBudgetErrorEnum(
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
    return com.google.ads.googleads.v2.errors.CampaignBudgetErrorProto.internal_static_google_ads_googleads_v2_errors_CampaignBudgetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.errors.CampaignBudgetErrorProto.internal_static_google_ads_googleads_v2_errors_CampaignBudgetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.class, com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible campaign budget errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.CampaignBudgetError}
   */
  public enum CampaignBudgetError
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
     * The campaign budget cannot be shared.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_CANNOT_BE_SHARED = 17;</code>
     */
    CAMPAIGN_BUDGET_CANNOT_BE_SHARED(17),
    /**
     * <pre>
     * The requested campaign budget no longer exists.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_REMOVED = 2;</code>
     */
    CAMPAIGN_BUDGET_REMOVED(2),
    /**
     * <pre>
     * The campaign budget is associated with at least one campaign, and so the
     * campaign budget cannot be removed.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_IN_USE = 3;</code>
     */
    CAMPAIGN_BUDGET_IN_USE(3),
    /**
     * <pre>
     * Customer is not whitelisted for this campaign budget period.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_PERIOD_NOT_AVAILABLE = 4;</code>
     */
    CAMPAIGN_BUDGET_PERIOD_NOT_AVAILABLE(4),
    /**
     * <pre>
     * This field is not mutable on implicitly shared campaign budgets
     * </pre>
     *
     * <code>CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CAMPAIGN_BUDGET = 6;</code>
     */
    CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CAMPAIGN_BUDGET(6),
    /**
     * <pre>
     * Cannot change explicitly shared campaign budgets back to implicitly
     * shared ones.
     * </pre>
     *
     * <code>CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_IMPLICITLY_SHARED = 7;</code>
     */
    CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_IMPLICITLY_SHARED(7),
    /**
     * <pre>
     * An implicit campaign budget without a name cannot be changed to
     * explicitly shared campaign budget.
     * </pre>
     *
     * <code>CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME = 8;</code>
     */
    CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME(8),
    /**
     * <pre>
     * Cannot change an implicitly shared campaign budget to an explicitly
     * shared one.
     * </pre>
     *
     * <code>CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED = 9;</code>
     */
    CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED(9),
    /**
     * <pre>
     * Only explicitly shared campaign budgets can be used with multiple
     * campaigns.
     * </pre>
     *
     * <code>CANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_WITH_MULTIPLE_CAMPAIGNS = 10;</code>
     */
    CANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_WITH_MULTIPLE_CAMPAIGNS(10),
    /**
     * <pre>
     * A campaign budget with this name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 11;</code>
     */
    DUPLICATE_NAME(11),
    /**
     * <pre>
     * A money amount was not in the expected currency.
     * </pre>
     *
     * <code>MONEY_AMOUNT_IN_WRONG_CURRENCY = 12;</code>
     */
    MONEY_AMOUNT_IN_WRONG_CURRENCY(12),
    /**
     * <pre>
     * A money amount was less than the minimum CPC for currency.
     * </pre>
     *
     * <code>MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC = 13;</code>
     */
    MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC(13),
    /**
     * <pre>
     * A money amount was greater than the maximum allowed.
     * </pre>
     *
     * <code>MONEY_AMOUNT_TOO_LARGE = 14;</code>
     */
    MONEY_AMOUNT_TOO_LARGE(14),
    /**
     * <pre>
     * A money amount was negative.
     * </pre>
     *
     * <code>NEGATIVE_MONEY_AMOUNT = 15;</code>
     */
    NEGATIVE_MONEY_AMOUNT(15),
    /**
     * <pre>
     * A money amount was not a multiple of a minimum unit.
     * </pre>
     *
     * <code>NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT = 16;</code>
     */
    NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT(16),
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
     * The campaign budget cannot be shared.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_CANNOT_BE_SHARED = 17;</code>
     */
    public static final int CAMPAIGN_BUDGET_CANNOT_BE_SHARED_VALUE = 17;
    /**
     * <pre>
     * The requested campaign budget no longer exists.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_REMOVED = 2;</code>
     */
    public static final int CAMPAIGN_BUDGET_REMOVED_VALUE = 2;
    /**
     * <pre>
     * The campaign budget is associated with at least one campaign, and so the
     * campaign budget cannot be removed.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_IN_USE = 3;</code>
     */
    public static final int CAMPAIGN_BUDGET_IN_USE_VALUE = 3;
    /**
     * <pre>
     * Customer is not whitelisted for this campaign budget period.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET_PERIOD_NOT_AVAILABLE = 4;</code>
     */
    public static final int CAMPAIGN_BUDGET_PERIOD_NOT_AVAILABLE_VALUE = 4;
    /**
     * <pre>
     * This field is not mutable on implicitly shared campaign budgets
     * </pre>
     *
     * <code>CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CAMPAIGN_BUDGET = 6;</code>
     */
    public static final int CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_VALUE = 6;
    /**
     * <pre>
     * Cannot change explicitly shared campaign budgets back to implicitly
     * shared ones.
     * </pre>
     *
     * <code>CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_IMPLICITLY_SHARED = 7;</code>
     */
    public static final int CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_IMPLICITLY_SHARED_VALUE = 7;
    /**
     * <pre>
     * An implicit campaign budget without a name cannot be changed to
     * explicitly shared campaign budget.
     * </pre>
     *
     * <code>CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME = 8;</code>
     */
    public static final int CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME_VALUE = 8;
    /**
     * <pre>
     * Cannot change an implicitly shared campaign budget to an explicitly
     * shared one.
     * </pre>
     *
     * <code>CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED = 9;</code>
     */
    public static final int CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_VALUE = 9;
    /**
     * <pre>
     * Only explicitly shared campaign budgets can be used with multiple
     * campaigns.
     * </pre>
     *
     * <code>CANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_WITH_MULTIPLE_CAMPAIGNS = 10;</code>
     */
    public static final int CANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_WITH_MULTIPLE_CAMPAIGNS_VALUE = 10;
    /**
     * <pre>
     * A campaign budget with this name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 11;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 11;
    /**
     * <pre>
     * A money amount was not in the expected currency.
     * </pre>
     *
     * <code>MONEY_AMOUNT_IN_WRONG_CURRENCY = 12;</code>
     */
    public static final int MONEY_AMOUNT_IN_WRONG_CURRENCY_VALUE = 12;
    /**
     * <pre>
     * A money amount was less than the minimum CPC for currency.
     * </pre>
     *
     * <code>MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC = 13;</code>
     */
    public static final int MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC_VALUE = 13;
    /**
     * <pre>
     * A money amount was greater than the maximum allowed.
     * </pre>
     *
     * <code>MONEY_AMOUNT_TOO_LARGE = 14;</code>
     */
    public static final int MONEY_AMOUNT_TOO_LARGE_VALUE = 14;
    /**
     * <pre>
     * A money amount was negative.
     * </pre>
     *
     * <code>NEGATIVE_MONEY_AMOUNT = 15;</code>
     */
    public static final int NEGATIVE_MONEY_AMOUNT_VALUE = 15;
    /**
     * <pre>
     * A money amount was not a multiple of a minimum unit.
     * </pre>
     *
     * <code>NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT = 16;</code>
     */
    public static final int NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT_VALUE = 16;


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
    public static CampaignBudgetError valueOf(int value) {
      return forNumber(value);
    }

    public static CampaignBudgetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 17: return CAMPAIGN_BUDGET_CANNOT_BE_SHARED;
        case 2: return CAMPAIGN_BUDGET_REMOVED;
        case 3: return CAMPAIGN_BUDGET_IN_USE;
        case 4: return CAMPAIGN_BUDGET_PERIOD_NOT_AVAILABLE;
        case 6: return CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CAMPAIGN_BUDGET;
        case 7: return CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_IMPLICITLY_SHARED;
        case 8: return CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME;
        case 9: return CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED;
        case 10: return CANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_WITH_MULTIPLE_CAMPAIGNS;
        case 11: return DUPLICATE_NAME;
        case 12: return MONEY_AMOUNT_IN_WRONG_CURRENCY;
        case 13: return MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC;
        case 14: return MONEY_AMOUNT_TOO_LARGE;
        case 15: return NEGATIVE_MONEY_AMOUNT;
        case 16: return NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignBudgetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignBudgetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignBudgetError>() {
            public CampaignBudgetError findValueByNumber(int number) {
              return CampaignBudgetError.forNumber(number);
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
      return com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignBudgetError[] VALUES = values();

    public static CampaignBudgetError valueOf(
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

    private CampaignBudgetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.CampaignBudgetError)
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
    if (!(obj instanceof com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum other = (com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum) obj;

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

  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum prototype) {
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
   * Container for enum describing possible campaign budget errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.errors.CampaignBudgetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.errors.CampaignBudgetErrorEnum)
      com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.errors.CampaignBudgetErrorProto.internal_static_google_ads_googleads_v2_errors_CampaignBudgetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.errors.CampaignBudgetErrorProto.internal_static_google_ads_googleads_v2_errors_CampaignBudgetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.class, com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v2.errors.CampaignBudgetErrorProto.internal_static_google_ads_googleads_v2_errors_CampaignBudgetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum build() {
      com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum buildPartial() {
      com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum result = new com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum other) {
      if (other == com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.errors.CampaignBudgetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.errors.CampaignBudgetErrorEnum)
  private static final com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum();
  }

  public static com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignBudgetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignBudgetErrorEnum>() {
    @java.lang.Override
    public CampaignBudgetErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CampaignBudgetErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CampaignBudgetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignBudgetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.errors.CampaignBudgetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

