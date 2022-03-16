// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iam_v1.OrganizationRoleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new custom Role.
 * 
 */
@ResourceType(type="google-native:iam/v1:OrganizationRole")
public class OrganizationRole extends io.pulumi.resources.CustomResource {
    /**
     * The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    @Export(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    /**
     * @return The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    public Output<Boolean> getDeleted() {
        return this.deleted;
    }
    /**
     * Optional. A human-readable description for the role.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A human-readable description for the role.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Used to perform a consistent read-modify-write.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Used to perform a consistent read-modify-write.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    @Export(name="includedPermissions", type=List.class, parameters={String.class})
    private Output<List<String>> includedPermissions;

    /**
     * @return The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    public Output<List<String>> getIncludedPermissions() {
        return this.includedPermissions;
    }
    /**
     * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    @Export(name="stage", type=String.class, parameters={})
    private Output<String> stage;

    /**
     * @return The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    public Output<String> getStage() {
        return this.stage;
    }
    /**
     * Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }

    public interface BuilderApplicator {
        public void apply(OrganizationRoleArgs.Builder a);
    }
    private static io.pulumi.googlenative.iam_v1.OrganizationRoleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.iam_v1.OrganizationRoleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public OrganizationRole(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationRole(String name) {
        this(name, OrganizationRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationRole(String name, OrganizationRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationRole(String name, OrganizationRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:OrganizationRole", name, args == null ? OrganizationRoleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private OrganizationRole(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:OrganizationRole", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OrganizationRole get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationRole(name, id, options);
    }
}
