// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    @EnumType
    public enum AddressNetworkTier {
        /**
         * Public internet quality with fixed bandwidth.
         * 
         */
        FixedStandard("FIXED_STANDARD"),
        /**
         * High quality, Google-grade network tier, support for all networking products.
         * 
         */
        Premium("PREMIUM"),
        /**
         * Public internet quality, only limited support for other networking products.
         * 
         */
        Standard("STANDARD"),
        /**
         * (Output only) Temporary tier for FIXED_STANDARD when fixed standard tier is expired or not configured.
         * 
         */
        StandardOverridesFixedStandard("STANDARD_OVERRIDES_FIXED_STANDARD");

        private final String value;

        AddressNetworkTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AddressNetworkTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
