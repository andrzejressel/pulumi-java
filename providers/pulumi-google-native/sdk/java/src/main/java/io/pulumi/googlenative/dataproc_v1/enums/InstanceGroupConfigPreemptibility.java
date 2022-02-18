// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    @EnumType
    public enum InstanceGroupConfigPreemptibility {
        /**
         * Preemptibility is unspecified, the system will choose the appropriate setting for each instance group.
         * 
         */
        PreemptibilityUnspecified("PREEMPTIBILITY_UNSPECIFIED"),
        /**
         * Instances are non-preemptible.This option is allowed for all instance groups and is the only valid value for Master and Worker instance groups.
         * 
         */
        NonPreemptible("NON_PREEMPTIBLE"),
        /**
         * Instances are preemptible.This option is allowed only for secondary worker groups.
         * 
         */
        Preemptible("PREEMPTIBLE");

        private final String value;

        InstanceGroupConfigPreemptibility(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceGroupConfigPreemptibility[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
