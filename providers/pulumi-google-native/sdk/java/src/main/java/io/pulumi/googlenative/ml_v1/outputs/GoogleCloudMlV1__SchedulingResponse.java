// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__SchedulingResponse {
    /**
     * Optional. The maximum job running time, expressed in seconds. The field can contain up to nine fractional digits, terminated by `s`. If not specified, this field defaults to `604800s` (seven days). If the training job is still running after this duration, AI Platform Training cancels it. The duration is measured from when the job enters the `RUNNING` state; therefore it does not overlap with the duration limited by Scheduling.max_wait_time. For example, if you want to ensure your job runs for no more than 2 hours, set this field to `7200s` (2 hours * 60 minutes / hour * 60 seconds / minute). If you submit your training job using the `gcloud` tool, you can [specify this field in a `config.yaml` file](/ai-platform/training/docs/training-jobs#formatting_your_configuration_parameters). For example: ``` yaml trainingInput: scheduling: maxRunningTime: 7200s  ```
     * 
     */
    private final String maxRunningTime;
    /**
     * Optional. The maximum job wait time, expressed in seconds. The field can contain up to nine fractional digits, terminated by `s`. If not specified, there is no limit to the wait time. The minimum for this field is `1800s` (30 minutes). If the training job has not entered the `RUNNING` state after this duration, AI Platform Training cancels it. After the job begins running, it can no longer be cancelled due to the maximum wait time. Therefore the duration limited by this field does not overlap with the duration limited by Scheduling.max_running_time. For example, if the job temporarily stops running and retries due to a [VM restart](/ai-platform/training/docs/overview#restarts), this cannot lead to a maximum wait time cancellation. However, independently of this constraint, AI Platform Training might stop a job if there are too many retries due to exhausted resources in a region. The following example describes how you might use this field: To cancel your job if it doesn't start running within 1 hour, set this field to `3600s` (1 hour * 60 minutes / hour * 60 seconds / minute). If the job is still in the `QUEUED` or `PREPARING` state after an hour of waiting, AI Platform Training cancels the job. If you submit your training job using the `gcloud` tool, you can [specify this field in a `config.yaml` file](/ai-platform/training/docs/training-jobs#formatting_your_configuration_parameters). For example: ``` yaml trainingInput: scheduling: maxWaitTime: 3600s  ```
     * 
     */
    private final String maxWaitTime;
    /**
     * Optional. Job scheduling will be based on this priority, which in the range [0, 1000]. The bigger the number, the higher the priority. Default to 0 if not set. If there are multiple jobs requesting same type of accelerators, the high priority job will be scheduled prior to ones with low priority.
     * 
     */
    private final Integer priority;

    @OutputCustomType.Constructor({"maxRunningTime","maxWaitTime","priority"})
    private GoogleCloudMlV1__SchedulingResponse(
        String maxRunningTime,
        String maxWaitTime,
        Integer priority) {
        this.maxRunningTime = Objects.requireNonNull(maxRunningTime);
        this.maxWaitTime = Objects.requireNonNull(maxWaitTime);
        this.priority = Objects.requireNonNull(priority);
    }

    /**
     * Optional. The maximum job running time, expressed in seconds. The field can contain up to nine fractional digits, terminated by `s`. If not specified, this field defaults to `604800s` (seven days). If the training job is still running after this duration, AI Platform Training cancels it. The duration is measured from when the job enters the `RUNNING` state; therefore it does not overlap with the duration limited by Scheduling.max_wait_time. For example, if you want to ensure your job runs for no more than 2 hours, set this field to `7200s` (2 hours * 60 minutes / hour * 60 seconds / minute). If you submit your training job using the `gcloud` tool, you can [specify this field in a `config.yaml` file](/ai-platform/training/docs/training-jobs#formatting_your_configuration_parameters). For example: ``` yaml trainingInput: scheduling: maxRunningTime: 7200s  ```
     * 
     */
    public String getMaxRunningTime() {
        return this.maxRunningTime;
    }
    /**
     * Optional. The maximum job wait time, expressed in seconds. The field can contain up to nine fractional digits, terminated by `s`. If not specified, there is no limit to the wait time. The minimum for this field is `1800s` (30 minutes). If the training job has not entered the `RUNNING` state after this duration, AI Platform Training cancels it. After the job begins running, it can no longer be cancelled due to the maximum wait time. Therefore the duration limited by this field does not overlap with the duration limited by Scheduling.max_running_time. For example, if the job temporarily stops running and retries due to a [VM restart](/ai-platform/training/docs/overview#restarts), this cannot lead to a maximum wait time cancellation. However, independently of this constraint, AI Platform Training might stop a job if there are too many retries due to exhausted resources in a region. The following example describes how you might use this field: To cancel your job if it doesn't start running within 1 hour, set this field to `3600s` (1 hour * 60 minutes / hour * 60 seconds / minute). If the job is still in the `QUEUED` or `PREPARING` state after an hour of waiting, AI Platform Training cancels the job. If you submit your training job using the `gcloud` tool, you can [specify this field in a `config.yaml` file](/ai-platform/training/docs/training-jobs#formatting_your_configuration_parameters). For example: ``` yaml trainingInput: scheduling: maxWaitTime: 3600s  ```
     * 
     */
    public String getMaxWaitTime() {
        return this.maxWaitTime;
    }
    /**
     * Optional. Job scheduling will be based on this priority, which in the range [0, 1000]. The bigger the number, the higher the priority. Default to 0 if not set. If there are multiple jobs requesting same type of accelerators, the high priority job will be scheduled prior to ones with low priority.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxRunningTime;
        private String maxWaitTime;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRunningTime = defaults.maxRunningTime;
    	      this.maxWaitTime = defaults.maxWaitTime;
    	      this.priority = defaults.priority;
        }

        public Builder setMaxRunningTime(String maxRunningTime) {
            this.maxRunningTime = Objects.requireNonNull(maxRunningTime);
            return this;
        }

        public Builder setMaxWaitTime(String maxWaitTime) {
            this.maxWaitTime = Objects.requireNonNull(maxWaitTime);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public GoogleCloudMlV1__SchedulingResponse build() {
            return new GoogleCloudMlV1__SchedulingResponse(maxRunningTime, maxWaitTime, priority);
        }
    }
}
