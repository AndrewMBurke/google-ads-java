// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/explorer_auto_optimizer_setting.proto

package com.google.ads.googleads.v2.common;

public final class ExplorerAutoOptimizerSettingProto {
  private ExplorerAutoOptimizerSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v2/common/explore" +
      "r_auto_optimizer_setting.proto\022\036google.a" +
      "ds.googleads.v2.common\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"J\n\034ExplorerAutoOptimizerSetting\022*\n\006" +
      "opt_in\030\001 \001(\0132\032.google.protobuf.BoolValue" +
      "B\374\001\n\"com.google.ads.googleads.v2.commonB" +
      "!ExplorerAutoOptimizerSettingProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v2/common;common\242\002\003GAA\252\002\036Googl" +
      "e.Ads.GoogleAds.V2.Common\312\002\036Google\\Ads\\G" +
      "oogleAds\\V2\\Common\352\002\"Google::Ads::Google" +
      "Ads::V2::Commonb\006proto3"
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
    internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_ExplorerAutoOptimizerSetting_descriptor,
        new java.lang.String[] { "OptIn", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
