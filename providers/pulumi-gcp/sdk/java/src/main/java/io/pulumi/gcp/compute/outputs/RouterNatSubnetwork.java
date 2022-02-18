// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouterNatSubnetwork {
    /**
     * Self-link of subnetwork to NAT
     * 
     */
    private final String name;
    /**
     * List of the secondary ranges of the subnetwork that are allowed
     * to use NAT. This can be populated only if
     * `LIST_OF_SECONDARY_IP_RANGES` is one of the values in
     * sourceIpRangesToNat
     * 
     */
    private final @Nullable List<String> secondaryIpRangeNames;
    /**
     * List of options for which source IPs in the subnetwork
     * should have NAT enabled. Supported values include:
     * `ALL_IP_RANGES`, `LIST_OF_SECONDARY_IP_RANGES`,
     * `PRIMARY_IP_RANGE`.
     * 
     */
    private final List<String> sourceIpRangesToNats;

    @OutputCustomType.Constructor({"name","secondaryIpRangeNames","sourceIpRangesToNats"})
    private RouterNatSubnetwork(
        String name,
        @Nullable List<String> secondaryIpRangeNames,
        List<String> sourceIpRangesToNats) {
        this.name = Objects.requireNonNull(name);
        this.secondaryIpRangeNames = secondaryIpRangeNames;
        this.sourceIpRangesToNats = Objects.requireNonNull(sourceIpRangesToNats);
    }

    /**
     * Self-link of subnetwork to NAT
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of the secondary ranges of the subnetwork that are allowed
     * to use NAT. This can be populated only if
     * `LIST_OF_SECONDARY_IP_RANGES` is one of the values in
     * sourceIpRangesToNat
     * 
     */
    public List<String> getSecondaryIpRangeNames() {
        return this.secondaryIpRangeNames == null ? List.of() : this.secondaryIpRangeNames;
    }
    /**
     * List of options for which source IPs in the subnetwork
     * should have NAT enabled. Supported values include:
     * `ALL_IP_RANGES`, `LIST_OF_SECONDARY_IP_RANGES`,
     * `PRIMARY_IP_RANGE`.
     * 
     */
    public List<String> getSourceIpRangesToNats() {
        return this.sourceIpRangesToNats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatSubnetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable List<String> secondaryIpRangeNames;
        private List<String> sourceIpRangesToNats;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatSubnetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secondaryIpRangeNames = defaults.secondaryIpRangeNames;
    	      this.sourceIpRangesToNats = defaults.sourceIpRangesToNats;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecondaryIpRangeNames(@Nullable List<String> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = secondaryIpRangeNames;
            return this;
        }

        public Builder setSourceIpRangesToNats(List<String> sourceIpRangesToNats) {
            this.sourceIpRangesToNats = Objects.requireNonNull(sourceIpRangesToNats);
            return this;
        }

        public RouterNatSubnetwork build() {
            return new RouterNatSubnetwork(name, secondaryIpRangeNames, sourceIpRangesToNats);
        }
    }
}
