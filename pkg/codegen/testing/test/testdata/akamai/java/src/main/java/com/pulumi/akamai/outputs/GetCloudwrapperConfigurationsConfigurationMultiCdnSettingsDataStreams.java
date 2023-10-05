// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreams {
    private List<Integer> dataStreamIds;
    private Boolean enabled;
    private Integer samplingRate;

    private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreams() {}
    public List<Integer> dataStreamIds() {
        return this.dataStreamIds;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public Integer samplingRate() {
        return this.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> dataStreamIds;
        private Boolean enabled;
        private Integer samplingRate;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStreamIds = defaults.dataStreamIds;
    	      this.enabled = defaults.enabled;
    	      this.samplingRate = defaults.samplingRate;
        }

        @CustomType.Setter
        public Builder dataStreamIds(List<Integer> dataStreamIds) {
            this.dataStreamIds = Objects.requireNonNull(dataStreamIds);
            return this;
        }
        public Builder dataStreamIds(Integer... dataStreamIds) {
            return dataStreamIds(List.of(dataStreamIds));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder samplingRate(Integer samplingRate) {
            this.samplingRate = Objects.requireNonNull(samplingRate);
            return this;
        }
        public GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreams build() {
            final var _resultValue = new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreams();
            _resultValue.dataStreamIds = dataStreamIds;
            _resultValue.enabled = enabled;
            _resultValue.samplingRate = samplingRate;
            return _resultValue;
        }
    }
}
