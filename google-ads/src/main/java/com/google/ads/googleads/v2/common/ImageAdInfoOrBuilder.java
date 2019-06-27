// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/ad_type_infos.proto

package com.google.ads.googleads.v2.common;

public interface ImageAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.ImageAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Width in pixels of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pixel_width = 4;</code>
   */
  boolean hasPixelWidth();
  /**
   * <pre>
   * Width in pixels of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pixel_width = 4;</code>
   */
  com.google.protobuf.Int64Value getPixelWidth();
  /**
   * <pre>
   * Width in pixels of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pixel_width = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPixelWidthOrBuilder();

  /**
   * <pre>
   * Height in pixels of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pixel_height = 5;</code>
   */
  boolean hasPixelHeight();
  /**
   * <pre>
   * Height in pixels of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pixel_height = 5;</code>
   */
  com.google.protobuf.Int64Value getPixelHeight();
  /**
   * <pre>
   * Height in pixels of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value pixel_height = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPixelHeightOrBuilder();

  /**
   * <pre>
   * URL of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue image_url = 6;</code>
   */
  boolean hasImageUrl();
  /**
   * <pre>
   * URL of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue image_url = 6;</code>
   */
  com.google.protobuf.StringValue getImageUrl();
  /**
   * <pre>
   * URL of the full size image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue image_url = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getImageUrlOrBuilder();

  /**
   * <pre>
   * Width in pixels of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value preview_pixel_width = 7;</code>
   */
  boolean hasPreviewPixelWidth();
  /**
   * <pre>
   * Width in pixels of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value preview_pixel_width = 7;</code>
   */
  com.google.protobuf.Int64Value getPreviewPixelWidth();
  /**
   * <pre>
   * Width in pixels of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value preview_pixel_width = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPreviewPixelWidthOrBuilder();

  /**
   * <pre>
   * Height in pixels of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value preview_pixel_height = 8;</code>
   */
  boolean hasPreviewPixelHeight();
  /**
   * <pre>
   * Height in pixels of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value preview_pixel_height = 8;</code>
   */
  com.google.protobuf.Int64Value getPreviewPixelHeight();
  /**
   * <pre>
   * Height in pixels of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value preview_pixel_height = 8;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPreviewPixelHeightOrBuilder();

  /**
   * <pre>
   * URL of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue preview_image_url = 9;</code>
   */
  boolean hasPreviewImageUrl();
  /**
   * <pre>
   * URL of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue preview_image_url = 9;</code>
   */
  com.google.protobuf.StringValue getPreviewImageUrl();
  /**
   * <pre>
   * URL of the preview size image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue preview_image_url = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPreviewImageUrlOrBuilder();

  /**
   * <pre>
   * The mime type of the image.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MimeTypeEnum.MimeType mime_type = 10;</code>
   */
  int getMimeTypeValue();
  /**
   * <pre>
   * The mime type of the image.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MimeTypeEnum.MimeType mime_type = 10;</code>
   */
  com.google.ads.googleads.v2.enums.MimeTypeEnum.MimeType getMimeType();

  /**
   * <pre>
   * The name of the image. If the image was created from a MediaFile, this is
   * the MediaFile's name. If the image was created from bytes, this is empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 11;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the image. If the image was created from a MediaFile, this is
   * the MediaFile's name. If the image was created from bytes, this is empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 11;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the image. If the image was created from a MediaFile, this is
   * the MediaFile's name. If the image was created from bytes, this is empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The MediaFile resource to use for the image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue media_file = 1;</code>
   */
  boolean hasMediaFile();
  /**
   * <pre>
   * The MediaFile resource to use for the image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue media_file = 1;</code>
   */
  com.google.protobuf.StringValue getMediaFile();
  /**
   * <pre>
   * The MediaFile resource to use for the image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue media_file = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMediaFileOrBuilder();

  /**
   * <pre>
   * Raw image data as bytes.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 2;</code>
   */
  boolean hasData();
  /**
   * <pre>
   * Raw image data as bytes.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 2;</code>
   */
  com.google.protobuf.BytesValue getData();
  /**
   * <pre>
   * Raw image data as bytes.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 2;</code>
   */
  com.google.protobuf.BytesValueOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * An ad ID to copy the image from.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_id_to_copy_image_from = 3;</code>
   */
  boolean hasAdIdToCopyImageFrom();
  /**
   * <pre>
   * An ad ID to copy the image from.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_id_to_copy_image_from = 3;</code>
   */
  com.google.protobuf.Int64Value getAdIdToCopyImageFrom();
  /**
   * <pre>
   * An ad ID to copy the image from.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_id_to_copy_image_from = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAdIdToCopyImageFromOrBuilder();

  public com.google.ads.googleads.v2.common.ImageAdInfo.ImageCase getImageCase();
}
