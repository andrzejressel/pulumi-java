// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOpenIdConnectProviderResult {
    /**
     * Client ID of developer console which is the client application.
     * 
     */
    private final String clientId;
    /**
     * Client Secret of developer console which is the client application.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * User-friendly description of OpenID Connect Provider.
     * 
     */
    private final @Nullable String description;
    /**
     * User-friendly OpenID Connect Provider name.
     * 
     */
    private final String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Metadata endpoint URI.
     * 
     */
    private final String metadataEndpoint;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetOpenIdConnectProviderResult(
        @OutputCustomType.Parameter("clientId") String clientId,
        @OutputCustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("metadataEndpoint") String metadataEndpoint,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.metadataEndpoint = metadataEndpoint;
        this.name = name;
        this.type = type;
    }

    /**
     * Client ID of developer console which is the client application.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Client Secret of developer console which is the client application.
     * 
    */
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * User-friendly description of OpenID Connect Provider.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * User-friendly OpenID Connect Provider name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Metadata endpoint URI.
     * 
    */
    public String getMetadataEndpoint() {
        return this.metadataEndpoint;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenIdConnectProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private @Nullable String clientSecret;
        private @Nullable String description;
        private String displayName;
        private String id;
        private String metadataEndpoint;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOpenIdConnectProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.metadataEndpoint = defaults.metadataEndpoint;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMetadataEndpoint(String metadataEndpoint) {
            this.metadataEndpoint = Objects.requireNonNull(metadataEndpoint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetOpenIdConnectProviderResult build() {
            return new GetOpenIdConnectProviderResult(clientId, clientSecret, description, displayName, id, metadataEndpoint, name, type);
        }
    }
}
