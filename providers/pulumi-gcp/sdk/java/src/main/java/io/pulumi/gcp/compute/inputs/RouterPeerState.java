// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RouterPeerAdvertisedIpRangeGetArgs;
import io.pulumi.gcp.compute.inputs.RouterPeerBfdGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterPeerState extends io.pulumi.resources.ResourceArgs {

    public static final RouterPeerState Empty = new RouterPeerState();

    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * Valid values of this enum field are: `DEFAULT`, `CUSTOM`
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `CUSTOM`.
     * 
     */
    @InputImport(name="advertiseMode")
    private final @Nullable Input<String> advertiseMode;

    public Input<String> getAdvertiseMode() {
        return this.advertiseMode == null ? Input.empty() : this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom
     * mode, which can take one of the following options:
     * * `ALL_SUBNETS`: Advertises all available subnets, including peer VPC subnets.
     * * `ALL_VPC_SUBNETS`: Advertises the router's own VPC subnets.
     * * `ALL_PEER_VPC_SUBNETS`: Advertises peer subnets of the router's VPC network.
     * 
     */
    @InputImport(name="advertisedGroups")
    private final @Nullable Input<List<String>> advertisedGroups;

    public Input<List<String>> getAdvertisedGroups() {
        return this.advertisedGroups == null ? Input.empty() : this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is `CUSTOM` and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * 
     */
    @InputImport(name="advertisedIpRanges")
    private final @Nullable Input<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges;

    public Input<List<RouterPeerAdvertisedIpRangeGetArgs>> getAdvertisedIpRanges() {
        return this.advertisedIpRanges == null ? Input.empty() : this.advertisedIpRanges;
    }

    /**
     * The priority of routes advertised to this BGP peer.
     * Where there is more than one matching route of maximum
     * length, the routes with the lowest priority value win.
     * 
     */
    @InputImport(name="advertisedRoutePriority")
    private final @Nullable Input<Integer> advertisedRoutePriority;

    public Input<Integer> getAdvertisedRoutePriority() {
        return this.advertisedRoutePriority == null ? Input.empty() : this.advertisedRoutePriority;
    }

    /**
     * BFD configuration for the BGP peering.
     * Structure is documented below.
     * 
     */
    @InputImport(name="bfd")
    private final @Nullable Input<RouterPeerBfdGetArgs> bfd;

    public Input<RouterPeerBfdGetArgs> getBfd() {
        return this.bfd == null ? Input.empty() : this.bfd;
    }

    /**
     * The status of the BGP peer connection. If set to false, any active session
     * with the peer is terminated and all associated routing information is removed.
     * If set to true, the peer connection can be established with routing information.
     * The default is true.
     * 
     */
    @InputImport(name="enable")
    private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Name of the interface the BGP peer is associated with.
     * 
     */
    @InputImport(name="interface")
    private final @Nullable Input<String> $interface;

    public Input<String> get$interface() {
        return this.$interface == null ? Input.empty() : this.$interface;
    }

    /**
     * IP address of the interface inside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The resource that configures and manages this BGP peer. * 'MANAGED_BY_USER' is the default value and can be managed by
     * you or other users * 'MANAGED_BY_ATTACHMENT' is a BGP peer that is configured and managed by Cloud Interconnect,
     * specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type
     * of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    @InputImport(name="managementType")
    private final @Nullable Input<String> managementType;

    public Input<String> getManagementType() {
        return this.managementType == null ? Input.empty() : this.managementType;
    }

    /**
     * Name of this BGP peer. The name must be 1-63 characters long,
     * and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Peer BGP Autonomous System Number (ASN).
     * Each BGP interface may use a different value.
     * 
     */
    @InputImport(name="peerAsn")
    private final @Nullable Input<Integer> peerAsn;

    public Input<Integer> getPeerAsn() {
        return this.peerAsn == null ? Input.empty() : this.peerAsn;
    }

    /**
     * IP address of the BGP interface outside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    @InputImport(name="peerIpAddress")
    private final @Nullable Input<String> peerIpAddress;

    public Input<String> getPeerIpAddress() {
        return this.peerIpAddress == null ? Input.empty() : this.peerIpAddress;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Region where the router and BgpPeer reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The name of the Cloud Router in which this BgpPeer will be configured.
     * 
     */
    @InputImport(name="router")
    private final @Nullable Input<String> router;

    public Input<String> getRouter() {
        return this.router == null ? Input.empty() : this.router;
    }

    public RouterPeerState(
        @Nullable Input<String> advertiseMode,
        @Nullable Input<List<String>> advertisedGroups,
        @Nullable Input<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges,
        @Nullable Input<Integer> advertisedRoutePriority,
        @Nullable Input<RouterPeerBfdGetArgs> bfd,
        @Nullable Input<Boolean> enable,
        @Nullable Input<String> $interface,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> managementType,
        @Nullable Input<String> name,
        @Nullable Input<Integer> peerAsn,
        @Nullable Input<String> peerIpAddress,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> router) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.advertisedRoutePriority = advertisedRoutePriority;
        this.bfd = bfd;
        this.enable = enable;
        this.$interface = $interface;
        this.ipAddress = ipAddress;
        this.managementType = managementType;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIpAddress = peerIpAddress;
        this.project = project;
        this.region = region;
        this.router = router;
    }

    private RouterPeerState() {
        this.advertiseMode = Input.empty();
        this.advertisedGroups = Input.empty();
        this.advertisedIpRanges = Input.empty();
        this.advertisedRoutePriority = Input.empty();
        this.bfd = Input.empty();
        this.enable = Input.empty();
        this.$interface = Input.empty();
        this.ipAddress = Input.empty();
        this.managementType = Input.empty();
        this.name = Input.empty();
        this.peerAsn = Input.empty();
        this.peerIpAddress = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.router = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterPeerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> advertiseMode;
        private @Nullable Input<List<String>> advertisedGroups;
        private @Nullable Input<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges;
        private @Nullable Input<Integer> advertisedRoutePriority;
        private @Nullable Input<RouterPeerBfdGetArgs> bfd;
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<String> $interface;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> managementType;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> peerAsn;
        private @Nullable Input<String> peerIpAddress;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> router;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterPeerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.advertisedRoutePriority = defaults.advertisedRoutePriority;
    	      this.bfd = defaults.bfd;
    	      this.enable = defaults.enable;
    	      this.$interface = defaults.$interface;
    	      this.ipAddress = defaults.ipAddress;
    	      this.managementType = defaults.managementType;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.router = defaults.router;
        }

        public Builder setAdvertiseMode(@Nullable Input<String> advertiseMode) {
            this.advertiseMode = advertiseMode;
            return this;
        }

        public Builder setAdvertiseMode(@Nullable String advertiseMode) {
            this.advertiseMode = Input.ofNullable(advertiseMode);
            return this;
        }

        public Builder setAdvertisedGroups(@Nullable Input<List<String>> advertisedGroups) {
            this.advertisedGroups = advertisedGroups;
            return this;
        }

        public Builder setAdvertisedGroups(@Nullable List<String> advertisedGroups) {
            this.advertisedGroups = Input.ofNullable(advertisedGroups);
            return this;
        }

        public Builder setAdvertisedIpRanges(@Nullable Input<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges) {
            this.advertisedIpRanges = advertisedIpRanges;
            return this;
        }

        public Builder setAdvertisedIpRanges(@Nullable List<RouterPeerAdvertisedIpRangeGetArgs> advertisedIpRanges) {
            this.advertisedIpRanges = Input.ofNullable(advertisedIpRanges);
            return this;
        }

        public Builder setAdvertisedRoutePriority(@Nullable Input<Integer> advertisedRoutePriority) {
            this.advertisedRoutePriority = advertisedRoutePriority;
            return this;
        }

        public Builder setAdvertisedRoutePriority(@Nullable Integer advertisedRoutePriority) {
            this.advertisedRoutePriority = Input.ofNullable(advertisedRoutePriority);
            return this;
        }

        public Builder setBfd(@Nullable Input<RouterPeerBfdGetArgs> bfd) {
            this.bfd = bfd;
            return this;
        }

        public Builder setBfd(@Nullable RouterPeerBfdGetArgs bfd) {
            this.bfd = Input.ofNullable(bfd);
            return this;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder set$interface(@Nullable Input<String> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = Input.ofNullable($interface);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setManagementType(@Nullable Input<String> managementType) {
            this.managementType = managementType;
            return this;
        }

        public Builder setManagementType(@Nullable String managementType) {
            this.managementType = Input.ofNullable(managementType);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPeerAsn(@Nullable Input<Integer> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }

        public Builder setPeerAsn(@Nullable Integer peerAsn) {
            this.peerAsn = Input.ofNullable(peerAsn);
            return this;
        }

        public Builder setPeerIpAddress(@Nullable Input<String> peerIpAddress) {
            this.peerIpAddress = peerIpAddress;
            return this;
        }

        public Builder setPeerIpAddress(@Nullable String peerIpAddress) {
            this.peerIpAddress = Input.ofNullable(peerIpAddress);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRouter(@Nullable Input<String> router) {
            this.router = router;
            return this;
        }

        public Builder setRouter(@Nullable String router) {
            this.router = Input.ofNullable(router);
            return this;
        }

        public RouterPeerState build() {
            return new RouterPeerState(advertiseMode, advertisedGroups, advertisedIpRanges, advertisedRoutePriority, bfd, enable, $interface, ipAddress, managementType, name, peerAsn, peerIpAddress, project, region, router);
        }
    }
}
