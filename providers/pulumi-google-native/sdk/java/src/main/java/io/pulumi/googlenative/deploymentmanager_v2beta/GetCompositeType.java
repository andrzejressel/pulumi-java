// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.GetCompositeTypeArgs;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.GetCompositeTypeResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCompositeType {
/**
 * Gets information about a specific composite type.
 * 
 */
    public static CompletableFuture<GetCompositeTypeResult> invokeAsync(GetCompositeTypeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/v2beta:getCompositeType", TypeShape.of(GetCompositeTypeResult.class), args == null ? GetCompositeTypeArgs.Empty : args, Utilities.withVersion(options));
    }
}
