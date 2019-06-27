// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_bid_modifier_service.proto

package com.google.ads.googleads.v2.services;

public interface CampaignBidModifierOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CampaignBidModifierOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign bid
   * modifier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignBidModifier create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign bid
   * modifier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignBidModifier create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignBidModifier getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign bid
   * modifier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignBidModifier create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignBidModifierOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The campaign bid modifier is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignBidModifier update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The campaign bid modifier is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignBidModifier update = 2;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignBidModifier getUpdate();
  /**
   * <pre>
   * Update operation: The campaign bid modifier is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignBidModifier update = 2;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignBidModifierOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign bid modifier
   * is expected, in this format:
   * `customers/{customer_id}/CampaignBidModifiers/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign bid modifier
   * is expected, in this format:
   * `customers/{customer_id}/CampaignBidModifiers/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v2.services.CampaignBidModifierOperation.OperationCase getOperationCase();
}
