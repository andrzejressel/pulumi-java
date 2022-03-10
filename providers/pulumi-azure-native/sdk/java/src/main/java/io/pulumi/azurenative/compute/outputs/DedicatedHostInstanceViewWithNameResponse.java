// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DedicatedHostAvailableCapacityResponse;
import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DedicatedHostInstanceViewWithNameResponse {
    /**
     * Specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     * 
     */
    private final String assetId;
    /**
     * Unutilized capacity of the dedicated host.
     * 
     */
    private final @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;
    /**
     * The name of the dedicated host.
     * 
     */
    private final String name;
    /**
     * The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;

    @OutputCustomType.Constructor
    private DedicatedHostInstanceViewWithNameResponse(
        @OutputCustomType.Parameter("assetId") String assetId,
        @OutputCustomType.Parameter("availableCapacity") @Nullable DedicatedHostAvailableCapacityResponse availableCapacity,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("statuses") @Nullable List<InstanceViewStatusResponse> statuses) {
        this.assetId = assetId;
        this.availableCapacity = availableCapacity;
        this.name = name;
        this.statuses = statuses;
    }

    /**
     * Specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     * 
    */
    public String getAssetId() {
        return this.assetId;
    }
    /**
     * Unutilized capacity of the dedicated host.
     * 
    */
    public Optional<DedicatedHostAvailableCapacityResponse> getAvailableCapacity() {
        return Optional.ofNullable(this.availableCapacity);
    }
    /**
     * The name of the dedicated host.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource status information.
     * 
    */
    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostInstanceViewWithNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;
        private String name;
        private @Nullable List<InstanceViewStatusResponse> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostInstanceViewWithNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.availableCapacity = defaults.availableCapacity;
    	      this.name = defaults.name;
    	      this.statuses = defaults.statuses;
        }

        public Builder setAssetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }

        public Builder setAvailableCapacity(@Nullable DedicatedHostAvailableCapacityResponse availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public DedicatedHostInstanceViewWithNameResponse build() {
            return new DedicatedHostInstanceViewWithNameResponse(assetId, availableCapacity, name, statuses);
        }
    }
}
