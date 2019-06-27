// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/search_term_view.proto

package com.google.ads.googleads.v2.resources;

/**
 * <pre>
 * A search term view with metrics aggregated by search term at the ad group
 * level.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.resources.SearchTermView}
 */
public  final class SearchTermView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.resources.SearchTermView)
    SearchTermViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchTermView.newBuilder() to construct.
  private SearchTermView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchTermView() {
    resourceName_ = "";
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchTermView(
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
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (searchTerm_ != null) {
              subBuilder = searchTerm_.toBuilder();
            }
            searchTerm_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(searchTerm_);
              searchTerm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (adGroup_ != null) {
              subBuilder = adGroup_.toBuilder();
            }
            adGroup_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(adGroup_);
              adGroup_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return com.google.ads.googleads.v2.resources.SearchTermViewProto.internal_static_google_ads_googleads_v2_resources_SearchTermView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.resources.SearchTermViewProto.internal_static_google_ads_googleads_v2_resources_SearchTermView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.resources.SearchTermView.class, com.google.ads.googleads.v2.resources.SearchTermView.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEARCH_TERM_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue searchTerm_;
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  public boolean hasSearchTerm() {
    return searchTerm_ != null;
  }
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  public com.google.protobuf.StringValue getSearchTerm() {
    return searchTerm_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : searchTerm_;
  }
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder() {
    return getSearchTerm();
  }

  public static final int AD_GROUP_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue adGroup_;
  /**
   * <pre>
   * The ad group the search term served in.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3;</code>
   */
  public boolean hasAdGroup() {
    return adGroup_ != null;
  }
  /**
   * <pre>
   * The ad group the search term served in.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3;</code>
   */
  public com.google.protobuf.StringValue getAdGroup() {
    return adGroup_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : adGroup_;
  }
  /**
   * <pre>
   * The ad group the search term served in.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder() {
    return getAdGroup();
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_;
  /**
   * <pre>
   * Indicates whether the search term is currently one of your
   * targeted or excluded keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Indicates whether the search term is currently one of your
   * targeted or excluded keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
   */
  public com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus result = com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus.valueOf(status_);
    return result == null ? com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus.UNRECOGNIZED : result;
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (searchTerm_ != null) {
      output.writeMessage(2, getSearchTerm());
    }
    if (adGroup_ != null) {
      output.writeMessage(3, getAdGroup());
    }
    if (status_ != com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (searchTerm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSearchTerm());
    }
    if (adGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAdGroup());
    }
    if (status_ != com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
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
    if (!(obj instanceof com.google.ads.googleads.v2.resources.SearchTermView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.resources.SearchTermView other = (com.google.ads.googleads.v2.resources.SearchTermView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasSearchTerm() != other.hasSearchTerm()) return false;
    if (hasSearchTerm()) {
      if (!getSearchTerm()
          .equals(other.getSearchTerm())) return false;
    }
    if (hasAdGroup() != other.hasAdGroup()) return false;
    if (hasAdGroup()) {
      if (!getAdGroup()
          .equals(other.getAdGroup())) return false;
    }
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasSearchTerm()) {
      hash = (37 * hash) + SEARCH_TERM_FIELD_NUMBER;
      hash = (53 * hash) + getSearchTerm().hashCode();
    }
    if (hasAdGroup()) {
      hash = (37 * hash) + AD_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroup().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.SearchTermView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.resources.SearchTermView prototype) {
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
   * A search term view with metrics aggregated by search term at the ad group
   * level.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.resources.SearchTermView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.resources.SearchTermView)
      com.google.ads.googleads.v2.resources.SearchTermViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.resources.SearchTermViewProto.internal_static_google_ads_googleads_v2_resources_SearchTermView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.resources.SearchTermViewProto.internal_static_google_ads_googleads_v2_resources_SearchTermView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.resources.SearchTermView.class, com.google.ads.googleads.v2.resources.SearchTermView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.resources.SearchTermView.newBuilder()
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
      resourceName_ = "";

      if (searchTermBuilder_ == null) {
        searchTerm_ = null;
      } else {
        searchTerm_ = null;
        searchTermBuilder_ = null;
      }
      if (adGroupBuilder_ == null) {
        adGroup_ = null;
      } else {
        adGroup_ = null;
        adGroupBuilder_ = null;
      }
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.resources.SearchTermViewProto.internal_static_google_ads_googleads_v2_resources_SearchTermView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.SearchTermView getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.resources.SearchTermView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.SearchTermView build() {
      com.google.ads.googleads.v2.resources.SearchTermView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.SearchTermView buildPartial() {
      com.google.ads.googleads.v2.resources.SearchTermView result = new com.google.ads.googleads.v2.resources.SearchTermView(this);
      result.resourceName_ = resourceName_;
      if (searchTermBuilder_ == null) {
        result.searchTerm_ = searchTerm_;
      } else {
        result.searchTerm_ = searchTermBuilder_.build();
      }
      if (adGroupBuilder_ == null) {
        result.adGroup_ = adGroup_;
      } else {
        result.adGroup_ = adGroupBuilder_.build();
      }
      result.status_ = status_;
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
      if (other instanceof com.google.ads.googleads.v2.resources.SearchTermView) {
        return mergeFrom((com.google.ads.googleads.v2.resources.SearchTermView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.resources.SearchTermView other) {
      if (other == com.google.ads.googleads.v2.resources.SearchTermView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasSearchTerm()) {
        mergeSearchTerm(other.getSearchTerm());
      }
      if (other.hasAdGroup()) {
        mergeAdGroup(other.getAdGroup());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      com.google.ads.googleads.v2.resources.SearchTermView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.resources.SearchTermView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue searchTerm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> searchTermBuilder_;
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public boolean hasSearchTerm() {
      return searchTermBuilder_ != null || searchTerm_ != null;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public com.google.protobuf.StringValue getSearchTerm() {
      if (searchTermBuilder_ == null) {
        return searchTerm_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : searchTerm_;
      } else {
        return searchTermBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder setSearchTerm(com.google.protobuf.StringValue value) {
      if (searchTermBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchTerm_ = value;
        onChanged();
      } else {
        searchTermBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder setSearchTerm(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (searchTermBuilder_ == null) {
        searchTerm_ = builderForValue.build();
        onChanged();
      } else {
        searchTermBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder mergeSearchTerm(com.google.protobuf.StringValue value) {
      if (searchTermBuilder_ == null) {
        if (searchTerm_ != null) {
          searchTerm_ =
            com.google.protobuf.StringValue.newBuilder(searchTerm_).mergeFrom(value).buildPartial();
        } else {
          searchTerm_ = value;
        }
        onChanged();
      } else {
        searchTermBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder clearSearchTerm() {
      if (searchTermBuilder_ == null) {
        searchTerm_ = null;
        onChanged();
      } else {
        searchTerm_ = null;
        searchTermBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getSearchTermBuilder() {
      
      onChanged();
      return getSearchTermFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder() {
      if (searchTermBuilder_ != null) {
        return searchTermBuilder_.getMessageOrBuilder();
      } else {
        return searchTerm_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : searchTerm_;
      }
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getSearchTermFieldBuilder() {
      if (searchTermBuilder_ == null) {
        searchTermBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getSearchTerm(),
                getParentForChildren(),
                isClean());
        searchTerm_ = null;
      }
      return searchTermBuilder_;
    }

    private com.google.protobuf.StringValue adGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> adGroupBuilder_;
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public boolean hasAdGroup() {
      return adGroupBuilder_ != null || adGroup_ != null;
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public com.google.protobuf.StringValue getAdGroup() {
      if (adGroupBuilder_ == null) {
        return adGroup_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : adGroup_;
      } else {
        return adGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public Builder setAdGroup(com.google.protobuf.StringValue value) {
      if (adGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroup_ = value;
        onChanged();
      } else {
        adGroupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public Builder setAdGroup(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (adGroupBuilder_ == null) {
        adGroup_ = builderForValue.build();
        onChanged();
      } else {
        adGroupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public Builder mergeAdGroup(com.google.protobuf.StringValue value) {
      if (adGroupBuilder_ == null) {
        if (adGroup_ != null) {
          adGroup_ =
            com.google.protobuf.StringValue.newBuilder(adGroup_).mergeFrom(value).buildPartial();
        } else {
          adGroup_ = value;
        }
        onChanged();
      } else {
        adGroupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public Builder clearAdGroup() {
      if (adGroupBuilder_ == null) {
        adGroup_ = null;
        onChanged();
      } else {
        adGroup_ = null;
        adGroupBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getAdGroupBuilder() {
      
      onChanged();
      return getAdGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder() {
      if (adGroupBuilder_ != null) {
        return adGroupBuilder_.getMessageOrBuilder();
      } else {
        return adGroup_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : adGroup_;
      }
    }
    /**
     * <pre>
     * The ad group the search term served in.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getAdGroupFieldBuilder() {
      if (adGroupBuilder_ == null) {
        adGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getAdGroup(),
                getParentForChildren(),
                isClean());
        adGroup_ = null;
      }
      return adGroupBuilder_;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Indicates whether the search term is currently one of your
     * targeted or excluded keywords.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Indicates whether the search term is currently one of your
     * targeted or excluded keywords.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether the search term is currently one of your
     * targeted or excluded keywords.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
     */
    public com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus result = com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus.valueOf(status_);
      return result == null ? com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Indicates whether the search term is currently one of your
     * targeted or excluded keywords.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
     */
    public Builder setStatus(com.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether the search term is currently one of your
     * targeted or excluded keywords.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.resources.SearchTermView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.SearchTermView)
  private static final com.google.ads.googleads.v2.resources.SearchTermView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.resources.SearchTermView();
  }

  public static com.google.ads.googleads.v2.resources.SearchTermView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchTermView>
      PARSER = new com.google.protobuf.AbstractParser<SearchTermView>() {
    @java.lang.Override
    public SearchTermView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchTermView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchTermView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchTermView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.resources.SearchTermView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

