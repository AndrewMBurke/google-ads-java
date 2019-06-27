// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/ad_type_infos.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Product video specific data.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.ProductVideo}
 */
public  final class ProductVideo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.ProductVideo)
    ProductVideoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductVideo.newBuilder() to construct.
  private ProductVideo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductVideo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductVideo(
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
            if (productVideo_ != null) {
              subBuilder = productVideo_.toBuilder();
            }
            productVideo_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(productVideo_);
              productVideo_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_ProductVideo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_ProductVideo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.ProductVideo.class, com.google.ads.googleads.v1.common.ProductVideo.Builder.class);
  }

  public static final int PRODUCT_VIDEO_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue productVideo_;
  /**
   * <pre>
   * The MediaFile resource name of a video which must be hosted on YouTube.
   * </pre>
   *
   * <code>.google.protobuf.StringValue product_video = 1;</code>
   */
  public boolean hasProductVideo() {
    return productVideo_ != null;
  }
  /**
   * <pre>
   * The MediaFile resource name of a video which must be hosted on YouTube.
   * </pre>
   *
   * <code>.google.protobuf.StringValue product_video = 1;</code>
   */
  public com.google.protobuf.StringValue getProductVideo() {
    return productVideo_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : productVideo_;
  }
  /**
   * <pre>
   * The MediaFile resource name of a video which must be hosted on YouTube.
   * </pre>
   *
   * <code>.google.protobuf.StringValue product_video = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getProductVideoOrBuilder() {
    return getProductVideo();
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
    if (productVideo_ != null) {
      output.writeMessage(1, getProductVideo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (productVideo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProductVideo());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.ProductVideo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.ProductVideo other = (com.google.ads.googleads.v1.common.ProductVideo) obj;

    if (hasProductVideo() != other.hasProductVideo()) return false;
    if (hasProductVideo()) {
      if (!getProductVideo()
          .equals(other.getProductVideo())) return false;
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
    if (hasProductVideo()) {
      hash = (37 * hash) + PRODUCT_VIDEO_FIELD_NUMBER;
      hash = (53 * hash) + getProductVideo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductVideo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.ProductVideo prototype) {
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
   * Product video specific data.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.ProductVideo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.ProductVideo)
      com.google.ads.googleads.v1.common.ProductVideoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_ProductVideo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_ProductVideo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.ProductVideo.class, com.google.ads.googleads.v1.common.ProductVideo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.ProductVideo.newBuilder()
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
      if (productVideoBuilder_ == null) {
        productVideo_ = null;
      } else {
        productVideo_ = null;
        productVideoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.AdTypeInfosProto.internal_static_google_ads_googleads_v1_common_ProductVideo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductVideo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.ProductVideo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductVideo build() {
      com.google.ads.googleads.v1.common.ProductVideo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductVideo buildPartial() {
      com.google.ads.googleads.v1.common.ProductVideo result = new com.google.ads.googleads.v1.common.ProductVideo(this);
      if (productVideoBuilder_ == null) {
        result.productVideo_ = productVideo_;
      } else {
        result.productVideo_ = productVideoBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.ProductVideo) {
        return mergeFrom((com.google.ads.googleads.v1.common.ProductVideo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.ProductVideo other) {
      if (other == com.google.ads.googleads.v1.common.ProductVideo.getDefaultInstance()) return this;
      if (other.hasProductVideo()) {
        mergeProductVideo(other.getProductVideo());
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
      com.google.ads.googleads.v1.common.ProductVideo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.ProductVideo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue productVideo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> productVideoBuilder_;
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public boolean hasProductVideo() {
      return productVideoBuilder_ != null || productVideo_ != null;
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public com.google.protobuf.StringValue getProductVideo() {
      if (productVideoBuilder_ == null) {
        return productVideo_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : productVideo_;
      } else {
        return productVideoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public Builder setProductVideo(com.google.protobuf.StringValue value) {
      if (productVideoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productVideo_ = value;
        onChanged();
      } else {
        productVideoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public Builder setProductVideo(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (productVideoBuilder_ == null) {
        productVideo_ = builderForValue.build();
        onChanged();
      } else {
        productVideoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public Builder mergeProductVideo(com.google.protobuf.StringValue value) {
      if (productVideoBuilder_ == null) {
        if (productVideo_ != null) {
          productVideo_ =
            com.google.protobuf.StringValue.newBuilder(productVideo_).mergeFrom(value).buildPartial();
        } else {
          productVideo_ = value;
        }
        onChanged();
      } else {
        productVideoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public Builder clearProductVideo() {
      if (productVideoBuilder_ == null) {
        productVideo_ = null;
        onChanged();
      } else {
        productVideo_ = null;
        productVideoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getProductVideoBuilder() {
      
      onChanged();
      return getProductVideoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getProductVideoOrBuilder() {
      if (productVideoBuilder_ != null) {
        return productVideoBuilder_.getMessageOrBuilder();
      } else {
        return productVideo_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : productVideo_;
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of a video which must be hosted on YouTube.
     * </pre>
     *
     * <code>.google.protobuf.StringValue product_video = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getProductVideoFieldBuilder() {
      if (productVideoBuilder_ == null) {
        productVideoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getProductVideo(),
                getParentForChildren(),
                isClean());
        productVideo_ = null;
      }
      return productVideoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.ProductVideo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.ProductVideo)
  private static final com.google.ads.googleads.v1.common.ProductVideo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.ProductVideo();
  }

  public static com.google.ads.googleads.v1.common.ProductVideo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductVideo>
      PARSER = new com.google.protobuf.AbstractParser<ProductVideo>() {
    @java.lang.Override
    public ProductVideo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductVideo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductVideo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductVideo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.ProductVideo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

