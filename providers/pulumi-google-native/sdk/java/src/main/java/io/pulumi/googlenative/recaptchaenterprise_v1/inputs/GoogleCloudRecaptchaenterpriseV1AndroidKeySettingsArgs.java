// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings specific to keys that can be used by Android apps.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs Empty = new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs();

    /**
     * If set to true, allowed_package_names are not enforced.
     * 
     */
    @InputImport(name="allowAllPackageNames")
    private final @Nullable Input<Boolean> allowAllPackageNames;

    public Input<Boolean> getAllowAllPackageNames() {
        return this.allowAllPackageNames == null ? Input.empty() : this.allowAllPackageNames;
    }

    /**
     * Android package names of apps allowed to use the key. Example: 'com.companyname.appname'
     * 
     */
    @InputImport(name="allowedPackageNames")
    private final @Nullable Input<List<String>> allowedPackageNames;

    public Input<List<String>> getAllowedPackageNames() {
        return this.allowedPackageNames == null ? Input.empty() : this.allowedPackageNames;
    }

    public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs(
        @Nullable Input<Boolean> allowAllPackageNames,
        @Nullable Input<List<String>> allowedPackageNames) {
        this.allowAllPackageNames = allowAllPackageNames;
        this.allowedPackageNames = allowedPackageNames;
    }

    private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs() {
        this.allowAllPackageNames = Input.empty();
        this.allowedPackageNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowAllPackageNames;
        private @Nullable Input<List<String>> allowedPackageNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        public Builder setAllowAllPackageNames(@Nullable Input<Boolean> allowAllPackageNames) {
            this.allowAllPackageNames = allowAllPackageNames;
            return this;
        }

        public Builder setAllowAllPackageNames(@Nullable Boolean allowAllPackageNames) {
            this.allowAllPackageNames = Input.ofNullable(allowAllPackageNames);
            return this;
        }

        public Builder setAllowedPackageNames(@Nullable Input<List<String>> allowedPackageNames) {
            this.allowedPackageNames = allowedPackageNames;
            return this;
        }

        public Builder setAllowedPackageNames(@Nullable List<String> allowedPackageNames) {
            this.allowedPackageNames = Input.ofNullable(allowedPackageNames);
            return this;
        }

        public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs build() {
            return new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs(allowAllPackageNames, allowedPackageNames);
        }
    }
}
