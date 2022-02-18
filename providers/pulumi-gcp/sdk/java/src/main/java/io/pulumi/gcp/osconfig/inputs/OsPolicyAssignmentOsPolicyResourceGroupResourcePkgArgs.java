// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs();

    /**
     * An Apt Repository.
     * 
     */
    @InputImport(name="apt")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs> apt;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs> getApt() {
        return this.apt == null ? Input.empty() : this.apt;
    }

    /**
     * A deb package file.
     * 
     */
    @InputImport(name="deb")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs> deb;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs> getDeb() {
        return this.deb == null ? Input.empty() : this.deb;
    }

    /**
     * Required. The desired state the agent should maintain for this package. Possible values: DESIRED_STATE_UNSPECIFIED, INSTALLED, REMOVED
     * 
     */
    @InputImport(name="desiredState", required=true)
    private final Input<String> desiredState;

    public Input<String> getDesiredState() {
        return this.desiredState;
    }

    /**
     * A package managed by GooGet.
     * 
     */
    @InputImport(name="googet")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs> googet;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs> getGooget() {
        return this.googet == null ? Input.empty() : this.googet;
    }

    /**
     * An MSI package.
     * 
     */
    @InputImport(name="msi")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs> msi;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs> getMsi() {
        return this.msi == null ? Input.empty() : this.msi;
    }

    /**
     * An rpm package file.
     * 
     */
    @InputImport(name="rpm")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs> rpm;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs> getRpm() {
        return this.rpm == null ? Input.empty() : this.rpm;
    }

    /**
     * A Yum Repository.
     * 
     */
    @InputImport(name="yum")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs> yum;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs> getYum() {
        return this.yum == null ? Input.empty() : this.yum;
    }

    /**
     * A Zypper Repository.
     * 
     */
    @InputImport(name="zypper")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs> zypper;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs> getZypper() {
        return this.zypper == null ? Input.empty() : this.zypper;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs(
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs> apt,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs> deb,
        Input<String> desiredState,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs> googet,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs> msi,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs> rpm,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs> yum,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs> zypper) {
        this.apt = apt;
        this.deb = deb;
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.googet = googet;
        this.msi = msi;
        this.rpm = rpm;
        this.yum = yum;
        this.zypper = zypper;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs() {
        this.apt = Input.empty();
        this.deb = Input.empty();
        this.desiredState = Input.empty();
        this.googet = Input.empty();
        this.msi = Input.empty();
        this.rpm = Input.empty();
        this.yum = Input.empty();
        this.zypper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs> apt;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs> deb;
        private Input<String> desiredState;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs> googet;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs> msi;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs> rpm;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs> yum;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs defaults) {
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

        public Builder setApt(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs> apt) {
            this.apt = apt;
            return this;
        }

        public Builder setApt(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs apt) {
            this.apt = Input.ofNullable(apt);
            return this;
        }

        public Builder setDeb(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs> deb) {
            this.deb = deb;
            return this;
        }

        public Builder setDeb(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs deb) {
            this.deb = Input.ofNullable(deb);
            return this;
        }

        public Builder setDesiredState(Input<String> desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder setDesiredState(String desiredState) {
            this.desiredState = Input.of(Objects.requireNonNull(desiredState));
            return this;
        }

        public Builder setGooget(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs> googet) {
            this.googet = googet;
            return this;
        }

        public Builder setGooget(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs googet) {
            this.googet = Input.ofNullable(googet);
            return this;
        }

        public Builder setMsi(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs> msi) {
            this.msi = msi;
            return this;
        }

        public Builder setMsi(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs msi) {
            this.msi = Input.ofNullable(msi);
            return this;
        }

        public Builder setRpm(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs> rpm) {
            this.rpm = rpm;
            return this;
        }

        public Builder setRpm(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs rpm) {
            this.rpm = Input.ofNullable(rpm);
            return this;
        }

        public Builder setYum(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs> yum) {
            this.yum = yum;
            return this;
        }

        public Builder setYum(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs yum) {
            this.yum = Input.ofNullable(yum);
            return this;
        }

        public Builder setZypper(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs> zypper) {
            this.zypper = zypper;
            return this;
        }

        public Builder setZypper(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs zypper) {
            this.zypper = Input.ofNullable(zypper);
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs(apt, deb, desiredState, googet, msi, rpm, yum, zypper);
        }
    }
}
