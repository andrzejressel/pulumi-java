// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class DateAfterCreationResponse {
    /**
     * Value indicating the age in days after creation
     * 
     */
    private final Double daysAfterCreationGreaterThan;

    @OutputCustomType.Constructor
    private DateAfterCreationResponse(@OutputCustomType.Parameter("daysAfterCreationGreaterThan") Double daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
    }

    /**
     * Value indicating the age in days after creation
     * 
    */
    public Double getDaysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateAfterCreationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double daysAfterCreationGreaterThan;

        public Builder() {
    	      // Empty
        }

        public Builder(DateAfterCreationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterCreationGreaterThan = defaults.daysAfterCreationGreaterThan;
        }

        public Builder setDaysAfterCreationGreaterThan(Double daysAfterCreationGreaterThan) {
            this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan);
            return this;
        }
        public DateAfterCreationResponse build() {
            return new DateAfterCreationResponse(daysAfterCreationGreaterThan);
        }
    }
}
