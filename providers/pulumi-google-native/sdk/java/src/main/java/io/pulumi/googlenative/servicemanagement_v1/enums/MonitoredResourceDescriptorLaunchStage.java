// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The launch stage of the monitored resource definition.
     * 
     */
    @EnumType
    public enum MonitoredResourceDescriptorLaunchStage {
        /**
         * Do not use this default value.
         * 
         */
        LaunchStageUnspecified("LAUNCH_STAGE_UNSPECIFIED"),
        /**
         * The feature is not yet implemented. Users can not use it.
         * 
         */
        Unimplemented("UNIMPLEMENTED"),
        /**
         * Prelaunch features are hidden from users and are only visible internally.
         * 
         */
        Prelaunch("PRELAUNCH"),
        /**
         * Early Access features are limited to a closed group of testers. To use these features, you must sign up in advance and sign a Trusted Tester agreement (which includes confidentiality provisions). These features may be unstable, changed in backward-incompatible ways, and are not guaranteed to be released.
         * 
         */
        EarlyAccess("EARLY_ACCESS"),
        /**
         * Alpha is a limited availability test for releases before they are cleared for widespread use. By Alpha, all significant design issues are resolved and we are in the process of verifying functionality. Alpha customers need to apply for access, agree to applicable terms, and have their projects allowlisted. Alpha releases don’t have to be feature complete, no SLAs are provided, and there are no technical support obligations, but they will be far enough along that customers can actually use them in test environments or for limited-use tests -- just like they would in normal production cases.
         * 
         */
        Alpha("ALPHA"),
        /**
         * Beta is the point at which we are ready to open a release for any customer to use. There are no SLA or technical support obligations in a Beta release. Products will be complete from a feature perspective, but may have some open outstanding issues. Beta releases are suitable for limited production use cases.
         * 
         */
        Beta("BETA"),
        /**
         * GA features are open to all developers and are considered stable and fully qualified for production use.
         * 
         */
        Ga("GA"),
        /**
         * Deprecated features are scheduled to be shut down and removed. For more information, see the “Deprecation Policy” section of our [Terms of Service](https://cloud.google.com/terms/) and the [Google Cloud Platform Subject to the Deprecation Policy](https://cloud.google.com/terms/deprecation) documentation.
         * 
         */
        Deprecated("DEPRECATED");

        private final String value;

        MonitoredResourceDescriptorLaunchStage(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MonitoredResourceDescriptorLaunchStage[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
