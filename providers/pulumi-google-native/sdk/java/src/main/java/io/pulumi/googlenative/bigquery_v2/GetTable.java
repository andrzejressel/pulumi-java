// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigquery_v2.inputs.GetTableArgs;
import io.pulumi.googlenative.bigquery_v2.outputs.GetTableResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTable {
/**
 * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
 * 
 */
    public static CompletableFuture<GetTableResult> invokeAsync(GetTableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquery/v2:getTable", TypeShape.of(GetTableResult.class), args == null ? GetTableArgs.Empty : args, Utilities.withVersion(options));
    }
}
