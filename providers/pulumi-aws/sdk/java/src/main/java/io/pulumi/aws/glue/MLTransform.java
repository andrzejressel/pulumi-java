// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.MLTransformArgs;
import io.pulumi.aws.glue.inputs.MLTransformState;
import io.pulumi.aws.glue.outputs.MLTransformInputRecordTable;
import io.pulumi.aws.glue.outputs.MLTransformParameters;
import io.pulumi.aws.glue.outputs.MLTransformSchema;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Glue ML Transform resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue ML Transforms can be imported using `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/mLTransform:MLTransform example tfm-c2cafbe83b1c575f49eaca9939220e2fcd58e2d5
 * ```
 * 
 */
@ResourceType(type="aws:glue/mLTransform:MLTransform")
public class MLTransform extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of Glue ML Transform.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of Glue ML Transform.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of the ML Transform.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the ML Transform.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
     * 
     */
    @Export(name="glueVersion", type=String.class, parameters={})
    private Output<String> glueVersion;

    /**
     * @return The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
     * 
     */
    public Output<String> getGlueVersion() {
        return this.glueVersion;
    }
    /**
     * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
     * 
     */
    @Export(name="inputRecordTables", type=List.class, parameters={MLTransformInputRecordTable.class})
    private Output<List<MLTransformInputRecordTable>> inputRecordTables;

    /**
     * @return A list of AWS Glue table definitions used by the transform. see Input Record Tables.
     * 
     */
    public Output<List<MLTransformInputRecordTable>> getInputRecordTables() {
        return this.inputRecordTables;
    }
    /**
     * The number of labels available for this transform.
     * 
     */
    @Export(name="labelCount", type=Integer.class, parameters={})
    private Output<Integer> labelCount;

    /**
     * @return The number of labels available for this transform.
     * 
     */
    public Output<Integer> getLabelCount() {
        return this.labelCount;
    }
    /**
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `max_capacity` is a mutually exclusive option with `number_of_workers` and `worker_type`.
     * 
     */
    @Export(name="maxCapacity", type=Double.class, parameters={})
    private Output<Double> maxCapacity;

    /**
     * @return The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `max_capacity` is a mutually exclusive option with `number_of_workers` and `worker_type`.
     * 
     */
    public Output<Double> getMaxCapacity() {
        return this.maxCapacity;
    }
    /**
     * The maximum number of times to retry this ML Transform if it fails.
     * 
     */
    @Export(name="maxRetries", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxRetries;

    /**
     * @return The maximum number of times to retry this ML Transform if it fails.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxRetries() {
        return this.maxRetries;
    }
    /**
     * The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of workers of a defined `worker_type` that are allocated when an ML Transform runs. Required with `worker_type`.
     * 
     */
    @Export(name="numberOfWorkers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfWorkers;

    /**
     * @return The number of workers of a defined `worker_type` that are allocated when an ML Transform runs. Required with `worker_type`.
     * 
     */
    public Output</* @Nullable */ Integer> getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    /**
     * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
     * 
     */
    @Export(name="parameters", type=MLTransformParameters.class, parameters={})
    private Output<MLTransformParameters> parameters;

    /**
     * @return The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
     * 
     */
    public Output<MLTransformParameters> getParameters() {
        return this.parameters;
    }
    /**
     * The ARN of the IAM role associated with this ML Transform.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM role associated with this ML Transform.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * The object that represents the schema that this transform accepts. see Schema.
     * 
     */
    @Export(name="schemas", type=List.class, parameters={MLTransformSchema.class})
    private Output<List<MLTransformSchema>> schemas;

    /**
     * @return The object that represents the schema that this transform accepts. see Schema.
     * 
     */
    public Output<List<MLTransformSchema>> getSchemas() {
        return this.schemas;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
     * 
     */
    @Export(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
     * 
     */
    public Output</* @Nullable */ Integer> getTimeout() {
        return this.timeout;
    }
    /**
     * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `number_of_workers`.
     * 
     */
    @Export(name="workerType", type=String.class, parameters={})
    private Output</* @Nullable */ String> workerType;

    /**
     * @return The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `number_of_workers`.
     * 
     */
    public Output</* @Nullable */ String> getWorkerType() {
        return this.workerType;
    }

    public interface BuilderApplicator {
        public void apply(MLTransformArgs.Builder a);
    }
    private static io.pulumi.aws.glue.MLTransformArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glue.MLTransformArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MLTransform(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MLTransform(String name) {
        this(name, MLTransformArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MLTransform(String name, MLTransformArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MLTransform(String name, MLTransformArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/mLTransform:MLTransform", name, args == null ? MLTransformArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MLTransform(String name, Output<String> id, @Nullable MLTransformState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/mLTransform:MLTransform", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MLTransform get(String name, Output<String> id, @Nullable MLTransformState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MLTransform(name, id, state, options);
    }
}
