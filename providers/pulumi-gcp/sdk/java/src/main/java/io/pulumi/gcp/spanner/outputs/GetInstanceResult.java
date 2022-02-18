// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceResult {
    private final @Nullable String config;
    private final @Nullable String displayName;
    private final Boolean forceDestroy;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Map<String,String> labels;
    private final String name;
    private final Integer numNodes;
    private final Integer processingUnits;
    private final @Nullable String project;
    private final String state;

    @OutputCustomType.Constructor({"config","displayName","forceDestroy","id","labels","name","numNodes","processingUnits","project","state"})
    private GetInstanceResult(
        @Nullable String config,
        @Nullable String displayName,
        Boolean forceDestroy,
        String id,
        Map<String,String> labels,
        String name,
        Integer numNodes,
        Integer processingUnits,
        @Nullable String project,
        String state) {
        this.config = config;
        this.displayName = displayName;
        this.forceDestroy = Objects.requireNonNull(forceDestroy);
        this.id = Objects.requireNonNull(id);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.numNodes = Objects.requireNonNull(numNodes);
        this.processingUnits = Objects.requireNonNull(processingUnits);
        this.project = project;
        this.state = Objects.requireNonNull(state);
    }

    public Optional<String> getConfig() {
        return Optional.ofNullable(this.config);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Boolean getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public Integer getNumNodes() {
        return this.numNodes;
    }
    public Integer getProcessingUnits() {
        return this.processingUnits;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String config;
        private @Nullable String displayName;
        private Boolean forceDestroy;
        private String id;
        private Map<String,String> labels;
        private String name;
        private Integer numNodes;
        private Integer processingUnits;
        private @Nullable String project;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.displayName = defaults.displayName;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.numNodes = defaults.numNodes;
    	      this.processingUnits = defaults.processingUnits;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
        }

        public Builder setConfig(@Nullable String config) {
            this.config = config;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setForceDestroy(Boolean forceDestroy) {
            this.forceDestroy = Objects.requireNonNull(forceDestroy);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNumNodes(Integer numNodes) {
            this.numNodes = Objects.requireNonNull(numNodes);
            return this;
        }

        public Builder setProcessingUnits(Integer processingUnits) {
            this.processingUnits = Objects.requireNonNull(processingUnits);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetInstanceResult build() {
            return new GetInstanceResult(config, displayName, forceDestroy, id, labels, name, numNodes, processingUnits, project, state);
        }
    }
}
