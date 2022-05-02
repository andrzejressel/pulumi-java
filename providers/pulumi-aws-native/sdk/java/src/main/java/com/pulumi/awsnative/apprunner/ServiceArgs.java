// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner;

import com.pulumi.awsnative.apprunner.inputs.ServiceEncryptionConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceHealthCheckConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceInstanceConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceNetworkConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceObservabilityConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceSourceConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Autoscaling configuration ARN
     * 
     */
    @Import(name="autoScalingConfigurationArn")
    private @Nullable Output<String> autoScalingConfigurationArn;

    /**
     * @return Autoscaling configuration ARN
     * 
     */
    public Optional<Output<String>> autoScalingConfigurationArn() {
        return Optional.ofNullable(this.autoScalingConfigurationArn);
    }

    @Import(name="encryptionConfiguration")
    private @Nullable Output<ServiceEncryptionConfigurationArgs> encryptionConfiguration;

    public Optional<Output<ServiceEncryptionConfigurationArgs>> encryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }

    @Import(name="healthCheckConfiguration")
    private @Nullable Output<ServiceHealthCheckConfigurationArgs> healthCheckConfiguration;

    public Optional<Output<ServiceHealthCheckConfigurationArgs>> healthCheckConfiguration() {
        return Optional.ofNullable(this.healthCheckConfiguration);
    }

    @Import(name="instanceConfiguration")
    private @Nullable Output<ServiceInstanceConfigurationArgs> instanceConfiguration;

    public Optional<Output<ServiceInstanceConfigurationArgs>> instanceConfiguration() {
        return Optional.ofNullable(this.instanceConfiguration);
    }

    @Import(name="networkConfiguration")
    private @Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration;

    public Optional<Output<ServiceNetworkConfigurationArgs>> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }

    @Import(name="observabilityConfiguration")
    private @Nullable Output<ServiceObservabilityConfigurationArgs> observabilityConfiguration;

    public Optional<Output<ServiceObservabilityConfigurationArgs>> observabilityConfiguration() {
        return Optional.ofNullable(this.observabilityConfiguration);
    }

    /**
     * The AppRunner Service Name.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The AppRunner Service Name.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    @Import(name="sourceConfiguration", required=true)
    private Output<ServiceSourceConfigurationArgs> sourceConfiguration;

    public Output<ServiceSourceConfigurationArgs> sourceConfiguration() {
        return this.sourceConfiguration;
    }

    @Import(name="tags")
    private @Nullable Output<List<ServiceTagArgs>> tags;

    public Optional<Output<List<ServiceTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.autoScalingConfigurationArn = $.autoScalingConfigurationArn;
        this.encryptionConfiguration = $.encryptionConfiguration;
        this.healthCheckConfiguration = $.healthCheckConfiguration;
        this.instanceConfiguration = $.instanceConfiguration;
        this.networkConfiguration = $.networkConfiguration;
        this.observabilityConfiguration = $.observabilityConfiguration;
        this.serviceName = $.serviceName;
        this.sourceConfiguration = $.sourceConfiguration;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoScalingConfigurationArn Autoscaling configuration ARN
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationArn(@Nullable Output<String> autoScalingConfigurationArn) {
            $.autoScalingConfigurationArn = autoScalingConfigurationArn;
            return this;
        }

        /**
         * @param autoScalingConfigurationArn Autoscaling configuration ARN
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationArn(String autoScalingConfigurationArn) {
            return autoScalingConfigurationArn(Output.of(autoScalingConfigurationArn));
        }

        public Builder encryptionConfiguration(@Nullable Output<ServiceEncryptionConfigurationArgs> encryptionConfiguration) {
            $.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(ServiceEncryptionConfigurationArgs encryptionConfiguration) {
            return encryptionConfiguration(Output.of(encryptionConfiguration));
        }

        public Builder healthCheckConfiguration(@Nullable Output<ServiceHealthCheckConfigurationArgs> healthCheckConfiguration) {
            $.healthCheckConfiguration = healthCheckConfiguration;
            return this;
        }

        public Builder healthCheckConfiguration(ServiceHealthCheckConfigurationArgs healthCheckConfiguration) {
            return healthCheckConfiguration(Output.of(healthCheckConfiguration));
        }

        public Builder instanceConfiguration(@Nullable Output<ServiceInstanceConfigurationArgs> instanceConfiguration) {
            $.instanceConfiguration = instanceConfiguration;
            return this;
        }

        public Builder instanceConfiguration(ServiceInstanceConfigurationArgs instanceConfiguration) {
            return instanceConfiguration(Output.of(instanceConfiguration));
        }

        public Builder networkConfiguration(@Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration) {
            $.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder networkConfiguration(ServiceNetworkConfigurationArgs networkConfiguration) {
            return networkConfiguration(Output.of(networkConfiguration));
        }

        public Builder observabilityConfiguration(@Nullable Output<ServiceObservabilityConfigurationArgs> observabilityConfiguration) {
            $.observabilityConfiguration = observabilityConfiguration;
            return this;
        }

        public Builder observabilityConfiguration(ServiceObservabilityConfigurationArgs observabilityConfiguration) {
            return observabilityConfiguration(Output.of(observabilityConfiguration));
        }

        /**
         * @param serviceName The AppRunner Service Name.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The AppRunner Service Name.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder sourceConfiguration(Output<ServiceSourceConfigurationArgs> sourceConfiguration) {
            $.sourceConfiguration = sourceConfiguration;
            return this;
        }

        public Builder sourceConfiguration(ServiceSourceConfigurationArgs sourceConfiguration) {
            return sourceConfiguration(Output.of(sourceConfiguration));
        }

        public Builder tags(@Nullable Output<List<ServiceTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ServiceTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ServiceTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ServiceArgs build() {
            $.sourceConfiguration = Objects.requireNonNull($.sourceConfiguration, "expected parameter 'sourceConfiguration' to be non-null");
            return $;
        }
    }

}
