// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1.inputs.GetBatchArgs;
import io.pulumi.googlenative.dataproc_v1.outputs.GetBatchResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBatch {
/**
 * Gets the batch workload resource representation.
 * 
 */
    public static CompletableFuture<GetBatchResult> invokeAsync(GetBatchArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataproc/v1:getBatch", TypeShape.of(GetBatchResult.class), args == null ? GetBatchArgs.Empty : args, Utilities.withVersion(options));
    }
}
