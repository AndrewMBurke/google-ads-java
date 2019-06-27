// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_shared_set_service.proto

package com.google.ads.googleads.v2.services;

public final class CampaignSharedSetServiceProto {
  private CampaignSharedSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetCampaignSharedSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetCampaignSharedSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CampaignSharedSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CampaignSharedSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v2/services/campa" +
      "ign_shared_set_service.proto\022 google.ads" +
      ".googleads.v2.services\032;google/ads/googl" +
      "eads/v2/resources/campaign_shared_set.pr" +
      "oto\032\034google/api/annotations.proto\032\027googl" +
      "e/rpc/status.proto\032\027google/api/client.pr" +
      "oto\"4\n\033GetCampaignSharedSetRequest\022\025\n\rre" +
      "source_name\030\001 \001(\t\"\270\001\n\037MutateCampaignShar" +
      "edSetsRequest\022\023\n\013customer_id\030\001 \001(\t\022P\n\nop" +
      "erations\030\002 \003(\0132<.google.ads.googleads.v2" +
      ".services.CampaignSharedSetOperation\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\"\203\001\n\032CampaignSharedSetOperation\022F\n\006c" +
      "reate\030\001 \001(\01324.google.ads.googleads.v2.re" +
      "sources.CampaignSharedSetH\000\022\020\n\006remove\030\003 " +
      "\001(\tH\000B\013\n\toperation\"\247\001\n MutateCampaignSha" +
      "redSetsResponse\0221\n\025partial_failure_error" +
      "\030\003 \001(\0132\022.google.rpc.Status\022P\n\007results\030\002 " +
      "\003(\0132?.google.ads.googleads.v2.services.M" +
      "utateCampaignSharedSetResult\"6\n\035MutateCa" +
      "mpaignSharedSetResult\022\025\n\rresource_name\030\001" +
      " \001(\t2\353\003\n\030CampaignSharedSetService\022\311\001\n\024Ge" +
      "tCampaignSharedSet\022=.google.ads.googlead" +
      "s.v2.services.GetCampaignSharedSetReques" +
      "t\0324.google.ads.googleads.v2.resources.Ca" +
      "mpaignSharedSet\"<\202\323\344\223\0026\0224/v2/{resource_n" +
      "ame=customers/*/campaignSharedSets/*}\022\345\001" +
      "\n\030MutateCampaignSharedSets\022A.google.ads." +
      "googleads.v2.services.MutateCampaignShar" +
      "edSetsRequest\032B.google.ads.googleads.v2." +
      "services.MutateCampaignSharedSetsRespons" +
      "e\"B\202\323\344\223\002<\"7/v2/customers/{customer_id=*}" +
      "/campaignSharedSets:mutate:\001*\032\033\312A\030google" +
      "ads.googleapis.comB\204\002\n$com.google.ads.go" +
      "ogleads.v2.servicesB\035CampaignSharedSetSe" +
      "rviceProtoP\001ZHgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v2/services;se" +
      "rvices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V2.S" +
      "ervices\312\002 Google\\Ads\\GoogleAds\\V2\\Servic" +
      "es\352\002$Google::Ads::GoogleAds::V2::Service" +
      "sb\006proto3"
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
          com.google.ads.googleads.v2.resources.CampaignSharedSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetCampaignSharedSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetCampaignSharedSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetCampaignSharedSetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_CampaignSharedSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_CampaignSharedSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CampaignSharedSetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignSharedSetResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.CampaignSharedSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
