// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azureactivedirectory.GuestUsageArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Guest Usages Resource
 * API Version: 2020-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azureactivedirectory:GuestUsage contoso.onmicrosoft.com /subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/resourceGroups/contosoResourceGroup/providers/Microsoft.AzureActiveDirectory/guestUsages/contoso.onmicrosoft.com 
 * ```
 * 
 */
@ResourceType(type="azure-native:azureactivedirectory:GuestUsage")
public class GuestUsage extends io.pulumi.resources.CustomResource {
    /**
     * Location of the Guest Usages resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the Guest Usages resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the Guest Usages resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Guest Usages resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * An identifier for the tenant for which the resource is being created
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return An identifier for the tenant for which the resource is being created
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of the Guest Usages resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the Guest Usages resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(GuestUsageArgs.Builder a);
    }
    private static io.pulumi.azurenative.azureactivedirectory.GuestUsageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.azureactivedirectory.GuestUsageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GuestUsage(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestUsage(String name) {
        this(name, GuestUsageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestUsage(String name, GuestUsageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestUsage(String name, GuestUsageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azureactivedirectory:GuestUsage", name, args == null ? GuestUsageArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private GuestUsage(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azureactivedirectory:GuestUsage", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:azureactivedirectory/v20200501preview:GuestUsage").build())
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
    public static GuestUsage get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GuestUsage(name, id, options);
    }
}
