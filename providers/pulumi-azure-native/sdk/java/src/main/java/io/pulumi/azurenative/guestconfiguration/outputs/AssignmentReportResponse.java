// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.outputs;

import io.pulumi.azurenative.guestconfiguration.outputs.AssignmentInfoResponse;
import io.pulumi.azurenative.guestconfiguration.outputs.AssignmentReportResourceResponse;
import io.pulumi.azurenative.guestconfiguration.outputs.VMInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssignmentReportResponse {
    /**
     * Configuration details of the guest configuration assignment.
     * 
     */
    private final @Nullable AssignmentInfoResponse assignment;
    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    private final String complianceStatus;
    /**
     * End date and time of the guest configuration assignment compliance status check.
     * 
     */
    private final String endTime;
    /**
     * ARM resource id of the report for the guest configuration assignment.
     * 
     */
    private final String id;
    /**
     * Type of report, Consistency or Initial
     * 
     */
    private final String operationType;
    /**
     * GUID that identifies the guest configuration assignment report under a subscription, resource group.
     * 
     */
    private final String reportId;
    /**
     * The list of resources for which guest configuration assignment compliance is checked.
     * 
     */
    private final @Nullable List<AssignmentReportResourceResponse> resources;
    /**
     * Start date and time of the guest configuration assignment compliance status check.
     * 
     */
    private final String startTime;
    /**
     * Information about the VM.
     * 
     */
    private final @Nullable VMInfoResponse vm;

    @OutputCustomType.Constructor
    private AssignmentReportResponse(
        @OutputCustomType.Parameter("assignment") @Nullable AssignmentInfoResponse assignment,
        @OutputCustomType.Parameter("complianceStatus") String complianceStatus,
        @OutputCustomType.Parameter("endTime") String endTime,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("operationType") String operationType,
        @OutputCustomType.Parameter("reportId") String reportId,
        @OutputCustomType.Parameter("resources") @Nullable List<AssignmentReportResourceResponse> resources,
        @OutputCustomType.Parameter("startTime") String startTime,
        @OutputCustomType.Parameter("vm") @Nullable VMInfoResponse vm) {
        this.assignment = assignment;
        this.complianceStatus = complianceStatus;
        this.endTime = endTime;
        this.id = id;
        this.operationType = operationType;
        this.reportId = reportId;
        this.resources = resources;
        this.startTime = startTime;
        this.vm = vm;
    }

    /**
     * Configuration details of the guest configuration assignment.
     * 
    */
    public Optional<AssignmentInfoResponse> getAssignment() {
        return Optional.ofNullable(this.assignment);
    }
    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
    */
    public String getComplianceStatus() {
        return this.complianceStatus;
    }
    /**
     * End date and time of the guest configuration assignment compliance status check.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * ARM resource id of the report for the guest configuration assignment.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Type of report, Consistency or Initial
     * 
    */
    public String getOperationType() {
        return this.operationType;
    }
    /**
     * GUID that identifies the guest configuration assignment report under a subscription, resource group.
     * 
    */
    public String getReportId() {
        return this.reportId;
    }
    /**
     * The list of resources for which guest configuration assignment compliance is checked.
     * 
    */
    public List<AssignmentReportResourceResponse> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * Start date and time of the guest configuration assignment compliance status check.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Information about the VM.
     * 
    */
    public Optional<VMInfoResponse> getVm() {
        return Optional.ofNullable(this.vm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentReportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AssignmentInfoResponse assignment;
        private String complianceStatus;
        private String endTime;
        private String id;
        private String operationType;
        private String reportId;
        private @Nullable List<AssignmentReportResourceResponse> resources;
        private String startTime;
        private @Nullable VMInfoResponse vm;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentReportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignment = defaults.assignment;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.operationType = defaults.operationType;
    	      this.reportId = defaults.reportId;
    	      this.resources = defaults.resources;
    	      this.startTime = defaults.startTime;
    	      this.vm = defaults.vm;
        }

        public Builder setAssignment(@Nullable AssignmentInfoResponse assignment) {
            this.assignment = assignment;
            return this;
        }

        public Builder setComplianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setOperationType(String operationType) {
            this.operationType = Objects.requireNonNull(operationType);
            return this;
        }

        public Builder setReportId(String reportId) {
            this.reportId = Objects.requireNonNull(reportId);
            return this;
        }

        public Builder setResources(@Nullable List<AssignmentReportResourceResponse> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setVm(@Nullable VMInfoResponse vm) {
            this.vm = vm;
            return this;
        }
        public AssignmentReportResponse build() {
            return new AssignmentReportResponse(assignment, complianceStatus, endTime, id, operationType, reportId, resources, startTime, vm);
        }
    }
}
