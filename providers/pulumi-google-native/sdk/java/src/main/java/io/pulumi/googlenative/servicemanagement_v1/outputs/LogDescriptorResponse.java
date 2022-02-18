// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.LabelDescriptorResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LogDescriptorResponse {
    /**
     * A human-readable description of this log. This information appears in the documentation and can contain details.
     * 
     */
    private final String description;
    /**
     * The human-readable name for this log. This information appears on the user interface and should be concise.
     * 
     */
    private final String displayName;
    /**
     * The set of labels that are available to describe a specific log entry. Runtime requests that contain labels not specified here are considered invalid.
     * 
     */
    private final List<LabelDescriptorResponse> labels;
    /**
     * The name of the log. It must be less than 512 characters long and can include the following characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation characters including slash, underscore, hyphen, period [/_-.].
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"description","displayName","labels","name"})
    private LogDescriptorResponse(
        String description,
        String displayName,
        List<LabelDescriptorResponse> labels,
        String name) {
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * A human-readable description of this log. This information appears in the documentation and can contain details.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name for this log. This information appears on the user interface and should be concise.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The set of labels that are available to describe a specific log entry. Runtime requests that contain labels not specified here are considered invalid.
     * 
     */
    public List<LabelDescriptorResponse> getLabels() {
        return this.labels;
    }
    /**
     * The name of the log. It must be less than 512 characters long and can include the following characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation characters including slash, underscore, hyphen, period [/_-.].
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private List<LabelDescriptorResponse> labels;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(LogDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLabels(List<LabelDescriptorResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public LogDescriptorResponse build() {
            return new LogDescriptorResponse(description, displayName, labels, name);
        }
    }
}
