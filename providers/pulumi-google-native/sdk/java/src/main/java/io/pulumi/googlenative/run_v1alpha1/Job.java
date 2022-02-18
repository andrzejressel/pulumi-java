// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.run_v1alpha1.JobArgs;
import io.pulumi.googlenative.run_v1alpha1.outputs.JobSpecResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.JobStatusResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.ObjectMetaResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a job.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:run/v1alpha1:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * Optional. APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources +optional
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output<String> apiVersion;

    /**
     * @return Optional. APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources +optional
     * 
     */
    public Output<String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Optional. Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Optional. Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Optional. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata +optional
     * 
     */
    @OutputExport(name="metadata", type=ObjectMetaResponse.class, parameters={})
    private Output<ObjectMetaResponse> metadata;

    /**
     * @return Optional. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata +optional
     * 
     */
    public Output<ObjectMetaResponse> getMetadata() {
        return this.metadata;
    }
    /**
     * Optional. Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
     */
    @OutputExport(name="spec", type=JobSpecResponse.class, parameters={})
    private Output<JobSpecResponse> spec;

    /**
     * @return Optional. Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
     */
    public Output<JobSpecResponse> getSpec() {
        return this.spec;
    }
    /**
     * Optional. Current status of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
     */
    @OutputExport(name="status", type=JobStatusResponse.class, parameters={})
    private Output<JobStatusResponse> status;

    /**
     * @return Optional. Current status of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
     */
    public Output<JobStatusResponse> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:run/v1alpha1:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Job(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:run/v1alpha1:Job", name, null, makeResourceOptions(options, id));
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
    public static Job get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
