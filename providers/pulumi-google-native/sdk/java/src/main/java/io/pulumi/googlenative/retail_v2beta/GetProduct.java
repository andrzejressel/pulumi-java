// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.retail_v2beta.inputs.GetProductArgs;
import io.pulumi.googlenative.retail_v2beta.outputs.GetProductResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProduct {
/**
 * Gets a Product.
 * 
 */
    public static CompletableFuture<GetProductResult> invokeAsync(GetProductArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2beta:getProduct", TypeShape.of(GetProductResult.class), args == null ? GetProductArgs.Empty : args, Utilities.withVersion(options));
    }
}
