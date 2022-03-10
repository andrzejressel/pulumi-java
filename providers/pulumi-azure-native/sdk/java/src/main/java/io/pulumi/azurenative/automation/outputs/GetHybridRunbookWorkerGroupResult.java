// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.HybridRunbookWorkerLegacyResponse;
import io.pulumi.azurenative.automation.outputs.RunAsCredentialAssociationPropertyResponse;
import io.pulumi.azurenative.automation.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHybridRunbookWorkerGroupResult {
    /**
     * Sets the credential of a worker group.
     * 
     */
    private final @Nullable RunAsCredentialAssociationPropertyResponse credential;
    /**
     * Type of the HybridWorkerGroup.
     * 
     */
    private final @Nullable String groupType;
    /**
     * Gets or sets the list of hybrid runbook workers.
     * 
     */
    private final @Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers;
    /**
     * Gets or sets the id of the resource.
     * 
     */
    private final @Nullable String id;
    /**
     * Gets or sets the name of the group.
     * 
     */
    private final @Nullable String name;
    /**
     * Resource system metadata.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetHybridRunbookWorkerGroupResult(
        @OutputCustomType.Parameter("credential") @Nullable RunAsCredentialAssociationPropertyResponse credential,
        @OutputCustomType.Parameter("groupType") @Nullable String groupType,
        @OutputCustomType.Parameter("hybridRunbookWorkers") @Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.credential = credential;
        this.groupType = groupType;
        this.hybridRunbookWorkers = hybridRunbookWorkers;
        this.id = id;
        this.name = name;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Sets the credential of a worker group.
     * 
    */
    public Optional<RunAsCredentialAssociationPropertyResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Type of the HybridWorkerGroup.
     * 
    */
    public Optional<String> getGroupType() {
        return Optional.ofNullable(this.groupType);
    }
    /**
     * Gets or sets the list of hybrid runbook workers.
     * 
    */
    public List<HybridRunbookWorkerLegacyResponse> getHybridRunbookWorkers() {
        return this.hybridRunbookWorkers == null ? List.of() : this.hybridRunbookWorkers;
    }
    /**
     * Gets or sets the id of the resource.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Gets or sets the name of the group.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Resource system metadata.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridRunbookWorkerGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RunAsCredentialAssociationPropertyResponse credential;
        private @Nullable String groupType;
        private @Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers;
        private @Nullable String id;
        private @Nullable String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridRunbookWorkerGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.groupType = defaults.groupType;
    	      this.hybridRunbookWorkers = defaults.hybridRunbookWorkers;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCredential(@Nullable RunAsCredentialAssociationPropertyResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setGroupType(@Nullable String groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder setHybridRunbookWorkers(@Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers) {
            this.hybridRunbookWorkers = hybridRunbookWorkers;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetHybridRunbookWorkerGroupResult build() {
            return new GetHybridRunbookWorkerGroupResult(credential, groupType, hybridRunbookWorkers, id, name, systemData, type);
        }
    }
}
