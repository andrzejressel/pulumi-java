// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * 
     */
    @EnumType
    public enum NodeGroupAutoscalingPolicyMode {
        ModeUnspecified("MODE_UNSPECIFIED"),
        /**
         * Autoscaling is disabled.
         * 
         */
        Off("OFF"),
        /**
         * Autocaling is fully enabled.
         * 
         */
        On("ON"),
        /**
         * Autoscaling will only scale out and will not remove nodes.
         * 
         */
        OnlyScaleOut("ONLY_SCALE_OUT");

        private final String value;

        NodeGroupAutoscalingPolicyMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NodeGroupAutoscalingPolicyMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
