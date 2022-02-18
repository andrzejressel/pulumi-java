// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.enums.ManagedZoneForwardingConfigNameServerTargetForwardingPath;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneForwardingConfigNameServerTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigNameServerTargetArgs Empty = new ManagedZoneForwardingConfigNameServerTargetArgs();

    /**
     * Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    @InputImport(name="forwardingPath")
    private final @Nullable Input<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath;

    public Input<ManagedZoneForwardingConfigNameServerTargetForwardingPath> getForwardingPath() {
        return this.forwardingPath == null ? Input.empty() : this.forwardingPath;
    }

    /**
     * IPv4 address of a target name server.
     * 
     */
    @InputImport(name="ipv4Address")
    private final @Nullable Input<String> ipv4Address;

    public Input<String> getIpv4Address() {
        return this.ipv4Address == null ? Input.empty() : this.ipv4Address;
    }

    /**
     * IPv6 address of a target name server. Does not accept both fields (ipv4 & ipv6) being populated.
     * 
     */
    @InputImport(name="ipv6Address")
    private final @Nullable Input<String> ipv6Address;

    public Input<String> getIpv6Address() {
        return this.ipv6Address == null ? Input.empty() : this.ipv6Address;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public ManagedZoneForwardingConfigNameServerTargetArgs(
        @Nullable Input<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath,
        @Nullable Input<String> ipv4Address,
        @Nullable Input<String> ipv6Address,
        @Nullable Input<String> kind) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
        this.kind = kind;
    }

    private ManagedZoneForwardingConfigNameServerTargetArgs() {
        this.forwardingPath = Input.empty();
        this.ipv4Address = Input.empty();
        this.ipv6Address = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath;
        private @Nullable Input<String> ipv4Address;
        private @Nullable Input<String> ipv6Address;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
        }

        public Builder setForwardingPath(@Nullable Input<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath) {
            this.forwardingPath = forwardingPath;
            return this;
        }

        public Builder setForwardingPath(@Nullable ManagedZoneForwardingConfigNameServerTargetForwardingPath forwardingPath) {
            this.forwardingPath = Input.ofNullable(forwardingPath);
            return this;
        }

        public Builder setIpv4Address(@Nullable Input<String> ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }

        public Builder setIpv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = Input.ofNullable(ipv4Address);
            return this;
        }

        public Builder setIpv6Address(@Nullable Input<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder setIpv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Input.ofNullable(ipv6Address);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public ManagedZoneForwardingConfigNameServerTargetArgs build() {
            return new ManagedZoneForwardingConfigNameServerTargetArgs(forwardingPath, ipv4Address, ipv6Address, kind);
        }
    }
}
