// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.GetSpokeArgs;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.GetSpokeResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSpoke {
/**
 * Gets details about the specified spoke.
 * 
 */
    public static CompletableFuture<GetSpokeResult> invokeAsync(GetSpokeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1:getSpoke", TypeShape.of(GetSpokeResult.class), args == null ? GetSpokeArgs.Empty : args, Utilities.withVersion(options));
    }
}
