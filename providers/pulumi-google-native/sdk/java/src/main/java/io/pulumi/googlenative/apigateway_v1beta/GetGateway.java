// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1beta.inputs.GetGatewayArgs;
import io.pulumi.googlenative.apigateway_v1beta.outputs.GetGatewayResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGateway {
/**
 * Gets details of a single Gateway.
 * 
 */
    public static CompletableFuture<GetGatewayResult> invokeAsync(GetGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getGateway", TypeShape.of(GetGatewayResult.class), args == null ? GetGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
