// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/criterion_category_locale_availability_mode.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Describes locale availabilty mode for a criterion availability - whether
 * it's available globally, or a particular country with all languages, or a
 * particular language with all countries, or a country-language pair.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum}
 */
public  final class CriterionCategoryLocaleAvailabilityModeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum)
    CriterionCategoryLocaleAvailabilityModeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CriterionCategoryLocaleAvailabilityModeEnum.newBuilder() to construct.
  private CriterionCategoryLocaleAvailabilityModeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CriterionCategoryLocaleAvailabilityModeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CriterionCategoryLocaleAvailabilityModeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    return com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeProto.internal_static_google_ads_googleads_v1_enums_CriterionCategoryLocaleAvailabilityModeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeProto.internal_static_google_ads_googleads_v1_enums_CriterionCategoryLocaleAvailabilityModeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.class, com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum containing the possible CriterionCategoryLocaleAvailabilityMode.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode}
   */
  public enum CriterionCategoryLocaleAvailabilityMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The category is available to campaigns of all locales.
     * </pre>
     *
     * <code>ALL_LOCALES = 2;</code>
     */
    ALL_LOCALES(2),
    /**
     * <pre>
     * The category is available to campaigns within a list of countries,
     * regardless of language.
     * </pre>
     *
     * <code>COUNTRY_AND_ALL_LANGUAGES = 3;</code>
     */
    COUNTRY_AND_ALL_LANGUAGES(3),
    /**
     * <pre>
     * The category is available to campaigns within a list of languages,
     * regardless of country.
     * </pre>
     *
     * <code>LANGUAGE_AND_ALL_COUNTRIES = 4;</code>
     */
    LANGUAGE_AND_ALL_COUNTRIES(4),
    /**
     * <pre>
     * The category is available to campaigns within a list of country, language
     * pairs.
     * </pre>
     *
     * <code>COUNTRY_AND_LANGUAGE = 5;</code>
     */
    COUNTRY_AND_LANGUAGE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The category is available to campaigns of all locales.
     * </pre>
     *
     * <code>ALL_LOCALES = 2;</code>
     */
    public static final int ALL_LOCALES_VALUE = 2;
    /**
     * <pre>
     * The category is available to campaigns within a list of countries,
     * regardless of language.
     * </pre>
     *
     * <code>COUNTRY_AND_ALL_LANGUAGES = 3;</code>
     */
    public static final int COUNTRY_AND_ALL_LANGUAGES_VALUE = 3;
    /**
     * <pre>
     * The category is available to campaigns within a list of languages,
     * regardless of country.
     * </pre>
     *
     * <code>LANGUAGE_AND_ALL_COUNTRIES = 4;</code>
     */
    public static final int LANGUAGE_AND_ALL_COUNTRIES_VALUE = 4;
    /**
     * <pre>
     * The category is available to campaigns within a list of country, language
     * pairs.
     * </pre>
     *
     * <code>COUNTRY_AND_LANGUAGE = 5;</code>
     */
    public static final int COUNTRY_AND_LANGUAGE_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CriterionCategoryLocaleAvailabilityMode valueOf(int value) {
      return forNumber(value);
    }

    public static CriterionCategoryLocaleAvailabilityMode forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ALL_LOCALES;
        case 3: return COUNTRY_AND_ALL_LANGUAGES;
        case 4: return LANGUAGE_AND_ALL_COUNTRIES;
        case 5: return COUNTRY_AND_LANGUAGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CriterionCategoryLocaleAvailabilityMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CriterionCategoryLocaleAvailabilityMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CriterionCategoryLocaleAvailabilityMode>() {
            public CriterionCategoryLocaleAvailabilityMode findValueByNumber(int number) {
              return CriterionCategoryLocaleAvailabilityMode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CriterionCategoryLocaleAvailabilityMode[] VALUES = values();

    public static CriterionCategoryLocaleAvailabilityMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CriterionCategoryLocaleAvailabilityMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum other = (com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum prototype) {
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
   * Describes locale availabilty mode for a criterion availability - whether
   * it's available globally, or a particular country with all languages, or a
   * particular language with all countries, or a country-language pair.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum)
      com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeProto.internal_static_google_ads_googleads_v1_enums_CriterionCategoryLocaleAvailabilityModeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeProto.internal_static_google_ads_googleads_v1_enums_CriterionCategoryLocaleAvailabilityModeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.class, com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeProto.internal_static_google_ads_googleads_v1_enums_CriterionCategoryLocaleAvailabilityModeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum build() {
      com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum buildPartial() {
      com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum result = new com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum other) {
      if (other == com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum)
  private static final com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum();
  }

  public static com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CriterionCategoryLocaleAvailabilityModeEnum>
      PARSER = new com.google.protobuf.AbstractParser<CriterionCategoryLocaleAvailabilityModeEnum>() {
    @java.lang.Override
    public CriterionCategoryLocaleAvailabilityModeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CriterionCategoryLocaleAvailabilityModeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CriterionCategoryLocaleAvailabilityModeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CriterionCategoryLocaleAvailabilityModeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.CriterionCategoryLocaleAvailabilityModeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

