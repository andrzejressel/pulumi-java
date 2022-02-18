// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetBackendServiceArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetBackendServiceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackendService {
/**
 * Returns the specified BackendService resource. Gets a list of available backend services.
 * 
 */
    public static CompletableFuture<GetBackendServiceResult> invokeAsync(GetBackendServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getBackendService", TypeShape.of(GetBackendServiceResult.class), args == null ? GetBackendServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
