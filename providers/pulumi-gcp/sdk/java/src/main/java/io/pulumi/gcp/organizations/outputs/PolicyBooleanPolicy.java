// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class PolicyBooleanPolicy {
    /**
     * If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    private final Boolean enforced;

    @OutputCustomType.Constructor({"enforced"})
    private PolicyBooleanPolicy(Boolean enforced) {
        this.enforced = Objects.requireNonNull(enforced);
    }

    /**
     * If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    public Boolean getEnforced() {
        return this.enforced;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyBooleanPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enforced;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyBooleanPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        public Builder setEnforced(Boolean enforced) {
            this.enforced = Objects.requireNonNull(enforced);
            return this;
        }

        public PolicyBooleanPolicy build() {
            return new PolicyBooleanPolicy(enforced);
        }
    }
}
