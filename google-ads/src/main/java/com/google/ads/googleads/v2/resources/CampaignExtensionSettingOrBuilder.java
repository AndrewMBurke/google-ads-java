// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_extension_setting.proto

package com.google.ads.googleads.v2.resources;

public interface CampaignExtensionSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.CampaignExtensionSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the campaign extension setting.
   * CampaignExtensionSetting resource names have the form:
   * `customers/{customer_id}/campaignExtensionSettings/{campaign_id}~{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the campaign extension setting.
   * CampaignExtensionSetting resource names have the form:
   * `customers/{customer_id}/campaignExtensionSettings/{campaign_id}~{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The extension type of the customer extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ExtensionTypeEnum.ExtensionType extension_type = 2;</code>
   */
  int getExtensionTypeValue();
  /**
   * <pre>
   * The extension type of the customer extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ExtensionTypeEnum.ExtensionType extension_type = 2;</code>
   */
  com.google.ads.googleads.v2.enums.ExtensionTypeEnum.ExtensionType getExtensionType();

  /**
   * <pre>
   * The resource name of the campaign. The linked extension feed items will
   * serve under this campaign.
   * Campaign resource names have the form:
   * `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 3;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The resource name of the campaign. The linked extension feed items will
   * serve under this campaign.
   * Campaign resource names have the form:
   * `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 3;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The resource name of the campaign. The linked extension feed items will
   * serve under this campaign.
   * Campaign resource names have the form:
   * `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * The resource names of the extension feed items to serve under the campaign.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getExtensionFeedItemsList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the campaign.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4;</code>
   */
  com.google.protobuf.StringValue getExtensionFeedItems(int index);
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the campaign.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4;</code>
   */
  int getExtensionFeedItemsCount();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the campaign.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getExtensionFeedItemsOrBuilderList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the campaign.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getExtensionFeedItemsOrBuilder(
      int index);

  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 5;</code>
   */
  int getDeviceValue();
  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 5;</code>
   */
  com.google.ads.googleads.v2.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice getDevice();
}
