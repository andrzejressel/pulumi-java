// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiskResponse {
    /**
     * Disk storage type, as defined by Google Compute Engine. This must be a disk type appropriate to the project and zone in which the workers will run. If unknown or unspecified, the service will attempt to choose a reasonable default. For example, the standard persistent disk type is a resource name typically ending in "pd-standard". If SSD persistent disks are available, the resource name typically ends with "pd-ssd". The actual valid values are defined the Google Compute Engine API, not by the Cloud Dataflow API; consult the Google Compute Engine documentation for more information about determining the set of available disk types for a particular project and zone. Google Compute Engine Disk types are local to a particular project in a particular zone, and so the resource name will typically look something like this: compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * 
     */
    private final String diskType;
    /**
     * Directory in a VM where disk is mounted.
     * 
     */
    private final String mountPoint;
    /**
     * Size of disk in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    private final Integer sizeGb;

    @OutputCustomType.Constructor({"diskType","mountPoint","sizeGb"})
    private DiskResponse(
        String diskType,
        String mountPoint,
        Integer sizeGb) {
        this.diskType = Objects.requireNonNull(diskType);
        this.mountPoint = Objects.requireNonNull(mountPoint);
        this.sizeGb = Objects.requireNonNull(sizeGb);
    }

    /**
     * Disk storage type, as defined by Google Compute Engine. This must be a disk type appropriate to the project and zone in which the workers will run. If unknown or unspecified, the service will attempt to choose a reasonable default. For example, the standard persistent disk type is a resource name typically ending in "pd-standard". If SSD persistent disks are available, the resource name typically ends with "pd-ssd". The actual valid values are defined the Google Compute Engine API, not by the Cloud Dataflow API; consult the Google Compute Engine documentation for more information about determining the set of available disk types for a particular project and zone. Google Compute Engine Disk types are local to a particular project in a particular zone, and so the resource name will typically look something like this: compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * 
     */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * Directory in a VM where disk is mounted.
     * 
     */
    public String getMountPoint() {
        return this.mountPoint;
    }
    /**
     * Size of disk in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Integer getSizeGb() {
        return this.sizeGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskType;
        private String mountPoint;
        private Integer sizeGb;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskType = defaults.diskType;
    	      this.mountPoint = defaults.mountPoint;
    	      this.sizeGb = defaults.sizeGb;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setMountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }

        public Builder setSizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public DiskResponse build() {
            return new DiskResponse(diskType, mountPoint, sizeGb);
        }
    }
}
