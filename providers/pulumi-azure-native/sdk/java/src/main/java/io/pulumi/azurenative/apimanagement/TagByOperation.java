// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.TagByOperationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Tag Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:TagByOperation tagId1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/tags/tagId1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:TagByOperation")
public class TagByOperation extends io.pulumi.resources.CustomResource {
    /**
     * Tag name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Tag name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(TagByOperationArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.TagByOperationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.TagByOperationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TagByOperation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagByOperation(String name) {
        this(name, TagByOperationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagByOperation(String name, TagByOperationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagByOperation(String name, TagByOperationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:TagByOperation", name, args == null ? TagByOperationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TagByOperation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:TagByOperation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:TagByOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:TagByOperation").build())
            ))
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
    public static TagByOperation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagByOperation(name, id, options);
    }
}
