// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class StepResponse {
    /**
     * The kind of step in the Cloud Dataflow job.
     * 
     */
    private final String kind;
    /**
     * The name that identifies the step. This must be unique for each step with respect to all other steps in the Cloud Dataflow job.
     * 
     */
    private final String name;
    /**
     * Named properties associated with the step. Each kind of predefined step has its own required set of properties. Must be provided on Create. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    private final Map<String,String> properties;

    @OutputCustomType.Constructor({"kind","name","properties"})
    private StepResponse(
        String kind,
        String name,
        Map<String,String> properties) {
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
    }

    /**
     * The kind of step in the Cloud Dataflow job.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name that identifies the step. This must be unique for each step with respect to all other steps in the Cloud Dataflow job.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Named properties associated with the step. Each kind of predefined step has its own required set of properties. Must be provided on Create. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(StepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public StepResponse build() {
            return new StepResponse(kind, name, properties);
        }
    }
}
