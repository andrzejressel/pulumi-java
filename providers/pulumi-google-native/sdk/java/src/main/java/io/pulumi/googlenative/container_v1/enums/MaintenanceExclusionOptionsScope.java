// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
     * 
     */
    @EnumType
    public enum MaintenanceExclusionOptionsScope {
        /**
         * NO_UPGRADES excludes all upgrades, including patch upgrades and minor upgrades across control planes and nodes. This is the default exclusion behavior.
         * 
         */
        NoUpgrades("NO_UPGRADES"),
        /**
         * NO_MINOR_UPGRADES excludes all minor upgrades for the cluster, only patches are allowed.
         * 
         */
        NoMinorUpgrades("NO_MINOR_UPGRADES"),
        /**
         * NO_MINOR_OR_NODE_UPGRADES excludes all minor upgrades for the cluster, and also exclude all node pool upgrades. Only control plane patches are allowed.
         * 
         */
        NoMinorOrNodeUpgrades("NO_MINOR_OR_NODE_UPGRADES");

        private final String value;

        MaintenanceExclusionOptionsScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MaintenanceExclusionOptionsScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
