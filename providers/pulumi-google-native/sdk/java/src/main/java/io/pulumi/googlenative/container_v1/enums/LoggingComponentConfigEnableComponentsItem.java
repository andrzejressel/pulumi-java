// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum LoggingComponentConfigEnableComponentsItem {
        /**
         * Default value. This shouldn't be used.
         * 
         */
        ComponentUnspecified("COMPONENT_UNSPECIFIED"),
        /**
         * system components
         * 
         */
        SystemComponents("SYSTEM_COMPONENTS"),
        /**
         * workloads
         * 
         */
        Workloads("WORKLOADS");

        private final String value;

        LoggingComponentConfigEnableComponentsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LoggingComponentConfigEnableComponentsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
