// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criteria.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Type of a product offer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.ProductTypeInfo}
 */
public  final class ProductTypeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.ProductTypeInfo)
    ProductTypeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductTypeInfo.newBuilder() to construct.
  private ProductTypeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductTypeInfo() {
    level_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductTypeInfo(
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
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            level_ = rawValue;
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
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductTypeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductTypeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.ProductTypeInfo.class, com.google.ads.googleads.v1.common.ProductTypeInfo.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue value_;
  /**
   * <pre>
   * Value of the type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 1;</code>
   */
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * Value of the type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 1;</code>
   */
  public com.google.protobuf.StringValue getValue() {
    return value_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * Value of the type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getValueOrBuilder() {
    return getValue();
  }

  public static final int LEVEL_FIELD_NUMBER = 2;
  private int level_;
  /**
   * <pre>
   * Level of the type.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
   */
  public int getLevelValue() {
    return level_;
  }
  /**
   * <pre>
   * Level of the type.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
   */
  public com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel getLevel() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel result = com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel.valueOf(level_);
    return result == null ? com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel.UNRECOGNIZED : result;
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
    if (value_ != null) {
      output.writeMessage(1, getValue());
    }
    if (level_ != com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, level_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getValue());
    }
    if (level_ != com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, level_);
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.ProductTypeInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.ProductTypeInfo other = (com.google.ads.googleads.v1.common.ProductTypeInfo) obj;

    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (level_ != other.level_) return false;
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
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + level_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductTypeInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.ProductTypeInfo prototype) {
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
   * Type of a product offer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.ProductTypeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.ProductTypeInfo)
      com.google.ads.googleads.v1.common.ProductTypeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductTypeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductTypeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.ProductTypeInfo.class, com.google.ads.googleads.v1.common.ProductTypeInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.ProductTypeInfo.newBuilder()
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
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      level_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductTypeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductTypeInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.ProductTypeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductTypeInfo build() {
      com.google.ads.googleads.v1.common.ProductTypeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductTypeInfo buildPartial() {
      com.google.ads.googleads.v1.common.ProductTypeInfo result = new com.google.ads.googleads.v1.common.ProductTypeInfo(this);
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
      result.level_ = level_;
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
      if (other instanceof com.google.ads.googleads.v1.common.ProductTypeInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.ProductTypeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.ProductTypeInfo other) {
      if (other == com.google.ads.googleads.v1.common.ProductTypeInfo.getDefaultInstance()) return this;
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.level_ != 0) {
        setLevelValue(other.getLevelValue());
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
      com.google.ads.googleads.v1.common.ProductTypeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.ProductTypeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> valueBuilder_;
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public com.google.protobuf.StringValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public Builder setValue(com.google.protobuf.StringValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public Builder setValue(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public Builder mergeValue(com.google.protobuf.StringValue value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.google.protobuf.StringValue.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * Value of the type.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private int level_ = 0;
    /**
     * <pre>
     * Level of the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
     */
    public int getLevelValue() {
      return level_;
    }
    /**
     * <pre>
     * Level of the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
     */
    public Builder setLevelValue(int value) {
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Level of the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
     */
    public com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel getLevel() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel result = com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel.valueOf(level_);
      return result == null ? com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Level of the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
     */
    public Builder setLevel(com.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      level_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Level of the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.ProductTypeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.ProductTypeInfo)
  private static final com.google.ads.googleads.v1.common.ProductTypeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.ProductTypeInfo();
  }

  public static com.google.ads.googleads.v1.common.ProductTypeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductTypeInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProductTypeInfo>() {
    @java.lang.Override
    public ProductTypeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductTypeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductTypeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductTypeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.ProductTypeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

