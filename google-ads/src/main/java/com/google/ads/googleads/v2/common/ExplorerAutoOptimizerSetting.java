// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/explorer_auto_optimizer_setting.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * Settings for the Display Campaign Optimizer, initially named "Explorer".
 * Learn more about
 * [automatic targeting](https://support.google.com/google-ads/answer/190596).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting}
 */
public  final class ExplorerAutoOptimizerSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting)
    ExplorerAutoOptimizerSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExplorerAutoOptimizerSetting.newBuilder() to construct.
  private ExplorerAutoOptimizerSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExplorerAutoOptimizerSetting() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExplorerAutoOptimizerSetting(
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
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (optIn_ != null) {
              subBuilder = optIn_.toBuilder();
            }
            optIn_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(optIn_);
              optIn_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingProto.internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingProto.internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting.class, com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting.Builder.class);
  }

  public static final int OPT_IN_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue optIn_;
  /**
   * <pre>
   * Indicates whether the optimizer is turned on.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue opt_in = 1;</code>
   */
  public boolean hasOptIn() {
    return optIn_ != null;
  }
  /**
   * <pre>
   * Indicates whether the optimizer is turned on.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue opt_in = 1;</code>
   */
  public com.google.protobuf.BoolValue getOptIn() {
    return optIn_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : optIn_;
  }
  /**
   * <pre>
   * Indicates whether the optimizer is turned on.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue opt_in = 1;</code>
   */
  public com.google.protobuf.BoolValueOrBuilder getOptInOrBuilder() {
    return getOptIn();
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
    if (optIn_ != null) {
      output.writeMessage(1, getOptIn());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optIn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOptIn());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting other = (com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting) obj;

    if (hasOptIn() != other.hasOptIn()) return false;
    if (hasOptIn()) {
      if (!getOptIn()
          .equals(other.getOptIn())) return false;
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
    if (hasOptIn()) {
      hash = (37 * hash) + OPT_IN_FIELD_NUMBER;
      hash = (53 * hash) + getOptIn().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting prototype) {
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
   * Settings for the Display Campaign Optimizer, initially named "Explorer".
   * Learn more about
   * [automatic targeting](https://support.google.com/google-ads/answer/190596).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting)
      com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingProto.internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingProto.internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting.class, com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting.newBuilder()
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
      if (optInBuilder_ == null) {
        optIn_ = null;
      } else {
        optIn_ = null;
        optInBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingProto.internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting build() {
      com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting buildPartial() {
      com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting result = new com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting(this);
      if (optInBuilder_ == null) {
        result.optIn_ = optIn_;
      } else {
        result.optIn_ = optInBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting) {
        return mergeFrom((com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting other) {
      if (other == com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting.getDefaultInstance()) return this;
      if (other.hasOptIn()) {
        mergeOptIn(other.getOptIn());
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
      com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.BoolValue optIn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> optInBuilder_;
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public boolean hasOptIn() {
      return optInBuilder_ != null || optIn_ != null;
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public com.google.protobuf.BoolValue getOptIn() {
      if (optInBuilder_ == null) {
        return optIn_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : optIn_;
      } else {
        return optInBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public Builder setOptIn(com.google.protobuf.BoolValue value) {
      if (optInBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        optIn_ = value;
        onChanged();
      } else {
        optInBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public Builder setOptIn(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (optInBuilder_ == null) {
        optIn_ = builderForValue.build();
        onChanged();
      } else {
        optInBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public Builder mergeOptIn(com.google.protobuf.BoolValue value) {
      if (optInBuilder_ == null) {
        if (optIn_ != null) {
          optIn_ =
            com.google.protobuf.BoolValue.newBuilder(optIn_).mergeFrom(value).buildPartial();
        } else {
          optIn_ = value;
        }
        onChanged();
      } else {
        optInBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public Builder clearOptIn() {
      if (optInBuilder_ == null) {
        optIn_ = null;
        onChanged();
      } else {
        optIn_ = null;
        optInBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public com.google.protobuf.BoolValue.Builder getOptInBuilder() {
      
      onChanged();
      return getOptInFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getOptInOrBuilder() {
      if (optInBuilder_ != null) {
        return optInBuilder_.getMessageOrBuilder();
      } else {
        return optIn_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : optIn_;
      }
    }
    /**
     * <pre>
     * Indicates whether the optimizer is turned on.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue opt_in = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getOptInFieldBuilder() {
      if (optInBuilder_ == null) {
        optInBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getOptIn(),
                getParentForChildren(),
                isClean());
        optIn_ = null;
      }
      return optInBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting)
  private static final com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting();
  }

  public static com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplorerAutoOptimizerSetting>
      PARSER = new com.google.protobuf.AbstractParser<ExplorerAutoOptimizerSetting>() {
    @java.lang.Override
    public ExplorerAutoOptimizerSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExplorerAutoOptimizerSetting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExplorerAutoOptimizerSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplorerAutoOptimizerSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

