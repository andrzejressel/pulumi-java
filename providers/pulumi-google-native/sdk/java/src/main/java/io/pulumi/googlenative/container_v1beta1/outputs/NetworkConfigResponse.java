// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.DNSConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.DefaultSnatStatusResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.ServiceExternalIPsConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkConfigResponse {
    /**
     * The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy implementation.
     * 
     */
    private final String datapathProvider;
    /**
     * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when default_snat_status is disabled. When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
     * 
     */
    private final DefaultSnatStatusResponse defaultSnatStatus;
    /**
     * DNSConfig contains clusterDNS config for this cluster.
     * 
     */
    private final DNSConfigResponse dnsConfig;
    /**
     * Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod traffic visible for VPC network.
     * 
     */
    private final Boolean enableIntraNodeVisibility;
    /**
     * Whether L4ILB Subsetting is enabled for this cluster.
     * 
     */
    private final Boolean enableL4ilbSubsetting;
    /**
     * The relative name of the Google Compute Engine network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. Example: projects/my-project/global/networks/my-network
     * 
     */
    private final String network;
    /**
     * The desired state of IPv6 connectivity to Google Services. By default, no private IPv6 access to or from Google Services (all access will be via IPv4)
     * 
     */
    private final String privateIpv6GoogleAccess;
    /**
     * ServiceExternalIPsConfig specifies if services with externalIPs field are blocked or not.
     * 
     */
    private final ServiceExternalIPsConfigResponse serviceExternalIpsConfig;
    /**
     * The relative name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected. Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * 
     */
    private final String subnetwork;

    @OutputCustomType.Constructor({"datapathProvider","defaultSnatStatus","dnsConfig","enableIntraNodeVisibility","enableL4ilbSubsetting","network","privateIpv6GoogleAccess","serviceExternalIpsConfig","subnetwork"})
    private NetworkConfigResponse(
        String datapathProvider,
        DefaultSnatStatusResponse defaultSnatStatus,
        DNSConfigResponse dnsConfig,
        Boolean enableIntraNodeVisibility,
        Boolean enableL4ilbSubsetting,
        String network,
        String privateIpv6GoogleAccess,
        ServiceExternalIPsConfigResponse serviceExternalIpsConfig,
        String subnetwork) {
        this.datapathProvider = Objects.requireNonNull(datapathProvider);
        this.defaultSnatStatus = Objects.requireNonNull(defaultSnatStatus);
        this.dnsConfig = Objects.requireNonNull(dnsConfig);
        this.enableIntraNodeVisibility = Objects.requireNonNull(enableIntraNodeVisibility);
        this.enableL4ilbSubsetting = Objects.requireNonNull(enableL4ilbSubsetting);
        this.network = Objects.requireNonNull(network);
        this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
        this.serviceExternalIpsConfig = Objects.requireNonNull(serviceExternalIpsConfig);
        this.subnetwork = Objects.requireNonNull(subnetwork);
    }

    /**
     * The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy implementation.
     * 
     */
    public String getDatapathProvider() {
        return this.datapathProvider;
    }
    /**
     * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when default_snat_status is disabled. When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
     * 
     */
    public DefaultSnatStatusResponse getDefaultSnatStatus() {
        return this.defaultSnatStatus;
    }
    /**
     * DNSConfig contains clusterDNS config for this cluster.
     * 
     */
    public DNSConfigResponse getDnsConfig() {
        return this.dnsConfig;
    }
    /**
     * Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod traffic visible for VPC network.
     * 
     */
    public Boolean getEnableIntraNodeVisibility() {
        return this.enableIntraNodeVisibility;
    }
    /**
     * Whether L4ILB Subsetting is enabled for this cluster.
     * 
     */
    public Boolean getEnableL4ilbSubsetting() {
        return this.enableL4ilbSubsetting;
    }
    /**
     * The relative name of the Google Compute Engine network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. Example: projects/my-project/global/networks/my-network
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The desired state of IPv6 connectivity to Google Services. By default, no private IPv6 access to or from Google Services (all access will be via IPv4)
     * 
     */
    public String getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * ServiceExternalIPsConfig specifies if services with externalIPs field are blocked or not.
     * 
     */
    public ServiceExternalIPsConfigResponse getServiceExternalIpsConfig() {
        return this.serviceExternalIpsConfig;
    }
    /**
     * The relative name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected. Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * 
     */
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datapathProvider;
        private DefaultSnatStatusResponse defaultSnatStatus;
        private DNSConfigResponse dnsConfig;
        private Boolean enableIntraNodeVisibility;
        private Boolean enableL4ilbSubsetting;
        private String network;
        private String privateIpv6GoogleAccess;
        private ServiceExternalIPsConfigResponse serviceExternalIpsConfig;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datapathProvider = defaults.datapathProvider;
    	      this.defaultSnatStatus = defaults.defaultSnatStatus;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.enableIntraNodeVisibility = defaults.enableIntraNodeVisibility;
    	      this.enableL4ilbSubsetting = defaults.enableL4ilbSubsetting;
    	      this.network = defaults.network;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.serviceExternalIpsConfig = defaults.serviceExternalIpsConfig;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setDatapathProvider(String datapathProvider) {
            this.datapathProvider = Objects.requireNonNull(datapathProvider);
            return this;
        }

        public Builder setDefaultSnatStatus(DefaultSnatStatusResponse defaultSnatStatus) {
            this.defaultSnatStatus = Objects.requireNonNull(defaultSnatStatus);
            return this;
        }

        public Builder setDnsConfig(DNSConfigResponse dnsConfig) {
            this.dnsConfig = Objects.requireNonNull(dnsConfig);
            return this;
        }

        public Builder setEnableIntraNodeVisibility(Boolean enableIntraNodeVisibility) {
            this.enableIntraNodeVisibility = Objects.requireNonNull(enableIntraNodeVisibility);
            return this;
        }

        public Builder setEnableL4ilbSubsetting(Boolean enableL4ilbSubsetting) {
            this.enableL4ilbSubsetting = Objects.requireNonNull(enableL4ilbSubsetting);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }

        public Builder setServiceExternalIpsConfig(ServiceExternalIPsConfigResponse serviceExternalIpsConfig) {
            this.serviceExternalIpsConfig = Objects.requireNonNull(serviceExternalIpsConfig);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(datapathProvider, defaultSnatStatus, dnsConfig, enableIntraNodeVisibility, enableL4ilbSubsetting, network, privateIpv6GoogleAccess, serviceExternalIpsConfig, subnetwork);
        }
    }
}
