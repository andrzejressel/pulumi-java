// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppEngineVersionIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final AppEngineVersionIamMemberState Empty = new AppEngineVersionIamMemberState();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="appId")
    private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<AppEngineVersionIamMemberConditionGetArgs> condition;

    public Input<AppEngineVersionIamMemberConditionGetArgs> getCondition() {
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

    @InputImport(name="member")
    private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
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
     * `gcp.iap.AppEngineVersionIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="versionId")
    private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    public AppEngineVersionIamMemberState(
        @Nullable Input<String> appId,
        @Nullable Input<AppEngineVersionIamMemberConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> role,
        @Nullable Input<String> service,
        @Nullable Input<String> versionId) {
        this.appId = appId;
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.role = role;
        this.service = service;
        this.versionId = versionId;
    }

    private AppEngineVersionIamMemberState() {
        this.appId = Input.empty();
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
        this.service = Input.empty();
        this.versionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineVersionIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appId;
        private @Nullable Input<AppEngineVersionIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> role;
        private @Nullable Input<String> service;
        private @Nullable Input<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineVersionIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.service = defaults.service;
    	      this.versionId = defaults.versionId;
        }

        public Builder setAppId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder setCondition(@Nullable Input<AppEngineVersionIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable AppEngineVersionIamMemberConditionGetArgs condition) {
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

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
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

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setVersionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }

        public AppEngineVersionIamMemberState build() {
            return new AppEngineVersionIamMemberState(appId, condition, etag, member, project, role, service, versionId);
        }
    }
}
