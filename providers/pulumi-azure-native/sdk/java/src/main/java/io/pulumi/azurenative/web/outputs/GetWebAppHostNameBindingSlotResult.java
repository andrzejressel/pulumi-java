// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppHostNameBindingSlotResult {
    /**
     * Azure resource name.
     * 
     */
    private final @Nullable String azureResourceName;
    /**
     * Azure resource type.
     * 
     */
    private final @Nullable String azureResourceType;
    /**
     * Custom DNS record type.
     * 
     */
    private final @Nullable String customHostNameDnsRecordType;
    /**
     * Fully qualified ARM domain resource URI.
     * 
     */
    private final @Nullable String domainId;
    /**
     * Hostname type.
     * 
     */
    private final @Nullable String hostNameType;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * App Service app name.
     * 
     */
    private final @Nullable String siteName;
    /**
     * SSL type
     * 
     */
    private final @Nullable String sslState;
    /**
     * SSL certificate thumbprint
     * 
     */
    private final @Nullable String thumbprint;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    private final String virtualIP;

    @OutputCustomType.Constructor
    private GetWebAppHostNameBindingSlotResult(
        @OutputCustomType.Parameter("azureResourceName") @Nullable String azureResourceName,
        @OutputCustomType.Parameter("azureResourceType") @Nullable String azureResourceType,
        @OutputCustomType.Parameter("customHostNameDnsRecordType") @Nullable String customHostNameDnsRecordType,
        @OutputCustomType.Parameter("domainId") @Nullable String domainId,
        @OutputCustomType.Parameter("hostNameType") @Nullable String hostNameType,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("siteName") @Nullable String siteName,
        @OutputCustomType.Parameter("sslState") @Nullable String sslState,
        @OutputCustomType.Parameter("thumbprint") @Nullable String thumbprint,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("virtualIP") String virtualIP) {
        this.azureResourceName = azureResourceName;
        this.azureResourceType = azureResourceType;
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
        this.domainId = domainId;
        this.hostNameType = hostNameType;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.siteName = siteName;
        this.sslState = sslState;
        this.thumbprint = thumbprint;
        this.type = type;
        this.virtualIP = virtualIP;
    }

    /**
     * Azure resource name.
     * 
    */
    public Optional<String> getAzureResourceName() {
        return Optional.ofNullable(this.azureResourceName);
    }
    /**
     * Azure resource type.
     * 
    */
    public Optional<String> getAzureResourceType() {
        return Optional.ofNullable(this.azureResourceType);
    }
    /**
     * Custom DNS record type.
     * 
    */
    public Optional<String> getCustomHostNameDnsRecordType() {
        return Optional.ofNullable(this.customHostNameDnsRecordType);
    }
    /**
     * Fully qualified ARM domain resource URI.
     * 
    */
    public Optional<String> getDomainId() {
        return Optional.ofNullable(this.domainId);
    }
    /**
     * Hostname type.
     * 
    */
    public Optional<String> getHostNameType() {
        return Optional.ofNullable(this.hostNameType);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * App Service app name.
     * 
    */
    public Optional<String> getSiteName() {
        return Optional.ofNullable(this.siteName);
    }
    /**
     * SSL type
     * 
    */
    public Optional<String> getSslState() {
        return Optional.ofNullable(this.sslState);
    }
    /**
     * SSL certificate thumbprint
     * 
    */
    public Optional<String> getThumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
    */
    public String getVirtualIP() {
        return this.virtualIP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppHostNameBindingSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureResourceName;
        private @Nullable String azureResourceType;
        private @Nullable String customHostNameDnsRecordType;
        private @Nullable String domainId;
        private @Nullable String hostNameType;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String siteName;
        private @Nullable String sslState;
        private @Nullable String thumbprint;
        private String type;
        private String virtualIP;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppHostNameBindingSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureResourceName = defaults.azureResourceName;
    	      this.azureResourceType = defaults.azureResourceType;
    	      this.customHostNameDnsRecordType = defaults.customHostNameDnsRecordType;
    	      this.domainId = defaults.domainId;
    	      this.hostNameType = defaults.hostNameType;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.siteName = defaults.siteName;
    	      this.sslState = defaults.sslState;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
    	      this.virtualIP = defaults.virtualIP;
        }

        public Builder setAzureResourceName(@Nullable String azureResourceName) {
            this.azureResourceName = azureResourceName;
            return this;
        }

        public Builder setAzureResourceType(@Nullable String azureResourceType) {
            this.azureResourceType = azureResourceType;
            return this;
        }

        public Builder setCustomHostNameDnsRecordType(@Nullable String customHostNameDnsRecordType) {
            this.customHostNameDnsRecordType = customHostNameDnsRecordType;
            return this;
        }

        public Builder setDomainId(@Nullable String domainId) {
            this.domainId = domainId;
            return this;
        }

        public Builder setHostNameType(@Nullable String hostNameType) {
            this.hostNameType = hostNameType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSiteName(@Nullable String siteName) {
            this.siteName = siteName;
            return this;
        }

        public Builder setSslState(@Nullable String sslState) {
            this.sslState = sslState;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualIP(String virtualIP) {
            this.virtualIP = Objects.requireNonNull(virtualIP);
            return this;
        }
        public GetWebAppHostNameBindingSlotResult build() {
            return new GetWebAppHostNameBindingSlotResult(azureResourceName, azureResourceType, customHostNameDnsRecordType, domainId, hostNameType, id, kind, name, siteName, sslState, thumbprint, type, virtualIP);
        }
    }
}
