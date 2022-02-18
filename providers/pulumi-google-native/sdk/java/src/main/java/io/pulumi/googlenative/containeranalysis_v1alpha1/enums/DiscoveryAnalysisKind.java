// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of analysis that is handled by this discovery.
     * 
     */
    @EnumType
    public enum DiscoveryAnalysisKind {
        /**
         * Unknown
         * 
         */
        KindUnspecified("KIND_UNSPECIFIED"),
        /**
         * The note and occurrence represent a package vulnerability.
         * 
         */
        PackageVulnerability("PACKAGE_VULNERABILITY"),
        /**
         * The note and occurrence assert build provenance.
         * 
         */
        BuildDetails("BUILD_DETAILS"),
        /**
         * This represents an image basis relationship.
         * 
         */
        ImageBasis("IMAGE_BASIS"),
        /**
         * This represents a package installed via a package manager.
         * 
         */
        PackageManager("PACKAGE_MANAGER"),
        /**
         * The note and occurrence track deployment events.
         * 
         */
        Deployable("DEPLOYABLE"),
        /**
         * The note and occurrence track the initial discovery status of a resource.
         * 
         */
        Discovery("DISCOVERY"),
        /**
         * This represents a logical "role" that can attest to artifacts.
         * 
         */
        AttestationAuthority("ATTESTATION_AUTHORITY"),
        /**
         * This represents an available software upgrade.
         * 
         */
        Upgrade("UPGRADE"),
        /**
         * This represents a compliance check that can be applied to a resource.
         * 
         */
        Compliance("COMPLIANCE"),
        /**
         * This represents a software bill of materials.
         * 
         */
        Sbom("SBOM"),
        /**
         * This represents an SPDX Package.
         * 
         */
        SpdxPackage("SPDX_PACKAGE"),
        /**
         * This represents an SPDX File.
         * 
         */
        SpdxFile("SPDX_FILE"),
        /**
         * This represents an SPDX Relationship.
         * 
         */
        SpdxRelationship("SPDX_RELATIONSHIP"),
        /**
         * This represents a DSSE attestation Note
         * 
         */
        DsseAttestation("DSSE_ATTESTATION");

        private final String value;

        DiscoveryAnalysisKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiscoveryAnalysisKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
