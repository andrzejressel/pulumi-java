// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetForwardingRuleArgs;
import io.pulumi.gcp.compute.outputs.GetForwardingRuleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetForwardingRule {
/**
 * Get a forwarding rule within GCE from its name.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getForwardingRule.
 * 
 *
 * A collection of values returned by getForwardingRule.
 * 
 */
    public static CompletableFuture<GetForwardingRuleResult> invokeAsync(GetForwardingRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getForwardingRule:getForwardingRule", TypeShape.of(GetForwardingRuleResult.class), args == null ? GetForwardingRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
