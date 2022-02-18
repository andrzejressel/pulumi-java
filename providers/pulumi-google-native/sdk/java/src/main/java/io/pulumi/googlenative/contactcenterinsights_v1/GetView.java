// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GetViewArgs;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GetViewResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetView {
/**
 * Gets a view.
 * 
 */
    public static CompletableFuture<GetViewResult> invokeAsync(GetViewArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:contactcenterinsights/v1:getView", TypeShape.of(GetViewResult.class), args == null ? GetViewArgs.Empty : args, Utilities.withVersion(options));
    }
}
