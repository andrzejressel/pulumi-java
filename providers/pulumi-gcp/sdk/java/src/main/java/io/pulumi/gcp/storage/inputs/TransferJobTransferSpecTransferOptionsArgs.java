// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecTransferOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecTransferOptionsArgs Empty = new TransferJobTransferSpecTransferOptionsArgs();

    /**
     * Whether objects should be deleted from the source after they are transferred to the sink. Note that this option and `delete_objects_unique_in_sink` are mutually exclusive.
     * 
     */
    @InputImport(name="deleteObjectsFromSourceAfterTransfer")
    private final @Nullable Input<Boolean> deleteObjectsFromSourceAfterTransfer;

    public Input<Boolean> getDeleteObjectsFromSourceAfterTransfer() {
        return this.deleteObjectsFromSourceAfterTransfer == null ? Input.empty() : this.deleteObjectsFromSourceAfterTransfer;
    }

    /**
     * Whether objects that exist only in the sink should be deleted. Note that this option and
     * `delete_objects_from_source_after_transfer` are mutually exclusive.
     * 
     */
    @InputImport(name="deleteObjectsUniqueInSink")
    private final @Nullable Input<Boolean> deleteObjectsUniqueInSink;

    public Input<Boolean> getDeleteObjectsUniqueInSink() {
        return this.deleteObjectsUniqueInSink == null ? Input.empty() : this.deleteObjectsUniqueInSink;
    }

    /**
     * Whether overwriting objects that already exist in the sink is allowed.
     * 
     */
    @InputImport(name="overwriteObjectsAlreadyExistingInSink")
    private final @Nullable Input<Boolean> overwriteObjectsAlreadyExistingInSink;

    public Input<Boolean> getOverwriteObjectsAlreadyExistingInSink() {
        return this.overwriteObjectsAlreadyExistingInSink == null ? Input.empty() : this.overwriteObjectsAlreadyExistingInSink;
    }

    public TransferJobTransferSpecTransferOptionsArgs(
        @Nullable Input<Boolean> deleteObjectsFromSourceAfterTransfer,
        @Nullable Input<Boolean> deleteObjectsUniqueInSink,
        @Nullable Input<Boolean> overwriteObjectsAlreadyExistingInSink) {
        this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
        this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
        this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
    }

    private TransferJobTransferSpecTransferOptionsArgs() {
        this.deleteObjectsFromSourceAfterTransfer = Input.empty();
        this.deleteObjectsUniqueInSink = Input.empty();
        this.overwriteObjectsAlreadyExistingInSink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecTransferOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleteObjectsFromSourceAfterTransfer;
        private @Nullable Input<Boolean> deleteObjectsUniqueInSink;
        private @Nullable Input<Boolean> overwriteObjectsAlreadyExistingInSink;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecTransferOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteObjectsFromSourceAfterTransfer = defaults.deleteObjectsFromSourceAfterTransfer;
    	      this.deleteObjectsUniqueInSink = defaults.deleteObjectsUniqueInSink;
    	      this.overwriteObjectsAlreadyExistingInSink = defaults.overwriteObjectsAlreadyExistingInSink;
        }

        public Builder setDeleteObjectsFromSourceAfterTransfer(@Nullable Input<Boolean> deleteObjectsFromSourceAfterTransfer) {
            this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
            return this;
        }

        public Builder setDeleteObjectsFromSourceAfterTransfer(@Nullable Boolean deleteObjectsFromSourceAfterTransfer) {
            this.deleteObjectsFromSourceAfterTransfer = Input.ofNullable(deleteObjectsFromSourceAfterTransfer);
            return this;
        }

        public Builder setDeleteObjectsUniqueInSink(@Nullable Input<Boolean> deleteObjectsUniqueInSink) {
            this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
            return this;
        }

        public Builder setDeleteObjectsUniqueInSink(@Nullable Boolean deleteObjectsUniqueInSink) {
            this.deleteObjectsUniqueInSink = Input.ofNullable(deleteObjectsUniqueInSink);
            return this;
        }

        public Builder setOverwriteObjectsAlreadyExistingInSink(@Nullable Input<Boolean> overwriteObjectsAlreadyExistingInSink) {
            this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
            return this;
        }

        public Builder setOverwriteObjectsAlreadyExistingInSink(@Nullable Boolean overwriteObjectsAlreadyExistingInSink) {
            this.overwriteObjectsAlreadyExistingInSink = Input.ofNullable(overwriteObjectsAlreadyExistingInSink);
            return this;
        }

        public TransferJobTransferSpecTransferOptionsArgs build() {
            return new TransferJobTransferSpecTransferOptionsArgs(deleteObjectsFromSourceAfterTransfer, deleteObjectsUniqueInSink, overwriteObjectsAlreadyExistingInSink);
        }
    }
}
