// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/topic_constant.proto

package com.google.ads.googleads.v2.resources;

public interface TopicConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.TopicConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the topic constant.
   * topic constant resource names have the form:
   * `topicConstants/{topic_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the topic constant.
   * topic constant resource names have the form:
   * `topicConstants/{topic_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the topic.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the topic.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the topic.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Resource name of parent of the topic constant.
   * </pre>
   *
   * <code>.google.protobuf.StringValue topic_constant_parent = 3;</code>
   */
  boolean hasTopicConstantParent();
  /**
   * <pre>
   * Resource name of parent of the topic constant.
   * </pre>
   *
   * <code>.google.protobuf.StringValue topic_constant_parent = 3;</code>
   */
  com.google.protobuf.StringValue getTopicConstantParent();
  /**
   * <pre>
   * Resource name of parent of the topic constant.
   * </pre>
   *
   * <code>.google.protobuf.StringValue topic_constant_parent = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTopicConstantParentOrBuilder();

  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 4;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getPathList();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 4;</code>
   */
  com.google.protobuf.StringValue getPath(int index);
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 4;</code>
   */
  int getPathCount();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getPathOrBuilderList();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPathOrBuilder(
      int index);
}
