// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NetworkProfileResponseOutboundIPs {
    /**
     * A list of public IP addresses.
     * 
     */
    private final List<String> publicIPs;

    @OutputCustomType.Constructor
    private NetworkProfileResponseOutboundIPs(@OutputCustomType.Parameter("publicIPs") List<String> publicIPs) {
        this.publicIPs = publicIPs;
    }

    /**
     * A list of public IP addresses.
     * 
    */
    public List<String> getPublicIPs() {
        return this.publicIPs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponseOutboundIPs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> publicIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponseOutboundIPs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPs = defaults.publicIPs;
        }

        public Builder setPublicIPs(List<String> publicIPs) {
            this.publicIPs = Objects.requireNonNull(publicIPs);
            return this;
        }
        public NetworkProfileResponseOutboundIPs build() {
            return new NetworkProfileResponseOutboundIPs(publicIPs);
        }
    }
}
