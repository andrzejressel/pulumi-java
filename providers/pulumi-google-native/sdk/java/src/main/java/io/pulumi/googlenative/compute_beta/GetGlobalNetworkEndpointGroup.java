// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetGlobalNetworkEndpointGroupArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetGlobalNetworkEndpointGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalNetworkEndpointGroup {
/**
 * Returns the specified network endpoint group. Gets a list of available network endpoint groups by making a list() request.
 * 
 */
    public static CompletableFuture<GetGlobalNetworkEndpointGroupResult> invokeAsync(GetGlobalNetworkEndpointGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getGlobalNetworkEndpointGroup", TypeShape.of(GetGlobalNetworkEndpointGroupResult.class), args == null ? GetGlobalNetworkEndpointGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
