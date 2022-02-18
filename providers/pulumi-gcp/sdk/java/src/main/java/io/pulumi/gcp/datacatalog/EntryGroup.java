// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.EntryGroupArgs;
import io.pulumi.gcp.datacatalog.inputs.EntryGroupState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An EntryGroup resource represents a logical grouping of zero or more Data Catalog Entry resources.
 * 
 * To get more information about EntryGroup, see:
 * 
 * * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-catalog/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EntryGroup can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/entryGroup:EntryGroup default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datacatalog/entryGroup:EntryGroup")
public class EntryGroup extends io.pulumi.resources.CustomResource {
    /**
     * Entry group description, which can consist of several sentences or paragraphs that describe entry group contents.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Entry group description, which can consist of several sentences or paragraphs that describe entry group contents.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A short name to identify the entry group, for example, "analytics data - jan 2011".
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A short name to identify the entry group, for example, "analytics data - jan 2011".
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The id of the entry group to create. The id must begin with a letter or underscore,
     * contain only English letters, numbers and underscores, and be at most 64 characters.
     * 
     */
    @OutputExport(name="entryGroupId", type=String.class, parameters={})
    private Output<String> entryGroupId;

    /**
     * @return The id of the entry group to create. The id must begin with a letter or underscore,
     * contain only English letters, numbers and underscores, and be at most 64 characters.
     * 
     */
    public Output<String> getEntryGroupId() {
        return this.entryGroupId;
    }
    /**
     * The resource name of the entry group in URL format. Example:
     * projects/{project}/locations/{location}/entryGroups/{entryGroupId}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the entry group in URL format. Example:
     * projects/{project}/locations/{location}/entryGroups/{entryGroupId}
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
     * EntryGroup location region.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return EntryGroup location region.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntryGroup(String name, EntryGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/entryGroup:EntryGroup", name, args == null ? EntryGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EntryGroup(String name, Input<String> id, @Nullable EntryGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/entryGroup:EntryGroup", name, state, makeResourceOptions(options, id));
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
    public static EntryGroup get(String name, Input<String> id, @Nullable EntryGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EntryGroup(name, id, state, options);
    }
}
