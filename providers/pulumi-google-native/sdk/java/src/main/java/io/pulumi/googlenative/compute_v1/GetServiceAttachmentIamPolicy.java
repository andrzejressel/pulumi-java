// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetServiceAttachmentIamPolicyArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetServiceAttachmentIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceAttachmentIamPolicy {
/**
 * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
 */
    public static CompletableFuture<GetServiceAttachmentIamPolicyResult> invokeAsync(GetServiceAttachmentIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getServiceAttachmentIamPolicy", TypeShape.of(GetServiceAttachmentIamPolicyResult.class), args == null ? GetServiceAttachmentIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
