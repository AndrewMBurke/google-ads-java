// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/age_range_view_service.proto

package com.google.ads.googleads.v2.services;

public final class AgeRangeViewServiceProto {
  private AgeRangeViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetAgeRangeViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetAgeRangeViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v2/services/age_r" +
      "ange_view_service.proto\022 google.ads.goog" +
      "leads.v2.services\0326google/ads/googleads/" +
      "v2/resources/age_range_view.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\"/\n\026GetAgeRangeViewRequest\022\025\n\rre" +
      "source_name\030\001 \001(\t2\352\001\n\023AgeRangeViewServic" +
      "e\022\265\001\n\017GetAgeRangeView\0228.google.ads.googl" +
      "eads.v2.services.GetAgeRangeViewRequest\032" +
      "/.google.ads.googleads.v2.resources.AgeR" +
      "angeView\"7\202\323\344\223\0021\022//v2/{resource_name=cus" +
      "tomers/*/ageRangeViews/*}\032\033\312A\030googleads." +
      "googleapis.comB\377\001\n$com.google.ads.google" +
      "ads.v2.servicesB\030AgeRangeViewServiceProt" +
      "oP\001ZHgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v2/services;services\242\002\003" +
      "GAA\252\002 Google.Ads.GoogleAds.V2.Services\312\002" +
      " Google\\Ads\\GoogleAds\\V2\\Services\352\002$Goog" +
      "le::Ads::GoogleAds::V2::Servicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.AgeRangeViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetAgeRangeViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetAgeRangeViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetAgeRangeViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.AgeRangeViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
