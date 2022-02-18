// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateArgs;
import io.pulumi.googlenative.privateca_v1beta1.outputs.GetCertificateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificate {
/**
 * Returns a Certificate.
 * 
 */
    public static CompletableFuture<GetCertificateResult> invokeAsync(GetCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1beta1:getCertificate", TypeShape.of(GetCertificateResult.class), args == null ? GetCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
