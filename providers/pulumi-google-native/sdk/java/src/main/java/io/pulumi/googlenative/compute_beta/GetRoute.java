// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetRouteArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetRouteResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRoute {
/**
 * Returns the specified Route resource. Gets a list of available routes by making a list() request.
 * 
 */
    public static CompletableFuture<GetRouteResult> invokeAsync(GetRouteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getRoute", TypeShape.of(GetRouteResult.class), args == null ? GetRouteArgs.Empty : args, Utilities.withVersion(options));
    }
}
