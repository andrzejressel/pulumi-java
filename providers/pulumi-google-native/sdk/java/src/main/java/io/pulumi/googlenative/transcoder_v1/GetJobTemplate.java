// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.transcoder_v1.inputs.GetJobTemplateArgs;
import io.pulumi.googlenative.transcoder_v1.outputs.GetJobTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJobTemplate {
/**
 * Returns the job template data.
 * 
 */
    public static CompletableFuture<GetJobTemplateResult> invokeAsync(GetJobTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:transcoder/v1:getJobTemplate", TypeShape.of(GetJobTemplateResult.class), args == null ? GetJobTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
