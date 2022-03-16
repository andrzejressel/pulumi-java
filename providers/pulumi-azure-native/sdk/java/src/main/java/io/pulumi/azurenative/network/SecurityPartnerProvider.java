// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.SecurityPartnerProviderArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Security Partner Provider resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:SecurityPartnerProvider securityPartnerProvider /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/securityPartnerProviders/securityPartnerProvider 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:SecurityPartnerProvider")
public class SecurityPartnerProvider extends io.pulumi.resources.CustomResource {
    /**
     * The connection status with the Security Partner Provider.
     * 
     */
    @Export(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    /**
     * @return The connection status with the Security Partner Provider.
     * 
     */
    public Output<String> getConnectionStatus() {
        return this.connectionStatus;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
     * The provisioning state of the Security Partner Provider resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the Security Partner Provider resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The security provider name.
     * 
     */
    @Export(name="securityProviderName", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityProviderName;

    /**
     * @return The security provider name.
     * 
     */
    public Output</* @Nullable */ String> getSecurityProviderName() {
        return this.securityProviderName;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The virtualHub to which the Security Partner Provider belongs.
     * 
     */
    @Export(name="virtualHub", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualHub;

    /**
     * @return The virtualHub to which the Security Partner Provider belongs.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getVirtualHub() {
        return this.virtualHub;
    }

    public interface BuilderApplicator {
        public void apply(SecurityPartnerProviderArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.SecurityPartnerProviderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.SecurityPartnerProviderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityPartnerProvider(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityPartnerProvider(String name) {
        this(name, SecurityPartnerProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityPartnerProvider(String name, SecurityPartnerProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityPartnerProvider(String name, SecurityPartnerProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityPartnerProvider", name, args == null ? SecurityPartnerProviderArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SecurityPartnerProvider(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityPartnerProvider", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200301:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:SecurityPartnerProvider").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:SecurityPartnerProvider").build())
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
    public static SecurityPartnerProvider get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityPartnerProvider(name, id, options);
    }
}
