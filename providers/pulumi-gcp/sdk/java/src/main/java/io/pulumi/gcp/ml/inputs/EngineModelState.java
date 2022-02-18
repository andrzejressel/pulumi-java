// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.ml.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.ml.inputs.EngineModelDefaultVersionGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EngineModelState extends io.pulumi.resources.ResourceArgs {

    public static final EngineModelState Empty = new EngineModelState();

    /**
     * The default version of the model. This version will be used to handle
     * prediction requests that do not specify a version.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultVersion")
    private final @Nullable Input<EngineModelDefaultVersionGetArgs> defaultVersion;

    public Input<EngineModelDefaultVersionGetArgs> getDefaultVersion() {
        return this.defaultVersion == null ? Input.empty() : this.defaultVersion;
    }

    /**
     * The description specified for the model when it was created.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * One or more labels that you can add, to organize your models.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name specified for the version when it was created.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
     * 
     */
    @InputImport(name="onlinePredictionConsoleLogging")
    private final @Nullable Input<Boolean> onlinePredictionConsoleLogging;

    public Input<Boolean> getOnlinePredictionConsoleLogging() {
        return this.onlinePredictionConsoleLogging == null ? Input.empty() : this.onlinePredictionConsoleLogging;
    }

    /**
     * If true, online prediction access logs are sent to StackDriver Logging.
     * 
     */
    @InputImport(name="onlinePredictionLogging")
    private final @Nullable Input<Boolean> onlinePredictionLogging;

    public Input<Boolean> getOnlinePredictionLogging() {
        return this.onlinePredictionLogging == null ? Input.empty() : this.onlinePredictionLogging;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The list of regions where the model is going to be deployed.
     * Currently only one region per model is supported
     * 
     */
    @InputImport(name="regions")
    private final @Nullable Input<String> regions;

    public Input<String> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    public EngineModelState(
        @Nullable Input<EngineModelDefaultVersionGetArgs> defaultVersion,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> onlinePredictionConsoleLogging,
        @Nullable Input<Boolean> onlinePredictionLogging,
        @Nullable Input<String> project,
        @Nullable Input<String> regions) {
        this.defaultVersion = defaultVersion;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.onlinePredictionConsoleLogging = onlinePredictionConsoleLogging;
        this.onlinePredictionLogging = onlinePredictionLogging;
        this.project = project;
        this.regions = regions;
    }

    private EngineModelState() {
        this.defaultVersion = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.onlinePredictionConsoleLogging = Input.empty();
        this.onlinePredictionLogging = Input.empty();
        this.project = Input.empty();
        this.regions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EngineModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EngineModelDefaultVersionGetArgs> defaultVersion;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> onlinePredictionConsoleLogging;
        private @Nullable Input<Boolean> onlinePredictionLogging;
        private @Nullable Input<String> project;
        private @Nullable Input<String> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(EngineModelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.onlinePredictionConsoleLogging = defaults.onlinePredictionConsoleLogging;
    	      this.onlinePredictionLogging = defaults.onlinePredictionLogging;
    	      this.project = defaults.project;
    	      this.regions = defaults.regions;
        }

        public Builder setDefaultVersion(@Nullable Input<EngineModelDefaultVersionGetArgs> defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        public Builder setDefaultVersion(@Nullable EngineModelDefaultVersionGetArgs defaultVersion) {
            this.defaultVersion = Input.ofNullable(defaultVersion);
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

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setOnlinePredictionConsoleLogging(@Nullable Input<Boolean> onlinePredictionConsoleLogging) {
            this.onlinePredictionConsoleLogging = onlinePredictionConsoleLogging;
            return this;
        }

        public Builder setOnlinePredictionConsoleLogging(@Nullable Boolean onlinePredictionConsoleLogging) {
            this.onlinePredictionConsoleLogging = Input.ofNullable(onlinePredictionConsoleLogging);
            return this;
        }

        public Builder setOnlinePredictionLogging(@Nullable Input<Boolean> onlinePredictionLogging) {
            this.onlinePredictionLogging = onlinePredictionLogging;
            return this;
        }

        public Builder setOnlinePredictionLogging(@Nullable Boolean onlinePredictionLogging) {
            this.onlinePredictionLogging = Input.ofNullable(onlinePredictionLogging);
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

        public Builder setRegions(@Nullable Input<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable String regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public EngineModelState build() {
            return new EngineModelState(defaultVersion, description, labels, name, onlinePredictionConsoleLogging, onlinePredictionLogging, project, regions);
        }
    }
}
