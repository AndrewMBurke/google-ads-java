// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/ad_group_ad.proto

package com.google.ads.googleads.v2.resources;

public interface AdGroupAdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.AdGroupAd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the ad.
   * Ad group ad resource names have the form:
   * `customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the ad.
   * Ad group ad resource names have the form:
   * `customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The status of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.AdGroupAdStatusEnum.AdGroupAdStatus status = 3;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.AdGroupAdStatusEnum.AdGroupAdStatus status = 3;</code>
   */
  com.google.ads.googleads.v2.enums.AdGroupAdStatusEnum.AdGroupAdStatus getStatus();

  /**
   * <pre>
   * The ad group to which the ad belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 4;</code>
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * The ad group to which the ad belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 4;</code>
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * The ad group to which the ad belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * The ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Ad ad = 5;</code>
   */
  boolean hasAd();
  /**
   * <pre>
   * The ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Ad ad = 5;</code>
   */
  com.google.ads.googleads.v2.resources.Ad getAd();
  /**
   * <pre>
   * The ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Ad ad = 5;</code>
   */
  com.google.ads.googleads.v2.resources.AdOrBuilder getAdOrBuilder();

  /**
   * <pre>
   * Policy information for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupAdPolicySummary policy_summary = 6;</code>
   */
  boolean hasPolicySummary();
  /**
   * <pre>
   * Policy information for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupAdPolicySummary policy_summary = 6;</code>
   */
  com.google.ads.googleads.v2.resources.AdGroupAdPolicySummary getPolicySummary();
  /**
   * <pre>
   * Policy information for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupAdPolicySummary policy_summary = 6;</code>
   */
  com.google.ads.googleads.v2.resources.AdGroupAdPolicySummaryOrBuilder getPolicySummaryOrBuilder();

  /**
   * <pre>
   * Overall ad strength for this ad group ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.AdStrengthEnum.AdStrength ad_strength = 7;</code>
   */
  int getAdStrengthValue();
  /**
   * <pre>
   * Overall ad strength for this ad group ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.AdStrengthEnum.AdStrength ad_strength = 7;</code>
   */
  com.google.ads.googleads.v2.enums.AdStrengthEnum.AdStrength getAdStrength();
}
