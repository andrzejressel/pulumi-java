// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.BucketACLArgs;
import com.pulumi.gcp.storage.inputs.BucketACLState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Authoritatively manages a bucket&#39;s ACLs in Google cloud storage service (GCS). For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls).
 * 
 * Bucket ACLs can be managed non authoritatively using the `storage_bucket_access_control` resource. Do not use these two resources in conjunction to manage the same bucket.
 * 
 * Permissions can be granted either by ACLs or Cloud IAM policies. In general, permissions granted by Cloud IAM policies do not appear in ACLs, and permissions granted by ACLs do not appear in Cloud IAM policies. The only exception is for ACLs applied directly on a bucket and certain bucket-level Cloud IAM policies, as described in [Cloud IAM relation to ACLs](https://cloud.google.com/storage/docs/access-control/iam#acls).
 * 
 * **NOTE** This resource will not remove the `project-owners-&lt;project_id&gt;` entity from the `OWNER` role.
 * 
 * ## Example Usage
 * 
 * Example creating an ACL on a bucket with one owner, and one reader.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var image_store = new Bucket(&#34;image-store&#34;, BucketArgs.builder()        
 *             .location(&#34;EU&#34;)
 *             .build());
 * 
 *         var image_store_acl = new BucketACL(&#34;image-store-acl&#34;, BucketACLArgs.builder()        
 *             .bucket(image_store.getName())
 *             .roleEntities(            
 *                 &#34;OWNER:user-my.email@gmail.com&#34;,
 *                 &#34;READER:group-mygroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:storage/bucketACL:BucketACL")
public class BucketACL extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket it applies to.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket it applies to.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Configure this ACL to be the default ACL.
     * 
     */
    @Export(name="defaultAcl", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAcl;

    /**
     * @return Configure this ACL to be the default ACL.
     * 
     */
    public Output<Optional<String>> defaultAcl() {
        return Codegen.optional(this.defaultAcl);
    }
    /**
     * The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    @Export(name="predefinedAcl", type=String.class, parameters={})
    private Output</* @Nullable */ String> predefinedAcl;

    /**
     * @return The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    public Output<Optional<String>> predefinedAcl() {
        return Codegen.optional(this.predefinedAcl);
    }
    /**
     * List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    @Export(name="roleEntities", type=List.class, parameters={String.class})
    private Output<List<String>> roleEntities;

    /**
     * @return List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    public Output<List<String>> roleEntities() {
        return this.roleEntities;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketACL(String name) {
        this(name, BucketACLArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketACL(String name, BucketACLArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketACL(String name, BucketACLArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketACL:BucketACL", name, args == null ? BucketACLArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketACL(String name, Output<String> id, @Nullable BucketACLState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketACL:BucketACL", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static BucketACL get(String name, Output<String> id, @Nullable BucketACLState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketACL(name, id, state, options);
    }
}
