// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentState extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentState Empty = new OsPolicyAssignmentState();

    /**
     * Output only. Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS
     * policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for
     * this field.
     * 
     */
    @InputImport(name="baseline")
    private final @Nullable Input<Boolean> baseline;

    public Input<Boolean> getBaseline() {
        return this.baseline == null ? Input.empty() : this.baseline;
    }

    /**
     * Output only. Indicates that this revision deletes the OS policy assignment.
     * 
     */
    @InputImport(name="deleted")
    private final @Nullable Input<Boolean> deleted;

    public Input<Boolean> getDeleted() {
        return this.deleted == null ? Input.empty() : this.deleted;
    }

    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Required. Filter to select VMs.
     * 
     */
    @InputImport(name="instanceFilter")
    private final @Nullable Input<OsPolicyAssignmentInstanceFilterGetArgs> instanceFilter;

    public Input<OsPolicyAssignmentInstanceFilterGetArgs> getInstanceFilter() {
        return this.instanceFilter == null ? Input.empty() : this.instanceFilter;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Required. The name of the repository.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Required. List of OS policies to be applied to the VMs.
     * 
     */
    @InputImport(name="osPolicies")
    private final @Nullable Input<List<OsPolicyAssignmentOsPolicyGetArgs>> osPolicies;

    public Input<List<OsPolicyAssignmentOsPolicyGetArgs>> getOsPolicies() {
        return this.osPolicies == null ? Input.empty() : this.osPolicies;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Output only. Indicates that reconciliation is in progress for the revision. This value is `true` when the
     * `rollout_state` is one of: * IN_PROGRESS * CANCELLING
     * 
     */
    @InputImport(name="reconciling")
    private final @Nullable Input<Boolean> reconciling;

    public Input<Boolean> getReconciling() {
        return this.reconciling == null ? Input.empty() : this.reconciling;
    }

    /**
     * Output only. The timestamp that the revision was created.
     * 
     */
    @InputImport(name="revisionCreateTime")
    private final @Nullable Input<String> revisionCreateTime;

    public Input<String> getRevisionCreateTime() {
        return this.revisionCreateTime == null ? Input.empty() : this.revisionCreateTime;
    }

    /**
     * Output only. The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy
     * assignment
     * 
     */
    @InputImport(name="revisionId")
    private final @Nullable Input<String> revisionId;

    public Input<String> getRevisionId() {
        return this.revisionId == null ? Input.empty() : this.revisionId;
    }

    /**
     * Required. Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    @InputImport(name="rollout")
    private final @Nullable Input<OsPolicyAssignmentRolloutGetArgs> rollout;

    public Input<OsPolicyAssignmentRolloutGetArgs> getRollout() {
        return this.rollout == null ? Input.empty() : this.rollout;
    }

    /**
     * Output only. OS policy assignment rollout state Possible values: ROLLOUT_STATE_UNSPECIFIED, IN_PROGRESS, CANCELLING,
     * CANCELLED, SUCCEEDED
     * 
     */
    @InputImport(name="rolloutState")
    private final @Nullable Input<String> rolloutState;

    public Input<String> getRolloutState() {
        return this.rolloutState == null ? Input.empty() : this.rolloutState;
    }

    /**
     * Output only. Server generated unique id for the OS policy assignment resource.
     * 
     */
    @InputImport(name="uid")
    private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public OsPolicyAssignmentState(
        @Nullable Input<Boolean> baseline,
        @Nullable Input<Boolean> deleted,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        @Nullable Input<OsPolicyAssignmentInstanceFilterGetArgs> instanceFilter,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<List<OsPolicyAssignmentOsPolicyGetArgs>> osPolicies,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> reconciling,
        @Nullable Input<String> revisionCreateTime,
        @Nullable Input<String> revisionId,
        @Nullable Input<OsPolicyAssignmentRolloutGetArgs> rollout,
        @Nullable Input<String> rolloutState,
        @Nullable Input<String> uid) {
        this.baseline = baseline;
        this.deleted = deleted;
        this.description = description;
        this.etag = etag;
        this.instanceFilter = instanceFilter;
        this.location = location;
        this.name = name;
        this.osPolicies = osPolicies;
        this.project = project;
        this.reconciling = reconciling;
        this.revisionCreateTime = revisionCreateTime;
        this.revisionId = revisionId;
        this.rollout = rollout;
        this.rolloutState = rolloutState;
        this.uid = uid;
    }

    private OsPolicyAssignmentState() {
        this.baseline = Input.empty();
        this.deleted = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.instanceFilter = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.osPolicies = Input.empty();
        this.project = Input.empty();
        this.reconciling = Input.empty();
        this.revisionCreateTime = Input.empty();
        this.revisionId = Input.empty();
        this.rollout = Input.empty();
        this.rolloutState = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> baseline;
        private @Nullable Input<Boolean> deleted;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private @Nullable Input<OsPolicyAssignmentInstanceFilterGetArgs> instanceFilter;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<List<OsPolicyAssignmentOsPolicyGetArgs>> osPolicies;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> reconciling;
        private @Nullable Input<String> revisionCreateTime;
        private @Nullable Input<String> revisionId;
        private @Nullable Input<OsPolicyAssignmentRolloutGetArgs> rollout;
        private @Nullable Input<String> rolloutState;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseline = defaults.baseline;
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.osPolicies = defaults.osPolicies;
    	      this.project = defaults.project;
    	      this.reconciling = defaults.reconciling;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.rollout = defaults.rollout;
    	      this.rolloutState = defaults.rolloutState;
    	      this.uid = defaults.uid;
        }

        public Builder setBaseline(@Nullable Input<Boolean> baseline) {
            this.baseline = baseline;
            return this;
        }

        public Builder setBaseline(@Nullable Boolean baseline) {
            this.baseline = Input.ofNullable(baseline);
            return this;
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

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setInstanceFilter(@Nullable Input<OsPolicyAssignmentInstanceFilterGetArgs> instanceFilter) {
            this.instanceFilter = instanceFilter;
            return this;
        }

        public Builder setInstanceFilter(@Nullable OsPolicyAssignmentInstanceFilterGetArgs instanceFilter) {
            this.instanceFilter = Input.ofNullable(instanceFilter);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOsPolicies(@Nullable Input<List<OsPolicyAssignmentOsPolicyGetArgs>> osPolicies) {
            this.osPolicies = osPolicies;
            return this;
        }

        public Builder setOsPolicies(@Nullable List<OsPolicyAssignmentOsPolicyGetArgs> osPolicies) {
            this.osPolicies = Input.ofNullable(osPolicies);
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

        public Builder setReconciling(@Nullable Input<Boolean> reconciling) {
            this.reconciling = reconciling;
            return this;
        }

        public Builder setReconciling(@Nullable Boolean reconciling) {
            this.reconciling = Input.ofNullable(reconciling);
            return this;
        }

        public Builder setRevisionCreateTime(@Nullable Input<String> revisionCreateTime) {
            this.revisionCreateTime = revisionCreateTime;
            return this;
        }

        public Builder setRevisionCreateTime(@Nullable String revisionCreateTime) {
            this.revisionCreateTime = Input.ofNullable(revisionCreateTime);
            return this;
        }

        public Builder setRevisionId(@Nullable Input<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public Builder setRevisionId(@Nullable String revisionId) {
            this.revisionId = Input.ofNullable(revisionId);
            return this;
        }

        public Builder setRollout(@Nullable Input<OsPolicyAssignmentRolloutGetArgs> rollout) {
            this.rollout = rollout;
            return this;
        }

        public Builder setRollout(@Nullable OsPolicyAssignmentRolloutGetArgs rollout) {
            this.rollout = Input.ofNullable(rollout);
            return this;
        }

        public Builder setRolloutState(@Nullable Input<String> rolloutState) {
            this.rolloutState = rolloutState;
            return this;
        }

        public Builder setRolloutState(@Nullable String rolloutState) {
            this.rolloutState = Input.ofNullable(rolloutState);
            return this;
        }

        public Builder setUid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public OsPolicyAssignmentState build() {
            return new OsPolicyAssignmentState(baseline, deleted, description, etag, instanceFilter, location, name, osPolicies, project, reconciling, revisionCreateTime, revisionId, rollout, rolloutState, uid);
        }
    }
}
