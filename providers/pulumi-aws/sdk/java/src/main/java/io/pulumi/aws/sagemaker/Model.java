// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.ModelArgs;
import io.pulumi.aws.sagemaker.inputs.ModelState;
import io.pulumi.aws.sagemaker.outputs.ModelContainer;
import io.pulumi.aws.sagemaker.outputs.ModelInferenceExecutionConfig;
import io.pulumi.aws.sagemaker.outputs.ModelPrimaryContainer;
import io.pulumi.aws.sagemaker.outputs.ModelVpcConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a SageMaker model resource.
 * 
 * ## Example Usage
 * ## Inference Execution Config
 * 
 * * `mode` - (Required) How containers in a multi-container are run. The following values are valid `Serial` and `Direct`.
 * 
 * ## Import
 * 
 * Models can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/model:Model test_model model-foo
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/model:Model")
public class Model extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this model.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this model.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
     * 
     */
    @Export(name="containers", type=List.class, parameters={ModelContainer.class})
    private Output</* @Nullable */ List<ModelContainer>> containers;

    /**
     * @return Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
     * 
     */
    public Output</* @Nullable */ List<ModelContainer>> getContainers() {
        return this.containers;
    }
    /**
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * 
     */
    @Export(name="enableNetworkIsolation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableNetworkIsolation;

    /**
     * @return Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }
    /**
     * A role that SageMaker can assume to access model artifacts and docker images for deployment.
     * 
     */
    @Export(name="executionRoleArn", type=String.class, parameters={})
    private Output<String> executionRoleArn;

    /**
     * @return A role that SageMaker can assume to access model artifacts and docker images for deployment.
     * 
     */
    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
     * 
     */
    @Export(name="inferenceExecutionConfig", type=ModelInferenceExecutionConfig.class, parameters={})
    private Output<ModelInferenceExecutionConfig> inferenceExecutionConfig;

    /**
     * @return Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
     * 
     */
    public Output<ModelInferenceExecutionConfig> getInferenceExecutionConfig() {
        return this.inferenceExecutionConfig;
    }
    /**
     * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * 
     */
    @Export(name="primaryContainer", type=ModelPrimaryContainer.class, parameters={})
    private Output</* @Nullable */ ModelPrimaryContainer> primaryContainer;

    /**
     * @return The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * 
     */
    public Output</* @Nullable */ ModelPrimaryContainer> getPrimaryContainer() {
        return this.primaryContainer;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
     * 
     */
    @Export(name="vpcConfig", type=ModelVpcConfig.class, parameters={})
    private Output</* @Nullable */ ModelVpcConfig> vpcConfig;

    /**
     * @return Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
     * 
     */
    public Output</* @Nullable */ ModelVpcConfig> getVpcConfig() {
        return this.vpcConfig;
    }

    public interface BuilderApplicator {
        public void apply(ModelArgs.Builder a);
    }
    private static io.pulumi.aws.sagemaker.ModelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.sagemaker.ModelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Model(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Model(String name) {
        this(name, ModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Model(String name, ModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Model(String name, ModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/model:Model", name, args == null ? ModelArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Model(String name, Output<String> id, @Nullable ModelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/model:Model", name, state, makeResourceOptions(options, id));
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
    public static Model get(String name, Output<String> id, @Nullable ModelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Model(name, id, state, options);
    }
}
