// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetCryptoKeyVersionArgs;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetCryptoKeyVersionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCryptoKeyVersion {
/**
 * Returns metadata for a given CryptoKeyVersion.
 * 
 */
    public static CompletableFuture<GetCryptoKeyVersionResult> invokeAsync(GetCryptoKeyVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getCryptoKeyVersion", TypeShape.of(GetCryptoKeyVersionResult.class), args == null ? GetCryptoKeyVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
