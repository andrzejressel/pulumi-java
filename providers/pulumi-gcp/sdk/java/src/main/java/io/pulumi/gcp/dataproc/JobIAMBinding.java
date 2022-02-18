// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataproc.JobIAMBindingArgs;
import io.pulumi.gcp.dataproc.inputs.JobIAMBindingState;
import io.pulumi.gcp.dataproc.outputs.JobIAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on dataproc jobs. Each of these resources serves a different use case:
 * 
 * * `gcp.dataproc.JobIAMPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
 * * `gcp.dataproc.JobIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved.
 * * `gcp.dataproc.JobIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved.
 * 
 * > **Note:** `gcp.dataproc.JobIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.JobIAMBinding` and `gcp.dataproc.JobIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the job as `gcp.dataproc.JobIAMPolicy` replaces the entire policy.
 * 
 * > **Note:** `gcp.dataproc.JobIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.JobIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_dataproc\_job\_iam\_policy
 * 
 * ## google\_dataproc\_job\_iam\_binding
 * 
 * ## google\_dataproc\_job\_iam\_member
 * 
 * ## Import
 * 
 * Job IAM resources can be imported using the project, region, job id, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/jobIAMBinding:JobIAMBinding editor "projects/{project}/regions/{region}/jobs/{job_id}"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/jobIAMBinding:JobIAMBinding editor "projects/{project}/regions/{region}/jobs/{job_id} roles/editor"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/jobIAMBinding:JobIAMBinding editor "projects/{project}/regions/{region}/jobs/{job_id} roles/editor user:jane@example.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:dataproc/jobIAMBinding:JobIAMBinding")
public class JobIAMBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=JobIAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ JobIAMBindingCondition> condition;

    public Output</* @Nullable */ JobIAMBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the jobs's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the jobs's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The project in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.JobIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.dataproc.JobIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobIAMBinding(String name, JobIAMBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMBinding:JobIAMBinding", name, args == null ? JobIAMBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobIAMBinding(String name, Input<String> id, @Nullable JobIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMBinding:JobIAMBinding", name, state, makeResourceOptions(options, id));
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
    public static JobIAMBinding get(String name, Input<String> id, @Nullable JobIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobIAMBinding(name, id, state, options);
    }
}
