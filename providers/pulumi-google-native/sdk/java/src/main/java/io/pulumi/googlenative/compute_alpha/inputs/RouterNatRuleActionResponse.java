// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouterNatRuleActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterNatRuleActionResponse Empty = new RouterNatRuleActionResponse();

    /**
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * 
     */
    @InputImport(name="sourceNatActiveIps", required=true)
    private final List<String> sourceNatActiveIps;

    public List<String> getSourceNatActiveIps() {
        return this.sourceNatActiveIps;
    }

    /**
     * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks must have purpose set to PRIVATE_NAT. This field is used for private NAT.
     * 
     */
    @InputImport(name="sourceNatActiveRanges", required=true)
    private final List<String> sourceNatActiveRanges;

    public List<String> getSourceNatActiveRanges() {
        return this.sourceNatActiveRanges;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * 
     */
    @InputImport(name="sourceNatDrainIps", required=true)
    private final List<String> sourceNatDrainIps;

    public List<String> getSourceNatDrainIps() {
        return this.sourceNatDrainIps;
    }

    /**
     * A list of URLs of subnetworks representing source ranges to be drained. This is only supported on patch/update, and these subnetworks must have previously been used as active ranges in this NAT Rule. This field is used for private NAT.
     * 
     */
    @InputImport(name="sourceNatDrainRanges", required=true)
    private final List<String> sourceNatDrainRanges;

    public List<String> getSourceNatDrainRanges() {
        return this.sourceNatDrainRanges;
    }

    public RouterNatRuleActionResponse(
        List<String> sourceNatActiveIps,
        List<String> sourceNatActiveRanges,
        List<String> sourceNatDrainIps,
        List<String> sourceNatDrainRanges) {
        this.sourceNatActiveIps = Objects.requireNonNull(sourceNatActiveIps, "expected parameter 'sourceNatActiveIps' to be non-null");
        this.sourceNatActiveRanges = Objects.requireNonNull(sourceNatActiveRanges, "expected parameter 'sourceNatActiveRanges' to be non-null");
        this.sourceNatDrainIps = Objects.requireNonNull(sourceNatDrainIps, "expected parameter 'sourceNatDrainIps' to be non-null");
        this.sourceNatDrainRanges = Objects.requireNonNull(sourceNatDrainRanges, "expected parameter 'sourceNatDrainRanges' to be non-null");
    }

    private RouterNatRuleActionResponse() {
        this.sourceNatActiveIps = List.of();
        this.sourceNatActiveRanges = List.of();
        this.sourceNatDrainIps = List.of();
        this.sourceNatDrainRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatRuleActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> sourceNatActiveIps;
        private List<String> sourceNatActiveRanges;
        private List<String> sourceNatDrainIps;
        private List<String> sourceNatDrainRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatRuleActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNatActiveIps = defaults.sourceNatActiveIps;
    	      this.sourceNatActiveRanges = defaults.sourceNatActiveRanges;
    	      this.sourceNatDrainIps = defaults.sourceNatDrainIps;
    	      this.sourceNatDrainRanges = defaults.sourceNatDrainRanges;
        }

        public Builder setSourceNatActiveIps(List<String> sourceNatActiveIps) {
            this.sourceNatActiveIps = Objects.requireNonNull(sourceNatActiveIps);
            return this;
        }

        public Builder setSourceNatActiveRanges(List<String> sourceNatActiveRanges) {
            this.sourceNatActiveRanges = Objects.requireNonNull(sourceNatActiveRanges);
            return this;
        }

        public Builder setSourceNatDrainIps(List<String> sourceNatDrainIps) {
            this.sourceNatDrainIps = Objects.requireNonNull(sourceNatDrainIps);
            return this;
        }

        public Builder setSourceNatDrainRanges(List<String> sourceNatDrainRanges) {
            this.sourceNatDrainRanges = Objects.requireNonNull(sourceNatDrainRanges);
            return this;
        }

        public RouterNatRuleActionResponse build() {
            return new RouterNatRuleActionResponse(sourceNatActiveIps, sourceNatActiveRanges, sourceNatDrainIps, sourceNatDrainRanges);
        }
    }
}
