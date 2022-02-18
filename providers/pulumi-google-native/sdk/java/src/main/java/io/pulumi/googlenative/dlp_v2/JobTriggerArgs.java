// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.JobTriggerStatus;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectJobConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TriggerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTriggerArgs Empty = new JobTriggerArgs();

    /**
     * User provided description (max 256 chars)
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Display name (max 100 chars)
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * For inspect jobs, a snapshot of the configuration.
     * 
     */
    @InputImport(name="inspectJob")
    private final @Nullable Input<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;

    public Input<GooglePrivacyDlpV2InspectJobConfigArgs> getInspectJob() {
        return this.inspectJob == null ? Input.empty() : this.inspectJob;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A status for this trigger.
     * 
     */
    @InputImport(name="status", required=true)
    private final Input<JobTriggerStatus> status;

    public Input<JobTriggerStatus> getStatus() {
        return this.status;
    }

    /**
     * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @InputImport(name="triggerId")
    private final @Nullable Input<String> triggerId;

    public Input<String> getTriggerId() {
        return this.triggerId == null ? Input.empty() : this.triggerId;
    }

    /**
     * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
     */
    @InputImport(name="triggers")
    private final @Nullable Input<List<GooglePrivacyDlpV2TriggerArgs>> triggers;

    public Input<List<GooglePrivacyDlpV2TriggerArgs>> getTriggers() {
        return this.triggers == null ? Input.empty() : this.triggers;
    }

    public JobTriggerArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<JobTriggerStatus> status,
        @Nullable Input<String> triggerId,
        @Nullable Input<List<GooglePrivacyDlpV2TriggerArgs>> triggers) {
        this.description = description;
        this.displayName = displayName;
        this.inspectJob = inspectJob;
        this.location = location;
        this.name = name;
        this.project = project;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.triggerId = triggerId;
        this.triggers = triggers;
    }

    private JobTriggerArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.inspectJob = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.status = Input.empty();
        this.triggerId = Input.empty();
        this.triggers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<JobTriggerStatus> status;
        private @Nullable Input<String> triggerId;
        private @Nullable Input<List<GooglePrivacyDlpV2TriggerArgs>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inspectJob = defaults.inspectJob;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.status = defaults.status;
    	      this.triggerId = defaults.triggerId;
    	      this.triggers = defaults.triggers;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setInspectJob(@Nullable Input<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob) {
            this.inspectJob = inspectJob;
            return this;
        }

        public Builder setInspectJob(@Nullable GooglePrivacyDlpV2InspectJobConfigArgs inspectJob) {
            this.inspectJob = Input.ofNullable(inspectJob);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setStatus(Input<JobTriggerStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(JobTriggerStatus status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder setTriggerId(@Nullable Input<String> triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public Builder setTriggerId(@Nullable String triggerId) {
            this.triggerId = Input.ofNullable(triggerId);
            return this;
        }

        public Builder setTriggers(@Nullable Input<List<GooglePrivacyDlpV2TriggerArgs>> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setTriggers(@Nullable List<GooglePrivacyDlpV2TriggerArgs> triggers) {
            this.triggers = Input.ofNullable(triggers);
            return this;
        }

        public JobTriggerArgs build() {
            return new JobTriggerArgs(description, displayName, inspectJob, location, name, project, status, triggerId, triggers);
        }
    }
}
