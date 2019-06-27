// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/asset_service.proto

package com.google.ads.googleads.v2.services;

/**
 * <pre>
 * Response message for an asset mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.services.MutateAssetsResponse}
 */
public  final class MutateAssetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.services.MutateAssetsResponse)
    MutateAssetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAssetsResponse.newBuilder() to construct.
  private MutateAssetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAssetsResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateAssetsResponse(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              results_ = new java.util.ArrayList<com.google.ads.googleads.v2.services.MutateAssetResult>();
              mutable_bitField0_ |= 0x00000001;
            }
            results_.add(
                input.readMessage(com.google.ads.googleads.v2.services.MutateAssetResult.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v2.services.AssetServiceProto.internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.services.AssetServiceProto.internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.services.MutateAssetsResponse.class, com.google.ads.googleads.v2.services.MutateAssetsResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.ads.googleads.v2.services.MutateAssetResult> results_;
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
   */
  public java.util.List<com.google.ads.googleads.v2.services.MutateAssetResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v2.services.MutateAssetResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
   */
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
   */
  public com.google.ads.googleads.v2.services.MutateAssetResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
   */
  public com.google.ads.googleads.v2.services.MutateAssetResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(2, results_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, results_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v2.services.MutateAssetsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.services.MutateAssetsResponse other = (com.google.ads.googleads.v2.services.MutateAssetsResponse) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.MutateAssetsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.services.MutateAssetsResponse prototype) {
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
   * Response message for an asset mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.services.MutateAssetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.services.MutateAssetsResponse)
      com.google.ads.googleads.v2.services.MutateAssetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.services.AssetServiceProto.internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.services.AssetServiceProto.internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.services.MutateAssetsResponse.class, com.google.ads.googleads.v2.services.MutateAssetsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.services.MutateAssetsResponse.newBuilder()
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
        getResultsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.services.AssetServiceProto.internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.MutateAssetsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.services.MutateAssetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.MutateAssetsResponse build() {
      com.google.ads.googleads.v2.services.MutateAssetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.MutateAssetsResponse buildPartial() {
      com.google.ads.googleads.v2.services.MutateAssetsResponse result = new com.google.ads.googleads.v2.services.MutateAssetsResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.services.MutateAssetsResponse) {
        return mergeFrom((com.google.ads.googleads.v2.services.MutateAssetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.services.MutateAssetsResponse other) {
      if (other == com.google.ads.googleads.v2.services.MutateAssetsResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
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
      com.google.ads.googleads.v2.services.MutateAssetsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.services.MutateAssetsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v2.services.MutateAssetResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.google.ads.googleads.v2.services.MutateAssetResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v2.services.MutateAssetResult, com.google.ads.googleads.v2.services.MutateAssetResult.Builder, com.google.ads.googleads.v2.services.MutateAssetResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v2.services.MutateAssetResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public com.google.ads.googleads.v2.services.MutateAssetResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v2.services.MutateAssetResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v2.services.MutateAssetResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder addResults(com.google.ads.googleads.v2.services.MutateAssetResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v2.services.MutateAssetResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder addResults(
        com.google.ads.googleads.v2.services.MutateAssetResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v2.services.MutateAssetResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.ads.googleads.v2.services.MutateAssetResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public com.google.ads.googleads.v2.services.MutateAssetResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public com.google.ads.googleads.v2.services.MutateAssetResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v2.services.MutateAssetResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public com.google.ads.googleads.v2.services.MutateAssetResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.ads.googleads.v2.services.MutateAssetResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public com.google.ads.googleads.v2.services.MutateAssetResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v2.services.MutateAssetResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v2.services.MutateAssetResult results = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v2.services.MutateAssetResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v2.services.MutateAssetResult, com.google.ads.googleads.v2.services.MutateAssetResult.Builder, com.google.ads.googleads.v2.services.MutateAssetResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v2.services.MutateAssetResult, com.google.ads.googleads.v2.services.MutateAssetResult.Builder, com.google.ads.googleads.v2.services.MutateAssetResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.services.MutateAssetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.MutateAssetsResponse)
  private static final com.google.ads.googleads.v2.services.MutateAssetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.services.MutateAssetsResponse();
  }

  public static com.google.ads.googleads.v2.services.MutateAssetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAssetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateAssetsResponse>() {
    @java.lang.Override
    public MutateAssetsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateAssetsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateAssetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAssetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.services.MutateAssetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

