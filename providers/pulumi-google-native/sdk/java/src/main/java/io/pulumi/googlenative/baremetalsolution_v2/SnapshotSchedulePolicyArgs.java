// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.baremetalsolution_v2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.baremetalsolution_v2.inputs.ScheduleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotSchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotSchedulePolicyArgs Empty = new SnapshotSchedulePolicyArgs();

    /**
     * The description of the snapshot schedule policy.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * An identifier for the snapshot schedule policy, generated by the backend.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Labels as key value pairs.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
     * 
     */
    @InputImport(name="schedules")
    private final @Nullable Input<List<ScheduleArgs>> schedules;

    public Input<List<ScheduleArgs>> getSchedules() {
        return this.schedules == null ? Input.empty() : this.schedules;
    }

    @InputImport(name="snapshotSchedulePolicyId", required=true)
    private final Input<String> snapshotSchedulePolicyId;

    public Input<String> getSnapshotSchedulePolicyId() {
        return this.snapshotSchedulePolicyId;
    }

    public SnapshotSchedulePolicyArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> id,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<List<ScheduleArgs>> schedules,
        Input<String> snapshotSchedulePolicyId) {
        this.description = description;
        this.id = id;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.schedules = schedules;
        this.snapshotSchedulePolicyId = Objects.requireNonNull(snapshotSchedulePolicyId, "expected parameter 'snapshotSchedulePolicyId' to be non-null");
    }

    private SnapshotSchedulePolicyArgs() {
        this.description = Input.empty();
        this.id = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.schedules = Input.empty();
        this.snapshotSchedulePolicyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> id;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<List<ScheduleArgs>> schedules;
        private Input<String> snapshotSchedulePolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.schedules = defaults.schedules;
    	      this.snapshotSchedulePolicyId = defaults.snapshotSchedulePolicyId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSchedules(@Nullable Input<List<ScheduleArgs>> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder setSchedules(@Nullable List<ScheduleArgs> schedules) {
            this.schedules = Input.ofNullable(schedules);
            return this;
        }

        public Builder setSnapshotSchedulePolicyId(Input<String> snapshotSchedulePolicyId) {
            this.snapshotSchedulePolicyId = Objects.requireNonNull(snapshotSchedulePolicyId);
            return this;
        }

        public Builder setSnapshotSchedulePolicyId(String snapshotSchedulePolicyId) {
            this.snapshotSchedulePolicyId = Input.of(Objects.requireNonNull(snapshotSchedulePolicyId));
            return this;
        }

        public SnapshotSchedulePolicyArgs build() {
            return new SnapshotSchedulePolicyArgs(description, id, labels, location, project, schedules, snapshotSchedulePolicyId);
        }
    }
}
