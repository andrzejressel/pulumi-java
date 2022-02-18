// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasedatabase_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebasedatabase_v1beta.InstanceArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Requests that a new DatabaseInstance be created. The state of a successfully created DatabaseInstance is ACTIVE. Only available for projects on the Blaze plan. Projects can be upgraded using the Cloud Billing API https://cloud.google.com/billing/reference/rest/v1/projects/updateBillingInfo. Note that it might take a few minutes for billing enablement state to propagate to Firebase systems.
 * 
 */
@ResourceType(type="google-native:firebasedatabase/v1beta:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * Immutable. The globally unique hostname of the database.
     * 
     */
    @OutputExport(name="databaseUrl", type=String.class, parameters={})
    private Output<String> databaseUrl;

    /**
     * @return Immutable. The globally unique hostname of the database.
     * 
     */
    public Output<String> getDatabaseUrl() {
        return this.databaseUrl;
    }
    /**
     * The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource name of the project this instance belongs to. For example: `projects/{project-number}`.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The resource name of the project this instance belongs to. For example: `projects/{project-number}`.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The database's lifecycle state. Read-only.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The database's lifecycle state. Read-only.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, @Nullable InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasedatabase/v1beta:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasedatabase/v1beta:Instance", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
