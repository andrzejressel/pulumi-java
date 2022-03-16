// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar.submodule1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.foobar.Utilities;
import io.pulumi.foobar.outputs.TopLevel;
import io.pulumi.foobar.submodule1.ModuleResourceArgs;
import javax.annotation.Nullable;

@ResourceType(type="foo-bar:submodule1:ModuleResource")
public class ModuleResource extends io.pulumi.resources.CustomResource {
    @Export(name="thing", type=TopLevel.class, parameters={})
    private Output</* @Nullable */ TopLevel> thing;

    public Output</* @Nullable */ TopLevel> getThing() {
        return this.thing;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ModuleResourceArgs.Builder a);
    }
    private static io.pulumi.foobar.submodule1.ModuleResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.foobar.submodule1.ModuleResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ModuleResource(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModuleResource(String name) {
        this(name, ModuleResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModuleResource(String name, @Nullable ModuleResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModuleResource(String name, @Nullable ModuleResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("foo-bar:submodule1:ModuleResource", name, args == null ? ModuleResourceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ModuleResource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("foo-bar:submodule1:ModuleResource", name, null, makeResourceOptions(options, id));
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
    public static ModuleResource get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModuleResource(name, id, options);
    }
}
