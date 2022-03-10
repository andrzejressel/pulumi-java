// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.ServiceTypeDeltaHealthPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationDeltaHealthPolicyResponse {
    /**
     * The delta health policy used by default to evaluate the health of a service type when upgrading the cluster.
     * 
     */
    private final @Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy;
    /**
     * The map with service type delta health policy per service type name. The map is empty by default.
     * 
     */
    private final @Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies;

    @OutputCustomType.Constructor
    private ApplicationDeltaHealthPolicyResponse(
        @OutputCustomType.Parameter("defaultServiceTypeDeltaHealthPolicy") @Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy,
        @OutputCustomType.Parameter("serviceTypeDeltaHealthPolicies") @Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies) {
        this.defaultServiceTypeDeltaHealthPolicy = defaultServiceTypeDeltaHealthPolicy;
        this.serviceTypeDeltaHealthPolicies = serviceTypeDeltaHealthPolicies;
    }

    /**
     * The delta health policy used by default to evaluate the health of a service type when upgrading the cluster.
     * 
    */
    public Optional<ServiceTypeDeltaHealthPolicyResponse> getDefaultServiceTypeDeltaHealthPolicy() {
        return Optional.ofNullable(this.defaultServiceTypeDeltaHealthPolicy);
    }
    /**
     * The map with service type delta health policy per service type name. The map is empty by default.
     * 
    */
    public Map<String,ServiceTypeDeltaHealthPolicyResponse> getServiceTypeDeltaHealthPolicies() {
        return this.serviceTypeDeltaHealthPolicies == null ? Map.of() : this.serviceTypeDeltaHealthPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationDeltaHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy;
        private @Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationDeltaHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultServiceTypeDeltaHealthPolicy = defaults.defaultServiceTypeDeltaHealthPolicy;
    	      this.serviceTypeDeltaHealthPolicies = defaults.serviceTypeDeltaHealthPolicies;
        }

        public Builder setDefaultServiceTypeDeltaHealthPolicy(@Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy) {
            this.defaultServiceTypeDeltaHealthPolicy = defaultServiceTypeDeltaHealthPolicy;
            return this;
        }

        public Builder setServiceTypeDeltaHealthPolicies(@Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies) {
            this.serviceTypeDeltaHealthPolicies = serviceTypeDeltaHealthPolicies;
            return this;
        }
        public ApplicationDeltaHealthPolicyResponse build() {
            return new ApplicationDeltaHealthPolicyResponse(defaultServiceTypeDeltaHealthPolicy, serviceTypeDeltaHealthPolicies);
        }
    }
}
