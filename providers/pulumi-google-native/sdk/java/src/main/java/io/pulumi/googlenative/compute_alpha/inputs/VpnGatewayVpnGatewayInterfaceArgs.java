// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A VPN gateway interface.
 * 
 */
public final class VpnGatewayVpnGatewayInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnGatewayVpnGatewayInterfaceArgs Empty = new VpnGatewayVpnGatewayInterfaceArgs();

    /**
     * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for IPsec-encrypted Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource. Not currently available publicly.
     * 
     */
    @InputImport(name="interconnectAttachment")
    private final @Nullable Input<String> interconnectAttachment;

    public Input<String> getInterconnectAttachment() {
        return this.interconnectAttachment == null ? Input.empty() : this.interconnectAttachment;
    }

    public VpnGatewayVpnGatewayInterfaceArgs(@Nullable Input<String> interconnectAttachment) {
        this.interconnectAttachment = interconnectAttachment;
    }

    private VpnGatewayVpnGatewayInterfaceArgs() {
        this.interconnectAttachment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayVpnGatewayInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> interconnectAttachment;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayVpnGatewayInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectAttachment = defaults.interconnectAttachment;
        }

        public Builder setInterconnectAttachment(@Nullable Input<String> interconnectAttachment) {
            this.interconnectAttachment = interconnectAttachment;
            return this;
        }

        public Builder setInterconnectAttachment(@Nullable String interconnectAttachment) {
            this.interconnectAttachment = Input.ofNullable(interconnectAttachment);
            return this;
        }

        public VpnGatewayVpnGatewayInterfaceArgs build() {
            return new VpnGatewayVpnGatewayInterfaceArgs(interconnectAttachment);
        }
    }
}
