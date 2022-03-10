// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.PipelineSourceTriggerPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineTriggerPropertiesResponse {
    /**
     * The source trigger properties of the pipeline.
     * 
     */
    private final @Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger;

    @OutputCustomType.Constructor
    private PipelineTriggerPropertiesResponse(@OutputCustomType.Parameter("sourceTrigger") @Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
    }

    /**
     * The source trigger properties of the pipeline.
     * 
    */
    public Optional<PipelineSourceTriggerPropertiesResponse> getSourceTrigger() {
        return Optional.ofNullable(this.sourceTrigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTriggerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTriggerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceTrigger = defaults.sourceTrigger;
        }

        public Builder setSourceTrigger(@Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger) {
            this.sourceTrigger = sourceTrigger;
            return this;
        }
        public PipelineTriggerPropertiesResponse build() {
            return new PipelineTriggerPropertiesResponse(sourceTrigger);
        }
    }
}
