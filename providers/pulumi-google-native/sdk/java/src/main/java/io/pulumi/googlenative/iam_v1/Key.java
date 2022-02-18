// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iam_v1.KeyArgs;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a ServiceAccountKey.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:iam/v1:Key")
public class Key extends io.pulumi.resources.CustomResource {
    /**
     * The key status.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return The key status.
     * 
     */
    public Output<Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * Specifies the algorithm (and possibly key size) for the key.
     * 
     */
    @OutputExport(name="keyAlgorithm", type=String.class, parameters={})
    private Output<String> keyAlgorithm;

    /**
     * @return Specifies the algorithm (and possibly key size) for the key.
     * 
     */
    public Output<String> getKeyAlgorithm() {
        return this.keyAlgorithm;
    }
    /**
     * The key origin.
     * 
     */
    @OutputExport(name="keyOrigin", type=String.class, parameters={})
    private Output<String> keyOrigin;

    /**
     * @return The key origin.
     * 
     */
    public Output<String> getKeyOrigin() {
        return this.keyOrigin;
    }
    /**
     * The key type.
     * 
     */
    @OutputExport(name="keyType", type=String.class, parameters={})
    private Output<String> keyType;

    /**
     * @return The key type.
     * 
     */
    public Output<String> getKeyType() {
        return this.keyType;
    }
    /**
     * The resource name of the service account key in the following format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the service account key in the following format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep the private key data secure because it allows for the assertion of the service account identity. When base64 decoded, the private key data can be used to authenticate with Google API client libraries and with gcloud auth activate-service-account.
     * 
     */
    @OutputExport(name="privateKeyData", type=String.class, parameters={})
    private Output<String> privateKeyData;

    /**
     * @return The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep the private key data secure because it allows for the assertion of the service account identity. When base64 decoded, the private key data can be used to authenticate with Google API client libraries and with gcloud auth activate-service-account.
     * 
     */
    public Output<String> getPrivateKeyData() {
        return this.privateKeyData;
    }
    /**
     * The output format for the private key. Only provided in `CreateServiceAccountKey` responses, not in `GetServiceAccountKey` or `ListServiceAccountKey` responses. Google never exposes system-managed private keys, and never retains user-managed private keys.
     * 
     */
    @OutputExport(name="privateKeyType", type=String.class, parameters={})
    private Output<String> privateKeyType;

    /**
     * @return The output format for the private key. Only provided in `CreateServiceAccountKey` responses, not in `GetServiceAccountKey` or `ListServiceAccountKey` responses. Google never exposes system-managed private keys, and never retains user-managed private keys.
     * 
     */
    public Output<String> getPrivateKeyType() {
        return this.privateKeyType;
    }
    /**
     * The public key data. Only provided in `GetServiceAccountKey` responses.
     * 
     */
    @OutputExport(name="publicKeyData", type=String.class, parameters={})
    private Output<String> publicKeyData;

    /**
     * @return The public key data. Only provided in `GetServiceAccountKey` responses.
     * 
     */
    public Output<String> getPublicKeyData() {
        return this.publicKeyData;
    }
    /**
     * The key can be used after this timestamp.
     * 
     */
    @OutputExport(name="validAfterTime", type=String.class, parameters={})
    private Output<String> validAfterTime;

    /**
     * @return The key can be used after this timestamp.
     * 
     */
    public Output<String> getValidAfterTime() {
        return this.validAfterTime;
    }
    /**
     * The key can be used before this timestamp. For system-managed key pairs, this timestamp is the end time for the private key signing operation. The public key could still be used for verification for a few hours after this time.
     * 
     */
    @OutputExport(name="validBeforeTime", type=String.class, parameters={})
    private Output<String> validBeforeTime;

    /**
     * @return The key can be used before this timestamp. For system-managed key pairs, this timestamp is the end time for the private key signing operation. The public key could still be used for verification for a few hours after this time.
     * 
     */
    public Output<String> getValidBeforeTime() {
        return this.validBeforeTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Key(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:Key", name, null, makeResourceOptions(options, id));
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
    public static Key get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}
