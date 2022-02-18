// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datamigration_v1.inputs.GetMigrationJobIamPolicyArgs;
import io.pulumi.googlenative.datamigration_v1.outputs.GetMigrationJobIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMigrationJobIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetMigrationJobIamPolicyResult> invokeAsync(GetMigrationJobIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datamigration/v1:getMigrationJobIamPolicy", TypeShape.of(GetMigrationJobIamPolicyResult.class), args == null ? GetMigrationJobIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
