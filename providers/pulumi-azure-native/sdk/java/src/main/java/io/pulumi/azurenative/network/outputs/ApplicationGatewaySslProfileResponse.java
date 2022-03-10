// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayClientAuthConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ApplicationGatewaySslPolicyResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewaySslProfileResponse {
    /**
     * Client authentication configuration of the application gateway resource.
     * 
     */
    private final @Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the SSL profile that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the HTTP listener resource.
     * 
     */
    private final String provisioningState;
    /**
     * SSL policy of the application gateway resource.
     * 
     */
    private final @Nullable ApplicationGatewaySslPolicyResponse sslPolicy;
    /**
     * Array of references to application gateway trusted client certificates.
     * 
     */
    private final @Nullable List<SubResourceResponse> trustedClientCertificates;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ApplicationGatewaySslProfileResponse(
        @OutputCustomType.Parameter("clientAuthConfiguration") @Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("sslPolicy") @Nullable ApplicationGatewaySslPolicyResponse sslPolicy,
        @OutputCustomType.Parameter("trustedClientCertificates") @Nullable List<SubResourceResponse> trustedClientCertificates,
        @OutputCustomType.Parameter("type") String type) {
        this.clientAuthConfiguration = clientAuthConfiguration;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sslPolicy = sslPolicy;
        this.trustedClientCertificates = trustedClientCertificates;
        this.type = type;
    }

    /**
     * Client authentication configuration of the application gateway resource.
     * 
    */
    public Optional<ApplicationGatewayClientAuthConfigurationResponse> getClientAuthConfiguration() {
        return Optional.ofNullable(this.clientAuthConfiguration);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the SSL profile that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the HTTP listener resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SSL policy of the application gateway resource.
     * 
    */
    public Optional<ApplicationGatewaySslPolicyResponse> getSslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }
    /**
     * Array of references to application gateway trusted client certificates.
     * 
    */
    public List<SubResourceResponse> getTrustedClientCertificates() {
        return this.trustedClientCertificates == null ? List.of() : this.trustedClientCertificates;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable ApplicationGatewaySslPolicyResponse sslPolicy;
        private @Nullable List<SubResourceResponse> trustedClientCertificates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuthConfiguration = defaults.clientAuthConfiguration;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.trustedClientCertificates = defaults.trustedClientCertificates;
    	      this.type = defaults.type;
        }

        public Builder setClientAuthConfiguration(@Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration) {
            this.clientAuthConfiguration = clientAuthConfiguration;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSslPolicy(@Nullable ApplicationGatewaySslPolicyResponse sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setTrustedClientCertificates(@Nullable List<SubResourceResponse> trustedClientCertificates) {
            this.trustedClientCertificates = trustedClientCertificates;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewaySslProfileResponse build() {
            return new ApplicationGatewaySslProfileResponse(clientAuthConfiguration, etag, id, name, provisioningState, sslPolicy, trustedClientCertificates, type);
        }
    }
}
