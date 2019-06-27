// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/ad_service.proto

package com.google.ads.googleads.v2.services;

public interface AdOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.AdOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Update operation: The ad is expected to have a valid resource name
   * in this format:
   * `customers/{customer_id}/ads/{ad_id}`
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Ad update = 1;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The ad is expected to have a valid resource name
   * in this format:
   * `customers/{customer_id}/ads/{ad_id}`
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Ad update = 1;</code>
   */
  com.google.ads.googleads.v2.resources.Ad getUpdate();
  /**
   * <pre>
   * Update operation: The ad is expected to have a valid resource name
   * in this format:
   * `customers/{customer_id}/ads/{ad_id}`
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Ad update = 1;</code>
   */
  com.google.ads.googleads.v2.resources.AdOrBuilder getUpdateOrBuilder();

  public com.google.ads.googleads.v2.services.AdOperation.OperationCase getOperationCase();
}
