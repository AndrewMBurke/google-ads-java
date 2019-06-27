// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/shared_criterion_service.proto

package com.google.ads.googleads.v1.services;

public final class SharedCriterionServiceProto {
  private SharedCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetSharedCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetSharedCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_SharedCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_SharedCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateSharedCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateSharedCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v1/services/share" +
      "d_criterion_service.proto\022 google.ads.go" +
      "ogleads.v1.services\0328google/ads/googlead" +
      "s/v1/resources/shared_criterion.proto\032\034g" +
      "oogle/api/annotations.proto\032\036google/prot" +
      "obuf/wrappers.proto\032\027google/rpc/status.p" +
      "roto\032\027google/api/client.proto\"2\n\031GetShar" +
      "edCriterionRequest\022\025\n\rresource_name\030\001 \001(" +
      "\t\"\262\001\n\033MutateSharedCriteriaRequest\022\023\n\013cus" +
      "tomer_id\030\001 \001(\t\022N\n\noperations\030\002 \003(\0132:.goo" +
      "gle.ads.googleads.v1.services.SharedCrit" +
      "erionOperation\022\027\n\017partial_failure\030\003 \001(\010\022" +
      "\025\n\rvalidate_only\030\004 \001(\010\"\177\n\030SharedCriterio" +
      "nOperation\022D\n\006create\030\001 \001(\01322.google.ads." +
      "googleads.v1.resources.SharedCriterionH\000" +
      "\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\241\001\n\034Muta" +
      "teSharedCriteriaResponse\0221\n\025partial_fail" +
      "ure_error\030\003 \001(\0132\022.google.rpc.Status\022N\n\007r" +
      "esults\030\002 \003(\0132=.google.ads.googleads.v1.s" +
      "ervices.MutateSharedCriterionResult\"4\n\033M" +
      "utateSharedCriterionResult\022\025\n\rresource_n" +
      "ame\030\001 \001(\t2\317\003\n\026SharedCriterionService\022\277\001\n" +
      "\022GetSharedCriterion\022;.google.ads.googlea" +
      "ds.v1.services.GetSharedCriterionRequest" +
      "\0322.google.ads.googleads.v1.resources.Sha" +
      "redCriterion\"8\202\323\344\223\0022\0220/v1/{resource_name" +
      "=customers/*/sharedCriteria/*}\022\325\001\n\024Mutat" +
      "eSharedCriteria\022=.google.ads.googleads.v" +
      "1.services.MutateSharedCriteriaRequest\032>" +
      ".google.ads.googleads.v1.services.Mutate" +
      "SharedCriteriaResponse\">\202\323\344\223\0028\"3/v1/cust" +
      "omers/{customer_id=*}/sharedCriteria:mut" +
      "ate:\001*\032\033\312A\030googleads.googleapis.comB\202\002\n$" +
      "com.google.ads.googleads.v1.servicesB\033Sh" +
      "aredCriterionServiceProtoP\001ZHgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v1/services;services\242\002\003GAA\252\002 Google.Ads" +
      ".GoogleAds.V1.Services\312\002 Google\\Ads\\Goog" +
      "leAds\\V1\\Services\352\002$Google::Ads::GoogleA" +
      "ds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.SharedCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetSharedCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetSharedCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetSharedCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_SharedCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_SharedCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_SharedCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateSharedCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateSharedCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateSharedCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateSharedCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.SharedCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
