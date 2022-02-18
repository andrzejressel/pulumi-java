// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    @EnumType
    public enum SecurityPolicyRuleMatcherVersionedExpr {
        Firewall("FIREWALL"),
        /**
         * Matches the source IP address of a request to the IP ranges supplied in config.
         * 
         */
        SrcIpsV1("SRC_IPS_V1");

        private final String value;

        SecurityPolicyRuleMatcherVersionedExpr(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecurityPolicyRuleMatcherVersionedExpr[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
