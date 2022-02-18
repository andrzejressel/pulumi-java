// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.metastore_v1alpha.inputs.GetServiceDatabaseIamPolicyArgs;
import io.pulumi.googlenative.metastore_v1alpha.outputs.GetServiceDatabaseIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceDatabaseIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetServiceDatabaseIamPolicyResult> invokeAsync(GetServiceDatabaseIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getServiceDatabaseIamPolicy", TypeShape.of(GetServiceDatabaseIamPolicyResult.class), args == null ? GetServiceDatabaseIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
