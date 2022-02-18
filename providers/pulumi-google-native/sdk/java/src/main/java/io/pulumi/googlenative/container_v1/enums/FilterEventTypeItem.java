// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FilterEventTypeItem {
        /**
         * Not set, will be ignored.
         * 
         */
        EventTypeUnspecified("EVENT_TYPE_UNSPECIFIED"),
        /**
         * Corresponds with UpgradeAvailableEvent.
         * 
         */
        UpgradeAvailableEvent("UPGRADE_AVAILABLE_EVENT"),
        /**
         * Corresponds with UpgradeEvent.
         * 
         */
        UpgradeEvent("UPGRADE_EVENT"),
        /**
         * Corresponds with SecurityBulletinEvent.
         * 
         */
        SecurityBulletinEvent("SECURITY_BULLETIN_EVENT");

        private final String value;

        FilterEventTypeItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FilterEventTypeItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
