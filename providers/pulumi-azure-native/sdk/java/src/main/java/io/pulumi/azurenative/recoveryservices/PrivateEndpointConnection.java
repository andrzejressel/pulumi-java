// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Private Endpoint Connection Response Properties
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:PrivateEndpointConnection gaallatestpe1.3592346090307038890.backup.5704c932-249a-490b-a142-1396838cd3b /subscriptions/04cf684a-d41f-4550-9f70-7708a3a2283b/resourceGroups/gaallaRG/providers/Microsoft.RecoveryServicesBVTD2/vaults/gaallavaultbvtd2msi/privateEndpointConnections/gaallatestpe3.3592346090307038890.backup.5704c932-249a-490b-a142-1396838cd3b 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:PrivateEndpointConnection")
public class PrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * Optional ETag.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Optional ETag.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
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
     * Resource name associated with the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * PrivateEndpointConnectionResource properties
     * 
     */
    @Export(name="properties", type=PrivateEndpointConnectionResponse.class, parameters={})
    private Output<PrivateEndpointConnectionResponse> properties;

    /**
     * @return PrivateEndpointConnectionResource properties
     * 
     */
    public Output<PrivateEndpointConnectionResponse> getProperties() {
        return this.properties;
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
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PrivateEndpointConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.recoveryservices.PrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.recoveryservices.PrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrivateEndpointConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20200202:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20201001:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20201201:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210101:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210201:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210201preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
