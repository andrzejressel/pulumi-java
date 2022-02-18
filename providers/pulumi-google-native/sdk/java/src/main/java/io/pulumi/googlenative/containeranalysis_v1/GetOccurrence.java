// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1.inputs.GetOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.outputs.GetOccurrenceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOccurrence {
/**
 * Gets the specified occurrence.
 * 
 */
    public static CompletableFuture<GetOccurrenceResult> invokeAsync(GetOccurrenceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1:getOccurrence", TypeShape.of(GetOccurrenceResult.class), args == null ? GetOccurrenceArgs.Empty : args, Utilities.withVersion(options));
    }
}
