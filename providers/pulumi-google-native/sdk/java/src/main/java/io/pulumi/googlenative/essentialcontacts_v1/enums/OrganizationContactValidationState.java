// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    @EnumType
    public enum OrganizationContactValidationState {
        /**
         * The validation state is unknown or unspecified.
         * 
         */
        ValidationStateUnspecified("VALIDATION_STATE_UNSPECIFIED"),
        /**
         * The contact is marked as valid. This is usually done manually by the contact admin. All new contacts begin in the valid state.
         * 
         */
        Valid("VALID"),
        /**
         * The contact is considered invalid. This may become the state if the contact's email is found to be unreachable.
         * 
         */
        Invalid("INVALID");

        private final String value;

        OrganizationContactValidationState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OrganizationContactValidationState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
