// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
     * 
     */
    @EnumType
    public enum FirewallDirection {
        /**
         * Indicates that firewall should apply to outgoing traffic.
         * 
         */
        Egress("EGRESS"),
        /**
         * Indicates that firewall should apply to incoming traffic.
         * 
         */
        Ingress("INGRESS");

        private final String value;

        FirewallDirection(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FirewallDirection[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
