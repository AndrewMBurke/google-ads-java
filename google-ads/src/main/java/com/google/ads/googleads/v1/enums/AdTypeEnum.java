// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/ad_type.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Container for enum describing possible types of an ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.AdTypeEnum}
 */
public  final class AdTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.AdTypeEnum)
    AdTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdTypeEnum.newBuilder() to construct.
  private AdTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdTypeEnum(
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
    return com.google.ads.googleads.v1.enums.AdTypeProto.internal_static_google_ads_googleads_v1_enums_AdTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.AdTypeProto.internal_static_google_ads_googleads_v1_enums_AdTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.AdTypeEnum.class, com.google.ads.googleads.v1.enums.AdTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible types of an ad.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.AdTypeEnum.AdType}
   */
  public enum AdType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The ad is a text ad.
     * </pre>
     *
     * <code>TEXT_AD = 2;</code>
     */
    TEXT_AD(2),
    /**
     * <pre>
     * The ad is an expanded text ad.
     * </pre>
     *
     * <code>EXPANDED_TEXT_AD = 3;</code>
     */
    EXPANDED_TEXT_AD(3),
    /**
     * <pre>
     * The ad is a call only ad.
     * </pre>
     *
     * <code>CALL_ONLY_AD = 6;</code>
     */
    CALL_ONLY_AD(6),
    /**
     * <pre>
     * The ad is an expanded dynamic search ad.
     * </pre>
     *
     * <code>EXPANDED_DYNAMIC_SEARCH_AD = 7;</code>
     */
    EXPANDED_DYNAMIC_SEARCH_AD(7),
    /**
     * <pre>
     * The ad is a hotel ad.
     * </pre>
     *
     * <code>HOTEL_AD = 8;</code>
     */
    HOTEL_AD(8),
    /**
     * <pre>
     * The ad is a Smart Shopping ad.
     * </pre>
     *
     * <code>SHOPPING_SMART_AD = 9;</code>
     */
    SHOPPING_SMART_AD(9),
    /**
     * <pre>
     * The ad is a standard Shopping ad.
     * </pre>
     *
     * <code>SHOPPING_PRODUCT_AD = 10;</code>
     */
    SHOPPING_PRODUCT_AD(10),
    /**
     * <pre>
     * The ad is a video ad.
     * </pre>
     *
     * <code>VIDEO_AD = 12;</code>
     */
    VIDEO_AD(12),
    /**
     * <pre>
     * This ad is a Gmail ad.
     * </pre>
     *
     * <code>GMAIL_AD = 13;</code>
     */
    GMAIL_AD(13),
    /**
     * <pre>
     * This ad is an Image ad.
     * </pre>
     *
     * <code>IMAGE_AD = 14;</code>
     */
    IMAGE_AD(14),
    /**
     * <pre>
     * The ad is a responsive search ad.
     * </pre>
     *
     * <code>RESPONSIVE_SEARCH_AD = 15;</code>
     */
    RESPONSIVE_SEARCH_AD(15),
    /**
     * <pre>
     * The ad is a legacy responsive display ad.
     * </pre>
     *
     * <code>LEGACY_RESPONSIVE_DISPLAY_AD = 16;</code>
     */
    LEGACY_RESPONSIVE_DISPLAY_AD(16),
    /**
     * <pre>
     * The ad is an app ad.
     * </pre>
     *
     * <code>APP_AD = 17;</code>
     */
    APP_AD(17),
    /**
     * <pre>
     * The ad is a legacy app install ad.
     * </pre>
     *
     * <code>LEGACY_APP_INSTALL_AD = 18;</code>
     */
    LEGACY_APP_INSTALL_AD(18),
    /**
     * <pre>
     * The ad is a responsive display ad.
     * </pre>
     *
     * <code>RESPONSIVE_DISPLAY_AD = 19;</code>
     */
    RESPONSIVE_DISPLAY_AD(19),
    /**
     * <pre>
     * The ad is a display upload ad with the HTML5_UPLOAD_AD product type.
     * </pre>
     *
     * <code>HTML5_UPLOAD_AD = 21;</code>
     */
    HTML5_UPLOAD_AD(21),
    /**
     * <pre>
     * The ad is a display upload ad with one of the DYNAMIC_HTML5_* product
     * types.
     * </pre>
     *
     * <code>DYNAMIC_HTML5_AD = 22;</code>
     */
    DYNAMIC_HTML5_AD(22),
    /**
     * <pre>
     * The ad is an app engagement ad.
     * </pre>
     *
     * <code>APP_ENGAGEMENT_AD = 23;</code>
     */
    APP_ENGAGEMENT_AD(23),
    /**
     * <pre>
     * The ad is a Shopping Comparison Listing ad.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING_AD = 24;</code>
     */
    SHOPPING_COMPARISON_LISTING_AD(24),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The ad is a text ad.
     * </pre>
     *
     * <code>TEXT_AD = 2;</code>
     */
    public static final int TEXT_AD_VALUE = 2;
    /**
     * <pre>
     * The ad is an expanded text ad.
     * </pre>
     *
     * <code>EXPANDED_TEXT_AD = 3;</code>
     */
    public static final int EXPANDED_TEXT_AD_VALUE = 3;
    /**
     * <pre>
     * The ad is a call only ad.
     * </pre>
     *
     * <code>CALL_ONLY_AD = 6;</code>
     */
    public static final int CALL_ONLY_AD_VALUE = 6;
    /**
     * <pre>
     * The ad is an expanded dynamic search ad.
     * </pre>
     *
     * <code>EXPANDED_DYNAMIC_SEARCH_AD = 7;</code>
     */
    public static final int EXPANDED_DYNAMIC_SEARCH_AD_VALUE = 7;
    /**
     * <pre>
     * The ad is a hotel ad.
     * </pre>
     *
     * <code>HOTEL_AD = 8;</code>
     */
    public static final int HOTEL_AD_VALUE = 8;
    /**
     * <pre>
     * The ad is a Smart Shopping ad.
     * </pre>
     *
     * <code>SHOPPING_SMART_AD = 9;</code>
     */
    public static final int SHOPPING_SMART_AD_VALUE = 9;
    /**
     * <pre>
     * The ad is a standard Shopping ad.
     * </pre>
     *
     * <code>SHOPPING_PRODUCT_AD = 10;</code>
     */
    public static final int SHOPPING_PRODUCT_AD_VALUE = 10;
    /**
     * <pre>
     * The ad is a video ad.
     * </pre>
     *
     * <code>VIDEO_AD = 12;</code>
     */
    public static final int VIDEO_AD_VALUE = 12;
    /**
     * <pre>
     * This ad is a Gmail ad.
     * </pre>
     *
     * <code>GMAIL_AD = 13;</code>
     */
    public static final int GMAIL_AD_VALUE = 13;
    /**
     * <pre>
     * This ad is an Image ad.
     * </pre>
     *
     * <code>IMAGE_AD = 14;</code>
     */
    public static final int IMAGE_AD_VALUE = 14;
    /**
     * <pre>
     * The ad is a responsive search ad.
     * </pre>
     *
     * <code>RESPONSIVE_SEARCH_AD = 15;</code>
     */
    public static final int RESPONSIVE_SEARCH_AD_VALUE = 15;
    /**
     * <pre>
     * The ad is a legacy responsive display ad.
     * </pre>
     *
     * <code>LEGACY_RESPONSIVE_DISPLAY_AD = 16;</code>
     */
    public static final int LEGACY_RESPONSIVE_DISPLAY_AD_VALUE = 16;
    /**
     * <pre>
     * The ad is an app ad.
     * </pre>
     *
     * <code>APP_AD = 17;</code>
     */
    public static final int APP_AD_VALUE = 17;
    /**
     * <pre>
     * The ad is a legacy app install ad.
     * </pre>
     *
     * <code>LEGACY_APP_INSTALL_AD = 18;</code>
     */
    public static final int LEGACY_APP_INSTALL_AD_VALUE = 18;
    /**
     * <pre>
     * The ad is a responsive display ad.
     * </pre>
     *
     * <code>RESPONSIVE_DISPLAY_AD = 19;</code>
     */
    public static final int RESPONSIVE_DISPLAY_AD_VALUE = 19;
    /**
     * <pre>
     * The ad is a display upload ad with the HTML5_UPLOAD_AD product type.
     * </pre>
     *
     * <code>HTML5_UPLOAD_AD = 21;</code>
     */
    public static final int HTML5_UPLOAD_AD_VALUE = 21;
    /**
     * <pre>
     * The ad is a display upload ad with one of the DYNAMIC_HTML5_* product
     * types.
     * </pre>
     *
     * <code>DYNAMIC_HTML5_AD = 22;</code>
     */
    public static final int DYNAMIC_HTML5_AD_VALUE = 22;
    /**
     * <pre>
     * The ad is an app engagement ad.
     * </pre>
     *
     * <code>APP_ENGAGEMENT_AD = 23;</code>
     */
    public static final int APP_ENGAGEMENT_AD_VALUE = 23;
    /**
     * <pre>
     * The ad is a Shopping Comparison Listing ad.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING_AD = 24;</code>
     */
    public static final int SHOPPING_COMPARISON_LISTING_AD_VALUE = 24;


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
    public static AdType valueOf(int value) {
      return forNumber(value);
    }

    public static AdType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return TEXT_AD;
        case 3: return EXPANDED_TEXT_AD;
        case 6: return CALL_ONLY_AD;
        case 7: return EXPANDED_DYNAMIC_SEARCH_AD;
        case 8: return HOTEL_AD;
        case 9: return SHOPPING_SMART_AD;
        case 10: return SHOPPING_PRODUCT_AD;
        case 12: return VIDEO_AD;
        case 13: return GMAIL_AD;
        case 14: return IMAGE_AD;
        case 15: return RESPONSIVE_SEARCH_AD;
        case 16: return LEGACY_RESPONSIVE_DISPLAY_AD;
        case 17: return APP_AD;
        case 18: return LEGACY_APP_INSTALL_AD;
        case 19: return RESPONSIVE_DISPLAY_AD;
        case 21: return HTML5_UPLOAD_AD;
        case 22: return DYNAMIC_HTML5_AD;
        case 23: return APP_ENGAGEMENT_AD;
        case 24: return SHOPPING_COMPARISON_LISTING_AD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdType>() {
            public AdType findValueByNumber(int number) {
              return AdType.forNumber(number);
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
      return com.google.ads.googleads.v1.enums.AdTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdType[] VALUES = values();

    public static AdType valueOf(
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

    private AdType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.AdTypeEnum.AdType)
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
    if (!(obj instanceof com.google.ads.googleads.v1.enums.AdTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.AdTypeEnum other = (com.google.ads.googleads.v1.enums.AdTypeEnum) obj;

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

  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.AdTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.AdTypeEnum prototype) {
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
   * Container for enum describing possible types of an ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.AdTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.AdTypeEnum)
      com.google.ads.googleads.v1.enums.AdTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.AdTypeProto.internal_static_google_ads_googleads_v1_enums_AdTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.AdTypeProto.internal_static_google_ads_googleads_v1_enums_AdTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.AdTypeEnum.class, com.google.ads.googleads.v1.enums.AdTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.AdTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v1.enums.AdTypeProto.internal_static_google_ads_googleads_v1_enums_AdTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.AdTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.AdTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.AdTypeEnum build() {
      com.google.ads.googleads.v1.enums.AdTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.AdTypeEnum buildPartial() {
      com.google.ads.googleads.v1.enums.AdTypeEnum result = new com.google.ads.googleads.v1.enums.AdTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.enums.AdTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.AdTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.AdTypeEnum other) {
      if (other == com.google.ads.googleads.v1.enums.AdTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.AdTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.AdTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.AdTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.AdTypeEnum)
  private static final com.google.ads.googleads.v1.enums.AdTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.AdTypeEnum();
  }

  public static com.google.ads.googleads.v1.enums.AdTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdTypeEnum>() {
    @java.lang.Override
    public AdTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.AdTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

