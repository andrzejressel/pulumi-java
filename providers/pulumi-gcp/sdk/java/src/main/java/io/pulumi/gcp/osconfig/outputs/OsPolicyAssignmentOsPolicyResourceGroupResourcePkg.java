// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkg {
    /**
     * An Apt Repository.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt apt;
    /**
     * A deb package file.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb deb;
    /**
     * Required. The desired state the agent should maintain for this package. Possible values: DESIRED_STATE_UNSPECIFIED, INSTALLED, REMOVED
     * 
     */
    private final String desiredState;
    /**
     * A package managed by GooGet.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget googet;
    /**
     * An MSI package.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi msi;
    /**
     * An rpm package file.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm rpm;
    /**
     * A Yum Repository.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum yum;
    /**
     * A Zypper Repository.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper zypper;

    @OutputCustomType.Constructor({"apt","deb","desiredState","googet","msi","rpm","yum","zypper"})
    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkg(
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt apt,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb deb,
        String desiredState,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget googet,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi msi,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm rpm,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum yum,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper zypper) {
        this.apt = apt;
        this.deb = deb;
        this.desiredState = Objects.requireNonNull(desiredState);
        this.googet = googet;
        this.msi = msi;
        this.rpm = rpm;
        this.yum = yum;
        this.zypper = zypper;
    }

    /**
     * An Apt Repository.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt> getApt() {
        return Optional.ofNullable(this.apt);
    }
    /**
     * A deb package file.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb> getDeb() {
        return Optional.ofNullable(this.deb);
    }
    /**
     * Required. The desired state the agent should maintain for this package. Possible values: DESIRED_STATE_UNSPECIFIED, INSTALLED, REMOVED
     * 
     */
    public String getDesiredState() {
        return this.desiredState;
    }
    /**
     * A package managed by GooGet.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget> getGooget() {
        return Optional.ofNullable(this.googet);
    }
    /**
     * An MSI package.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi> getMsi() {
        return Optional.ofNullable(this.msi);
    }
    /**
     * An rpm package file.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm> getRpm() {
        return Optional.ofNullable(this.rpm);
    }
    /**
     * A Yum Repository.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum> getYum() {
        return Optional.ofNullable(this.yum);
    }
    /**
     * A Zypper Repository.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper> getZypper() {
        return Optional.ofNullable(this.zypper);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkg defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt apt;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb deb;
        private String desiredState;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget googet;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi msi;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm rpm;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum yum;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkg defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.deb = defaults.deb;
    	      this.desiredState = defaults.desiredState;
    	      this.googet = defaults.googet;
    	      this.msi = defaults.msi;
    	      this.rpm = defaults.rpm;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder setApt(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt apt) {
            this.apt = apt;
            return this;
        }

        public Builder setDeb(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb deb) {
            this.deb = deb;
            return this;
        }

        public Builder setDesiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder setGooget(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget googet) {
            this.googet = googet;
            return this;
        }

        public Builder setMsi(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi msi) {
            this.msi = msi;
            return this;
        }

        public Builder setRpm(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm rpm) {
            this.rpm = rpm;
            return this;
        }

        public Builder setYum(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum yum) {
            this.yum = yum;
            return this;
        }

        public Builder setZypper(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper zypper) {
            this.zypper = zypper;
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkg build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkg(apt, deb, desiredState, googet, msi, rpm, yum, zypper);
        }
    }
}
