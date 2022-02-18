// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The name of the instance's configuration (similar but not
     * quite the same as a region) which defines the geographic placement and
     * replication of your databases in this instance. It determines where your data
     * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
     * In order to obtain a valid list please consult the
     * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
     * 
     */
    @InputImport(name="config")
    private final @Nullable Input<String> config;

    public Input<String> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * The descriptive name for this instance as it appears in UIs. Must be
     * unique per project and between 4 and 30 characters in length.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * When deleting a spanner instance, this boolean option will delete all backups of this instance.
     * This must be set to true if you created a backup manually in the console.
     * 
     */
    @InputImport(name="forceDestroy")
    private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * A unique identifier for the instance, which cannot be changed after
     * the instance is created. The name must be between 6 and 30 characters
     * in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
     * terraform.
     * 
     */
    @InputImport(name="numNodes")
    private final @Nullable Input<Integer> numNodes;

    public Input<Integer> getNumNodes() {
        return this.numNodes == null ? Input.empty() : this.numNodes;
    }

    /**
     * The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
     * in terraform.
     * 
     */
    @InputImport(name="processingUnits")
    private final @Nullable Input<Integer> processingUnits;

    public Input<Integer> getProcessingUnits() {
        return this.processingUnits == null ? Input.empty() : this.processingUnits;
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
     * Instance status: 'CREATING' or 'READY'.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public InstanceState(
        @Nullable Input<String> config,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<Integer> numNodes,
        @Nullable Input<Integer> processingUnits,
        @Nullable Input<String> project,
        @Nullable Input<String> state) {
        this.config = config;
        this.displayName = displayName;
        this.forceDestroy = forceDestroy;
        this.labels = labels;
        this.name = name;
        this.numNodes = numNodes;
        this.processingUnits = processingUnits;
        this.project = project;
        this.state = state;
    }

    private InstanceState() {
        this.config = Input.empty();
        this.displayName = Input.empty();
        this.forceDestroy = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.numNodes = Input.empty();
        this.processingUnits = Input.empty();
        this.project = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> config;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> numNodes;
        private @Nullable Input<Integer> processingUnits;
        private @Nullable Input<String> project;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.displayName = defaults.displayName;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.numNodes = defaults.numNodes;
    	      this.processingUnits = defaults.processingUnits;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
        }

        public Builder setConfig(@Nullable Input<String> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable String config) {
            this.config = Input.ofNullable(config);
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

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
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

        public Builder setNumNodes(@Nullable Input<Integer> numNodes) {
            this.numNodes = numNodes;
            return this;
        }

        public Builder setNumNodes(@Nullable Integer numNodes) {
            this.numNodes = Input.ofNullable(numNodes);
            return this;
        }

        public Builder setProcessingUnits(@Nullable Input<Integer> processingUnits) {
            this.processingUnits = processingUnits;
            return this;
        }

        public Builder setProcessingUnits(@Nullable Integer processingUnits) {
            this.processingUnits = Input.ofNullable(processingUnits);
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

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public InstanceState build() {
            return new InstanceState(config, displayName, forceDestroy, labels, name, numNodes, processingUnits, project, state);
        }
    }
}
