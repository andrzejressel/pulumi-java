// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceObservabilityConfiguration {
    /**
     * @return The Amazon Resource Name (ARN) of the App Runner ObservabilityConfiguration.
     * 
     */
    private final @Nullable String observabilityConfigurationArn;
    /**
     * @return Observability enabled
     * 
     */
    private final Boolean observabilityEnabled;

    @CustomType.Constructor
    private ServiceObservabilityConfiguration(
        @CustomType.Parameter("observabilityConfigurationArn") @Nullable String observabilityConfigurationArn,
        @CustomType.Parameter("observabilityEnabled") Boolean observabilityEnabled) {
        this.observabilityConfigurationArn = observabilityConfigurationArn;
        this.observabilityEnabled = observabilityEnabled;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the App Runner ObservabilityConfiguration.
     * 
     */
    public Optional<String> observabilityConfigurationArn() {
        return Optional.ofNullable(this.observabilityConfigurationArn);
    }
    /**
     * @return Observability enabled
     * 
     */
    public Boolean observabilityEnabled() {
        return this.observabilityEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceObservabilityConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String observabilityConfigurationArn;
        private Boolean observabilityEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceObservabilityConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.observabilityConfigurationArn = defaults.observabilityConfigurationArn;
    	      this.observabilityEnabled = defaults.observabilityEnabled;
        }

        public Builder observabilityConfigurationArn(@Nullable String observabilityConfigurationArn) {
            this.observabilityConfigurationArn = observabilityConfigurationArn;
            return this;
        }
        public Builder observabilityEnabled(Boolean observabilityEnabled) {
            this.observabilityEnabled = Objects.requireNonNull(observabilityEnabled);
            return this;
        }        public ServiceObservabilityConfiguration build() {
            return new ServiceObservabilityConfiguration(observabilityConfigurationArn, observabilityEnabled);
        }
    }
}
