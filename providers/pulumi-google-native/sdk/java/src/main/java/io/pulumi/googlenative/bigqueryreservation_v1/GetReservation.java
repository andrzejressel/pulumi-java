// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigqueryreservation_v1.inputs.GetReservationArgs;
import io.pulumi.googlenative.bigqueryreservation_v1.outputs.GetReservationResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReservation {
/**
 * Returns information about the reservation.
 * 
 */
    public static CompletableFuture<GetReservationResult> invokeAsync(GetReservationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryreservation/v1:getReservation", TypeShape.of(GetReservationResult.class), args == null ? GetReservationArgs.Empty : args, Utilities.withVersion(options));
    }
}
