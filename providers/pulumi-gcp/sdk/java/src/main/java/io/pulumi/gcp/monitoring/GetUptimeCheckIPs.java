// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.outputs.GetUptimeCheckIPsResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUptimeCheckIPs {
/**
 * Returns the list of IP addresses that checkers run from. For more information see
 * the [official documentation](https://cloud.google.com/monitoring/uptime-checks#get-ips).
 * 
 * ## Example Usage
 * 
 *
 * A collection of values returned by getUptimeCheckIPs.
 * 
 */
    public static CompletableFuture<GetUptimeCheckIPsResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getUptimeCheckIPs:getUptimeCheckIPs", TypeShape.of(GetUptimeCheckIPsResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
