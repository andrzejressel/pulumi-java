// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1alpha2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    @EnumType
    public enum GoogleDomainsDnsDsState {
        /**
         * DS state is unspecified.
         * 
         */
        DsStateUnspecified("DS_STATE_UNSPECIFIED"),
        /**
         * DNSSEC is disabled for this domain. No DS records for this domain are published in the parent DNS zone.
         * 
         */
        DsRecordsUnpublished("DS_RECORDS_UNPUBLISHED"),
        /**
         * DNSSEC is enabled for this domain. Appropriate DS records for this domain are published in the parent DNS zone. This option is valid only if the DNS zone referenced in the `Registration`'s `dns_provider` field is already DNSSEC-signed.
         * 
         */
        DsRecordsPublished("DS_RECORDS_PUBLISHED");

        private final String value;

        GoogleDomainsDnsDsState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleDomainsDnsDsState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
