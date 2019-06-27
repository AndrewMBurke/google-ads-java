// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/segments.proto

package com.google.ads.googleads.v2.common;

public final class SegmentsProto {
  private SegmentsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_Segments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_Segments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_Keyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_Keyword_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v2/common/segment" +
      "s.proto\022\036google.ads.googleads.v2.common\032" +
      "-google/ads/googleads/v2/common/criteria" +
      ".proto\0323google/ads/googleads/v2/enums/ad" +
      "_network_type.proto\032.google/ads/googlead" +
      "s/v2/enums/click_type.proto\032>google/ads/" +
      "googleads/v2/enums/conversion_action_cat" +
      "egory.proto\032Egoogle/ads/googleads/v2/enu" +
      "ms/conversion_attribution_event_type.pro" +
      "to\0329google/ads/googleads/v2/enums/conver" +
      "sion_lag_bucket.proto\032Ggoogle/ads/google" +
      "ads/v2/enums/conversion_or_adjustment_la" +
      "g_bucket.proto\032/google/ads/googleads/v2/" +
      "enums/day_of_week.proto\032*google/ads/goog" +
      "leads/v2/enums/device.proto\032>google/ads/" +
      "googleads/v2/enums/external_conversion_s" +
      "ource.proto\032=google/ads/googleads/v2/enu" +
      "ms/hotel_date_selection_type.proto\0323goog" +
      "le/ads/googleads/v2/enums/hotel_rate_typ" +
      "e.proto\0321google/ads/googleads/v2/enums/m" +
      "onth_of_year.proto\0324google/ads/googleads" +
      "/v2/enums/placeholder_type.proto\0323google" +
      "/ads/googleads/v2/enums/product_channel." +
      "proto\032?google/ads/googleads/v2/enums/pro" +
      "duct_channel_exclusivity.proto\0325google/a" +
      "ds/googleads/v2/enums/product_condition." +
      "proto\032Cgoogle/ads/googleads/v2/enums/sea" +
      "rch_engine_results_page_type.proto\032:goog" +
      "le/ads/googleads/v2/enums/search_term_ma" +
      "tch_type.proto\032(google/ads/googleads/v2/" +
      "enums/slot.proto\032\036google/protobuf/wrappe" +
      "rs.proto\032\034google/api/annotations.proto\"\317" +
      ")\n\010Segments\022W\n\017ad_network_type\030\003 \001(\0162>.g" +
      "oogle.ads.googleads.v2.enums.AdNetworkTy" +
      "peEnum.AdNetworkType\022J\n\nclick_type\030\032 \001(\016" +
      "26.google.ads.googleads.v2.enums.ClickTy" +
      "peEnum.ClickType\0227\n\021conversion_action\0304 " +
      "\001(\0132\034.google.protobuf.StringValue\022x\n\032con" +
      "version_action_category\0305 \001(\0162T.google.a" +
      "ds.googleads.v2.enums.ConversionActionCa" +
      "tegoryEnum.ConversionActionCategory\022<\n\026c" +
      "onversion_action_name\0306 \001(\0132\034.google.pro" +
      "tobuf.StringValue\0229\n\025conversion_adjustme" +
      "nt\030\033 \001(\0132\032.google.protobuf.BoolValue\022\213\001\n" +
      "!conversion_attribution_event_type\030\002 \001(\016" +
      "2`.google.ads.googleads.v2.enums.Convers" +
      "ionAttributionEventTypeEnum.ConversionAt" +
      "tributionEventType\022i\n\025conversion_lag_buc" +
      "ket\0302 \001(\0162J.google.ads.googleads.v2.enum" +
      "s.ConversionLagBucketEnum.ConversionLagB" +
      "ucket\022\217\001\n#conversion_or_adjustment_lag_b" +
      "ucket\0303 \001(\0162b.google.ads.googleads.v2.en" +
      "ums.ConversionOrAdjustmentLagBucketEnum." +
      "ConversionOrAdjustmentLagBucket\022*\n\004date\030" +
      "\004 \001(\0132\034.google.protobuf.StringValue\022K\n\013d" +
      "ay_of_week\030\005 \001(\01626.google.ads.googleads." +
      "v2.enums.DayOfWeekEnum.DayOfWeek\022@\n\006devi" +
      "ce\030\001 \001(\01620.google.ads.googleads.v2.enums" +
      ".DeviceEnum.Device\022x\n\032external_conversio" +
      "n_source\0307 \001(\0162T.google.ads.googleads.v2" +
      ".enums.ExternalConversionSourceEnum.Exte" +
      "rnalConversionSource\0228\n\022geo_target_airpo" +
      "rt\030A \001(\0132\034.google.protobuf.StringValue\0227" +
      "\n\021geo_target_canton\030L \001(\0132\034.google.proto" +
      "buf.StringValue\0225\n\017geo_target_city\030> \001(\013" +
      "2\034.google.protobuf.StringValue\0228\n\022geo_ta" +
      "rget_country\030M \001(\0132\034.google.protobuf.Str" +
      "ingValue\0227\n\021geo_target_county\030D \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0229\n\023geo_target_" +
      "district\030E \001(\0132\034.google.protobuf.StringV" +
      "alue\0226\n\020geo_target_metro\030? \001(\0132\034.google." +
      "protobuf.StringValue\022G\n!geo_target_most_" +
      "specific_location\030H \001(\0132\034.google.protobu" +
      "f.StringValue\022<\n\026geo_target_postal_code\030" +
      "G \001(\0132\034.google.protobuf.StringValue\0229\n\023g" +
      "eo_target_province\030K \001(\0132\034.google.protob" +
      "uf.StringValue\0227\n\021geo_target_region\030@ \001(" +
      "\0132\034.google.protobuf.StringValue\0226\n\020geo_t" +
      "arget_state\030C \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022>\n\031hotel_booking_window_days\030\006 \001" +
      "(\0132\033.google.protobuf.Int64Value\0224\n\017hotel" +
      "_center_id\030\007 \001(\0132\033.google.protobuf.Int64" +
      "Value\0229\n\023hotel_check_in_date\030\010 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022Z\n\032hotel_check_" +
      "in_day_of_week\030\t \001(\01626.google.ads.google" +
      "ads.v2.enums.DayOfWeekEnum.DayOfWeek\0220\n\n" +
      "hotel_city\030\n \001(\0132\034.google.protobuf.Strin" +
      "gValue\0220\n\013hotel_class\030\013 \001(\0132\033.google.pro" +
      "tobuf.Int32Value\0223\n\rhotel_country\030\014 \001(\0132" +
      "\034.google.protobuf.StringValue\022s\n\031hotel_d" +
      "ate_selection_type\030\r \001(\0162P.google.ads.go" +
      "ogleads.v2.enums.HotelDateSelectionTypeE" +
      "num.HotelDateSelectionType\0229\n\024hotel_leng" +
      "th_of_stay\030\016 \001(\0132\033.google.protobuf.Int32" +
      "Value\0228\n\022hotel_rate_rule_id\030I \001(\0132\034.goog" +
      "le.protobuf.StringValue\022W\n\017hotel_rate_ty" +
      "pe\030J \001(\0162>.google.ads.googleads.v2.enums" +
      ".HotelRateTypeEnum.HotelRateType\0221\n\013hote" +
      "l_state\030\017 \001(\0132\034.google.protobuf.StringVa" +
      "lue\022)\n\004hour\030\020 \001(\0132\033.google.protobuf.Int3" +
      "2Value\022A\n\035interaction_on_this_extension\030" +
      "1 \001(\0132\032.google.protobuf.BoolValue\0228\n\007key" +
      "word\030= \001(\0132\'.google.ads.googleads.v2.com" +
      "mon.Keyword\022+\n\005month\030\021 \001(\0132\034.google.prot" +
      "obuf.StringValue\022Q\n\rmonth_of_year\030\022 \001(\0162" +
      ":.google.ads.googleads.v2.enums.MonthOfY" +
      "earEnum.MonthOfYear\0226\n\020partner_hotel_id\030" +
      "\023 \001(\0132\034.google.protobuf.StringValue\022\\\n\020p" +
      "laceholder_type\030\024 \001(\0162B.google.ads.googl" +
      "eads.v2.enums.PlaceholderTypeEnum.Placeh" +
      "olderType\022;\n\025product_aggregator_id\030\034 \001(\013" +
      "2\034.google.protobuf.UInt64Value\022E\n\037produc" +
      "t_bidding_category_level1\0308 \001(\0132\034.google" +
      ".protobuf.StringValue\022E\n\037product_bidding" +
      "_category_level2\0309 \001(\0132\034.google.protobuf" +
      ".StringValue\022E\n\037product_bidding_category" +
      "_level3\030: \001(\0132\034.google.protobuf.StringVa" +
      "lue\022E\n\037product_bidding_category_level4\030;" +
      " \001(\0132\034.google.protobuf.StringValue\022E\n\037pr" +
      "oduct_bidding_category_level5\030< \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0223\n\rproduct_bra" +
      "nd\030\035 \001(\0132\034.google.protobuf.StringValue\022Y" +
      "\n\017product_channel\030\036 \001(\0162@.google.ads.goo" +
      "gleads.v2.enums.ProductChannelEnum.Produ" +
      "ctChannel\022{\n\033product_channel_exclusivity" +
      "\030\037 \001(\0162V.google.ads.googleads.v2.enums.P" +
      "roductChannelExclusivityEnum.ProductChan" +
      "nelExclusivity\022_\n\021product_condition\030  \001(" +
      "\0162D.google.ads.googleads.v2.enums.Produc" +
      "tConditionEnum.ProductCondition\0225\n\017produ" +
      "ct_country\030! \001(\0132\034.google.protobuf.Strin" +
      "gValue\022?\n\031product_custom_attribute0\030\" \001(" +
      "\0132\034.google.protobuf.StringValue\022?\n\031produ" +
      "ct_custom_attribute1\030# \001(\0132\034.google.prot" +
      "obuf.StringValue\022?\n\031product_custom_attri" +
      "bute2\030$ \001(\0132\034.google.protobuf.StringValu" +
      "e\022?\n\031product_custom_attribute3\030% \001(\0132\034.g" +
      "oogle.protobuf.StringValue\022?\n\031product_cu" +
      "stom_attribute4\030& \001(\0132\034.google.protobuf." +
      "StringValue\0225\n\017product_item_id\030\' \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0226\n\020product_la" +
      "nguage\030( \001(\0132\034.google.protobuf.StringVal" +
      "ue\0229\n\023product_merchant_id\030) \001(\0132\034.google" +
      ".protobuf.UInt64Value\0226\n\020product_store_i" +
      "d\030* \001(\0132\034.google.protobuf.StringValue\0223\n" +
      "\rproduct_title\030+ \001(\0132\034.google.protobuf.S" +
      "tringValue\0225\n\017product_type_l1\030, \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0225\n\017product_typ" +
      "e_l2\030- \001(\0132\034.google.protobuf.StringValue" +
      "\0225\n\017product_type_l3\030. \001(\0132\034.google.proto" +
      "buf.StringValue\0225\n\017product_type_l4\030/ \001(\013" +
      "2\034.google.protobuf.StringValue\0225\n\017produc" +
      "t_type_l5\0300 \001(\0132\034.google.protobuf.String" +
      "Value\022-\n\007quarter\030\025 \001(\0132\034.google.protobuf" +
      ".StringValue\022\203\001\n\037search_engine_results_p" +
      "age_type\030F \001(\0162Z.google.ads.googleads.v2" +
      ".enums.SearchEngineResultsPageTypeEnum.S" +
      "earchEngineResultsPageType\022j\n\026search_ter" +
      "m_match_type\030\026 \001(\0162J.google.ads.googlead" +
      "s.v2.enums.SearchTermMatchTypeEnum.Searc" +
      "hTermMatchType\022:\n\004slot\030\027 \001(\0162,.google.ad" +
      "s.googleads.v2.enums.SlotEnum.Slot\022-\n\007we" +
      "bpage\030B \001(\0132\034.google.protobuf.StringValu" +
      "e\022*\n\004week\030\030 \001(\0132\034.google.protobuf.String" +
      "Value\022)\n\004year\030\031 \001(\0132\033.google.protobuf.In" +
      "t32Value\"~\n\007Keyword\0228\n\022ad_group_criterio" +
      "n\030\001 \001(\0132\034.google.protobuf.StringValue\0229\n" +
      "\004info\030\002 \001(\0132+.google.ads.googleads.v2.co" +
      "mmon.KeywordInfoB\350\001\n\"com.google.ads.goog" +
      "leads.v2.commonB\rSegmentsProtoP\001ZDgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v2/common;common\242\002\003GAA\252\002\036Google.Ad" +
      "s.GoogleAds.V2.Common\312\002\036Google\\Ads\\Googl" +
      "eAds\\V2\\Common\352\002\"Google::Ads::GoogleAds:" +
      ":V2::Commonb\006proto3"
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
          com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AdNetworkTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ClickTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionAttributionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.DayOfWeekProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ExternalConversionSourceProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.HotelDateSelectionTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.HotelRateTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ProductChannelExclusivityProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SearchEngineResultsPageTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SearchTermMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SlotProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_common_Segments_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_common_Segments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_Segments_descriptor,
        new java.lang.String[] { "AdNetworkType", "ClickType", "ConversionAction", "ConversionActionCategory", "ConversionActionName", "ConversionAdjustment", "ConversionAttributionEventType", "ConversionLagBucket", "ConversionOrAdjustmentLagBucket", "Date", "DayOfWeek", "Device", "ExternalConversionSource", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCheckInDayOfWeek", "HotelCity", "HotelClass", "HotelCountry", "HotelDateSelectionType", "HotelLengthOfStay", "HotelRateRuleId", "HotelRateType", "HotelState", "Hour", "InteractionOnThisExtension", "Keyword", "Month", "MonthOfYear", "PartnerHotelId", "PlaceholderType", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductChannel", "ProductChannelExclusivity", "ProductCondition", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "SearchEngineResultsPageType", "SearchTermMatchType", "Slot", "Webpage", "Week", "Year", });
    internal_static_google_ads_googleads_v2_common_Keyword_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_common_Keyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_Keyword_descriptor,
        new java.lang.String[] { "AdGroupCriterion", "Info", });
    com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AdNetworkTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ClickTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionAttributionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionLagBucketProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor();
    com.google.ads.googleads.v2.enums.DayOfWeekProto.getDescriptor();
    com.google.ads.googleads.v2.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ExternalConversionSourceProto.getDescriptor();
    com.google.ads.googleads.v2.enums.HotelDateSelectionTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.HotelRateTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ProductChannelProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ProductChannelExclusivityProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ProductConditionProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SearchEngineResultsPageTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SearchTermMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SlotProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
