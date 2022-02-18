// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    @EnumType
    public enum AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface {
        Nvdimm("NVDIMM"),
        Nvme("NVME"),
        Scsi("SCSI");

        private final String value;

        AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
