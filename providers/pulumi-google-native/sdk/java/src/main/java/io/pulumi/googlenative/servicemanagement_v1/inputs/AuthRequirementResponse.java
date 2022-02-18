// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * User-defined authentication requirements, including support for [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * 
 */
public final class AuthRequirementResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthRequirementResponse Empty = new AuthRequirementResponse();

    /**
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience "https://Service_name/API_name" will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience "https://library-example.googleapis.com/google.example.library.v1.LibraryService". Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    @InputImport(name="audiences", required=true)
    private final String audiences;

    public String getAudiences() {
        return this.audiences;
    }

    /**
     * id from authentication provider. Example: provider_id: bookstore_auth
     * 
     */
    @InputImport(name="providerId", required=true)
    private final String providerId;

    public String getProviderId() {
        return this.providerId;
    }

    public AuthRequirementResponse(
        String audiences,
        String providerId) {
        this.audiences = Objects.requireNonNull(audiences, "expected parameter 'audiences' to be non-null");
        this.providerId = Objects.requireNonNull(providerId, "expected parameter 'providerId' to be non-null");
    }

    private AuthRequirementResponse() {
        this.audiences = null;
        this.providerId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthRequirementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audiences;
        private String providerId;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthRequirementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.providerId = defaults.providerId;
        }

        public Builder setAudiences(String audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder setProviderId(String providerId) {
            this.providerId = Objects.requireNonNull(providerId);
            return this;
        }

        public AuthRequirementResponse build() {
            return new AuthRequirementResponse(audiences, providerId);
        }
    }
}
