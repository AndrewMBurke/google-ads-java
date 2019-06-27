// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/customer.proto

package com.google.ads.googleads.v2.resources;

/**
 * <pre>
 * Remarketing setting for a customer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.resources.RemarketingSetting}
 */
public  final class RemarketingSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.resources.RemarketingSetting)
    RemarketingSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemarketingSetting.newBuilder() to construct.
  private RemarketingSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemarketingSetting() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemarketingSetting(
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
            if (googleGlobalSiteTag_ != null) {
              subBuilder = googleGlobalSiteTag_.toBuilder();
            }
            googleGlobalSiteTag_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(googleGlobalSiteTag_);
              googleGlobalSiteTag_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.resources.CustomerProto.internal_static_google_ads_googleads_v2_resources_RemarketingSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.resources.CustomerProto.internal_static_google_ads_googleads_v2_resources_RemarketingSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.resources.RemarketingSetting.class, com.google.ads.googleads.v2.resources.RemarketingSetting.Builder.class);
  }

  public static final int GOOGLE_GLOBAL_SITE_TAG_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue googleGlobalSiteTag_;
  /**
   * <pre>
   * The Google global site tag.
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
   */
  public boolean hasGoogleGlobalSiteTag() {
    return googleGlobalSiteTag_ != null;
  }
  /**
   * <pre>
   * The Google global site tag.
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
   */
  public com.google.protobuf.StringValue getGoogleGlobalSiteTag() {
    return googleGlobalSiteTag_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : googleGlobalSiteTag_;
  }
  /**
   * <pre>
   * The Google global site tag.
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getGoogleGlobalSiteTagOrBuilder() {
    return getGoogleGlobalSiteTag();
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
    if (googleGlobalSiteTag_ != null) {
      output.writeMessage(1, getGoogleGlobalSiteTag());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (googleGlobalSiteTag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGoogleGlobalSiteTag());
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
    if (!(obj instanceof com.google.ads.googleads.v2.resources.RemarketingSetting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.resources.RemarketingSetting other = (com.google.ads.googleads.v2.resources.RemarketingSetting) obj;

    if (hasGoogleGlobalSiteTag() != other.hasGoogleGlobalSiteTag()) return false;
    if (hasGoogleGlobalSiteTag()) {
      if (!getGoogleGlobalSiteTag()
          .equals(other.getGoogleGlobalSiteTag())) return false;
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
    if (hasGoogleGlobalSiteTag()) {
      hash = (37 * hash) + GOOGLE_GLOBAL_SITE_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getGoogleGlobalSiteTag().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.RemarketingSetting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.resources.RemarketingSetting prototype) {
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
   * Remarketing setting for a customer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.resources.RemarketingSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.resources.RemarketingSetting)
      com.google.ads.googleads.v2.resources.RemarketingSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.resources.CustomerProto.internal_static_google_ads_googleads_v2_resources_RemarketingSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.resources.CustomerProto.internal_static_google_ads_googleads_v2_resources_RemarketingSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.resources.RemarketingSetting.class, com.google.ads.googleads.v2.resources.RemarketingSetting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.resources.RemarketingSetting.newBuilder()
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
      if (googleGlobalSiteTagBuilder_ == null) {
        googleGlobalSiteTag_ = null;
      } else {
        googleGlobalSiteTag_ = null;
        googleGlobalSiteTagBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.resources.CustomerProto.internal_static_google_ads_googleads_v2_resources_RemarketingSetting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.RemarketingSetting getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.resources.RemarketingSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.RemarketingSetting build() {
      com.google.ads.googleads.v2.resources.RemarketingSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.RemarketingSetting buildPartial() {
      com.google.ads.googleads.v2.resources.RemarketingSetting result = new com.google.ads.googleads.v2.resources.RemarketingSetting(this);
      if (googleGlobalSiteTagBuilder_ == null) {
        result.googleGlobalSiteTag_ = googleGlobalSiteTag_;
      } else {
        result.googleGlobalSiteTag_ = googleGlobalSiteTagBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.resources.RemarketingSetting) {
        return mergeFrom((com.google.ads.googleads.v2.resources.RemarketingSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.resources.RemarketingSetting other) {
      if (other == com.google.ads.googleads.v2.resources.RemarketingSetting.getDefaultInstance()) return this;
      if (other.hasGoogleGlobalSiteTag()) {
        mergeGoogleGlobalSiteTag(other.getGoogleGlobalSiteTag());
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
      com.google.ads.googleads.v2.resources.RemarketingSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.resources.RemarketingSetting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue googleGlobalSiteTag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> googleGlobalSiteTagBuilder_;
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public boolean hasGoogleGlobalSiteTag() {
      return googleGlobalSiteTagBuilder_ != null || googleGlobalSiteTag_ != null;
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public com.google.protobuf.StringValue getGoogleGlobalSiteTag() {
      if (googleGlobalSiteTagBuilder_ == null) {
        return googleGlobalSiteTag_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : googleGlobalSiteTag_;
      } else {
        return googleGlobalSiteTagBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public Builder setGoogleGlobalSiteTag(com.google.protobuf.StringValue value) {
      if (googleGlobalSiteTagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        googleGlobalSiteTag_ = value;
        onChanged();
      } else {
        googleGlobalSiteTagBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public Builder setGoogleGlobalSiteTag(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (googleGlobalSiteTagBuilder_ == null) {
        googleGlobalSiteTag_ = builderForValue.build();
        onChanged();
      } else {
        googleGlobalSiteTagBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public Builder mergeGoogleGlobalSiteTag(com.google.protobuf.StringValue value) {
      if (googleGlobalSiteTagBuilder_ == null) {
        if (googleGlobalSiteTag_ != null) {
          googleGlobalSiteTag_ =
            com.google.protobuf.StringValue.newBuilder(googleGlobalSiteTag_).mergeFrom(value).buildPartial();
        } else {
          googleGlobalSiteTag_ = value;
        }
        onChanged();
      } else {
        googleGlobalSiteTagBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public Builder clearGoogleGlobalSiteTag() {
      if (googleGlobalSiteTagBuilder_ == null) {
        googleGlobalSiteTag_ = null;
        onChanged();
      } else {
        googleGlobalSiteTag_ = null;
        googleGlobalSiteTagBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getGoogleGlobalSiteTagBuilder() {
      
      onChanged();
      return getGoogleGlobalSiteTagFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getGoogleGlobalSiteTagOrBuilder() {
      if (googleGlobalSiteTagBuilder_ != null) {
        return googleGlobalSiteTagBuilder_.getMessageOrBuilder();
      } else {
        return googleGlobalSiteTag_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : googleGlobalSiteTag_;
      }
    }
    /**
     * <pre>
     * The Google global site tag.
     * </pre>
     *
     * <code>.google.protobuf.StringValue google_global_site_tag = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getGoogleGlobalSiteTagFieldBuilder() {
      if (googleGlobalSiteTagBuilder_ == null) {
        googleGlobalSiteTagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getGoogleGlobalSiteTag(),
                getParentForChildren(),
                isClean());
        googleGlobalSiteTag_ = null;
      }
      return googleGlobalSiteTagBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.resources.RemarketingSetting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.RemarketingSetting)
  private static final com.google.ads.googleads.v2.resources.RemarketingSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.resources.RemarketingSetting();
  }

  public static com.google.ads.googleads.v2.resources.RemarketingSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemarketingSetting>
      PARSER = new com.google.protobuf.AbstractParser<RemarketingSetting>() {
    @java.lang.Override
    public RemarketingSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemarketingSetting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemarketingSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemarketingSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.resources.RemarketingSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

