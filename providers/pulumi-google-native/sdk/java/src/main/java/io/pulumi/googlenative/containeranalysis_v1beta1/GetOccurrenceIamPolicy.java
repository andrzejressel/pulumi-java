// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.GetOccurrenceIamPolicyArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GetOccurrenceIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOccurrenceIamPolicy {
/**
 * Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
 * 
 */
    public static CompletableFuture<GetOccurrenceIamPolicyResult> invokeAsync(GetOccurrenceIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1beta1:getOccurrenceIamPolicy", TypeShape.of(GetOccurrenceIamPolicyResult.class), args == null ? GetOccurrenceIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
