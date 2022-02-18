// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The state of the pipeline. When the pipeline is created, the state is set to 'PIPELINE_STATE_ACTIVE' by default. State changes can be requested by setting the state to stopping, paused, or resuming. State cannot be changed through UpdatePipeline requests.
     * 
     */
    @EnumType
    public enum PipelineState {
        /**
         * The pipeline state isn't specified.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The pipeline is getting started or resumed. When finished, the pipeline state will be 'PIPELINE_STATE_ACTIVE'.
         * 
         */
        StateResuming("STATE_RESUMING"),
        /**
         * The pipeline is actively running.
         * 
         */
        StateActive("STATE_ACTIVE"),
        /**
         * The pipeline is in the process of stopping. When finished, the pipeline state will be 'PIPELINE_STATE_ARCHIVED'.
         * 
         */
        StateStopping("STATE_STOPPING"),
        /**
         * The pipeline has been stopped. This is a terminal state and cannot be undone.
         * 
         */
        StateArchived("STATE_ARCHIVED"),
        /**
         * The pipeline is paused. This is a non-terminal state. When the pipeline is paused, it will hold processing jobs, but can be resumed later. For a batch pipeline, this means pausing the scheduler job. For a streaming pipeline, creating a job snapshot to resume from will give the same effect.
         * 
         */
        StatePaused("STATE_PAUSED");

        private final String value;

        PipelineState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PipelineState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
