// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datafusion_v1.inputs.GetInstanceIamPolicyArgs;
import io.pulumi.googlenative.datafusion_v1.outputs.GetInstanceIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetInstanceIamPolicyResult> invokeAsync(GetInstanceIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datafusion/v1:getInstanceIamPolicy", TypeShape.of(GetInstanceIamPolicyResult.class), args == null ? GetInstanceIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
