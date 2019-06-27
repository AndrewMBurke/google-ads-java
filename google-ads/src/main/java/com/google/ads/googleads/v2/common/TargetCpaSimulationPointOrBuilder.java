// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/simulation.proto

package com.google.ads.googleads.v2.common;

public interface TargetCpaSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.TargetCpaSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated target CPA upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 1;</code>
   */
  boolean hasTargetCpaMicros();
  /**
   * <pre>
   * The simulated target CPA upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 1;</code>
   */
  com.google.protobuf.Int64Value getTargetCpaMicros();
  /**
   * <pre>
   * The simulated target CPA upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTargetCpaMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  com.google.protobuf.DoubleValue getBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsOrBuilder();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  com.google.protobuf.DoubleValue getBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsValueOrBuilder();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  com.google.protobuf.Int64Value getClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getClicksOrBuilder();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  com.google.protobuf.Int64Value getCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCostMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  com.google.protobuf.Int64Value getImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  com.google.protobuf.Int64Value getTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTopSlotImpressionsOrBuilder();
}
