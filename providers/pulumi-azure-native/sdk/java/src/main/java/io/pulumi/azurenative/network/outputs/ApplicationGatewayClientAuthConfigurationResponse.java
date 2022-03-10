// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayClientAuthConfigurationResponse {
    /**
     * Verify client certificate issuer name on the application gateway.
     * 
     */
    private final @Nullable Boolean verifyClientCertIssuerDN;

    @OutputCustomType.Constructor
    private ApplicationGatewayClientAuthConfigurationResponse(@OutputCustomType.Parameter("verifyClientCertIssuerDN") @Nullable Boolean verifyClientCertIssuerDN) {
        this.verifyClientCertIssuerDN = verifyClientCertIssuerDN;
    }

    /**
     * Verify client certificate issuer name on the application gateway.
     * 
    */
    public Optional<Boolean> getVerifyClientCertIssuerDN() {
        return Optional.ofNullable(this.verifyClientCertIssuerDN);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayClientAuthConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean verifyClientCertIssuerDN;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayClientAuthConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.verifyClientCertIssuerDN = defaults.verifyClientCertIssuerDN;
        }

        public Builder setVerifyClientCertIssuerDN(@Nullable Boolean verifyClientCertIssuerDN) {
            this.verifyClientCertIssuerDN = verifyClientCertIssuerDN;
            return this;
        }
        public ApplicationGatewayClientAuthConfigurationResponse build() {
            return new ApplicationGatewayClientAuthConfigurationResponse(verifyClientCertIssuerDN);
        }
    }
}
