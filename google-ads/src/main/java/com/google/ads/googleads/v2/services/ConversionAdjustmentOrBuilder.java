// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v2.services;

public interface ConversionAdjustmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.ConversionAdjustment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 3;</code>
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 3;</code>
   */
  com.google.protobuf.StringValue getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder();

  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue adjustment_date_time = 4;</code>
   */
  boolean hasAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue adjustment_date_time = 4;</code>
   */
  com.google.protobuf.StringValue getAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue adjustment_date_time = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdjustmentDateTimeOrBuilder();

  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   */
  int getAdjustmentTypeValue();
  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   */
  com.google.ads.googleads.v2.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType getAdjustmentType();

  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.RestatementValue restatement_value = 6;</code>
   */
  boolean hasRestatementValue();
  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.RestatementValue restatement_value = 6;</code>
   */
  com.google.ads.googleads.v2.services.RestatementValue getRestatementValue();
  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.RestatementValue restatement_value = 6;</code>
   */
  com.google.ads.googleads.v2.services.RestatementValueOrBuilder getRestatementValueOrBuilder();

  /**
   * <pre>
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.GclidDateTimePair gclid_date_time_pair = 1;</code>
   */
  boolean hasGclidDateTimePair();
  /**
   * <pre>
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.GclidDateTimePair gclid_date_time_pair = 1;</code>
   */
  com.google.ads.googleads.v2.services.GclidDateTimePair getGclidDateTimePair();
  /**
   * <pre>
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.GclidDateTimePair gclid_date_time_pair = 1;</code>
   */
  com.google.ads.googleads.v2.services.GclidDateTimePairOrBuilder getGclidDateTimePairOrBuilder();

  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 2;</code>
   */
  boolean hasOrderId();
  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 2;</code>
   */
  com.google.protobuf.StringValue getOrderId();
  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getOrderIdOrBuilder();

  public com.google.ads.googleads.v2.services.ConversionAdjustment.ConversionIdentifierCase getConversionIdentifierCase();
}
