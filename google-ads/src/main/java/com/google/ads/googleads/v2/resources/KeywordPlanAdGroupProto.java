// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/keyword_plan_ad_group.proto

package com.google.ads.googleads.v2.resources;

public final class KeywordPlanAdGroupProto {
  private KeywordPlanAdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v2/resources/keyw" +
      "ord_plan_ad_group.proto\022!google.ads.goog" +
      "leads.v2.resources\032\036google/protobuf/wrap" +
      "pers.proto\032\034google/api/annotations.proto" +
      "\"\362\001\n\022KeywordPlanAdGroup\022\025\n\rresource_name" +
      "\030\001 \001(\t\022;\n\025keyword_plan_campaign\030\002 \001(\0132\034." +
      "google.protobuf.StringValue\022\'\n\002id\030\003 \001(\0132" +
      "\033.google.protobuf.Int64Value\022*\n\004name\030\004 \001" +
      "(\0132\034.google.protobuf.StringValue\0223\n\016cpc_" +
      "bid_micros\030\005 \001(\0132\033.google.protobuf.Int64" +
      "ValueB\204\002\n%com.google.ads.googleads.v2.re" +
      "sourcesB\027KeywordPlanAdGroupProtoP\001ZJgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v2/resources;resources\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V2.Resources\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V2\\Resources\352\002%Google::A" +
      "ds::GoogleAds::V2::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanCampaign", "Id", "Name", "CpcBidMicros", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
