// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DayResponse {
    /**
     * Date of the month
     * 
     */
    private final @Nullable Integer date;
    /**
     * Whether Date is last date of month
     * 
     */
    private final @Nullable Boolean isLast;

    @OutputCustomType.Constructor
    private DayResponse(
        @OutputCustomType.Parameter("date") @Nullable Integer date,
        @OutputCustomType.Parameter("isLast") @Nullable Boolean isLast) {
        this.date = date;
        this.isLast = isLast;
    }

    /**
     * Date of the month
     * 
    */
    public Optional<Integer> getDate() {
        return Optional.ofNullable(this.date);
    }
    /**
     * Whether Date is last date of month
     * 
    */
    public Optional<Boolean> getIsLast() {
        return Optional.ofNullable(this.isLast);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer date;
        private @Nullable Boolean isLast;

        public Builder() {
    	      // Empty
        }

        public Builder(DayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.isLast = defaults.isLast;
        }

        public Builder setDate(@Nullable Integer date) {
            this.date = date;
            return this;
        }

        public Builder setIsLast(@Nullable Boolean isLast) {
            this.isLast = isLast;
            return this;
        }
        public DayResponse build() {
            return new DayResponse(date, isLast);
        }
    }
}
