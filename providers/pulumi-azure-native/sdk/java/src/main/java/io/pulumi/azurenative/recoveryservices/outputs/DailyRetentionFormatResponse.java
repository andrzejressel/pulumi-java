// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DayResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DailyRetentionFormatResponse {
    /**
     * List of days of the month.
     * 
     */
    private final @Nullable List<DayResponse> daysOfTheMonth;

    @OutputCustomType.Constructor
    private DailyRetentionFormatResponse(@OutputCustomType.Parameter("daysOfTheMonth") @Nullable List<DayResponse> daysOfTheMonth) {
        this.daysOfTheMonth = daysOfTheMonth;
    }

    /**
     * List of days of the month.
     * 
    */
    public List<DayResponse> getDaysOfTheMonth() {
        return this.daysOfTheMonth == null ? List.of() : this.daysOfTheMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DailyRetentionFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DayResponse> daysOfTheMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(DailyRetentionFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfTheMonth = defaults.daysOfTheMonth;
        }

        public Builder setDaysOfTheMonth(@Nullable List<DayResponse> daysOfTheMonth) {
            this.daysOfTheMonth = daysOfTheMonth;
            return this;
        }
        public DailyRetentionFormatResponse build() {
            return new DailyRetentionFormatResponse(daysOfTheMonth);
        }
    }
}
