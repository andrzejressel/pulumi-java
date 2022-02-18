// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1beta1.TaxonomyArgs;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SystemTimestampsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a taxonomy in the specified project.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datacatalog/v1beta1:Taxonomy")
public class Taxonomy extends io.pulumi.resources.CustomResource {
    /**
     * Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    @OutputExport(name="activatedPolicyTypes", type=List.class, parameters={String.class})
    private Output<List<String>> activatedPolicyTypes;

    /**
     * @return Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    public Output<List<String>> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes;
    }
    /**
     * Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of this taxonomy, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{id}".
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of this taxonomy, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{id}".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Number of policy tags contained in this taxonomy.
     * 
     */
    @OutputExport(name="policyTagCount", type=Integer.class, parameters={})
    private Output<Integer> policyTagCount;

    /**
     * @return Number of policy tags contained in this taxonomy.
     * 
     */
    public Output<Integer> getPolicyTagCount() {
        return this.policyTagCount;
    }
    /**
     * Timestamps about this taxonomy. Only create_time and update_time are used.
     * 
     */
    @OutputExport(name="taxonomyTimestamps", type=GoogleCloudDatacatalogV1beta1SystemTimestampsResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1SystemTimestampsResponse> taxonomyTimestamps;

    /**
     * @return Timestamps about this taxonomy. Only create_time and update_time are used.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1SystemTimestampsResponse> getTaxonomyTimestamps() {
        return this.taxonomyTimestamps;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Taxonomy(String name, TaxonomyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:Taxonomy", name, args == null ? TaxonomyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Taxonomy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:Taxonomy", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Taxonomy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Taxonomy(name, id, options);
    }
}
