// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetAutoscalerArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetAutoscalerResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAutoscaler {
/**
 * Returns the specified autoscaler resource. Gets a list of available autoscalers by making a list() request.
 * 
 */
    public static CompletableFuture<GetAutoscalerResult> invokeAsync(GetAutoscalerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getAutoscaler", TypeShape.of(GetAutoscalerResult.class), args == null ? GetAutoscalerArgs.Empty : args, Utilities.withVersion(options));
    }
}
