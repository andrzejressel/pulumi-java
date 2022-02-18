// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetRegionUrlMapArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetRegionUrlMapResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionUrlMap {
/**
 * Returns the specified UrlMap resource. Gets a list of available URL maps by making a list() request.
 * 
 */
    public static CompletableFuture<GetRegionUrlMapResult> invokeAsync(GetRegionUrlMapArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getRegionUrlMap", TypeShape.of(GetRegionUrlMapResult.class), args == null ? GetRegionUrlMapArgs.Empty : args, Utilities.withVersion(options));
    }
}
