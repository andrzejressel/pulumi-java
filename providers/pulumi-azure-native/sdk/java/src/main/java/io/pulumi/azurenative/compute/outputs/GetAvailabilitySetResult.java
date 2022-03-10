// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAvailabilitySetResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Fault Domain count.
     * 
     */
    private final @Nullable Integer platformFaultDomainCount;
    /**
     * Update Domain count.
     * 
     */
    private final @Nullable Integer platformUpdateDomainCount;
    /**
     * Specifies information about the proximity placement group that the availability set should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    private final @Nullable SubResourceResponse proximityPlacementGroup;
    /**
     * Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual machines with unmanaged disks. Default value is 'Classic'.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * The resource status information.
     * 
     */
    private final List<InstanceViewStatusResponse> statuses;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * A list of references to all virtual machines in the availability set.
     * 
     */
    private final @Nullable List<SubResourceResponse> virtualMachines;

    @OutputCustomType.Constructor
    private GetAvailabilitySetResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("platformFaultDomainCount") @Nullable Integer platformFaultDomainCount,
        @OutputCustomType.Parameter("platformUpdateDomainCount") @Nullable Integer platformUpdateDomainCount,
        @OutputCustomType.Parameter("proximityPlacementGroup") @Nullable SubResourceResponse proximityPlacementGroup,
        @OutputCustomType.Parameter("sku") @Nullable SkuResponse sku,
        @OutputCustomType.Parameter("statuses") List<InstanceViewStatusResponse> statuses,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("virtualMachines") @Nullable List<SubResourceResponse> virtualMachines) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.platformFaultDomainCount = platformFaultDomainCount;
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        this.proximityPlacementGroup = proximityPlacementGroup;
        this.sku = sku;
        this.statuses = statuses;
        this.tags = tags;
        this.type = type;
        this.virtualMachines = virtualMachines;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Fault Domain count.
     * 
    */
    public Optional<Integer> getPlatformFaultDomainCount() {
        return Optional.ofNullable(this.platformFaultDomainCount);
    }
    /**
     * Update Domain count.
     * 
    */
    public Optional<Integer> getPlatformUpdateDomainCount() {
        return Optional.ofNullable(this.platformUpdateDomainCount);
    }
    /**
     * Specifies information about the proximity placement group that the availability set should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
    */
    public Optional<SubResourceResponse> getProximityPlacementGroup() {
        return Optional.ofNullable(this.proximityPlacementGroup);
    }
    /**
     * Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual machines with unmanaged disks. Default value is 'Classic'.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The resource status information.
     * 
    */
    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A list of references to all virtual machines in the availability set.
     * 
    */
    public List<SubResourceResponse> getVirtualMachines() {
        return this.virtualMachines == null ? List.of() : this.virtualMachines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilitySetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable Integer platformFaultDomainCount;
        private @Nullable Integer platformUpdateDomainCount;
        private @Nullable SubResourceResponse proximityPlacementGroup;
        private @Nullable SkuResponse sku;
        private List<InstanceViewStatusResponse> statuses;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<SubResourceResponse> virtualMachines;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilitySetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.platformFaultDomainCount = defaults.platformFaultDomainCount;
    	      this.platformUpdateDomainCount = defaults.platformUpdateDomainCount;
    	      this.proximityPlacementGroup = defaults.proximityPlacementGroup;
    	      this.sku = defaults.sku;
    	      this.statuses = defaults.statuses;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualMachines = defaults.virtualMachines;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlatformFaultDomainCount(@Nullable Integer platformFaultDomainCount) {
            this.platformFaultDomainCount = platformFaultDomainCount;
            return this;
        }

        public Builder setPlatformUpdateDomainCount(@Nullable Integer platformUpdateDomainCount) {
            this.platformUpdateDomainCount = platformUpdateDomainCount;
            return this;
        }

        public Builder setProximityPlacementGroup(@Nullable SubResourceResponse proximityPlacementGroup) {
            this.proximityPlacementGroup = proximityPlacementGroup;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStatuses(List<InstanceViewStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
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

        public Builder setVirtualMachines(@Nullable List<SubResourceResponse> virtualMachines) {
            this.virtualMachines = virtualMachines;
            return this;
        }
        public GetAvailabilitySetResult build() {
            return new GetAvailabilitySetResult(id, location, name, platformFaultDomainCount, platformUpdateDomainCount, proximityPlacementGroup, sku, statuses, tags, type, virtualMachines);
        }
    }
}
