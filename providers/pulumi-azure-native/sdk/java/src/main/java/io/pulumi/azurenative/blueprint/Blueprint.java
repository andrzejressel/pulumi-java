// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.BlueprintArgs;
import io.pulumi.azurenative.blueprint.outputs.BlueprintStatusResponse;
import io.pulumi.azurenative.blueprint.outputs.ParameterDefinitionResponse;
import io.pulumi.azurenative.blueprint.outputs.ResourceGroupDefinitionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a Blueprint definition.
 * API Version: 2018-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blueprint:Blueprint simpleBlueprint /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprints/simpleBlueprint 
 * ```
 * 
 */
@ResourceType(type="azure-native:blueprint:Blueprint")
public class Blueprint extends io.pulumi.resources.CustomResource {
    /**
     * Multi-line explain this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * One-liner string explain this resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Layout view of the blueprint definition for UI reference.
     * 
     */
    @Export(name="layout", type=Object.class, parameters={})
    private Output<Object> layout;

    /**
     * @return Layout view of the blueprint definition for UI reference.
     * 
     */
    public Output<Object> getLayout() {
        return this.layout;
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Parameters required by this blueprint definition.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, ParameterDefinitionResponse.class})
    private Output</* @Nullable */ Map<String,ParameterDefinitionResponse>> parameters;

    /**
     * @return Parameters required by this blueprint definition.
     * 
     */
    public Output</* @Nullable */ Map<String,ParameterDefinitionResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    @Export(name="resourceGroups", type=Map.class, parameters={String.class, ResourceGroupDefinitionResponse.class})
    private Output</* @Nullable */ Map<String,ResourceGroupDefinitionResponse>> resourceGroups;

    /**
     * @return Resource group placeholders defined by this blueprint definition.
     * 
     */
    public Output</* @Nullable */ Map<String,ResourceGroupDefinitionResponse>> getResourceGroups() {
        return this.resourceGroups;
    }
    /**
     * Status of the blueprint. This field is readonly.
     * 
     */
    @Export(name="status", type=BlueprintStatusResponse.class, parameters={})
    private Output<BlueprintStatusResponse> status;

    /**
     * @return Status of the blueprint. This field is readonly.
     * 
     */
    public Output<BlueprintStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * The scope where this blueprint definition can be assigned.
     * 
     */
    @Export(name="targetScope", type=String.class, parameters={})
    private Output<String> targetScope;

    /**
     * @return The scope where this blueprint definition can be assigned.
     * 
     */
    public Output<String> getTargetScope() {
        return this.targetScope;
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Published versions of this blueprint definition.
     * 
     */
    @Export(name="versions", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> versions;

    /**
     * @return Published versions of this blueprint definition.
     * 
     */
    public Output</* @Nullable */ Object> getVersions() {
        return this.versions;
    }

    public interface BuilderApplicator {
        public void apply(BlueprintArgs.Builder a);
    }
    private static io.pulumi.azurenative.blueprint.BlueprintArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.blueprint.BlueprintArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Blueprint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Blueprint(String name) {
        this(name, BlueprintArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Blueprint(String name, BlueprintArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Blueprint(String name, BlueprintArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:Blueprint", name, args == null ? BlueprintArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Blueprint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:Blueprint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:blueprint/v20181101preview:Blueprint").build())
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
    public static Blueprint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Blueprint(name, id, options);
    }
}
