// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetTargetProjectArgs;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetTargetProjectResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTargetProject {
/**
 * Gets details of a single TargetProject. NOTE: TargetProject is a global resource; hence the only supported value for location is `global`.
 * 
 */
    public static CompletableFuture<GetTargetProjectResult> invokeAsync(GetTargetProjectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getTargetProject", TypeShape.of(GetTargetProjectResult.class), args == null ? GetTargetProjectArgs.Empty : args, Utilities.withVersion(options));
    }
}
