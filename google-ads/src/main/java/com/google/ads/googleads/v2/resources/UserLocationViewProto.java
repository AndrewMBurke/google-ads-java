// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/user_location_view.proto

package com.google.ads.googleads.v2.resources;

public final class UserLocationViewProto {
  private UserLocationViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_UserLocationView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_UserLocationView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v2/resources/user" +
      "_location_view.proto\022!google.ads.googlea" +
      "ds.v2.resources\032\036google/protobuf/wrapper" +
      "s.proto\032\034google/api/annotations.proto\"\234\001" +
      "\n\020UserLocationView\022\025\n\rresource_name\030\001 \001(" +
      "\t\0229\n\024country_criterion_id\030\002 \001(\0132\033.google" +
      ".protobuf.Int64Value\0226\n\022targeting_locati" +
      "on\030\003 \001(\0132\032.google.protobuf.BoolValueB\202\002\n" +
      "%com.google.ads.googleads.v2.resourcesB\025" +
      "UserLocationViewProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v2/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V2.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V2\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V2::Resourcesb\006proto3"
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
    internal_static_google_ads_googleads_v2_resources_UserLocationView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_UserLocationView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_UserLocationView_descriptor,
        new java.lang.String[] { "ResourceName", "CountryCriterionId", "TargetingLocation", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
