// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/conversion_upload_service.proto

package com.google.ads.googleads.v2.services;

public interface ClickConversionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.ClickConversionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  boolean hasGclid();
  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  com.google.protobuf.StringValue getGclid();
  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getGclidOrBuilder();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   */
  com.google.protobuf.StringValue getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder();

  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   */
  com.google.protobuf.StringValue getConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionDateTimeOrBuilder();
}
