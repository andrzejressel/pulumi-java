// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetInstanceTemplateArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetInstanceTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceTemplate {
/**
 * Returns the specified instance template. Gets a list of available instance templates by making a list() request.
 * 
 */
    public static CompletableFuture<GetInstanceTemplateResult> invokeAsync(GetInstanceTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getInstanceTemplate", TypeShape.of(GetInstanceTemplateResult.class), args == null ? GetInstanceTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
