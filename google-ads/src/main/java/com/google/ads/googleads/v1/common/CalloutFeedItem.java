// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/extensions.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Represents a callout extension.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.CalloutFeedItem}
 */
public  final class CalloutFeedItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.CalloutFeedItem)
    CalloutFeedItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalloutFeedItem.newBuilder() to construct.
  private CalloutFeedItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalloutFeedItem() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalloutFeedItem(
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
            if (calloutText_ != null) {
              subBuilder = calloutText_.toBuilder();
            }
            calloutText_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(calloutText_);
              calloutText_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.common.ExtensionsProto.internal_static_google_ads_googleads_v1_common_CalloutFeedItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.ExtensionsProto.internal_static_google_ads_googleads_v1_common_CalloutFeedItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.CalloutFeedItem.class, com.google.ads.googleads.v1.common.CalloutFeedItem.Builder.class);
  }

  public static final int CALLOUT_TEXT_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue calloutText_;
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue callout_text = 1;</code>
   */
  public boolean hasCalloutText() {
    return calloutText_ != null;
  }
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue callout_text = 1;</code>
   */
  public com.google.protobuf.StringValue getCalloutText() {
    return calloutText_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : calloutText_;
  }
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue callout_text = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getCalloutTextOrBuilder() {
    return getCalloutText();
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
    if (calloutText_ != null) {
      output.writeMessage(1, getCalloutText());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (calloutText_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCalloutText());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.CalloutFeedItem)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.CalloutFeedItem other = (com.google.ads.googleads.v1.common.CalloutFeedItem) obj;

    if (hasCalloutText() != other.hasCalloutText()) return false;
    if (hasCalloutText()) {
      if (!getCalloutText()
          .equals(other.getCalloutText())) return false;
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
    if (hasCalloutText()) {
      hash = (37 * hash) + CALLOUT_TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getCalloutText().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CalloutFeedItem parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.CalloutFeedItem prototype) {
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
   * Represents a callout extension.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.CalloutFeedItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.CalloutFeedItem)
      com.google.ads.googleads.v1.common.CalloutFeedItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.ExtensionsProto.internal_static_google_ads_googleads_v1_common_CalloutFeedItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.ExtensionsProto.internal_static_google_ads_googleads_v1_common_CalloutFeedItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.CalloutFeedItem.class, com.google.ads.googleads.v1.common.CalloutFeedItem.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.CalloutFeedItem.newBuilder()
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
      if (calloutTextBuilder_ == null) {
        calloutText_ = null;
      } else {
        calloutText_ = null;
        calloutTextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.ExtensionsProto.internal_static_google_ads_googleads_v1_common_CalloutFeedItem_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CalloutFeedItem getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.CalloutFeedItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CalloutFeedItem build() {
      com.google.ads.googleads.v1.common.CalloutFeedItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CalloutFeedItem buildPartial() {
      com.google.ads.googleads.v1.common.CalloutFeedItem result = new com.google.ads.googleads.v1.common.CalloutFeedItem(this);
      if (calloutTextBuilder_ == null) {
        result.calloutText_ = calloutText_;
      } else {
        result.calloutText_ = calloutTextBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.CalloutFeedItem) {
        return mergeFrom((com.google.ads.googleads.v1.common.CalloutFeedItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.CalloutFeedItem other) {
      if (other == com.google.ads.googleads.v1.common.CalloutFeedItem.getDefaultInstance()) return this;
      if (other.hasCalloutText()) {
        mergeCalloutText(other.getCalloutText());
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
      com.google.ads.googleads.v1.common.CalloutFeedItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.CalloutFeedItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue calloutText_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> calloutTextBuilder_;
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public boolean hasCalloutText() {
      return calloutTextBuilder_ != null || calloutText_ != null;
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public com.google.protobuf.StringValue getCalloutText() {
      if (calloutTextBuilder_ == null) {
        return calloutText_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : calloutText_;
      } else {
        return calloutTextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public Builder setCalloutText(com.google.protobuf.StringValue value) {
      if (calloutTextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        calloutText_ = value;
        onChanged();
      } else {
        calloutTextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public Builder setCalloutText(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (calloutTextBuilder_ == null) {
        calloutText_ = builderForValue.build();
        onChanged();
      } else {
        calloutTextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public Builder mergeCalloutText(com.google.protobuf.StringValue value) {
      if (calloutTextBuilder_ == null) {
        if (calloutText_ != null) {
          calloutText_ =
            com.google.protobuf.StringValue.newBuilder(calloutText_).mergeFrom(value).buildPartial();
        } else {
          calloutText_ = value;
        }
        onChanged();
      } else {
        calloutTextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public Builder clearCalloutText() {
      if (calloutTextBuilder_ == null) {
        calloutText_ = null;
        onChanged();
      } else {
        calloutText_ = null;
        calloutTextBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getCalloutTextBuilder() {
      
      onChanged();
      return getCalloutTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCalloutTextOrBuilder() {
      if (calloutTextBuilder_ != null) {
        return calloutTextBuilder_.getMessageOrBuilder();
      } else {
        return calloutText_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : calloutText_;
      }
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.StringValue callout_text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCalloutTextFieldBuilder() {
      if (calloutTextBuilder_ == null) {
        calloutTextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCalloutText(),
                getParentForChildren(),
                isClean());
        calloutText_ = null;
      }
      return calloutTextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.CalloutFeedItem)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.CalloutFeedItem)
  private static final com.google.ads.googleads.v1.common.CalloutFeedItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.CalloutFeedItem();
  }

  public static com.google.ads.googleads.v1.common.CalloutFeedItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalloutFeedItem>
      PARSER = new com.google.protobuf.AbstractParser<CalloutFeedItem>() {
    @java.lang.Override
    public CalloutFeedItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalloutFeedItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalloutFeedItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalloutFeedItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.CalloutFeedItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

