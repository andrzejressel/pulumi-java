// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A routing block which contains the routing information for one WRR item.
 * 
 */
public final class RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs Empty = new RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs();

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="rrdatas")
    private final @Nullable Input<List<String>> rrdatas;

    public Input<List<String>> getRrdatas() {
        return this.rrdatas == null ? Input.empty() : this.rrdatas;
    }

    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
     */
    @InputImport(name="signatureRrdatas")
    private final @Nullable Input<List<String>> signatureRrdatas;

    public Input<List<String>> getSignatureRrdatas() {
        return this.signatureRrdatas == null ? Input.empty() : this.signatureRrdatas;
    }

    /**
     * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight relative to the sum of weights configured for all items. This weight should be non-negative.
     * 
     */
    @InputImport(name="weight")
    private final @Nullable Input<Double> weight;

    public Input<Double> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs(
        @Nullable Input<String> kind,
        @Nullable Input<List<String>> rrdatas,
        @Nullable Input<List<String>> signatureRrdatas,
        @Nullable Input<Double> weight) {
        this.kind = kind;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
        this.weight = weight;
    }

    private RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs() {
        this.kind = Input.empty();
        this.rrdatas = Input.empty();
        this.signatureRrdatas = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<List<String>> rrdatas;
        private @Nullable Input<List<String>> signatureRrdatas;
        private @Nullable Input<Double> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.weight = defaults.weight;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setRrdatas(@Nullable Input<List<String>> rrdatas) {
            this.rrdatas = rrdatas;
            return this;
        }

        public Builder setRrdatas(@Nullable List<String> rrdatas) {
            this.rrdatas = Input.ofNullable(rrdatas);
            return this;
        }

        public Builder setSignatureRrdatas(@Nullable Input<List<String>> signatureRrdatas) {
            this.signatureRrdatas = signatureRrdatas;
            return this;
        }

        public Builder setSignatureRrdatas(@Nullable List<String> signatureRrdatas) {
            this.signatureRrdatas = Input.ofNullable(signatureRrdatas);
            return this;
        }

        public Builder setWeight(@Nullable Input<Double> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Double weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }

        public RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs build() {
            return new RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs(kind, rrdatas, signatureRrdatas, weight);
        }
    }
}
