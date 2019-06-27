// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/asset_types.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * A YouTube asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.YoutubeVideoAsset}
 */
public  final class YoutubeVideoAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.YoutubeVideoAsset)
    YoutubeVideoAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YoutubeVideoAsset.newBuilder() to construct.
  private YoutubeVideoAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YoutubeVideoAsset() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private YoutubeVideoAsset(
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
            if (youtubeVideoId_ != null) {
              subBuilder = youtubeVideoId_.toBuilder();
            }
            youtubeVideoId_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(youtubeVideoId_);
              youtubeVideoId_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.AssetTypesProto.internal_static_google_ads_googleads_v2_common_YoutubeVideoAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.AssetTypesProto.internal_static_google_ads_googleads_v2_common_YoutubeVideoAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.YoutubeVideoAsset.class, com.google.ads.googleads.v2.common.YoutubeVideoAsset.Builder.class);
  }

  public static final int YOUTUBE_VIDEO_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue youtubeVideoId_;
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
   */
  public boolean hasYoutubeVideoId() {
    return youtubeVideoId_ != null;
  }
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
   */
  public com.google.protobuf.StringValue getYoutubeVideoId() {
    return youtubeVideoId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : youtubeVideoId_;
  }
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getYoutubeVideoIdOrBuilder() {
    return getYoutubeVideoId();
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
    if (youtubeVideoId_ != null) {
      output.writeMessage(1, getYoutubeVideoId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (youtubeVideoId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getYoutubeVideoId());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.YoutubeVideoAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.YoutubeVideoAsset other = (com.google.ads.googleads.v2.common.YoutubeVideoAsset) obj;

    if (hasYoutubeVideoId() != other.hasYoutubeVideoId()) return false;
    if (hasYoutubeVideoId()) {
      if (!getYoutubeVideoId()
          .equals(other.getYoutubeVideoId())) return false;
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
    if (hasYoutubeVideoId()) {
      hash = (37 * hash) + YOUTUBE_VIDEO_ID_FIELD_NUMBER;
      hash = (53 * hash) + getYoutubeVideoId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.YoutubeVideoAsset prototype) {
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
   * A YouTube asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.YoutubeVideoAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.YoutubeVideoAsset)
      com.google.ads.googleads.v2.common.YoutubeVideoAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.AssetTypesProto.internal_static_google_ads_googleads_v2_common_YoutubeVideoAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.AssetTypesProto.internal_static_google_ads_googleads_v2_common_YoutubeVideoAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.YoutubeVideoAsset.class, com.google.ads.googleads.v2.common.YoutubeVideoAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.YoutubeVideoAsset.newBuilder()
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
      if (youtubeVideoIdBuilder_ == null) {
        youtubeVideoId_ = null;
      } else {
        youtubeVideoId_ = null;
        youtubeVideoIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.AssetTypesProto.internal_static_google_ads_googleads_v2_common_YoutubeVideoAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.YoutubeVideoAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.YoutubeVideoAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.YoutubeVideoAsset build() {
      com.google.ads.googleads.v2.common.YoutubeVideoAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.YoutubeVideoAsset buildPartial() {
      com.google.ads.googleads.v2.common.YoutubeVideoAsset result = new com.google.ads.googleads.v2.common.YoutubeVideoAsset(this);
      if (youtubeVideoIdBuilder_ == null) {
        result.youtubeVideoId_ = youtubeVideoId_;
      } else {
        result.youtubeVideoId_ = youtubeVideoIdBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.YoutubeVideoAsset) {
        return mergeFrom((com.google.ads.googleads.v2.common.YoutubeVideoAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.YoutubeVideoAsset other) {
      if (other == com.google.ads.googleads.v2.common.YoutubeVideoAsset.getDefaultInstance()) return this;
      if (other.hasYoutubeVideoId()) {
        mergeYoutubeVideoId(other.getYoutubeVideoId());
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
      com.google.ads.googleads.v2.common.YoutubeVideoAsset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.YoutubeVideoAsset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue youtubeVideoId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> youtubeVideoIdBuilder_;
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public boolean hasYoutubeVideoId() {
      return youtubeVideoIdBuilder_ != null || youtubeVideoId_ != null;
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public com.google.protobuf.StringValue getYoutubeVideoId() {
      if (youtubeVideoIdBuilder_ == null) {
        return youtubeVideoId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : youtubeVideoId_;
      } else {
        return youtubeVideoIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public Builder setYoutubeVideoId(com.google.protobuf.StringValue value) {
      if (youtubeVideoIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        youtubeVideoId_ = value;
        onChanged();
      } else {
        youtubeVideoIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public Builder setYoutubeVideoId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (youtubeVideoIdBuilder_ == null) {
        youtubeVideoId_ = builderForValue.build();
        onChanged();
      } else {
        youtubeVideoIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public Builder mergeYoutubeVideoId(com.google.protobuf.StringValue value) {
      if (youtubeVideoIdBuilder_ == null) {
        if (youtubeVideoId_ != null) {
          youtubeVideoId_ =
            com.google.protobuf.StringValue.newBuilder(youtubeVideoId_).mergeFrom(value).buildPartial();
        } else {
          youtubeVideoId_ = value;
        }
        onChanged();
      } else {
        youtubeVideoIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public Builder clearYoutubeVideoId() {
      if (youtubeVideoIdBuilder_ == null) {
        youtubeVideoId_ = null;
        onChanged();
      } else {
        youtubeVideoId_ = null;
        youtubeVideoIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getYoutubeVideoIdBuilder() {
      
      onChanged();
      return getYoutubeVideoIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getYoutubeVideoIdOrBuilder() {
      if (youtubeVideoIdBuilder_ != null) {
        return youtubeVideoIdBuilder_.getMessageOrBuilder();
      } else {
        return youtubeVideoId_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : youtubeVideoId_;
      }
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue youtube_video_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getYoutubeVideoIdFieldBuilder() {
      if (youtubeVideoIdBuilder_ == null) {
        youtubeVideoIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getYoutubeVideoId(),
                getParentForChildren(),
                isClean());
        youtubeVideoId_ = null;
      }
      return youtubeVideoIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.YoutubeVideoAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.YoutubeVideoAsset)
  private static final com.google.ads.googleads.v2.common.YoutubeVideoAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.YoutubeVideoAsset();
  }

  public static com.google.ads.googleads.v2.common.YoutubeVideoAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YoutubeVideoAsset>
      PARSER = new com.google.protobuf.AbstractParser<YoutubeVideoAsset>() {
    @java.lang.Override
    public YoutubeVideoAsset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new YoutubeVideoAsset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<YoutubeVideoAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YoutubeVideoAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.YoutubeVideoAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

