// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A detail for a distro and package this vulnerability occurrence was found in and its associated fix (if one is available).
 * 
 */
public final class PackageIssueResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageIssueResponse Empty = new PackageIssueResponse();

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was found in.
     * 
     */
    @InputImport(name="affectedCpeUri", required=true)
    private final String affectedCpeUri;

    public String getAffectedCpeUri() {
        return this.affectedCpeUri;
    }

    /**
     * The package this vulnerability was found in.
     * 
     */
    @InputImport(name="affectedPackage", required=true)
    private final String affectedPackage;

    public String getAffectedPackage() {
        return this.affectedPackage;
    }

    /**
     * The version of the package that is installed on the resource affected by this vulnerability.
     * 
     */
    @InputImport(name="affectedVersion", required=true)
    private final VersionResponse affectedVersion;

    public VersionResponse getAffectedVersion() {
        return this.affectedVersion;
    }

    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
     * 
     */
    @InputImport(name="effectiveSeverity", required=true)
    private final String effectiveSeverity;

    public String getEffectiveSeverity() {
        return this.effectiveSeverity;
    }

    /**
     * Whether a fix is available for this package.
     * 
     */
    @InputImport(name="fixAvailable", required=true)
    private final Boolean fixAvailable;

    public Boolean getFixAvailable() {
        return this.fixAvailable;
    }

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was fixed in. It is possible for this to be different from the affected_cpe_uri.
     * 
     */
    @InputImport(name="fixedCpeUri", required=true)
    private final String fixedCpeUri;

    public String getFixedCpeUri() {
        return this.fixedCpeUri;
    }

    /**
     * The package this vulnerability was fixed in. It is possible for this to be different from the affected_package.
     * 
     */
    @InputImport(name="fixedPackage", required=true)
    private final String fixedPackage;

    public String getFixedPackage() {
        return this.fixedPackage;
    }

    /**
     * The version of the package this vulnerability was fixed in. Setting this to VersionKind.MAXIMUM means no fix is yet available.
     * 
     */
    @InputImport(name="fixedVersion", required=true)
    private final VersionResponse fixedVersion;

    public VersionResponse getFixedVersion() {
        return this.fixedVersion;
    }

    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    @InputImport(name="packageType", required=true)
    private final String packageType;

    public String getPackageType() {
        return this.packageType;
    }

    public PackageIssueResponse(
        String affectedCpeUri,
        String affectedPackage,
        VersionResponse affectedVersion,
        String effectiveSeverity,
        Boolean fixAvailable,
        String fixedCpeUri,
        String fixedPackage,
        VersionResponse fixedVersion,
        String packageType) {
        this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri, "expected parameter 'affectedCpeUri' to be non-null");
        this.affectedPackage = Objects.requireNonNull(affectedPackage, "expected parameter 'affectedPackage' to be non-null");
        this.affectedVersion = Objects.requireNonNull(affectedVersion, "expected parameter 'affectedVersion' to be non-null");
        this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity, "expected parameter 'effectiveSeverity' to be non-null");
        this.fixAvailable = Objects.requireNonNull(fixAvailable, "expected parameter 'fixAvailable' to be non-null");
        this.fixedCpeUri = Objects.requireNonNull(fixedCpeUri, "expected parameter 'fixedCpeUri' to be non-null");
        this.fixedPackage = Objects.requireNonNull(fixedPackage, "expected parameter 'fixedPackage' to be non-null");
        this.fixedVersion = Objects.requireNonNull(fixedVersion, "expected parameter 'fixedVersion' to be non-null");
        this.packageType = Objects.requireNonNull(packageType, "expected parameter 'packageType' to be non-null");
    }

    private PackageIssueResponse() {
        this.affectedCpeUri = null;
        this.affectedPackage = null;
        this.affectedVersion = null;
        this.effectiveSeverity = null;
        this.fixAvailable = null;
        this.fixedCpeUri = null;
        this.fixedPackage = null;
        this.fixedVersion = null;
        this.packageType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affectedCpeUri;
        private String affectedPackage;
        private VersionResponse affectedVersion;
        private String effectiveSeverity;
        private Boolean fixAvailable;
        private String fixedCpeUri;
        private String fixedPackage;
        private VersionResponse fixedVersion;
        private String packageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCpeUri = defaults.affectedCpeUri;
    	      this.affectedPackage = defaults.affectedPackage;
    	      this.affectedVersion = defaults.affectedVersion;
    	      this.effectiveSeverity = defaults.effectiveSeverity;
    	      this.fixAvailable = defaults.fixAvailable;
    	      this.fixedCpeUri = defaults.fixedCpeUri;
    	      this.fixedPackage = defaults.fixedPackage;
    	      this.fixedVersion = defaults.fixedVersion;
    	      this.packageType = defaults.packageType;
        }

        public Builder setAffectedCpeUri(String affectedCpeUri) {
            this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri);
            return this;
        }

        public Builder setAffectedPackage(String affectedPackage) {
            this.affectedPackage = Objects.requireNonNull(affectedPackage);
            return this;
        }

        public Builder setAffectedVersion(VersionResponse affectedVersion) {
            this.affectedVersion = Objects.requireNonNull(affectedVersion);
            return this;
        }

        public Builder setEffectiveSeverity(String effectiveSeverity) {
            this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity);
            return this;
        }

        public Builder setFixAvailable(Boolean fixAvailable) {
            this.fixAvailable = Objects.requireNonNull(fixAvailable);
            return this;
        }

        public Builder setFixedCpeUri(String fixedCpeUri) {
            this.fixedCpeUri = Objects.requireNonNull(fixedCpeUri);
            return this;
        }

        public Builder setFixedPackage(String fixedPackage) {
            this.fixedPackage = Objects.requireNonNull(fixedPackage);
            return this;
        }

        public Builder setFixedVersion(VersionResponse fixedVersion) {
            this.fixedVersion = Objects.requireNonNull(fixedVersion);
            return this;
        }

        public Builder setPackageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public PackageIssueResponse build() {
            return new PackageIssueResponse(affectedCpeUri, affectedPackage, affectedVersion, effectiveSeverity, fixAvailable, fixedCpeUri, fixedPackage, fixedVersion, packageType);
        }
    }
}
