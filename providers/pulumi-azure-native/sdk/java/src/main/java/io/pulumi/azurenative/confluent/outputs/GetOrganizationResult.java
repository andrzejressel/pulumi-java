// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confluent.outputs;

import io.pulumi.azurenative.confluent.outputs.OrganizationResourcePropertiesResponseOfferDetail;
import io.pulumi.azurenative.confluent.outputs.OrganizationResourcePropertiesResponseUserDetail;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOrganizationResult {
    /**
     * The creation time of the resource.
     * 
     */
    private final String createdTime;
    /**
     * The ARM id of the resource.
     * 
     */
    private final String id;
    /**
     * Location of Organization resource
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Confluent offer detail
     * 
     */
    private final @Nullable OrganizationResourcePropertiesResponseOfferDetail offerDetail;
    /**
     * Id of the Confluent organization.
     * 
     */
    private final String organizationId;
    /**
     * Provision states for confluent RP
     * 
     */
    private final String provisioningState;
    /**
     * SSO url for the Confluent organization.
     * 
     */
    private final String ssoUrl;
    /**
     * Organization resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Subscriber detail
     * 
     */
    private final @Nullable OrganizationResourcePropertiesResponseUserDetail userDetail;

    @OutputCustomType.Constructor
    private GetOrganizationResult(
        @OutputCustomType.Parameter("createdTime") String createdTime,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("offerDetail") @Nullable OrganizationResourcePropertiesResponseOfferDetail offerDetail,
        @OutputCustomType.Parameter("organizationId") String organizationId,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("ssoUrl") String ssoUrl,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userDetail") @Nullable OrganizationResourcePropertiesResponseUserDetail userDetail) {
        this.createdTime = createdTime;
        this.id = id;
        this.location = location;
        this.name = name;
        this.offerDetail = offerDetail;
        this.organizationId = organizationId;
        this.provisioningState = provisioningState;
        this.ssoUrl = ssoUrl;
        this.tags = tags;
        this.type = type;
        this.userDetail = userDetail;
    }

    /**
     * The creation time of the resource.
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The ARM id of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Location of Organization resource
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Confluent offer detail
     * 
    */
    public Optional<OrganizationResourcePropertiesResponseOfferDetail> getOfferDetail() {
        return Optional.ofNullable(this.offerDetail);
    }
    /**
     * Id of the Confluent organization.
     * 
    */
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Provision states for confluent RP
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SSO url for the Confluent organization.
     * 
    */
    public String getSsoUrl() {
        return this.ssoUrl;
    }
    /**
     * Organization resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Subscriber detail
     * 
    */
    public Optional<OrganizationResourcePropertiesResponseUserDetail> getUserDetail() {
        return Optional.ofNullable(this.userDetail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdTime;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable OrganizationResourcePropertiesResponseOfferDetail offerDetail;
        private String organizationId;
        private String provisioningState;
        private String ssoUrl;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable OrganizationResourcePropertiesResponseUserDetail userDetail;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.offerDetail = defaults.offerDetail;
    	      this.organizationId = defaults.organizationId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.ssoUrl = defaults.ssoUrl;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userDetail = defaults.userDetail;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOfferDetail(@Nullable OrganizationResourcePropertiesResponseOfferDetail offerDetail) {
            this.offerDetail = offerDetail;
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSsoUrl(String ssoUrl) {
            this.ssoUrl = Objects.requireNonNull(ssoUrl);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserDetail(@Nullable OrganizationResourcePropertiesResponseUserDetail userDetail) {
            this.userDetail = userDetail;
            return this;
        }
        public GetOrganizationResult build() {
            return new GetOrganizationResult(createdTime, id, location, name, offerDetail, organizationId, provisioningState, ssoUrl, tags, type, userDetail);
        }
    }
}
