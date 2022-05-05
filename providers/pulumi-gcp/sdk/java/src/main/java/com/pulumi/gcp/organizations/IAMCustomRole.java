// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.IAMCustomRoleArgs;
import com.pulumi.gcp.organizations.inputs.IAMCustomRoleState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows management of a customized Cloud IAM organization role. For more information see
 * [the official documentation](https://cloud.google.com/iam/docs/understanding-custom-roles)
 * and
 * [API](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
 * 
 * &gt; **Warning:** Note that custom roles in GCP have the concept of a soft-delete. There are two issues that may arise
 *  from this and how roles are propagated. 1) creating a role may involve undeleting and then updating a role with the
 *  same name, possibly causing confusing behavior between undelete and update. 2) A deleted role is permanently deleted
 *  after 7 days, but it can take up to 30 more days (i.e. between 7 and 37 days after deletion) before the role name is
 *  made available again. This means a deleted role that has been deleted for more than 7 days cannot be changed at all
 *  by the provider, and new roles cannot share that name.
 * 
 * ## Example Usage
 * 
 * This snippet creates a customized IAM organization role.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var my_custom_role = new IAMCustomRole(&#34;my-custom-role&#34;, IAMCustomRoleArgs.builder()        
 *             .description(&#34;A description&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .permissions(            
 *                 &#34;iam.roles.list&#34;,
 *                 &#34;iam.roles.create&#34;,
 *                 &#34;iam.roles.delete&#34;)
 *             .roleId(&#34;myCustomRole&#34;)
 *             .title(&#34;My Custom Role&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Customized IAM organization role can be imported using their URI, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/iAMCustomRole:IAMCustomRole my-custom-role organizations/123456789/roles/myCustomRole
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/iAMCustomRole:IAMCustomRole")
public class IAMCustomRole extends com.pulumi.resources.CustomResource {
    /**
     * (Optional) The current deleted state of the role.
     * 
     */
    @Export(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    /**
     * @return (Optional) The current deleted state of the role.
     * 
     */
    public Output<Boolean> deleted() {
        return this.deleted;
    }
    /**
     * A human-readable description for the role.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description for the role.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the role in the format `organizations/{{org_id}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the role in the format `organizations/{{org_id}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization in which you want to create a custom role.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={String.class})
    private Output<List<String>> permissions;

    /**
     * @return The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    public Output<List<String>> permissions() {
        return this.permissions;
    }
    /**
     * The role id to use for this role.
     * 
     */
    @Export(name="roleId", type=String.class, parameters={})
    private Output<String> roleId;

    /**
     * @return The role id to use for this role.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }
    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    @Export(name="stage", type=String.class, parameters={})
    private Output</* @Nullable */ String> stage;

    /**
     * @return The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    public Output<Optional<String>> stage() {
        return Codegen.optional(this.stage);
    }
    /**
     * A human-readable title for the role.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return A human-readable title for the role.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMCustomRole(String name) {
        this(name, IAMCustomRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMCustomRole(String name, IAMCustomRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMCustomRole(String name, IAMCustomRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMCustomRole:IAMCustomRole", name, args == null ? IAMCustomRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMCustomRole(String name, Output<String> id, @Nullable IAMCustomRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMCustomRole:IAMCustomRole", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static IAMCustomRole get(String name, Output<String> id, @Nullable IAMCustomRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IAMCustomRole(name, id, state, options);
    }
}
