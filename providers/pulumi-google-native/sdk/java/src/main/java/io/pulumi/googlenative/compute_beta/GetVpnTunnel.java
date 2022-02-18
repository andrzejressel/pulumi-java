// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetVpnTunnelArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetVpnTunnelResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVpnTunnel {
/**
 * Returns the specified VpnTunnel resource. Gets a list of available VPN tunnels by making a list() request.
 * 
 */
    public static CompletableFuture<GetVpnTunnelResult> invokeAsync(GetVpnTunnelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getVpnTunnel", TypeShape.of(GetVpnTunnelResult.class), args == null ? GetVpnTunnelArgs.Empty : args, Utilities.withVersion(options));
    }
}
