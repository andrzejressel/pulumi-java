// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.AccessConfigNetworkTier;
import io.pulumi.googlenative.compute_alpha.enums.AccessConfigType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An access configuration attached to an instance's network interface. Only one access config per instance is supported.
 * 
 */
public final class AccessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessConfigArgs Empty = new AccessConfigArgs();

    /**
     * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
     * 
     */
    @InputImport(name="externalIpv6")
    private final @Nullable Input<String> externalIpv6;

    public Input<String> getExternalIpv6() {
        return this.externalIpv6 == null ? Input.empty() : this.externalIpv6;
    }

    /**
     * The prefix length of the external IPv6 range.
     * 
     */
    @InputImport(name="externalIpv6PrefixLength")
    private final @Nullable Input<Integer> externalIpv6PrefixLength;

    public Input<Integer> getExternalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength == null ? Input.empty() : this.externalIpv6PrefixLength;
    }

    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
     */
    @InputImport(name="natIP")
    private final @Nullable Input<String> natIP;

    public Input<String> getNatIP() {
        return this.natIP == null ? Input.empty() : this.natIP;
    }

    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
     */
    @InputImport(name="networkTier")
    private final @Nullable Input<AccessConfigNetworkTier> networkTier;

    public Input<AccessConfigNetworkTier> getNetworkTier() {
        return this.networkTier == null ? Input.empty() : this.networkTier;
    }

    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
     */
    @InputImport(name="publicPtrDomainName")
    private final @Nullable Input<String> publicPtrDomainName;

    public Input<String> getPublicPtrDomainName() {
        return this.publicPtrDomainName == null ? Input.empty() : this.publicPtrDomainName;
    }

    /**
     * Specifies whether a public DNS 'A' record should be created for the external IP address of this access configuration.
     * 
     */
    @InputImport(name="setPublicDns")
    private final @Nullable Input<Boolean> setPublicDns;

    public Input<Boolean> getSetPublicDns() {
        return this.setPublicDns == null ? Input.empty() : this.setPublicDns;
    }

    /**
     * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
     */
    @InputImport(name="setPublicPtr")
    private final @Nullable Input<Boolean> setPublicPtr;

    public Input<Boolean> getSetPublicPtr() {
        return this.setPublicPtr == null ? Input.empty() : this.setPublicPtr;
    }

    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<AccessConfigType> type;

    public Input<AccessConfigType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AccessConfigArgs(
        @Nullable Input<String> externalIpv6,
        @Nullable Input<Integer> externalIpv6PrefixLength,
        @Nullable Input<String> name,
        @Nullable Input<String> natIP,
        @Nullable Input<AccessConfigNetworkTier> networkTier,
        @Nullable Input<String> publicPtrDomainName,
        @Nullable Input<Boolean> setPublicDns,
        @Nullable Input<Boolean> setPublicPtr,
        @Nullable Input<AccessConfigType> type) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.name = name;
        this.natIP = natIP;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
        this.setPublicDns = setPublicDns;
        this.setPublicPtr = setPublicPtr;
        this.type = type;
    }

    private AccessConfigArgs() {
        this.externalIpv6 = Input.empty();
        this.externalIpv6PrefixLength = Input.empty();
        this.name = Input.empty();
        this.natIP = Input.empty();
        this.networkTier = Input.empty();
        this.publicPtrDomainName = Input.empty();
        this.setPublicDns = Input.empty();
        this.setPublicPtr = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> externalIpv6;
        private @Nullable Input<Integer> externalIpv6PrefixLength;
        private @Nullable Input<String> name;
        private @Nullable Input<String> natIP;
        private @Nullable Input<AccessConfigNetworkTier> networkTier;
        private @Nullable Input<String> publicPtrDomainName;
        private @Nullable Input<Boolean> setPublicDns;
        private @Nullable Input<Boolean> setPublicPtr;
        private @Nullable Input<AccessConfigType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.name = defaults.name;
    	      this.natIP = defaults.natIP;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
    	      this.setPublicDns = defaults.setPublicDns;
    	      this.setPublicPtr = defaults.setPublicPtr;
    	      this.type = defaults.type;
        }

        public Builder setExternalIpv6(@Nullable Input<String> externalIpv6) {
            this.externalIpv6 = externalIpv6;
            return this;
        }

        public Builder setExternalIpv6(@Nullable String externalIpv6) {
            this.externalIpv6 = Input.ofNullable(externalIpv6);
            return this;
        }

        public Builder setExternalIpv6PrefixLength(@Nullable Input<Integer> externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }

        public Builder setExternalIpv6PrefixLength(@Nullable Integer externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Input.ofNullable(externalIpv6PrefixLength);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNatIP(@Nullable Input<String> natIP) {
            this.natIP = natIP;
            return this;
        }

        public Builder setNatIP(@Nullable String natIP) {
            this.natIP = Input.ofNullable(natIP);
            return this;
        }

        public Builder setNetworkTier(@Nullable Input<AccessConfigNetworkTier> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder setNetworkTier(@Nullable AccessConfigNetworkTier networkTier) {
            this.networkTier = Input.ofNullable(networkTier);
            return this;
        }

        public Builder setPublicPtrDomainName(@Nullable Input<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder setPublicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Input.ofNullable(publicPtrDomainName);
            return this;
        }

        public Builder setSetPublicDns(@Nullable Input<Boolean> setPublicDns) {
            this.setPublicDns = setPublicDns;
            return this;
        }

        public Builder setSetPublicDns(@Nullable Boolean setPublicDns) {
            this.setPublicDns = Input.ofNullable(setPublicDns);
            return this;
        }

        public Builder setSetPublicPtr(@Nullable Input<Boolean> setPublicPtr) {
            this.setPublicPtr = setPublicPtr;
            return this;
        }

        public Builder setSetPublicPtr(@Nullable Boolean setPublicPtr) {
            this.setPublicPtr = Input.ofNullable(setPublicPtr);
            return this;
        }

        public Builder setType(@Nullable Input<AccessConfigType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable AccessConfigType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public AccessConfigArgs build() {
            return new AccessConfigArgs(externalIpv6, externalIpv6PrefixLength, name, natIP, networkTier, publicPtrDomainName, setPublicDns, setPublicPtr, type);
        }
    }
}
