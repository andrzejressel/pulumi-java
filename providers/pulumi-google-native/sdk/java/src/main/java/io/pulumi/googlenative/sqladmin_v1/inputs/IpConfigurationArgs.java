// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.inputs.AclEntryArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP Management configuration.
 * 
 */
public final class IpConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpConfigurationArgs Empty = new IpConfigurationArgs();

    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?.`
     * 
     */
    @InputImport(name="allocatedIpRange")
    private final @Nullable Input<String> allocatedIpRange;

    public Input<String> getAllocatedIpRange() {
        return this.allocatedIpRange == null ? Input.empty() : this.allocatedIpRange;
    }

    /**
     * The list of external networks that are allowed to connect to the instance using the IP. In 'CIDR' notation, also known as 'slash' notation (for example: `157.197.200.0/24`).
     * 
     */
    @InputImport(name="authorizedNetworks")
    private final @Nullable Input<List<AclEntryArgs>> authorizedNetworks;

    public Input<List<AclEntryArgs>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Input.empty() : this.authorizedNetworks;
    }

    /**
     * Whether the instance is assigned a public IP address or not.
     * 
     */
    @InputImport(name="ipv4Enabled")
    private final @Nullable Input<Boolean> ipv4Enabled;

    public Input<Boolean> getIpv4Enabled() {
        return this.ipv4Enabled == null ? Input.empty() : this.ipv4Enabled;
    }

    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    @InputImport(name="privateNetwork")
    private final @Nullable Input<String> privateNetwork;

    public Input<String> getPrivateNetwork() {
        return this.privateNetwork == null ? Input.empty() : this.privateNetwork;
    }

    /**
     * Whether SSL connections over IP are enforced or not.
     * 
     */
    @InputImport(name="requireSsl")
    private final @Nullable Input<Boolean> requireSsl;

    public Input<Boolean> getRequireSsl() {
        return this.requireSsl == null ? Input.empty() : this.requireSsl;
    }

    public IpConfigurationArgs(
        @Nullable Input<String> allocatedIpRange,
        @Nullable Input<List<AclEntryArgs>> authorizedNetworks,
        @Nullable Input<Boolean> ipv4Enabled,
        @Nullable Input<String> privateNetwork,
        @Nullable Input<Boolean> requireSsl) {
        this.allocatedIpRange = allocatedIpRange;
        this.authorizedNetworks = authorizedNetworks;
        this.ipv4Enabled = ipv4Enabled;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    private IpConfigurationArgs() {
        this.allocatedIpRange = Input.empty();
        this.authorizedNetworks = Input.empty();
        this.ipv4Enabled = Input.empty();
        this.privateNetwork = Input.empty();
        this.requireSsl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allocatedIpRange;
        private @Nullable Input<List<AclEntryArgs>> authorizedNetworks;
        private @Nullable Input<Boolean> ipv4Enabled;
        private @Nullable Input<String> privateNetwork;
        private @Nullable Input<Boolean> requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(IpConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder setAllocatedIpRange(@Nullable Input<String> allocatedIpRange) {
            this.allocatedIpRange = allocatedIpRange;
            return this;
        }

        public Builder setAllocatedIpRange(@Nullable String allocatedIpRange) {
            this.allocatedIpRange = Input.ofNullable(allocatedIpRange);
            return this;
        }

        public Builder setAuthorizedNetworks(@Nullable Input<List<AclEntryArgs>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }

        public Builder setAuthorizedNetworks(@Nullable List<AclEntryArgs> authorizedNetworks) {
            this.authorizedNetworks = Input.ofNullable(authorizedNetworks);
            return this;
        }

        public Builder setIpv4Enabled(@Nullable Input<Boolean> ipv4Enabled) {
            this.ipv4Enabled = ipv4Enabled;
            return this;
        }

        public Builder setIpv4Enabled(@Nullable Boolean ipv4Enabled) {
            this.ipv4Enabled = Input.ofNullable(ipv4Enabled);
            return this;
        }

        public Builder setPrivateNetwork(@Nullable Input<String> privateNetwork) {
            this.privateNetwork = privateNetwork;
            return this;
        }

        public Builder setPrivateNetwork(@Nullable String privateNetwork) {
            this.privateNetwork = Input.ofNullable(privateNetwork);
            return this;
        }

        public Builder setRequireSsl(@Nullable Input<Boolean> requireSsl) {
            this.requireSsl = requireSsl;
            return this;
        }

        public Builder setRequireSsl(@Nullable Boolean requireSsl) {
            this.requireSsl = Input.ofNullable(requireSsl);
            return this;
        }

        public IpConfigurationArgs build() {
            return new IpConfigurationArgs(allocatedIpRange, authorizedNetworks, ipv4Enabled, privateNetwork, requireSsl);
        }
    }
}
