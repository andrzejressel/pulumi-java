// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallDenyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallDenyGetArgs Empty = new FirewallDenyGetArgs();

    /**
     * An optional list of ports to which this rule applies. This field
     * is only applicable for UDP or TCP protocol. Each entry must be
     * either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     * Example inputs include: ["22"], ["80","443"], and
     * ["12345-12349"].
     * 
     */
    @InputImport(name="ports")
    private final @Nullable Input<List<String>> ports;

    public Input<List<String>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    /**
     * The IP protocol to which this rule applies. The protocol type is
     * required when creating a firewall rule. This value can either be
     * one of the following well known protocol strings (tcp, udp,
     * icmp, esp, ah, sctp, ipip, all), or the IP protocol number.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    public FirewallDenyGetArgs(
        @Nullable Input<List<String>> ports,
        Input<String> protocol) {
        this.ports = ports;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private FirewallDenyGetArgs() {
        this.ports = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallDenyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> ports;
        private Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallDenyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
    	      this.protocol = defaults.protocol;
        }

        public Builder setPorts(@Nullable Input<List<String>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<String> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder setProtocol(Input<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public FirewallDenyGetArgs build() {
            return new FirewallDenyGetArgs(ports, protocol);
        }
    }
}
