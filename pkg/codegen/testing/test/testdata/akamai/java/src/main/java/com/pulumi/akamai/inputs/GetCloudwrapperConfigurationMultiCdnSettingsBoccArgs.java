// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs Empty = new GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs();

    @Import(name="conditionalSamplingFrequency", required=true)
    private Output<String> conditionalSamplingFrequency;

    public Output<String> conditionalSamplingFrequency() {
        return this.conditionalSamplingFrequency;
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="forwardType", required=true)
    private Output<String> forwardType;

    public Output<String> forwardType() {
        return this.forwardType;
    }

    @Import(name="requestType", required=true)
    private Output<String> requestType;

    public Output<String> requestType() {
        return this.requestType;
    }

    @Import(name="samplingFrequency", required=true)
    private Output<String> samplingFrequency;

    public Output<String> samplingFrequency() {
        return this.samplingFrequency;
    }

    private GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs() {}

    private GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs(GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs $) {
        this.conditionalSamplingFrequency = $.conditionalSamplingFrequency;
        this.enabled = $.enabled;
        this.forwardType = $.forwardType;
        this.requestType = $.requestType;
        this.samplingFrequency = $.samplingFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs();
        }

        public Builder(GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs defaults) {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditionalSamplingFrequency(Output<String> conditionalSamplingFrequency) {
            $.conditionalSamplingFrequency = conditionalSamplingFrequency;
            return this;
        }

        public Builder conditionalSamplingFrequency(String conditionalSamplingFrequency) {
            return conditionalSamplingFrequency(Output.of(conditionalSamplingFrequency));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder forwardType(Output<String> forwardType) {
            $.forwardType = forwardType;
            return this;
        }

        public Builder forwardType(String forwardType) {
            return forwardType(Output.of(forwardType));
        }

        public Builder requestType(Output<String> requestType) {
            $.requestType = requestType;
            return this;
        }

        public Builder requestType(String requestType) {
            return requestType(Output.of(requestType));
        }

        public Builder samplingFrequency(Output<String> samplingFrequency) {
            $.samplingFrequency = samplingFrequency;
            return this;
        }

        public Builder samplingFrequency(String samplingFrequency) {
            return samplingFrequency(Output.of(samplingFrequency));
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs build() {
            $.conditionalSamplingFrequency = Objects.requireNonNull($.conditionalSamplingFrequency, "expected parameter 'conditionalSamplingFrequency' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.forwardType = Objects.requireNonNull($.forwardType, "expected parameter 'forwardType' to be non-null");
            $.requestType = Objects.requireNonNull($.requestType, "expected parameter 'requestType' to be non-null");
            $.samplingFrequency = Objects.requireNonNull($.samplingFrequency, "expected parameter 'samplingFrequency' to be non-null");
            return $;
        }
    }

}
