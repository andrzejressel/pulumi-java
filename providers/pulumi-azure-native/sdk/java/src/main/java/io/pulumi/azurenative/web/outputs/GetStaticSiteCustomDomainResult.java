// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStaticSiteCustomDomainResult {
    /**
     * The date and time on which the custom domain was created for the static site.
     * 
     */
    private final String createdOn;
    /**
     * The domain name for the static site custom domain.
     * 
     */
    private final String domainName;
    private final String errorMessage;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * The status of the custom domain
     * 
     */
    private final String status;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The TXT record validation token
     * 
     */
    private final String validationToken;

    @OutputCustomType.Constructor
    private GetStaticSiteCustomDomainResult(
        @OutputCustomType.Parameter("createdOn") String createdOn,
        @OutputCustomType.Parameter("domainName") String domainName,
        @OutputCustomType.Parameter("errorMessage") String errorMessage,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("validationToken") String validationToken) {
        this.createdOn = createdOn;
        this.domainName = domainName;
        this.errorMessage = errorMessage;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.status = status;
        this.type = type;
        this.validationToken = validationToken;
    }

    /**
     * The date and time on which the custom domain was created for the static site.
     * 
    */
    public String getCreatedOn() {
        return this.createdOn;
    }
    /**
     * The domain name for the static site custom domain.
     * 
    */
    public String getDomainName() {
        return this.domainName;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The status of the custom domain
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The TXT record validation token
     * 
    */
    public String getValidationToken() {
        return this.validationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticSiteCustomDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdOn;
        private String domainName;
        private String errorMessage;
        private String id;
        private @Nullable String kind;
        private String name;
        private String status;
        private String type;
        private String validationToken;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticSiteCustomDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.domainName = defaults.domainName;
    	      this.errorMessage = defaults.errorMessage;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.validationToken = defaults.validationToken;
        }

        public Builder setCreatedOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValidationToken(String validationToken) {
            this.validationToken = Objects.requireNonNull(validationToken);
            return this;
        }
        public GetStaticSiteCustomDomainResult build() {
            return new GetStaticSiteCustomDomainResult(createdOn, domainName, errorMessage, id, kind, name, status, type, validationToken);
        }
    }
}
