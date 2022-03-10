// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLabResult {
    /**
     * Object id of the user that created the lab.
     * 
     */
    private final String createdByObjectId;
    /**
     * Lab creator name
     * 
     */
    private final String createdByUserPrincipalName;
    /**
     * Creation date for the lab
     * 
     */
    private final String createdDate;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Invitation code that users can use to join a lab.
     * 
     */
    private final String invitationCode;
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Maximum number of users allowed in the lab.
     * 
     */
    private final @Nullable Integer maxUsersInLab;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;
    /**
     * Maximum duration a user can use an environment for in the lab.
     * 
     */
    private final @Nullable String usageQuota;
    /**
     * Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    private final @Nullable String userAccessMode;
    /**
     * Maximum value MaxUsersInLab can be set to, as specified by the service
     * 
     */
    private final Integer userQuota;

    @OutputCustomType.Constructor
    private GetLabResult(
        @OutputCustomType.Parameter("createdByObjectId") String createdByObjectId,
        @OutputCustomType.Parameter("createdByUserPrincipalName") String createdByUserPrincipalName,
        @OutputCustomType.Parameter("createdDate") String createdDate,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("invitationCode") String invitationCode,
        @OutputCustomType.Parameter("latestOperationResult") LatestOperationResultResponse latestOperationResult,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("maxUsersInLab") @Nullable Integer maxUsersInLab,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uniqueIdentifier") @Nullable String uniqueIdentifier,
        @OutputCustomType.Parameter("usageQuota") @Nullable String usageQuota,
        @OutputCustomType.Parameter("userAccessMode") @Nullable String userAccessMode,
        @OutputCustomType.Parameter("userQuota") Integer userQuota) {
        this.createdByObjectId = createdByObjectId;
        this.createdByUserPrincipalName = createdByUserPrincipalName;
        this.createdDate = createdDate;
        this.id = id;
        this.invitationCode = invitationCode;
        this.latestOperationResult = latestOperationResult;
        this.location = location;
        this.maxUsersInLab = maxUsersInLab;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
        this.usageQuota = usageQuota;
        this.userAccessMode = userAccessMode;
        this.userQuota = userQuota;
    }

    /**
     * Object id of the user that created the lab.
     * 
    */
    public String getCreatedByObjectId() {
        return this.createdByObjectId;
    }
    /**
     * Lab creator name
     * 
    */
    public String getCreatedByUserPrincipalName() {
        return this.createdByUserPrincipalName;
    }
    /**
     * Creation date for the lab
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Invitation code that users can use to join a lab.
     * 
    */
    public String getInvitationCode() {
        return this.invitationCode;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
    */
    public LatestOperationResultResponse getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Maximum number of users allowed in the lab.
     * 
    */
    public Optional<Integer> getMaxUsersInLab() {
        return Optional.ofNullable(this.maxUsersInLab);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The tags of the resource.
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
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public Optional<String> getUniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }
    /**
     * Maximum duration a user can use an environment for in the lab.
     * 
    */
    public Optional<String> getUsageQuota() {
        return Optional.ofNullable(this.usageQuota);
    }
    /**
     * Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
    */
    public Optional<String> getUserAccessMode() {
        return Optional.ofNullable(this.userAccessMode);
    }
    /**
     * Maximum value MaxUsersInLab can be set to, as specified by the service
     * 
    */
    public Integer getUserQuota() {
        return this.userQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdByObjectId;
        private String createdByUserPrincipalName;
        private String createdDate;
        private String id;
        private String invitationCode;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private @Nullable Integer maxUsersInLab;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String uniqueIdentifier;
        private @Nullable String usageQuota;
        private @Nullable String userAccessMode;
        private Integer userQuota;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdByObjectId = defaults.createdByObjectId;
    	      this.createdByUserPrincipalName = defaults.createdByUserPrincipalName;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.invitationCode = defaults.invitationCode;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.maxUsersInLab = defaults.maxUsersInLab;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.usageQuota = defaults.usageQuota;
    	      this.userAccessMode = defaults.userAccessMode;
    	      this.userQuota = defaults.userQuota;
        }

        public Builder setCreatedByObjectId(String createdByObjectId) {
            this.createdByObjectId = Objects.requireNonNull(createdByObjectId);
            return this;
        }

        public Builder setCreatedByUserPrincipalName(String createdByUserPrincipalName) {
            this.createdByUserPrincipalName = Objects.requireNonNull(createdByUserPrincipalName);
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInvitationCode(String invitationCode) {
            this.invitationCode = Objects.requireNonNull(invitationCode);
            return this;
        }

        public Builder setLatestOperationResult(LatestOperationResultResponse latestOperationResult) {
            this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMaxUsersInLab(@Nullable Integer maxUsersInLab) {
            this.maxUsersInLab = maxUsersInLab;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
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

        public Builder setUniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        public Builder setUsageQuota(@Nullable String usageQuota) {
            this.usageQuota = usageQuota;
            return this;
        }

        public Builder setUserAccessMode(@Nullable String userAccessMode) {
            this.userAccessMode = userAccessMode;
            return this;
        }

        public Builder setUserQuota(Integer userQuota) {
            this.userQuota = Objects.requireNonNull(userQuota);
            return this;
        }
        public GetLabResult build() {
            return new GetLabResult(createdByObjectId, createdByUserPrincipalName, createdDate, id, invitationCode, latestOperationResult, location, maxUsersInLab, name, provisioningState, tags, type, uniqueIdentifier, usageQuota, userAccessMode, userQuota);
        }
    }
}
