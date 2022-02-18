// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
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
    @OutputExport(name="name", type=String.class, parameters={})
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
    @OutputExport(name="project", type=String.class, parameters={})
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
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Location(String name, @Nullable LocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/location:Location", name, args == null ? LocationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Location(String name, Input<String> id, @Nullable LocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/location:Location", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Location get(String name, Input<String> id, @Nullable LocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Location(name, id, state, options);
    }
}
