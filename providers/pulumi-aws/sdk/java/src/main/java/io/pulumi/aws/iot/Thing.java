// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iot.ThingArgs;
import io.pulumi.aws.iot.inputs.ThingState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS IoT Thing.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IOT Things can be imported using the name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iot/thing:Thing example example
 * ```
 * 
 */
@ResourceType(type="aws:iot/thing:Thing")
public class Thing extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the thing.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the thing.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Map of attributes of the thing.
     * 
     */
    @Export(name="attributes", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> attributes;

    /**
     * @return Map of attributes of the thing.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getAttributes() {
        return this.attributes;
    }
    /**
     * The default client ID.
     * 
     */
    @Export(name="defaultClientId", type=String.class, parameters={})
    private Output<String> defaultClientId;

    /**
     * @return The default client ID.
     * 
     */
    public Output<String> getDefaultClientId() {
        return this.defaultClientId;
    }
    /**
     * The name of the thing.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the thing.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The thing type name.
     * 
     */
    @Export(name="thingTypeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> thingTypeName;

    /**
     * @return The thing type name.
     * 
     */
    public Output</* @Nullable */ String> getThingTypeName() {
        return this.thingTypeName;
    }
    /**
     * The current version of the thing record in the registry.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The current version of the thing record in the registry.
     * 
     */
    public Output<Integer> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ThingArgs.Builder a);
    }
    private static io.pulumi.aws.iot.ThingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iot.ThingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Thing(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Thing(String name) {
        this(name, ThingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Thing(String name, @Nullable ThingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Thing(String name, @Nullable ThingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thing:Thing", name, args == null ? ThingArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Thing(String name, Output<String> id, @Nullable ThingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thing:Thing", name, state, makeResourceOptions(options, id));
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
    public static Thing get(String name, Output<String> id, @Nullable ThingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Thing(name, id, state, options);
    }
}
