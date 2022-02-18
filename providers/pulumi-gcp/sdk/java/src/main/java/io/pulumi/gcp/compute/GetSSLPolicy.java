// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetSSLPolicyArgs;
import io.pulumi.gcp.compute.outputs.GetSSLPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSSLPolicy {
/**
 * Gets an SSL Policy within GCE from its name, for use with Target HTTPS and Target SSL Proxies.
 *     For more information see [the official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies).
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getSSLPolicy.
 * 
 *
 * A collection of values returned by getSSLPolicy.
 * 
 */
    public static CompletableFuture<GetSSLPolicyResult> invokeAsync(GetSSLPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getSSLPolicy:getSSLPolicy", TypeShape.of(GetSSLPolicyResult.class), args == null ? GetSSLPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
