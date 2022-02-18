// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetTagKeyIamPolicyArgs;
import io.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetTagKeyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTagKeyIamPolicy {
/**
 * Gets the access control policy for a TagKey. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the TagKey's resource name. For example, "tagKeys/1234". The caller must have `cloudresourcemanager.googleapis.com/tagKeys.getIamPolicy` permission on the specified TagKey.
 * 
 */
    public static CompletableFuture<GetTagKeyIamPolicyResult> invokeAsync(GetTagKeyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getTagKeyIamPolicy", TypeShape.of(GetTagKeyIamPolicyResult.class), args == null ? GetTagKeyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
