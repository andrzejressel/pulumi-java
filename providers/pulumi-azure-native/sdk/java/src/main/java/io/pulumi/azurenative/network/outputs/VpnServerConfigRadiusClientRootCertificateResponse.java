// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpnServerConfigRadiusClientRootCertificateResponse {
    /**
     * The certificate name.
     * 
     */
    private final @Nullable String name;
    /**
     * The Radius client root certificate thumbprint.
     * 
     */
    private final @Nullable String thumbprint;

    @OutputCustomType.Constructor
    private VpnServerConfigRadiusClientRootCertificateResponse(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.name = name;
        this.thumbprint = thumbprint;
    }

    /**
     * The certificate name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The Radius client root certificate thumbprint.
     * 
    */
    public Optional<String> getThumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigRadiusClientRootCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigRadiusClientRootCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public VpnServerConfigRadiusClientRootCertificateResponse build() {
            return new VpnServerConfigRadiusClientRootCertificateResponse(name, thumbprint);
        }
    }
}
