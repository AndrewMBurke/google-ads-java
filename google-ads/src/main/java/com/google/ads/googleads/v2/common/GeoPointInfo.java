// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * Geo point for proximity criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.GeoPointInfo}
 */
public  final class GeoPointInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.GeoPointInfo)
    GeoPointInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeoPointInfo.newBuilder() to construct.
  private GeoPointInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeoPointInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GeoPointInfo(
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
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (longitudeInMicroDegrees_ != null) {
              subBuilder = longitudeInMicroDegrees_.toBuilder();
            }
            longitudeInMicroDegrees_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(longitudeInMicroDegrees_);
              longitudeInMicroDegrees_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (latitudeInMicroDegrees_ != null) {
              subBuilder = latitudeInMicroDegrees_.toBuilder();
            }
            latitudeInMicroDegrees_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(latitudeInMicroDegrees_);
              latitudeInMicroDegrees_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_GeoPointInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_GeoPointInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.GeoPointInfo.class, com.google.ads.googleads.v2.common.GeoPointInfo.Builder.class);
  }

  public static final int LONGITUDE_IN_MICRO_DEGREES_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value longitudeInMicroDegrees_;
  /**
   * <pre>
   * Micro degrees for the longitude.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
   */
  public boolean hasLongitudeInMicroDegrees() {
    return longitudeInMicroDegrees_ != null;
  }
  /**
   * <pre>
   * Micro degrees for the longitude.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
   */
  public com.google.protobuf.Int32Value getLongitudeInMicroDegrees() {
    return longitudeInMicroDegrees_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : longitudeInMicroDegrees_;
  }
  /**
   * <pre>
   * Micro degrees for the longitude.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getLongitudeInMicroDegreesOrBuilder() {
    return getLongitudeInMicroDegrees();
  }

  public static final int LATITUDE_IN_MICRO_DEGREES_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value latitudeInMicroDegrees_;
  /**
   * <pre>
   * Micro degrees for the latitude.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
   */
  public boolean hasLatitudeInMicroDegrees() {
    return latitudeInMicroDegrees_ != null;
  }
  /**
   * <pre>
   * Micro degrees for the latitude.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
   */
  public com.google.protobuf.Int32Value getLatitudeInMicroDegrees() {
    return latitudeInMicroDegrees_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : latitudeInMicroDegrees_;
  }
  /**
   * <pre>
   * Micro degrees for the latitude.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getLatitudeInMicroDegreesOrBuilder() {
    return getLatitudeInMicroDegrees();
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
    if (longitudeInMicroDegrees_ != null) {
      output.writeMessage(1, getLongitudeInMicroDegrees());
    }
    if (latitudeInMicroDegrees_ != null) {
      output.writeMessage(2, getLatitudeInMicroDegrees());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (longitudeInMicroDegrees_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLongitudeInMicroDegrees());
    }
    if (latitudeInMicroDegrees_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLatitudeInMicroDegrees());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.GeoPointInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.GeoPointInfo other = (com.google.ads.googleads.v2.common.GeoPointInfo) obj;

    if (hasLongitudeInMicroDegrees() != other.hasLongitudeInMicroDegrees()) return false;
    if (hasLongitudeInMicroDegrees()) {
      if (!getLongitudeInMicroDegrees()
          .equals(other.getLongitudeInMicroDegrees())) return false;
    }
    if (hasLatitudeInMicroDegrees() != other.hasLatitudeInMicroDegrees()) return false;
    if (hasLatitudeInMicroDegrees()) {
      if (!getLatitudeInMicroDegrees()
          .equals(other.getLatitudeInMicroDegrees())) return false;
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
    if (hasLongitudeInMicroDegrees()) {
      hash = (37 * hash) + LONGITUDE_IN_MICRO_DEGREES_FIELD_NUMBER;
      hash = (53 * hash) + getLongitudeInMicroDegrees().hashCode();
    }
    if (hasLatitudeInMicroDegrees()) {
      hash = (37 * hash) + LATITUDE_IN_MICRO_DEGREES_FIELD_NUMBER;
      hash = (53 * hash) + getLatitudeInMicroDegrees().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.GeoPointInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.GeoPointInfo prototype) {
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
   * Geo point for proximity criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.GeoPointInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.GeoPointInfo)
      com.google.ads.googleads.v2.common.GeoPointInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_GeoPointInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_GeoPointInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.GeoPointInfo.class, com.google.ads.googleads.v2.common.GeoPointInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.GeoPointInfo.newBuilder()
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
      if (longitudeInMicroDegreesBuilder_ == null) {
        longitudeInMicroDegrees_ = null;
      } else {
        longitudeInMicroDegrees_ = null;
        longitudeInMicroDegreesBuilder_ = null;
      }
      if (latitudeInMicroDegreesBuilder_ == null) {
        latitudeInMicroDegrees_ = null;
      } else {
        latitudeInMicroDegrees_ = null;
        latitudeInMicroDegreesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_GeoPointInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.GeoPointInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.GeoPointInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.GeoPointInfo build() {
      com.google.ads.googleads.v2.common.GeoPointInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.GeoPointInfo buildPartial() {
      com.google.ads.googleads.v2.common.GeoPointInfo result = new com.google.ads.googleads.v2.common.GeoPointInfo(this);
      if (longitudeInMicroDegreesBuilder_ == null) {
        result.longitudeInMicroDegrees_ = longitudeInMicroDegrees_;
      } else {
        result.longitudeInMicroDegrees_ = longitudeInMicroDegreesBuilder_.build();
      }
      if (latitudeInMicroDegreesBuilder_ == null) {
        result.latitudeInMicroDegrees_ = latitudeInMicroDegrees_;
      } else {
        result.latitudeInMicroDegrees_ = latitudeInMicroDegreesBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.GeoPointInfo) {
        return mergeFrom((com.google.ads.googleads.v2.common.GeoPointInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.GeoPointInfo other) {
      if (other == com.google.ads.googleads.v2.common.GeoPointInfo.getDefaultInstance()) return this;
      if (other.hasLongitudeInMicroDegrees()) {
        mergeLongitudeInMicroDegrees(other.getLongitudeInMicroDegrees());
      }
      if (other.hasLatitudeInMicroDegrees()) {
        mergeLatitudeInMicroDegrees(other.getLatitudeInMicroDegrees());
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
      com.google.ads.googleads.v2.common.GeoPointInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.GeoPointInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int32Value longitudeInMicroDegrees_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> longitudeInMicroDegreesBuilder_;
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public boolean hasLongitudeInMicroDegrees() {
      return longitudeInMicroDegreesBuilder_ != null || longitudeInMicroDegrees_ != null;
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public com.google.protobuf.Int32Value getLongitudeInMicroDegrees() {
      if (longitudeInMicroDegreesBuilder_ == null) {
        return longitudeInMicroDegrees_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : longitudeInMicroDegrees_;
      } else {
        return longitudeInMicroDegreesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public Builder setLongitudeInMicroDegrees(com.google.protobuf.Int32Value value) {
      if (longitudeInMicroDegreesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        longitudeInMicroDegrees_ = value;
        onChanged();
      } else {
        longitudeInMicroDegreesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public Builder setLongitudeInMicroDegrees(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (longitudeInMicroDegreesBuilder_ == null) {
        longitudeInMicroDegrees_ = builderForValue.build();
        onChanged();
      } else {
        longitudeInMicroDegreesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public Builder mergeLongitudeInMicroDegrees(com.google.protobuf.Int32Value value) {
      if (longitudeInMicroDegreesBuilder_ == null) {
        if (longitudeInMicroDegrees_ != null) {
          longitudeInMicroDegrees_ =
            com.google.protobuf.Int32Value.newBuilder(longitudeInMicroDegrees_).mergeFrom(value).buildPartial();
        } else {
          longitudeInMicroDegrees_ = value;
        }
        onChanged();
      } else {
        longitudeInMicroDegreesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public Builder clearLongitudeInMicroDegrees() {
      if (longitudeInMicroDegreesBuilder_ == null) {
        longitudeInMicroDegrees_ = null;
        onChanged();
      } else {
        longitudeInMicroDegrees_ = null;
        longitudeInMicroDegreesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public com.google.protobuf.Int32Value.Builder getLongitudeInMicroDegreesBuilder() {
      
      onChanged();
      return getLongitudeInMicroDegreesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getLongitudeInMicroDegreesOrBuilder() {
      if (longitudeInMicroDegreesBuilder_ != null) {
        return longitudeInMicroDegreesBuilder_.getMessageOrBuilder();
      } else {
        return longitudeInMicroDegrees_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : longitudeInMicroDegrees_;
      }
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value longitude_in_micro_degrees = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getLongitudeInMicroDegreesFieldBuilder() {
      if (longitudeInMicroDegreesBuilder_ == null) {
        longitudeInMicroDegreesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getLongitudeInMicroDegrees(),
                getParentForChildren(),
                isClean());
        longitudeInMicroDegrees_ = null;
      }
      return longitudeInMicroDegreesBuilder_;
    }

    private com.google.protobuf.Int32Value latitudeInMicroDegrees_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> latitudeInMicroDegreesBuilder_;
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public boolean hasLatitudeInMicroDegrees() {
      return latitudeInMicroDegreesBuilder_ != null || latitudeInMicroDegrees_ != null;
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public com.google.protobuf.Int32Value getLatitudeInMicroDegrees() {
      if (latitudeInMicroDegreesBuilder_ == null) {
        return latitudeInMicroDegrees_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : latitudeInMicroDegrees_;
      } else {
        return latitudeInMicroDegreesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public Builder setLatitudeInMicroDegrees(com.google.protobuf.Int32Value value) {
      if (latitudeInMicroDegreesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        latitudeInMicroDegrees_ = value;
        onChanged();
      } else {
        latitudeInMicroDegreesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public Builder setLatitudeInMicroDegrees(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (latitudeInMicroDegreesBuilder_ == null) {
        latitudeInMicroDegrees_ = builderForValue.build();
        onChanged();
      } else {
        latitudeInMicroDegreesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public Builder mergeLatitudeInMicroDegrees(com.google.protobuf.Int32Value value) {
      if (latitudeInMicroDegreesBuilder_ == null) {
        if (latitudeInMicroDegrees_ != null) {
          latitudeInMicroDegrees_ =
            com.google.protobuf.Int32Value.newBuilder(latitudeInMicroDegrees_).mergeFrom(value).buildPartial();
        } else {
          latitudeInMicroDegrees_ = value;
        }
        onChanged();
      } else {
        latitudeInMicroDegreesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public Builder clearLatitudeInMicroDegrees() {
      if (latitudeInMicroDegreesBuilder_ == null) {
        latitudeInMicroDegrees_ = null;
        onChanged();
      } else {
        latitudeInMicroDegrees_ = null;
        latitudeInMicroDegreesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public com.google.protobuf.Int32Value.Builder getLatitudeInMicroDegreesBuilder() {
      
      onChanged();
      return getLatitudeInMicroDegreesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getLatitudeInMicroDegreesOrBuilder() {
      if (latitudeInMicroDegreesBuilder_ != null) {
        return latitudeInMicroDegreesBuilder_.getMessageOrBuilder();
      } else {
        return latitudeInMicroDegrees_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : latitudeInMicroDegrees_;
      }
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value latitude_in_micro_degrees = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getLatitudeInMicroDegreesFieldBuilder() {
      if (latitudeInMicroDegreesBuilder_ == null) {
        latitudeInMicroDegreesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getLatitudeInMicroDegrees(),
                getParentForChildren(),
                isClean());
        latitudeInMicroDegrees_ = null;
      }
      return latitudeInMicroDegreesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.GeoPointInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.GeoPointInfo)
  private static final com.google.ads.googleads.v2.common.GeoPointInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.GeoPointInfo();
  }

  public static com.google.ads.googleads.v2.common.GeoPointInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeoPointInfo>
      PARSER = new com.google.protobuf.AbstractParser<GeoPointInfo>() {
    @java.lang.Override
    public GeoPointInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GeoPointInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GeoPointInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeoPointInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.GeoPointInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

