// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the config of disk options.
 * 
 */
public final class GoogleCloudMlV1__DiskConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__DiskConfigResponse Empty = new GoogleCloudMlV1__DiskConfigResponse();

    /**
     * Size in GB of the boot disk (default is 100GB).
     * 
     */
    @InputImport(name="bootDiskSizeGb", required=true)
    private final Integer bootDiskSizeGb;

    public Integer getBootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }

    /**
     * Type of the boot disk (default is "pd-ssd"). Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive).
     * 
     */
    @InputImport(name="bootDiskType", required=true)
    private final String bootDiskType;

    public String getBootDiskType() {
        return this.bootDiskType;
    }

    public GoogleCloudMlV1__DiskConfigResponse(
        Integer bootDiskSizeGb,
        String bootDiskType) {
        this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb, "expected parameter 'bootDiskSizeGb' to be non-null");
        this.bootDiskType = Objects.requireNonNull(bootDiskType, "expected parameter 'bootDiskType' to be non-null");
    }

    private GoogleCloudMlV1__DiskConfigResponse() {
        this.bootDiskSizeGb = null;
        this.bootDiskType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__DiskConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bootDiskSizeGb;
        private String bootDiskType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__DiskConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
        }

        public Builder setBootDiskSizeGb(Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb);
            return this;
        }

        public Builder setBootDiskType(String bootDiskType) {
            this.bootDiskType = Objects.requireNonNull(bootDiskType);
            return this;
        }

        public GoogleCloudMlV1__DiskConfigResponse build() {
            return new GoogleCloudMlV1__DiskConfigResponse(bootDiskSizeGb, bootDiskType);
        }
    }
}
