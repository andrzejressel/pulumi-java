// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs;
import io.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberState;
import io.pulumi.gcp.datacatalog.outputs.PolicyTagIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Data catalog PolicyTag. Each of these resources serves a different use case:
 * 
 * * `gcp.datacatalog.PolicyTagIamPolicy`: Authoritative. Sets the IAM policy for the policytag and replaces any existing policy already attached.
 * * `gcp.datacatalog.PolicyTagIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the policytag are preserved.
 * * `gcp.datacatalog.PolicyTagIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the policytag are preserved.
 * 
 * > **Note:** `gcp.datacatalog.PolicyTagIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.PolicyTagIamBinding` and `gcp.datacatalog.PolicyTagIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.datacatalog.PolicyTagIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.PolicyTagIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_data\_catalog\_policy\_tag\_iam\_policy
 * 
 * ## google\_data\_catalog\_policy\_tag\_iam\_binding
 * 
 * ## google\_data\_catalog\_policy\_tag\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* {{policy_tag}} Any variables not passed in the import command will be taken from the provider configuration. Data catalog policytag IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/policyTagIamMember:PolicyTagIamMember editor "{{policy_tag}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/policyTagIamMember:PolicyTagIamMember editor "{{policy_tag}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/policyTagIamMember:PolicyTagIamMember editor {{policy_tag}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:datacatalog/policyTagIamMember:PolicyTagIamMember")
public class PolicyTagIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=PolicyTagIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ PolicyTagIamMemberCondition> condition;

    public Output</* @Nullable */ PolicyTagIamMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="policyTag", type=String.class, parameters={})
    private Output<String> policyTag;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getPolicyTag() {
        return this.policyTag;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
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
    public PolicyTagIamMember(String name, PolicyTagIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/policyTagIamMember:PolicyTagIamMember", name, args == null ? PolicyTagIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PolicyTagIamMember(String name, Input<String> id, @Nullable PolicyTagIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/policyTagIamMember:PolicyTagIamMember", name, state, makeResourceOptions(options, id));
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
    public static PolicyTagIamMember get(String name, Input<String> id, @Nullable PolicyTagIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyTagIamMember(name, id, state, options);
    }
}
