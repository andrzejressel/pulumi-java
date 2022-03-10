// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.azurenative.redhatopenshift.outputs.APIServerProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.ClusterProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.ConsoleProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.IngressProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.MasterProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.ServicePrincipalProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.WorkerProfileResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOpenShiftClusterResult {
    /**
     * The cluster API server profile.
     * 
     */
    private final @Nullable APIServerProfileResponse apiserverProfile;
    /**
     * The cluster profile.
     * 
     */
    private final @Nullable ClusterProfileResponse clusterProfile;
    /**
     * The console profile.
     * 
     */
    private final @Nullable ConsoleProfileResponse consoleProfile;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The cluster ingress profiles.
     * 
     */
    private final @Nullable List<IngressProfileResponse> ingressProfiles;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The cluster master profile.
     * 
     */
    private final @Nullable MasterProfileResponse masterProfile;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The cluster network profile.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * The cluster provisioning state (immutable).
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The cluster service principal profile.
     * 
     */
    private final @Nullable ServicePrincipalProfileResponse servicePrincipalProfile;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The cluster worker profiles.
     * 
     */
    private final @Nullable List<WorkerProfileResponse> workerProfiles;

    @OutputCustomType.Constructor
    private GetOpenShiftClusterResult(
        @OutputCustomType.Parameter("apiserverProfile") @Nullable APIServerProfileResponse apiserverProfile,
        @OutputCustomType.Parameter("clusterProfile") @Nullable ClusterProfileResponse clusterProfile,
        @OutputCustomType.Parameter("consoleProfile") @Nullable ConsoleProfileResponse consoleProfile,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ingressProfiles") @Nullable List<IngressProfileResponse> ingressProfiles,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("masterProfile") @Nullable MasterProfileResponse masterProfile,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("servicePrincipalProfile") @Nullable ServicePrincipalProfileResponse servicePrincipalProfile,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("workerProfiles") @Nullable List<WorkerProfileResponse> workerProfiles) {
        this.apiserverProfile = apiserverProfile;
        this.clusterProfile = clusterProfile;
        this.consoleProfile = consoleProfile;
        this.id = id;
        this.ingressProfiles = ingressProfiles;
        this.location = location;
        this.masterProfile = masterProfile;
        this.name = name;
        this.networkProfile = networkProfile;
        this.provisioningState = provisioningState;
        this.servicePrincipalProfile = servicePrincipalProfile;
        this.tags = tags;
        this.type = type;
        this.workerProfiles = workerProfiles;
    }

    /**
     * The cluster API server profile.
     * 
    */
    public Optional<APIServerProfileResponse> getApiserverProfile() {
        return Optional.ofNullable(this.apiserverProfile);
    }
    /**
     * The cluster profile.
     * 
    */
    public Optional<ClusterProfileResponse> getClusterProfile() {
        return Optional.ofNullable(this.clusterProfile);
    }
    /**
     * The console profile.
     * 
    */
    public Optional<ConsoleProfileResponse> getConsoleProfile() {
        return Optional.ofNullable(this.consoleProfile);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The cluster ingress profiles.
     * 
    */
    public List<IngressProfileResponse> getIngressProfiles() {
        return this.ingressProfiles == null ? List.of() : this.ingressProfiles;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The cluster master profile.
     * 
    */
    public Optional<MasterProfileResponse> getMasterProfile() {
        return Optional.ofNullable(this.masterProfile);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The cluster network profile.
     * 
    */
    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * The cluster provisioning state (immutable).
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The cluster service principal profile.
     * 
    */
    public Optional<ServicePrincipalProfileResponse> getServicePrincipalProfile() {
        return Optional.ofNullable(this.servicePrincipalProfile);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The cluster worker profiles.
     * 
    */
    public List<WorkerProfileResponse> getWorkerProfiles() {
        return this.workerProfiles == null ? List.of() : this.workerProfiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenShiftClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable APIServerProfileResponse apiserverProfile;
        private @Nullable ClusterProfileResponse clusterProfile;
        private @Nullable ConsoleProfileResponse consoleProfile;
        private String id;
        private @Nullable List<IngressProfileResponse> ingressProfiles;
        private String location;
        private @Nullable MasterProfileResponse masterProfile;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private @Nullable String provisioningState;
        private @Nullable ServicePrincipalProfileResponse servicePrincipalProfile;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<WorkerProfileResponse> workerProfiles;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOpenShiftClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiserverProfile = defaults.apiserverProfile;
    	      this.clusterProfile = defaults.clusterProfile;
    	      this.consoleProfile = defaults.consoleProfile;
    	      this.id = defaults.id;
    	      this.ingressProfiles = defaults.ingressProfiles;
    	      this.location = defaults.location;
    	      this.masterProfile = defaults.masterProfile;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.servicePrincipalProfile = defaults.servicePrincipalProfile;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.workerProfiles = defaults.workerProfiles;
        }

        public Builder setApiserverProfile(@Nullable APIServerProfileResponse apiserverProfile) {
            this.apiserverProfile = apiserverProfile;
            return this;
        }

        public Builder setClusterProfile(@Nullable ClusterProfileResponse clusterProfile) {
            this.clusterProfile = clusterProfile;
            return this;
        }

        public Builder setConsoleProfile(@Nullable ConsoleProfileResponse consoleProfile) {
            this.consoleProfile = consoleProfile;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIngressProfiles(@Nullable List<IngressProfileResponse> ingressProfiles) {
            this.ingressProfiles = ingressProfiles;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMasterProfile(@Nullable MasterProfileResponse masterProfile) {
            this.masterProfile = masterProfile;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setServicePrincipalProfile(@Nullable ServicePrincipalProfileResponse servicePrincipalProfile) {
            this.servicePrincipalProfile = servicePrincipalProfile;
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

        public Builder setWorkerProfiles(@Nullable List<WorkerProfileResponse> workerProfiles) {
            this.workerProfiles = workerProfiles;
            return this;
        }
        public GetOpenShiftClusterResult build() {
            return new GetOpenShiftClusterResult(apiserverProfile, clusterProfile, consoleProfile, id, ingressProfiles, location, masterProfile, name, networkProfile, provisioningState, servicePrincipalProfile, tags, type, workerProfiles);
        }
    }
}
