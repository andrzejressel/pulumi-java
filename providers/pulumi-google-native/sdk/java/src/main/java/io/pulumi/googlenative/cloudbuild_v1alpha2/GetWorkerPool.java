// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1alpha2.inputs.GetWorkerPoolArgs;
import io.pulumi.googlenative.cloudbuild_v1alpha2.outputs.GetWorkerPoolResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkerPool {
/**
 * Returns details of a `WorkerPool`.
 * 
 */
    public static CompletableFuture<GetWorkerPoolResult> invokeAsync(GetWorkerPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbuild/v1alpha2:getWorkerPool", TypeShape.of(GetWorkerPoolResult.class), args == null ? GetWorkerPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
