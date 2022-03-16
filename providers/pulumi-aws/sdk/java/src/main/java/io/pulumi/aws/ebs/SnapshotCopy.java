// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ebs.SnapshotCopyArgs;
import io.pulumi.aws.ebs.inputs.SnapshotCopyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Snapshot of a snapshot.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ebs/snapshotCopy:SnapshotCopy")
public class SnapshotCopy extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The data encryption key identifier for the snapshot.
     * 
     */
    @Export(name="dataEncryptionKeyId", type=String.class, parameters={})
    private Output<String> dataEncryptionKeyId;

    /**
     * @return The data encryption key identifier for the snapshot.
     * 
     */
    public Output<String> getDataEncryptionKeyId() {
        return this.dataEncryptionKeyId;
    }
    /**
     * A description of what the snapshot is.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of what the snapshot is.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @Export(name="encrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encrypted;

    /**
     * @return Whether the snapshot is encrypted.
     * 
     */
    public Output</* @Nullable */ Boolean> getEncrypted() {
        return this.encrypted;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    @Export(name="outpostArn", type=String.class, parameters={})
    private Output<String> outpostArn;

    public Output<String> getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    @Export(name="ownerAlias", type=String.class, parameters={})
    private Output<String> ownerAlias;

    /**
     * @return Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    public Output<String> getOwnerAlias() {
        return this.ownerAlias;
    }
    /**
     * The AWS account ID of the snapshot owner.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the snapshot owner.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @Export(name="permanentRestore", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> permanentRestore;

    /**
     * @return Indicates whether to permanently restore an archived snapshot.
     * 
     */
    public Output</* @Nullable */ Boolean> getPermanentRestore() {
        return this.permanentRestore;
    }
    /**
     * The region of the source snapshot.
     * 
     */
    @Export(name="sourceRegion", type=String.class, parameters={})
    private Output<String> sourceRegion;

    /**
     * @return The region of the source snapshot.
     * 
     */
    public Output<String> getSourceRegion() {
        return this.sourceRegion;
    }
    /**
     * The ARN for the snapshot to be copied.
     * 
     */
    @Export(name="sourceSnapshotId", type=String.class, parameters={})
    private Output<String> sourceSnapshotId;

    /**
     * @return The ARN for the snapshot to be copied.
     * 
     */
    public Output<String> getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @Export(name="storageTier", type=String.class, parameters={})
    private Output<String> storageTier;

    /**
     * @return The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    public Output<String> getStorageTier() {
        return this.storageTier;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @Export(name="temporaryRestoreDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> temporaryRestoreDays;

    /**
     * @return Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    public Output</* @Nullable */ Integer> getTemporaryRestoreDays() {
        return this.temporaryRestoreDays;
    }
    @Export(name="volumeId", type=String.class, parameters={})
    private Output<String> volumeId;

    public Output<String> getVolumeId() {
        return this.volumeId;
    }
    /**
     * The size of the drive in GiBs.
     * 
     */
    @Export(name="volumeSize", type=Integer.class, parameters={})
    private Output<Integer> volumeSize;

    /**
     * @return The size of the drive in GiBs.
     * 
     */
    public Output<Integer> getVolumeSize() {
        return this.volumeSize;
    }

    public interface BuilderApplicator {
        public void apply(SnapshotCopyArgs.Builder a);
    }
    private static io.pulumi.aws.ebs.SnapshotCopyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ebs.SnapshotCopyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SnapshotCopy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotCopy(String name) {
        this(name, SnapshotCopyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotCopy(String name, SnapshotCopyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotCopy(String name, SnapshotCopyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/snapshotCopy:SnapshotCopy", name, args == null ? SnapshotCopyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SnapshotCopy(String name, Output<String> id, @Nullable SnapshotCopyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/snapshotCopy:SnapshotCopy", name, state, makeResourceOptions(options, id));
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
    public static SnapshotCopy get(String name, Output<String> id, @Nullable SnapshotCopyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotCopy(name, id, state, options);
    }
}
