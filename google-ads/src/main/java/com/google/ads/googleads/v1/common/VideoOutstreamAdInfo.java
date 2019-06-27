// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/ad_type_infos.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Representation of video out-stream ad format (ad shown alongside a feed
 * with automatic playback, without sound).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.VideoOutstreamAdInfo}
 */
public  final class VideoOutstreamAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.VideoOutstreamAdInfo)
    VideoOutstreamAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoOutstreamAdInfo.newBuilder() to construct.
  private VideoOutstreamAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoOutstreamAdInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VideoOutstreamAdInfo(
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
            if (headline_ != null) {
              subBuilder = headline_.toBuilder();
            }
            headline_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(headline_);
              headline_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (description_ != null) {
              subBuilder = description_.toBuilder();
            }
            description_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description_);
              description_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_VideoOutstreamAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_VideoOutstreamAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.VideoOutstreamAdInfo.class, com.google.ads.googleads.v1.common.VideoOutstreamAdInfo.Builder.class);
  }

  public static final int HEADLINE_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue headline_;
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  public boolean hasHeadline() {
    return headline_ != null;
  }
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  public com.google.protobuf.StringValue getHeadline() {
    return headline_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : headline_;
  }
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder() {
    return getHeadline();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue description_;
  /**
   * <pre>
   * The description line.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  public boolean hasDescription() {
    return description_ != null;
  }
  /**
   * <pre>
   * The description line.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  public com.google.protobuf.StringValue getDescription() {
    return description_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description_;
  }
  /**
   * <pre>
   * The description line.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder() {
    return getDescription();
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
    if (headline_ != null) {
      output.writeMessage(1, getHeadline());
    }
    if (description_ != null) {
      output.writeMessage(2, getDescription());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (headline_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeadline());
    }
    if (description_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDescription());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.VideoOutstreamAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.VideoOutstreamAdInfo other = (com.google.ads.googleads.v1.common.VideoOutstreamAdInfo) obj;

    if (hasHeadline() != other.hasHeadline()) return false;
    if (hasHeadline()) {
      if (!getHeadline()
          .equals(other.getHeadline())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
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
    if (hasHeadline()) {
      hash = (37 * hash) + HEADLINE_FIELD_NUMBER;
      hash = (53 * hash) + getHeadline().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.VideoOutstreamAdInfo prototype) {
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
   * Representation of video out-stream ad format (ad shown alongside a feed
   * with automatic playback, without sound).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.VideoOutstreamAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.VideoOutstreamAdInfo)
      com.google.ads.googleads.v1.common.VideoOutstreamAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_VideoOutstreamAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_VideoOutstreamAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.VideoOutstreamAdInfo.class, com.google.ads.googleads.v1.common.VideoOutstreamAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.VideoOutstreamAdInfo.newBuilder()
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
      if (headlineBuilder_ == null) {
        headline_ = null;
      } else {
        headline_ = null;
        headlineBuilder_ = null;
      }
      if (descriptionBuilder_ == null) {
        description_ = null;
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_VideoOutstreamAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.VideoOutstreamAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.VideoOutstreamAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.VideoOutstreamAdInfo build() {
      com.google.ads.googleads.v1.common.VideoOutstreamAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.VideoOutstreamAdInfo buildPartial() {
      com.google.ads.googleads.v1.common.VideoOutstreamAdInfo result = new com.google.ads.googleads.v1.common.VideoOutstreamAdInfo(this);
      if (headlineBuilder_ == null) {
        result.headline_ = headline_;
      } else {
        result.headline_ = headlineBuilder_.build();
      }
      if (descriptionBuilder_ == null) {
        result.description_ = description_;
      } else {
        result.description_ = descriptionBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.VideoOutstreamAdInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.VideoOutstreamAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.VideoOutstreamAdInfo other) {
      if (other == com.google.ads.googleads.v1.common.VideoOutstreamAdInfo.getDefaultInstance()) return this;
      if (other.hasHeadline()) {
        mergeHeadline(other.getHeadline());
      }
      if (other.hasDescription()) {
        mergeDescription(other.getDescription());
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
      com.google.ads.googleads.v1.common.VideoOutstreamAdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.VideoOutstreamAdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue headline_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> headlineBuilder_;
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public boolean hasHeadline() {
      return headlineBuilder_ != null || headline_ != null;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValue getHeadline() {
      if (headlineBuilder_ == null) {
        return headline_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : headline_;
      } else {
        return headlineBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder setHeadline(com.google.protobuf.StringValue value) {
      if (headlineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        headline_ = value;
        onChanged();
      } else {
        headlineBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder setHeadline(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (headlineBuilder_ == null) {
        headline_ = builderForValue.build();
        onChanged();
      } else {
        headlineBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder mergeHeadline(com.google.protobuf.StringValue value) {
      if (headlineBuilder_ == null) {
        if (headline_ != null) {
          headline_ =
            com.google.protobuf.StringValue.newBuilder(headline_).mergeFrom(value).buildPartial();
        } else {
          headline_ = value;
        }
        onChanged();
      } else {
        headlineBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder clearHeadline() {
      if (headlineBuilder_ == null) {
        headline_ = null;
        onChanged();
      } else {
        headline_ = null;
        headlineBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getHeadlineBuilder() {
      
      onChanged();
      return getHeadlineFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder() {
      if (headlineBuilder_ != null) {
        return headlineBuilder_.getMessageOrBuilder();
      } else {
        return headline_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : headline_;
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getHeadlineFieldBuilder() {
      if (headlineBuilder_ == null) {
        headlineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getHeadline(),
                getParentForChildren(),
                isClean());
        headline_ = null;
      }
      return headlineBuilder_;
    }

    private com.google.protobuf.StringValue description_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> descriptionBuilder_;
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public boolean hasDescription() {
      return descriptionBuilder_ != null || description_ != null;
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public com.google.protobuf.StringValue getDescription() {
      if (descriptionBuilder_ == null) {
        return description_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description_;
      } else {
        return descriptionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder setDescription(com.google.protobuf.StringValue value) {
      if (descriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description_ = value;
        onChanged();
      } else {
        descriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder setDescription(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (descriptionBuilder_ == null) {
        description_ = builderForValue.build();
        onChanged();
      } else {
        descriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder mergeDescription(com.google.protobuf.StringValue value) {
      if (descriptionBuilder_ == null) {
        if (description_ != null) {
          description_ =
            com.google.protobuf.StringValue.newBuilder(description_).mergeFrom(value).buildPartial();
        } else {
          description_ = value;
        }
        onChanged();
      } else {
        descriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder clearDescription() {
      if (descriptionBuilder_ == null) {
        description_ = null;
        onChanged();
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getDescriptionBuilder() {
      
      onChanged();
      return getDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder() {
      if (descriptionBuilder_ != null) {
        return descriptionBuilder_.getMessageOrBuilder();
      } else {
        return description_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : description_;
      }
    }
    /**
     * <pre>
     * The description line.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescriptionFieldBuilder() {
      if (descriptionBuilder_ == null) {
        descriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDescription(),
                getParentForChildren(),
                isClean());
        description_ = null;
      }
      return descriptionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.VideoOutstreamAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.VideoOutstreamAdInfo)
  private static final com.google.ads.googleads.v1.common.VideoOutstreamAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.VideoOutstreamAdInfo();
  }

  public static com.google.ads.googleads.v1.common.VideoOutstreamAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoOutstreamAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<VideoOutstreamAdInfo>() {
    @java.lang.Override
    public VideoOutstreamAdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VideoOutstreamAdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoOutstreamAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoOutstreamAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.VideoOutstreamAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

