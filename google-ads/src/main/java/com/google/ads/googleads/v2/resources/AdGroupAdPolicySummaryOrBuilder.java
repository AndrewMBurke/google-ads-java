// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/ad_group_ad.proto

package com.google.ads.googleads.v2.resources;

public interface AdGroupAdPolicySummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.AdGroupAdPolicySummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of policy findings for this ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * The list of policy findings for this ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v2.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * The list of policy findings for this ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * The list of policy findings for this ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * The list of policy findings for this ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v2.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Where in the review process this ad is.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2;</code>
   */
  int getReviewStatusValue();
  /**
   * <pre>
   * Where in the review process this ad is.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2;</code>
   */
  com.google.ads.googleads.v2.enums.PolicyReviewStatusEnum.PolicyReviewStatus getReviewStatus();

  /**
   * <pre>
   * The overall approval status of this ad, calculated based on the status of
   * its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3;</code>
   */
  int getApprovalStatusValue();
  /**
   * <pre>
   * The overall approval status of this ad, calculated based on the status of
   * its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3;</code>
   */
  com.google.ads.googleads.v2.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus getApprovalStatus();
}
