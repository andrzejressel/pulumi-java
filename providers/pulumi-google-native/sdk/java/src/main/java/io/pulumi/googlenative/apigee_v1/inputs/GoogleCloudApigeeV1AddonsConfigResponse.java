// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AdvancedApiOpsConfigResponse;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1ConnectorsPlatformConfigResponse;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1IntegrationConfigResponse;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1MonetizationConfigResponse;
import java.util.Objects;


/**
 * Add-on configurations for the Apigee organization.
 * 
 */
public final class GoogleCloudApigeeV1AddonsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1AddonsConfigResponse Empty = new GoogleCloudApigeeV1AddonsConfigResponse();

    /**
     * Configuration for the Advanced API Ops add-on.
     * 
     */
    @InputImport(name="advancedApiOpsConfig", required=true)
    private final GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig;

    public GoogleCloudApigeeV1AdvancedApiOpsConfigResponse getAdvancedApiOpsConfig() {
        return this.advancedApiOpsConfig;
    }

    /**
     * Configuration for the Connectors Platform add-on.
     * 
     */
    @InputImport(name="connectorsPlatformConfig", required=true)
    private final GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig;

    public GoogleCloudApigeeV1ConnectorsPlatformConfigResponse getConnectorsPlatformConfig() {
        return this.connectorsPlatformConfig;
    }

    /**
     * Configuration for the Integration add-on.
     * 
     */
    @InputImport(name="integrationConfig", required=true)
    private final GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig;

    public GoogleCloudApigeeV1IntegrationConfigResponse getIntegrationConfig() {
        return this.integrationConfig;
    }

    /**
     * Configuration for the Monetization add-on.
     * 
     */
    @InputImport(name="monetizationConfig", required=true)
    private final GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig;

    public GoogleCloudApigeeV1MonetizationConfigResponse getMonetizationConfig() {
        return this.monetizationConfig;
    }

    public GoogleCloudApigeeV1AddonsConfigResponse(
        GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig,
        GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig,
        GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig,
        GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig) {
        this.advancedApiOpsConfig = Objects.requireNonNull(advancedApiOpsConfig, "expected parameter 'advancedApiOpsConfig' to be non-null");
        this.connectorsPlatformConfig = Objects.requireNonNull(connectorsPlatformConfig, "expected parameter 'connectorsPlatformConfig' to be non-null");
        this.integrationConfig = Objects.requireNonNull(integrationConfig, "expected parameter 'integrationConfig' to be non-null");
        this.monetizationConfig = Objects.requireNonNull(monetizationConfig, "expected parameter 'monetizationConfig' to be non-null");
    }

    private GoogleCloudApigeeV1AddonsConfigResponse() {
        this.advancedApiOpsConfig = null;
        this.connectorsPlatformConfig = null;
        this.integrationConfig = null;
        this.monetizationConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1AddonsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig;
        private GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig;
        private GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig;
        private GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1AddonsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedApiOpsConfig = defaults.advancedApiOpsConfig;
    	      this.connectorsPlatformConfig = defaults.connectorsPlatformConfig;
    	      this.integrationConfig = defaults.integrationConfig;
    	      this.monetizationConfig = defaults.monetizationConfig;
        }

        public Builder setAdvancedApiOpsConfig(GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig) {
            this.advancedApiOpsConfig = Objects.requireNonNull(advancedApiOpsConfig);
            return this;
        }

        public Builder setConnectorsPlatformConfig(GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig) {
            this.connectorsPlatformConfig = Objects.requireNonNull(connectorsPlatformConfig);
            return this;
        }

        public Builder setIntegrationConfig(GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig) {
            this.integrationConfig = Objects.requireNonNull(integrationConfig);
            return this;
        }

        public Builder setMonetizationConfig(GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig) {
            this.monetizationConfig = Objects.requireNonNull(monetizationConfig);
            return this;
        }

        public GoogleCloudApigeeV1AddonsConfigResponse build() {
            return new GoogleCloudApigeeV1AddonsConfigResponse(advancedApiOpsConfig, connectorsPlatformConfig, integrationConfig, monetizationConfig);
        }
    }
}
