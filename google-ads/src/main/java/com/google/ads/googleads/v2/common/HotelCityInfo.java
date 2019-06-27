// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * City the hotel is located in.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.HotelCityInfo}
 */
public  final class HotelCityInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.HotelCityInfo)
    HotelCityInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelCityInfo.newBuilder() to construct.
  private HotelCityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelCityInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotelCityInfo(
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
            if (cityCriterion_ != null) {
              subBuilder = cityCriterion_.toBuilder();
            }
            cityCriterion_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cityCriterion_);
              cityCriterion_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_HotelCityInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_HotelCityInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.HotelCityInfo.class, com.google.ads.googleads.v2.common.HotelCityInfo.Builder.class);
  }

  public static final int CITY_CRITERION_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue cityCriterion_;
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue city_criterion = 1;</code>
   */
  public boolean hasCityCriterion() {
    return cityCriterion_ != null;
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue city_criterion = 1;</code>
   */
  public com.google.protobuf.StringValue getCityCriterion() {
    return cityCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : cityCriterion_;
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue city_criterion = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getCityCriterionOrBuilder() {
    return getCityCriterion();
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
    if (cityCriterion_ != null) {
      output.writeMessage(1, getCityCriterion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cityCriterion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCityCriterion());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.HotelCityInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.HotelCityInfo other = (com.google.ads.googleads.v2.common.HotelCityInfo) obj;

    if (hasCityCriterion() != other.hasCityCriterion()) return false;
    if (hasCityCriterion()) {
      if (!getCityCriterion()
          .equals(other.getCityCriterion())) return false;
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
    if (hasCityCriterion()) {
      hash = (37 * hash) + CITY_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getCityCriterion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.HotelCityInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.HotelCityInfo prototype) {
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
   * City the hotel is located in.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.HotelCityInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.HotelCityInfo)
      com.google.ads.googleads.v2.common.HotelCityInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_HotelCityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_HotelCityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.HotelCityInfo.class, com.google.ads.googleads.v2.common.HotelCityInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.HotelCityInfo.newBuilder()
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
      if (cityCriterionBuilder_ == null) {
        cityCriterion_ = null;
      } else {
        cityCriterion_ = null;
        cityCriterionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_HotelCityInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.HotelCityInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.HotelCityInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.HotelCityInfo build() {
      com.google.ads.googleads.v2.common.HotelCityInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.HotelCityInfo buildPartial() {
      com.google.ads.googleads.v2.common.HotelCityInfo result = new com.google.ads.googleads.v2.common.HotelCityInfo(this);
      if (cityCriterionBuilder_ == null) {
        result.cityCriterion_ = cityCriterion_;
      } else {
        result.cityCriterion_ = cityCriterionBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.HotelCityInfo) {
        return mergeFrom((com.google.ads.googleads.v2.common.HotelCityInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.HotelCityInfo other) {
      if (other == com.google.ads.googleads.v2.common.HotelCityInfo.getDefaultInstance()) return this;
      if (other.hasCityCriterion()) {
        mergeCityCriterion(other.getCityCriterion());
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
      com.google.ads.googleads.v2.common.HotelCityInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.HotelCityInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue cityCriterion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> cityCriterionBuilder_;
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public boolean hasCityCriterion() {
      return cityCriterionBuilder_ != null || cityCriterion_ != null;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public com.google.protobuf.StringValue getCityCriterion() {
      if (cityCriterionBuilder_ == null) {
        return cityCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : cityCriterion_;
      } else {
        return cityCriterionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public Builder setCityCriterion(com.google.protobuf.StringValue value) {
      if (cityCriterionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cityCriterion_ = value;
        onChanged();
      } else {
        cityCriterionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public Builder setCityCriterion(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (cityCriterionBuilder_ == null) {
        cityCriterion_ = builderForValue.build();
        onChanged();
      } else {
        cityCriterionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public Builder mergeCityCriterion(com.google.protobuf.StringValue value) {
      if (cityCriterionBuilder_ == null) {
        if (cityCriterion_ != null) {
          cityCriterion_ =
            com.google.protobuf.StringValue.newBuilder(cityCriterion_).mergeFrom(value).buildPartial();
        } else {
          cityCriterion_ = value;
        }
        onChanged();
      } else {
        cityCriterionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public Builder clearCityCriterion() {
      if (cityCriterionBuilder_ == null) {
        cityCriterion_ = null;
        onChanged();
      } else {
        cityCriterion_ = null;
        cityCriterionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getCityCriterionBuilder() {
      
      onChanged();
      return getCityCriterionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCityCriterionOrBuilder() {
      if (cityCriterionBuilder_ != null) {
        return cityCriterionBuilder_.getMessageOrBuilder();
      } else {
        return cityCriterion_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : cityCriterion_;
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue city_criterion = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCityCriterionFieldBuilder() {
      if (cityCriterionBuilder_ == null) {
        cityCriterionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCityCriterion(),
                getParentForChildren(),
                isClean());
        cityCriterion_ = null;
      }
      return cityCriterionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.HotelCityInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.HotelCityInfo)
  private static final com.google.ads.googleads.v2.common.HotelCityInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.HotelCityInfo();
  }

  public static com.google.ads.googleads.v2.common.HotelCityInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelCityInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelCityInfo>() {
    @java.lang.Override
    public HotelCityInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotelCityInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelCityInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelCityInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.HotelCityInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

