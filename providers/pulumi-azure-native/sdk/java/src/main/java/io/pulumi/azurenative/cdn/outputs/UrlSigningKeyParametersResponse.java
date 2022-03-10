// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UrlSigningKeyParametersResponse {
    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    private final String keyId;
    /**
     * Resource reference to the KV secret
     * 
     */
    private final ResourceReferenceResponse secretSource;
    /**
     * Version of the secret to be used
     * 
     */
    private final @Nullable String secretVersion;
    /**
     * The type of the Secret to create.
     * Expected value is 'UrlSigningKey'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private UrlSigningKeyParametersResponse(
        @OutputCustomType.Parameter("keyId") String keyId,
        @OutputCustomType.Parameter("secretSource") ResourceReferenceResponse secretSource,
        @OutputCustomType.Parameter("secretVersion") @Nullable String secretVersion,
        @OutputCustomType.Parameter("type") String type) {
        this.keyId = keyId;
        this.secretSource = secretSource;
        this.secretVersion = secretVersion;
        this.type = type;
    }

    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
    */
    public String getKeyId() {
        return this.keyId;
    }
    /**
     * Resource reference to the KV secret
     * 
    */
    public ResourceReferenceResponse getSecretSource() {
        return this.secretSource;
    }
    /**
     * Version of the secret to be used
     * 
    */
    public Optional<String> getSecretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }
    /**
     * The type of the Secret to create.
     * Expected value is 'UrlSigningKey'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningKeyParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private ResourceReferenceResponse secretSource;
        private @Nullable String secretVersion;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningKeyParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.secretSource = defaults.secretSource;
    	      this.secretVersion = defaults.secretVersion;
    	      this.type = defaults.type;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setSecretSource(ResourceReferenceResponse secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }

        public Builder setSecretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public UrlSigningKeyParametersResponse build() {
            return new UrlSigningKeyParametersResponse(keyId, secretSource, secretVersion, type);
        }
    }
}
