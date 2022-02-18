// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetGlobalForwardingRuleArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetGlobalForwardingRuleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalForwardingRule {
/**
 * Returns the specified GlobalForwardingRule resource. Gets a list of available forwarding rules by making a list() request.
 * 
 */
    public static CompletableFuture<GetGlobalForwardingRuleResult> invokeAsync(GetGlobalForwardingRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getGlobalForwardingRule", TypeShape.of(GetGlobalForwardingRuleResult.class), args == null ? GetGlobalForwardingRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
