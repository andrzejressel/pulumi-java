// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An instance-attached disk resource.
 * 
 */
public final class SavedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final SavedDiskArgs Empty = new SavedDiskArgs();

    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    @InputImport(name="sourceDisk")
    private final @Nullable Input<String> sourceDisk;

    public Input<String> getSourceDisk() {
        return this.sourceDisk == null ? Input.empty() : this.sourceDisk;
    }

    public SavedDiskArgs(@Nullable Input<String> sourceDisk) {
        this.sourceDisk = sourceDisk;
    }

    private SavedDiskArgs() {
        this.sourceDisk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sourceDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceDisk = defaults.sourceDisk;
        }

        public Builder setSourceDisk(@Nullable Input<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }

        public Builder setSourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Input.ofNullable(sourceDisk);
            return this;
        }

        public SavedDiskArgs build() {
            return new SavedDiskArgs(sourceDisk);
        }
    }
}
