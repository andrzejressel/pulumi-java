// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.WebIamMemberArgs;
import io.pulumi.gcp.iap.inputs.WebIamMemberState;
import io.pulumi.gcp.iap.outputs.WebIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Identity-Aware Proxy Web. Each of these resources serves a different use case:
 * 
 * * `gcp.iap.WebIamPolicy`: Authoritative. Sets the IAM policy for the web and replaces any existing policy already attached.
 * * `gcp.iap.WebIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the web are preserved.
 * * `gcp.iap.WebIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the web are preserved.
 * 
 * > **Note:** `gcp.iap.WebIamPolicy` **cannot** be used in conjunction with `gcp.iap.WebIamBinding` and `gcp.iap.WebIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.iap.WebIamBinding` resources **can be** used in conjunction with `gcp.iap.WebIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_iap\_web\_iam\_policy
 * 
 * With IAM Conditions:
 * ## google\_iap\_web\_iam\_binding
 * 
 * With IAM Conditions:
 * ## google\_iap\_web\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/iap_web * {{project}} Any variables not passed in the import command will be taken from the provider configuration. Identity-Aware Proxy web IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webIamMember:WebIamMember editor "projects/{{project}}/iap_web roles/iap.httpsResourceAccessor user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webIamMember:WebIamMember editor "projects/{{project}}/iap_web roles/iap.httpsResourceAccessor"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webIamMember:WebIamMember editor projects/{{project}}/iap_web
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:iap/webIamMember:WebIamMember")
public class WebIamMember extends io.pulumi.resources.CustomResource {
    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="condition", type=WebIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ WebIamMemberCondition> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ WebIamMemberCondition> getCondition() {
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
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.iap.WebIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.iap.WebIamBinding` can be used per role. Note that custom roles must be of the format
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
    public WebIamMember(String name, WebIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/webIamMember:WebIamMember", name, args == null ? WebIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebIamMember(String name, Input<String> id, @Nullable WebIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/webIamMember:WebIamMember", name, state, makeResourceOptions(options, id));
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
    public static WebIamMember get(String name, Input<String> id, @Nullable WebIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebIamMember(name, id, state, options);
    }
}
