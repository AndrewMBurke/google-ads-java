// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/mobile_app_category_constant_service.proto

package com.google.ads.googleads.v1.services;

public final class MobileAppCategoryConstantServiceProto {
  private MobileAppCategoryConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetMobileAppCategoryConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetMobileAppCategoryConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/ads/googleads/v1/services/mobil" +
      "e_app_category_constant_service.proto\022 g" +
      "oogle.ads.googleads.v1.services\032Dgoogle/" +
      "ads/googleads/v1/resources/mobile_app_ca" +
      "tegory_constant.proto\032\034google/api/annota" +
      "tions.proto\032\027google/api/client.proto\"<\n#" +
      "GetMobileAppCategoryConstantRequest\022\025\n\rr" +
      "esource_name\030\001 \001(\t2\237\002\n MobileAppCategory" +
      "ConstantService\022\335\001\n\034GetMobileAppCategory" +
      "Constant\022E.google.ads.googleads.v1.servi" +
      "ces.GetMobileAppCategoryConstantRequest\032" +
      "<.google.ads.googleads.v1.resources.Mobi" +
      "leAppCategoryConstant\"8\202\323\344\223\0022\0220/v1/{reso" +
      "urce_name=mobileAppCategoryConstants/*}\032" +
      "\033\312A\030googleads.googleapis.comB\214\002\n$com.goo" +
      "gle.ads.googleads.v1.servicesB%MobileApp" +
      "CategoryConstantServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v1/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V1.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V1\\Services\352\002$Google::Ads::Goog" +
      "leAds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.MobileAppCategoryConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetMobileAppCategoryConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetMobileAppCategoryConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetMobileAppCategoryConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.MobileAppCategoryConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
