// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudiot_v1.enums.GatewayConfigGatewayAuthMethod;
import io.pulumi.googlenative.cloudiot_v1.enums.GatewayConfigGatewayType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Gateway-related configuration and state.
 * 
 */
public final class GatewayConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayConfigArgs Empty = new GatewayConfigArgs();

    /**
     * Indicates how to authorize and/or authenticate devices to access the gateway.
     * 
     */
    @InputImport(name="gatewayAuthMethod")
    private final @Nullable Input<GatewayConfigGatewayAuthMethod> gatewayAuthMethod;

    public Input<GatewayConfigGatewayAuthMethod> getGatewayAuthMethod() {
        return this.gatewayAuthMethod == null ? Input.empty() : this.gatewayAuthMethod;
    }

    /**
     * Indicates whether the device is a gateway.
     * 
     */
    @InputImport(name="gatewayType")
    private final @Nullable Input<GatewayConfigGatewayType> gatewayType;

    public Input<GatewayConfigGatewayType> getGatewayType() {
        return this.gatewayType == null ? Input.empty() : this.gatewayType;
    }

    public GatewayConfigArgs(
        @Nullable Input<GatewayConfigGatewayAuthMethod> gatewayAuthMethod,
        @Nullable Input<GatewayConfigGatewayType> gatewayType) {
        this.gatewayAuthMethod = gatewayAuthMethod;
        this.gatewayType = gatewayType;
    }

    private GatewayConfigArgs() {
        this.gatewayAuthMethod = Input.empty();
        this.gatewayType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GatewayConfigGatewayAuthMethod> gatewayAuthMethod;
        private @Nullable Input<GatewayConfigGatewayType> gatewayType;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayAuthMethod = defaults.gatewayAuthMethod;
    	      this.gatewayType = defaults.gatewayType;
        }

        public Builder setGatewayAuthMethod(@Nullable Input<GatewayConfigGatewayAuthMethod> gatewayAuthMethod) {
            this.gatewayAuthMethod = gatewayAuthMethod;
            return this;
        }

        public Builder setGatewayAuthMethod(@Nullable GatewayConfigGatewayAuthMethod gatewayAuthMethod) {
            this.gatewayAuthMethod = Input.ofNullable(gatewayAuthMethod);
            return this;
        }

        public Builder setGatewayType(@Nullable Input<GatewayConfigGatewayType> gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder setGatewayType(@Nullable GatewayConfigGatewayType gatewayType) {
            this.gatewayType = Input.ofNullable(gatewayType);
            return this;
        }

        public GatewayConfigArgs build() {
            return new GatewayConfigArgs(gatewayAuthMethod, gatewayType);
        }
    }
}
