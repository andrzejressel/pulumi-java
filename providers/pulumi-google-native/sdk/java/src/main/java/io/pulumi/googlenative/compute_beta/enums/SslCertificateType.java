// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    @EnumType
    public enum SslCertificateType {
        /**
         * Google-managed SSLCertificate.
         * 
         */
        Managed("MANAGED"),
        /**
         * Certificate uploaded by user.
         * 
         */
        SelfManaged("SELF_MANAGED"),
        TypeUnspecified("TYPE_UNSPECIFIED");

        private final String value;

        SslCertificateType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SslCertificateType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
