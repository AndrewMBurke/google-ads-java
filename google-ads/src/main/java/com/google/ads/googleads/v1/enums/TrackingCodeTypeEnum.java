// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/tracking_code_type.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Container for enum describing the type of the generated tag snippets for
 * tracking conversions.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.TrackingCodeTypeEnum}
 */
public  final class TrackingCodeTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.TrackingCodeTypeEnum)
    TrackingCodeTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrackingCodeTypeEnum.newBuilder() to construct.
  private TrackingCodeTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrackingCodeTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrackingCodeTypeEnum(
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
    return com.google.ads.googleads.v1.enums.TrackingCodeTypeProto.internal_static_google_ads_googleads_v1_enums_TrackingCodeTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.TrackingCodeTypeProto.internal_static_google_ads_googleads_v1_enums_TrackingCodeTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.class, com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The type of the generated tag snippets for tracking conversions.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.TrackingCodeTypeEnum.TrackingCodeType}
   */
  public enum TrackingCodeType
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
     * The snippet that is fired as a result of a website page loading.
     * </pre>
     *
     * <code>WEBPAGE = 2;</code>
     */
    WEBPAGE(2),
    /**
     * <pre>
     * The snippet contains a JavaScript function which fires the tag. This
     * function is typically called from an onClick handler added to a link or
     * button element on the page.
     * </pre>
     *
     * <code>WEBPAGE_ONCLICK = 3;</code>
     */
    WEBPAGE_ONCLICK(3),
    /**
     * <pre>
     * For embedding on a mobile webpage. The snippet contains a JavaScript
     * function which fires the tag.
     * </pre>
     *
     * <code>CLICK_TO_CALL = 4;</code>
     */
    CLICK_TO_CALL(4),
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
     * The snippet that is fired as a result of a website page loading.
     * </pre>
     *
     * <code>WEBPAGE = 2;</code>
     */
    public static final int WEBPAGE_VALUE = 2;
    /**
     * <pre>
     * The snippet contains a JavaScript function which fires the tag. This
     * function is typically called from an onClick handler added to a link or
     * button element on the page.
     * </pre>
     *
     * <code>WEBPAGE_ONCLICK = 3;</code>
     */
    public static final int WEBPAGE_ONCLICK_VALUE = 3;
    /**
     * <pre>
     * For embedding on a mobile webpage. The snippet contains a JavaScript
     * function which fires the tag.
     * </pre>
     *
     * <code>CLICK_TO_CALL = 4;</code>
     */
    public static final int CLICK_TO_CALL_VALUE = 4;


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
    public static TrackingCodeType valueOf(int value) {
      return forNumber(value);
    }

    public static TrackingCodeType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return WEBPAGE;
        case 3: return WEBPAGE_ONCLICK;
        case 4: return CLICK_TO_CALL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TrackingCodeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TrackingCodeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TrackingCodeType>() {
            public TrackingCodeType findValueByNumber(int number) {
              return TrackingCodeType.forNumber(number);
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
      return com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final TrackingCodeType[] VALUES = values();

    public static TrackingCodeType valueOf(
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

    private TrackingCodeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.TrackingCodeTypeEnum.TrackingCodeType)
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
    if (!(obj instanceof com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum other = (com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum) obj;

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

  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum prototype) {
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
   * Container for enum describing the type of the generated tag snippets for
   * tracking conversions.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.TrackingCodeTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.TrackingCodeTypeEnum)
      com.google.ads.googleads.v1.enums.TrackingCodeTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.TrackingCodeTypeProto.internal_static_google_ads_googleads_v1_enums_TrackingCodeTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.TrackingCodeTypeProto.internal_static_google_ads_googleads_v1_enums_TrackingCodeTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.class, com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v1.enums.TrackingCodeTypeProto.internal_static_google_ads_googleads_v1_enums_TrackingCodeTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum build() {
      com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum buildPartial() {
      com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum result = new com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum other) {
      if (other == com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.TrackingCodeTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.TrackingCodeTypeEnum)
  private static final com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum();
  }

  public static com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrackingCodeTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<TrackingCodeTypeEnum>() {
    @java.lang.Override
    public TrackingCodeTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrackingCodeTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrackingCodeTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrackingCodeTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.TrackingCodeTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

