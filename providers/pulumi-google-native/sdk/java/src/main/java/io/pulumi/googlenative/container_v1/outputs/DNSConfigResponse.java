// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DNSConfigResponse {
    /**
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * 
     */
    private final String clusterDns;
    /**
     * cluster_dns_domain is the suffix used for all cluster service records.
     * 
     */
    private final String clusterDnsDomain;
    /**
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * 
     */
    private final String clusterDnsScope;

    @OutputCustomType.Constructor({"clusterDns","clusterDnsDomain","clusterDnsScope"})
    private DNSConfigResponse(
        String clusterDns,
        String clusterDnsDomain,
        String clusterDnsScope) {
        this.clusterDns = Objects.requireNonNull(clusterDns);
        this.clusterDnsDomain = Objects.requireNonNull(clusterDnsDomain);
        this.clusterDnsScope = Objects.requireNonNull(clusterDnsScope);
    }

    /**
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * 
     */
    public String getClusterDns() {
        return this.clusterDns;
    }
    /**
     * cluster_dns_domain is the suffix used for all cluster service records.
     * 
     */
    public String getClusterDnsDomain() {
        return this.clusterDnsDomain;
    }
    /**
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * 
     */
    public String getClusterDnsScope() {
        return this.clusterDnsScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DNSConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterDns;
        private String clusterDnsDomain;
        private String clusterDnsScope;

        public Builder() {
    	      // Empty
        }

        public Builder(DNSConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDns = defaults.clusterDns;
    	      this.clusterDnsDomain = defaults.clusterDnsDomain;
    	      this.clusterDnsScope = defaults.clusterDnsScope;
        }

        public Builder setClusterDns(String clusterDns) {
            this.clusterDns = Objects.requireNonNull(clusterDns);
            return this;
        }

        public Builder setClusterDnsDomain(String clusterDnsDomain) {
            this.clusterDnsDomain = Objects.requireNonNull(clusterDnsDomain);
            return this;
        }

        public Builder setClusterDnsScope(String clusterDnsScope) {
            this.clusterDnsScope = Objects.requireNonNull(clusterDnsScope);
            return this;
        }

        public DNSConfigResponse build() {
            return new DNSConfigResponse(clusterDns, clusterDnsDomain, clusterDnsScope);
        }
    }
}
