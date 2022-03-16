// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.docker.SecretArgs;
import io.pulumi.docker.Utilities;
import io.pulumi.docker.inputs.SecretState;
import io.pulumi.docker.outputs.SecretLabel;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Import is supported using the following syntax#!/bin/bash # Docker secret cannot be imported as the secret data, once set, is never exposed again.
 * 
 */
@ResourceType(type="docker:index/secret:Secret")
public class Secret extends io.pulumi.resources.CustomResource {
    /**
     * Base64-url-safe-encoded secret data
     * 
     */
    @Export(name="data", type=String.class, parameters={})
    private Output<String> data;

    /**
     * @return Base64-url-safe-encoded secret data
     * 
     */
    public Output<String> getData() {
        return this.data;
    }
    /**
     * User-defined key/value metadata
     * 
     */
    @Export(name="labels", type=List.class, parameters={SecretLabel.class})
    private Output</* @Nullable */ List<SecretLabel>> labels;

    /**
     * @return User-defined key/value metadata
     * 
     */
    public Output</* @Nullable */ List<SecretLabel>> getLabels() {
        return this.labels;
    }
    /**
     * User-defined name of the secret
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-defined name of the secret
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(SecretArgs.Builder a);
    }
    private static io.pulumi.docker.SecretArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.docker.SecretArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Secret(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Secret(String name) {
        this(name, SecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Secret(String name, SecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Secret(String name, SecretArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/secret:Secret", name, args == null ? SecretArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Secret(String name, Output<String> id, @Nullable SecretState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/secret:Secret", name, state, makeResourceOptions(options, id));
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
    public static Secret get(String name, Output<String> id, @Nullable SecretState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Secret(name, id, state, options);
    }
}
