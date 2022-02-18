// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    @EnumType
    public enum InstanceGroupManagerUpdatePolicyType {
        /**
         * No action is being proactively performed in order to bring this IGM to its target version distribution (regardless of whether this distribution is expressed using instanceTemplate or versions field).
         * 
         */
        Opportunistic("OPPORTUNISTIC"),
        /**
         * This IGM will actively converge to its target version distribution (regardless of whether this distribution is expressed using instanceTemplate or versions field).
         * 
         */
        Proactive("PROACTIVE");

        private final String value;

        InstanceGroupManagerUpdatePolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceGroupManagerUpdatePolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
