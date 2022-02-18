// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetUrlMapArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetUrlMapResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUrlMap {
/**
 * Returns the specified UrlMap resource. Gets a list of available URL maps by making a list() request.
 * 
 */
    public static CompletableFuture<GetUrlMapResult> invokeAsync(GetUrlMapArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getUrlMap", TypeShape.of(GetUrlMapResult.class), args == null ? GetUrlMapArgs.Empty : args, Utilities.withVersion(options));
    }
}
