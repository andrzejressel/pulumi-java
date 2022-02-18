// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a relationship between two domains. This allows a controller in one domain to authenticate a user in another domain. If the trust is being changed, it will be placed into the UPDATING state, which indicates that the resource is being reconciled. At this point, Get will reflect an intermediate state.
 * 
 */
public final class TrustResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrustResponse Empty = new TrustResponse();

    /**
     * The time the instance was created.
     * 
     */
    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The last heartbeat time when the trust was known to be connected.
     * 
     */
    @InputImport(name="lastTrustHeartbeatTime", required=true)
    private final String lastTrustHeartbeatTime;

    public String getLastTrustHeartbeatTime() {
        return this.lastTrustHeartbeatTime;
    }

    /**
     * Optional. The trust authentication type, which decides whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    @InputImport(name="selectiveAuthentication", required=true)
    private final Boolean selectiveAuthentication;

    public Boolean getSelectiveAuthentication() {
        return this.selectiveAuthentication;
    }

    /**
     * The current state of the trust.
     * 
     */
    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Additional information about the current state of the trust, if available.
     * 
     */
    @InputImport(name="stateDescription", required=true)
    private final String stateDescription;

    public String getStateDescription() {
        return this.stateDescription;
    }

    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    @InputImport(name="targetDnsIpAddresses", required=true)
    private final List<String> targetDnsIpAddresses;

    public List<String> getTargetDnsIpAddresses() {
        return this.targetDnsIpAddresses;
    }

    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    @InputImport(name="targetDomainName", required=true)
    private final String targetDomainName;

    public String getTargetDomainName() {
        return this.targetDomainName;
    }

    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * 
     */
    @InputImport(name="trustDirection", required=true)
    private final String trustDirection;

    public String getTrustDirection() {
        return this.trustDirection;
    }

    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * 
     */
    @InputImport(name="trustHandshakeSecret", required=true)
    private final String trustHandshakeSecret;

    public String getTrustHandshakeSecret() {
        return this.trustHandshakeSecret;
    }

    /**
     * The type of trust represented by the trust resource.
     * 
     */
    @InputImport(name="trustType", required=true)
    private final String trustType;

    public String getTrustType() {
        return this.trustType;
    }

    /**
     * The last update time.
     * 
     */
    @InputImport(name="updateTime", required=true)
    private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public TrustResponse(
        String createTime,
        String lastTrustHeartbeatTime,
        Boolean selectiveAuthentication,
        String state,
        String stateDescription,
        List<String> targetDnsIpAddresses,
        String targetDomainName,
        String trustDirection,
        String trustHandshakeSecret,
        String trustType,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.lastTrustHeartbeatTime = Objects.requireNonNull(lastTrustHeartbeatTime, "expected parameter 'lastTrustHeartbeatTime' to be non-null");
        this.selectiveAuthentication = Objects.requireNonNull(selectiveAuthentication, "expected parameter 'selectiveAuthentication' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateDescription = Objects.requireNonNull(stateDescription, "expected parameter 'stateDescription' to be non-null");
        this.targetDnsIpAddresses = Objects.requireNonNull(targetDnsIpAddresses, "expected parameter 'targetDnsIpAddresses' to be non-null");
        this.targetDomainName = Objects.requireNonNull(targetDomainName, "expected parameter 'targetDomainName' to be non-null");
        this.trustDirection = Objects.requireNonNull(trustDirection, "expected parameter 'trustDirection' to be non-null");
        this.trustHandshakeSecret = Objects.requireNonNull(trustHandshakeSecret, "expected parameter 'trustHandshakeSecret' to be non-null");
        this.trustType = Objects.requireNonNull(trustType, "expected parameter 'trustType' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private TrustResponse() {
        this.createTime = null;
        this.lastTrustHeartbeatTime = null;
        this.selectiveAuthentication = null;
        this.state = null;
        this.stateDescription = null;
        this.targetDnsIpAddresses = List.of();
        this.targetDomainName = null;
        this.trustDirection = null;
        this.trustHandshakeSecret = null;
        this.trustType = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String lastTrustHeartbeatTime;
        private Boolean selectiveAuthentication;
        private String state;
        private String stateDescription;
        private List<String> targetDnsIpAddresses;
        private String targetDomainName;
        private String trustDirection;
        private String trustHandshakeSecret;
        private String trustType;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.lastTrustHeartbeatTime = defaults.lastTrustHeartbeatTime;
    	      this.selectiveAuthentication = defaults.selectiveAuthentication;
    	      this.state = defaults.state;
    	      this.stateDescription = defaults.stateDescription;
    	      this.targetDnsIpAddresses = defaults.targetDnsIpAddresses;
    	      this.targetDomainName = defaults.targetDomainName;
    	      this.trustDirection = defaults.trustDirection;
    	      this.trustHandshakeSecret = defaults.trustHandshakeSecret;
    	      this.trustType = defaults.trustType;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setLastTrustHeartbeatTime(String lastTrustHeartbeatTime) {
            this.lastTrustHeartbeatTime = Objects.requireNonNull(lastTrustHeartbeatTime);
            return this;
        }

        public Builder setSelectiveAuthentication(Boolean selectiveAuthentication) {
            this.selectiveAuthentication = Objects.requireNonNull(selectiveAuthentication);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateDescription(String stateDescription) {
            this.stateDescription = Objects.requireNonNull(stateDescription);
            return this;
        }

        public Builder setTargetDnsIpAddresses(List<String> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = Objects.requireNonNull(targetDnsIpAddresses);
            return this;
        }

        public Builder setTargetDomainName(String targetDomainName) {
            this.targetDomainName = Objects.requireNonNull(targetDomainName);
            return this;
        }

        public Builder setTrustDirection(String trustDirection) {
            this.trustDirection = Objects.requireNonNull(trustDirection);
            return this;
        }

        public Builder setTrustHandshakeSecret(String trustHandshakeSecret) {
            this.trustHandshakeSecret = Objects.requireNonNull(trustHandshakeSecret);
            return this;
        }

        public Builder setTrustType(String trustType) {
            this.trustType = Objects.requireNonNull(trustType);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public TrustResponse build() {
            return new TrustResponse(createTime, lastTrustHeartbeatTime, selectiveAuthentication, state, stateDescription, targetDnsIpAddresses, targetDomainName, trustDirection, trustHandshakeSecret, trustType, updateTime);
        }
    }
}
