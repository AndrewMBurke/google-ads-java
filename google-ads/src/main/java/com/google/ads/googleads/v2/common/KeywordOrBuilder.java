// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/segments.proto

package com.google.ads.googleads.v2.common;

public interface KeywordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.Keyword)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 1;</code>
   */
  boolean hasAdGroupCriterion();
  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 1;</code>
   */
  com.google.protobuf.StringValue getAdGroupCriterion();
  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupCriterionOrBuilder();

  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo info = 2;</code>
   */
  boolean hasInfo();
  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo info = 2;</code>
   */
  com.google.ads.googleads.v2.common.KeywordInfo getInfo();
  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo info = 2;</code>
   */
  com.google.ads.googleads.v2.common.KeywordInfoOrBuilder getInfoOrBuilder();
}
