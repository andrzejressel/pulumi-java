// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sourcerepo;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryIamMemberArgs Empty = new RepositoryIamMemberArgs();

    @InputImport(name="condition")
    private final @Nullable Input<RepositoryIamMemberConditionArgs> condition;

    public Input<RepositoryIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
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

    @InputImport(name="repository", required=true)
    private final Input<String> repository;

    public Input<String> getRepository() {
        return this.repository;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.pubsub.TopicIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public RepositoryIamMemberArgs(
        @Nullable Input<RepositoryIamMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> repository,
        Input<String> role) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private RepositoryIamMemberArgs() {
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.repository = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RepositoryIamMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> repository;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.repository = defaults.repository;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<RepositoryIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable RepositoryIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
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

        public Builder setRepository(Input<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = Input.of(Objects.requireNonNull(repository));
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

        public RepositoryIamMemberArgs build() {
            return new RepositoryIamMemberArgs(condition, member, project, repository, role);
        }
    }
}
