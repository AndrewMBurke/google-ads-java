// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/conversion_upload_service.proto

package com.google.ads.googleads.v2.services;

/**
 * <pre>
 * Contains additional information about externally attributed conversions.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.services.ExternalAttributionData}
 */
public  final class ExternalAttributionData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.services.ExternalAttributionData)
    ExternalAttributionDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalAttributionData.newBuilder() to construct.
  private ExternalAttributionData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalAttributionData() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExternalAttributionData(
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
            com.google.protobuf.DoubleValue.Builder subBuilder = null;
            if (externalAttributionCredit_ != null) {
              subBuilder = externalAttributionCredit_.toBuilder();
            }
            externalAttributionCredit_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(externalAttributionCredit_);
              externalAttributionCredit_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (externalAttributionModel_ != null) {
              subBuilder = externalAttributionModel_.toBuilder();
            }
            externalAttributionModel_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(externalAttributionModel_);
              externalAttributionModel_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ExternalAttributionData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ExternalAttributionData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.services.ExternalAttributionData.class, com.google.ads.googleads.v2.services.ExternalAttributionData.Builder.class);
  }

  public static final int EXTERNAL_ATTRIBUTION_CREDIT_FIELD_NUMBER = 1;
  private com.google.protobuf.DoubleValue externalAttributionCredit_;
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
   */
  public boolean hasExternalAttributionCredit() {
    return externalAttributionCredit_ != null;
  }
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
   */
  public com.google.protobuf.DoubleValue getExternalAttributionCredit() {
    return externalAttributionCredit_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : externalAttributionCredit_;
  }
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
   */
  public com.google.protobuf.DoubleValueOrBuilder getExternalAttributionCreditOrBuilder() {
    return getExternalAttributionCredit();
  }

  public static final int EXTERNAL_ATTRIBUTION_MODEL_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue externalAttributionModel_;
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
   */
  public boolean hasExternalAttributionModel() {
    return externalAttributionModel_ != null;
  }
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
   */
  public com.google.protobuf.StringValue getExternalAttributionModel() {
    return externalAttributionModel_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : externalAttributionModel_;
  }
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getExternalAttributionModelOrBuilder() {
    return getExternalAttributionModel();
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
    if (externalAttributionCredit_ != null) {
      output.writeMessage(1, getExternalAttributionCredit());
    }
    if (externalAttributionModel_ != null) {
      output.writeMessage(2, getExternalAttributionModel());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (externalAttributionCredit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExternalAttributionCredit());
    }
    if (externalAttributionModel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExternalAttributionModel());
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
    if (!(obj instanceof com.google.ads.googleads.v2.services.ExternalAttributionData)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.services.ExternalAttributionData other = (com.google.ads.googleads.v2.services.ExternalAttributionData) obj;

    if (hasExternalAttributionCredit() != other.hasExternalAttributionCredit()) return false;
    if (hasExternalAttributionCredit()) {
      if (!getExternalAttributionCredit()
          .equals(other.getExternalAttributionCredit())) return false;
    }
    if (hasExternalAttributionModel() != other.hasExternalAttributionModel()) return false;
    if (hasExternalAttributionModel()) {
      if (!getExternalAttributionModel()
          .equals(other.getExternalAttributionModel())) return false;
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
    if (hasExternalAttributionCredit()) {
      hash = (37 * hash) + EXTERNAL_ATTRIBUTION_CREDIT_FIELD_NUMBER;
      hash = (53 * hash) + getExternalAttributionCredit().hashCode();
    }
    if (hasExternalAttributionModel()) {
      hash = (37 * hash) + EXTERNAL_ATTRIBUTION_MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getExternalAttributionModel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.ExternalAttributionData parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.services.ExternalAttributionData prototype) {
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
   * Contains additional information about externally attributed conversions.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.services.ExternalAttributionData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.services.ExternalAttributionData)
      com.google.ads.googleads.v2.services.ExternalAttributionDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ExternalAttributionData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ExternalAttributionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.services.ExternalAttributionData.class, com.google.ads.googleads.v2.services.ExternalAttributionData.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.services.ExternalAttributionData.newBuilder()
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
      if (externalAttributionCreditBuilder_ == null) {
        externalAttributionCredit_ = null;
      } else {
        externalAttributionCredit_ = null;
        externalAttributionCreditBuilder_ = null;
      }
      if (externalAttributionModelBuilder_ == null) {
        externalAttributionModel_ = null;
      } else {
        externalAttributionModel_ = null;
        externalAttributionModelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ExternalAttributionData_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.ExternalAttributionData getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.services.ExternalAttributionData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.ExternalAttributionData build() {
      com.google.ads.googleads.v2.services.ExternalAttributionData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.ExternalAttributionData buildPartial() {
      com.google.ads.googleads.v2.services.ExternalAttributionData result = new com.google.ads.googleads.v2.services.ExternalAttributionData(this);
      if (externalAttributionCreditBuilder_ == null) {
        result.externalAttributionCredit_ = externalAttributionCredit_;
      } else {
        result.externalAttributionCredit_ = externalAttributionCreditBuilder_.build();
      }
      if (externalAttributionModelBuilder_ == null) {
        result.externalAttributionModel_ = externalAttributionModel_;
      } else {
        result.externalAttributionModel_ = externalAttributionModelBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.services.ExternalAttributionData) {
        return mergeFrom((com.google.ads.googleads.v2.services.ExternalAttributionData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.services.ExternalAttributionData other) {
      if (other == com.google.ads.googleads.v2.services.ExternalAttributionData.getDefaultInstance()) return this;
      if (other.hasExternalAttributionCredit()) {
        mergeExternalAttributionCredit(other.getExternalAttributionCredit());
      }
      if (other.hasExternalAttributionModel()) {
        mergeExternalAttributionModel(other.getExternalAttributionModel());
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
      com.google.ads.googleads.v2.services.ExternalAttributionData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.services.ExternalAttributionData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.DoubleValue externalAttributionCredit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> externalAttributionCreditBuilder_;
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public boolean hasExternalAttributionCredit() {
      return externalAttributionCreditBuilder_ != null || externalAttributionCredit_ != null;
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public com.google.protobuf.DoubleValue getExternalAttributionCredit() {
      if (externalAttributionCreditBuilder_ == null) {
        return externalAttributionCredit_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : externalAttributionCredit_;
      } else {
        return externalAttributionCreditBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public Builder setExternalAttributionCredit(com.google.protobuf.DoubleValue value) {
      if (externalAttributionCreditBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        externalAttributionCredit_ = value;
        onChanged();
      } else {
        externalAttributionCreditBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public Builder setExternalAttributionCredit(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (externalAttributionCreditBuilder_ == null) {
        externalAttributionCredit_ = builderForValue.build();
        onChanged();
      } else {
        externalAttributionCreditBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public Builder mergeExternalAttributionCredit(com.google.protobuf.DoubleValue value) {
      if (externalAttributionCreditBuilder_ == null) {
        if (externalAttributionCredit_ != null) {
          externalAttributionCredit_ =
            com.google.protobuf.DoubleValue.newBuilder(externalAttributionCredit_).mergeFrom(value).buildPartial();
        } else {
          externalAttributionCredit_ = value;
        }
        onChanged();
      } else {
        externalAttributionCreditBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public Builder clearExternalAttributionCredit() {
      if (externalAttributionCreditBuilder_ == null) {
        externalAttributionCredit_ = null;
        onChanged();
      } else {
        externalAttributionCredit_ = null;
        externalAttributionCreditBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public com.google.protobuf.DoubleValue.Builder getExternalAttributionCreditBuilder() {
      
      onChanged();
      return getExternalAttributionCreditFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getExternalAttributionCreditOrBuilder() {
      if (externalAttributionCreditBuilder_ != null) {
        return externalAttributionCreditBuilder_.getMessageOrBuilder();
      } else {
        return externalAttributionCredit_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : externalAttributionCredit_;
      }
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue external_attribution_credit = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getExternalAttributionCreditFieldBuilder() {
      if (externalAttributionCreditBuilder_ == null) {
        externalAttributionCreditBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getExternalAttributionCredit(),
                getParentForChildren(),
                isClean());
        externalAttributionCredit_ = null;
      }
      return externalAttributionCreditBuilder_;
    }

    private com.google.protobuf.StringValue externalAttributionModel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> externalAttributionModelBuilder_;
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public boolean hasExternalAttributionModel() {
      return externalAttributionModelBuilder_ != null || externalAttributionModel_ != null;
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public com.google.protobuf.StringValue getExternalAttributionModel() {
      if (externalAttributionModelBuilder_ == null) {
        return externalAttributionModel_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : externalAttributionModel_;
      } else {
        return externalAttributionModelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public Builder setExternalAttributionModel(com.google.protobuf.StringValue value) {
      if (externalAttributionModelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        externalAttributionModel_ = value;
        onChanged();
      } else {
        externalAttributionModelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public Builder setExternalAttributionModel(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (externalAttributionModelBuilder_ == null) {
        externalAttributionModel_ = builderForValue.build();
        onChanged();
      } else {
        externalAttributionModelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public Builder mergeExternalAttributionModel(com.google.protobuf.StringValue value) {
      if (externalAttributionModelBuilder_ == null) {
        if (externalAttributionModel_ != null) {
          externalAttributionModel_ =
            com.google.protobuf.StringValue.newBuilder(externalAttributionModel_).mergeFrom(value).buildPartial();
        } else {
          externalAttributionModel_ = value;
        }
        onChanged();
      } else {
        externalAttributionModelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public Builder clearExternalAttributionModel() {
      if (externalAttributionModelBuilder_ == null) {
        externalAttributionModel_ = null;
        onChanged();
      } else {
        externalAttributionModel_ = null;
        externalAttributionModelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getExternalAttributionModelBuilder() {
      
      onChanged();
      return getExternalAttributionModelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getExternalAttributionModelOrBuilder() {
      if (externalAttributionModelBuilder_ != null) {
        return externalAttributionModelBuilder_.getMessageOrBuilder();
      } else {
        return externalAttributionModel_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : externalAttributionModel_;
      }
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue external_attribution_model = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getExternalAttributionModelFieldBuilder() {
      if (externalAttributionModelBuilder_ == null) {
        externalAttributionModelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getExternalAttributionModel(),
                getParentForChildren(),
                isClean());
        externalAttributionModel_ = null;
      }
      return externalAttributionModelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.services.ExternalAttributionData)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.ExternalAttributionData)
  private static final com.google.ads.googleads.v2.services.ExternalAttributionData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.services.ExternalAttributionData();
  }

  public static com.google.ads.googleads.v2.services.ExternalAttributionData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalAttributionData>
      PARSER = new com.google.protobuf.AbstractParser<ExternalAttributionData>() {
    @java.lang.Override
    public ExternalAttributionData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExternalAttributionData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExternalAttributionData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalAttributionData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.services.ExternalAttributionData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

