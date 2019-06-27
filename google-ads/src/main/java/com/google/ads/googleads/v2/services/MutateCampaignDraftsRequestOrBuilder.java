// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_draft_service.proto

package com.google.ads.googleads.v2.services;

public interface MutateCampaignDraftsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.MutateCampaignDraftsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose campaign drafts are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose campaign drafts are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The list of operations to perform on individual campaign drafts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CampaignDraftOperation operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v2.services.CampaignDraftOperation> 
      getOperationsList();
  /**
   * <pre>
   * The list of operations to perform on individual campaign drafts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CampaignDraftOperation operations = 2;</code>
   */
  com.google.ads.googleads.v2.services.CampaignDraftOperation getOperations(int index);
  /**
   * <pre>
   * The list of operations to perform on individual campaign drafts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CampaignDraftOperation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * The list of operations to perform on individual campaign drafts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CampaignDraftOperation operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.services.CampaignDraftOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations to perform on individual campaign drafts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CampaignDraftOperation operations = 2;</code>
   */
  com.google.ads.googleads.v2.services.CampaignDraftOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   */
  boolean getValidateOnly();
}
