// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeIamPolicyState Empty = new RuntimeIamPolicyState();

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
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
    private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
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
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="runtimeName")
    private final @Nullable Input<String> runtimeName;

    public Input<String> getRuntimeName() {
        return this.runtimeName == null ? Input.empty() : this.runtimeName;
    }

    public RuntimeIamPolicyState(
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> runtimeName) {
        this.etag = etag;
        this.location = location;
        this.policyData = policyData;
        this.project = project;
        this.runtimeName = runtimeName;
    }

    private RuntimeIamPolicyState() {
        this.etag = Input.empty();
        this.location = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.runtimeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> runtimeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.runtimeName = defaults.runtimeName;
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

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
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

        public Builder setRuntimeName(@Nullable Input<String> runtimeName) {
            this.runtimeName = runtimeName;
            return this;
        }

        public Builder setRuntimeName(@Nullable String runtimeName) {
            this.runtimeName = Input.ofNullable(runtimeName);
            return this;
        }

        public RuntimeIamPolicyState build() {
            return new RuntimeIamPolicyState(etag, location, policyData, project, runtimeName);
        }
    }
}
