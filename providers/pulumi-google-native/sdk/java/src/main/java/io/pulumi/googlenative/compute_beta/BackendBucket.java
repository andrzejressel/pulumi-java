// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.BackendBucketArgs;
import io.pulumi.googlenative.compute_beta.outputs.BackendBucketCdnPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a BackendBucket resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:BackendBucket")
public class BackendBucket extends io.pulumi.resources.CustomResource {
    /**
     * Cloud Storage bucket name.
     * 
     */
    @OutputExport(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    /**
     * @return Cloud Storage bucket name.
     * 
     */
    public Output<String> getBucketName() {
        return this.bucketName;
    }
    /**
     * Cloud CDN configuration for this BackendBucket.
     * 
     */
    @OutputExport(name="cdnPolicy", type=BackendBucketCdnPolicyResponse.class, parameters={})
    private Output<BackendBucketCdnPolicyResponse> cdnPolicy;

    /**
     * @return Cloud CDN configuration for this BackendBucket.
     * 
     */
    public Output<BackendBucketCdnPolicyResponse> getCdnPolicy() {
        return this.cdnPolicy;
    }
    /**
     * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    @OutputExport(name="compressionMode", type=String.class, parameters={})
    private Output<String> compressionMode;

    /**
     * @return Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    public Output<String> getCompressionMode() {
        return this.compressionMode;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    @OutputExport(name="customResponseHeaders", type=List.class, parameters={String.class})
    private Output<List<String>> customResponseHeaders;

    /**
     * @return Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    public Output<List<String>> getCustomResponseHeaders() {
        return this.customResponseHeaders;
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
     * The resource URL for the edge security policy associated with this backend bucket.
     * 
     */
    @OutputExport(name="edgeSecurityPolicy", type=String.class, parameters={})
    private Output<String> edgeSecurityPolicy;

    /**
     * @return The resource URL for the edge security policy associated with this backend bucket.
     * 
     */
    public Output<String> getEdgeSecurityPolicy() {
        return this.edgeSecurityPolicy;
    }
    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    @OutputExport(name="enableCdn", type=Boolean.class, parameters={})
    private Output<Boolean> enableCdn;

    /**
     * @return If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    public Output<Boolean> getEnableCdn() {
        return this.enableCdn;
    }
    /**
     * Type of the resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
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
    public BackendBucket(String name, @Nullable BackendBucketArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:BackendBucket", name, args == null ? BackendBucketArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackendBucket(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:BackendBucket", name, null, makeResourceOptions(options, id));
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
    public static BackendBucket get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackendBucket(name, id, options);
    }
}
