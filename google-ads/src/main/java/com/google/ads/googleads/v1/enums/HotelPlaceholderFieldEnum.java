// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/hotel_placeholder_field.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Values for Hotel placeholder fields.
 * For more information about dynamic remarketing feeds, see
 * https://support.google.com/google-ads/answer/6053288.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum}
 */
public  final class HotelPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum)
    HotelPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelPlaceholderFieldEnum.newBuilder() to construct.
  private HotelPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelPlaceholderFieldEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotelPlaceholderFieldEnum(
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
    return com.google.ads.googleads.v1.enums.HotelsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_HotelPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.HotelsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_HotelPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.class, com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Hotel placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField}
   */
  public enum HotelPlaceholderField
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Data Type: STRING. Required. Unique ID.
     * </pre>
     *
     * <code>PROPERTY_ID = 2;</code>
     */
    PROPERTY_ID(2),
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with property name to be shown
     * in dynamic ad.
     * </pre>
     *
     * <code>PROPERTY_NAME = 3;</code>
     */
    PROPERTY_NAME(3),
    /**
     * <pre>
     * Data Type: STRING. Name of destination to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESTINATION_NAME = 4;</code>
     */
    DESTINATION_NAME(4),
    /**
     * <pre>
     * Data Type: STRING. Description of destination to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESCRIPTION = 5;</code>
     */
    DESCRIPTION(5),
    /**
     * <pre>
     * Data Type: STRING. Complete property address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 6;</code>
     */
    ADDRESS(6),
    /**
     * <pre>
     * Data Type: STRING. Price to be shown in the ad.
     * Example: "100.00 USD"
     * </pre>
     *
     * <code>PRICE = 7;</code>
     */
    PRICE(7),
    /**
     * <pre>
     * Data Type: STRING. Formatted price to be shown in the ad.
     * Example: "Starting at $100.00 USD", "$80 - $100"
     * </pre>
     *
     * <code>FORMATTED_PRICE = 8;</code>
     */
    FORMATTED_PRICE(8),
    /**
     * <pre>
     * Data Type: STRING. Sale price to be shown in the ad.
     * Example: "80.00 USD"
     * </pre>
     *
     * <code>SALE_PRICE = 9;</code>
     */
    SALE_PRICE(9),
    /**
     * <pre>
     * Data Type: STRING. Formatted sale price to be shown in the ad.
     * Example: "On sale for $80.00", "$60 - $80"
     * </pre>
     *
     * <code>FORMATTED_SALE_PRICE = 10;</code>
     */
    FORMATTED_SALE_PRICE(10),
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad.
     * </pre>
     *
     * <code>IMAGE_URL = 11;</code>
     */
    IMAGE_URL(11),
    /**
     * <pre>
     * Data Type: STRING. Category of property used to group like items together
     * for recommendation engine.
     * </pre>
     *
     * <code>CATEGORY = 12;</code>
     */
    CATEGORY(12),
    /**
     * <pre>
     * Data Type: INT64. Star rating (1 to 5) used to group like items
     * together for recommendation engine.
     * </pre>
     *
     * <code>STAR_RATING = 13;</code>
     */
    STAR_RATING(13),
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 14;</code>
     */
    CONTEXTUAL_KEYWORDS(14),
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs for the ad when using Upgraded
     * URLs. User will be redirected to these URLs when they click on an ad, or
     * when they click on a specific flight for ads that show multiple
     * flights.
     * </pre>
     *
     * <code>FINAL_URLS = 15;</code>
     */
    FINAL_URLS(15),
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 16;</code>
     */
    FINAL_MOBILE_URLS(16),
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 17;</code>
     */
    TRACKING_URL(17),
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 18;</code>
     */
    ANDROID_APP_LINK(18),
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended property IDs to show together
     * with this item.
     * </pre>
     *
     * <code>SIMILAR_PROPERTY_IDS = 19;</code>
     */
    SIMILAR_PROPERTY_IDS(19),
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 20;</code>
     */
    IOS_APP_LINK(20),
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 21;</code>
     */
    IOS_APP_STORE_ID(21),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Data Type: STRING. Required. Unique ID.
     * </pre>
     *
     * <code>PROPERTY_ID = 2;</code>
     */
    public static final int PROPERTY_ID_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with property name to be shown
     * in dynamic ad.
     * </pre>
     *
     * <code>PROPERTY_NAME = 3;</code>
     */
    public static final int PROPERTY_NAME_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. Name of destination to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESTINATION_NAME = 4;</code>
     */
    public static final int DESTINATION_NAME_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. Description of destination to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESCRIPTION = 5;</code>
     */
    public static final int DESCRIPTION_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. Complete property address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 6;</code>
     */
    public static final int ADDRESS_VALUE = 6;
    /**
     * <pre>
     * Data Type: STRING. Price to be shown in the ad.
     * Example: "100.00 USD"
     * </pre>
     *
     * <code>PRICE = 7;</code>
     */
    public static final int PRICE_VALUE = 7;
    /**
     * <pre>
     * Data Type: STRING. Formatted price to be shown in the ad.
     * Example: "Starting at $100.00 USD", "$80 - $100"
     * </pre>
     *
     * <code>FORMATTED_PRICE = 8;</code>
     */
    public static final int FORMATTED_PRICE_VALUE = 8;
    /**
     * <pre>
     * Data Type: STRING. Sale price to be shown in the ad.
     * Example: "80.00 USD"
     * </pre>
     *
     * <code>SALE_PRICE = 9;</code>
     */
    public static final int SALE_PRICE_VALUE = 9;
    /**
     * <pre>
     * Data Type: STRING. Formatted sale price to be shown in the ad.
     * Example: "On sale for $80.00", "$60 - $80"
     * </pre>
     *
     * <code>FORMATTED_SALE_PRICE = 10;</code>
     */
    public static final int FORMATTED_SALE_PRICE_VALUE = 10;
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad.
     * </pre>
     *
     * <code>IMAGE_URL = 11;</code>
     */
    public static final int IMAGE_URL_VALUE = 11;
    /**
     * <pre>
     * Data Type: STRING. Category of property used to group like items together
     * for recommendation engine.
     * </pre>
     *
     * <code>CATEGORY = 12;</code>
     */
    public static final int CATEGORY_VALUE = 12;
    /**
     * <pre>
     * Data Type: INT64. Star rating (1 to 5) used to group like items
     * together for recommendation engine.
     * </pre>
     *
     * <code>STAR_RATING = 13;</code>
     */
    public static final int STAR_RATING_VALUE = 13;
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 14;</code>
     */
    public static final int CONTEXTUAL_KEYWORDS_VALUE = 14;
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs for the ad when using Upgraded
     * URLs. User will be redirected to these URLs when they click on an ad, or
     * when they click on a specific flight for ads that show multiple
     * flights.
     * </pre>
     *
     * <code>FINAL_URLS = 15;</code>
     */
    public static final int FINAL_URLS_VALUE = 15;
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 16;</code>
     */
    public static final int FINAL_MOBILE_URLS_VALUE = 16;
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 17;</code>
     */
    public static final int TRACKING_URL_VALUE = 17;
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 18;</code>
     */
    public static final int ANDROID_APP_LINK_VALUE = 18;
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended property IDs to show together
     * with this item.
     * </pre>
     *
     * <code>SIMILAR_PROPERTY_IDS = 19;</code>
     */
    public static final int SIMILAR_PROPERTY_IDS_VALUE = 19;
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 20;</code>
     */
    public static final int IOS_APP_LINK_VALUE = 20;
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 21;</code>
     */
    public static final int IOS_APP_STORE_ID_VALUE = 21;


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
    public static HotelPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    public static HotelPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PROPERTY_ID;
        case 3: return PROPERTY_NAME;
        case 4: return DESTINATION_NAME;
        case 5: return DESCRIPTION;
        case 6: return ADDRESS;
        case 7: return PRICE;
        case 8: return FORMATTED_PRICE;
        case 9: return SALE_PRICE;
        case 10: return FORMATTED_SALE_PRICE;
        case 11: return IMAGE_URL;
        case 12: return CATEGORY;
        case 13: return STAR_RATING;
        case 14: return CONTEXTUAL_KEYWORDS;
        case 15: return FINAL_URLS;
        case 16: return FINAL_MOBILE_URLS;
        case 17: return TRACKING_URL;
        case 18: return ANDROID_APP_LINK;
        case 19: return SIMILAR_PROPERTY_IDS;
        case 20: return IOS_APP_LINK;
        case 21: return IOS_APP_STORE_ID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HotelPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HotelPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HotelPlaceholderField>() {
            public HotelPlaceholderField findValueByNumber(int number) {
              return HotelPlaceholderField.forNumber(number);
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
      return com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final HotelPlaceholderField[] VALUES = values();

    public static HotelPlaceholderField valueOf(
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

    private HotelPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField)
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
    if (!(obj instanceof com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum other = (com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum) obj;

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

  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum prototype) {
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
   * Values for Hotel placeholder fields.
   * For more information about dynamic remarketing feeds, see
   * https://support.google.com/google-ads/answer/6053288.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum)
      com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.HotelsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_HotelPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.HotelsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_HotelPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.class, com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.newBuilder()
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
      return com.google.ads.googleads.v1.enums.HotelsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_HotelPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum build() {
      com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum result = new com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<HotelPlaceholderFieldEnum>() {
    @java.lang.Override
    public HotelPlaceholderFieldEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotelPlaceholderFieldEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.HotelPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

