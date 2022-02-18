// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.eventarc_v1beta1.inputs.GetTriggerIamPolicyArgs;
import io.pulumi.googlenative.eventarc_v1beta1.outputs.GetTriggerIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTriggerIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetTriggerIamPolicyResult> invokeAsync(GetTriggerIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1beta1:getTriggerIamPolicy", TypeShape.of(GetTriggerIamPolicyResult.class), args == null ? GetTriggerIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
