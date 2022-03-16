// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.JobArgs;
import io.pulumi.azurenative.media.outputs.JobInputAssetResponse;
import io.pulumi.azurenative.media.outputs.JobInputClipResponse;
import io.pulumi.azurenative.media.outputs.JobInputHttpResponse;
import io.pulumi.azurenative.media.outputs.JobInputSequenceResponse;
import io.pulumi.azurenative.media.outputs.JobInputsResponse;
import io.pulumi.azurenative.media.outputs.JobOutputAssetResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using EventGrid.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:Job job1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contosoresources/providers/Microsoft.Media/mediaservices/contosomedia/transforms/exampleTransform/jobs/job1 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * Customer provided key, value pairs that will be returned in Job and JobOutput state events.
     * 
     */
    @Export(name="correlationData", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> correlationData;

    /**
     * @return Customer provided key, value pairs that will be returned in Job and JobOutput state events.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getCorrelationData() {
        return this.correlationData;
    }
    /**
     * The UTC date and time when the customer has created the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The UTC date and time when the customer has created the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    public Output<String> getCreated() {
        return this.created;
    }
    /**
     * Optional customer supplied description of the Job.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Optional customer supplied description of the Job.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The UTC date and time at which this Job finished processing.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The UTC date and time at which this Job finished processing.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The inputs for the Job.
     * 
     */
    @Export(name="input", type=Object.class, parameters={})
    private Output<Object> input;

    /**
     * @return The inputs for the Job.
     * 
     */
    public Output<Object> getInput() {
        return this.input;
    }
    /**
     * The UTC date and time when the customer has last updated the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The UTC date and time when the customer has last updated the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    public Output<String> getLastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The outputs for the Job.
     * 
     */
    @Export(name="outputs", type=List.class, parameters={JobOutputAssetResponse.class})
    private Output<List<JobOutputAssetResponse>> outputs;

    /**
     * @return The outputs for the Job.
     * 
     */
    public Output<List<JobOutputAssetResponse>> getOutputs() {
        return this.outputs;
    }
    /**
     * Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal.
     * 
     */
    @Export(name="priority", type=String.class, parameters={})
    private Output</* @Nullable */ String> priority;

    /**
     * @return Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal.
     * 
     */
    public Output</* @Nullable */ String> getPriority() {
        return this.priority;
    }
    /**
     * The UTC date and time at which this Job began processing.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The UTC date and time at which this Job began processing.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the job.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the job.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(JobArgs.Builder a);
    }
    private static io.pulumi.azurenative.media.JobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.media.JobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Job(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Job(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:Job", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20180330preview:Job").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180601preview:Job").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180701:Job").build()),
                Output.of(Alias.builder().type("azure-native:media/v20200501:Job").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210601:Job").build())
            ))
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
    public static Job get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
