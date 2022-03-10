// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomDnsConfigPropertiesFormatResponse {
    /**
     * Fqdn that resolves to private endpoint ip address.
     * 
     */
    private final @Nullable String fqdn;
    /**
     * A list of private ip addresses of the private endpoint.
     * 
     */
    private final @Nullable List<String> ipAddresses;

    @OutputCustomType.Constructor
    private CustomDnsConfigPropertiesFormatResponse(
        @OutputCustomType.Parameter("fqdn") @Nullable String fqdn,
        @OutputCustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses) {
        this.fqdn = fqdn;
        this.ipAddresses = ipAddresses;
    }

    /**
     * Fqdn that resolves to private endpoint ip address.
     * 
    */
    public Optional<String> getFqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * A list of private ip addresses of the private endpoint.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDnsConfigPropertiesFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable List<String> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDnsConfigPropertiesFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public CustomDnsConfigPropertiesFormatResponse build() {
            return new CustomDnsConfigPropertiesFormatResponse(fqdn, ipAddresses);
        }
    }
}
