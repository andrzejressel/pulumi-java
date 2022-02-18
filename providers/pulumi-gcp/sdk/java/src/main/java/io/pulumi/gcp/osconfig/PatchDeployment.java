// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.osconfig.PatchDeploymentArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentState;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentInstanceFilter;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentOneTimeSchedule;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfig;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentRecurringSchedule;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentRollout;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Patch deployments are configurations that individual patch jobs use to complete a patch.
 * These configurations include instance filter, package repository settings, and a schedule.
 * 
 * To get more information about PatchDeployment, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/osconfig/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/os-patch-management)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * PatchDeployment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/patchDeployment:PatchDeployment default projects/{{project}}/patchDeployments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/patchDeployment:PatchDeployment default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/patchDeployment:PatchDeployment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:osconfig/patchDeployment:PatchDeployment")
public class PatchDeployment extends io.pulumi.resources.CustomResource {
    /**
     * Time the patch deployment was created. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the patch deployment was created. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    @OutputExport(name="duration", type=String.class, parameters={})
    private Output</* @Nullable */ String> duration;

    /**
     * @return Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    public Output</* @Nullable */ String> getDuration() {
        return this.duration;
    }
    /**
     * VM instances to patch.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="instanceFilter", type=PatchDeploymentInstanceFilter.class, parameters={})
    private Output<PatchDeploymentInstanceFilter> instanceFilter;

    /**
     * @return VM instances to patch.
     * Structure is documented below.
     * 
     */
    public Output<PatchDeploymentInstanceFilter> getInstanceFilter() {
        return this.instanceFilter;
    }
    /**
     * - 
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="lastExecuteTime", type=String.class, parameters={})
    private Output<String> lastExecuteTime;

    /**
     * @return -
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getLastExecuteTime() {
        return this.lastExecuteTime;
    }
    /**
     * Unique name for the patch deployment resource in a project. The patch deployment name is in the form:
     * projects/{project_id}/patchDeployments/{patchDeploymentId}.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name for the patch deployment resource in a project. The patch deployment name is in the form:
     * projects/{project_id}/patchDeployments/{patchDeploymentId}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="oneTimeSchedule", type=PatchDeploymentOneTimeSchedule.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentOneTimeSchedule> oneTimeSchedule;

    /**
     * @return Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PatchDeploymentOneTimeSchedule> getOneTimeSchedule() {
        return this.oneTimeSchedule;
    }
    /**
     * Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="patchConfig", type=PatchDeploymentPatchConfig.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentPatchConfig> patchConfig;

    /**
     * @return Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PatchDeploymentPatchConfig> getPatchConfig() {
        return this.patchConfig;
    }
    /**
     * A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @OutputExport(name="patchDeploymentId", type=String.class, parameters={})
    private Output<String> patchDeploymentId;

    /**
     * @return A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    public Output<String> getPatchDeploymentId() {
        return this.patchDeploymentId;
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
     * Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="recurringSchedule", type=PatchDeploymentRecurringSchedule.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentRecurringSchedule> recurringSchedule;

    /**
     * @return Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PatchDeploymentRecurringSchedule> getRecurringSchedule() {
        return this.recurringSchedule;
    }
    /**
     * Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="rollout", type=PatchDeploymentRollout.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentRollout> rollout;

    /**
     * @return Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PatchDeploymentRollout> getRollout() {
        return this.rollout;
    }
    /**
     * Time the patch deployment was last updated. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu"
     * format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the patch deployment was last updated. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu"
     * format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchDeployment(String name, PatchDeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/patchDeployment:PatchDeployment", name, args == null ? PatchDeploymentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PatchDeployment(String name, Input<String> id, @Nullable PatchDeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/patchDeployment:PatchDeployment", name, state, makeResourceOptions(options, id));
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
    public static PatchDeployment get(String name, Input<String> id, @Nullable PatchDeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PatchDeployment(name, id, state, options);
    }
}
