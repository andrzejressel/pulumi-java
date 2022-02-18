// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetRegionCommitmentArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetRegionCommitmentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionCommitment {
/**
 * Returns the specified commitment resource. Gets a list of available commitments by making a list() request.
 * 
 */
    public static CompletableFuture<GetRegionCommitmentResult> invokeAsync(GetRegionCommitmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getRegionCommitment", TypeShape.of(GetRegionCommitmentResult.class), args == null ? GetRegionCommitmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
