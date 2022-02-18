// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration specific to Salesforce Live Agent.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse Empty = new GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse();

    /**
     * Live Agent chat button ID.
     * 
     */
    @InputImport(name="buttonId", required=true)
    private final String buttonId;

    public String getButtonId() {
        return this.buttonId;
    }

    /**
     * Live Agent deployment ID.
     * 
     */
    @InputImport(name="deploymentId", required=true)
    private final String deploymentId;

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
     * 
     */
    @InputImport(name="endpointDomain", required=true)
    private final String endpointDomain;

    public String getEndpointDomain() {
        return this.endpointDomain;
    }

    /**
     * The organization ID of the Salesforce account.
     * 
     */
    @InputImport(name="organizationId", required=true)
    private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse(
        String buttonId,
        String deploymentId,
        String endpointDomain,
        String organizationId) {
        this.buttonId = Objects.requireNonNull(buttonId, "expected parameter 'buttonId' to be non-null");
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
        this.endpointDomain = Objects.requireNonNull(endpointDomain, "expected parameter 'endpointDomain' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse() {
        this.buttonId = null;
        this.deploymentId = null;
        this.endpointDomain = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String buttonId;
        private String deploymentId;
        private String endpointDomain;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttonId = defaults.buttonId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.endpointDomain = defaults.endpointDomain;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setButtonId(String buttonId) {
            this.buttonId = Objects.requireNonNull(buttonId);
            return this;
        }

        public Builder setDeploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder setEndpointDomain(String endpointDomain) {
            this.endpointDomain = Objects.requireNonNull(endpointDomain);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse(buttonId, deploymentId, endpointDomain, organizationId);
        }
    }
}
