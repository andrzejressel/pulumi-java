// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.AssetOrArchive;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.BucketObjectArgs;
import io.pulumi.gcp.storage.inputs.BucketObjectState;
import io.pulumi.gcp.storage.outputs.BucketObjectCustomerEncryption;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new object inside an existing bucket in Google cloud storage service (GCS).
 * [ACLs](https://cloud.google.com/storage/docs/access-control/lists) can be applied using the `gcp.storage.ObjectACL` resource.
 *  For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:storage/bucketObject:BucketObject")
public class BucketObject extends io.pulumi.resources.CustomResource {
    /**
     * The name of the containing bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the containing bucket.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     * 
     */
    @Export(name="cacheControl", type=String.class, parameters={})
    private Output</* @Nullable */ String> cacheControl;

    /**
     * @return [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     * 
     */
    public Output</* @Nullable */ String> getCacheControl() {
        return this.cacheControl;
    }
    /**
     * Data as `string` to be uploaded. Must be defined if `source` is not. **Note**: The `content` field is marked as sensitive.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output</* @Nullable */ String> content;

    /**
     * @return Data as `string` to be uploaded. Must be defined if `source` is not. **Note**: The `content` field is marked as sensitive.
     * 
     */
    public Output</* @Nullable */ String> getContent() {
        return this.content;
    }
    /**
     * [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     * 
     */
    @Export(name="contentDisposition", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentDisposition;

    /**
     * @return [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     * 
     */
    public Output</* @Nullable */ String> getContentDisposition() {
        return this.contentDisposition;
    }
    /**
     * [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     * 
     */
    @Export(name="contentEncoding", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentEncoding;

    /**
     * @return [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     * 
     */
    public Output</* @Nullable */ String> getContentEncoding() {
        return this.contentEncoding;
    }
    /**
     * [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     * 
     */
    @Export(name="contentLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentLanguage;

    /**
     * @return [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     * 
     */
    public Output</* @Nullable */ String> getContentLanguage() {
        return this.contentLanguage;
    }
    /**
     * [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to "application/octet-stream" or "text/plain; charset=utf-8".
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to "application/octet-stream" or "text/plain; charset=utf-8".
     * 
     */
    public Output<String> getContentType() {
        return this.contentType;
    }
    /**
     * (Computed) Base 64 CRC32 hash of the uploaded data.
     * 
     */
    @Export(name="crc32c", type=String.class, parameters={})
    private Output<String> crc32c;

    /**
     * @return (Computed) Base 64 CRC32 hash of the uploaded data.
     * 
     */
    public Output<String> getCrc32c() {
        return this.crc32c;
    }
    /**
     * Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     * Structure is documented below.
     * 
     */
    @Export(name="customerEncryption", type=BucketObjectCustomerEncryption.class, parameters={})
    private Output</* @Nullable */ BucketObjectCustomerEncryption> customerEncryption;

    /**
     * @return Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BucketObjectCustomerEncryption> getCustomerEncryption() {
        return this.customerEncryption;
    }
    @Export(name="detectMd5hash", type=String.class, parameters={})
    private Output</* @Nullable */ String> detectMd5hash;

    public Output</* @Nullable */ String> getDetectMd5hash() {
        return this.detectMd5hash;
    }
    /**
     * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is
     * signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects
     * will be subject to bucket-level retention (if any).
     * 
     */
    @Export(name="eventBasedHold", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> eventBasedHold;

    /**
     * @return Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is
     * signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects
     * will be subject to bucket-level retention (if any).
     * 
     */
    public Output</* @Nullable */ Boolean> getEventBasedHold() {
        return this.eventBasedHold;
    }
    /**
     * The resource name of the Cloud KMS key that will be used to [encrypt](https://cloud.google.com/storage/docs/encryption/using-customer-managed-keys) the object.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return The resource name of the Cloud KMS key that will be used to [encrypt](https://cloud.google.com/storage/docs/encryption/using-customer-managed-keys) the object.
     * 
     */
    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * (Computed) Base 64 MD5 hash of the uploaded data.
     * 
     */
    @Export(name="md5hash", type=String.class, parameters={})
    private Output<String> md5hash;

    /**
     * @return (Computed) Base 64 MD5 hash of the uploaded data.
     * 
     */
    public Output<String> getMd5hash() {
        return this.md5hash;
    }
    /**
     * (Computed) A url reference to download this object.
     * 
     */
    @Export(name="mediaLink", type=String.class, parameters={})
    private Output<String> mediaLink;

    /**
     * @return (Computed) A url reference to download this object.
     * 
     */
    public Output<String> getMediaLink() {
        return this.mediaLink;
    }
    /**
     * User-provided metadata, in key/value pairs.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return User-provided metadata, in key/value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The name of the object. If you're interpolating the name of this object, see `output_name` instead.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object. If you're interpolating the name of this object, see `output_name` instead.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * (Computed) The name of the object. Use this field in interpolations with `gcp.storage.ObjectACL` to recreate
     * `gcp.storage.ObjectACL` resources when your `gcp.storage.BucketObject` is recreated.
     * 
     */
    @Export(name="outputName", type=String.class, parameters={})
    private Output<String> outputName;

    /**
     * @return (Computed) The name of the object. Use this field in interpolations with `gcp.storage.ObjectACL` to recreate
     * `gcp.storage.ObjectACL` resources when your `gcp.storage.BucketObject` is recreated.
     * 
     */
    public Output<String> getOutputName() {
        return this.outputName;
    }
    /**
     * (Computed) A url reference to this object.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return (Computed) A url reference to this object.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A path to the data you want to upload. Must be defined
     * if `content` is not.
     * 
     */
    @Export(name="source", type=AssetOrArchive.class, parameters={})
    private Output</* @Nullable */ AssetOrArchive> source;

    /**
     * @return A path to the data you want to upload. Must be defined
     * if `content` is not.
     * 
     */
    public Output</* @Nullable */ AssetOrArchive> getSource() {
        return this.source;
    }
    /**
     * The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`. If not provided, this defaults to the bucket's default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     * 
     */
    @Export(name="storageClass", type=String.class, parameters={})
    private Output<String> storageClass;

    /**
     * @return The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`. If not provided, this defaults to the bucket's default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     * 
     */
    public Output<String> getStorageClass() {
        return this.storageClass;
    }
    /**
     * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and
     * overwrites.
     * 
     */
    @Export(name="temporaryHold", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> temporaryHold;

    /**
     * @return Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and
     * overwrites.
     * 
     */
    public Output</* @Nullable */ Boolean> getTemporaryHold() {
        return this.temporaryHold;
    }

    public interface BuilderApplicator {
        public void apply(BucketObjectArgs.Builder a);
    }
    private static io.pulumi.gcp.storage.BucketObjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.storage.BucketObjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BucketObject(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketObject(String name) {
        this(name, BucketObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketObject(String name, BucketObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketObject(String name, BucketObjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketObject:BucketObject", name, args == null ? BucketObjectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BucketObject(String name, Output<String> id, @Nullable BucketObjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketObject:BucketObject", name, state, makeResourceOptions(options, id));
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
    public static BucketObject get(String name, Output<String> id, @Nullable BucketObjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketObject(name, id, state, options);
    }
}
