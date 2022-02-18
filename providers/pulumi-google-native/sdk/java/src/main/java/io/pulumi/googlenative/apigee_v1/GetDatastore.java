// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetDatastoreArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetDatastoreResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatastore {
/**
 * Get a Datastore
 * 
 */
    public static CompletableFuture<GetDatastoreResult> invokeAsync(GetDatastoreArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getDatastore", TypeShape.of(GetDatastoreResult.class), args == null ? GetDatastoreArgs.Empty : args, Utilities.withVersion(options));
    }
}
