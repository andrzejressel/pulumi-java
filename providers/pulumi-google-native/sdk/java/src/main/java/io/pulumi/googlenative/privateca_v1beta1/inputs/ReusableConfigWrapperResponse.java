// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigValuesResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A ReusableConfigWrapper describes values that may assist in creating an X.509 certificate, or a reference to a pre-defined set of values.
 * 
 */
public final class ReusableConfigWrapperResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReusableConfigWrapperResponse Empty = new ReusableConfigWrapperResponse();

    /**
     * A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
     */
    @InputImport(name="reusableConfig", required=true)
    private final String reusableConfig;

    public String getReusableConfig() {
        return this.reusableConfig;
    }

    /**
     * A user-specified inline ReusableConfigValues.
     * 
     */
    @InputImport(name="reusableConfigValues", required=true)
    private final ReusableConfigValuesResponse reusableConfigValues;

    public ReusableConfigValuesResponse getReusableConfigValues() {
        return this.reusableConfigValues;
    }

    public ReusableConfigWrapperResponse(
        String reusableConfig,
        ReusableConfigValuesResponse reusableConfigValues) {
        this.reusableConfig = Objects.requireNonNull(reusableConfig, "expected parameter 'reusableConfig' to be non-null");
        this.reusableConfigValues = Objects.requireNonNull(reusableConfigValues, "expected parameter 'reusableConfigValues' to be non-null");
    }

    private ReusableConfigWrapperResponse() {
        this.reusableConfig = null;
        this.reusableConfigValues = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigWrapperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String reusableConfig;
        private ReusableConfigValuesResponse reusableConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ReusableConfigWrapperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.reusableConfigValues = defaults.reusableConfigValues;
        }

        public Builder setReusableConfig(String reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }

        public Builder setReusableConfigValues(ReusableConfigValuesResponse reusableConfigValues) {
            this.reusableConfigValues = Objects.requireNonNull(reusableConfigValues);
            return this;
        }

        public ReusableConfigWrapperResponse build() {
            return new ReusableConfigWrapperResponse(reusableConfig, reusableConfigValues);
        }
    }
}
