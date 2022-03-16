// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataloss.PreventionInspectTemplateArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateState;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfig;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An inspect job template.
 * 
 * To get more information about InspectTemplate, see:
 * 
 * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.inspectTemplates)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dlp/docs/creating-templates-inspect)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * InspectTemplate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate default {{parent}}/inspectTemplates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate")
public class PreventionInspectTemplate extends io.pulumi.resources.CustomResource {
    /**
     * A description of the inspect template.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the inspect template.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * User set display name of the inspect template.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User set display name of the inspect template.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The core content of the template.
     * Structure is documented below.
     * 
     */
    @Export(name="inspectConfig", type=PreventionInspectTemplateInspectConfig.class, parameters={})
    private Output</* @Nullable */ PreventionInspectTemplateInspectConfig> inspectConfig;

    /**
     * @return The core content of the template.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PreventionInspectTemplateInspectConfig> getInspectConfig() {
        return this.inspectConfig;
    }
    /**
     * Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
     * or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
     * or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parent of the inspect template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the inspect template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }

    public interface BuilderApplicator {
        public void apply(PreventionInspectTemplateArgs.Builder a);
    }
    private static io.pulumi.gcp.dataloss.PreventionInspectTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.dataloss.PreventionInspectTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PreventionInspectTemplate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PreventionInspectTemplate(String name) {
        this(name, PreventionInspectTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PreventionInspectTemplate(String name, PreventionInspectTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PreventionInspectTemplate(String name, PreventionInspectTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate", name, args == null ? PreventionInspectTemplateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PreventionInspectTemplate(String name, Output<String> id, @Nullable PreventionInspectTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate", name, state, makeResourceOptions(options, id));
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
    public static PreventionInspectTemplate get(String name, Output<String> id, @Nullable PreventionInspectTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PreventionInspectTemplate(name, id, state, options);
    }
}
