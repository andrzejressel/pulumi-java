// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GkeNodePoolTargetRolesItem {
        /**
         * Role is unspecified.
         * 
         */
        RoleUnspecified("ROLE_UNSPECIFIED"),
        /**
         * Any roles that are not directly assigned to a NodePool run on the default role&#39;s NodePool.
         * 
         */
        Default("DEFAULT"),
        /**
         * Run controllers and webhooks.
         * 
         */
        Controller("CONTROLLER"),
        /**
         * Run spark driver.
         * 
         */
        SparkDriver("SPARK_DRIVER"),
        /**
         * Run spark executors.
         * 
         */
        SparkExecutor("SPARK_EXECUTOR");

        private final String value;

        GkeNodePoolTargetRolesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GkeNodePoolTargetRolesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
