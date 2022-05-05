// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.BackendBucketSignedUrlKeyArgs;
import com.pulumi.gcp.compute.inputs.BackendBucketSignedUrlKeyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A key for signing Cloud CDN signed URLs for BackendBuckets.
 * 
 * To get more information about BackendBucketSignedUrlKey, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/backendBuckets)
 * * How-to Guides
 *     * [Using Signed URLs](https://cloud.google.com/cdn/docs/using-signed-urls/)
 * 
 * &gt; **Warning:** All arguments including `key_value` will be stored in the raw
 * state as plain-text.
 * 
 * ## Example Usage
 * ### Backend Bucket Signed Url Key
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
 *         var urlSignature = new RandomId(&#34;urlSignature&#34;, RandomIdArgs.builder()        
 *             .byteLength(16)
 *             .build());
 * 
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .location(&#34;EU&#34;)
 *             .build());
 * 
 *         var testBackend = new BackendBucket(&#34;testBackend&#34;, BackendBucketArgs.builder()        
 *             .description(&#34;Contains beautiful images&#34;)
 *             .bucketName(bucket.getName())
 *             .enableCdn(true)
 *             .build());
 * 
 *         var backendKey = new BackendBucketSignedUrlKey(&#34;backendKey&#34;, BackendBucketSignedUrlKeyArgs.builder()        
 *             .keyValue(urlSignature.getB64Url())
 *             .backendBucket(testBackend.getName())
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
@ResourceType(type="gcp:compute/backendBucketSignedUrlKey:BackendBucketSignedUrlKey")
public class BackendBucketSignedUrlKey extends com.pulumi.resources.CustomResource {
    /**
     * The backend bucket this signed URL key belongs.
     * 
     */
    @Export(name="backendBucket", type=String.class, parameters={})
    private Output<String> backendBucket;

    /**
     * @return The backend bucket this signed URL key belongs.
     * 
     */
    public Output<String> backendBucket() {
        return this.backendBucket;
    }
    /**
     * 128-bit key value used for signing the URL. The key value must be a
     * valid RFC 4648 Section 5 base64url encoded string.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="keyValue", type=String.class, parameters={})
    private Output<String> keyValue;

    /**
     * @return 128-bit key value used for signing the URL. The key value must be a
     * valid RFC 4648 Section 5 base64url encoded string.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> keyValue() {
        return this.keyValue;
    }
    /**
     * Name of the signed URL key.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the signed URL key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackendBucketSignedUrlKey(String name) {
        this(name, BackendBucketSignedUrlKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackendBucketSignedUrlKey(String name, BackendBucketSignedUrlKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackendBucketSignedUrlKey(String name, BackendBucketSignedUrlKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendBucketSignedUrlKey:BackendBucketSignedUrlKey", name, args == null ? BackendBucketSignedUrlKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackendBucketSignedUrlKey(String name, Output<String> id, @Nullable BackendBucketSignedUrlKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendBucketSignedUrlKey:BackendBucketSignedUrlKey", name, state, makeResourceOptions(options, id));
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
    public static BackendBucketSignedUrlKey get(String name, Output<String> id, @Nullable BackendBucketSignedUrlKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackendBucketSignedUrlKey(name, id, state, options);
    }
}
