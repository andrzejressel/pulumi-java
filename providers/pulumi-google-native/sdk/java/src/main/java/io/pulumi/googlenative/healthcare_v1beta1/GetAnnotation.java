// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.GetAnnotationArgs;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.GetAnnotationResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAnnotation {
/**
 * Gets an Annotation.
 * 
 */
    public static CompletableFuture<GetAnnotationResult> invokeAsync(GetAnnotationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1beta1:getAnnotation", TypeShape.of(GetAnnotationResult.class), args == null ? GetAnnotationArgs.Empty : args, Utilities.withVersion(options));
    }
}
