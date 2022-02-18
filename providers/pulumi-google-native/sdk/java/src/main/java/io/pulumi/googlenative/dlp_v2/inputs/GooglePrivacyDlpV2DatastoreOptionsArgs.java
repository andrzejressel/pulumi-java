// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KindExpressionArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2PartitionIdArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options defining a data set within Google Cloud Datastore.
 * 
 */
public final class GooglePrivacyDlpV2DatastoreOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2DatastoreOptionsArgs Empty = new GooglePrivacyDlpV2DatastoreOptionsArgs();

    /**
     * The kind to process.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<GooglePrivacyDlpV2KindExpressionArgs> kind;

    public Input<GooglePrivacyDlpV2KindExpressionArgs> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty.
     * 
     */
    @InputImport(name="partitionId")
    private final @Nullable Input<GooglePrivacyDlpV2PartitionIdArgs> partitionId;

    public Input<GooglePrivacyDlpV2PartitionIdArgs> getPartitionId() {
        return this.partitionId == null ? Input.empty() : this.partitionId;
    }

    public GooglePrivacyDlpV2DatastoreOptionsArgs(
        @Nullable Input<GooglePrivacyDlpV2KindExpressionArgs> kind,
        @Nullable Input<GooglePrivacyDlpV2PartitionIdArgs> partitionId) {
        this.kind = kind;
        this.partitionId = partitionId;
    }

    private GooglePrivacyDlpV2DatastoreOptionsArgs() {
        this.kind = Input.empty();
        this.partitionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DatastoreOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2KindExpressionArgs> kind;
        private @Nullable Input<GooglePrivacyDlpV2PartitionIdArgs> partitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DatastoreOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.partitionId = defaults.partitionId;
        }

        public Builder setKind(@Nullable Input<GooglePrivacyDlpV2KindExpressionArgs> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable GooglePrivacyDlpV2KindExpressionArgs kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setPartitionId(@Nullable Input<GooglePrivacyDlpV2PartitionIdArgs> partitionId) {
            this.partitionId = partitionId;
            return this;
        }

        public Builder setPartitionId(@Nullable GooglePrivacyDlpV2PartitionIdArgs partitionId) {
            this.partitionId = Input.ofNullable(partitionId);
            return this;
        }

        public GooglePrivacyDlpV2DatastoreOptionsArgs build() {
            return new GooglePrivacyDlpV2DatastoreOptionsArgs(kind, partitionId);
        }
    }
}
