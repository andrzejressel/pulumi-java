// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies network collocation
     * 
     */
    @EnumType
    public enum ResourcePolicyGroupPlacementPolicyCollocation {
        /**
         * Specifies collocation option that provides tight collocation with minimum network latency.
         * 
         */
        Clustered("CLUSTERED"),
        Collocated("COLLOCATED"),
        UnspecifiedCollocation("UNSPECIFIED_COLLOCATION");

        private final String value;

        ResourcePolicyGroupPlacementPolicyCollocation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResourcePolicyGroupPlacementPolicyCollocation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
