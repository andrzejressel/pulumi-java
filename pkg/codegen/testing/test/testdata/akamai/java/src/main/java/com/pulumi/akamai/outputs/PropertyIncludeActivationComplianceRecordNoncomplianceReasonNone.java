// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone {
    private @Nullable String customerEmail;
    private @Nullable String peerReviewedBy;
    private @Nullable String ticketId;
    private @Nullable Boolean unitTested;

    private PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone() {}
    public Optional<String> customerEmail() {
        return Optional.ofNullable(this.customerEmail);
    }
    public Optional<String> peerReviewedBy() {
        return Optional.ofNullable(this.peerReviewedBy);
    }
    public Optional<String> ticketId() {
        return Optional.ofNullable(this.ticketId);
    }
    public Optional<Boolean> unitTested() {
        return Optional.ofNullable(this.unitTested);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customerEmail;
        private @Nullable String peerReviewedBy;
        private @Nullable String ticketId;
        private @Nullable Boolean unitTested;
        public Builder() {}
        public Builder(PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerEmail = defaults.customerEmail;
    	      this.peerReviewedBy = defaults.peerReviewedBy;
    	      this.ticketId = defaults.ticketId;
    	      this.unitTested = defaults.unitTested;
        }

        @CustomType.Setter
        public Builder customerEmail(@Nullable String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }
        @CustomType.Setter
        public Builder peerReviewedBy(@Nullable String peerReviewedBy) {
            this.peerReviewedBy = peerReviewedBy;
            return this;
        }
        @CustomType.Setter
        public Builder ticketId(@Nullable String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        @CustomType.Setter
        public Builder unitTested(@Nullable Boolean unitTested) {
            this.unitTested = unitTested;
            return this;
        }
        public PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone build() {
            final var _resultValue = new PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone();
            _resultValue.customerEmail = customerEmail;
            _resultValue.peerReviewedBy = peerReviewedBy;
            _resultValue.ticketId = ticketId;
            _resultValue.unitTested = unitTested;
            return _resultValue;
        }
    }
}
