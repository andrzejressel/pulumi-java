// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.StreamingJobArgs;
import io.pulumi.azurenative.streamanalytics.outputs.FunctionResponse;
import io.pulumi.azurenative.streamanalytics.outputs.InputResponse;
import io.pulumi.azurenative.streamanalytics.outputs.OutputResponse;
import io.pulumi.azurenative.streamanalytics.outputs.SkuResponse;
import io.pulumi.azurenative.streamanalytics.outputs.TransformationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A streaming job object, containing all information associated with the named streaming job.
 * API Version: 2016-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:streamanalytics:StreamingJob sj59 /subscriptions/56b5e0a9-b645-407d-99b0-c64f86013e3d/resourceGroups/sjrg6936/providers/Microsoft.StreamAnalytics/streamingjobs/sj59 
 * ```
 * 
 */
@ResourceType(type="azure-native:streamanalytics:StreamingJob")
public class StreamingJob extends io.pulumi.resources.CustomResource {
    /**
     * Controls certain runtime behaviors of the streaming job.
     * 
     */
    @Export(name="compatibilityLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> compatibilityLevel;

    /**
     * @return Controls certain runtime behaviors of the streaming job.
     * 
     */
    public Output</* @Nullable */ String> getCompatibilityLevel() {
        return this.compatibilityLevel;
    }
    /**
     * Value is an ISO-8601 formatted UTC timestamp indicating when the streaming job was created.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return Value is an ISO-8601 formatted UTC timestamp indicating when the streaming job was created.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if none specified.
     * 
     */
    @Export(name="dataLocale", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataLocale;

    /**
     * @return The data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if none specified.
     * 
     */
    public Output</* @Nullable */ String> getDataLocale() {
        return this.dataLocale;
    }
    /**
     * The current entity tag for the streaming job. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The current entity tag for the streaming job. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     * 
     */
    @Export(name="eventsLateArrivalMaxDelayInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> eventsLateArrivalMaxDelayInSeconds;

    /**
     * @return The maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     * 
     */
    public Output</* @Nullable */ Integer> getEventsLateArrivalMaxDelayInSeconds() {
        return this.eventsLateArrivalMaxDelayInSeconds;
    }
    /**
     * The maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     * 
     */
    @Export(name="eventsOutOfOrderMaxDelayInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> eventsOutOfOrderMaxDelayInSeconds;

    /**
     * @return The maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     * 
     */
    public Output</* @Nullable */ Integer> getEventsOutOfOrderMaxDelayInSeconds() {
        return this.eventsOutOfOrderMaxDelayInSeconds;
    }
    /**
     * Indicates the policy to apply to events that arrive out of order in the input event stream.
     * 
     */
    @Export(name="eventsOutOfOrderPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventsOutOfOrderPolicy;

    /**
     * @return Indicates the policy to apply to events that arrive out of order in the input event stream.
     * 
     */
    public Output</* @Nullable */ String> getEventsOutOfOrderPolicy() {
        return this.eventsOutOfOrderPolicy;
    }
    /**
     * A list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    @Export(name="functions", type=List.class, parameters={FunctionResponse.class})
    private Output</* @Nullable */ List<FunctionResponse>> functions;

    /**
     * @return A list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    public Output</* @Nullable */ List<FunctionResponse>> getFunctions() {
        return this.functions;
    }
    /**
     * A list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     * 
     */
    @Export(name="inputs", type=List.class, parameters={InputResponse.class})
    private Output</* @Nullable */ List<InputResponse>> inputs;

    /**
     * @return A list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     * 
     */
    public Output</* @Nullable */ List<InputResponse>> getInputs() {
        return this.inputs;
    }
    /**
     * A GUID uniquely identifying the streaming job. This GUID is generated upon creation of the streaming job.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return A GUID uniquely identifying the streaming job. This GUID is generated upon creation of the streaming job.
     * 
     */
    public Output<String> getJobId() {
        return this.jobId;
    }
    /**
     * Describes the state of the streaming job.
     * 
     */
    @Export(name="jobState", type=String.class, parameters={})
    private Output<String> jobState;

    /**
     * @return Describes the state of the streaming job.
     * 
     */
    public Output<String> getJobState() {
        return this.jobState;
    }
    /**
     * Value is either an ISO-8601 formatted timestamp indicating the last output event time of the streaming job or null indicating that output has not yet been produced. In case of multiple outputs or multiple streams, this shows the latest value in that set.
     * 
     */
    @Export(name="lastOutputEventTime", type=String.class, parameters={})
    private Output<String> lastOutputEventTime;

    /**
     * @return Value is either an ISO-8601 formatted timestamp indicating the last output event time of the streaming job or null indicating that output has not yet been produced. In case of multiple outputs or multiple streams, this shows the latest value in that set.
     * 
     */
    public Output<String> getLastOutputEventTime() {
        return this.lastOutputEventTime;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
     * Indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size).
     * 
     */
    @Export(name="outputErrorPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputErrorPolicy;

    /**
     * @return Indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size).
     * 
     */
    public Output</* @Nullable */ String> getOutputErrorPolicy() {
        return this.outputErrorPolicy;
    }
    /**
     * This property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time.
     * 
     */
    @Export(name="outputStartMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputStartMode;

    /**
     * @return This property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time.
     * 
     */
    public Output</* @Nullable */ String> getOutputStartMode() {
        return this.outputStartMode;
    }
    /**
     * Value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     * 
     */
    @Export(name="outputStartTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputStartTime;

    /**
     * @return Value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     * 
     */
    public Output</* @Nullable */ String> getOutputStartTime() {
        return this.outputStartTime;
    }
    /**
     * A list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     * 
     */
    @Export(name="outputs", type=List.class, parameters={OutputResponse.class})
    private Output</* @Nullable */ List<OutputResponse>> outputs;

    /**
     * @return A list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     * 
     */
    public Output</* @Nullable */ List<OutputResponse>> getOutputs() {
        return this.outputs;
    }
    /**
     * Describes the provisioning status of the streaming job.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Describes the provisioning status of the streaming job.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    @Export(name="transformation", type=TransformationResponse.class, parameters={})
    private Output</* @Nullable */ TransformationResponse> transformation;

    /**
     * @return Indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    public Output</* @Nullable */ TransformationResponse> getTransformation() {
        return this.transformation;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(StreamingJobArgs.Builder a);
    }
    private static io.pulumi.azurenative.streamanalytics.StreamingJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.streamanalytics.StreamingJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StreamingJob(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamingJob(String name) {
        this(name, StreamingJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamingJob(String name, StreamingJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamingJob(String name, StreamingJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:StreamingJob", name, args == null ? StreamingJobArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private StreamingJob(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:StreamingJob", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20160301:StreamingJob").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20170401preview:StreamingJob").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20200301:StreamingJob").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20211001preview:StreamingJob").build())
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
    public static StreamingJob get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StreamingJob(name, id, options);
    }
}
