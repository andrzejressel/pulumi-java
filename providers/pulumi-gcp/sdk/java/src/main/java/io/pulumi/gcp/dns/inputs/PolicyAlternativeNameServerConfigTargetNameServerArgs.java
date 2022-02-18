// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyAlternativeNameServerConfigTargetNameServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyAlternativeNameServerConfigTargetNameServerArgs Empty = new PolicyAlternativeNameServerConfigTargetNameServerArgs();

    /**
     * Forwarding path for this TargetNameServer. If unset or `default` Cloud DNS will make forwarding
     * decision based on address ranges, i.e. RFC1918 addresses go to the VPC, Non-RFC1918 addresses go
     * to the Internet. When set to `private`, Cloud DNS will always send queries through VPC for this target
     * Possible values are `default` and `private`.
     * 
     */
    @InputImport(name="forwardingPath")
    private final @Nullable Input<String> forwardingPath;

    public Input<String> getForwardingPath() {
        return this.forwardingPath == null ? Input.empty() : this.forwardingPath;
    }

    /**
     * IPv4 address to forward to.
     * 
     */
    @InputImport(name="ipv4Address", required=true)
    private final Input<String> ipv4Address;

    public Input<String> getIpv4Address() {
        return this.ipv4Address;
    }

    public PolicyAlternativeNameServerConfigTargetNameServerArgs(
        @Nullable Input<String> forwardingPath,
        Input<String> ipv4Address) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = Objects.requireNonNull(ipv4Address, "expected parameter 'ipv4Address' to be non-null");
    }

    private PolicyAlternativeNameServerConfigTargetNameServerArgs() {
        this.forwardingPath = Input.empty();
        this.ipv4Address = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigTargetNameServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> forwardingPath;
        private Input<String> ipv4Address;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigTargetNameServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
        }

        public Builder setForwardingPath(@Nullable Input<String> forwardingPath) {
            this.forwardingPath = forwardingPath;
            return this;
        }

        public Builder setForwardingPath(@Nullable String forwardingPath) {
            this.forwardingPath = Input.ofNullable(forwardingPath);
            return this;
        }

        public Builder setIpv4Address(Input<String> ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }

        public Builder setIpv4Address(String ipv4Address) {
            this.ipv4Address = Input.of(Objects.requireNonNull(ipv4Address));
            return this;
        }

        public PolicyAlternativeNameServerConfigTargetNameServerArgs build() {
            return new PolicyAlternativeNameServerConfigTargetNameServerArgs(forwardingPath, ipv4Address);
        }
    }
}
