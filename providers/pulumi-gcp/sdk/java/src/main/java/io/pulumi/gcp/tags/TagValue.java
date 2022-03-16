// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.tags.TagValueArgs;
import io.pulumi.gcp.tags.inputs.TagValueState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A TagValue is a child of a particular TagKey. TagValues are used to group cloud resources for the purpose of controlling them using policies.
 * 
 * To get more information about TagValue, see:
 * 
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/resource-manager/docs/tags/tags-creating-and-managing)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TagValue can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagValue:TagValue default tagValues/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagValue:TagValue default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:tags/tagValue:TagValue")
public class TagValue extends io.pulumi.resources.CustomResource {
    /**
     * Output only. Creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. Creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * User-assigned description of the TagValue. Must not exceed 256 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User-assigned description of the TagValue. Must not exceed 256 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The generated numeric id for the TagValue.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The generated numeric id for the TagValue.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Output only. Namespaced name of the TagValue. Will be in the format {organizationId}/{tag_key_short_name}/{shortName}.
     * 
     */
    @Export(name="namespacedName", type=String.class, parameters={})
    private Output<String> namespacedName;

    /**
     * @return Output only. Namespaced name of the TagValue. Will be in the format {organizationId}/{tag_key_short_name}/{shortName}.
     * 
     */
    public Output<String> getNamespacedName() {
        return this.namespacedName;
    }
    /**
     * Input only. The resource name of the new TagValue's parent. Must be of the form tagKeys/{tag_key_id}.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return Input only. The resource name of the new TagValue's parent. Must be of the form tagKeys/{tag_key_id}.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Input only. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey.
     * The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return Input only. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey.
     * The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Output<String> getShortName() {
        return this.shortName;
    }
    /**
     * Output only. Update time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. Update time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(TagValueArgs.Builder a);
    }
    private static io.pulumi.gcp.tags.TagValueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.tags.TagValueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TagValue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagValue(String name) {
        this(name, TagValueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagValue(String name, TagValueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagValue(String name, TagValueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagValue:TagValue", name, args == null ? TagValueArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TagValue(String name, Output<String> id, @Nullable TagValueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagValue:TagValue", name, state, makeResourceOptions(options, id));
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
    public static TagValue get(String name, Output<String> id, @Nullable TagValueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagValue(name, id, state, options);
    }
}
