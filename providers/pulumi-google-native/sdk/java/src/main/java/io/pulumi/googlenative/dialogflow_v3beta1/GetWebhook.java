// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetWebhookArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetWebhookResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebhook {
/**
 * Retrieves the specified webhook.
 * 
 */
    public static CompletableFuture<GetWebhookResult> invokeAsync(GetWebhookArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getWebhook", TypeShape.of(GetWebhookResult.class), args == null ? GetWebhookArgs.Empty : args, Utilities.withVersion(options));
    }
}
