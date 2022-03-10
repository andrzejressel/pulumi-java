// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadNetworkDnsZoneResult {
    /**
     * Display name of the DNS Zone.
     * 
     */
    private final @Nullable String displayName;
    /**
     * DNS Server IP array of the DNS Zone.
     * 
     */
    private final @Nullable List<String> dnsServerIps;
    /**
     * Number of DNS Services using the DNS zone.
     * 
     */
    private final @Nullable Double dnsServices;
    /**
     * Domain names of the DNS Zone.
     * 
     */
    private final @Nullable List<String> domain;
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
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * Source IP of the DNS Zone.
     * 
     */
    private final @Nullable String sourceIp;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetWorkloadNetworkDnsZoneResult(
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("dnsServerIps") @Nullable List<String> dnsServerIps,
        @OutputCustomType.Parameter("dnsServices") @Nullable Double dnsServices,
        @OutputCustomType.Parameter("domain") @Nullable List<String> domain,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("revision") @Nullable Double revision,
        @OutputCustomType.Parameter("sourceIp") @Nullable String sourceIp,
        @OutputCustomType.Parameter("type") String type) {
        this.displayName = displayName;
        this.dnsServerIps = dnsServerIps;
        this.dnsServices = dnsServices;
        this.domain = domain;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.revision = revision;
        this.sourceIp = sourceIp;
        this.type = type;
    }

    /**
     * Display name of the DNS Zone.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * DNS Server IP array of the DNS Zone.
     * 
    */
    public List<String> getDnsServerIps() {
        return this.dnsServerIps == null ? List.of() : this.dnsServerIps;
    }
    /**
     * Number of DNS Services using the DNS zone.
     * 
    */
    public Optional<Double> getDnsServices() {
        return Optional.ofNullable(this.dnsServices);
    }
    /**
     * Domain names of the DNS Zone.
     * 
    */
    public List<String> getDomain() {
        return this.domain == null ? List.of() : this.domain;
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
     * The provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
    */
    public Optional<Double> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * Source IP of the DNS Zone.
     * 
    */
    public Optional<String> getSourceIp() {
        return Optional.ofNullable(this.sourceIp);
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

    public static Builder builder(GetWorkloadNetworkDnsZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable List<String> dnsServerIps;
        private @Nullable Double dnsServices;
        private @Nullable List<String> domain;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable Double revision;
        private @Nullable String sourceIp;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkDnsZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.dnsServerIps = defaults.dnsServerIps;
    	      this.dnsServices = defaults.dnsServices;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.sourceIp = defaults.sourceIp;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDnsServerIps(@Nullable List<String> dnsServerIps) {
            this.dnsServerIps = dnsServerIps;
            return this;
        }

        public Builder setDnsServices(@Nullable Double dnsServices) {
            this.dnsServices = dnsServices;
            return this;
        }

        public Builder setDomain(@Nullable List<String> domain) {
            this.domain = domain;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRevision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }

        public Builder setSourceIp(@Nullable String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadNetworkDnsZoneResult build() {
            return new GetWorkloadNetworkDnsZoneResult(displayName, dnsServerIps, dnsServices, domain, id, name, provisioningState, revision, sourceIp, type);
        }
    }
}
