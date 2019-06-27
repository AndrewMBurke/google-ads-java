// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/campaign_bid_modifier_service.proto

package com.google.ads.googleads.v1.services;

public final class CampaignBidModifierServiceProto {
  private CampaignBidModifierServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetCampaignBidModifierRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetCampaignBidModifierRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_CampaignBidModifierOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_CampaignBidModifierOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifierResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifierResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v1/services/campa" +
      "ign_bid_modifier_service.proto\022 google.a" +
      "ds.googleads.v1.services\032=google/ads/goo" +
      "gleads/v1/resources/campaign_bid_modifie" +
      "r.proto\032\034google/api/annotations.proto\032 g" +
      "oogle/protobuf/field_mask.proto\032\036google/" +
      "protobuf/wrappers.proto\032\027google/rpc/stat" +
      "us.proto\032\027google/api/client.proto\"6\n\035Get" +
      "CampaignBidModifierRequest\022\025\n\rresource_n" +
      "ame\030\001 \001(\t\"\274\001\n!MutateCampaignBidModifiers" +
      "Request\022\023\n\013customer_id\030\001 \001(\t\022R\n\noperatio" +
      "ns\030\002 \003(\0132>.google.ads.googleads.v1.servi" +
      "ces.CampaignBidModifierOperation\022\027\n\017part" +
      "ial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010" +
      "\"\202\002\n\034CampaignBidModifierOperation\022/\n\013upd" +
      "ate_mask\030\004 \001(\0132\032.google.protobuf.FieldMa" +
      "sk\022H\n\006create\030\001 \001(\01326.google.ads.googlead" +
      "s.v1.resources.CampaignBidModifierH\000\022H\n\006" +
      "update\030\002 \001(\01326.google.ads.googleads.v1.r" +
      "esources.CampaignBidModifierH\000\022\020\n\006remove" +
      "\030\003 \001(\tH\000B\013\n\toperation\"\253\001\n\"MutateCampaign" +
      "BidModifiersResponse\0221\n\025partial_failure_" +
      "error\030\003 \001(\0132\022.google.rpc.Status\022R\n\007resul" +
      "ts\030\002 \003(\0132A.google.ads.googleads.v1.servi" +
      "ces.MutateCampaignBidModifierResult\"8\n\037M" +
      "utateCampaignBidModifierResult\022\025\n\rresour" +
      "ce_name\030\001 \001(\t2\375\003\n\032CampaignBidModifierSer" +
      "vice\022\321\001\n\026GetCampaignBidModifier\022?.google" +
      ".ads.googleads.v1.services.GetCampaignBi" +
      "dModifierRequest\0326.google.ads.googleads." +
      "v1.resources.CampaignBidModifier\">\202\323\344\223\0028" +
      "\0226/v1/{resource_name=customers/*/campaig" +
      "nBidModifiers/*}\022\355\001\n\032MutateCampaignBidMo" +
      "difiers\022C.google.ads.googleads.v1.servic" +
      "es.MutateCampaignBidModifiersRequest\032D.g" +
      "oogle.ads.googleads.v1.services.MutateCa" +
      "mpaignBidModifiersResponse\"D\202\323\344\223\002>\"9/v1/" +
      "customers/{customer_id=*}/campaignBidMod" +
      "ifiers:mutate:\001*\032\033\312A\030googleads.googleapi" +
      "s.comB\206\002\n$com.google.ads.googleads.v1.se" +
      "rvicesB\037CampaignBidModifierServiceProtoP" +
      "\001ZHgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v1/services;services\242\002\003GA" +
      "A\252\002 Google.Ads.GoogleAds.V1.Services\312\002 G" +
      "oogle\\Ads\\GoogleAds\\V1\\Services\352\002$Google" +
      "::Ads::GoogleAds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.CampaignBidModifierProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetCampaignBidModifierRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetCampaignBidModifierRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetCampaignBidModifierRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_CampaignBidModifierOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_CampaignBidModifierOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_CampaignBidModifierOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifiersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifierResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifierResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCampaignBidModifierResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.CampaignBidModifierProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
