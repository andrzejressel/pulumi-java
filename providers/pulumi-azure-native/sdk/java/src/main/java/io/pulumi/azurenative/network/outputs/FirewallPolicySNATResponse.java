// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicySNATResponse {
    /**
     * List of private IP addresses/IP address ranges to not be SNAT.
     * 
     */
    private final @Nullable List<String> privateRanges;

    @OutputCustomType.Constructor
    private FirewallPolicySNATResponse(@OutputCustomType.Parameter("privateRanges") @Nullable List<String> privateRanges) {
        this.privateRanges = privateRanges;
    }

    /**
     * List of private IP addresses/IP address ranges to not be SNAT.
     * 
    */
    public List<String> getPrivateRanges() {
        return this.privateRanges == null ? List.of() : this.privateRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicySNATResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> privateRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicySNATResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateRanges = defaults.privateRanges;
        }

        public Builder setPrivateRanges(@Nullable List<String> privateRanges) {
            this.privateRanges = privateRanges;
            return this;
        }
        public FirewallPolicySNATResponse build() {
            return new FirewallPolicySNATResponse(privateRanges);
        }
    }
}
