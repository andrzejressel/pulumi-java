// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFromMachineImageNetworkInterfaceAliasIpRange {
    private final String ipCidrRange;
    private final @Nullable String subnetworkRangeName;

    @OutputCustomType.Constructor({"ipCidrRange","subnetworkRangeName"})
    private InstanceFromMachineImageNetworkInterfaceAliasIpRange(
        String ipCidrRange,
        @Nullable String subnetworkRangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.subnetworkRangeName = subnetworkRangeName;
    }

    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    public Optional<String> getSubnetworkRangeName() {
        return Optional.ofNullable(this.subnetworkRangeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private @Nullable String subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageNetworkInterfaceAliasIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setSubnetworkRangeName(@Nullable String subnetworkRangeName) {
            this.subnetworkRangeName = subnetworkRangeName;
            return this;
        }

        public InstanceFromMachineImageNetworkInterfaceAliasIpRange build() {
            return new InstanceFromMachineImageNetworkInterfaceAliasIpRange(ipCidrRange, subnetworkRangeName);
        }
    }
}
