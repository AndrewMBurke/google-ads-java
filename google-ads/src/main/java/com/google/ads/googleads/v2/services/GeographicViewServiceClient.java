/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.v2.resources.GeographicView;
import com.google.ads.googleads.v2.services.stub.GeographicViewServiceStub;
import com.google.ads.googleads.v2.services.stub.GeographicViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage geographic views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (GeographicViewServiceClient geographicViewServiceClient = GeographicViewServiceClient.create()) {
 *   String formattedResourceName = GeographicViewServiceClient.formatGeographicViewName("[CUSTOMER]", "[GEOGRAPHIC_VIEW]");
 *   GeographicView response = geographicViewServiceClient.getGeographicView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the geographicViewServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of GeographicViewServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * GeographicViewServiceSettings geographicViewServiceSettings =
 *     GeographicViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GeographicViewServiceClient geographicViewServiceClient =
 *     GeographicViewServiceClient.create(geographicViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * GeographicViewServiceSettings geographicViewServiceSettings =
 *     GeographicViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * GeographicViewServiceClient geographicViewServiceClient =
 *     GeographicViewServiceClient.create(geographicViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class GeographicViewServiceClient implements BackgroundResource {
  private final GeographicViewServiceSettings settings;
  private final GeographicViewServiceStub stub;

  private static final PathTemplate GEOGRAPHIC_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/geographicViews/{geographic_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a geographic_view resource.
   *
   * @deprecated Use the {@link GeographicViewName} class instead.
   */
  @Deprecated
  public static final String formatGeographicViewName(String customer, String geographicView) {
    return GEOGRAPHIC_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "geographic_view", geographicView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a geographic_view
   * resource.
   *
   * @deprecated Use the {@link GeographicViewName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromGeographicViewName(String geographicViewName) {
    return GEOGRAPHIC_VIEW_PATH_TEMPLATE.parse(geographicViewName).get("customer");
  }

  /**
   * Parses the geographic_view from the given fully-qualified path which represents a
   * geographic_view resource.
   *
   * @deprecated Use the {@link GeographicViewName} class instead.
   */
  @Deprecated
  public static final String parseGeographicViewFromGeographicViewName(String geographicViewName) {
    return GEOGRAPHIC_VIEW_PATH_TEMPLATE.parse(geographicViewName).get("geographic_view");
  }

  /** Constructs an instance of GeographicViewServiceClient with default settings. */
  public static final GeographicViewServiceClient create() throws IOException {
    return create(GeographicViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GeographicViewServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final GeographicViewServiceClient create(GeographicViewServiceSettings settings)
      throws IOException {
    return new GeographicViewServiceClient(settings);
  }

  /**
   * Constructs an instance of GeographicViewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use GeographicViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final GeographicViewServiceClient create(GeographicViewServiceStub stub) {
    return new GeographicViewServiceClient(stub);
  }

  /**
   * Constructs an instance of GeographicViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GeographicViewServiceClient(GeographicViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((GeographicViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected GeographicViewServiceClient(GeographicViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GeographicViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public GeographicViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested geographic view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GeographicViewServiceClient geographicViewServiceClient = GeographicViewServiceClient.create()) {
   *   String formattedResourceName = GeographicViewServiceClient.formatGeographicViewName("[CUSTOMER]", "[GEOGRAPHIC_VIEW]");
   *   GeographicView response = geographicViewServiceClient.getGeographicView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the geographic view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GeographicView getGeographicView(String resourceName) {
    GEOGRAPHIC_VIEW_PATH_TEMPLATE.validate(resourceName, "getGeographicView");
    GetGeographicViewRequest request =
        GetGeographicViewRequest.newBuilder().setResourceName(resourceName).build();
    return getGeographicView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested geographic view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GeographicViewServiceClient geographicViewServiceClient = GeographicViewServiceClient.create()) {
   *   String formattedResourceName = GeographicViewServiceClient.formatGeographicViewName("[CUSTOMER]", "[GEOGRAPHIC_VIEW]");
   *   GetGeographicViewRequest request = GetGeographicViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   GeographicView response = geographicViewServiceClient.getGeographicView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GeographicView getGeographicView(GetGeographicViewRequest request) {
    return getGeographicViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested geographic view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GeographicViewServiceClient geographicViewServiceClient = GeographicViewServiceClient.create()) {
   *   String formattedResourceName = GeographicViewServiceClient.formatGeographicViewName("[CUSTOMER]", "[GEOGRAPHIC_VIEW]");
   *   GetGeographicViewRequest request = GetGeographicViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;GeographicView&gt; future = geographicViewServiceClient.getGeographicViewCallable().futureCall(request);
   *   // Do something
   *   GeographicView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetGeographicViewRequest, GeographicView> getGeographicViewCallable() {
    return stub.getGeographicViewCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
