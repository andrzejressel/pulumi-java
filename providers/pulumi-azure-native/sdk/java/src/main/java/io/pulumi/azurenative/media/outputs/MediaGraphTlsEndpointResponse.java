// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.MediaGraphPemCertificateListResponse;
import io.pulumi.azurenative.media.outputs.MediaGraphTlsValidationOptionsResponse;
import io.pulumi.azurenative.media.outputs.MediaGraphUsernamePasswordCredentialsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MediaGraphTlsEndpointResponse {
    /**
     * Polymorphic credentials to present to the endpoint.
     * 
     */
    private final @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphTlsEndpoint'.
     * 
     */
    private final String odataType;
    /**
     * What certificates should be trusted when authenticating a TLS connection. Null designates that Azure Media's source of trust should be used.
     * 
     */
    private final @Nullable MediaGraphPemCertificateListResponse trustedCertificates;
    /**
     * Url for the endpoint.
     * 
     */
    private final String url;
    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    private final @Nullable MediaGraphTlsValidationOptionsResponse validationOptions;

    @OutputCustomType.Constructor
    private MediaGraphTlsEndpointResponse(
        @OutputCustomType.Parameter("credentials") @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("trustedCertificates") @Nullable MediaGraphPemCertificateListResponse trustedCertificates,
        @OutputCustomType.Parameter("url") String url,
        @OutputCustomType.Parameter("validationOptions") @Nullable MediaGraphTlsValidationOptionsResponse validationOptions) {
        this.credentials = credentials;
        this.odataType = odataType;
        this.trustedCertificates = trustedCertificates;
        this.url = url;
        this.validationOptions = validationOptions;
    }

    /**
     * Polymorphic credentials to present to the endpoint.
     * 
    */
    public Optional<MediaGraphUsernamePasswordCredentialsResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphTlsEndpoint'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * What certificates should be trusted when authenticating a TLS connection. Null designates that Azure Media's source of trust should be used.
     * 
    */
    public Optional<MediaGraphPemCertificateListResponse> getTrustedCertificates() {
        return Optional.ofNullable(this.trustedCertificates);
    }
    /**
     * Url for the endpoint.
     * 
    */
    public String getUrl() {
        return this.url;
    }
    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
    */
    public Optional<MediaGraphTlsValidationOptionsResponse> getValidationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphTlsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;
        private String odataType;
        private @Nullable MediaGraphPemCertificateListResponse trustedCertificates;
        private String url;
        private @Nullable MediaGraphTlsValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphTlsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.odataType = defaults.odataType;
    	      this.trustedCertificates = defaults.trustedCertificates;
    	      this.url = defaults.url;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder setCredentials(@Nullable MediaGraphUsernamePasswordCredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTrustedCertificates(@Nullable MediaGraphPemCertificateListResponse trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setValidationOptions(@Nullable MediaGraphTlsValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }
        public MediaGraphTlsEndpointResponse build() {
            return new MediaGraphTlsEndpointResponse(credentials, odataType, trustedCertificates, url, validationOptions);
        }
    }
}
