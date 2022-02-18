// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dlp_v2.inputs.GetDeidentifyTemplateArgs;
import io.pulumi.googlenative.dlp_v2.outputs.GetDeidentifyTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDeidentifyTemplate {
/**
 * Gets a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
 * 
 */
    public static CompletableFuture<GetDeidentifyTemplateResult> invokeAsync(GetDeidentifyTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dlp/v2:getDeidentifyTemplate", TypeShape.of(GetDeidentifyTemplateResult.class), args == null ? GetDeidentifyTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
