// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkconnectivity_v1.SpokeArgs;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.LinkedInterconnectAttachmentsResponse;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.LinkedRouterApplianceInstancesResponse;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.LinkedVpnTunnelsResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a spoke in the specified project and location.
 * 
 */
@ResourceType(type="google-native:networkconnectivity/v1:Spoke")
public class Spoke extends io.pulumi.resources.CustomResource {
    /**
     * The time the spoke was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the spoke was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * An optional description of the spoke.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of the spoke.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Immutable. The name of the hub that this spoke is attached to.
     * 
     */
    @Export(name="hub", type=String.class, parameters={})
    private Output<String> hub;

    /**
     * @return Immutable. The name of the hub that this spoke is attached to.
     * 
     */
    public Output<String> getHub() {
        return this.hub;
    }
    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * VLAN attachments that are associated with the spoke.
     * 
     */
    @Export(name="linkedInterconnectAttachments", type=LinkedInterconnectAttachmentsResponse.class, parameters={})
    private Output<LinkedInterconnectAttachmentsResponse> linkedInterconnectAttachments;

    /**
     * @return VLAN attachments that are associated with the spoke.
     * 
     */
    public Output<LinkedInterconnectAttachmentsResponse> getLinkedInterconnectAttachments() {
        return this.linkedInterconnectAttachments;
    }
    /**
     * Router appliance instances that are associated with the spoke.
     * 
     */
    @Export(name="linkedRouterApplianceInstances", type=LinkedRouterApplianceInstancesResponse.class, parameters={})
    private Output<LinkedRouterApplianceInstancesResponse> linkedRouterApplianceInstances;

    /**
     * @return Router appliance instances that are associated with the spoke.
     * 
     */
    public Output<LinkedRouterApplianceInstancesResponse> getLinkedRouterApplianceInstances() {
        return this.linkedRouterApplianceInstances;
    }
    /**
     * VPN tunnels that are associated with the spoke.
     * 
     */
    @Export(name="linkedVpnTunnels", type=LinkedVpnTunnelsResponse.class, parameters={})
    private Output<LinkedVpnTunnelsResponse> linkedVpnTunnels;

    /**
     * @return VPN tunnels that are associated with the spoke.
     * 
     */
    public Output<LinkedVpnTunnelsResponse> getLinkedVpnTunnels() {
        return this.linkedVpnTunnels;
    }
    /**
     * Immutable. The name of the spoke. Spoke names must be unique. They use the following form: `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The name of the spoke. Spoke names must be unique. They use the following form: `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current lifecycle state of this spoke.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current lifecycle state of this spoke.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is deleted and another with the same name is created, the new spoke is assigned a different unique_id.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is deleted and another with the same name is created, the new spoke is assigned a different unique_id.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }
    /**
     * The time the spoke was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time the spoke was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(SpokeArgs.Builder a);
    }
    private static io.pulumi.googlenative.networkconnectivity_v1.SpokeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.networkconnectivity_v1.SpokeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Spoke(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Spoke(String name) {
        this(name, SpokeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Spoke(String name, SpokeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Spoke(String name, SpokeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkconnectivity/v1:Spoke", name, args == null ? SpokeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Spoke(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkconnectivity/v1:Spoke", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Spoke get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Spoke(name, id, options);
    }
}
