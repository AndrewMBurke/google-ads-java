// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/customer_manager_link.proto

package com.google.ads.googleads.v1.resources;

/**
 * <pre>
 * Represents customer-manager link relationship.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.resources.CustomerManagerLink}
 */
public  final class CustomerManagerLink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.resources.CustomerManagerLink)
    CustomerManagerLinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerManagerLink.newBuilder() to construct.
  private CustomerManagerLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerManagerLink() {
    resourceName_ = "";
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomerManagerLink(
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
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (managerCustomer_ != null) {
              subBuilder = managerCustomer_.toBuilder();
            }
            managerCustomer_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(managerCustomer_);
              managerCustomer_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (managerLinkId_ != null) {
              subBuilder = managerLinkId_.toBuilder();
            }
            managerLinkId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(managerLinkId_);
              managerLinkId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {
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
    return com.google.ads.googleads.v1.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v1_resources_CustomerManagerLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v1_resources_CustomerManagerLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.resources.CustomerManagerLink.class, com.google.ads.googleads.v1.resources.CustomerManagerLink.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
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
   * Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
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

  public static final int MANAGER_CUSTOMER_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue managerCustomer_;
  /**
   * <pre>
   * The manager customer linked to the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manager_customer = 3;</code>
   */
  public boolean hasManagerCustomer() {
    return managerCustomer_ != null;
  }
  /**
   * <pre>
   * The manager customer linked to the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manager_customer = 3;</code>
   */
  public com.google.protobuf.StringValue getManagerCustomer() {
    return managerCustomer_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : managerCustomer_;
  }
  /**
   * <pre>
   * The manager customer linked to the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manager_customer = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getManagerCustomerOrBuilder() {
    return getManagerCustomer();
  }

  public static final int MANAGER_LINK_ID_FIELD_NUMBER = 4;
  private com.google.protobuf.Int64Value managerLinkId_;
  /**
   * <pre>
   * ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
   */
  public boolean hasManagerLinkId() {
    return managerLinkId_ != null;
  }
  /**
   * <pre>
   * ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
   */
  public com.google.protobuf.Int64Value getManagerLinkId() {
    return managerLinkId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : managerLinkId_;
  }
  /**
   * <pre>
   * ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getManagerLinkIdOrBuilder() {
    return getManagerLinkId();
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   */
  public com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus result = com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus.valueOf(status_);
    return result == null ? com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNRECOGNIZED : result;
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
    if (managerCustomer_ != null) {
      output.writeMessage(3, getManagerCustomer());
    }
    if (managerLinkId_ != null) {
      output.writeMessage(4, getManagerLinkId());
    }
    if (status_ != com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(5, status_);
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
    if (managerCustomer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getManagerCustomer());
    }
    if (managerLinkId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getManagerLinkId());
    }
    if (status_ != com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
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
    if (!(obj instanceof com.google.ads.googleads.v1.resources.CustomerManagerLink)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.resources.CustomerManagerLink other = (com.google.ads.googleads.v1.resources.CustomerManagerLink) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasManagerCustomer() != other.hasManagerCustomer()) return false;
    if (hasManagerCustomer()) {
      if (!getManagerCustomer()
          .equals(other.getManagerCustomer())) return false;
    }
    if (hasManagerLinkId() != other.hasManagerLinkId()) return false;
    if (hasManagerLinkId()) {
      if (!getManagerLinkId()
          .equals(other.getManagerLinkId())) return false;
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
    if (hasManagerCustomer()) {
      hash = (37 * hash) + MANAGER_CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getManagerCustomer().hashCode();
    }
    if (hasManagerLinkId()) {
      hash = (37 * hash) + MANAGER_LINK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getManagerLinkId().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.resources.CustomerManagerLink parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.resources.CustomerManagerLink prototype) {
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
   * Represents customer-manager link relationship.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.resources.CustomerManagerLink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.resources.CustomerManagerLink)
      com.google.ads.googleads.v1.resources.CustomerManagerLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v1_resources_CustomerManagerLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v1_resources_CustomerManagerLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.resources.CustomerManagerLink.class, com.google.ads.googleads.v1.resources.CustomerManagerLink.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.resources.CustomerManagerLink.newBuilder()
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

      if (managerCustomerBuilder_ == null) {
        managerCustomer_ = null;
      } else {
        managerCustomer_ = null;
        managerCustomerBuilder_ = null;
      }
      if (managerLinkIdBuilder_ == null) {
        managerLinkId_ = null;
      } else {
        managerLinkId_ = null;
        managerLinkIdBuilder_ = null;
      }
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v1_resources_CustomerManagerLink_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.resources.CustomerManagerLink getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.resources.CustomerManagerLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.resources.CustomerManagerLink build() {
      com.google.ads.googleads.v1.resources.CustomerManagerLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.resources.CustomerManagerLink buildPartial() {
      com.google.ads.googleads.v1.resources.CustomerManagerLink result = new com.google.ads.googleads.v1.resources.CustomerManagerLink(this);
      result.resourceName_ = resourceName_;
      if (managerCustomerBuilder_ == null) {
        result.managerCustomer_ = managerCustomer_;
      } else {
        result.managerCustomer_ = managerCustomerBuilder_.build();
      }
      if (managerLinkIdBuilder_ == null) {
        result.managerLinkId_ = managerLinkId_;
      } else {
        result.managerLinkId_ = managerLinkIdBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.resources.CustomerManagerLink) {
        return mergeFrom((com.google.ads.googleads.v1.resources.CustomerManagerLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.resources.CustomerManagerLink other) {
      if (other == com.google.ads.googleads.v1.resources.CustomerManagerLink.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasManagerCustomer()) {
        mergeManagerCustomer(other.getManagerCustomer());
      }
      if (other.hasManagerLinkId()) {
        mergeManagerLinkId(other.getManagerLinkId());
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
      com.google.ads.googleads.v1.resources.CustomerManagerLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.resources.CustomerManagerLink) e.getUnfinishedMessage();
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
     * Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
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
     * Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
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
     * Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
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
     * Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
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
     * Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
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

    private com.google.protobuf.StringValue managerCustomer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> managerCustomerBuilder_;
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public boolean hasManagerCustomer() {
      return managerCustomerBuilder_ != null || managerCustomer_ != null;
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public com.google.protobuf.StringValue getManagerCustomer() {
      if (managerCustomerBuilder_ == null) {
        return managerCustomer_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : managerCustomer_;
      } else {
        return managerCustomerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public Builder setManagerCustomer(com.google.protobuf.StringValue value) {
      if (managerCustomerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        managerCustomer_ = value;
        onChanged();
      } else {
        managerCustomerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public Builder setManagerCustomer(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (managerCustomerBuilder_ == null) {
        managerCustomer_ = builderForValue.build();
        onChanged();
      } else {
        managerCustomerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public Builder mergeManagerCustomer(com.google.protobuf.StringValue value) {
      if (managerCustomerBuilder_ == null) {
        if (managerCustomer_ != null) {
          managerCustomer_ =
            com.google.protobuf.StringValue.newBuilder(managerCustomer_).mergeFrom(value).buildPartial();
        } else {
          managerCustomer_ = value;
        }
        onChanged();
      } else {
        managerCustomerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public Builder clearManagerCustomer() {
      if (managerCustomerBuilder_ == null) {
        managerCustomer_ = null;
        onChanged();
      } else {
        managerCustomer_ = null;
        managerCustomerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getManagerCustomerBuilder() {
      
      onChanged();
      return getManagerCustomerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getManagerCustomerOrBuilder() {
      if (managerCustomerBuilder_ != null) {
        return managerCustomerBuilder_.getMessageOrBuilder();
      } else {
        return managerCustomer_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : managerCustomer_;
      }
    }
    /**
     * <pre>
     * The manager customer linked to the customer.
     * </pre>
     *
     * <code>.google.protobuf.StringValue manager_customer = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getManagerCustomerFieldBuilder() {
      if (managerCustomerBuilder_ == null) {
        managerCustomerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getManagerCustomer(),
                getParentForChildren(),
                isClean());
        managerCustomer_ = null;
      }
      return managerCustomerBuilder_;
    }

    private com.google.protobuf.Int64Value managerLinkId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> managerLinkIdBuilder_;
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public boolean hasManagerLinkId() {
      return managerLinkIdBuilder_ != null || managerLinkId_ != null;
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public com.google.protobuf.Int64Value getManagerLinkId() {
      if (managerLinkIdBuilder_ == null) {
        return managerLinkId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : managerLinkId_;
      } else {
        return managerLinkIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public Builder setManagerLinkId(com.google.protobuf.Int64Value value) {
      if (managerLinkIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        managerLinkId_ = value;
        onChanged();
      } else {
        managerLinkIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public Builder setManagerLinkId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (managerLinkIdBuilder_ == null) {
        managerLinkId_ = builderForValue.build();
        onChanged();
      } else {
        managerLinkIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public Builder mergeManagerLinkId(com.google.protobuf.Int64Value value) {
      if (managerLinkIdBuilder_ == null) {
        if (managerLinkId_ != null) {
          managerLinkId_ =
            com.google.protobuf.Int64Value.newBuilder(managerLinkId_).mergeFrom(value).buildPartial();
        } else {
          managerLinkId_ = value;
        }
        onChanged();
      } else {
        managerLinkIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public Builder clearManagerLinkId() {
      if (managerLinkIdBuilder_ == null) {
        managerLinkId_ = null;
        onChanged();
      } else {
        managerLinkId_ = null;
        managerLinkIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public com.google.protobuf.Int64Value.Builder getManagerLinkIdBuilder() {
      
      onChanged();
      return getManagerLinkIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getManagerLinkIdOrBuilder() {
      if (managerLinkIdBuilder_ != null) {
        return managerLinkIdBuilder_.getMessageOrBuilder();
      } else {
        return managerLinkId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : managerLinkId_;
      }
    }
    /**
     * <pre>
     * ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value manager_link_id = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getManagerLinkIdFieldBuilder() {
      if (managerLinkIdBuilder_ == null) {
        managerLinkIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getManagerLinkId(),
                getParentForChildren(),
                isClean());
        managerLinkId_ = null;
      }
      return managerLinkIdBuilder_;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     */
    public com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus result = com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus.valueOf(status_);
      return result == null ? com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     */
    public Builder setStatus(com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.resources.CustomerManagerLink)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.resources.CustomerManagerLink)
  private static final com.google.ads.googleads.v1.resources.CustomerManagerLink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.resources.CustomerManagerLink();
  }

  public static com.google.ads.googleads.v1.resources.CustomerManagerLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerManagerLink>
      PARSER = new com.google.protobuf.AbstractParser<CustomerManagerLink>() {
    @java.lang.Override
    public CustomerManagerLink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomerManagerLink(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomerManagerLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerManagerLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.resources.CustomerManagerLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

