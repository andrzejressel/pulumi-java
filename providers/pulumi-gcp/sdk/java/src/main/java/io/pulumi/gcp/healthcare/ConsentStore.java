// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.ConsentStoreArgs;
import io.pulumi.gcp.healthcare.inputs.ConsentStoreState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Consent Management API is a tool for tracking user consents and the documentation associated with the consents.
 * 
 * To get more information about ConsentStore, see:
 * 
 * * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.consentStores)
 * * How-to Guides
 *     * [Creating a Consent store](https://cloud.google.com/healthcare/docs/how-tos/consent)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ConsentStore can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/consentStore:ConsentStore default {{dataset}}/consentStores/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/consentStore:ConsentStore")
public class ConsentStore extends io.pulumi.resources.CustomResource {
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @Export(name="dataset", type=String.class, parameters={})
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    public Output<String> getDataset() {
        return this.dataset;
    }
    /**
     * Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Export(name="defaultConsentTtl", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultConsentTtl;

    /**
     * @return Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Output</* @Nullable */ String> getDefaultConsentTtl() {
        return this.defaultConsentTtl;
    }
    /**
     * If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
     * 
     */
    @Export(name="enableConsentCreateOnUpdate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableConsentCreateOnUpdate;

    /**
     * @return If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate;
    }
    /**
     * User-supplied key-value pairs used to organize Consent stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize Consent stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of this ConsentStore, for example:
     * "consent1"
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this ConsentStore, for example:
     * "consent1"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(ConsentStoreArgs.Builder a);
    }
    private static io.pulumi.gcp.healthcare.ConsentStoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.healthcare.ConsentStoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ConsentStore(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsentStore(String name) {
        this(name, ConsentStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsentStore(String name, ConsentStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsentStore(String name, ConsentStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/consentStore:ConsentStore", name, args == null ? ConsentStoreArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ConsentStore(String name, Output<String> id, @Nullable ConsentStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/consentStore:ConsentStore", name, state, makeResourceOptions(options, id));
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
    public static ConsentStore get(String name, Output<String> id, @Nullable ConsentStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConsentStore(name, id, state, options);
    }
}
