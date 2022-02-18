// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v3.inputs.GetServiceLevelObjectiveArgs;
import io.pulumi.googlenative.monitoring_v3.outputs.GetServiceLevelObjectiveResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceLevelObjective {
/**
 * Get a ServiceLevelObjective by name.
 * 
 */
    public static CompletableFuture<GetServiceLevelObjectiveResult> invokeAsync(GetServiceLevelObjectiveArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getServiceLevelObjective", TypeShape.of(GetServiceLevelObjectiveResult.class), args == null ? GetServiceLevelObjectiveArgs.Empty : args, Utilities.withVersion(options));
    }
}
