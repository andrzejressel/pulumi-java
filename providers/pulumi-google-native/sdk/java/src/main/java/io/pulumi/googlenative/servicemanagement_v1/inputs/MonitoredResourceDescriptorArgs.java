// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.enums.MonitoredResourceDescriptorLaunchStage;
import io.pulumi.googlenative.servicemanagement_v1.inputs.LabelDescriptorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that describes the schema of a MonitoredResource object using a type name and a set of labels. For example, the monitored resource descriptor for Google Compute Engine VM instances has a type of `"gce_instance"` and specifies the use of the labels `"instance_id"` and `"zone"` to identify particular VM instances. Different APIs can support different monitored resource types. APIs generally provide a `list` method that returns the monitored resource descriptors used by the API.
 * 
 */
public final class MonitoredResourceDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoredResourceDescriptorArgs Empty = new MonitoredResourceDescriptorArgs();

    /**
     * Optional. A detailed description of the monitored resource type that might be used in documentation.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. A concise name for the monitored resource type that might be displayed in user interfaces. It should be a Title Cased Noun Phrase, without any article or other determiners. For example, `"Google Cloud SQL Database"`.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * A set of labels used to describe instances of this monitored resource type. For example, an individual Google Cloud SQL database is identified by values for the labels `"database_id"` and `"zone"`.
     * 
     */
    @InputImport(name="labels", required=true)
    private final Input<List<LabelDescriptorArgs>> labels;

    public Input<List<LabelDescriptorArgs>> getLabels() {
        return this.labels;
    }

    /**
     * Optional. The launch stage of the monitored resource definition.
     * 
     */
    @InputImport(name="launchStage")
    private final @Nullable Input<MonitoredResourceDescriptorLaunchStage> launchStage;

    public Input<MonitoredResourceDescriptorLaunchStage> getLaunchStage() {
        return this.launchStage == null ? Input.empty() : this.launchStage;
    }

    /**
     * Optional. The resource name of the monitored resource descriptor: `"projects/{project_id}/monitoredResourceDescriptors/{type}"` where {type} is the value of the `type` field in this object and {project_id} is a project ID that provides API-specific context for accessing the type. APIs that do not use project information can use the resource name format `"monitoredResourceDescriptors/{type}"`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The monitored resource type. For example, the type `"cloudsql_database"` represents databases in Google Cloud SQL. For a list of types, see [Monitoring resource types](https://cloud.google.com/monitoring/api/resources) and [Logging resource types](https://cloud.google.com/logging/docs/api/v2/resource-list).
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public MonitoredResourceDescriptorArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<List<LabelDescriptorArgs>> labels,
        @Nullable Input<MonitoredResourceDescriptorLaunchStage> launchStage,
        @Nullable Input<String> name,
        Input<String> type) {
        this.description = description;
        this.displayName = displayName;
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.launchStage = launchStage;
        this.name = name;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MonitoredResourceDescriptorArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.launchStage = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredResourceDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<List<LabelDescriptorArgs>> labels;
        private @Nullable Input<MonitoredResourceDescriptorLaunchStage> launchStage;
        private @Nullable Input<String> name;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredResourceDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.launchStage = defaults.launchStage;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
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

        public Builder setLabels(Input<List<LabelDescriptorArgs>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLabels(List<LabelDescriptorArgs> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
            return this;
        }

        public Builder setLaunchStage(@Nullable Input<MonitoredResourceDescriptorLaunchStage> launchStage) {
            this.launchStage = launchStage;
            return this;
        }

        public Builder setLaunchStage(@Nullable MonitoredResourceDescriptorLaunchStage launchStage) {
            this.launchStage = Input.ofNullable(launchStage);
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public MonitoredResourceDescriptorArgs build() {
            return new MonitoredResourceDescriptorArgs(description, displayName, labels, launchStage, name, type);
        }
    }
}
