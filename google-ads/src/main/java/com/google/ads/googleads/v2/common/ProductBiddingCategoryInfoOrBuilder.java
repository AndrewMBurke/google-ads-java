// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

public interface ProductBiddingCategoryInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.ProductBiddingCategoryInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Two-letter upper-case country code of the product bidding category. It must
   * match the campaign.shopping_setting.sales_country field.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Two-letter upper-case country code of the product bidding category. It must
   * match the campaign.shopping_setting.sales_country field.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * Two-letter upper-case country code of the product bidding category. It must
   * match the campaign.shopping_setting.sales_country field.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();

  /**
   * <pre>
   * Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
   */
  int getLevelValue();
  /**
   * <pre>
   * Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
   */
  com.google.ads.googleads.v2.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel getLevel();
}
