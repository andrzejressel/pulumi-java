// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatastreamActivationHistoryActivation {
    private String modifiedBy;
    private String modifiedDate;
    private String status;
    private Integer streamId;
    private Integer streamVersion;

    private GetDatastreamActivationHistoryActivation() {}
    public String modifiedBy() {
        return this.modifiedBy;
    }
    public String modifiedDate() {
        return this.modifiedDate;
    }
    public String status() {
        return this.status;
    }
    public Integer streamId() {
        return this.streamId;
    }
    public Integer streamVersion() {
        return this.streamVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastreamActivationHistoryActivation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String modifiedBy;
        private String modifiedDate;
        private String status;
        private Integer streamId;
        private Integer streamVersion;
        public Builder() {}
        public Builder(GetDatastreamActivationHistoryActivation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modifiedBy = defaults.modifiedBy;
    	      this.modifiedDate = defaults.modifiedDate;
    	      this.status = defaults.status;
    	      this.streamId = defaults.streamId;
    	      this.streamVersion = defaults.streamVersion;
        }

        @CustomType.Setter
        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = Objects.requireNonNull(modifiedBy);
            return this;
        }
        @CustomType.Setter
        public Builder modifiedDate(String modifiedDate) {
            this.modifiedDate = Objects.requireNonNull(modifiedDate);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder streamId(Integer streamId) {
            this.streamId = Objects.requireNonNull(streamId);
            return this;
        }
        @CustomType.Setter
        public Builder streamVersion(Integer streamVersion) {
            this.streamVersion = Objects.requireNonNull(streamVersion);
            return this;
        }
        public GetDatastreamActivationHistoryActivation build() {
            final var _resultValue = new GetDatastreamActivationHistoryActivation();
            _resultValue.modifiedBy = modifiedBy;
            _resultValue.modifiedDate = modifiedDate;
            _resultValue.status = status;
            _resultValue.streamId = streamId;
            _resultValue.streamVersion = streamVersion;
            return _resultValue;
        }
    }
}
