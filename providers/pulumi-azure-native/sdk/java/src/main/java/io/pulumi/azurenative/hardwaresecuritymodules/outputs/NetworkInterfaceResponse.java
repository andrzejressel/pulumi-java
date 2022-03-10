// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInterfaceResponse {
    /**
     * The ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
     * 
     */
    private final String id;
    /**
     * Private Ip address of the interface
     * 
     */
    private final @Nullable String privateIpAddress;

    @OutputCustomType.Constructor
    private NetworkInterfaceResponse(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("privateIpAddress") @Nullable String privateIpAddress) {
        this.id = id;
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * The ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Private Ip address of the interface
     * 
    */
    public Optional<String> getPrivateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(id, privateIpAddress);
        }
    }
}
