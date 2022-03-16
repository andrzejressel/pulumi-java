// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.workflowexecutions_v1beta.ExecutionArgs;
import io.pulumi.googlenative.workflowexecutions_v1beta.outputs.ErrorResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new execution using the latest revision of the given workflow.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:workflowexecutions/v1beta:Execution")
public class Execution extends io.pulumi.resources.CustomResource {
    /**
     * Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `'{"argument":"{\"firstName\":\"FIRST\",\"lastName\":\"LAST\"}"}'`
     * 
     */
    @Export(name="argument", type=String.class, parameters={})
    private Output<String> argument;

    /**
     * @return Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `'{"argument":"{\"firstName\":\"FIRST\",\"lastName\":\"LAST\"}"}'`
     * 
     */
    public Output<String> getArgument() {
        return this.argument;
    }
    /**
     * The call logging level associated to this execution.
     * 
     */
    @Export(name="callLogLevel", type=String.class, parameters={})
    private Output<String> callLogLevel;

    /**
     * @return The call logging level associated to this execution.
     * 
     */
    public Output<String> getCallLogLevel() {
        return this.callLogLevel;
    }
    /**
     * Marks the end of execution, successful or not.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return Marks the end of execution, successful or not.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The error which caused the execution to finish prematurely. The value is only present if the execution's state is `FAILED` or `CANCELLED`.
     * 
     */
    @Export(name="error", type=ErrorResponse.class, parameters={})
    private Output<ErrorResponse> error;

    /**
     * @return The error which caused the execution to finish prematurely. The value is only present if the execution's state is `FAILED` or `CANCELLED`.
     * 
     */
    public Output<ErrorResponse> getError() {
        return this.error;
    }
    /**
     * The resource name of the execution. Format: projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the execution. Format: projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Output of the execution represented as a JSON string. The value can only be present if the execution's state is `SUCCEEDED`.
     * 
     */
    @Export(name="result", type=String.class, parameters={})
    private Output<String> result;

    /**
     * @return Output of the execution represented as a JSON string. The value can only be present if the execution's state is `SUCCEEDED`.
     * 
     */
    public Output<String> getResult() {
        return this.result;
    }
    /**
     * Marks the beginning of execution.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Marks the beginning of execution.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * Current state of the execution.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the execution.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Revision of the workflow this execution is using.
     * 
     */
    @Export(name="workflowRevisionId", type=String.class, parameters={})
    private Output<String> workflowRevisionId;

    /**
     * @return Revision of the workflow this execution is using.
     * 
     */
    public Output<String> getWorkflowRevisionId() {
        return this.workflowRevisionId;
    }

    public interface BuilderApplicator {
        public void apply(ExecutionArgs.Builder a);
    }
    private static io.pulumi.googlenative.workflowexecutions_v1beta.ExecutionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.workflowexecutions_v1beta.ExecutionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Execution(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Execution(String name) {
        this(name, ExecutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Execution(String name, ExecutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Execution(String name, ExecutionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:workflowexecutions/v1beta:Execution", name, args == null ? ExecutionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Execution(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:workflowexecutions/v1beta:Execution", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Execution get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Execution(name, id, options);
    }
}
