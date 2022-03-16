// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.RouteTableArgs;
import io.pulumi.azurenative.network.outputs.RouteResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Route table resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:RouteTable testrt /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/routeTables/testrt 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:RouteTable")
public class RouteTable extends io.pulumi.resources.CustomResource {
    /**
     * Whether to disable the routes learned by BGP on that route table. True means disable.
     * 
     */
    @Export(name="disableBgpRoutePropagation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableBgpRoutePropagation;

    /**
     * @return Whether to disable the routes learned by BGP on that route table. True means disable.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation;
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
     * The provisioning state of the route table resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the route table resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the route table.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the route table.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Collection of routes contained within a route table.
     * 
     */
    @Export(name="routes", type=List.class, parameters={RouteResponse.class})
    private Output</* @Nullable */ List<RouteResponse>> routes;

    /**
     * @return Collection of routes contained within a route table.
     * 
     */
    public Output</* @Nullable */ List<RouteResponse>> getRoutes() {
        return this.routes;
    }
    /**
     * A collection of references to subnets.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={SubnetResponse.class})
    private Output<List<SubnetResponse>> subnets;

    /**
     * @return A collection of references to subnets.
     * 
     */
    public Output<List<SubnetResponse>> getSubnets() {
        return this.subnets;
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

    public interface BuilderApplicator {
        public void apply(RouteTableArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.RouteTableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.RouteTableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RouteTable(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteTable(String name) {
        this(name, RouteTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteTable(String name, RouteTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTable(String name, RouteTableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteTable", name, args == null ? RouteTableArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RouteTable(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteTable", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150501preview:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20150615:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:RouteTable").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:RouteTable").build())
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
    public static RouteTable get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouteTable(name, id, options);
    }
}
