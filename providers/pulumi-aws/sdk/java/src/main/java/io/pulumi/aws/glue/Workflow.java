// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.WorkflowArgs;
import io.pulumi.aws.glue.inputs.WorkflowState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Glue Workflow resource.
 * The workflow graph (DAG) can be build using the `aws.glue.Trigger` resource.
 * See the example below for creating a graph with four nodes (two triggers and two jobs).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Workflows can be imported using `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/workflow:Workflow MyWorkflow MyWorkflow
 * ```
 * 
 */
@ResourceType(type="aws:glue/workflow:Workflow")
public class Workflow extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of Glue Workflow
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of Glue Workflow
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
     * 
     */
    @Export(name="defaultRunProperties", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> defaultRunProperties;

    /**
     * @return A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getDefaultRunProperties() {
        return this.defaultRunProperties;
    }
    /**
     * Description of the workflow.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the workflow.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
     * 
     */
    @Export(name="maxConcurrentRuns", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxConcurrentRuns;

    /**
     * @return Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxConcurrentRuns() {
        return this.maxConcurrentRuns;
    }
    /**
     * The name you assign to this workflow.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name you assign to this workflow.
     * 
     */
    public Output<String> getName() {
        return this.name;
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

    public interface BuilderApplicator {
        public void apply(@Nullable WorkflowArgs.Builder a);
    }
    private static io.pulumi.aws.glue.WorkflowArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glue.WorkflowArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Workflow(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, @Nullable WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, @Nullable WorkflowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/workflow:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable WorkflowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/workflow:Workflow", name, state, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable WorkflowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, state, options);
    }
}
