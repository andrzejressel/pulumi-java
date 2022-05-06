// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryreservation_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigqueryreservation_v1.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCapacityCommitmentResult {
    /**
     * @return The end of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    private final String commitmentEndTime;
    /**
     * @return The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    private final String commitmentStartTime;
    /**
     * @return For FAILED commitment plan, provides the reason of failure.
     * 
     */
    private final StatusResponse failureStatus;
    /**
     * @return Applicable only for commitments located within one of the BigQuery multi-regions (US or EU). If set to true, this commitment is placed in the organization&#39;s secondary region which is designated for disaster recovery purposes. If false, this commitment is placed in the organization&#39;s default region.
     * 
     */
    private final Boolean multiRegionAuxiliary;
    /**
     * @return The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123` The commitment_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
     * 
     */
    private final String name;
    /**
     * @return Capacity commitment commitment plan.
     * 
     */
    private final String plan;
    /**
     * @return The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for ANNUAL and TRIAL commitments.
     * 
     */
    private final String renewalPlan;
    /**
     * @return Number of slots in this commitment.
     * 
     */
    private final String slotCount;
    /**
     * @return State of the commitment.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetCapacityCommitmentResult(
        @CustomType.Parameter("commitmentEndTime") String commitmentEndTime,
        @CustomType.Parameter("commitmentStartTime") String commitmentStartTime,
        @CustomType.Parameter("failureStatus") StatusResponse failureStatus,
        @CustomType.Parameter("multiRegionAuxiliary") Boolean multiRegionAuxiliary,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("plan") String plan,
        @CustomType.Parameter("renewalPlan") String renewalPlan,
        @CustomType.Parameter("slotCount") String slotCount,
        @CustomType.Parameter("state") String state) {
        this.commitmentEndTime = commitmentEndTime;
        this.commitmentStartTime = commitmentStartTime;
        this.failureStatus = failureStatus;
        this.multiRegionAuxiliary = multiRegionAuxiliary;
        this.name = name;
        this.plan = plan;
        this.renewalPlan = renewalPlan;
        this.slotCount = slotCount;
        this.state = state;
    }

    /**
     * @return The end of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public String commitmentEndTime() {
        return this.commitmentEndTime;
    }
    /**
     * @return The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public String commitmentStartTime() {
        return this.commitmentStartTime;
    }
    /**
     * @return For FAILED commitment plan, provides the reason of failure.
     * 
     */
    public StatusResponse failureStatus() {
        return this.failureStatus;
    }
    /**
     * @return Applicable only for commitments located within one of the BigQuery multi-regions (US or EU). If set to true, this commitment is placed in the organization&#39;s secondary region which is designated for disaster recovery purposes. If false, this commitment is placed in the organization&#39;s default region.
     * 
     */
    public Boolean multiRegionAuxiliary() {
        return this.multiRegionAuxiliary;
    }
    /**
     * @return The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123` The commitment_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Capacity commitment commitment plan.
     * 
     */
    public String plan() {
        return this.plan;
    }
    /**
     * @return The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for ANNUAL and TRIAL commitments.
     * 
     */
    public String renewalPlan() {
        return this.renewalPlan;
    }
    /**
     * @return Number of slots in this commitment.
     * 
     */
    public String slotCount() {
        return this.slotCount;
    }
    /**
     * @return State of the commitment.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityCommitmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitmentEndTime;
        private String commitmentStartTime;
        private StatusResponse failureStatus;
        private Boolean multiRegionAuxiliary;
        private String name;
        private String plan;
        private String renewalPlan;
        private String slotCount;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityCommitmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitmentEndTime = defaults.commitmentEndTime;
    	      this.commitmentStartTime = defaults.commitmentStartTime;
    	      this.failureStatus = defaults.failureStatus;
    	      this.multiRegionAuxiliary = defaults.multiRegionAuxiliary;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.renewalPlan = defaults.renewalPlan;
    	      this.slotCount = defaults.slotCount;
    	      this.state = defaults.state;
        }

        public Builder commitmentEndTime(String commitmentEndTime) {
            this.commitmentEndTime = Objects.requireNonNull(commitmentEndTime);
            return this;
        }
        public Builder commitmentStartTime(String commitmentStartTime) {
            this.commitmentStartTime = Objects.requireNonNull(commitmentStartTime);
            return this;
        }
        public Builder failureStatus(StatusResponse failureStatus) {
            this.failureStatus = Objects.requireNonNull(failureStatus);
            return this;
        }
        public Builder multiRegionAuxiliary(Boolean multiRegionAuxiliary) {
            this.multiRegionAuxiliary = Objects.requireNonNull(multiRegionAuxiliary);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder plan(String plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }
        public Builder renewalPlan(String renewalPlan) {
            this.renewalPlan = Objects.requireNonNull(renewalPlan);
            return this;
        }
        public Builder slotCount(String slotCount) {
            this.slotCount = Objects.requireNonNull(slotCount);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetCapacityCommitmentResult build() {
            return new GetCapacityCommitmentResult(commitmentEndTime, commitmentStartTime, failureStatus, multiRegionAuxiliary, name, plan, renewalPlan, slotCount, state);
        }
    }
}
