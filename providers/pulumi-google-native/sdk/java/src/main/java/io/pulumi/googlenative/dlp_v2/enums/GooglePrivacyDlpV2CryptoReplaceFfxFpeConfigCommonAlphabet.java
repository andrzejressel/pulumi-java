// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Common alphabets.
     * 
     */
    @EnumType
    public enum GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet {
        /**
         * Unused.
         * 
         */
        FfxCommonNativeAlphabetUnspecified("FFX_COMMON_NATIVE_ALPHABET_UNSPECIFIED"),
        /**
         * `[0-9]` (radix of 10)
         * 
         */
        Numeric("NUMERIC"),
        /**
         * `[0-9A-F]` (radix of 16)
         * 
         */
        Hexadecimal("HEXADECIMAL"),
        /**
         * `[0-9A-Z]` (radix of 36)
         * 
         */
        UpperCaseAlphaNumeric("UPPER_CASE_ALPHA_NUMERIC"),
        /**
         * `[0-9A-Za-z]` (radix of 62)
         * 
         */
        AlphaNumeric("ALPHA_NUMERIC");

        private final String value;

        GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
