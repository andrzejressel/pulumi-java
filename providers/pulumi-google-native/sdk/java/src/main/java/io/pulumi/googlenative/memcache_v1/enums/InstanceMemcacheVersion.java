// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    @EnumType
    public enum InstanceMemcacheVersion {
        MemcacheVersionUnspecified("MEMCACHE_VERSION_UNSPECIFIED"),
        /**
         * Memcached 1.5 version.
         * 
         */
        Memcache15("MEMCACHE_1_5");

        private final String value;

        InstanceMemcacheVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceMemcacheVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
