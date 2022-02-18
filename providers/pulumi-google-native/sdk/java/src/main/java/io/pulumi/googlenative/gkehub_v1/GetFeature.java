// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1.inputs.GetFeatureArgs;
import io.pulumi.googlenative.gkehub_v1.outputs.GetFeatureResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFeature {
/**
 * Gets details of a single Feature.
 * 
 */
    public static CompletableFuture<GetFeatureResult> invokeAsync(GetFeatureArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1:getFeature", TypeShape.of(GetFeatureResult.class), args == null ? GetFeatureArgs.Empty : args, Utilities.withVersion(options));
    }
}
