// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.RouterAdvertisedIpRangeResponse;
import io.pulumi.googlenative.compute_v1.inputs.RouterBgpPeerBfdResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouterBgpPeerResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterBgpPeerResponse Empty = new RouterBgpPeerResponse();

    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * 
     */
    @InputImport(name="advertiseMode", required=true)
    private final String advertiseMode;

    public String getAdvertiseMode() {
        return this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom mode, which can take one of the following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets. - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    @InputImport(name="advertisedGroups", required=true)
    private final List<String> advertisedGroups;

    public List<String> getAdvertisedGroups() {
        return this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    @InputImport(name="advertisedIpRanges", required=true)
    private final List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;

    public List<RouterAdvertisedIpRangeResponse> getAdvertisedIpRanges() {
        return this.advertisedIpRanges;
    }

    /**
     * The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
     * 
     */
    @InputImport(name="advertisedRoutePriority", required=true)
    private final Integer advertisedRoutePriority;

    public Integer getAdvertisedRoutePriority() {
        return this.advertisedRoutePriority;
    }

    /**
     * BFD configuration for the BGP peering.
     * 
     */
    @InputImport(name="bfd", required=true)
    private final RouterBgpPeerBfdResponse bfd;

    public RouterBgpPeerBfdResponse getBfd() {
        return this.bfd;
    }

    /**
     * The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
     * 
     */
    @InputImport(name="enable", required=true)
    private final String enable;

    public String getEnable() {
        return this.enable;
    }

    /**
     * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
     * 
     */
    @InputImport(name="enableIpv6", required=true)
    private final Boolean enableIpv6;

    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    /**
     * Name of the interface the BGP peer is associated with.
     * 
     */
    @InputImport(name="interfaceName", required=true)
    private final String interfaceName;

    public String getInterfaceName() {
        return this.interfaceName;
    }

    /**
     * IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    @InputImport(name="ipAddress", required=true)
    private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * IPv6 address of the interface inside Google Cloud Platform.
     * 
     */
    @InputImport(name="ipv6NexthopAddress", required=true)
    private final String ipv6NexthopAddress;

    public String getIpv6NexthopAddress() {
        return this.ipv6NexthopAddress;
    }

    /**
     * The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    @InputImport(name="managementType", required=true)
    private final String managementType;

    public String getManagementType() {
        return this.managementType;
    }

    /**
     * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
     * 
     */
    @InputImport(name="peerAsn", required=true)
    private final Integer peerAsn;

    public Integer getPeerAsn() {
        return this.peerAsn;
    }

    /**
     * IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    @InputImport(name="peerIpAddress", required=true)
    private final String peerIpAddress;

    public String getPeerIpAddress() {
        return this.peerIpAddress;
    }

    /**
     * IPv6 address of the BGP interface outside Google Cloud Platform.
     * 
     */
    @InputImport(name="peerIpv6NexthopAddress", required=true)
    private final String peerIpv6NexthopAddress;

    public String getPeerIpv6NexthopAddress() {
        return this.peerIpv6NexthopAddress;
    }

    /**
     * URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
     * 
     */
    @InputImport(name="routerApplianceInstance", required=true)
    private final String routerApplianceInstance;

    public String getRouterApplianceInstance() {
        return this.routerApplianceInstance;
    }

    public RouterBgpPeerResponse(
        String advertiseMode,
        List<String> advertisedGroups,
        List<RouterAdvertisedIpRangeResponse> advertisedIpRanges,
        Integer advertisedRoutePriority,
        RouterBgpPeerBfdResponse bfd,
        String enable,
        Boolean enableIpv6,
        String interfaceName,
        String ipAddress,
        String ipv6NexthopAddress,
        String managementType,
        String name,
        Integer peerAsn,
        String peerIpAddress,
        String peerIpv6NexthopAddress,
        String routerApplianceInstance) {
        this.advertiseMode = Objects.requireNonNull(advertiseMode, "expected parameter 'advertiseMode' to be non-null");
        this.advertisedGroups = Objects.requireNonNull(advertisedGroups, "expected parameter 'advertisedGroups' to be non-null");
        this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges, "expected parameter 'advertisedIpRanges' to be non-null");
        this.advertisedRoutePriority = Objects.requireNonNull(advertisedRoutePriority, "expected parameter 'advertisedRoutePriority' to be non-null");
        this.bfd = Objects.requireNonNull(bfd, "expected parameter 'bfd' to be non-null");
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.enableIpv6 = Objects.requireNonNull(enableIpv6, "expected parameter 'enableIpv6' to be non-null");
        this.interfaceName = Objects.requireNonNull(interfaceName, "expected parameter 'interfaceName' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.ipv6NexthopAddress = Objects.requireNonNull(ipv6NexthopAddress, "expected parameter 'ipv6NexthopAddress' to be non-null");
        this.managementType = Objects.requireNonNull(managementType, "expected parameter 'managementType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.peerAsn = Objects.requireNonNull(peerAsn, "expected parameter 'peerAsn' to be non-null");
        this.peerIpAddress = Objects.requireNonNull(peerIpAddress, "expected parameter 'peerIpAddress' to be non-null");
        this.peerIpv6NexthopAddress = Objects.requireNonNull(peerIpv6NexthopAddress, "expected parameter 'peerIpv6NexthopAddress' to be non-null");
        this.routerApplianceInstance = Objects.requireNonNull(routerApplianceInstance, "expected parameter 'routerApplianceInstance' to be non-null");
    }

    private RouterBgpPeerResponse() {
        this.advertiseMode = null;
        this.advertisedGroups = List.of();
        this.advertisedIpRanges = List.of();
        this.advertisedRoutePriority = null;
        this.bfd = null;
        this.enable = null;
        this.enableIpv6 = null;
        this.interfaceName = null;
        this.ipAddress = null;
        this.ipv6NexthopAddress = null;
        this.managementType = null;
        this.name = null;
        this.peerAsn = null;
        this.peerIpAddress = null;
        this.peerIpv6NexthopAddress = null;
        this.routerApplianceInstance = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advertiseMode;
        private List<String> advertisedGroups;
        private List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;
        private Integer advertisedRoutePriority;
        private RouterBgpPeerBfdResponse bfd;
        private String enable;
        private Boolean enableIpv6;
        private String interfaceName;
        private String ipAddress;
        private String ipv6NexthopAddress;
        private String managementType;
        private String name;
        private Integer peerAsn;
        private String peerIpAddress;
        private String peerIpv6NexthopAddress;
        private String routerApplianceInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.advertisedRoutePriority = defaults.advertisedRoutePriority;
    	      this.bfd = defaults.bfd;
    	      this.enable = defaults.enable;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.interfaceName = defaults.interfaceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipv6NexthopAddress = defaults.ipv6NexthopAddress;
    	      this.managementType = defaults.managementType;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.peerIpv6NexthopAddress = defaults.peerIpv6NexthopAddress;
    	      this.routerApplianceInstance = defaults.routerApplianceInstance;
        }

        public Builder setAdvertiseMode(String advertiseMode) {
            this.advertiseMode = Objects.requireNonNull(advertiseMode);
            return this;
        }

        public Builder setAdvertisedGroups(List<String> advertisedGroups) {
            this.advertisedGroups = Objects.requireNonNull(advertisedGroups);
            return this;
        }

        public Builder setAdvertisedIpRanges(List<RouterAdvertisedIpRangeResponse> advertisedIpRanges) {
            this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges);
            return this;
        }

        public Builder setAdvertisedRoutePriority(Integer advertisedRoutePriority) {
            this.advertisedRoutePriority = Objects.requireNonNull(advertisedRoutePriority);
            return this;
        }

        public Builder setBfd(RouterBgpPeerBfdResponse bfd) {
            this.bfd = Objects.requireNonNull(bfd);
            return this;
        }

        public Builder setEnable(String enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setEnableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = Objects.requireNonNull(enableIpv6);
            return this;
        }

        public Builder setInterfaceName(String interfaceName) {
            this.interfaceName = Objects.requireNonNull(interfaceName);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setIpv6NexthopAddress(String ipv6NexthopAddress) {
            this.ipv6NexthopAddress = Objects.requireNonNull(ipv6NexthopAddress);
            return this;
        }

        public Builder setManagementType(String managementType) {
            this.managementType = Objects.requireNonNull(managementType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeerAsn(Integer peerAsn) {
            this.peerAsn = Objects.requireNonNull(peerAsn);
            return this;
        }

        public Builder setPeerIpAddress(String peerIpAddress) {
            this.peerIpAddress = Objects.requireNonNull(peerIpAddress);
            return this;
        }

        public Builder setPeerIpv6NexthopAddress(String peerIpv6NexthopAddress) {
            this.peerIpv6NexthopAddress = Objects.requireNonNull(peerIpv6NexthopAddress);
            return this;
        }

        public Builder setRouterApplianceInstance(String routerApplianceInstance) {
            this.routerApplianceInstance = Objects.requireNonNull(routerApplianceInstance);
            return this;
        }

        public RouterBgpPeerResponse build() {
            return new RouterBgpPeerResponse(advertiseMode, advertisedGroups, advertisedIpRanges, advertisedRoutePriority, bfd, enable, enableIpv6, interfaceName, ipAddress, ipv6NexthopAddress, managementType, name, peerAsn, peerIpAddress, peerIpv6NexthopAddress, routerApplianceInstance);
        }
    }
}
