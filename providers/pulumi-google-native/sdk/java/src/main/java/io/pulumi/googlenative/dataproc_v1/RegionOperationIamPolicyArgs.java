// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionOperationIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionOperationIamPolicyArgs Empty = new RegionOperationIamPolicyArgs();

    /**
     * Associates a list of members, or principals, with a role. Optionally, may specify a condition that determines how and when the bindings are applied. Each of the bindings must contain at least one principal.The bindings in a Policy can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the bindings grant 50 different roles to user:alice@example.com, and not to any other principal, then you can add another 1,450 principals to the bindings in the Policy.
     * 
     */
    @InputImport(name="bindings")
    private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the etag in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An etag is returned in the response to getIamPolicy, and systems are expected to put that etag in the request to setIamPolicy to ensure that their change will be applied to the same version of the policy.Important: If you use IAM Conditions, you must include the etag field whenever you call setIamPolicy. If you omit this field, then IAM allows you to overwrite a version 3 policy with a version 1 policy, and all of the conditions in the version 3 policy are lost.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="operationId", required=true)
    private final Input<String> operationId;

    public Input<String> getOperationId() {
        return this.operationId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="regionId", required=true)
    private final Input<String> regionId;

    public Input<String> getRegionId() {
        return this.regionId;
    }

    /**
     * Specifies the format of the policy.Valid values are 0, 1, and 3. Requests that specify an invalid value are rejected.Any operation that affects conditional role bindings must specify version 3. This requirement applies to the following operations: Getting a policy that includes a conditional role binding Adding a conditional role binding to a policy Changing a conditional role binding in a policy Removing any role binding, with or without a condition, from a policy that includes conditionsImportant: If you use IAM Conditions, you must include the etag field whenever you call setIamPolicy. If you omit this field, then IAM allows you to overwrite a version 3 policy with a version 1 policy, and all of the conditions in the version 3 policy are lost.If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public RegionOperationIamPolicyArgs(
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        Input<String> operationId,
        @Nullable Input<String> project,
        Input<String> regionId,
        @Nullable Input<Integer> version) {
        this.bindings = bindings;
        this.etag = etag;
        this.operationId = Objects.requireNonNull(operationId, "expected parameter 'operationId' to be non-null");
        this.project = project;
        this.regionId = Objects.requireNonNull(regionId, "expected parameter 'regionId' to be non-null");
        this.version = version;
    }

    private RegionOperationIamPolicyArgs() {
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.operationId = Input.empty();
        this.project = Input.empty();
        this.regionId = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionOperationIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private Input<String> operationId;
        private @Nullable Input<String> project;
        private Input<String> regionId;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionOperationIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.operationId = defaults.operationId;
    	      this.project = defaults.project;
    	      this.regionId = defaults.regionId;
    	      this.version = defaults.version;
        }

        public Builder setBindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setBindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
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

        public Builder setOperationId(Input<String> operationId) {
            this.operationId = Objects.requireNonNull(operationId);
            return this;
        }

        public Builder setOperationId(String operationId) {
            this.operationId = Input.of(Objects.requireNonNull(operationId));
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

        public Builder setRegionId(Input<String> regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }

        public Builder setRegionId(String regionId) {
            this.regionId = Input.of(Objects.requireNonNull(regionId));
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public RegionOperationIamPolicyArgs build() {
            return new RegionOperationIamPolicyArgs(bindings, etag, operationId, project, regionId, version);
        }
    }
}
