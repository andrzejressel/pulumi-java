// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Indicates the current state of this Consent.
     * 
     */
    @EnumType
    public enum ConsentState {
        /**
         * No state specified. Treated as ACTIVE only at the time of resource creation.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The Consent is active and is considered when evaluating a user's consent on resources.
         * 
         */
        Active("ACTIVE"),
        /**
         * The archived state is currently not being used.
         * 
         */
        Archived("ARCHIVED"),
        /**
         * A revoked Consent is not considered when evaluating a user's consent on resources.
         * 
         */
        Revoked("REVOKED"),
        /**
         * A draft Consent is not considered when evaluating a user's consent on resources unless explicitly specified.
         * 
         */
        Draft("DRAFT"),
        /**
         * When a draft Consent is rejected by a user, it is set to a rejected state. A rejected Consent is not considered when evaluating a user's consent on resources.
         * 
         */
        Rejected("REJECTED");

        private final String value;

        ConsentState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConsentState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
