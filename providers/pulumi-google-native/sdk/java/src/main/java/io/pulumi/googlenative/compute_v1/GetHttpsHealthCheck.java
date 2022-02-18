// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetHttpsHealthCheckArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetHttpsHealthCheckResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHttpsHealthCheck {
/**
 * Returns the specified HttpsHealthCheck resource. Gets a list of available HTTPS health checks by making a list() request.
 * 
 */
    public static CompletableFuture<GetHttpsHealthCheckResult> invokeAsync(GetHttpsHealthCheckArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getHttpsHealthCheck", TypeShape.of(GetHttpsHealthCheckResult.class), args == null ? GetHttpsHealthCheckArgs.Empty : args, Utilities.withVersion(options));
    }
}
