// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ReplicationPolicyArgs;
import io.pulumi.azurenative.recoveryservices.outputs.PolicyPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Protection profile details.
 * API Version: 2018-07-10.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ReplicationPolicy protectionprofile1 /Subscriptions/c183865e-6077-46f2-a3b1-deb0f4f4650a/resourceGroups/resourceGroupPS1/providers/Microsoft.RecoveryServices/vaults/vault1/replicationPolicies/protectionprofile1 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ReplicationPolicy")
public class ReplicationPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The custom data.
     * 
     */
    @Export(name="properties", type=PolicyPropertiesResponse.class, parameters={})
    private Output<PolicyPropertiesResponse> properties;

    /**
     * @return The custom data.
     * 
     */
    public Output<PolicyPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ReplicationPolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.recoveryservices.ReplicationPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.recoveryservices.ReplicationPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ReplicationPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationPolicy(String name) {
        this(name, ReplicationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationPolicy(String name, ReplicationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationPolicy(String name, ReplicationPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationPolicy", name, args == null ? ReplicationPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ReplicationPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20160810:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180110:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180710:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211101:ReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:ReplicationPolicy").build())
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
    public static ReplicationPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationPolicy(name, id, options);
    }
}
