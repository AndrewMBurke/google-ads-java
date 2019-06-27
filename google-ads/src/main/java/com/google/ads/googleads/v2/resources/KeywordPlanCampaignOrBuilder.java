// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/keyword_plan_campaign.proto

package com.google.ads.googleads.v2.resources;

public interface KeywordPlanCampaignOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.KeywordPlanCampaign)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan campaign.
   * KeywordPlanCampaign resource names have the form:
   * `customers/{customer_id}/keywordPlanCampaigns/{kp_campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign.
   * KeywordPlanCampaign resource names have the form:
   * `customers/{customer_id}/keywordPlanCampaigns/{kp_campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The keyword plan this campaign belongs to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan = 2;</code>
   */
  boolean hasKeywordPlan();
  /**
   * <pre>
   * The keyword plan this campaign belongs to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan = 2;</code>
   */
  com.google.protobuf.StringValue getKeywordPlan();
  /**
   * <pre>
   * The keyword plan this campaign belongs to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeywordPlanOrBuilder();

  /**
   * <pre>
   * The ID of the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the Keyword Plan campaign.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the Keyword Plan campaign.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the Keyword Plan campaign.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue language_constants = 5;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getLanguageConstantsList();
  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue language_constants = 5;</code>
   */
  com.google.protobuf.StringValue getLanguageConstants(int index);
  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue language_constants = 5;</code>
   */
  int getLanguageConstantsCount();
  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue language_constants = 5;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getLanguageConstantsOrBuilderList();
  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue language_constants = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLanguageConstantsOrBuilder(
      int index);

  /**
   * <pre>
   * Targeting network.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 6;</code>
   */
  int getKeywordPlanNetworkValue();
  /**
   * <pre>
   * Targeting network.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 6;</code>
   */
  com.google.ads.googleads.v2.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork getKeywordPlanNetwork();

  /**
   * <pre>
   * A default max cpc bid in micros, and in the account currency, for all ad
   * groups under the campaign.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 7;</code>
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * A default max cpc bid in micros, and in the account currency, for all ad
   * groups under the campaign.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 7;</code>
   */
  com.google.protobuf.Int64Value getCpcBidMicros();
  /**
   * <pre>
   * A default max cpc bid in micros, and in the account currency, for all ad
   * groups under the campaign.
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidMicrosOrBuilder();

  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  java.util.List<com.google.ads.googleads.v2.resources.KeywordPlanGeoTarget> 
      getGeoTargetsList();
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  com.google.ads.googleads.v2.resources.KeywordPlanGeoTarget getGeoTargets(int index);
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  int getGeoTargetsCount();
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.resources.KeywordPlanGeoTargetOrBuilder> 
      getGeoTargetsOrBuilderList();
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  com.google.ads.googleads.v2.resources.KeywordPlanGeoTargetOrBuilder getGeoTargetsOrBuilder(
      int index);
}
