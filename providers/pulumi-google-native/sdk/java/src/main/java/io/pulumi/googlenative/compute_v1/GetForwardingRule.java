// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetForwardingRuleArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetForwardingRuleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetForwardingRule {
/**
 * Returns the specified ForwardingRule resource.
 * 
 */
    public static CompletableFuture<GetForwardingRuleResult> invokeAsync(GetForwardingRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getForwardingRule", TypeShape.of(GetForwardingRuleResult.class), args == null ? GetForwardingRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
