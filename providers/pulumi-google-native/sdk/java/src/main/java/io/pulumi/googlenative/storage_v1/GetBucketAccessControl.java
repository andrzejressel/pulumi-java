// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storage_v1.inputs.GetBucketAccessControlArgs;
import io.pulumi.googlenative.storage_v1.outputs.GetBucketAccessControlResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBucketAccessControl {
/**
 * Returns the ACL entry for the specified entity on the specified bucket.
 * 
 */
    public static CompletableFuture<GetBucketAccessControlResult> invokeAsync(GetBucketAccessControlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getBucketAccessControl", TypeShape.of(GetBucketAccessControlResult.class), args == null ? GetBucketAccessControlArgs.Empty : args, Utilities.withVersion(options));
    }
}
