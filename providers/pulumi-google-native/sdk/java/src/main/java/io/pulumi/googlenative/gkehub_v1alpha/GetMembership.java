// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.GetMembershipArgs;
import io.pulumi.googlenative.gkehub_v1alpha.outputs.GetMembershipResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMembership {
/**
 * Gets the details of a Membership.
 * 
 */
    public static CompletableFuture<GetMembershipResult> invokeAsync(GetMembershipArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1alpha:getMembership", TypeShape.of(GetMembershipResult.class), args == null ? GetMembershipArgs.Empty : args, Utilities.withVersion(options));
    }
}
