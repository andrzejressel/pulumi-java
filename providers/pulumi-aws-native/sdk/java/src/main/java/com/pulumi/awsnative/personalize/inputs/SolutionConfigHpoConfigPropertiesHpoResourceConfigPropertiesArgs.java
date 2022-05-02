// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the resource configuration for hyperparameter optimization (HPO).
 * 
 */
public final class SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs Empty = new SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs();

    /**
     * The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
     * 
     */
    @Import(name="maxNumberOfTrainingJobs")
    private @Nullable Output<String> maxNumberOfTrainingJobs;

    /**
     * @return The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
     * 
     */
    public Optional<Output<String>> maxNumberOfTrainingJobs() {
        return Optional.ofNullable(this.maxNumberOfTrainingJobs);
    }

    /**
     * The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
     * 
     */
    @Import(name="maxParallelTrainingJobs")
    private @Nullable Output<String> maxParallelTrainingJobs;

    /**
     * @return The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
     * 
     */
    public Optional<Output<String>> maxParallelTrainingJobs() {
        return Optional.ofNullable(this.maxParallelTrainingJobs);
    }

    private SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs() {}

    private SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs(SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs $) {
        this.maxNumberOfTrainingJobs = $.maxNumberOfTrainingJobs;
        this.maxParallelTrainingJobs = $.maxParallelTrainingJobs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs $;

        public Builder() {
            $ = new SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs();
        }

        public Builder(SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs defaults) {
            $ = new SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxNumberOfTrainingJobs The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
         * 
         * @return builder
         * 
         */
        public Builder maxNumberOfTrainingJobs(@Nullable Output<String> maxNumberOfTrainingJobs) {
            $.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
            return this;
        }

        /**
         * @param maxNumberOfTrainingJobs The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
         * 
         * @return builder
         * 
         */
        public Builder maxNumberOfTrainingJobs(String maxNumberOfTrainingJobs) {
            return maxNumberOfTrainingJobs(Output.of(maxNumberOfTrainingJobs));
        }

        /**
         * @param maxParallelTrainingJobs The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelTrainingJobs(@Nullable Output<String> maxParallelTrainingJobs) {
            $.maxParallelTrainingJobs = maxParallelTrainingJobs;
            return this;
        }

        /**
         * @param maxParallelTrainingJobs The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelTrainingJobs(String maxParallelTrainingJobs) {
            return maxParallelTrainingJobs(Output.of(maxParallelTrainingJobs));
        }

        public SolutionConfigHpoConfigPropertiesHpoResourceConfigPropertiesArgs build() {
            return $;
        }
    }

}
