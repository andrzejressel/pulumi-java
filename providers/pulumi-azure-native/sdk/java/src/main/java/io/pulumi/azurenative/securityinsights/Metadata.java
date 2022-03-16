// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.MetadataArgs;
import io.pulumi.azurenative.securityinsights.outputs.MetadataAuthorResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataCategoriesResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataDependenciesResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataSourceResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataSupportResponse;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Metadata resource definition.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:Metadata metadataName /subscriptions/2e1dc338-d04d-4443-b721-037eff4fdcac/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/metadata/metadataName 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:Metadata")
public class Metadata extends io.pulumi.resources.CustomResource {
    /**
     * The creator of the content item.
     * 
     */
    @Export(name="author", type=MetadataAuthorResponse.class, parameters={})
    private Output</* @Nullable */ MetadataAuthorResponse> author;

    /**
     * @return The creator of the content item.
     * 
     */
    public Output</* @Nullable */ MetadataAuthorResponse> getAuthor() {
        return this.author;
    }
    /**
     * Categories for the solution content item
     * 
     */
    @Export(name="categories", type=MetadataCategoriesResponse.class, parameters={})
    private Output</* @Nullable */ MetadataCategoriesResponse> categories;

    /**
     * @return Categories for the solution content item
     * 
     */
    public Output</* @Nullable */ MetadataCategoriesResponse> getCategories() {
        return this.categories;
    }
    /**
     * Static ID for the content.  Used to identify dependencies and content from solutions or community.  Hard-coded/static for out of the box content and solutions. Dynamic for user-created.  This is the resource name
     * 
     */
    @Export(name="contentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentId;

    /**
     * @return Static ID for the content.  Used to identify dependencies and content from solutions or community.  Hard-coded/static for out of the box content and solutions. Dynamic for user-created.  This is the resource name
     * 
     */
    public Output</* @Nullable */ String> getContentId() {
        return this.contentId;
    }
    /**
     * Dependencies for the content item, what other content items it requires to work.  Can describe more complex dependencies using a recursive/nested structure. For a single dependency an id/kind/version can be supplied or operator/criteria for complex formats.
     * 
     */
    @Export(name="dependencies", type=MetadataDependenciesResponse.class, parameters={})
    private Output</* @Nullable */ MetadataDependenciesResponse> dependencies;

    /**
     * @return Dependencies for the content item, what other content items it requires to work.  Can describe more complex dependencies using a recursive/nested structure. For a single dependency an id/kind/version can be supplied or operator/criteria for complex formats.
     * 
     */
    public Output</* @Nullable */ MetadataDependenciesResponse> getDependencies() {
        return this.dependencies;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * first publish date solution content item
     * 
     */
    @Export(name="firstPublishDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> firstPublishDate;

    /**
     * @return first publish date solution content item
     * 
     */
    public Output</* @Nullable */ String> getFirstPublishDate() {
        return this.firstPublishDate;
    }
    /**
     * The kind of content the metadata is for.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of content the metadata is for.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * last publish date for the solution content item
     * 
     */
    @Export(name="lastPublishDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastPublishDate;

    /**
     * @return last publish date for the solution content item
     * 
     */
    public Output</* @Nullable */ String> getLastPublishDate() {
        return this.lastPublishDate;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Full parent resource ID of the content item the metadata is for.  This is the full resource ID including the scope (subscription and resource group)
     * 
     */
    @Export(name="parentId", type=String.class, parameters={})
    private Output<String> parentId;

    /**
     * @return Full parent resource ID of the content item the metadata is for.  This is the full resource ID including the scope (subscription and resource group)
     * 
     */
    public Output<String> getParentId() {
        return this.parentId;
    }
    /**
     * Providers for the solution content item
     * 
     */
    @Export(name="providers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> providers;

    /**
     * @return Providers for the solution content item
     * 
     */
    public Output</* @Nullable */ List<String>> getProviders() {
        return this.providers;
    }
    /**
     * Source of the content.  This is where/how it was created.
     * 
     */
    @Export(name="source", type=MetadataSourceResponse.class, parameters={})
    private Output</* @Nullable */ MetadataSourceResponse> source;

    /**
     * @return Source of the content.  This is where/how it was created.
     * 
     */
    public Output</* @Nullable */ MetadataSourceResponse> getSource() {
        return this.source;
    }
    /**
     * Support information for the metadata - type, name, contact information
     * 
     */
    @Export(name="support", type=MetadataSupportResponse.class, parameters={})
    private Output</* @Nullable */ MetadataSupportResponse> support;

    /**
     * @return Support information for the metadata - type, name, contact information
     * 
     */
    public Output</* @Nullable */ MetadataSupportResponse> getSupport() {
        return this.support;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Version of the content.  Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0, 1.0.0.0), following ARM template best practices.  Can also be any string, but then we cannot guarantee any version checks
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Version of the content.  Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0, 1.0.0.0), following ARM template best practices.  Can also be any string, but then we cannot guarantee any version checks
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(MetadataArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.MetadataArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.MetadataArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Metadata(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Metadata(String name) {
        this(name, MetadataArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Metadata(String name, MetadataArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Metadata(String name, MetadataArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Metadata", name, args == null ? MetadataArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Metadata(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Metadata", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:Metadata").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:Metadata").build())
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
    public static Metadata get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Metadata(name, id, options);
    }
}
