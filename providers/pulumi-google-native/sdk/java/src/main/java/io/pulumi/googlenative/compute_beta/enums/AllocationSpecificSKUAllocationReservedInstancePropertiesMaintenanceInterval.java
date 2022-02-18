// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    @EnumType
    public enum AllocationSpecificSKUAllocationReservedInstancePropertiesMaintenanceInterval {
        /**
         * VMs receive infrastructure and hypervisor updates on a periodic basis, minimizing the number of maintenance operations (live migrations or terminations) on an individual VM. This may mean a VM will take longer to receive an update than if it was configured for AS_NEEDED. Security updates will still be applied as soon as they are available.
         * 
         */
        Periodic("PERIODIC");

        private final String value;

        AllocationSpecificSKUAllocationReservedInstancePropertiesMaintenanceInterval(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AllocationSpecificSKUAllocationReservedInstancePropertiesMaintenanceInterval[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
