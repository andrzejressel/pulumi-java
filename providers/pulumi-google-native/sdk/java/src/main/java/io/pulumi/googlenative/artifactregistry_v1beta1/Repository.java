// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.artifactregistry_v1beta1.RepositoryArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a repository. The returned Operation will finish once the repository has been created. Its response will be the created Repository.
 * 
 */
@ResourceType(type="google-native:artifactregistry/v1beta1:Repository")
public class Repository extends io.pulumi.resources.CustomResource {
    /**
     * The time when the repository was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the repository was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The user-provided description of the repository.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The user-provided description of the repository.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The format of packages that are stored in the repository.
     * 
     */
    @OutputExport(name="format", type=String.class, parameters={})
    private Output<String> format;

    /**
     * @return The format of packages that are stored in the repository.
     * 
     */
    public Output<String> getFormat() {
        return this.format;
    }
    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    @OutputExport(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return The Cloud KMS resource name of the customer managed encryption key that’s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1".
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The time when the repository was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the repository was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, @Nullable RepositoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta1:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Repository(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta1:Repository", name, null, makeResourceOptions(options, id));
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
    public static Repository get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, options);
    }
}
