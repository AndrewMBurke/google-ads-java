// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * A keyword criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.KeywordInfo}
 */
public  final class KeywordInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.KeywordInfo)
    KeywordInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordInfo.newBuilder() to construct.
  private KeywordInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordInfo() {
    matchType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordInfo(
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
            if (text_ != null) {
              subBuilder = text_.toBuilder();
            }
            text_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(text_);
              text_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            matchType_ = rawValue;
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
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_KeywordInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_KeywordInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.KeywordInfo.class, com.google.ads.googleads.v2.common.KeywordInfo.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue text_;
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 1;</code>
   */
  public boolean hasText() {
    return text_ != null;
  }
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 1;</code>
   */
  public com.google.protobuf.StringValue getText() {
    return text_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : text_;
  }
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getTextOrBuilder() {
    return getText();
  }

  public static final int MATCH_TYPE_FIELD_NUMBER = 2;
  private int matchType_;
  /**
   * <pre>
   * The match type of the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
   */
  public int getMatchTypeValue() {
    return matchType_;
  }
  /**
   * <pre>
   * The match type of the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
   */
  public com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType result = com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType.valueOf(matchType_);
    return result == null ? com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType.UNRECOGNIZED : result;
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
    if (text_ != null) {
      output.writeMessage(1, getText());
    }
    if (matchType_ != com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, matchType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (text_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getText());
    }
    if (matchType_ != com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, matchType_);
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.KeywordInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.KeywordInfo other = (com.google.ads.googleads.v2.common.KeywordInfo) obj;

    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText()
          .equals(other.getText())) return false;
    }
    if (matchType_ != other.matchType_) return false;
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
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + matchType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.KeywordInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.KeywordInfo prototype) {
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
   * A keyword criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.KeywordInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.KeywordInfo)
      com.google.ads.googleads.v2.common.KeywordInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_KeywordInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_KeywordInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.KeywordInfo.class, com.google.ads.googleads.v2.common.KeywordInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.KeywordInfo.newBuilder()
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
      if (textBuilder_ == null) {
        text_ = null;
      } else {
        text_ = null;
        textBuilder_ = null;
      }
      matchType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_KeywordInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.KeywordInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.KeywordInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.KeywordInfo build() {
      com.google.ads.googleads.v2.common.KeywordInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.KeywordInfo buildPartial() {
      com.google.ads.googleads.v2.common.KeywordInfo result = new com.google.ads.googleads.v2.common.KeywordInfo(this);
      if (textBuilder_ == null) {
        result.text_ = text_;
      } else {
        result.text_ = textBuilder_.build();
      }
      result.matchType_ = matchType_;
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
      if (other instanceof com.google.ads.googleads.v2.common.KeywordInfo) {
        return mergeFrom((com.google.ads.googleads.v2.common.KeywordInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.KeywordInfo other) {
      if (other == com.google.ads.googleads.v2.common.KeywordInfo.getDefaultInstance()) return this;
      if (other.hasText()) {
        mergeText(other.getText());
      }
      if (other.matchType_ != 0) {
        setMatchTypeValue(other.getMatchTypeValue());
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
      com.google.ads.googleads.v2.common.KeywordInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.KeywordInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue text_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> textBuilder_;
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public boolean hasText() {
      return textBuilder_ != null || text_ != null;
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public com.google.protobuf.StringValue getText() {
      if (textBuilder_ == null) {
        return text_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder setText(com.google.protobuf.StringValue value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
        onChanged();
      } else {
        textBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder setText(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
        onChanged();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder mergeText(com.google.protobuf.StringValue value) {
      if (textBuilder_ == null) {
        if (text_ != null) {
          text_ =
            com.google.protobuf.StringValue.newBuilder(text_).mergeFrom(value).buildPartial();
        } else {
          text_ = value;
        }
        onChanged();
      } else {
        textBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder clearText() {
      if (textBuilder_ == null) {
        text_ = null;
        onChanged();
      } else {
        text_ = null;
        textBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getTextBuilder() {
      
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : text_;
      }
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getText(),
                getParentForChildren(),
                isClean());
        text_ = null;
      }
      return textBuilder_;
    }

    private int matchType_ = 0;
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     */
    public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     */
    public Builder setMatchTypeValue(int value) {
      matchType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     */
    public com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType result = com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType.valueOf(matchType_);
      return result == null ? com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     */
    public Builder setMatchType(com.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      matchType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     */
    public Builder clearMatchType() {
      
      matchType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.KeywordInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.KeywordInfo)
  private static final com.google.ads.googleads.v2.common.KeywordInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.KeywordInfo();
  }

  public static com.google.ads.googleads.v2.common.KeywordInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordInfo>
      PARSER = new com.google.protobuf.AbstractParser<KeywordInfo>() {
    @java.lang.Override
    public KeywordInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.KeywordInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

