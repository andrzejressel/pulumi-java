// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.VmUtilizationInfoResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetUtilizationReportResult {
    /**
     * The time the report was created (this refers to the time of the request, not the time the report creation completed).
     * 
     */
    private final String createTime;
    /**
     * The report display name, as assigned by the user.
     * 
     */
    private final String displayName;
    /**
     * Provides details on the state of the report in case of an error.
     * 
     */
    private final StatusResponse error;
    /**
     * The point in time when the time frame ends. Notice that the time frame is counted backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK then the report covers the week between 2021/01/20 and 2021/01/14.
     * 
     */
    private final String frameEndTime;
    /**
     * The report unique name.
     * 
     */
    private final String name;
    /**
     * Current state of the report.
     * 
     */
    private final String state;
    /**
     * The time the state was last set.
     * 
     */
    private final String stateTime;
    /**
     * Time frame of the report.
     * 
     */
    private final String timeFrame;
    /**
     * Total number of VMs included in the report.
     * 
     */
    private final Integer vmCount;
    /**
     * List of utilization information per VM. When sent as part of the request, the "vm_id" field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
     * 
     */
    private final List<VmUtilizationInfoResponse> vms;

    @OutputCustomType.Constructor({"createTime","displayName","error","frameEndTime","name","state","stateTime","timeFrame","vmCount","vms"})
    private GetUtilizationReportResult(
        String createTime,
        String displayName,
        StatusResponse error,
        String frameEndTime,
        String name,
        String state,
        String stateTime,
        String timeFrame,
        Integer vmCount,
        List<VmUtilizationInfoResponse> vms) {
        this.createTime = Objects.requireNonNull(createTime);
        this.displayName = Objects.requireNonNull(displayName);
        this.error = Objects.requireNonNull(error);
        this.frameEndTime = Objects.requireNonNull(frameEndTime);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.stateTime = Objects.requireNonNull(stateTime);
        this.timeFrame = Objects.requireNonNull(timeFrame);
        this.vmCount = Objects.requireNonNull(vmCount);
        this.vms = Objects.requireNonNull(vms);
    }

    /**
     * The time the report was created (this refers to the time of the request, not the time the report creation completed).
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The report display name, as assigned by the user.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Provides details on the state of the report in case of an error.
     * 
     */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The point in time when the time frame ends. Notice that the time frame is counted backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK then the report covers the week between 2021/01/20 and 2021/01/14.
     * 
     */
    public String getFrameEndTime() {
        return this.frameEndTime;
    }
    /**
     * The report unique name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Current state of the report.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The time the state was last set.
     * 
     */
    public String getStateTime() {
        return this.stateTime;
    }
    /**
     * Time frame of the report.
     * 
     */
    public String getTimeFrame() {
        return this.timeFrame;
    }
    /**
     * Total number of VMs included in the report.
     * 
     */
    public Integer getVmCount() {
        return this.vmCount;
    }
    /**
     * List of utilization information per VM. When sent as part of the request, the "vm_id" field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
     * 
     */
    public List<VmUtilizationInfoResponse> getVms() {
        return this.vms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUtilizationReportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private StatusResponse error;
        private String frameEndTime;
        private String name;
        private String state;
        private String stateTime;
        private String timeFrame;
        private Integer vmCount;
        private List<VmUtilizationInfoResponse> vms;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUtilizationReportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.error = defaults.error;
    	      this.frameEndTime = defaults.frameEndTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
    	      this.timeFrame = defaults.timeFrame;
    	      this.vmCount = defaults.vmCount;
    	      this.vms = defaults.vms;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setFrameEndTime(String frameEndTime) {
            this.frameEndTime = Objects.requireNonNull(frameEndTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }

        public Builder setTimeFrame(String timeFrame) {
            this.timeFrame = Objects.requireNonNull(timeFrame);
            return this;
        }

        public Builder setVmCount(Integer vmCount) {
            this.vmCount = Objects.requireNonNull(vmCount);
            return this;
        }

        public Builder setVms(List<VmUtilizationInfoResponse> vms) {
            this.vms = Objects.requireNonNull(vms);
            return this;
        }

        public GetUtilizationReportResult build() {
            return new GetUtilizationReportResult(createTime, displayName, error, frameEndTime, name, state, stateTime, timeFrame, vmCount, vms);
        }
    }
}
