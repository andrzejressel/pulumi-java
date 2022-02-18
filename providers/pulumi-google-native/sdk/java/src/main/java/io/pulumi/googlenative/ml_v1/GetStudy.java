// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.inputs.GetStudyArgs;
import io.pulumi.googlenative.ml_v1.outputs.GetStudyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStudy {
/**
 * Gets a study.
 * 
 */
    public static CompletableFuture<GetStudyResult> invokeAsync(GetStudyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getStudy", TypeShape.of(GetStudyResult.class), args == null ? GetStudyArgs.Empty : args, Utilities.withVersion(options));
    }
}
