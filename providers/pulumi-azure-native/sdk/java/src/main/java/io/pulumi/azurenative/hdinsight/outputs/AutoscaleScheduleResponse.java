// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.AutoscaleTimeAndCapacityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscaleScheduleResponse {
    /**
     * Days of the week for a schedule-based autoscale rule
     * 
     */
    private final @Nullable List<String> days;
    /**
     * Time and capacity for a schedule-based autoscale rule
     * 
     */
    private final @Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity;

    @OutputCustomType.Constructor
    private AutoscaleScheduleResponse(
        @OutputCustomType.Parameter("days") @Nullable List<String> days,
        @OutputCustomType.Parameter("timeAndCapacity") @Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity) {
        this.days = days;
        this.timeAndCapacity = timeAndCapacity;
    }

    /**
     * Days of the week for a schedule-based autoscale rule
     * 
    */
    public List<String> getDays() {
        return this.days == null ? List.of() : this.days;
    }
    /**
     * Time and capacity for a schedule-based autoscale rule
     * 
    */
    public Optional<AutoscaleTimeAndCapacityResponse> getTimeAndCapacity() {
        return Optional.ofNullable(this.timeAndCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> days;
        private @Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.timeAndCapacity = defaults.timeAndCapacity;
        }

        public Builder setDays(@Nullable List<String> days) {
            this.days = days;
            return this;
        }

        public Builder setTimeAndCapacity(@Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity) {
            this.timeAndCapacity = timeAndCapacity;
            return this;
        }
        public AutoscaleScheduleResponse build() {
            return new AutoscaleScheduleResponse(days, timeAndCapacity);
        }
    }
}
