// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/hotel_group_view_service.proto

package com.google.ads.googleads.v2.services;

public final class HotelGroupViewServiceProto {
  private HotelGroupViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v2/services/hotel" +
      "_group_view_service.proto\022 google.ads.go" +
      "ogleads.v2.services\0328google/ads/googlead" +
      "s/v2/resources/hotel_group_view.proto\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\"1\n\030GetHotelGroupViewRequest" +
      "\022\025\n\rresource_name\030\001 \001(\t2\364\001\n\025HotelGroupVi" +
      "ewService\022\275\001\n\021GetHotelGroupView\022:.google" +
      ".ads.googleads.v2.services.GetHotelGroup" +
      "ViewRequest\0321.google.ads.googleads.v2.re" +
      "sources.HotelGroupView\"9\202\323\344\223\0023\0221/v2/{res" +
      "ource_name=customers/*/hotelGroupViews/*" +
      "}\032\033\312A\030googleads.googleapis.comB\201\002\n$com.g" +
      "oogle.ads.googleads.v2.servicesB\032HotelGr" +
      "oupViewServiceProtoP\001ZHgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v2/se" +
      "rvices;services\242\002\003GAA\252\002 Google.Ads.Googl" +
      "eAds.V2.Services\312\002 Google\\Ads\\GoogleAds\\" +
      "V2\\Services\352\002$Google::Ads::GoogleAds::V2" +
      "::Servicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.HotelGroupViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.HotelGroupViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
