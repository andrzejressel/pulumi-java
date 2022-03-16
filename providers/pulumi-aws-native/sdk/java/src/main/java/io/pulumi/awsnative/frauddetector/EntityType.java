// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.frauddetector.EntityTypeArgs;
import io.pulumi.awsnative.frauddetector.outputs.EntityTypeTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An entity type for fraud detector.
 * 
 */
@ResourceType(type="aws-native:frauddetector:EntityType")
public class EntityType extends io.pulumi.resources.CustomResource {
    /**
     * The entity type ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The entity type ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The timestamp when the entity type was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The timestamp when the entity type was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The entity type description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The entity type description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The timestamp when the entity type was last updated.
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return The timestamp when the entity type was last updated.
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * The name of the entity type.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the entity type.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Tags associated with this entity type.
     * 
     */
    @Export(name="tags", type=List.class, parameters={EntityTypeTag.class})
    private Output</* @Nullable */ List<EntityTypeTag>> tags;

    /**
     * @return Tags associated with this entity type.
     * 
     */
    public Output</* @Nullable */ List<EntityTypeTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable EntityTypeArgs.Builder a);
    }
    private static io.pulumi.awsnative.frauddetector.EntityTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.frauddetector.EntityTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EntityType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EntityType(String name) {
        this(name, EntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntityType(String name, @Nullable EntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityType(String name, @Nullable EntityTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:EntityType", name, args == null ? EntityTypeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EntityType(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:EntityType", name, null, makeResourceOptions(options, id));
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
    public static EntityType get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EntityType(name, id, options);
    }
}
