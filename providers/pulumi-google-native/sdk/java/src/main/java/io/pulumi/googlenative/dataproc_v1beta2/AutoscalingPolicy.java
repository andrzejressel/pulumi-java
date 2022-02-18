// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1beta2.AutoscalingPolicyArgs;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.BasicAutoscalingAlgorithmResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.InstanceGroupAutoscalingPolicyConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates new autoscaling policy.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataproc/v1beta2:AutoscalingPolicy")
public class AutoscalingPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="basicAlgorithm", type=BasicAutoscalingAlgorithmResponse.class, parameters={})
    private Output<BasicAutoscalingAlgorithmResponse> basicAlgorithm;

    public Output<BasicAutoscalingAlgorithmResponse> getBasicAlgorithm() {
        return this.basicAlgorithm;
    }
    /**
     * The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. Describes how the autoscaler will operate for secondary workers.
     * 
     */
    @OutputExport(name="secondaryWorkerConfig", type=InstanceGroupAutoscalingPolicyConfigResponse.class, parameters={})
    private Output<InstanceGroupAutoscalingPolicyConfigResponse> secondaryWorkerConfig;

    /**
     * @return Optional. Describes how the autoscaler will operate for secondary workers.
     * 
     */
    public Output<InstanceGroupAutoscalingPolicyConfigResponse> getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }
    /**
     * Describes how the autoscaler will operate for primary workers.
     * 
     */
    @OutputExport(name="workerConfig", type=InstanceGroupAutoscalingPolicyConfigResponse.class, parameters={})
    private Output<InstanceGroupAutoscalingPolicyConfigResponse> workerConfig;

    /**
     * @return Describes how the autoscaler will operate for primary workers.
     * 
     */
    public Output<InstanceGroupAutoscalingPolicyConfigResponse> getWorkerConfig() {
        return this.workerConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscalingPolicy(String name, AutoscalingPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1beta2:AutoscalingPolicy", name, args == null ? AutoscalingPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AutoscalingPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1beta2:AutoscalingPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AutoscalingPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AutoscalingPolicy(name, id, options);
    }
}
