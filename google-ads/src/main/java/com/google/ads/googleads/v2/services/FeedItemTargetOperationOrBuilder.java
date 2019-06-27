// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/feed_item_target_service.proto

package com.google.ads.googleads.v2.services;

public interface FeedItemTargetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.FeedItemTargetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item
   * target.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.FeedItemTarget create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item
   * target.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.FeedItemTarget create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.FeedItemTarget getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item
   * target.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.FeedItemTarget create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.FeedItemTargetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed feed item target is
   * expected, in this format:
   * `customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed feed item target is
   * expected, in this format:
   * `customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v2.services.FeedItemTargetOperation.OperationCase getOperationCase();
}
