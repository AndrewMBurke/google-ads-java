// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/feed_item_error.proto

package com.google.ads.googleads.v2.errors;

/**
 * <pre>
 * Container for enum describing possible feed item errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.errors.FeedItemErrorEnum}
 */
public  final class FeedItemErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.errors.FeedItemErrorEnum)
    FeedItemErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedItemErrorEnum.newBuilder() to construct.
  private FeedItemErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedItemErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedItemErrorEnum(
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
    return com.google.ads.googleads.v2.errors.FeedItemErrorProto.internal_static_google_ads_googleads_v2_errors_FeedItemErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.errors.FeedItemErrorProto.internal_static_google_ads_googleads_v2_errors_FeedItemErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.errors.FeedItemErrorEnum.class, com.google.ads.googleads.v2.errors.FeedItemErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible feed item errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v2.errors.FeedItemErrorEnum.FeedItemError}
   */
  public enum FeedItemError
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
     * Cannot convert the feed attribute value from string to its real type.
     * </pre>
     *
     * <code>CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING = 2;</code>
     */
    CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING(2),
    /**
     * <pre>
     * Cannot operate on removed feed item.
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_REMOVED_FEED_ITEM = 3;</code>
     */
    CANNOT_OPERATE_ON_REMOVED_FEED_ITEM(3),
    /**
     * <pre>
     * Date time zone does not match the account's time zone.
     * </pre>
     *
     * <code>DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE = 4;</code>
     */
    DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE(4),
    /**
     * <pre>
     * Feed item with the key attributes could not be found.
     * </pre>
     *
     * <code>KEY_ATTRIBUTES_NOT_FOUND = 5;</code>
     */
    KEY_ATTRIBUTES_NOT_FOUND(5),
    /**
     * <pre>
     * Url feed attribute value is not valid.
     * </pre>
     *
     * <code>INVALID_URL = 6;</code>
     */
    INVALID_URL(6),
    /**
     * <pre>
     * Some key attributes are missing.
     * </pre>
     *
     * <code>MISSING_KEY_ATTRIBUTES = 7;</code>
     */
    MISSING_KEY_ATTRIBUTES(7),
    /**
     * <pre>
     * Feed item has same key attributes as another feed item.
     * </pre>
     *
     * <code>KEY_ATTRIBUTES_NOT_UNIQUE = 8;</code>
     */
    KEY_ATTRIBUTES_NOT_UNIQUE(8),
    /**
     * <pre>
     * Cannot modify key attributes on an existing feed item.
     * </pre>
     *
     * <code>CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE = 9;</code>
     */
    CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE(9),
    /**
     * <pre>
     * The feed attribute value is too large.
     * </pre>
     *
     * <code>SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE = 10;</code>
     */
    SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE(10),
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
     * Cannot convert the feed attribute value from string to its real type.
     * </pre>
     *
     * <code>CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING = 2;</code>
     */
    public static final int CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING_VALUE = 2;
    /**
     * <pre>
     * Cannot operate on removed feed item.
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_REMOVED_FEED_ITEM = 3;</code>
     */
    public static final int CANNOT_OPERATE_ON_REMOVED_FEED_ITEM_VALUE = 3;
    /**
     * <pre>
     * Date time zone does not match the account's time zone.
     * </pre>
     *
     * <code>DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE = 4;</code>
     */
    public static final int DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE_VALUE = 4;
    /**
     * <pre>
     * Feed item with the key attributes could not be found.
     * </pre>
     *
     * <code>KEY_ATTRIBUTES_NOT_FOUND = 5;</code>
     */
    public static final int KEY_ATTRIBUTES_NOT_FOUND_VALUE = 5;
    /**
     * <pre>
     * Url feed attribute value is not valid.
     * </pre>
     *
     * <code>INVALID_URL = 6;</code>
     */
    public static final int INVALID_URL_VALUE = 6;
    /**
     * <pre>
     * Some key attributes are missing.
     * </pre>
     *
     * <code>MISSING_KEY_ATTRIBUTES = 7;</code>
     */
    public static final int MISSING_KEY_ATTRIBUTES_VALUE = 7;
    /**
     * <pre>
     * Feed item has same key attributes as another feed item.
     * </pre>
     *
     * <code>KEY_ATTRIBUTES_NOT_UNIQUE = 8;</code>
     */
    public static final int KEY_ATTRIBUTES_NOT_UNIQUE_VALUE = 8;
    /**
     * <pre>
     * Cannot modify key attributes on an existing feed item.
     * </pre>
     *
     * <code>CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE = 9;</code>
     */
    public static final int CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE_VALUE = 9;
    /**
     * <pre>
     * The feed attribute value is too large.
     * </pre>
     *
     * <code>SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE = 10;</code>
     */
    public static final int SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE_VALUE = 10;


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
    public static FeedItemError valueOf(int value) {
      return forNumber(value);
    }

    public static FeedItemError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING;
        case 3: return CANNOT_OPERATE_ON_REMOVED_FEED_ITEM;
        case 4: return DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE;
        case 5: return KEY_ATTRIBUTES_NOT_FOUND;
        case 6: return INVALID_URL;
        case 7: return MISSING_KEY_ATTRIBUTES;
        case 8: return KEY_ATTRIBUTES_NOT_UNIQUE;
        case 9: return CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE;
        case 10: return SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FeedItemError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FeedItemError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FeedItemError>() {
            public FeedItemError findValueByNumber(int number) {
              return FeedItemError.forNumber(number);
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
      return com.google.ads.googleads.v2.errors.FeedItemErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FeedItemError[] VALUES = values();

    public static FeedItemError valueOf(
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

    private FeedItemError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v2.errors.FeedItemErrorEnum.FeedItemError)
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
    if (!(obj instanceof com.google.ads.googleads.v2.errors.FeedItemErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.errors.FeedItemErrorEnum other = (com.google.ads.googleads.v2.errors.FeedItemErrorEnum) obj;

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

  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.errors.FeedItemErrorEnum prototype) {
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
   * Container for enum describing possible feed item errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.errors.FeedItemErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.errors.FeedItemErrorEnum)
      com.google.ads.googleads.v2.errors.FeedItemErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.errors.FeedItemErrorProto.internal_static_google_ads_googleads_v2_errors_FeedItemErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.errors.FeedItemErrorProto.internal_static_google_ads_googleads_v2_errors_FeedItemErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.errors.FeedItemErrorEnum.class, com.google.ads.googleads.v2.errors.FeedItemErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.errors.FeedItemErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v2.errors.FeedItemErrorProto.internal_static_google_ads_googleads_v2_errors_FeedItemErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.FeedItemErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.errors.FeedItemErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.FeedItemErrorEnum build() {
      com.google.ads.googleads.v2.errors.FeedItemErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.FeedItemErrorEnum buildPartial() {
      com.google.ads.googleads.v2.errors.FeedItemErrorEnum result = new com.google.ads.googleads.v2.errors.FeedItemErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v2.errors.FeedItemErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v2.errors.FeedItemErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.errors.FeedItemErrorEnum other) {
      if (other == com.google.ads.googleads.v2.errors.FeedItemErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v2.errors.FeedItemErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.errors.FeedItemErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.errors.FeedItemErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.errors.FeedItemErrorEnum)
  private static final com.google.ads.googleads.v2.errors.FeedItemErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.errors.FeedItemErrorEnum();
  }

  public static com.google.ads.googleads.v2.errors.FeedItemErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedItemErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FeedItemErrorEnum>() {
    @java.lang.Override
    public FeedItemErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedItemErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedItemErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedItemErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.errors.FeedItemErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

