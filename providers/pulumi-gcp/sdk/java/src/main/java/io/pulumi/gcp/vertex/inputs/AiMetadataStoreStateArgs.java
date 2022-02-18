// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiMetadataStoreStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiMetadataStoreStateArgs Empty = new AiMetadataStoreStateArgs();

    @InputImport(name="diskUtilizationBytes")
    private final @Nullable Input<String> diskUtilizationBytes;

    public Input<String> getDiskUtilizationBytes() {
        return this.diskUtilizationBytes == null ? Input.empty() : this.diskUtilizationBytes;
    }

    public AiMetadataStoreStateArgs(@Nullable Input<String> diskUtilizationBytes) {
        this.diskUtilizationBytes = diskUtilizationBytes;
    }

    private AiMetadataStoreStateArgs() {
        this.diskUtilizationBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiMetadataStoreStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskUtilizationBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(AiMetadataStoreStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskUtilizationBytes = defaults.diskUtilizationBytes;
        }

        public Builder setDiskUtilizationBytes(@Nullable Input<String> diskUtilizationBytes) {
            this.diskUtilizationBytes = diskUtilizationBytes;
            return this;
        }

        public Builder setDiskUtilizationBytes(@Nullable String diskUtilizationBytes) {
            this.diskUtilizationBytes = Input.ofNullable(diskUtilizationBytes);
            return this;
        }

        public AiMetadataStoreStateArgs build() {
            return new AiMetadataStoreStateArgs(diskUtilizationBytes);
        }
    }
}
