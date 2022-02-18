// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.composer.EnvironmentArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentState;
import io.pulumi.gcp.composer.outputs.EnvironmentConfig;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Environment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:composer/environment:Environment default projects/{{project}}/locations/{{region}}/environments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:composer/environment:Environment default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:composer/environment:Environment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:composer/environment:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * Configuration parameters for this environment.
     * 
     */
    @OutputExport(name="config", type=EnvironmentConfig.class, parameters={})
    private Output<EnvironmentConfig> config;

    /**
     * @return Configuration parameters for this environment.
     * 
     */
    public Output<EnvironmentConfig> getConfig() {
        return this.config;
    }
    /**
     * User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
     * are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
     * must conform to the following regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
     * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No more than 64 labels can be
     * associated with a given environment. Both keys and values must be <= 128 bytes in size.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
     * are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
     * must conform to the following regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
     * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No more than 64 labels can be
     * associated with a given environment. Both keys and values must be <= 128 bytes in size.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the environment.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the environment.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The location or Compute Engine region for the environment.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The location or Compute Engine region for the environment.
     * 
     */
    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, @Nullable EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:composer/environment:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Environment(String name, Input<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:composer/environment:Environment", name, state, makeResourceOptions(options, id));
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
    public static Environment get(String name, Input<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, state, options);
    }
}
