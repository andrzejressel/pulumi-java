// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataloss.PreventionJobTriggerArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerState;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJob;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerTrigger;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A job trigger configuration.
 * 
 * To get more information about JobTrigger, see:
 * 
 * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.jobTriggers)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dlp/docs/creating-job-triggers)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * JobTrigger can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionJobTrigger:PreventionJobTrigger default {{parent}}/jobTriggers/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionJobTrigger:PreventionJobTrigger default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataloss/preventionJobTrigger:PreventionJobTrigger")
public class PreventionJobTrigger extends io.pulumi.resources.CustomResource {
    /**
     * A description of the job trigger.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the job trigger.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * User set display name of the job trigger.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User set display name of the job trigger.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Controls what and how to inspect for findings.
     * Structure is documented below.
     * 
     */
    @Export(name="inspectJob", type=PreventionJobTriggerInspectJob.class, parameters={})
    private Output</* @Nullable */ PreventionJobTriggerInspectJob> inspectJob;

    /**
     * @return Controls what and how to inspect for findings.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PreventionJobTriggerInspectJob> getInspectJob() {
        return this.inspectJob;
    }
    /**
     * The timestamp of the last time this trigger executed.
     * 
     */
    @Export(name="lastRunTime", type=String.class, parameters={})
    private Output<String> lastRunTime;

    /**
     * @return The timestamp of the last time this trigger executed.
     * 
     */
    public Output<String> getLastRunTime() {
        return this.lastRunTime;
    }
    /**
     * The name of the Datastore kind.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Datastore kind.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are `PAUSED`, `HEALTHY`, and `CANCELLED`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are `PAUSED`, `HEALTHY`, and `CANCELLED`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * What event needs to occur for a new job to be started.
     * Structure is documented below.
     * 
     */
    @Export(name="triggers", type=List.class, parameters={PreventionJobTriggerTrigger.class})
    private Output<List<PreventionJobTriggerTrigger>> triggers;

    /**
     * @return What event needs to occur for a new job to be started.
     * Structure is documented below.
     * 
     */
    public Output<List<PreventionJobTriggerTrigger>> getTriggers() {
        return this.triggers;
    }

    public interface BuilderApplicator {
        public void apply(PreventionJobTriggerArgs.Builder a);
    }
    private static io.pulumi.gcp.dataloss.PreventionJobTriggerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.dataloss.PreventionJobTriggerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PreventionJobTrigger(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PreventionJobTrigger(String name) {
        this(name, PreventionJobTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PreventionJobTrigger(String name, PreventionJobTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PreventionJobTrigger(String name, PreventionJobTriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataloss/preventionJobTrigger:PreventionJobTrigger", name, args == null ? PreventionJobTriggerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PreventionJobTrigger(String name, Output<String> id, @Nullable PreventionJobTriggerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataloss/preventionJobTrigger:PreventionJobTrigger", name, state, makeResourceOptions(options, id));
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
    public static PreventionJobTrigger get(String name, Output<String> id, @Nullable PreventionJobTriggerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PreventionJobTrigger(name, id, state, options);
    }
}
