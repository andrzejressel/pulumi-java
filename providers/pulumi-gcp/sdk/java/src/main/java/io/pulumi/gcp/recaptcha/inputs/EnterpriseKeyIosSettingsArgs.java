// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyIosSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyIosSettingsArgs Empty = new EnterpriseKeyIosSettingsArgs();

    /**
     * If set to true, it means allowed_bundle_ids will not be enforced.
     * 
     */
    @InputImport(name="allowAllBundleIds")
    private final @Nullable Input<Boolean> allowAllBundleIds;

    public Input<Boolean> getAllowAllBundleIds() {
        return this.allowAllBundleIds == null ? Input.empty() : this.allowAllBundleIds;
    }

    /**
     * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
     * 
     */
    @InputImport(name="allowedBundleIds")
    private final @Nullable Input<List<String>> allowedBundleIds;

    public Input<List<String>> getAllowedBundleIds() {
        return this.allowedBundleIds == null ? Input.empty() : this.allowedBundleIds;
    }

    public EnterpriseKeyIosSettingsArgs(
        @Nullable Input<Boolean> allowAllBundleIds,
        @Nullable Input<List<String>> allowedBundleIds) {
        this.allowAllBundleIds = allowAllBundleIds;
        this.allowedBundleIds = allowedBundleIds;
    }

    private EnterpriseKeyIosSettingsArgs() {
        this.allowAllBundleIds = Input.empty();
        this.allowedBundleIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyIosSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowAllBundleIds;
        private @Nullable Input<List<String>> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyIosSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllBundleIds = defaults.allowAllBundleIds;
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder setAllowAllBundleIds(@Nullable Input<Boolean> allowAllBundleIds) {
            this.allowAllBundleIds = allowAllBundleIds;
            return this;
        }

        public Builder setAllowAllBundleIds(@Nullable Boolean allowAllBundleIds) {
            this.allowAllBundleIds = Input.ofNullable(allowAllBundleIds);
            return this;
        }

        public Builder setAllowedBundleIds(@Nullable Input<List<String>> allowedBundleIds) {
            this.allowedBundleIds = allowedBundleIds;
            return this;
        }

        public Builder setAllowedBundleIds(@Nullable List<String> allowedBundleIds) {
            this.allowedBundleIds = Input.ofNullable(allowedBundleIds);
            return this;
        }

        public EnterpriseKeyIosSettingsArgs build() {
            return new EnterpriseKeyIosSettingsArgs(allowAllBundleIds, allowedBundleIds);
        }
    }
}
