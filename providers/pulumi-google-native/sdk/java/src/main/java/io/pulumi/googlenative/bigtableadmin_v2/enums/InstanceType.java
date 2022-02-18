// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The type of the instance. Defaults to `PRODUCTION`.
     * 
     */
    @EnumType
    public enum InstanceType {
        /**
         * The type of the instance is unspecified. If set when creating an instance, a `PRODUCTION` instance will be created. If set when updating an instance, the type will be left unchanged.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * An instance meant for production use. `serve_nodes` must be set on the cluster.
         * 
         */
        Production("PRODUCTION"),
        /**
         * DEPRECATED: Prefer PRODUCTION for all use cases, as it no longer enforces a higher minimum node count than DEVELOPMENT.
         * 
         */
        Development("DEVELOPMENT");

        private final String value;

        InstanceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
