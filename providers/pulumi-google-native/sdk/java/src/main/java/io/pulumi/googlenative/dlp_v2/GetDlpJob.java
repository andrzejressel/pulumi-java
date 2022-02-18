// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dlp_v2.inputs.GetDlpJobArgs;
import io.pulumi.googlenative.dlp_v2.outputs.GetDlpJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDlpJob {
/**
 * Gets the latest state of a long-running DlpJob. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
 * 
 */
    public static CompletableFuture<GetDlpJobResult> invokeAsync(GetDlpJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dlp/v2:getDlpJob", TypeShape.of(GetDlpJobResult.class), args == null ? GetDlpJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
