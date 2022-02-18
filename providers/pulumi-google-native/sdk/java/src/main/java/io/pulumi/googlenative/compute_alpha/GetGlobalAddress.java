// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetGlobalAddressArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetGlobalAddressResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalAddress {
/**
 * Returns the specified address resource. Gets a list of available addresses by making a list() request.
 * 
 */
    public static CompletableFuture<GetGlobalAddressResult> invokeAsync(GetGlobalAddressArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getGlobalAddress", TypeShape.of(GetGlobalAddressResult.class), args == null ? GetGlobalAddressArgs.Empty : args, Utilities.withVersion(options));
    }
}
