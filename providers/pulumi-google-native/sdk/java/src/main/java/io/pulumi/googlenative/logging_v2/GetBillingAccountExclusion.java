// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.logging_v2.inputs.GetBillingAccountExclusionArgs;
import io.pulumi.googlenative.logging_v2.outputs.GetBillingAccountExclusionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBillingAccountExclusion {
/**
 * Gets the description of an exclusion in the _Default sink.
 * 
 */
    public static CompletableFuture<GetBillingAccountExclusionResult> invokeAsync(GetBillingAccountExclusionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getBillingAccountExclusion", TypeShape.of(GetBillingAccountExclusionResult.class), args == null ? GetBillingAccountExclusionArgs.Empty : args, Utilities.withVersion(options));
    }
}
