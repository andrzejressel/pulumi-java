// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetExternalVpnGatewayArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetExternalVpnGatewayResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExternalVpnGateway {
/**
 * Returns the specified externalVpnGateway. Get a list of available externalVpnGateways by making a list() request.
 * 
 */
    public static CompletableFuture<GetExternalVpnGatewayResult> invokeAsync(GetExternalVpnGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getExternalVpnGateway", TypeShape.of(GetExternalVpnGatewayResult.class), args == null ? GetExternalVpnGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
