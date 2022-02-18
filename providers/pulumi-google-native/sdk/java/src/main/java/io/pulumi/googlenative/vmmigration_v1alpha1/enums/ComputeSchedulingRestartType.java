// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
     * 
     */
    @EnumType
    public enum ComputeSchedulingRestartType {
        /**
         * Unspecified behavior. This will use the default.
         * 
         */
        RestartTypeUnspecified("RESTART_TYPE_UNSPECIFIED"),
        /**
         * The Instance should be automatically restarted whenever it is terminated by Compute Engine.
         * 
         */
        AutomaticRestart("AUTOMATIC_RESTART"),
        /**
         * The Instance isn't automatically restarted whenever it is terminated by Compute Engine.
         * 
         */
        NoAutomaticRestart("NO_AUTOMATIC_RESTART");

        private final String value;

        ComputeSchedulingRestartType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComputeSchedulingRestartType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
