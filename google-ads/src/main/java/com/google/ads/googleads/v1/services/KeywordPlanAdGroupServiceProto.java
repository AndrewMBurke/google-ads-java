// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_ad_group_service.proto

package com.google.ads.googleads.v1.services;

public final class KeywordPlanAdGroupServiceProto {
  private KeywordPlanAdGroupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanAdGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetKeywordPlanAdGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v1/services/keywo" +
      "rd_plan_ad_group_service.proto\022 google.a" +
      "ds.googleads.v1.services\032=google/ads/goo" +
      "gleads/v1/resources/keyword_plan_ad_grou" +
      "p.proto\032\034google/api/annotations.proto\032 g" +
      "oogle/protobuf/field_mask.proto\032\036google/" +
      "protobuf/wrappers.proto\032\027google/rpc/stat" +
      "us.proto\032\027google/api/client.proto\"5\n\034Get" +
      "KeywordPlanAdGroupRequest\022\025\n\rresource_na" +
      "me\030\001 \001(\t\"\272\001\n MutateKeywordPlanAdGroupsRe" +
      "quest\022\023\n\013customer_id\030\001 \001(\t\022Q\n\noperations" +
      "\030\002 \003(\0132=.google.ads.googleads.v1.service" +
      "s.KeywordPlanAdGroupOperation\022\027\n\017partial" +
      "_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\377\001" +
      "\n\033KeywordPlanAdGroupOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022G" +
      "\n\006create\030\001 \001(\01325.google.ads.googleads.v1" +
      ".resources.KeywordPlanAdGroupH\000\022G\n\006updat" +
      "e\030\002 \001(\01325.google.ads.googleads.v1.resour" +
      "ces.KeywordPlanAdGroupH\000\022\020\n\006remove\030\003 \001(\t" +
      "H\000B\013\n\toperation\"\251\001\n!MutateKeywordPlanAdG" +
      "roupsResponse\0221\n\025partial_failure_error\030\003" +
      " \001(\0132\022.google.rpc.Status\022Q\n\007results\030\002 \003(" +
      "\0132@.google.ads.googleads.v1.services.Mut" +
      "ateKeywordPlanAdGroupResult\"7\n\036MutateKey" +
      "wordPlanAdGroupResult\022\025\n\rresource_name\030\001" +
      " \001(\t2\364\003\n\031KeywordPlanAdGroupService\022\315\001\n\025G" +
      "etKeywordPlanAdGroup\022>.google.ads.google" +
      "ads.v1.services.GetKeywordPlanAdGroupReq" +
      "uest\0325.google.ads.googleads.v1.resources" +
      ".KeywordPlanAdGroup\"=\202\323\344\223\0027\0225/v1/{resour" +
      "ce_name=customers/*/keywordPlanAdGroups/" +
      "*}\022\351\001\n\031MutateKeywordPlanAdGroups\022B.googl" +
      "e.ads.googleads.v1.services.MutateKeywor" +
      "dPlanAdGroupsRequest\032C.google.ads.google" +
      "ads.v1.services.MutateKeywordPlanAdGroup" +
      "sResponse\"C\202\323\344\223\002=\"8/v1/customers/{custom" +
      "er_id=*}/keywordPlanAdGroups:mutate:\001*\032\033" +
      "\312A\030googleads.googleapis.comB\205\002\n$com.goog" +
      "le.ads.googleads.v1.servicesB\036KeywordPla" +
      "nAdGroupServiceProtoP\001ZHgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v1/s" +
      "ervices;services\242\002\003GAA\252\002 Google.Ads.Goog" +
      "leAds.V1.Services\312\002 Google\\Ads\\GoogleAds" +
      "\\V1\\Services\352\002$Google::Ads::GoogleAds::V" +
      "1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.KeywordPlanAdGroupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanAdGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanAdGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetKeywordPlanAdGroupRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanAdGroupResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.KeywordPlanAdGroupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
