// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMCustomRoleState extends io.pulumi.resources.ResourceArgs {

    public static final IAMCustomRoleState Empty = new IAMCustomRoleState();

    /**
     * (Optional) The current deleted state of the role.
     * 
     */
    @InputImport(name="deleted")
    private final @Nullable Input<Boolean> deleted;

    public Input<Boolean> getDeleted() {
        return this.deleted == null ? Input.empty() : this.deleted;
    }

    /**
     * A human-readable description for the role.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the role in the format `projects/{{project}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    @InputImport(name="permissions")
    private final @Nullable Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    /**
     * The project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The camel case role id to use for this role. Cannot contain `-` characters.
     * 
     */
    @InputImport(name="roleId")
    private final @Nullable Input<String> roleId;

    public Input<String> getRoleId() {
        return this.roleId == null ? Input.empty() : this.roleId;
    }

    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    @InputImport(name="stage")
    private final @Nullable Input<String> stage;

    public Input<String> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    /**
     * A human-readable title for the role.
     * 
     */
    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public IAMCustomRoleState(
        @Nullable Input<Boolean> deleted,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> permissions,
        @Nullable Input<String> project,
        @Nullable Input<String> roleId,
        @Nullable Input<String> stage,
        @Nullable Input<String> title) {
        this.deleted = deleted;
        this.description = description;
        this.name = name;
        this.permissions = permissions;
        this.project = project;
        this.roleId = roleId;
        this.stage = stage;
        this.title = title;
    }

    private IAMCustomRoleState() {
        this.deleted = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.permissions = Input.empty();
        this.project = Input.empty();
        this.roleId = Input.empty();
        this.stage = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMCustomRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleted;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> permissions;
        private @Nullable Input<String> project;
        private @Nullable Input<String> roleId;
        private @Nullable Input<String> stage;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMCustomRoleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.project = defaults.project;
    	      this.roleId = defaults.roleId;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder setDeleted(@Nullable Input<Boolean> deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder setDeleted(@Nullable Boolean deleted) {
            this.deleted = Input.ofNullable(deleted);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPermissions(@Nullable Input<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable List<String> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRoleId(@Nullable Input<String> roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setRoleId(@Nullable String roleId) {
            this.roleId = Input.ofNullable(roleId);
            return this;
        }

        public Builder setStage(@Nullable Input<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder setStage(@Nullable String stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public IAMCustomRoleState build() {
            return new IAMCustomRoleState(deleted, description, name, permissions, project, roleId, stage, title);
        }
    }
}
