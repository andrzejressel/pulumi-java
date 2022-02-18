// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.GetUtilizationReportArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.GetUtilizationReportResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUtilizationReport {
/**
 * Gets a single Utilization Report.
 * 
 */
    public static CompletableFuture<GetUtilizationReportResult> invokeAsync(GetUtilizationReportArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1alpha1:getUtilizationReport", TypeShape.of(GetUtilizationReportResult.class), args == null ? GetUtilizationReportArgs.Empty : args, Utilities.withVersion(options));
    }
}
