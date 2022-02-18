// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VulnerabilityLocationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This message wraps a location affected by a vulnerability and its associated fix (if one is available).
 * 
 */
public final class PackageIssueArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageIssueArgs Empty = new PackageIssueArgs();

    /**
     * The location of the vulnerability.
     * 
     */
    @InputImport(name="affectedLocation", required=true)
    private final Input<VulnerabilityLocationArgs> affectedLocation;

    public Input<VulnerabilityLocationArgs> getAffectedLocation() {
        return this.affectedLocation;
    }

    /**
     * The location of the available fix for vulnerability.
     * 
     */
    @InputImport(name="fixedLocation")
    private final @Nullable Input<VulnerabilityLocationArgs> fixedLocation;

    public Input<VulnerabilityLocationArgs> getFixedLocation() {
        return this.fixedLocation == null ? Input.empty() : this.fixedLocation;
    }

    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    @InputImport(name="packageType")
    private final @Nullable Input<String> packageType;

    public Input<String> getPackageType() {
        return this.packageType == null ? Input.empty() : this.packageType;
    }

    public PackageIssueArgs(
        Input<VulnerabilityLocationArgs> affectedLocation,
        @Nullable Input<VulnerabilityLocationArgs> fixedLocation,
        @Nullable Input<String> packageType) {
        this.affectedLocation = Objects.requireNonNull(affectedLocation, "expected parameter 'affectedLocation' to be non-null");
        this.fixedLocation = fixedLocation;
        this.packageType = packageType;
    }

    private PackageIssueArgs() {
        this.affectedLocation = Input.empty();
        this.fixedLocation = Input.empty();
        this.packageType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VulnerabilityLocationArgs> affectedLocation;
        private @Nullable Input<VulnerabilityLocationArgs> fixedLocation;
        private @Nullable Input<String> packageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedLocation = defaults.affectedLocation;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.packageType = defaults.packageType;
        }

        public Builder setAffectedLocation(Input<VulnerabilityLocationArgs> affectedLocation) {
            this.affectedLocation = Objects.requireNonNull(affectedLocation);
            return this;
        }

        public Builder setAffectedLocation(VulnerabilityLocationArgs affectedLocation) {
            this.affectedLocation = Input.of(Objects.requireNonNull(affectedLocation));
            return this;
        }

        public Builder setFixedLocation(@Nullable Input<VulnerabilityLocationArgs> fixedLocation) {
            this.fixedLocation = fixedLocation;
            return this;
        }

        public Builder setFixedLocation(@Nullable VulnerabilityLocationArgs fixedLocation) {
            this.fixedLocation = Input.ofNullable(fixedLocation);
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

        public PackageIssueArgs build() {
            return new PackageIssueArgs(affectedLocation, fixedLocation, packageType);
        }
    }
}
