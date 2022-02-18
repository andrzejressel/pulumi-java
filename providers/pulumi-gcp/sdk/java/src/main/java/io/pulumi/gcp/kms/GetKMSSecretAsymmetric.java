// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.inputs.GetKMSSecretAsymmetricArgs;
import io.pulumi.gcp.kms.outputs.GetKMSSecretAsymmetricResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKMSSecretAsymmetric {
    public static CompletableFuture<GetKMSSecretAsymmetricResult> invokeAsync(GetKMSSecretAsymmetricArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSSecretAsymmetric:getKMSSecretAsymmetric", TypeShape.of(GetKMSSecretAsymmetricResult.class), args == null ? GetKMSSecretAsymmetricArgs.Empty : args, Utilities.withVersion(options));
    }
}
