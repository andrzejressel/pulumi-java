// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigateway.ApiIamBindingArgs;
import io.pulumi.gcp.apigateway.inputs.ApiIamBindingState;
import io.pulumi.gcp.apigateway.outputs.ApiIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for API Gateway Api. Each of these resources serves a different use case:
 * 
 * * `gcp.apigateway.ApiIamPolicy`: Authoritative. Sets the IAM policy for the api and replaces any existing policy already attached.
 * * `gcp.apigateway.ApiIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the api are preserved.
 * * `gcp.apigateway.ApiIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the api are preserved.
 * 
 * > **Note:** `gcp.apigateway.ApiIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiIamBinding` and `gcp.apigateway.ApiIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.apigateway.ApiIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_api\_gateway\_api\_iam\_policy
 * 
 * ## google\_api\_gateway\_api\_iam\_binding
 * 
 * ## google\_api\_gateway\_api\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/global/apis/{{api}} * {{project}}/{{api}} * {{api}} Any variables not passed in the import command will be taken from the provider configuration. API Gateway api IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/apiIamBinding:ApiIamBinding editor "projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/apiIamBinding:ApiIamBinding editor "projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/apiIamBinding:ApiIamBinding editor projects/{{project}}/locations/global/apis/{{api}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:apigateway/apiIamBinding:ApiIamBinding")
public class ApiIamBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="api", type=String.class, parameters={})
    private Output<String> api;

    public Output<String> getApi() {
        return this.api;
    }
    @OutputExport(name="condition", type=ApiIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ ApiIamBindingCondition> condition;

    public Output</* @Nullable */ ApiIamBindingCondition> getCondition() {
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
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
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
     * `gcp.apigateway.ApiIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.apigateway.ApiIamBinding` can be used per role. Note that custom roles must be of the format
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
    public ApiIamBinding(String name, ApiIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiIamBinding:ApiIamBinding", name, args == null ? ApiIamBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiIamBinding(String name, Input<String> id, @Nullable ApiIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiIamBinding:ApiIamBinding", name, state, makeResourceOptions(options, id));
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
    public static ApiIamBinding get(String name, Input<String> id, @Nullable ApiIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiIamBinding(name, id, state, options);
    }
}
