// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Version policy defines the versions that the registry will accept.
     * 
     */
    @EnumType
    public enum MavenRepositoryConfigVersionPolicy {
        /**
         * VERSION_POLICY_UNSPECIFIED - the version policy is not defined. When the version policy is not defined, no validation is performed for the versions.
         * 
         */
        VersionPolicyUnspecified("VERSION_POLICY_UNSPECIFIED"),
        /**
         * RELEASE - repository will accept only Release versions.
         * 
         */
        Release("RELEASE"),
        /**
         * SNAPSHOT - repository will accept only Snapshot versions.
         * 
         */
        Snapshot("SNAPSHOT");

        private final String value;

        MavenRepositoryConfigVersionPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MavenRepositoryConfigVersionPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
