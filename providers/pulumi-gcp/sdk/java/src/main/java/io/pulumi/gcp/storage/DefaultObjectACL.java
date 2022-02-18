// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.DefaultObjectACLArgs;
import io.pulumi.gcp.storage.inputs.DefaultObjectACLState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Authoritatively manages the default object ACLs for a Google Cloud Storage bucket
 * without managing the bucket itself.
 * 
 * > Note that for each object, its creator will have the `"OWNER"` role in addition
 * to the default ACL that has been defined.
 * 
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls).
 * 
 * > Want fine-grained control over default object ACLs? Use `gcp.storage.DefaultObjectAccessControl`
 * to control individual role entity pairs.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:storage/defaultObjectACL:DefaultObjectACL")
public class DefaultObjectACL extends io.pulumi.resources.CustomResource {
    /**
     * The name of the bucket it applies to.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket it applies to.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     * 
     */
    @OutputExport(name="roleEntities", type=List.class, parameters={String.class})
    private Output<List<String>> roleEntities;

    /**
     * @return List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     * 
     */
    public Output<List<String>> getRoleEntities() {
        return this.roleEntities;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultObjectACL(String name, DefaultObjectACLArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/defaultObjectACL:DefaultObjectACL", name, args == null ? DefaultObjectACLArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DefaultObjectACL(String name, Input<String> id, @Nullable DefaultObjectACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/defaultObjectACL:DefaultObjectACL", name, state, makeResourceOptions(options, id));
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
    public static DefaultObjectACL get(String name, Input<String> id, @Nullable DefaultObjectACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultObjectACL(name, id, state, options);
    }
}
