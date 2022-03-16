// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sqlvirtualmachine.AvailabilityGroupListenerArgs;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.LoadBalancerConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A SQL Server availability group listener.
 * API Version: 2017-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sqlvirtualmachine:AvailabilityGroupListener agl-test /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.SqlVirtualMachine/sqlVirtualMachineGroups/testvmgroup/availabilityGroupListeners/agl-test 
 * ```
 * 
 */
@ResourceType(type="azure-native:sqlvirtualmachine:AvailabilityGroupListener")
public class AvailabilityGroupListener extends io.pulumi.resources.CustomResource {
    /**
     * Name of the availability group.
     * 
     */
    @Export(name="availabilityGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityGroupName;

    /**
     * @return Name of the availability group.
     * 
     */
    public Output</* @Nullable */ String> getAvailabilityGroupName() {
        return this.availabilityGroupName;
    }
    /**
     * Create a default availability group if it does not exist.
     * 
     */
    @Export(name="createDefaultAvailabilityGroupIfNotExist", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> createDefaultAvailabilityGroupIfNotExist;

    /**
     * @return Create a default availability group if it does not exist.
     * 
     */
    public Output</* @Nullable */ Boolean> getCreateDefaultAvailabilityGroupIfNotExist() {
        return this.createDefaultAvailabilityGroupIfNotExist;
    }
    /**
     * List of load balancer configurations for an availability group listener.
     * 
     */
    @Export(name="loadBalancerConfigurations", type=List.class, parameters={LoadBalancerConfigurationResponse.class})
    private Output</* @Nullable */ List<LoadBalancerConfigurationResponse>> loadBalancerConfigurations;

    /**
     * @return List of load balancer configurations for an availability group listener.
     * 
     */
    public Output</* @Nullable */ List<LoadBalancerConfigurationResponse>> getLoadBalancerConfigurations() {
        return this.loadBalancerConfigurations;
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
     * Listener port.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Listener port.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * Provisioning state to track the async operation status.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state to track the async operation status.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
        public void apply(AvailabilityGroupListenerArgs.Builder a);
    }
    private static io.pulumi.azurenative.sqlvirtualmachine.AvailabilityGroupListenerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sqlvirtualmachine.AvailabilityGroupListenerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AvailabilityGroupListener(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AvailabilityGroupListener(String name) {
        this(name, AvailabilityGroupListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AvailabilityGroupListener(String name, AvailabilityGroupListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AvailabilityGroupListener(String name, AvailabilityGroupListenerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sqlvirtualmachine:AvailabilityGroupListener", name, args == null ? AvailabilityGroupListenerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AvailabilityGroupListener(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sqlvirtualmachine:AvailabilityGroupListener", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sqlvirtualmachine/v20170301preview:AvailabilityGroupListener").build())
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
    public static AvailabilityGroupListener get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AvailabilityGroupListener(name, id, options);
    }
}
