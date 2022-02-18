// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.spanner.inputs.GetInstanceArgs;
import io.pulumi.gcp.spanner.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstance {
/**
 * Get a spanner instance from Google Cloud by its name.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getInstance.
 * 
 *
 * A collection of values returned by getInstance.
 * 
 */
    public static CompletableFuture<GetInstanceResult> invokeAsync(GetInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:spanner/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args == null ? GetInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
