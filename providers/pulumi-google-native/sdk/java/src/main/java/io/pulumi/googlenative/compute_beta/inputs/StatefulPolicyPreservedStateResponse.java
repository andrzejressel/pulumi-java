// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

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

    /**
     * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    @InputImport(name="externalIPs", required=true)
    private final Map<String,String> externalIPs;

    public Map<String,String> getExternalIPs() {
        return this.externalIPs;
    }

    /**
     * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    @InputImport(name="internalIPs", required=true)
    private final Map<String,String> internalIPs;

    public Map<String,String> getInternalIPs() {
        return this.internalIPs;
    }

    public StatefulPolicyPreservedStateResponse(
        Map<String,String> disks,
        Map<String,String> externalIPs,
        Map<String,String> internalIPs) {
        this.disks = Objects.requireNonNull(disks, "expected parameter 'disks' to be non-null");
        this.externalIPs = Objects.requireNonNull(externalIPs, "expected parameter 'externalIPs' to be non-null");
        this.internalIPs = Objects.requireNonNull(internalIPs, "expected parameter 'internalIPs' to be non-null");
    }

    private StatefulPolicyPreservedStateResponse() {
        this.disks = Map.of();
        this.externalIPs = Map.of();
        this.internalIPs = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyPreservedStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> disks;
        private Map<String,String> externalIPs;
        private Map<String,String> internalIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyPreservedStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.externalIPs = defaults.externalIPs;
    	      this.internalIPs = defaults.internalIPs;
        }

        public Builder setDisks(Map<String,String> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setExternalIPs(Map<String,String> externalIPs) {
            this.externalIPs = Objects.requireNonNull(externalIPs);
            return this;
        }

        public Builder setInternalIPs(Map<String,String> internalIPs) {
            this.internalIPs = Objects.requireNonNull(internalIPs);
            return this;
        }

        public StatefulPolicyPreservedStateResponse build() {
            return new StatefulPolicyPreservedStateResponse(disks, externalIPs, internalIPs);
        }
    }
}
