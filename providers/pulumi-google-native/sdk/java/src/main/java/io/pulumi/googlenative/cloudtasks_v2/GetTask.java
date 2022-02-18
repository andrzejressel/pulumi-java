// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudtasks_v2.inputs.GetTaskArgs;
import io.pulumi.googlenative.cloudtasks_v2.outputs.GetTaskResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTask {
/**
 * Gets a task.
 * 
 */
    public static CompletableFuture<GetTaskResult> invokeAsync(GetTaskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2:getTask", TypeShape.of(GetTaskResult.class), args == null ? GetTaskArgs.Empty : args, Utilities.withVersion(options));
    }
}
