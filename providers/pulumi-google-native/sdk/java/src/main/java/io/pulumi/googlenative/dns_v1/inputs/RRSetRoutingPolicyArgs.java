// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyGeoPolicyArgs;
import io.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyWrrPolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A RRSetRoutingPolicy represents ResourceRecordSet data that is returned dynamically with the response varying based on configured properties such as geolocation or by weighted random selection.
 * 
 */
public final class RRSetRoutingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyArgs Empty = new RRSetRoutingPolicyArgs();

    @InputImport(name="geo")
    private final @Nullable Input<RRSetRoutingPolicyGeoPolicyArgs> geo;

    public Input<RRSetRoutingPolicyGeoPolicyArgs> getGeo() {
        return this.geo == null ? Input.empty() : this.geo;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="wrr")
    private final @Nullable Input<RRSetRoutingPolicyWrrPolicyArgs> wrr;

    public Input<RRSetRoutingPolicyWrrPolicyArgs> getWrr() {
        return this.wrr == null ? Input.empty() : this.wrr;
    }

    public RRSetRoutingPolicyArgs(
        @Nullable Input<RRSetRoutingPolicyGeoPolicyArgs> geo,
        @Nullable Input<String> kind,
        @Nullable Input<RRSetRoutingPolicyWrrPolicyArgs> wrr) {
        this.geo = geo;
        this.kind = kind;
        this.wrr = wrr;
    }

    private RRSetRoutingPolicyArgs() {
        this.geo = Input.empty();
        this.kind = Input.empty();
        this.wrr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RRSetRoutingPolicyGeoPolicyArgs> geo;
        private @Nullable Input<String> kind;
        private @Nullable Input<RRSetRoutingPolicyWrrPolicyArgs> wrr;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geo = defaults.geo;
    	      this.kind = defaults.kind;
    	      this.wrr = defaults.wrr;
        }

        public Builder setGeo(@Nullable Input<RRSetRoutingPolicyGeoPolicyArgs> geo) {
            this.geo = geo;
            return this;
        }

        public Builder setGeo(@Nullable RRSetRoutingPolicyGeoPolicyArgs geo) {
            this.geo = Input.ofNullable(geo);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setWrr(@Nullable Input<RRSetRoutingPolicyWrrPolicyArgs> wrr) {
            this.wrr = wrr;
            return this;
        }

        public Builder setWrr(@Nullable RRSetRoutingPolicyWrrPolicyArgs wrr) {
            this.wrr = Input.ofNullable(wrr);
            return this;
        }

        public RRSetRoutingPolicyArgs build() {
            return new RRSetRoutingPolicyArgs(geo, kind, wrr);
        }
    }
}
