// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.osconfig_v1beta.inputs.GetPatchDeploymentArgs;
import io.pulumi.googlenative.osconfig_v1beta.outputs.GetPatchDeploymentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPatchDeployment {
/**
 * Get an OS Config patch deployment.
 * 
 */
    public static CompletableFuture<GetPatchDeploymentResult> invokeAsync(GetPatchDeploymentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:osconfig/v1beta:getPatchDeployment", TypeShape.of(GetPatchDeploymentResult.class), args == null ? GetPatchDeploymentArgs.Empty : args, Utilities.withVersion(options));
    }
}
