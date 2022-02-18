// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gkehub.MembershipArgs;
import io.pulumi.gcp.gkehub.inputs.MembershipState;
import io.pulumi.gcp.gkehub.outputs.MembershipAuthority;
import io.pulumi.gcp.gkehub.outputs.MembershipEndpoint;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Membership contains information about a member cluster.
 * 
 * To get more information about Membership, see:
 * 
 * * [API documentation](https://cloud.google.com/anthos/multicluster-management/reference/rest/v1/projects.locations.memberships)
 * * How-to Guides
 *     * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Membership can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membership:Membership default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkehub/membership:Membership")
public class Membership extends io.pulumi.resources.CustomResource {
    /**
     * Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    @OutputExport(name="authority", type=MembershipAuthority.class, parameters={})
    private Output</* @Nullable */ MembershipAuthority> authority;

    /**
     * @return Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ MembershipAuthority> getAuthority() {
        return this.authority;
    }
    /**
     * The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     * @deprecated
     * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
     * 
     */
    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="endpoint", type=MembershipEndpoint.class, parameters={})
    private Output</* @Nullable */ MembershipEndpoint> endpoint;

    /**
     * @return If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ MembershipEndpoint> getEndpoint() {
        return this.endpoint;
    }
    /**
     * Labels to apply to this membership.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this membership.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The client-provided identifier of the membership.
     * 
     */
    @OutputExport(name="membershipId", type=String.class, parameters={})
    private Output<String> membershipId;

    /**
     * @return The client-provided identifier of the membership.
     * 
     */
    public Output<String> getMembershipId() {
        return this.membershipId;
    }
    /**
     * The unique identifier of the membership.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the membership.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Membership(String name, MembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membership:Membership", name, args == null ? MembershipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Membership(String name, Input<String> id, @Nullable MembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membership:Membership", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Membership get(String name, Input<String> id, @Nullable MembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Membership(name, id, state, options);
    }
}
