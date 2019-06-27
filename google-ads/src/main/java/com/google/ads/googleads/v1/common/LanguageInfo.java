// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criteria.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * A language criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.LanguageInfo}
 */
public  final class LanguageInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.LanguageInfo)
    LanguageInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanguageInfo.newBuilder() to construct.
  private LanguageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanguageInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LanguageInfo(
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
            if (languageConstant_ != null) {
              subBuilder = languageConstant_.toBuilder();
            }
            languageConstant_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(languageConstant_);
              languageConstant_ = subBuilder.buildPartial();
            }

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
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_LanguageInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_LanguageInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.LanguageInfo.class, com.google.ads.googleads.v1.common.LanguageInfo.Builder.class);
  }

  public static final int LANGUAGE_CONSTANT_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue languageConstant_;
  /**
   * <pre>
   * The language constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_constant = 1;</code>
   */
  public boolean hasLanguageConstant() {
    return languageConstant_ != null;
  }
  /**
   * <pre>
   * The language constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_constant = 1;</code>
   */
  public com.google.protobuf.StringValue getLanguageConstant() {
    return languageConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : languageConstant_;
  }
  /**
   * <pre>
   * The language constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_constant = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getLanguageConstantOrBuilder() {
    return getLanguageConstant();
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
    if (languageConstant_ != null) {
      output.writeMessage(1, getLanguageConstant());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (languageConstant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLanguageConstant());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.LanguageInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.LanguageInfo other = (com.google.ads.googleads.v1.common.LanguageInfo) obj;

    if (hasLanguageConstant() != other.hasLanguageConstant()) return false;
    if (hasLanguageConstant()) {
      if (!getLanguageConstant()
          .equals(other.getLanguageConstant())) return false;
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
    if (hasLanguageConstant()) {
      hash = (37 * hash) + LANGUAGE_CONSTANT_FIELD_NUMBER;
      hash = (53 * hash) + getLanguageConstant().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.LanguageInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.LanguageInfo prototype) {
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
   * A language criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.LanguageInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.LanguageInfo)
      com.google.ads.googleads.v1.common.LanguageInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_LanguageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_LanguageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.LanguageInfo.class, com.google.ads.googleads.v1.common.LanguageInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.LanguageInfo.newBuilder()
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
      if (languageConstantBuilder_ == null) {
        languageConstant_ = null;
      } else {
        languageConstant_ = null;
        languageConstantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_LanguageInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.LanguageInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.LanguageInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.LanguageInfo build() {
      com.google.ads.googleads.v1.common.LanguageInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.LanguageInfo buildPartial() {
      com.google.ads.googleads.v1.common.LanguageInfo result = new com.google.ads.googleads.v1.common.LanguageInfo(this);
      if (languageConstantBuilder_ == null) {
        result.languageConstant_ = languageConstant_;
      } else {
        result.languageConstant_ = languageConstantBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v1.common.LanguageInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.LanguageInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.LanguageInfo other) {
      if (other == com.google.ads.googleads.v1.common.LanguageInfo.getDefaultInstance()) return this;
      if (other.hasLanguageConstant()) {
        mergeLanguageConstant(other.getLanguageConstant());
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
      com.google.ads.googleads.v1.common.LanguageInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.LanguageInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue languageConstant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> languageConstantBuilder_;
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public boolean hasLanguageConstant() {
      return languageConstantBuilder_ != null || languageConstant_ != null;
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public com.google.protobuf.StringValue getLanguageConstant() {
      if (languageConstantBuilder_ == null) {
        return languageConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : languageConstant_;
      } else {
        return languageConstantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public Builder setLanguageConstant(com.google.protobuf.StringValue value) {
      if (languageConstantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        languageConstant_ = value;
        onChanged();
      } else {
        languageConstantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public Builder setLanguageConstant(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (languageConstantBuilder_ == null) {
        languageConstant_ = builderForValue.build();
        onChanged();
      } else {
        languageConstantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public Builder mergeLanguageConstant(com.google.protobuf.StringValue value) {
      if (languageConstantBuilder_ == null) {
        if (languageConstant_ != null) {
          languageConstant_ =
            com.google.protobuf.StringValue.newBuilder(languageConstant_).mergeFrom(value).buildPartial();
        } else {
          languageConstant_ = value;
        }
        onChanged();
      } else {
        languageConstantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public Builder clearLanguageConstant() {
      if (languageConstantBuilder_ == null) {
        languageConstant_ = null;
        onChanged();
      } else {
        languageConstant_ = null;
        languageConstantBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getLanguageConstantBuilder() {
      
      onChanged();
      return getLanguageConstantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getLanguageConstantOrBuilder() {
      if (languageConstantBuilder_ != null) {
        return languageConstantBuilder_.getMessageOrBuilder();
      } else {
        return languageConstant_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : languageConstant_;
      }
    }
    /**
     * <pre>
     * The language constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue language_constant = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getLanguageConstantFieldBuilder() {
      if (languageConstantBuilder_ == null) {
        languageConstantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getLanguageConstant(),
                getParentForChildren(),
                isClean());
        languageConstant_ = null;
      }
      return languageConstantBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.LanguageInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.LanguageInfo)
  private static final com.google.ads.googleads.v1.common.LanguageInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.LanguageInfo();
  }

  public static com.google.ads.googleads.v1.common.LanguageInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanguageInfo>
      PARSER = new com.google.protobuf.AbstractParser<LanguageInfo>() {
    @java.lang.Override
    public LanguageInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LanguageInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LanguageInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanguageInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.LanguageInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

