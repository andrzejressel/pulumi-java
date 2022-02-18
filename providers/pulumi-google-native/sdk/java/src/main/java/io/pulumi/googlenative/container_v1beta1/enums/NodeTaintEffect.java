// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Effect for taint.
     * 
     */
    @EnumType
    public enum NodeTaintEffect {
        /**
         * Not set
         * 
         */
        EffectUnspecified("EFFECT_UNSPECIFIED"),
        /**
         * NoSchedule
         * 
         */
        NoSchedule("NO_SCHEDULE"),
        /**
         * PreferNoSchedule
         * 
         */
        PreferNoSchedule("PREFER_NO_SCHEDULE"),
        /**
         * NoExecute
         * 
         */
        NoExecute("NO_EXECUTE");

        private final String value;

        NodeTaintEffect(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NodeTaintEffect[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
