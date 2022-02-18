// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigtableadmin_v2.inputs.GetClusterArgs;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.GetClusterResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCluster {
/**
 * Gets information about a cluster.
 * 
 */
    public static CompletableFuture<GetClusterResult> invokeAsync(GetClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getCluster", TypeShape.of(GetClusterResult.class), args == null ? GetClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
