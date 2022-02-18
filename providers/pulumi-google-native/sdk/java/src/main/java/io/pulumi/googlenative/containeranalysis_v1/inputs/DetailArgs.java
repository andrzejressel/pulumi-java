// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A detail for a distro and package affected by this vulnerability and its associated fix (if one is available).
 * 
 */
public final class DetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetailArgs Empty = new DetailArgs();

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    @InputImport(name="affectedCpeUri", required=true)
    private final Input<String> affectedCpeUri;

    public Input<String> getAffectedCpeUri() {
        return this.affectedCpeUri;
    }

    /**
     * The package this vulnerability affects.
     * 
     */
    @InputImport(name="affectedPackage", required=true)
    private final Input<String> affectedPackage;

    public Input<String> getAffectedPackage() {
        return this.affectedPackage;
    }

    /**
     * The version number at the end of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    @InputImport(name="affectedVersionEnd")
    private final @Nullable Input<VersionArgs> affectedVersionEnd;

    public Input<VersionArgs> getAffectedVersionEnd() {
        return this.affectedVersionEnd == null ? Input.empty() : this.affectedVersionEnd;
    }

    /**
     * The version number at the start of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    @InputImport(name="affectedVersionStart")
    private final @Nullable Input<VersionArgs> affectedVersionStart;

    public Input<VersionArgs> getAffectedVersionStart() {
        return this.affectedVersionStart == null ? Input.empty() : this.affectedVersionStart;
    }

    /**
     * A vendor-specific description of this vulnerability.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The distro recommended [CPE URI](https://cpe.mitre.org/specification/) to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_cpe_uri.
     * 
     */
    @InputImport(name="fixedCpeUri")
    private final @Nullable Input<String> fixedCpeUri;

    public Input<String> getFixedCpeUri() {
        return this.fixedCpeUri == null ? Input.empty() : this.fixedCpeUri;
    }

    /**
     * The distro recommended package to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_package.
     * 
     */
    @InputImport(name="fixedPackage")
    private final @Nullable Input<String> fixedPackage;

    public Input<String> getFixedPackage() {
        return this.fixedPackage == null ? Input.empty() : this.fixedPackage;
    }

    /**
     * The distro recommended version to update to that contains a fix for this vulnerability. Setting this to VersionKind.MAXIMUM means no such version is yet available.
     * 
     */
    @InputImport(name="fixedVersion")
    private final @Nullable Input<VersionArgs> fixedVersion;

    public Input<VersionArgs> getFixedVersion() {
        return this.fixedVersion == null ? Input.empty() : this.fixedVersion;
    }

    /**
     * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    @InputImport(name="isObsolete")
    private final @Nullable Input<Boolean> isObsolete;

    public Input<Boolean> getIsObsolete() {
        return this.isObsolete == null ? Input.empty() : this.isObsolete;
    }

    /**
     * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
     * 
     */
    @InputImport(name="packageType")
    private final @Nullable Input<String> packageType;

    public Input<String> getPackageType() {
        return this.packageType == null ? Input.empty() : this.packageType;
    }

    /**
     * The distro assigned severity of this vulnerability.
     * 
     */
    @InputImport(name="severityName")
    private final @Nullable Input<String> severityName;

    public Input<String> getSeverityName() {
        return this.severityName == null ? Input.empty() : this.severityName;
    }

    /**
     * The source from which the information in this Detail was obtained.
     * 
     */
    @InputImport(name="source")
    private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker.
     * 
     */
    @InputImport(name="sourceUpdateTime")
    private final @Nullable Input<String> sourceUpdateTime;

    public Input<String> getSourceUpdateTime() {
        return this.sourceUpdateTime == null ? Input.empty() : this.sourceUpdateTime;
    }

    /**
     * The name of the vendor of the product.
     * 
     */
    @InputImport(name="vendor")
    private final @Nullable Input<String> vendor;

    public Input<String> getVendor() {
        return this.vendor == null ? Input.empty() : this.vendor;
    }

    public DetailArgs(
        Input<String> affectedCpeUri,
        Input<String> affectedPackage,
        @Nullable Input<VersionArgs> affectedVersionEnd,
        @Nullable Input<VersionArgs> affectedVersionStart,
        @Nullable Input<String> description,
        @Nullable Input<String> fixedCpeUri,
        @Nullable Input<String> fixedPackage,
        @Nullable Input<VersionArgs> fixedVersion,
        @Nullable Input<Boolean> isObsolete,
        @Nullable Input<String> packageType,
        @Nullable Input<String> severityName,
        @Nullable Input<String> source,
        @Nullable Input<String> sourceUpdateTime,
        @Nullable Input<String> vendor) {
        this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri, "expected parameter 'affectedCpeUri' to be non-null");
        this.affectedPackage = Objects.requireNonNull(affectedPackage, "expected parameter 'affectedPackage' to be non-null");
        this.affectedVersionEnd = affectedVersionEnd;
        this.affectedVersionStart = affectedVersionStart;
        this.description = description;
        this.fixedCpeUri = fixedCpeUri;
        this.fixedPackage = fixedPackage;
        this.fixedVersion = fixedVersion;
        this.isObsolete = isObsolete;
        this.packageType = packageType;
        this.severityName = severityName;
        this.source = source;
        this.sourceUpdateTime = sourceUpdateTime;
        this.vendor = vendor;
    }

    private DetailArgs() {
        this.affectedCpeUri = Input.empty();
        this.affectedPackage = Input.empty();
        this.affectedVersionEnd = Input.empty();
        this.affectedVersionStart = Input.empty();
        this.description = Input.empty();
        this.fixedCpeUri = Input.empty();
        this.fixedPackage = Input.empty();
        this.fixedVersion = Input.empty();
        this.isObsolete = Input.empty();
        this.packageType = Input.empty();
        this.severityName = Input.empty();
        this.source = Input.empty();
        this.sourceUpdateTime = Input.empty();
        this.vendor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> affectedCpeUri;
        private Input<String> affectedPackage;
        private @Nullable Input<VersionArgs> affectedVersionEnd;
        private @Nullable Input<VersionArgs> affectedVersionStart;
        private @Nullable Input<String> description;
        private @Nullable Input<String> fixedCpeUri;
        private @Nullable Input<String> fixedPackage;
        private @Nullable Input<VersionArgs> fixedVersion;
        private @Nullable Input<Boolean> isObsolete;
        private @Nullable Input<String> packageType;
        private @Nullable Input<String> severityName;
        private @Nullable Input<String> source;
        private @Nullable Input<String> sourceUpdateTime;
        private @Nullable Input<String> vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCpeUri = defaults.affectedCpeUri;
    	      this.affectedPackage = defaults.affectedPackage;
    	      this.affectedVersionEnd = defaults.affectedVersionEnd;
    	      this.affectedVersionStart = defaults.affectedVersionStart;
    	      this.description = defaults.description;
    	      this.fixedCpeUri = defaults.fixedCpeUri;
    	      this.fixedPackage = defaults.fixedPackage;
    	      this.fixedVersion = defaults.fixedVersion;
    	      this.isObsolete = defaults.isObsolete;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.sourceUpdateTime = defaults.sourceUpdateTime;
    	      this.vendor = defaults.vendor;
        }

        public Builder setAffectedCpeUri(Input<String> affectedCpeUri) {
            this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri);
            return this;
        }

        public Builder setAffectedCpeUri(String affectedCpeUri) {
            this.affectedCpeUri = Input.of(Objects.requireNonNull(affectedCpeUri));
            return this;
        }

        public Builder setAffectedPackage(Input<String> affectedPackage) {
            this.affectedPackage = Objects.requireNonNull(affectedPackage);
            return this;
        }

        public Builder setAffectedPackage(String affectedPackage) {
            this.affectedPackage = Input.of(Objects.requireNonNull(affectedPackage));
            return this;
        }

        public Builder setAffectedVersionEnd(@Nullable Input<VersionArgs> affectedVersionEnd) {
            this.affectedVersionEnd = affectedVersionEnd;
            return this;
        }

        public Builder setAffectedVersionEnd(@Nullable VersionArgs affectedVersionEnd) {
            this.affectedVersionEnd = Input.ofNullable(affectedVersionEnd);
            return this;
        }

        public Builder setAffectedVersionStart(@Nullable Input<VersionArgs> affectedVersionStart) {
            this.affectedVersionStart = affectedVersionStart;
            return this;
        }

        public Builder setAffectedVersionStart(@Nullable VersionArgs affectedVersionStart) {
            this.affectedVersionStart = Input.ofNullable(affectedVersionStart);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFixedCpeUri(@Nullable Input<String> fixedCpeUri) {
            this.fixedCpeUri = fixedCpeUri;
            return this;
        }

        public Builder setFixedCpeUri(@Nullable String fixedCpeUri) {
            this.fixedCpeUri = Input.ofNullable(fixedCpeUri);
            return this;
        }

        public Builder setFixedPackage(@Nullable Input<String> fixedPackage) {
            this.fixedPackage = fixedPackage;
            return this;
        }

        public Builder setFixedPackage(@Nullable String fixedPackage) {
            this.fixedPackage = Input.ofNullable(fixedPackage);
            return this;
        }

        public Builder setFixedVersion(@Nullable Input<VersionArgs> fixedVersion) {
            this.fixedVersion = fixedVersion;
            return this;
        }

        public Builder setFixedVersion(@Nullable VersionArgs fixedVersion) {
            this.fixedVersion = Input.ofNullable(fixedVersion);
            return this;
        }

        public Builder setIsObsolete(@Nullable Input<Boolean> isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }

        public Builder setIsObsolete(@Nullable Boolean isObsolete) {
            this.isObsolete = Input.ofNullable(isObsolete);
            return this;
        }

        public Builder setPackageType(@Nullable Input<String> packageType) {
            this.packageType = packageType;
            return this;
        }

        public Builder setPackageType(@Nullable String packageType) {
            this.packageType = Input.ofNullable(packageType);
            return this;
        }

        public Builder setSeverityName(@Nullable Input<String> severityName) {
            this.severityName = severityName;
            return this;
        }

        public Builder setSeverityName(@Nullable String severityName) {
            this.severityName = Input.ofNullable(severityName);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setSourceUpdateTime(@Nullable Input<String> sourceUpdateTime) {
            this.sourceUpdateTime = sourceUpdateTime;
            return this;
        }

        public Builder setSourceUpdateTime(@Nullable String sourceUpdateTime) {
            this.sourceUpdateTime = Input.ofNullable(sourceUpdateTime);
            return this;
        }

        public Builder setVendor(@Nullable Input<String> vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder setVendor(@Nullable String vendor) {
            this.vendor = Input.ofNullable(vendor);
            return this;
        }

        public DetailArgs build() {
            return new DetailArgs(affectedCpeUri, affectedPackage, affectedVersionEnd, affectedVersionStart, description, fixedCpeUri, fixedPackage, fixedVersion, isObsolete, packageType, severityName, source, sourceUpdateTime, vendor);
        }
    }
}
