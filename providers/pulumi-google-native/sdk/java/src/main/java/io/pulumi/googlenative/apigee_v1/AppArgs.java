// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * List of API products associated with the developer app.
     * 
     */
    @InputImport(name="apiProducts")
    private final @Nullable Input<List<String>> apiProducts;

    public Input<List<String>> getApiProducts() {
        return this.apiProducts == null ? Input.empty() : this.apiProducts;
    }

    /**
     * Developer app family.
     * 
     */
    @InputImport(name="appFamily")
    private final @Nullable Input<String> appFamily;

    public Input<String> getAppFamily() {
        return this.appFamily == null ? Input.empty() : this.appFamily;
    }

    /**
     * ID of the developer app.
     * 
     */
    @InputImport(name="appId")
    private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * List of attributes for the developer app.
     * 
     */
    @InputImport(name="attributes")
    private final @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes;

    public Input<List<GoogleCloudApigeeV1AttributeArgs>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to developer apps.
     * 
     */
    @InputImport(name="callbackUrl")
    private final @Nullable Input<String> callbackUrl;

    public Input<String> getCallbackUrl() {
        return this.callbackUrl == null ? Input.empty() : this.callbackUrl;
    }

    /**
     * ID of the developer.
     * 
     */
    @InputImport(name="developerId", required=true)
    private final Input<String> developerId;

    public Input<String> getDeveloperId() {
        return this.developerId;
    }

    /**
     * Expiration time, in milliseconds, for the consumer key that is generated for the developer app. If not set or left to the default value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
     * 
     */
    @InputImport(name="keyExpiresIn")
    private final @Nullable Input<String> keyExpiresIn;

    public Input<String> getKeyExpiresIn() {
        return this.keyExpiresIn == null ? Input.empty() : this.keyExpiresIn;
    }

    /**
     * Name of the developer app.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Scopes to apply to the developer app. The specified scopes must already exist for the API product that you associate with the developer app.
     * 
     */
    @InputImport(name="scopes")
    private final @Nullable Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public AppArgs(
        @Nullable Input<List<String>> apiProducts,
        @Nullable Input<String> appFamily,
        @Nullable Input<String> appId,
        @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes,
        @Nullable Input<String> callbackUrl,
        Input<String> developerId,
        @Nullable Input<String> keyExpiresIn,
        @Nullable Input<String> name,
        Input<String> organizationId,
        @Nullable Input<List<String>> scopes,
        @Nullable Input<String> status) {
        this.apiProducts = apiProducts;
        this.appFamily = appFamily;
        this.appId = appId;
        this.attributes = attributes;
        this.callbackUrl = callbackUrl;
        this.developerId = Objects.requireNonNull(developerId, "expected parameter 'developerId' to be non-null");
        this.keyExpiresIn = keyExpiresIn;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.scopes = scopes;
        this.status = status;
    }

    private AppArgs() {
        this.apiProducts = Input.empty();
        this.appFamily = Input.empty();
        this.appId = Input.empty();
        this.attributes = Input.empty();
        this.callbackUrl = Input.empty();
        this.developerId = Input.empty();
        this.keyExpiresIn = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.scopes = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> apiProducts;
        private @Nullable Input<String> appFamily;
        private @Nullable Input<String> appId;
        private @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes;
        private @Nullable Input<String> callbackUrl;
        private Input<String> developerId;
        private @Nullable Input<String> keyExpiresIn;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private @Nullable Input<List<String>> scopes;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProducts = defaults.apiProducts;
    	      this.appFamily = defaults.appFamily;
    	      this.appId = defaults.appId;
    	      this.attributes = defaults.attributes;
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.developerId = defaults.developerId;
    	      this.keyExpiresIn = defaults.keyExpiresIn;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.scopes = defaults.scopes;
    	      this.status = defaults.status;
        }

        public Builder setApiProducts(@Nullable Input<List<String>> apiProducts) {
            this.apiProducts = apiProducts;
            return this;
        }

        public Builder setApiProducts(@Nullable List<String> apiProducts) {
            this.apiProducts = Input.ofNullable(apiProducts);
            return this;
        }

        public Builder setAppFamily(@Nullable Input<String> appFamily) {
            this.appFamily = appFamily;
            return this;
        }

        public Builder setAppFamily(@Nullable String appFamily) {
            this.appFamily = Input.ofNullable(appFamily);
            return this;
        }

        public Builder setAppId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder setAttributes(@Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable List<GoogleCloudApigeeV1AttributeArgs> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setCallbackUrl(@Nullable Input<String> callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public Builder setCallbackUrl(@Nullable String callbackUrl) {
            this.callbackUrl = Input.ofNullable(callbackUrl);
            return this;
        }

        public Builder setDeveloperId(Input<String> developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }

        public Builder setDeveloperId(String developerId) {
            this.developerId = Input.of(Objects.requireNonNull(developerId));
            return this;
        }

        public Builder setKeyExpiresIn(@Nullable Input<String> keyExpiresIn) {
            this.keyExpiresIn = keyExpiresIn;
            return this;
        }

        public Builder setKeyExpiresIn(@Nullable String keyExpiresIn) {
            this.keyExpiresIn = Input.ofNullable(keyExpiresIn);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setScopes(@Nullable Input<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public AppArgs build() {
            return new AppArgs(apiProducts, appFamily, appId, attributes, callbackUrl, developerId, keyExpiresIn, name, organizationId, scopes, status);
        }
    }
}
