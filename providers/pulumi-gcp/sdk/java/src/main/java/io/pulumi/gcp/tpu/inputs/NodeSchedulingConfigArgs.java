// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tpu.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class NodeSchedulingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeSchedulingConfigArgs Empty = new NodeSchedulingConfigArgs();

    /**
     * Defines whether the TPU instance is preemptible.
     * 
     */
    @InputImport(name="preemptible", required=true)
    private final Input<Boolean> preemptible;

    public Input<Boolean> getPreemptible() {
        return this.preemptible;
    }

    public NodeSchedulingConfigArgs(Input<Boolean> preemptible) {
        this.preemptible = Objects.requireNonNull(preemptible, "expected parameter 'preemptible' to be non-null");
    }

    private NodeSchedulingConfigArgs() {
        this.preemptible = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSchedulingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSchedulingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptible = defaults.preemptible;
        }

        public Builder setPreemptible(Input<Boolean> preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Input.of(Objects.requireNonNull(preemptible));
            return this;
        }

        public NodeSchedulingConfigArgs build() {
            return new NodeSchedulingConfigArgs(preemptible);
        }
    }
}
