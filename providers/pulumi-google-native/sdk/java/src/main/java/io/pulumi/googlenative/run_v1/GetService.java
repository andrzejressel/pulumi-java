// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.run_v1.inputs.GetServiceArgs;
import io.pulumi.googlenative.run_v1.outputs.GetServiceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetService {
/**
 * Get information about a service.
 * 
 */
    public static CompletableFuture<GetServiceResult> invokeAsync(GetServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:run/v1:getService", TypeShape.of(GetServiceResult.class), args == null ? GetServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
