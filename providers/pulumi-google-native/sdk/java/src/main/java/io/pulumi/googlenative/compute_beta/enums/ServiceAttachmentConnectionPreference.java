// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    @EnumType
    public enum ServiceAttachmentConnectionPreference {
        AcceptAutomatic("ACCEPT_AUTOMATIC"),
        AcceptManual("ACCEPT_MANUAL"),
        ConnectionPreferenceUnspecified("CONNECTION_PREFERENCE_UNSPECIFIED");

        private final String value;

        ServiceAttachmentConnectionPreference(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceAttachmentConnectionPreference[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
