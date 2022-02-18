// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * DNSConfig contains the desired set of options for configuring clusterDNS.
 * 
 */
public final class DNSConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final DNSConfigResponse Empty = new DNSConfigResponse();

    /**
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * 
     */
    @InputImport(name="clusterDns", required=true)
    private final String clusterDns;

    public String getClusterDns() {
        return this.clusterDns;
    }

    /**
     * cluster_dns_domain is the suffix used for all cluster service records.
     * 
     */
    @InputImport(name="clusterDnsDomain", required=true)
    private final String clusterDnsDomain;

    public String getClusterDnsDomain() {
        return this.clusterDnsDomain;
    }

    /**
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * 
     */
    @InputImport(name="clusterDnsScope", required=true)
    private final String clusterDnsScope;

    public String getClusterDnsScope() {
        return this.clusterDnsScope;
    }

    public DNSConfigResponse(
        String clusterDns,
        String clusterDnsDomain,
        String clusterDnsScope) {
        this.clusterDns = Objects.requireNonNull(clusterDns, "expected parameter 'clusterDns' to be non-null");
        this.clusterDnsDomain = Objects.requireNonNull(clusterDnsDomain, "expected parameter 'clusterDnsDomain' to be non-null");
        this.clusterDnsScope = Objects.requireNonNull(clusterDnsScope, "expected parameter 'clusterDnsScope' to be non-null");
    }

    private DNSConfigResponse() {
        this.clusterDns = null;
        this.clusterDnsDomain = null;
        this.clusterDnsScope = null;
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
