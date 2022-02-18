// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Type of reservation to consume
     * 
     */
    @EnumType
    public enum ReservationAffinityConsumeReservationType {
        /**
         * Default type.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Do not consume from any allocated capacity.
         * 
         */
        NoReservation("NO_RESERVATION"),
        /**
         * Consume any reservation available.
         * 
         */
        AnyReservation("ANY_RESERVATION"),
        /**
         * Must consume from a specific reservation. Must specify key value fields for specifying the reservations.
         * 
         */
        SpecificReservation("SPECIFIC_RESERVATION");

        private final String value;

        ReservationAffinityConsumeReservationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReservationAffinityConsumeReservationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
