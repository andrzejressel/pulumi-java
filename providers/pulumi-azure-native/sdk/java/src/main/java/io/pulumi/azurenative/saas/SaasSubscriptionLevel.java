// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.saas.SaasSubscriptionLevelArgs;
import io.pulumi.azurenative.saas.outputs.SaasResourceResponseProperties;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * SaaS REST API resource definition.
 * API Version: 2018-03-01-beta.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:saas:SaasSubscriptionLevel MyContosoSubscription /subscriptions/c825645b-e31b-9cf4-1cee-2aba9e58bc7c/resourceGroups/my-saas-rg/providers/Microsoft.SaaS/resources/MyContosoSubscription 
 * ```
 * 
 */
@ResourceType(type="azure-native:saas:SaasSubscriptionLevel")
public class SaasSubscriptionLevel extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * saas properties
     * 
     */
    @Export(name="properties", type=SaasResourceResponseProperties.class, parameters={})
    private Output<SaasResourceResponseProperties> properties;

    /**
     * @return saas properties
     * 
     */
    public Output<SaasResourceResponseProperties> getProperties() {
        return this.properties;
    }
    /**
     * the resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return the resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SaasSubscriptionLevelArgs.Builder a);
    }
    private static io.pulumi.azurenative.saas.SaasSubscriptionLevelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.saas.SaasSubscriptionLevelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SaasSubscriptionLevel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SaasSubscriptionLevel(String name) {
        this(name, SaasSubscriptionLevelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SaasSubscriptionLevel(String name, SaasSubscriptionLevelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SaasSubscriptionLevel(String name, SaasSubscriptionLevelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:saas:SaasSubscriptionLevel", name, args == null ? SaasSubscriptionLevelArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SaasSubscriptionLevel(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:saas:SaasSubscriptionLevel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:saas/v20180301beta:SaasSubscriptionLevel").build())
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
    public static SaasSubscriptionLevel get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SaasSubscriptionLevel(name, id, options);
    }
}
