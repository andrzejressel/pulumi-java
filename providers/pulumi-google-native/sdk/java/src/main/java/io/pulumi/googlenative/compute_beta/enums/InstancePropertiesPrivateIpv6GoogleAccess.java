// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
     * 
     */
    @EnumType
    public enum InstancePropertiesPrivateIpv6GoogleAccess {
        /**
         * Bidirectional private IPv6 access to/from Google services. If specified, the subnetwork who is attached to the instance's default network interface will be assigned an internal IPv6 prefix if it doesn't have before.
         * 
         */
        EnableBidirectionalAccessToGoogle("ENABLE_BIDIRECTIONAL_ACCESS_TO_GOOGLE"),
        /**
         * Outbound private IPv6 access from VMs in this subnet to Google services. If specified, the subnetwork who is attached to the instance's default network interface will be assigned an internal IPv6 prefix if it doesn't have before.
         * 
         */
        EnableOutboundVmAccessToGoogle("ENABLE_OUTBOUND_VM_ACCESS_TO_GOOGLE"),
        /**
         * Each network interface inherits PrivateIpv6GoogleAccess from its subnetwork.
         * 
         */
        InheritFromSubnetwork("INHERIT_FROM_SUBNETWORK");

        private final String value;

        InstancePropertiesPrivateIpv6GoogleAccess(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstancePropertiesPrivateIpv6GoogleAccess[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
