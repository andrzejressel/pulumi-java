// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Redirects a shopper to a specific page. * Rule Condition: - Must specify Condition. * Action Input: Request Query * Action Result: Redirects shopper to provided uri.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleRedirectActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleRedirectActionArgs Empty = new GoogleCloudRetailV2alphaRuleRedirectActionArgs();

    /**
     * URL must have length equal or less than 2000 characters.
     * 
     */
    @InputImport(name="redirectUri")
    private final @Nullable Input<String> redirectUri;

    public Input<String> getRedirectUri() {
        return this.redirectUri == null ? Input.empty() : this.redirectUri;
    }

    public GoogleCloudRetailV2alphaRuleRedirectActionArgs(@Nullable Input<String> redirectUri) {
        this.redirectUri = redirectUri;
    }

    private GoogleCloudRetailV2alphaRuleRedirectActionArgs() {
        this.redirectUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleRedirectActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> redirectUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleRedirectActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectUri = defaults.redirectUri;
        }

        public Builder setRedirectUri(@Nullable Input<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public Builder setRedirectUri(@Nullable String redirectUri) {
            this.redirectUri = Input.ofNullable(redirectUri);
            return this;
        }

        public GoogleCloudRetailV2alphaRuleRedirectActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleRedirectActionArgs(redirectUri);
        }
    }
}
