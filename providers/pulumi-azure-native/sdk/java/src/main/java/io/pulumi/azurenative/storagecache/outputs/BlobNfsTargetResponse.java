// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BlobNfsTargetResponse {
    /**
     * Resource ID of the storage container.
     * 
     */
    private final @Nullable String target;
    /**
     * Identifies the StorageCache usage model to be used for this storage target.
     * 
     */
    private final @Nullable String usageModel;

    @OutputCustomType.Constructor
    private BlobNfsTargetResponse(
        @OutputCustomType.Parameter("target") @Nullable String target,
        @OutputCustomType.Parameter("usageModel") @Nullable String usageModel) {
        this.target = target;
        this.usageModel = usageModel;
    }

    /**
     * Resource ID of the storage container.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * Identifies the StorageCache usage model to be used for this storage target.
     * 
    */
    public Optional<String> getUsageModel() {
        return Optional.ofNullable(this.usageModel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobNfsTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String target;
        private @Nullable String usageModel;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobNfsTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.usageModel = defaults.usageModel;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setUsageModel(@Nullable String usageModel) {
            this.usageModel = usageModel;
            return this;
        }
        public BlobNfsTargetResponse build() {
            return new BlobNfsTargetResponse(target, usageModel);
        }
    }
}
