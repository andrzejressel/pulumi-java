// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.deploymentmanager_v2beta.TypeProviderArgs;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.CollectionOverrideResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.CredentialResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.OptionsResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.TypeProviderLabelEntryResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a type provider.
 * 
 */
@ResourceType(type="google-native:deploymentmanager/v2beta:TypeProvider")
public class TypeProvider extends io.pulumi.resources.CustomResource {
    /**
     * Allows resource handling overrides for specific collections
     * 
     */
    @OutputExport(name="collectionOverrides", type=List.class, parameters={CollectionOverrideResponse.class})
    private Output<List<CollectionOverrideResponse>> collectionOverrides;

    /**
     * @return Allows resource handling overrides for specific collections
     * 
     */
    public Output<List<CollectionOverrideResponse>> getCollectionOverrides() {
        return this.collectionOverrides;
    }
    /**
     * Credential used when interacting with this type.
     * 
     */
    @OutputExport(name="credential", type=CredentialResponse.class, parameters={})
    private Output<CredentialResponse> credential;

    /**
     * @return Credential used when interacting with this type.
     * 
     */
    public Output<CredentialResponse> getCredential() {
        return this.credential;
    }
    /**
     * List of up to 2 custom certificate authority roots to use for TLS authentication when making calls on behalf of this type provider. If set, TLS authentication will exclusively use these roots instead of relying on publicly trusted certificate authorities when validating TLS certificate authenticity. The certificates must be in base64-encoded PEM format. The maximum size of each certificate must not exceed 10KB.
     * 
     */
    @OutputExport(name="customCertificateAuthorityRoots", type=List.class, parameters={String.class})
    private Output<List<String>> customCertificateAuthorityRoots;

    /**
     * @return List of up to 2 custom certificate authority roots to use for TLS authentication when making calls on behalf of this type provider. If set, TLS authentication will exclusively use these roots instead of relying on publicly trusted certificate authorities when validating TLS certificate authenticity. The certificates must be in base64-encoded PEM format. The maximum size of each certificate must not exceed 10KB.
     * 
     */
    public Output<List<String>> getCustomCertificateAuthorityRoots() {
        return this.customCertificateAuthorityRoots;
    }
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Descriptor Url for the this type provider.
     * 
     */
    @OutputExport(name="descriptorUrl", type=String.class, parameters={})
    private Output<String> descriptorUrl;

    /**
     * @return Descriptor Url for the this type provider.
     * 
     */
    public Output<String> getDescriptorUrl() {
        return this.descriptorUrl;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="insertTime", type=String.class, parameters={})
    private Output<String> insertTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getInsertTime() {
        return this.insertTime;
    }
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`
     * 
     */
    @OutputExport(name="labels", type=List.class, parameters={TypeProviderLabelEntryResponse.class})
    private Output<List<TypeProviderLabelEntryResponse>> labels;

    /**
     * @return Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`
     * 
     */
    public Output<List<TypeProviderLabelEntryResponse>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Operation that most recently ran, or is currently running, on this type provider.
     * 
     */
    @OutputExport(name="operation", type=OperationResponse.class, parameters={})
    private Output<OperationResponse> operation;

    /**
     * @return The Operation that most recently ran, or is currently running, on this type provider.
     * 
     */
    public Output<OperationResponse> getOperation() {
        return this.operation;
    }
    /**
     * Options to apply when handling any resources in this service.
     * 
     */
    @OutputExport(name="options", type=OptionsResponse.class, parameters={})
    private Output<OptionsResponse> options;

    /**
     * @return Options to apply when handling any resources in this service.
     * 
     */
    public Output<OptionsResponse> getOptions() {
        return this.options;
    }
    /**
     * Self link for the type provider.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Self link for the type provider.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TypeProvider(String name, @Nullable TypeProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:deploymentmanager/v2beta:TypeProvider", name, args == null ? TypeProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TypeProvider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:deploymentmanager/v2beta:TypeProvider", name, null, makeResourceOptions(options, id));
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
    public static TypeProvider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TypeProvider(name, id, options);
    }
}
