// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iottwinmaker.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ComponentTypeStatusErrorPropertiesCode {
        ValidationError("VALIDATION_ERROR"),
        InternalFailure("INTERNAL_FAILURE");

        private final String value;

        ComponentTypeStatusErrorPropertiesCode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComponentTypeStatusErrorPropertiesCode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
