// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperLocationsLocationTrafficType {
    private String locationId;
    private String trafficType;
    private Integer trafficTypeId;

    private GetCloudwrapperLocationsLocationTrafficType() {}
    public String locationId() {
        return this.locationId;
    }
    public String trafficType() {
        return this.trafficType;
    }
    public Integer trafficTypeId() {
        return this.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperLocationsLocationTrafficType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String locationId;
        private String trafficType;
        private Integer trafficTypeId;
        public Builder() {}
        public Builder(GetCloudwrapperLocationsLocationTrafficType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationId = defaults.locationId;
    	      this.trafficType = defaults.trafficType;
    	      this.trafficTypeId = defaults.trafficTypeId;
        }

        @CustomType.Setter
        public Builder locationId(String locationId) {
            this.locationId = Objects.requireNonNull(locationId);
            return this;
        }
        @CustomType.Setter
        public Builder trafficType(String trafficType) {
            this.trafficType = Objects.requireNonNull(trafficType);
            return this;
        }
        @CustomType.Setter
        public Builder trafficTypeId(Integer trafficTypeId) {
            this.trafficTypeId = Objects.requireNonNull(trafficTypeId);
            return this;
        }
        public GetCloudwrapperLocationsLocationTrafficType build() {
            final var _resultValue = new GetCloudwrapperLocationsLocationTrafficType();
            _resultValue.locationId = locationId;
            _resultValue.trafficType = trafficType;
            _resultValue.trafficTypeId = trafficTypeId;
            return _resultValue;
        }
    }
}
