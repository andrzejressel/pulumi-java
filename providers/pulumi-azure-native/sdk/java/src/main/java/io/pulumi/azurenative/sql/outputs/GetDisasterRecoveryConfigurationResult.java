// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDisasterRecoveryConfigurationResult {
    /**
     * Whether or not failover can be done automatically.
     * 
     */
    private final String autoFailover;
    /**
     * How aggressive the automatic failover should be.
     * 
     */
    private final String failoverPolicy;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Location of the server that contains this disaster recovery configuration.
     * 
     */
    private final String location;
    /**
     * Logical name of the server.
     * 
     */
    private final String logicalServerName;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Logical name of the partner server.
     * 
     */
    private final String partnerLogicalServerName;
    /**
     * Id of the partner server.
     * 
     */
    private final String partnerServerId;
    /**
     * The role of the current server in the disaster recovery configuration.
     * 
     */
    private final String role;
    /**
     * The status of the disaster recovery configuration.
     * 
     */
    private final String status;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetDisasterRecoveryConfigurationResult(
        @OutputCustomType.Parameter("autoFailover") String autoFailover,
        @OutputCustomType.Parameter("failoverPolicy") String failoverPolicy,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("logicalServerName") String logicalServerName,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("partnerLogicalServerName") String partnerLogicalServerName,
        @OutputCustomType.Parameter("partnerServerId") String partnerServerId,
        @OutputCustomType.Parameter("role") String role,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type) {
        this.autoFailover = autoFailover;
        this.failoverPolicy = failoverPolicy;
        this.id = id;
        this.location = location;
        this.logicalServerName = logicalServerName;
        this.name = name;
        this.partnerLogicalServerName = partnerLogicalServerName;
        this.partnerServerId = partnerServerId;
        this.role = role;
        this.status = status;
        this.type = type;
    }

    /**
     * Whether or not failover can be done automatically.
     * 
    */
    public String getAutoFailover() {
        return this.autoFailover;
    }
    /**
     * How aggressive the automatic failover should be.
     * 
    */
    public String getFailoverPolicy() {
        return this.failoverPolicy;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Location of the server that contains this disaster recovery configuration.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Logical name of the server.
     * 
    */
    public String getLogicalServerName() {
        return this.logicalServerName;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Logical name of the partner server.
     * 
    */
    public String getPartnerLogicalServerName() {
        return this.partnerLogicalServerName;
    }
    /**
     * Id of the partner server.
     * 
    */
    public String getPartnerServerId() {
        return this.partnerServerId;
    }
    /**
     * The role of the current server in the disaster recovery configuration.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * The status of the disaster recovery configuration.
     * 
    */
    public String getStatus() {
        return this.status;
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

    public static Builder builder(GetDisasterRecoveryConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoFailover;
        private String failoverPolicy;
        private String id;
        private String location;
        private String logicalServerName;
        private String name;
        private String partnerLogicalServerName;
        private String partnerServerId;
        private String role;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDisasterRecoveryConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoFailover = defaults.autoFailover;
    	      this.failoverPolicy = defaults.failoverPolicy;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.logicalServerName = defaults.logicalServerName;
    	      this.name = defaults.name;
    	      this.partnerLogicalServerName = defaults.partnerLogicalServerName;
    	      this.partnerServerId = defaults.partnerServerId;
    	      this.role = defaults.role;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setAutoFailover(String autoFailover) {
            this.autoFailover = Objects.requireNonNull(autoFailover);
            return this;
        }

        public Builder setFailoverPolicy(String failoverPolicy) {
            this.failoverPolicy = Objects.requireNonNull(failoverPolicy);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLogicalServerName(String logicalServerName) {
            this.logicalServerName = Objects.requireNonNull(logicalServerName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnerLogicalServerName(String partnerLogicalServerName) {
            this.partnerLogicalServerName = Objects.requireNonNull(partnerLogicalServerName);
            return this;
        }

        public Builder setPartnerServerId(String partnerServerId) {
            this.partnerServerId = Objects.requireNonNull(partnerServerId);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDisasterRecoveryConfigurationResult build() {
            return new GetDisasterRecoveryConfigurationResult(autoFailover, failoverPolicy, id, location, logicalServerName, name, partnerLogicalServerName, partnerServerId, role, status, type);
        }
    }
}
