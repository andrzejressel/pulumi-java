// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.ConsentArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.GoogleCloudHealthcareV1ConsentPolicyResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Consent in the parent consent store.
 * 
 */
@ResourceType(type="google-native:healthcare/v1:Consent")
public class Consent extends io.pulumi.resources.CustomResource {
    /**
     * The resource name of the Consent artifact that contains proof of the end user's consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    @OutputExport(name="consentArtifact", type=String.class, parameters={})
    private Output<String> consentArtifact;

    /**
     * @return The resource name of the Consent artifact that contains proof of the end user's consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    public Output<String> getConsentArtifact() {
        return this.consentArtifact;
    }
    /**
     * Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    @OutputExport(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. Represents a user's consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    @OutputExport(name="policies", type=List.class, parameters={GoogleCloudHealthcareV1ConsentPolicyResponse.class})
    private Output<List<GoogleCloudHealthcareV1ConsentPolicyResponse>> policies;

    /**
     * @return Optional. Represents a user's consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    public Output<List<GoogleCloudHealthcareV1ConsentPolicyResponse>> getPolicies() {
        return this.policies;
    }
    /**
     * The timestamp that the revision was created.
     * 
     */
    @OutputExport(name="revisionCreateTime", type=String.class, parameters={})
    private Output<String> revisionCreateTime;

    /**
     * @return The timestamp that the revision was created.
     * 
     */
    public Output<String> getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent's resource name.
     * 
     */
    @OutputExport(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent's resource name.
     * 
     */
    public Output<String> getRevisionId() {
        return this.revisionId;
    }
    /**
     * Indicates the current state of this Consent.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Indicates the current state of this Consent.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Input only. The time to live for this Consent from when it is created.
     * 
     */
    @OutputExport(name="ttl", type=String.class, parameters={})
    private Output<String> ttl;

    /**
     * @return Input only. The time to live for this Consent from when it is created.
     * 
     */
    public Output<String> getTtl() {
        return this.ttl;
    }
    /**
     * User's UUID provided by the client.
     * 
     */
    @OutputExport(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return User's UUID provided by the client.
     * 
     */
    public Output<String> getUserId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Consent(String name, ConsentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Consent", name, args == null ? ConsentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Consent(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Consent", name, null, makeResourceOptions(options, id));
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
    public static Consent get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Consent(name, id, options);
    }
}
