// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetVPNGatewayArgs;
import io.pulumi.gcp.compute.outputs.GetVPNGatewayResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVPNGateway {
/**
 * Get a VPN gateway within GCE from its name.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getVPNGateway.
 * 
 *
 * A collection of values returned by getVPNGateway.
 * 
 */
    public static CompletableFuture<GetVPNGatewayResult> invokeAsync(GetVPNGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getVPNGateway:getVPNGateway", TypeShape.of(GetVPNGatewayResult.class), args == null ? GetVPNGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
