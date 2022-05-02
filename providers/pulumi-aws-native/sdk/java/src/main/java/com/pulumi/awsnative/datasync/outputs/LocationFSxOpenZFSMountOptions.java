// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.outputs;

import com.pulumi.awsnative.datasync.enums.LocationFSxOpenZFSMountOptionsVersion;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocationFSxOpenZFSMountOptions {
    /**
     * @return The specific NFS version that you want DataSync to use to mount your NFS share.
     * 
     */
    private final @Nullable LocationFSxOpenZFSMountOptionsVersion version;

    @CustomType.Constructor
    private LocationFSxOpenZFSMountOptions(@CustomType.Parameter("version") @Nullable LocationFSxOpenZFSMountOptionsVersion version) {
        this.version = version;
    }

    /**
     * @return The specific NFS version that you want DataSync to use to mount your NFS share.
     * 
     */
    public Optional<LocationFSxOpenZFSMountOptionsVersion> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationFSxOpenZFSMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LocationFSxOpenZFSMountOptionsVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationFSxOpenZFSMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable LocationFSxOpenZFSMountOptionsVersion version) {
            this.version = version;
            return this;
        }        public LocationFSxOpenZFSMountOptions build() {
            return new LocationFSxOpenZFSMountOptions(version);
        }
    }
}
