// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information needed for generating an [OAuth token](https://developers.google.com/identity/protocols/OAuth2). This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
 * 
 */
public final class OAuthTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final OAuthTokenArgs Empty = new OAuthTokenArgs();

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified, "https://www.googleapis.com/auth/cloud-platform" will be used.
     * 
     */
    @InputImport(name="scope")
    private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the job. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    public OAuthTokenArgs(
        @Nullable Input<String> scope,
        @Nullable Input<String> serviceAccountEmail) {
        this.scope = scope;
        this.serviceAccountEmail = serviceAccountEmail;
    }

    private OAuthTokenArgs() {
        this.scope = Input.empty();
        this.serviceAccountEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuthTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> scope;
        private @Nullable Input<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuthTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public OAuthTokenArgs build() {
            return new OAuthTokenArgs(scope, serviceAccountEmail);
        }
    }
}
