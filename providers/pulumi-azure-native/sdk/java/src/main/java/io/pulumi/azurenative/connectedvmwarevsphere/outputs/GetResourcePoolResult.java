// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourcePoolResult {
    /**
     * Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz.
     * Utilization will not exceed this limit even if there are available resources.
     * 
     */
    private final Double cpuLimitMHz;
    /**
     * Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is guaranteed
     * to be available.
     * 
     */
    private final Double cpuReservationMHz;
    /**
     * Gets or sets CPUSharesLevel which specifies the CPU allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    private final String cpuSharesLevel;
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    private final String customResourceName;
    /**
     * Gets or sets the extended location.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Gets or sets the Id.
     * 
     */
    private final String id;
    /**
     * Gets or sets the inventory Item ID for the resource pool.
     * 
     */
    private final @Nullable String inventoryItemId;
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    private final @Nullable String kind;
    /**
     * Gets or sets the location.
     * 
     */
    private final String location;
    /**
     * Gets or sets MemLimitMB specifies a memory usage limit in megabytes.
     * Utilization will not exceed the specified limit even if there are available resources.
     * 
     */
    private final Double memLimitMB;
    /**
     * Gets or sets MemReservationMB which specifies the guaranteed available memory in
     * megabytes.
     * 
     */
    private final Double memReservationMB;
    /**
     * Gets or sets CPUSharesLevel which specifies the memory allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    private final String memSharesLevel;
    /**
     * Gets or sets the vCenter Managed Object name for the resource pool.
     * 
     */
    private final String moName;
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     * 
     */
    private final @Nullable String moRefId;
    /**
     * Gets or sets the name.
     * 
     */
    private final String name;
    /**
     * Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The resource status information.
     * 
     */
    private final List<ResourceStatusResponse> statuses;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Gets or sets the Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets or sets the type of the resource.
     * 
     */
    private final String type;
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    private final String uuid;
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    private final @Nullable String vCenterId;

    @OutputCustomType.Constructor
    private GetResourcePoolResult(
        @OutputCustomType.Parameter("cpuLimitMHz") Double cpuLimitMHz,
        @OutputCustomType.Parameter("cpuReservationMHz") Double cpuReservationMHz,
        @OutputCustomType.Parameter("cpuSharesLevel") String cpuSharesLevel,
        @OutputCustomType.Parameter("customResourceName") String customResourceName,
        @OutputCustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("inventoryItemId") @Nullable String inventoryItemId,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("memLimitMB") Double memLimitMB,
        @OutputCustomType.Parameter("memReservationMB") Double memReservationMB,
        @OutputCustomType.Parameter("memSharesLevel") String memSharesLevel,
        @OutputCustomType.Parameter("moName") String moName,
        @OutputCustomType.Parameter("moRefId") @Nullable String moRefId,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("statuses") List<ResourceStatusResponse> statuses,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uuid") String uuid,
        @OutputCustomType.Parameter("vCenterId") @Nullable String vCenterId) {
        this.cpuLimitMHz = cpuLimitMHz;
        this.cpuReservationMHz = cpuReservationMHz;
        this.cpuSharesLevel = cpuSharesLevel;
        this.customResourceName = customResourceName;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.inventoryItemId = inventoryItemId;
        this.kind = kind;
        this.location = location;
        this.memLimitMB = memLimitMB;
        this.memReservationMB = memReservationMB;
        this.memSharesLevel = memSharesLevel;
        this.moName = moName;
        this.moRefId = moRefId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.statuses = statuses;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.uuid = uuid;
        this.vCenterId = vCenterId;
    }

    /**
     * Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz.
     * Utilization will not exceed this limit even if there are available resources.
     * 
    */
    public Double getCpuLimitMHz() {
        return this.cpuLimitMHz;
    }
    /**
     * Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is guaranteed
     * to be available.
     * 
    */
    public Double getCpuReservationMHz() {
        return this.cpuReservationMHz;
    }
    /**
     * Gets or sets CPUSharesLevel which specifies the CPU allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
    */
    public String getCpuSharesLevel() {
        return this.cpuSharesLevel;
    }
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
    */
    public String getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Gets or sets the Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the inventory Item ID for the resource pool.
     * 
    */
    public Optional<String> getInventoryItemId() {
        return Optional.ofNullable(this.inventoryItemId);
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Gets or sets the location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets or sets MemLimitMB specifies a memory usage limit in megabytes.
     * Utilization will not exceed the specified limit even if there are available resources.
     * 
    */
    public Double getMemLimitMB() {
        return this.memLimitMB;
    }
    /**
     * Gets or sets MemReservationMB which specifies the guaranteed available memory in
     * megabytes.
     * 
    */
    public Double getMemReservationMB() {
        return this.memReservationMB;
    }
    /**
     * Gets or sets CPUSharesLevel which specifies the memory allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
    */
    public String getMemSharesLevel() {
        return this.memSharesLevel;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the resource pool.
     * 
    */
    public String getMoName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     * 
    */
    public Optional<String> getMoRefId() {
        return Optional.ofNullable(this.moRefId);
    }
    /**
     * Gets or sets the name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource status information.
     * 
    */
    public List<ResourceStatusResponse> getStatuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets or sets the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
    */
    public String getUuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
    */
    public Optional<String> getVCenterId() {
        return Optional.ofNullable(this.vCenterId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpuLimitMHz;
        private Double cpuReservationMHz;
        private String cpuSharesLevel;
        private String customResourceName;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String id;
        private @Nullable String inventoryItemId;
        private @Nullable String kind;
        private String location;
        private Double memLimitMB;
        private Double memReservationMB;
        private String memSharesLevel;
        private String moName;
        private @Nullable String moRefId;
        private String name;
        private String provisioningState;
        private List<ResourceStatusResponse> statuses;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uuid;
        private @Nullable String vCenterId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuLimitMHz = defaults.cpuLimitMHz;
    	      this.cpuReservationMHz = defaults.cpuReservationMHz;
    	      this.cpuSharesLevel = defaults.cpuSharesLevel;
    	      this.customResourceName = defaults.customResourceName;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.inventoryItemId = defaults.inventoryItemId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.memLimitMB = defaults.memLimitMB;
    	      this.memReservationMB = defaults.memReservationMB;
    	      this.memSharesLevel = defaults.memSharesLevel;
    	      this.moName = defaults.moName;
    	      this.moRefId = defaults.moRefId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.statuses = defaults.statuses;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.vCenterId = defaults.vCenterId;
        }

        public Builder setCpuLimitMHz(Double cpuLimitMHz) {
            this.cpuLimitMHz = Objects.requireNonNull(cpuLimitMHz);
            return this;
        }

        public Builder setCpuReservationMHz(Double cpuReservationMHz) {
            this.cpuReservationMHz = Objects.requireNonNull(cpuReservationMHz);
            return this;
        }

        public Builder setCpuSharesLevel(String cpuSharesLevel) {
            this.cpuSharesLevel = Objects.requireNonNull(cpuSharesLevel);
            return this;
        }

        public Builder setCustomResourceName(String customResourceName) {
            this.customResourceName = Objects.requireNonNull(customResourceName);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInventoryItemId(@Nullable String inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMemLimitMB(Double memLimitMB) {
            this.memLimitMB = Objects.requireNonNull(memLimitMB);
            return this;
        }

        public Builder setMemReservationMB(Double memReservationMB) {
            this.memReservationMB = Objects.requireNonNull(memReservationMB);
            return this;
        }

        public Builder setMemSharesLevel(String memSharesLevel) {
            this.memSharesLevel = Objects.requireNonNull(memSharesLevel);
            return this;
        }

        public Builder setMoName(String moName) {
            this.moName = Objects.requireNonNull(moName);
            return this;
        }

        public Builder setMoRefId(@Nullable String moRefId) {
            this.moRefId = moRefId;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatuses(List<ResourceStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public Builder setVCenterId(@Nullable String vCenterId) {
            this.vCenterId = vCenterId;
            return this;
        }
        public GetResourcePoolResult build() {
            return new GetResourcePoolResult(cpuLimitMHz, cpuReservationMHz, cpuSharesLevel, customResourceName, extendedLocation, id, inventoryItemId, kind, location, memLimitMB, memReservationMB, memSharesLevel, moName, moRefId, name, provisioningState, statuses, systemData, tags, type, uuid, vCenterId);
        }
    }
}
