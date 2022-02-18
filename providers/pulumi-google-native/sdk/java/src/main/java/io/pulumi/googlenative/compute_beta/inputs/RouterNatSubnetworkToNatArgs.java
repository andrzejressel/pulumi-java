// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.RouterNatSubnetworkToNatSourceIpRangesToNatItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the IP ranges that want to use NAT for a subnetwork.
 * 
 */
public final class RouterNatSubnetworkToNatArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatSubnetworkToNatArgs Empty = new RouterNatSubnetworkToNatArgs();

    /**
     * URL for the subnetwork resource that will use NAT.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
     * 
     */
    @InputImport(name="secondaryIpRangeNames")
    private final @Nullable Input<List<String>> secondaryIpRangeNames;

    public Input<List<String>> getSecondaryIpRangeNames() {
        return this.secondaryIpRangeNames == null ? Input.empty() : this.secondaryIpRangeNames;
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     * 
     */
    @InputImport(name="sourceIpRangesToNat")
    private final @Nullable Input<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat;

    public Input<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> getSourceIpRangesToNat() {
        return this.sourceIpRangesToNat == null ? Input.empty() : this.sourceIpRangesToNat;
    }

    public RouterNatSubnetworkToNatArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<String>> secondaryIpRangeNames,
        @Nullable Input<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat) {
        this.name = name;
        this.secondaryIpRangeNames = secondaryIpRangeNames;
        this.sourceIpRangesToNat = sourceIpRangesToNat;
    }

    private RouterNatSubnetworkToNatArgs() {
        this.name = Input.empty();
        this.secondaryIpRangeNames = Input.empty();
        this.sourceIpRangesToNat = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatSubnetworkToNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> secondaryIpRangeNames;
        private @Nullable Input<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatSubnetworkToNatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secondaryIpRangeNames = defaults.secondaryIpRangeNames;
    	      this.sourceIpRangesToNat = defaults.sourceIpRangesToNat;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSecondaryIpRangeNames(@Nullable Input<List<String>> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = secondaryIpRangeNames;
            return this;
        }

        public Builder setSecondaryIpRangeNames(@Nullable List<String> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = Input.ofNullable(secondaryIpRangeNames);
            return this;
        }

        public Builder setSourceIpRangesToNat(@Nullable Input<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat) {
            this.sourceIpRangesToNat = sourceIpRangesToNat;
            return this;
        }

        public Builder setSourceIpRangesToNat(@Nullable List<RouterNatSubnetworkToNatSourceIpRangesToNatItem> sourceIpRangesToNat) {
            this.sourceIpRangesToNat = Input.ofNullable(sourceIpRangesToNat);
            return this;
        }

        public RouterNatSubnetworkToNatArgs build() {
            return new RouterNatSubnetworkToNatArgs(name, secondaryIpRangeNames, sourceIpRangesToNat);
        }
    }
}
