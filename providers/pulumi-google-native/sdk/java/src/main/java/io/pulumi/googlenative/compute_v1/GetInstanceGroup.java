// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetInstanceGroupArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetInstanceGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceGroup {
/**
 * Returns the specified zonal instance group. Get a list of available zonal instance groups by making a list() request. For managed instance groups, use the instanceGroupManagers or regionInstanceGroupManagers methods instead.
 * 
 */
    public static CompletableFuture<GetInstanceGroupResult> invokeAsync(GetInstanceGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getInstanceGroup", TypeShape.of(GetInstanceGroupResult.class), args == null ? GetInstanceGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
