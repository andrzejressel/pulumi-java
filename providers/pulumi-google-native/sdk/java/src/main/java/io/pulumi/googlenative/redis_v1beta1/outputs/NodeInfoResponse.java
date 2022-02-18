// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeInfoResponse {
    /**
     * Location of the node.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"zone"})
    private NodeInfoResponse(String zone) {
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * Location of the node.
     * 
     */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zone = defaults.zone;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public NodeInfoResponse build() {
            return new NodeInfoResponse(zone);
        }
    }
}
