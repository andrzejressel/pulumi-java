// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiArgs;
import io.pulumi.azurenative.apimanagement.outputs.ApiVersionSetContractDetailsResponse;
import io.pulumi.azurenative.apimanagement.outputs.AuthenticationSettingsContractResponse;
import io.pulumi.azurenative.apimanagement.outputs.SubscriptionKeyParameterNamesContractResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Api details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Api soapApi /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/soapApi 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Api")
public class Api extends io.pulumi.resources.CustomResource {
    /**
     * Describes the Revision of the Api. If no value is provided, default revision 1 is created
     * 
     */
    @Export(name="apiRevision", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiRevision;

    /**
     * @return Describes the Revision of the Api. If no value is provided, default revision 1 is created
     * 
     */
    public Output</* @Nullable */ String> getApiRevision() {
        return this.apiRevision;
    }
    /**
     * Description of the Api Revision.
     * 
     */
    @Export(name="apiRevisionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiRevisionDescription;

    /**
     * @return Description of the Api Revision.
     * 
     */
    public Output</* @Nullable */ String> getApiRevisionDescription() {
        return this.apiRevisionDescription;
    }
    /**
     * Type of API.
     * 
     */
    @Export(name="apiType", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiType;

    /**
     * @return Type of API.
     * 
     */
    public Output</* @Nullable */ String> getApiType() {
        return this.apiType;
    }
    /**
     * Indicates the Version identifier of the API if the API is versioned
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return Indicates the Version identifier of the API if the API is versioned
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Description of the Api Version.
     * 
     */
    @Export(name="apiVersionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersionDescription;

    /**
     * @return Description of the Api Version.
     * 
     */
    public Output</* @Nullable */ String> getApiVersionDescription() {
        return this.apiVersionDescription;
    }
    /**
     * Version set details
     * 
     */
    @Export(name="apiVersionSet", type=ApiVersionSetContractDetailsResponse.class, parameters={})
    private Output</* @Nullable */ ApiVersionSetContractDetailsResponse> apiVersionSet;

    /**
     * @return Version set details
     * 
     */
    public Output</* @Nullable */ ApiVersionSetContractDetailsResponse> getApiVersionSet() {
        return this.apiVersionSet;
    }
    /**
     * A resource identifier for the related ApiVersionSet.
     * 
     */
    @Export(name="apiVersionSetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersionSetId;

    /**
     * @return A resource identifier for the related ApiVersionSet.
     * 
     */
    public Output</* @Nullable */ String> getApiVersionSetId() {
        return this.apiVersionSetId;
    }
    /**
     * Collection of authentication settings included into this API.
     * 
     */
    @Export(name="authenticationSettings", type=AuthenticationSettingsContractResponse.class, parameters={})
    private Output</* @Nullable */ AuthenticationSettingsContractResponse> authenticationSettings;

    /**
     * @return Collection of authentication settings included into this API.
     * 
     */
    public Output</* @Nullable */ AuthenticationSettingsContractResponse> getAuthenticationSettings() {
        return this.authenticationSettings;
    }
    /**
     * Description of the API. May include HTML formatting tags.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the API. May include HTML formatting tags.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * API name. Must be 1 to 300 characters long.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return API name. Must be 1 to 300 characters long.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Indicates if API revision is current api revision.
     * 
     */
    @Export(name="isCurrent", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isCurrent;

    /**
     * @return Indicates if API revision is current api revision.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsCurrent() {
        return this.isCurrent;
    }
    /**
     * Indicates if API revision is accessible via the gateway.
     * 
     */
    @Export(name="isOnline", type=Boolean.class, parameters={})
    private Output<Boolean> isOnline;

    /**
     * @return Indicates if API revision is accessible via the gateway.
     * 
     */
    public Output<Boolean> getIsOnline() {
        return this.isOnline;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output<String> path;

    /**
     * @return Relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     * 
     */
    public Output<String> getPath() {
        return this.path;
    }
    /**
     * Describes on which protocols the operations in this API can be invoked.
     * 
     */
    @Export(name="protocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> protocols;

    /**
     * @return Describes on which protocols the operations in this API can be invoked.
     * 
     */
    public Output</* @Nullable */ List<String>> getProtocols() {
        return this.protocols;
    }
    /**
     * Absolute URL of the backend service implementing this API. Cannot be more than 2000 characters long.
     * 
     */
    @Export(name="serviceUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceUrl;

    /**
     * @return Absolute URL of the backend service implementing this API. Cannot be more than 2000 characters long.
     * 
     */
    public Output</* @Nullable */ String> getServiceUrl() {
        return this.serviceUrl;
    }
    /**
     * API identifier of the source API.
     * 
     */
    @Export(name="sourceApiId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceApiId;

    /**
     * @return API identifier of the source API.
     * 
     */
    public Output</* @Nullable */ String> getSourceApiId() {
        return this.sourceApiId;
    }
    /**
     * Protocols over which API is made available.
     * 
     */
    @Export(name="subscriptionKeyParameterNames", type=SubscriptionKeyParameterNamesContractResponse.class, parameters={})
    private Output</* @Nullable */ SubscriptionKeyParameterNamesContractResponse> subscriptionKeyParameterNames;

    /**
     * @return Protocols over which API is made available.
     * 
     */
    public Output</* @Nullable */ SubscriptionKeyParameterNamesContractResponse> getSubscriptionKeyParameterNames() {
        return this.subscriptionKeyParameterNames;
    }
    /**
     * Specifies whether an API or Product subscription is required for accessing the API.
     * 
     */
    @Export(name="subscriptionRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> subscriptionRequired;

    /**
     * @return Specifies whether an API or Product subscription is required for accessing the API.
     * 
     */
    public Output</* @Nullable */ Boolean> getSubscriptionRequired() {
        return this.subscriptionRequired;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ApiArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.ApiArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.ApiArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Api(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Api(String name) {
        this(name, ApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Api(String name, ApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Api(String name, ApiArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Api", name, args == null ? ApiArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Api(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Api", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20160707:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20161010:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:Api").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Api get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Api(name, id, options);
    }
}
