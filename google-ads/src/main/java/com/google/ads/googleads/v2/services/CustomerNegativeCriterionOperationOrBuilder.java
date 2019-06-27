// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/customer_negative_criterion_service.proto

package com.google.ads.googleads.v2.services;

public interface CustomerNegativeCriterionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CustomerNegativeCriterionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomerNegativeCriterion create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomerNegativeCriterion create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CustomerNegativeCriterion getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomerNegativeCriterion create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CustomerNegativeCriterionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   * `customers/{customer_id}/customerNegativeCriteria/{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   * `customers/{customer_id}/customerNegativeCriteria/{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v2.services.CustomerNegativeCriterionOperation.OperationCase getOperationCase();
}
