// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.eventarc.outputs.TriggerDestinationCloudRunService;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerDestination {
    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    private final @Nullable String cloudFunction;
    /**
     * Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
     * 
     */
    private final @Nullable TriggerDestinationCloudRunService cloudRunService;

    @OutputCustomType.Constructor({"cloudFunction","cloudRunService"})
    private TriggerDestination(
        @Nullable String cloudFunction,
        @Nullable TriggerDestinationCloudRunService cloudRunService) {
        this.cloudFunction = cloudFunction;
        this.cloudRunService = cloudRunService;
    }

    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    public Optional<String> getCloudFunction() {
        return Optional.ofNullable(this.cloudFunction);
    }
    /**
     * Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
     * 
     */
    public Optional<TriggerDestinationCloudRunService> getCloudRunService() {
        return Optional.ofNullable(this.cloudRunService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudFunction;
        private @Nullable TriggerDestinationCloudRunService cloudRunService;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRunService = defaults.cloudRunService;
        }

        public Builder setCloudFunction(@Nullable String cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }

        public Builder setCloudRunService(@Nullable TriggerDestinationCloudRunService cloudRunService) {
            this.cloudRunService = cloudRunService;
            return this;
        }

        public TriggerDestination build() {
            return new TriggerDestination(cloudFunction, cloudRunService);
        }
    }
}
