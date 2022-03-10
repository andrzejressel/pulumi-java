// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeDataFlowPropertiesResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeVNetPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeComputePropertiesResponse {
    /**
     * Data flow properties for managed integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties;
    /**
     * The location for managed integration runtime. The supported regions could be found on https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities
     * 
     */
    private final @Nullable String location;
    /**
     * Maximum parallel executions count per node for managed integration runtime.
     * 
     */
    private final @Nullable Integer maxParallelExecutionsPerNode;
    /**
     * The node size requirement to managed integration runtime.
     * 
     */
    private final @Nullable String nodeSize;
    /**
     * The required number of nodes for managed integration runtime.
     * 
     */
    private final @Nullable Integer numberOfNodes;
    /**
     * VNet properties for managed integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties;

    @OutputCustomType.Constructor
    private IntegrationRuntimeComputePropertiesResponse(
        @OutputCustomType.Parameter("dataFlowProperties") @Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("maxParallelExecutionsPerNode") @Nullable Integer maxParallelExecutionsPerNode,
        @OutputCustomType.Parameter("nodeSize") @Nullable String nodeSize,
        @OutputCustomType.Parameter("numberOfNodes") @Nullable Integer numberOfNodes,
        @OutputCustomType.Parameter("vNetProperties") @Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties) {
        this.dataFlowProperties = dataFlowProperties;
        this.location = location;
        this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
        this.nodeSize = nodeSize;
        this.numberOfNodes = numberOfNodes;
        this.vNetProperties = vNetProperties;
    }

    /**
     * Data flow properties for managed integration runtime.
     * 
    */
    public Optional<IntegrationRuntimeDataFlowPropertiesResponse> getDataFlowProperties() {
        return Optional.ofNullable(this.dataFlowProperties);
    }
    /**
     * The location for managed integration runtime. The supported regions could be found on https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Maximum parallel executions count per node for managed integration runtime.
     * 
    */
    public Optional<Integer> getMaxParallelExecutionsPerNode() {
        return Optional.ofNullable(this.maxParallelExecutionsPerNode);
    }
    /**
     * The node size requirement to managed integration runtime.
     * 
    */
    public Optional<String> getNodeSize() {
        return Optional.ofNullable(this.nodeSize);
    }
    /**
     * The required number of nodes for managed integration runtime.
     * 
    */
    public Optional<Integer> getNumberOfNodes() {
        return Optional.ofNullable(this.numberOfNodes);
    }
    /**
     * VNet properties for managed integration runtime.
     * 
    */
    public Optional<IntegrationRuntimeVNetPropertiesResponse> getVNetProperties() {
        return Optional.ofNullable(this.vNetProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeComputePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties;
        private @Nullable String location;
        private @Nullable Integer maxParallelExecutionsPerNode;
        private @Nullable String nodeSize;
        private @Nullable Integer numberOfNodes;
        private @Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeComputePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataFlowProperties = defaults.dataFlowProperties;
    	      this.location = defaults.location;
    	      this.maxParallelExecutionsPerNode = defaults.maxParallelExecutionsPerNode;
    	      this.nodeSize = defaults.nodeSize;
    	      this.numberOfNodes = defaults.numberOfNodes;
    	      this.vNetProperties = defaults.vNetProperties;
        }

        public Builder setDataFlowProperties(@Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties) {
            this.dataFlowProperties = dataFlowProperties;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMaxParallelExecutionsPerNode(@Nullable Integer maxParallelExecutionsPerNode) {
            this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
            return this;
        }

        public Builder setNodeSize(@Nullable String nodeSize) {
            this.nodeSize = nodeSize;
            return this;
        }

        public Builder setNumberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }

        public Builder setVNetProperties(@Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties) {
            this.vNetProperties = vNetProperties;
            return this;
        }
        public IntegrationRuntimeComputePropertiesResponse build() {
            return new IntegrationRuntimeComputePropertiesResponse(dataFlowProperties, location, maxParallelExecutionsPerNode, nodeSize, numberOfNodes, vNetProperties);
        }
    }
}
