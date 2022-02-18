// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of preserved resources.
 * 
 */
public final class StatefulPolicyPreservedStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulPolicyPreservedStateArgs Empty = new StatefulPolicyPreservedStateArgs();

    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    @InputImport(name="disks")
    private final @Nullable Input<Map<String,String>> disks;

    public Input<Map<String,String>> getDisks() {
        return this.disks == null ? Input.empty() : this.disks;
    }

    /**
     * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    @InputImport(name="externalIPs")
    private final @Nullable Input<Map<String,String>> externalIPs;

    public Input<Map<String,String>> getExternalIPs() {
        return this.externalIPs == null ? Input.empty() : this.externalIPs;
    }

    /**
     * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    @InputImport(name="internalIPs")
    private final @Nullable Input<Map<String,String>> internalIPs;

    public Input<Map<String,String>> getInternalIPs() {
        return this.internalIPs == null ? Input.empty() : this.internalIPs;
    }

    public StatefulPolicyPreservedStateArgs(
        @Nullable Input<Map<String,String>> disks,
        @Nullable Input<Map<String,String>> externalIPs,
        @Nullable Input<Map<String,String>> internalIPs) {
        this.disks = disks;
        this.externalIPs = externalIPs;
        this.internalIPs = internalIPs;
    }

    private StatefulPolicyPreservedStateArgs() {
        this.disks = Input.empty();
        this.externalIPs = Input.empty();
        this.internalIPs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyPreservedStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> disks;
        private @Nullable Input<Map<String,String>> externalIPs;
        private @Nullable Input<Map<String,String>> internalIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyPreservedStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.externalIPs = defaults.externalIPs;
    	      this.internalIPs = defaults.internalIPs;
        }

        public Builder setDisks(@Nullable Input<Map<String,String>> disks) {
            this.disks = disks;
            return this;
        }

        public Builder setDisks(@Nullable Map<String,String> disks) {
            this.disks = Input.ofNullable(disks);
            return this;
        }

        public Builder setExternalIPs(@Nullable Input<Map<String,String>> externalIPs) {
            this.externalIPs = externalIPs;
            return this;
        }

        public Builder setExternalIPs(@Nullable Map<String,String> externalIPs) {
            this.externalIPs = Input.ofNullable(externalIPs);
            return this;
        }

        public Builder setInternalIPs(@Nullable Input<Map<String,String>> internalIPs) {
            this.internalIPs = internalIPs;
            return this;
        }

        public Builder setInternalIPs(@Nullable Map<String,String> internalIPs) {
            this.internalIPs = Input.ofNullable(internalIPs);
            return this;
        }

        public StatefulPolicyPreservedStateArgs build() {
            return new StatefulPolicyPreservedStateArgs(disks, externalIPs, internalIPs);
        }
    }
}
