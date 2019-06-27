// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/landing_page_view.proto

package com.google.ads.googleads.v2.resources;

public interface LandingPageViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.LandingPageView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the landing page view.
   * Landing page view resource names have the form:
   * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the landing page view.
   * Landing page view resource names have the form:
   * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The advertiser-specified final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue unexpanded_final_url = 2;</code>
   */
  boolean hasUnexpandedFinalUrl();
  /**
   * <pre>
   * The advertiser-specified final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue unexpanded_final_url = 2;</code>
   */
  com.google.protobuf.StringValue getUnexpandedFinalUrl();
  /**
   * <pre>
   * The advertiser-specified final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue unexpanded_final_url = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getUnexpandedFinalUrlOrBuilder();
}
