// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class NodePoolUpgradeSettings {
    /**
     * The number of additional nodes that can be added to the node pool during
     * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
     * Can be set to 0 or greater.
     * 
     */
    private final Integer maxSurge;
    /**
     * The number of nodes that can be simultaneously unavailable during
     * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
     * parallel. Can be set to 0 or greater.
     * 
     */
    private final Integer maxUnavailable;

    @OutputCustomType.Constructor({"maxSurge","maxUnavailable"})
    private NodePoolUpgradeSettings(
        Integer maxSurge,
        Integer maxUnavailable) {
        this.maxSurge = Objects.requireNonNull(maxSurge);
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
    }

    /**
     * The number of additional nodes that can be added to the node pool during
     * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
     * Can be set to 0 or greater.
     * 
     */
    public Integer getMaxSurge() {
        return this.maxSurge;
    }
    /**
     * The number of nodes that can be simultaneously unavailable during
     * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
     * parallel. Can be set to 0 or greater.
     * 
     */
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolUpgradeSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxSurge;
        private Integer maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolUpgradeSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxSurge(Integer maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder setMaxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public NodePoolUpgradeSettings build() {
            return new NodePoolUpgradeSettings(maxSurge, maxUnavailable);
        }
    }
}
