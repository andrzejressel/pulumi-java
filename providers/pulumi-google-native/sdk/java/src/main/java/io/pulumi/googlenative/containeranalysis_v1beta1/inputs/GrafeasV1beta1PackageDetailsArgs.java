// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.InstallationArgs;
import java.util.Objects;


/**
 * Details of a package occurrence.
 * 
 */
public final class GrafeasV1beta1PackageDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrafeasV1beta1PackageDetailsArgs Empty = new GrafeasV1beta1PackageDetailsArgs();

    /**
     * Where the package was installed.
     * 
     */
    @InputImport(name="installation", required=true)
    private final Input<InstallationArgs> installation;

    public Input<InstallationArgs> getInstallation() {
        return this.installation;
    }

    public GrafeasV1beta1PackageDetailsArgs(Input<InstallationArgs> installation) {
        this.installation = Objects.requireNonNull(installation, "expected parameter 'installation' to be non-null");
    }

    private GrafeasV1beta1PackageDetailsArgs() {
        this.installation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1PackageDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<InstallationArgs> installation;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1PackageDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.installation = defaults.installation;
        }

        public Builder setInstallation(Input<InstallationArgs> installation) {
            this.installation = Objects.requireNonNull(installation);
            return this;
        }

        public Builder setInstallation(InstallationArgs installation) {
            this.installation = Input.of(Objects.requireNonNull(installation));
            return this;
        }

        public GrafeasV1beta1PackageDetailsArgs build() {
            return new GrafeasV1beta1PackageDetailsArgs(installation);
        }
    }
}
