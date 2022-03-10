// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.SecurityPolicyWebApplicationFirewallParametersResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSecurityPolicyResult {
    private final String deploymentStatus;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * object which contains security policy parameters
     * 
     */
    private final @Nullable SecurityPolicyWebApplicationFirewallParametersResponse parameters;
    /**
     * Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetSecurityPolicyResult(
        @OutputCustomType.Parameter("deploymentStatus") String deploymentStatus,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") @Nullable SecurityPolicyWebApplicationFirewallParametersResponse parameters,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.deploymentStatus = deploymentStatus;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * object which contains security policy parameters
     * 
    */
    public Optional<SecurityPolicyWebApplicationFirewallParametersResponse> getParameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * Provisioning status
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentStatus;
        private String id;
        private String name;
        private @Nullable SecurityPolicyWebApplicationFirewallParametersResponse parameters;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable SecurityPolicyWebApplicationFirewallParametersResponse parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSecurityPolicyResult build() {
            return new GetSecurityPolicyResult(deploymentStatus, id, name, parameters, provisioningState, systemData, type);
        }
    }
}
