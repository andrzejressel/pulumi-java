// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.file_v1beta1.inputs.GetInstanceArgs;
import io.pulumi.googlenative.file_v1beta1.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstance {
/**
 * Gets the details of a specific instance.
 * 
 */
    public static CompletableFuture<GetInstanceResult> invokeAsync(GetInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:file/v1beta1:getInstance", TypeShape.of(GetInstanceResult.class), args == null ? GetInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
