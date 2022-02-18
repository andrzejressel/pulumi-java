// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetGlobalPublicDelegatedPrefixArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetGlobalPublicDelegatedPrefixResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalPublicDelegatedPrefix {
/**
 * Returns the specified global PublicDelegatedPrefix resource.
 * 
 */
    public static CompletableFuture<GetGlobalPublicDelegatedPrefixResult> invokeAsync(GetGlobalPublicDelegatedPrefixArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getGlobalPublicDelegatedPrefix", TypeShape.of(GetGlobalPublicDelegatedPrefixResult.class), args == null ? GetGlobalPublicDelegatedPrefixArgs.Empty : args, Utilities.withVersion(options));
    }
}
