// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.PipelineReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.TriggerPipelineReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ChainingTriggerResponse {
    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Upstream Pipelines.
     * 
     */
    private final List<PipelineReferenceResponse> dependsOn;
    /**
     * Trigger description.
     * 
     */
    private final @Nullable String description;
    /**
     * Pipeline for which runs are created when all upstream pipelines complete successfully.
     * 
     */
    private final TriggerPipelineReferenceResponse pipeline;
    /**
     * Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     */
    private final String runDimension;
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    private final String runtimeState;
    /**
     * Trigger type.
     * Expected value is 'ChainingTrigger'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ChainingTriggerResponse(
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("dependsOn") List<PipelineReferenceResponse> dependsOn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("pipeline") TriggerPipelineReferenceResponse pipeline,
        @OutputCustomType.Parameter("runDimension") String runDimension,
        @OutputCustomType.Parameter("runtimeState") String runtimeState,
        @OutputCustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.dependsOn = dependsOn;
        this.description = description;
        this.pipeline = pipeline;
        this.runDimension = runDimension;
        this.runtimeState = runtimeState;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the trigger.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Upstream Pipelines.
     * 
    */
    public List<PipelineReferenceResponse> getDependsOn() {
        return this.dependsOn;
    }
    /**
     * Trigger description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Pipeline for which runs are created when all upstream pipelines complete successfully.
     * 
    */
    public TriggerPipelineReferenceResponse getPipeline() {
        return this.pipeline;
    }
    /**
     * Run Dimension property that needs to be emitted by upstream pipelines.
     * 
    */
    public String getRunDimension() {
        return this.runDimension;
    }
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
    */
    public String getRuntimeState() {
        return this.runtimeState;
    }
    /**
     * Trigger type.
     * Expected value is 'ChainingTrigger'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChainingTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private List<PipelineReferenceResponse> dependsOn;
        private @Nullable String description;
        private TriggerPipelineReferenceResponse pipeline;
        private String runDimension;
        private String runtimeState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ChainingTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.pipeline = defaults.pipeline;
    	      this.runDimension = defaults.runDimension;
    	      this.runtimeState = defaults.runtimeState;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDependsOn(List<PipelineReferenceResponse> dependsOn) {
            this.dependsOn = Objects.requireNonNull(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setPipeline(TriggerPipelineReferenceResponse pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }

        public Builder setRunDimension(String runDimension) {
            this.runDimension = Objects.requireNonNull(runDimension);
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ChainingTriggerResponse build() {
            return new ChainingTriggerResponse(annotations, dependsOn, description, pipeline, runDimension, runtimeState, type);
        }
    }
}
