// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/keyword_plan_service.proto

package com.google.ads.googleads.v2.services;

public interface KeywordPlanAdGroupForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.KeywordPlanAdGroupForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
   */
  boolean hasKeywordPlanAdGroup();
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
   */
  com.google.protobuf.StringValue getKeywordPlanAdGroup();
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeywordPlanAdGroupOrBuilder();

  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  boolean hasAdGroupForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  com.google.ads.googleads.v2.services.ForecastMetrics getAdGroupForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  com.google.ads.googleads.v2.services.ForecastMetricsOrBuilder getAdGroupForecastOrBuilder();
}
