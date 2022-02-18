// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetRegionBackendServiceIamPolicyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetRegionBackendServiceIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionBackendServiceIamPolicy {
/**
 * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
 */
    public static CompletableFuture<GetRegionBackendServiceIamPolicyResult> invokeAsync(GetRegionBackendServiceIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getRegionBackendServiceIamPolicy", TypeShape.of(GetRegionBackendServiceIamPolicyResult.class), args == null ? GetRegionBackendServiceIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
