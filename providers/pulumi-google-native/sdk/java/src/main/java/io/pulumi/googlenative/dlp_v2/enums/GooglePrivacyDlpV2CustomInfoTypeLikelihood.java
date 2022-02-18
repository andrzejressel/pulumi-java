// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria specified by the rule. Defaults to `VERY_LIKELY` if not specified.
     * 
     */
    @EnumType
    public enum GooglePrivacyDlpV2CustomInfoTypeLikelihood {
        /**
         * Default value; same as POSSIBLE.
         * 
         */
        LikelihoodUnspecified("LIKELIHOOD_UNSPECIFIED"),
        /**
         * Few matching elements.
         * 
         */
        VeryUnlikely("VERY_UNLIKELY"),
        Unlikely("UNLIKELY"),
        /**
         * Some matching elements.
         * 
         */
        Possible("POSSIBLE"),
        Likely("LIKELY"),
        /**
         * Many matching elements.
         * 
         */
        VeryLikely("VERY_LIKELY");

        private final String value;

        GooglePrivacyDlpV2CustomInfoTypeLikelihood(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GooglePrivacyDlpV2CustomInfoTypeLikelihood[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
