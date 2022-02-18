// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIamBindingState Empty = new CaPoolIamBindingState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="caPool")
    private final @Nullable Input<String> caPool;

    public Input<String> getCaPool() {
        return this.caPool == null ? Input.empty() : this.caPool;
    }

    @InputImport(name="condition")
    private final @Nullable Input<CaPoolIamBindingConditionGetArgs> condition;

    public Input<CaPoolIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Location of the CaPool. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.certificateauthority.CaPoolIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public CaPoolIamBindingState(
        @Nullable Input<String> caPool,
        @Nullable Input<CaPoolIamBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> project,
        @Nullable Input<String> role) {
        this.caPool = caPool;
        this.condition = condition;
        this.etag = etag;
        this.location = location;
        this.members = members;
        this.project = project;
        this.role = role;
    }

    private CaPoolIamBindingState() {
        this.caPool = Input.empty();
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> caPool;
        private @Nullable Input<CaPoolIamBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> project;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPool = defaults.caPool;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setCaPool(@Nullable Input<String> caPool) {
            this.caPool = caPool;
            return this;
        }

        public Builder setCaPool(@Nullable String caPool) {
            this.caPool = Input.ofNullable(caPool);
            return this;
        }

        public Builder setCondition(@Nullable Input<CaPoolIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable CaPoolIamBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
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

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public CaPoolIamBindingState build() {
            return new CaPoolIamBindingState(caPool, condition, etag, location, members, project, role);
        }
    }
}
