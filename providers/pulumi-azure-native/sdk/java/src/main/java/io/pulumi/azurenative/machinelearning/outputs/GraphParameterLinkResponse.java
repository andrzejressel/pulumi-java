// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GraphParameterLinkResponse {
    /**
     * The graph node's identifier
     * 
     */
    private final String nodeId;
    /**
     * The identifier of the node parameter that the global parameter maps to.
     * 
     */
    private final String parameterKey;

    @OutputCustomType.Constructor
    private GraphParameterLinkResponse(
        @OutputCustomType.Parameter("nodeId") String nodeId,
        @OutputCustomType.Parameter("parameterKey") String parameterKey) {
        this.nodeId = nodeId;
        this.parameterKey = parameterKey;
    }

    /**
     * The graph node's identifier
     * 
    */
    public String getNodeId() {
        return this.nodeId;
    }
    /**
     * The identifier of the node parameter that the global parameter maps to.
     * 
    */
    public String getParameterKey() {
        return this.parameterKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphParameterLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeId;
        private String parameterKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphParameterLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeId = defaults.nodeId;
    	      this.parameterKey = defaults.parameterKey;
        }

        public Builder setNodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder setParameterKey(String parameterKey) {
            this.parameterKey = Objects.requireNonNull(parameterKey);
            return this;
        }
        public GraphParameterLinkResponse build() {
            return new GraphParameterLinkResponse(nodeId, parameterKey);
        }
    }
}
