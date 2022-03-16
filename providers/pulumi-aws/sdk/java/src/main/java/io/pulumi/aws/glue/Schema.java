// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.SchemaArgs;
import io.pulumi.aws.glue.inputs.SchemaState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Glue Schema resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Registries can be imported using `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/schema:Schema example arn:aws:glue:us-west-2:123456789012:schema/example/example
 * ```
 * 
 */
@ResourceType(type="aws:glue/schema:Schema")
public class Schema extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the schema.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the schema.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The compatibility mode of the schema. Values values are: `NONE`, `DISABLED`, `BACKWARD`, `BACKWARD_ALL`, `FORWARD`, `FORWARD_ALL`, `FULL`, and `FULL_ALL`.
     * 
     */
    @Export(name="compatibility", type=String.class, parameters={})
    private Output<String> compatibility;

    /**
     * @return The compatibility mode of the schema. Values values are: `NONE`, `DISABLED`, `BACKWARD`, `BACKWARD_ALL`, `FORWARD`, `FORWARD_ALL`, `FULL`, and `FULL_ALL`.
     * 
     */
    public Output<String> getCompatibility() {
        return this.compatibility;
    }
    /**
     * The data format of the schema definition. Valid values are `AVRO` and `JSON`.
     * 
     */
    @Export(name="dataFormat", type=String.class, parameters={})
    private Output<String> dataFormat;

    /**
     * @return The data format of the schema definition. Valid values are `AVRO` and `JSON`.
     * 
     */
    public Output<String> getDataFormat() {
        return this.dataFormat;
    }
    /**
     * A description of the schema.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the schema.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The latest version of the schema associated with the returned schema definition.
     * 
     */
    @Export(name="latestSchemaVersion", type=Integer.class, parameters={})
    private Output<Integer> latestSchemaVersion;

    /**
     * @return The latest version of the schema associated with the returned schema definition.
     * 
     */
    public Output<Integer> getLatestSchemaVersion() {
        return this.latestSchemaVersion;
    }
    /**
     * The next version of the schema associated with the returned schema definition.
     * 
     */
    @Export(name="nextSchemaVersion", type=Integer.class, parameters={})
    private Output<Integer> nextSchemaVersion;

    /**
     * @return The next version of the schema associated with the returned schema definition.
     * 
     */
    public Output<Integer> getNextSchemaVersion() {
        return this.nextSchemaVersion;
    }
    /**
     * The ARN of the Glue Registry to create the schema in.
     * 
     */
    @Export(name="registryArn", type=String.class, parameters={})
    private Output<String> registryArn;

    /**
     * @return The ARN of the Glue Registry to create the schema in.
     * 
     */
    public Output<String> getRegistryArn() {
        return this.registryArn;
    }
    /**
     * The name of the Glue Registry.
     * 
     */
    @Export(name="registryName", type=String.class, parameters={})
    private Output<String> registryName;

    /**
     * @return The name of the Glue Registry.
     * 
     */
    public Output<String> getRegistryName() {
        return this.registryName;
    }
    /**
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * 
     */
    @Export(name="schemaCheckpoint", type=Integer.class, parameters={})
    private Output<Integer> schemaCheckpoint;

    /**
     * @return The version number of the checkpoint (the last time the compatibility mode was changed).
     * 
     */
    public Output<Integer> getSchemaCheckpoint() {
        return this.schemaCheckpoint;
    }
    /**
     * The schema definition using the `data_format` setting for `schema_name`.
     * 
     */
    @Export(name="schemaDefinition", type=String.class, parameters={})
    private Output<String> schemaDefinition;

    /**
     * @return The schema definition using the `data_format` setting for `schema_name`.
     * 
     */
    public Output<String> getSchemaDefinition() {
        return this.schemaDefinition;
    }
    /**
     * The Name of the schema.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return The Name of the schema.
     * 
     */
    public Output<String> getSchemaName() {
        return this.schemaName;
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
        public void apply(SchemaArgs.Builder a);
    }
    private static io.pulumi.aws.glue.SchemaArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glue.SchemaArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Schema(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, SchemaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/schema:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Schema(String name, Output<String> id, @Nullable SchemaState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/schema:Schema", name, state, makeResourceOptions(options, id));
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
    public static Schema get(String name, Output<String> id, @Nullable SchemaState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, state, options);
    }
}
