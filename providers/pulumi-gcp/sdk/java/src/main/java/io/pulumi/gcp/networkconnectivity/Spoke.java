// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.networkconnectivity.SpokeArgs;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeState;
import io.pulumi.gcp.networkconnectivity.outputs.SpokeLinkedInterconnectAttachments;
import io.pulumi.gcp.networkconnectivity.outputs.SpokeLinkedRouterApplianceInstances;
import io.pulumi.gcp.networkconnectivity.outputs.SpokeLinkedVpnTunnels;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The NetworkConnectivity Spoke resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Spoke can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/spoke:Spoke default projects/{{project}}/locations/{{location}}/spokes/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/spoke:Spoke default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/spoke:Spoke default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkconnectivity/spoke:Spoke")
public class Spoke extends io.pulumi.resources.CustomResource {
    /**
     * Output only. The time the spoke was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time the spoke was created.
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
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the spoke.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Immutable. The URI of the hub that this spoke is attached to.
     * 
     */
    @Export(name="hub", type=String.class, parameters={})
    private Output<String> hub;

    /**
     * @return Immutable. The URI of the hub that this spoke is attached to.
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
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * 
     */
    @Export(name="linkedInterconnectAttachments", type=SpokeLinkedInterconnectAttachments.class, parameters={})
    private Output</* @Nullable */ SpokeLinkedInterconnectAttachments> linkedInterconnectAttachments;

    /**
     * @return A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * 
     */
    public Output</* @Nullable */ SpokeLinkedInterconnectAttachments> getLinkedInterconnectAttachments() {
        return this.linkedInterconnectAttachments;
    }
    /**
     * The URIs of linked Router appliance resources
     * 
     */
    @Export(name="linkedRouterApplianceInstances", type=SpokeLinkedRouterApplianceInstances.class, parameters={})
    private Output</* @Nullable */ SpokeLinkedRouterApplianceInstances> linkedRouterApplianceInstances;

    /**
     * @return The URIs of linked Router appliance resources
     * 
     */
    public Output</* @Nullable */ SpokeLinkedRouterApplianceInstances> getLinkedRouterApplianceInstances() {
        return this.linkedRouterApplianceInstances;
    }
    /**
     * The URIs of linked VPN tunnel resources
     * 
     */
    @Export(name="linkedVpnTunnels", type=SpokeLinkedVpnTunnels.class, parameters={})
    private Output</* @Nullable */ SpokeLinkedVpnTunnels> linkedVpnTunnels;

    /**
     * @return The URIs of linked VPN tunnel resources
     * 
     */
    public Output</* @Nullable */ SpokeLinkedVpnTunnels> getLinkedVpnTunnels() {
        return this.linkedVpnTunnels;
    }
    /**
     * The location for the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Immutable. The name of the spoke. Spoke names must be unique.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The name of the spoke. Spoke names must be unique.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is
     * deleted and another with the same name is created, the new spoke is assigned a different unique_id.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is
     * deleted and another with the same name is created, the new spoke is assigned a different unique_id.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }
    /**
     * Output only. The time the spoke was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time the spoke was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(SpokeArgs.Builder a);
    }
    private static io.pulumi.gcp.networkconnectivity.SpokeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.networkconnectivity.SpokeArgs.builder();
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
        super("gcp:networkconnectivity/spoke:Spoke", name, args == null ? SpokeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Spoke(String name, Output<String> id, @Nullable SpokeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkconnectivity/spoke:Spoke", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Spoke get(String name, Output<String> id, @Nullable SpokeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Spoke(name, id, state, options);
    }
}
