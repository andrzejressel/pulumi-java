// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersState;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeter;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Replace all existing Service Perimeters in an Access Policy with the Service Perimeters provided. This is done atomically.
 * This is a bulk edit of all Service Perimeters and may override existing Service Perimeters created by `gcp.accesscontextmanager.ServicePerimeter`,
 * thus causing a permadiff if used alongside `gcp.accesscontextmanager.ServicePerimeter` on the same parent.
 * 
 * To get more information about ServicePerimeters, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
 * * How-to Guides
 *     * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ServicePerimeters can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/servicePerimeters:ServicePerimeters default {{parent}}/servicePerimeters
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/servicePerimeters:ServicePerimeters default {{parent}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/servicePerimeters:ServicePerimeters")
public class ServicePerimeters extends io.pulumi.resources.CustomResource {
    /**
     * The AccessPolicy this ServicePerimeter lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The AccessPolicy this ServicePerimeter lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="servicePerimeters", type=List.class, parameters={ServicePerimetersServicePerimeter.class})
    private Output</* @Nullable */ List<ServicePerimetersServicePerimeter>> servicePerimeters;

    /**
     * @return The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<ServicePerimetersServicePerimeter>> getServicePerimeters() {
        return this.servicePerimeters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePerimeters(String name, ServicePerimetersArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeters:ServicePerimeters", name, args == null ? ServicePerimetersArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServicePerimeters(String name, Input<String> id, @Nullable ServicePerimetersState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeters:ServicePerimeters", name, state, makeResourceOptions(options, id));
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
    public static ServicePerimeters get(String name, Input<String> id, @Nullable ServicePerimetersState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServicePerimeters(name, id, state, options);
    }
}
