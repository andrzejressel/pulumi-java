// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Schedule for an instance operation.
 * 
 */
public final class ResourcePolicyInstanceSchedulePolicyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyInstanceSchedulePolicyScheduleArgs Empty = new ResourcePolicyInstanceSchedulePolicyScheduleArgs();

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    @InputImport(name="schedule")
    private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    public ResourcePolicyInstanceSchedulePolicyScheduleArgs(@Nullable Input<String> schedule) {
        this.schedule = schedule;
    }

    private ResourcePolicyInstanceSchedulePolicyScheduleArgs() {
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder setSchedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public ResourcePolicyInstanceSchedulePolicyScheduleArgs build() {
            return new ResourcePolicyInstanceSchedulePolicyScheduleArgs(schedule);
        }
    }
}
