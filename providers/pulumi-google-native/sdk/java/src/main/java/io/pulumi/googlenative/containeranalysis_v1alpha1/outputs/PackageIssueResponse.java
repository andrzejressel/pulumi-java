// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityLocationResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PackageIssueResponse {
    /**
     * The location of the vulnerability.
     * 
     */
    private final VulnerabilityLocationResponse affectedLocation;
    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when distro or language system has not yet assigned a severity for this vulnerability.
     * 
     */
    private final String effectiveSeverity;
    /**
     * The location of the available fix for vulnerability.
     * 
     */
    private final VulnerabilityLocationResponse fixedLocation;
    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    private final String packageType;
    private final String severityName;

    @OutputCustomType.Constructor({"affectedLocation","effectiveSeverity","fixedLocation","packageType","severityName"})
    private PackageIssueResponse(
        VulnerabilityLocationResponse affectedLocation,
        String effectiveSeverity,
        VulnerabilityLocationResponse fixedLocation,
        String packageType,
        String severityName) {
        this.affectedLocation = Objects.requireNonNull(affectedLocation);
        this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity);
        this.fixedLocation = Objects.requireNonNull(fixedLocation);
        this.packageType = Objects.requireNonNull(packageType);
        this.severityName = Objects.requireNonNull(severityName);
    }

    /**
     * The location of the vulnerability.
     * 
     */
    public VulnerabilityLocationResponse getAffectedLocation() {
        return this.affectedLocation;
    }
    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when distro or language system has not yet assigned a severity for this vulnerability.
     * 
     */
    public String getEffectiveSeverity() {
        return this.effectiveSeverity;
    }
    /**
     * The location of the available fix for vulnerability.
     * 
     */
    public VulnerabilityLocationResponse getFixedLocation() {
        return this.fixedLocation;
    }
    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    public String getPackageType() {
        return this.packageType;
    }
    public String getSeverityName() {
        return this.severityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VulnerabilityLocationResponse affectedLocation;
        private String effectiveSeverity;
        private VulnerabilityLocationResponse fixedLocation;
        private String packageType;
        private String severityName;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedLocation = defaults.affectedLocation;
    	      this.effectiveSeverity = defaults.effectiveSeverity;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
        }

        public Builder setAffectedLocation(VulnerabilityLocationResponse affectedLocation) {
            this.affectedLocation = Objects.requireNonNull(affectedLocation);
            return this;
        }

        public Builder setEffectiveSeverity(String effectiveSeverity) {
            this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity);
            return this;
        }

        public Builder setFixedLocation(VulnerabilityLocationResponse fixedLocation) {
            this.fixedLocation = Objects.requireNonNull(fixedLocation);
            return this;
        }

        public Builder setPackageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder setSeverityName(String severityName) {
            this.severityName = Objects.requireNonNull(severityName);
            return this;
        }

        public PackageIssueResponse build() {
            return new PackageIssueResponse(affectedLocation, effectiveSeverity, fixedLocation, packageType, severityName);
        }
    }
}
