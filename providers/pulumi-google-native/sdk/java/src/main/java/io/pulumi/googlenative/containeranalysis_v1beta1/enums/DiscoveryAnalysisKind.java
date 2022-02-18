// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Immutable. The kind of analysis that is handled by this discovery.
     * 
     */
    @EnumType
    public enum DiscoveryAnalysisKind {
        /**
         * Default value. This value is unused.
         * 
         */
        NoteKindUnspecified("NOTE_KIND_UNSPECIFIED"),
        /**
         * The note and occurrence represent a package vulnerability.
         * 
         */
        Vulnerability("VULNERABILITY"),
        /**
         * The note and occurrence assert build provenance.
         * 
         */
        Build("BUILD"),
        /**
         * This represents an image basis relationship.
         * 
         */
        Image("IMAGE"),
        /**
         * This represents a package installed via a package manager.
         * 
         */
        Package("PACKAGE"),
        /**
         * The note and occurrence track deployment events.
         * 
         */
        Deployment("DEPLOYMENT"),
        /**
         * The note and occurrence track the initial discovery status of a resource.
         * 
         */
        Discovery("DISCOVERY"),
        /**
         * This represents a logical "role" that can attest to artifacts.
         * 
         */
        Attestation("ATTESTATION"),
        /**
         * This represents an in-toto link.
         * 
         */
        Intoto("INTOTO"),
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
        SpdxRelationship("SPDX_RELATIONSHIP");

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
