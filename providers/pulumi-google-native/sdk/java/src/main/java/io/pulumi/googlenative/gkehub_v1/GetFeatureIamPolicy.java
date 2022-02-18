// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1.inputs.GetFeatureIamPolicyArgs;
import io.pulumi.googlenative.gkehub_v1.outputs.GetFeatureIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFeatureIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetFeatureIamPolicyResult> invokeAsync(GetFeatureIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1:getFeatureIamPolicy", TypeShape.of(GetFeatureIamPolicyResult.class), args == null ? GetFeatureIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
