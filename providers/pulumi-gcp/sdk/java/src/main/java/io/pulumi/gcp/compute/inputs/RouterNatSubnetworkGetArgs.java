// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterNatSubnetworkGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatSubnetworkGetArgs Empty = new RouterNatSubnetworkGetArgs();

    /**
     * Self-link of subnetwork to NAT
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * List of the secondary ranges of the subnetwork that are allowed
     * to use NAT. This can be populated only if
     * `LIST_OF_SECONDARY_IP_RANGES` is one of the values in
     * sourceIpRangesToNat
     * 
     */
    @InputImport(name="secondaryIpRangeNames")
    private final @Nullable Input<List<String>> secondaryIpRangeNames;

    public Input<List<String>> getSecondaryIpRangeNames() {
        return this.secondaryIpRangeNames == null ? Input.empty() : this.secondaryIpRangeNames;
    }

    /**
     * List of options for which source IPs in the subnetwork
     * should have NAT enabled. Supported values include:
     * `ALL_IP_RANGES`, `LIST_OF_SECONDARY_IP_RANGES`,
     * `PRIMARY_IP_RANGE`.
     * 
     */
    @InputImport(name="sourceIpRangesToNats", required=true)
    private final Input<List<String>> sourceIpRangesToNats;

    public Input<List<String>> getSourceIpRangesToNats() {
        return this.sourceIpRangesToNats;
    }

    public RouterNatSubnetworkGetArgs(
        Input<String> name,
        @Nullable Input<List<String>> secondaryIpRangeNames,
        Input<List<String>> sourceIpRangesToNats) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secondaryIpRangeNames = secondaryIpRangeNames;
        this.sourceIpRangesToNats = Objects.requireNonNull(sourceIpRangesToNats, "expected parameter 'sourceIpRangesToNats' to be non-null");
    }

    private RouterNatSubnetworkGetArgs() {
        this.name = Input.empty();
        this.secondaryIpRangeNames = Input.empty();
        this.sourceIpRangesToNats = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatSubnetworkGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<List<String>> secondaryIpRangeNames;
        private Input<List<String>> sourceIpRangesToNats;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatSubnetworkGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secondaryIpRangeNames = defaults.secondaryIpRangeNames;
    	      this.sourceIpRangesToNats = defaults.sourceIpRangesToNats;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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

        public Builder setSourceIpRangesToNats(Input<List<String>> sourceIpRangesToNats) {
            this.sourceIpRangesToNats = Objects.requireNonNull(sourceIpRangesToNats);
            return this;
        }

        public Builder setSourceIpRangesToNats(List<String> sourceIpRangesToNats) {
            this.sourceIpRangesToNats = Input.of(Objects.requireNonNull(sourceIpRangesToNats));
            return this;
        }

        public RouterNatSubnetworkGetArgs build() {
            return new RouterNatSubnetworkGetArgs(name, secondaryIpRangeNames, sourceIpRangesToNats);
        }
    }
}
