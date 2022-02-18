// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetKeyArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetKeyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKey {
/**
 * Gets details for a consumer key for a developer app, including the key and secret value, associated API products, and other information.
 * 
 */
    public static CompletableFuture<GetKeyResult> invokeAsync(GetKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getKey", TypeShape.of(GetKeyResult.class), args == null ? GetKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
