// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes the ServerVersion of an a MongoDB account.
     * 
     */
    @EnumType
    public enum ServerVersion {
        _3_2("3.2"),
        _3_6("3.6"),
        _4_0("4.0");

        private final String value;

        ServerVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServerVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
