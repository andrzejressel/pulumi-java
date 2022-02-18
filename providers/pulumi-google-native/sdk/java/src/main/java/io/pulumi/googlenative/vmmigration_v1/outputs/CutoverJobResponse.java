// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.vmmigration_v1.outputs.ComputeEngineTargetDetailsResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CutoverJobResponse {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    private final ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
    /**
     * The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    private final String createTime;
    /**
     * Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    private final StatusResponse error;
    /**
     * The name of the cutover job.
     * 
     */
    private final String name;
    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    private final Integer progressPercent;
    /**
     * State of the cutover job.
     * 
     */
    private final String state;
    /**
     * A message providing possible extra details about the current state.
     * 
     */
    private final String stateMessage;
    /**
     * The time the state was last updated.
     * 
     */
    private final String stateTime;

    @OutputCustomType.Constructor({"computeEngineTargetDetails","createTime","error","name","progressPercent","state","stateMessage","stateTime"})
    private CutoverJobResponse(
        ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        String createTime,
        StatusResponse error,
        String name,
        Integer progressPercent,
        String state,
        String stateMessage,
        String stateTime) {
        this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
        this.createTime = Objects.requireNonNull(createTime);
        this.error = Objects.requireNonNull(error);
        this.name = Objects.requireNonNull(name);
        this.progressPercent = Objects.requireNonNull(progressPercent);
        this.state = Objects.requireNonNull(state);
        this.stateMessage = Objects.requireNonNull(stateMessage);
        this.stateTime = Objects.requireNonNull(stateTime);
    }

    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    public ComputeEngineTargetDetailsResponse getComputeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The name of the cutover job.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    public Integer getProgressPercent() {
        return this.progressPercent;
    }
    /**
     * State of the cutover job.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * A message providing possible extra details about the current state.
     * 
     */
    public String getStateMessage() {
        return this.stateMessage;
    }
    /**
     * The time the state was last updated.
     * 
     */
    public String getStateTime() {
        return this.stateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CutoverJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private String createTime;
        private StatusResponse error;
        private String name;
        private Integer progressPercent;
        private String state;
        private String stateMessage;
        private String stateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CutoverJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.createTime = defaults.createTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.progressPercent = defaults.progressPercent;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.stateTime = defaults.stateTime;
        }

        public Builder setComputeEngineTargetDetails(ComputeEngineTargetDetailsResponse computeEngineTargetDetails) {
            this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProgressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }

        public Builder setStateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }

        public CutoverJobResponse build() {
            return new CutoverJobResponse(computeEngineTargetDetails, createTime, error, name, progressPercent, state, stateMessage, stateTime);
        }
    }
}
