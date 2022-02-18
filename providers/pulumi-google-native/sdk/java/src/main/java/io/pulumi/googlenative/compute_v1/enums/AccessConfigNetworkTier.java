// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
     */
    @EnumType
    public enum AccessConfigNetworkTier {
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

        AccessConfigNetworkTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AccessConfigNetworkTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
