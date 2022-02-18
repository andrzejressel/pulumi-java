// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.sqladmin_v1.inputs.GetSslCertArgs;
import io.pulumi.googlenative.sqladmin_v1.outputs.GetSslCertResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSslCert {
/**
 * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to initial creation.
 * 
 */
    public static CompletableFuture<GetSslCertResult> invokeAsync(GetSslCertArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:sqladmin/v1:getSslCert", TypeShape.of(GetSslCertResult.class), args == null ? GetSslCertArgs.Empty : args, Utilities.withVersion(options));
    }
}
