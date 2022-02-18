// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.pubsublite_v1.inputs.GetTopicArgs;
import io.pulumi.googlenative.pubsublite_v1.outputs.GetTopicResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTopic {
/**
 * Returns the topic configuration.
 * 
 */
    public static CompletableFuture<GetTopicResult> invokeAsync(GetTopicArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsublite/v1:getTopic", TypeShape.of(GetTopicResult.class), args == null ? GetTopicArgs.Empty : args, Utilities.withVersion(options));
    }
}
