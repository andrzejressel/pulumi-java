// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GuestOsFeatureResponse {
    /**
     * The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private GuestOsFeatureResponse(String type) {
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOsFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOsFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GuestOsFeatureResponse build() {
            return new GuestOsFeatureResponse(type);
        }
    }
}
