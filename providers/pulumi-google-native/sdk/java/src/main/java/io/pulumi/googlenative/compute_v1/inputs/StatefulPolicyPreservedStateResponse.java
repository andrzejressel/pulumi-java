// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Configuration of preserved resources.
 * 
 */
public final class StatefulPolicyPreservedStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatefulPolicyPreservedStateResponse Empty = new StatefulPolicyPreservedStateResponse();

    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    @InputImport(name="disks", required=true)
    private final Map<String,String> disks;

    public Map<String,String> getDisks() {
        return this.disks;
    }

    public StatefulPolicyPreservedStateResponse(Map<String,String> disks) {
        this.disks = Objects.requireNonNull(disks, "expected parameter 'disks' to be non-null");
    }

    private StatefulPolicyPreservedStateResponse() {
        this.disks = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyPreservedStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> disks;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyPreservedStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
        }

        public Builder setDisks(Map<String,String> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public StatefulPolicyPreservedStateResponse build() {
            return new StatefulPolicyPreservedStateResponse(disks);
        }
    }
}
