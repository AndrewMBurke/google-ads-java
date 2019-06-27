// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/bidding.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * Commission is an automatic bidding strategy in which the advertiser pays a
 * certain portion of the conversion value.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.Commission}
 */
public  final class Commission extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.Commission)
    CommissionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Commission.newBuilder() to construct.
  private Commission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Commission() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Commission(
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (commissionRateMicros_ != null) {
              subBuilder = commissionRateMicros_.toBuilder();
            }
            commissionRateMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commissionRateMicros_);
              commissionRateMicros_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_Commission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_Commission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.Commission.class, com.google.ads.googleads.v2.common.Commission.Builder.class);
  }

  public static final int COMMISSION_RATE_MICROS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value commissionRateMicros_;
  /**
   * <pre>
   * Commission rate defines the portion of the conversion value that the
   * advertiser will be billed. A commission rate of x should be passed into
   * this field as (x * 1,000,000). For example, 106,000 represents a commission
   * rate of 0.106 (10.6%).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
   */
  public boolean hasCommissionRateMicros() {
    return commissionRateMicros_ != null;
  }
  /**
   * <pre>
   * Commission rate defines the portion of the conversion value that the
   * advertiser will be billed. A commission rate of x should be passed into
   * this field as (x * 1,000,000). For example, 106,000 represents a commission
   * rate of 0.106 (10.6%).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
   */
  public com.google.protobuf.Int64Value getCommissionRateMicros() {
    return commissionRateMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : commissionRateMicros_;
  }
  /**
   * <pre>
   * Commission rate defines the portion of the conversion value that the
   * advertiser will be billed. A commission rate of x should be passed into
   * this field as (x * 1,000,000). For example, 106,000 represents a commission
   * rate of 0.106 (10.6%).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getCommissionRateMicrosOrBuilder() {
    return getCommissionRateMicros();
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
    if (commissionRateMicros_ != null) {
      output.writeMessage(1, getCommissionRateMicros());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commissionRateMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommissionRateMicros());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.Commission)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.Commission other = (com.google.ads.googleads.v2.common.Commission) obj;

    if (hasCommissionRateMicros() != other.hasCommissionRateMicros()) return false;
    if (hasCommissionRateMicros()) {
      if (!getCommissionRateMicros()
          .equals(other.getCommissionRateMicros())) return false;
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
    if (hasCommissionRateMicros()) {
      hash = (37 * hash) + COMMISSION_RATE_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getCommissionRateMicros().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.Commission parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.Commission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.Commission parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.Commission parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.Commission prototype) {
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
   * Commission is an automatic bidding strategy in which the advertiser pays a
   * certain portion of the conversion value.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.Commission}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.Commission)
      com.google.ads.googleads.v2.common.CommissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_Commission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_Commission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.Commission.class, com.google.ads.googleads.v2.common.Commission.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.Commission.newBuilder()
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
      if (commissionRateMicrosBuilder_ == null) {
        commissionRateMicros_ = null;
      } else {
        commissionRateMicros_ = null;
        commissionRateMicrosBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_Commission_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.Commission getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.Commission.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.Commission build() {
      com.google.ads.googleads.v2.common.Commission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.Commission buildPartial() {
      com.google.ads.googleads.v2.common.Commission result = new com.google.ads.googleads.v2.common.Commission(this);
      if (commissionRateMicrosBuilder_ == null) {
        result.commissionRateMicros_ = commissionRateMicros_;
      } else {
        result.commissionRateMicros_ = commissionRateMicrosBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.Commission) {
        return mergeFrom((com.google.ads.googleads.v2.common.Commission)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.Commission other) {
      if (other == com.google.ads.googleads.v2.common.Commission.getDefaultInstance()) return this;
      if (other.hasCommissionRateMicros()) {
        mergeCommissionRateMicros(other.getCommissionRateMicros());
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
      com.google.ads.googleads.v2.common.Commission parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.Commission) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value commissionRateMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> commissionRateMicrosBuilder_;
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public boolean hasCommissionRateMicros() {
      return commissionRateMicrosBuilder_ != null || commissionRateMicros_ != null;
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public com.google.protobuf.Int64Value getCommissionRateMicros() {
      if (commissionRateMicrosBuilder_ == null) {
        return commissionRateMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : commissionRateMicros_;
      } else {
        return commissionRateMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public Builder setCommissionRateMicros(com.google.protobuf.Int64Value value) {
      if (commissionRateMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commissionRateMicros_ = value;
        onChanged();
      } else {
        commissionRateMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public Builder setCommissionRateMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (commissionRateMicrosBuilder_ == null) {
        commissionRateMicros_ = builderForValue.build();
        onChanged();
      } else {
        commissionRateMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public Builder mergeCommissionRateMicros(com.google.protobuf.Int64Value value) {
      if (commissionRateMicrosBuilder_ == null) {
        if (commissionRateMicros_ != null) {
          commissionRateMicros_ =
            com.google.protobuf.Int64Value.newBuilder(commissionRateMicros_).mergeFrom(value).buildPartial();
        } else {
          commissionRateMicros_ = value;
        }
        onChanged();
      } else {
        commissionRateMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public Builder clearCommissionRateMicros() {
      if (commissionRateMicrosBuilder_ == null) {
        commissionRateMicros_ = null;
        onChanged();
      } else {
        commissionRateMicros_ = null;
        commissionRateMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCommissionRateMicrosBuilder() {
      
      onChanged();
      return getCommissionRateMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCommissionRateMicrosOrBuilder() {
      if (commissionRateMicrosBuilder_ != null) {
        return commissionRateMicrosBuilder_.getMessageOrBuilder();
      } else {
        return commissionRateMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : commissionRateMicros_;
      }
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>.google.protobuf.Int64Value commission_rate_micros = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCommissionRateMicrosFieldBuilder() {
      if (commissionRateMicrosBuilder_ == null) {
        commissionRateMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCommissionRateMicros(),
                getParentForChildren(),
                isClean());
        commissionRateMicros_ = null;
      }
      return commissionRateMicrosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.Commission)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.Commission)
  private static final com.google.ads.googleads.v2.common.Commission DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.Commission();
  }

  public static com.google.ads.googleads.v2.common.Commission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Commission>
      PARSER = new com.google.protobuf.AbstractParser<Commission>() {
    @java.lang.Override
    public Commission parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Commission(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Commission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Commission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.Commission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

