// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRecaptchaOptionsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRecaptchaOptionsConfigResponse Empty = new SecurityPolicyRecaptchaOptionsConfigResponse();

    /**
     * An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used.
     * 
     */
    @InputImport(name="redirectSiteKey", required=true)
    private final String redirectSiteKey;

    public String getRedirectSiteKey() {
        return this.redirectSiteKey;
    }

    public SecurityPolicyRecaptchaOptionsConfigResponse(String redirectSiteKey) {
        this.redirectSiteKey = Objects.requireNonNull(redirectSiteKey, "expected parameter 'redirectSiteKey' to be non-null");
    }

    private SecurityPolicyRecaptchaOptionsConfigResponse() {
        this.redirectSiteKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRecaptchaOptionsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String redirectSiteKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRecaptchaOptionsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectSiteKey = defaults.redirectSiteKey;
        }

        public Builder setRedirectSiteKey(String redirectSiteKey) {
            this.redirectSiteKey = Objects.requireNonNull(redirectSiteKey);
            return this;
        }

        public SecurityPolicyRecaptchaOptionsConfigResponse build() {
            return new SecurityPolicyRecaptchaOptionsConfigResponse(redirectSiteKey);
        }
    }
}
