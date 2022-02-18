// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyIamBindingArgs Empty = new TaxonomyIamBindingArgs();

    @InputImport(name="condition")
    private final @Nullable Input<TaxonomyIamBindingConditionArgs> condition;

    public Input<TaxonomyIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
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

    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.TaxonomyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="taxonomy", required=true)
    private final Input<String> taxonomy;

    public Input<String> getTaxonomy() {
        return this.taxonomy;
    }

    public TaxonomyIamBindingArgs(
        @Nullable Input<TaxonomyIamBindingConditionArgs> condition,
        Input<List<String>> members,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> role,
        Input<String> taxonomy) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.taxonomy = Objects.requireNonNull(taxonomy, "expected parameter 'taxonomy' to be non-null");
    }

    private TaxonomyIamBindingArgs() {
        this.condition = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
        this.taxonomy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaxonomyIamBindingConditionArgs> condition;
        private Input<List<String>> members;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> role;
        private Input<String> taxonomy;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.taxonomy = defaults.taxonomy;
        }

        public Builder setCondition(@Nullable Input<TaxonomyIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable TaxonomyIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setTaxonomy(Input<String> taxonomy) {
            this.taxonomy = Objects.requireNonNull(taxonomy);
            return this;
        }

        public Builder setTaxonomy(String taxonomy) {
            this.taxonomy = Input.of(Objects.requireNonNull(taxonomy));
            return this;
        }

        public TaxonomyIamBindingArgs build() {
            return new TaxonomyIamBindingArgs(condition, members, project, region, role, taxonomy);
        }
    }
}
