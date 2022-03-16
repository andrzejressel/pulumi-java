// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.LocationArgs;
import io.pulumi.gcp.notebooks.inputs.LocationState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a Location resource.
 * 
 * ## Import
 * 
 * Location can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/location:Location default projects/{{project}}/locations/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/location:Location default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/location:Location default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:notebooks/location:Location")
public class Location extends io.pulumi.resources.CustomResource {
    /**
     * Name of the Location resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Location resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable LocationArgs.Builder a);
    }
    private static io.pulumi.gcp.notebooks.LocationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.notebooks.LocationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Location(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Location(String name) {
        this(name, LocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Location(String name, @Nullable LocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Location(String name, @Nullable LocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/location:Location", name, args == null ? LocationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Location(String name, Output<String> id, @Nullable LocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/location:Location", name, state, makeResourceOptions(options, id));
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
    public static Location get(String name, Output<String> id, @Nullable LocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Location(name, id, state, options);
    }
}
