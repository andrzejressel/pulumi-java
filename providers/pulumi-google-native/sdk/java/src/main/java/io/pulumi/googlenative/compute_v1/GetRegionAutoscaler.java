// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetRegionAutoscalerArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetRegionAutoscalerResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionAutoscaler {
/**
 * Returns the specified autoscaler.
 * 
 */
    public static CompletableFuture<GetRegionAutoscalerResult> invokeAsync(GetRegionAutoscalerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getRegionAutoscaler", TypeShape.of(GetRegionAutoscalerResult.class), args == null ? GetRegionAutoscalerArgs.Empty : args, Utilities.withVersion(options));
    }
}
