// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnTunnelArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnTunnelArgs Empty = new VpnTunnelArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    @InputImport(name="ikeVersion")
    private final @Nullable Input<Integer> ikeVersion;

    public Input<Integer> getIkeVersion() {
        return this.ikeVersion == null ? Input.empty() : this.ikeVersion;
    }

    /**
     * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    @InputImport(name="localTrafficSelector")
    private final @Nullable Input<List<String>> localTrafficSelector;

    public Input<List<String>> getLocalTrafficSelector() {
        return this.localTrafficSelector == null ? Input.empty() : this.localTrafficSelector;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    @InputImport(name="peerExternalGateway")
    private final @Nullable Input<String> peerExternalGateway;

    public Input<String> getPeerExternalGateway() {
        return this.peerExternalGateway == null ? Input.empty() : this.peerExternalGateway;
    }

    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    @InputImport(name="peerExternalGatewayInterface")
    private final @Nullable Input<Integer> peerExternalGatewayInterface;

    public Input<Integer> getPeerExternalGatewayInterface() {
        return this.peerExternalGatewayInterface == null ? Input.empty() : this.peerExternalGatewayInterface;
    }

    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    @InputImport(name="peerGcpGateway")
    private final @Nullable Input<String> peerGcpGateway;

    public Input<String> getPeerGcpGateway() {
        return this.peerGcpGateway == null ? Input.empty() : this.peerGcpGateway;
    }

    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    @InputImport(name="peerIp")
    private final @Nullable Input<String> peerIp;

    public Input<String> getPeerIp() {
        return this.peerIp == null ? Input.empty() : this.peerIp;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    /**
     * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    @InputImport(name="remoteTrafficSelector")
    private final @Nullable Input<List<String>> remoteTrafficSelector;

    public Input<List<String>> getRemoteTrafficSelector() {
        return this.remoteTrafficSelector == null ? Input.empty() : this.remoteTrafficSelector;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * URL of the router resource to be used for dynamic routing.
     * 
     */
    @InputImport(name="router")
    private final @Nullable Input<String> router;

    public Input<String> getRouter() {
        return this.router == null ? Input.empty() : this.router;
    }

    /**
     * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    @InputImport(name="sharedSecret")
    private final @Nullable Input<String> sharedSecret;

    public Input<String> getSharedSecret() {
        return this.sharedSecret == null ? Input.empty() : this.sharedSecret;
    }

    /**
     * Hash of the shared secret.
     * 
     */
    @InputImport(name="sharedSecretHash")
    private final @Nullable Input<String> sharedSecretHash;

    public Input<String> getSharedSecretHash() {
        return this.sharedSecretHash == null ? Input.empty() : this.sharedSecretHash;
    }

    /**
     * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    @InputImport(name="targetVpnGateway")
    private final @Nullable Input<String> targetVpnGateway;

    public Input<String> getTargetVpnGateway() {
        return this.targetVpnGateway == null ? Input.empty() : this.targetVpnGateway;
    }

    /**
     * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    @InputImport(name="vpnGateway")
    private final @Nullable Input<String> vpnGateway;

    public Input<String> getVpnGateway() {
        return this.vpnGateway == null ? Input.empty() : this.vpnGateway;
    }

    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    @InputImport(name="vpnGatewayInterface")
    private final @Nullable Input<Integer> vpnGatewayInterface;

    public Input<Integer> getVpnGatewayInterface() {
        return this.vpnGatewayInterface == null ? Input.empty() : this.vpnGatewayInterface;
    }

    public VpnTunnelArgs(
        @Nullable Input<String> description,
        @Nullable Input<Integer> ikeVersion,
        @Nullable Input<List<String>> localTrafficSelector,
        @Nullable Input<String> name,
        @Nullable Input<String> peerExternalGateway,
        @Nullable Input<Integer> peerExternalGatewayInterface,
        @Nullable Input<String> peerGcpGateway,
        @Nullable Input<String> peerIp,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<List<String>> remoteTrafficSelector,
        @Nullable Input<String> requestId,
        @Nullable Input<String> router,
        @Nullable Input<String> sharedSecret,
        @Nullable Input<String> sharedSecretHash,
        @Nullable Input<String> targetVpnGateway,
        @Nullable Input<String> vpnGateway,
        @Nullable Input<Integer> vpnGatewayInterface) {
        this.description = description;
        this.ikeVersion = ikeVersion;
        this.localTrafficSelector = localTrafficSelector;
        this.name = name;
        this.peerExternalGateway = peerExternalGateway;
        this.peerExternalGatewayInterface = peerExternalGatewayInterface;
        this.peerGcpGateway = peerGcpGateway;
        this.peerIp = peerIp;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.remoteTrafficSelector = remoteTrafficSelector;
        this.requestId = requestId;
        this.router = router;
        this.sharedSecret = sharedSecret;
        this.sharedSecretHash = sharedSecretHash;
        this.targetVpnGateway = targetVpnGateway;
        this.vpnGateway = vpnGateway;
        this.vpnGatewayInterface = vpnGatewayInterface;
    }

    private VpnTunnelArgs() {
        this.description = Input.empty();
        this.ikeVersion = Input.empty();
        this.localTrafficSelector = Input.empty();
        this.name = Input.empty();
        this.peerExternalGateway = Input.empty();
        this.peerExternalGatewayInterface = Input.empty();
        this.peerGcpGateway = Input.empty();
        this.peerIp = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.remoteTrafficSelector = Input.empty();
        this.requestId = Input.empty();
        this.router = Input.empty();
        this.sharedSecret = Input.empty();
        this.sharedSecretHash = Input.empty();
        this.targetVpnGateway = Input.empty();
        this.vpnGateway = Input.empty();
        this.vpnGatewayInterface = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> ikeVersion;
        private @Nullable Input<List<String>> localTrafficSelector;
        private @Nullable Input<String> name;
        private @Nullable Input<String> peerExternalGateway;
        private @Nullable Input<Integer> peerExternalGatewayInterface;
        private @Nullable Input<String> peerGcpGateway;
        private @Nullable Input<String> peerIp;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<List<String>> remoteTrafficSelector;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> router;
        private @Nullable Input<String> sharedSecret;
        private @Nullable Input<String> sharedSecretHash;
        private @Nullable Input<String> targetVpnGateway;
        private @Nullable Input<String> vpnGateway;
        private @Nullable Input<Integer> vpnGatewayInterface;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnTunnelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.localTrafficSelector = defaults.localTrafficSelector;
    	      this.name = defaults.name;
    	      this.peerExternalGateway = defaults.peerExternalGateway;
    	      this.peerExternalGatewayInterface = defaults.peerExternalGatewayInterface;
    	      this.peerGcpGateway = defaults.peerGcpGateway;
    	      this.peerIp = defaults.peerIp;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.remoteTrafficSelector = defaults.remoteTrafficSelector;
    	      this.requestId = defaults.requestId;
    	      this.router = defaults.router;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.sharedSecretHash = defaults.sharedSecretHash;
    	      this.targetVpnGateway = defaults.targetVpnGateway;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnGatewayInterface = defaults.vpnGatewayInterface;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIkeVersion(@Nullable Input<Integer> ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }

        public Builder setIkeVersion(@Nullable Integer ikeVersion) {
            this.ikeVersion = Input.ofNullable(ikeVersion);
            return this;
        }

        public Builder setLocalTrafficSelector(@Nullable Input<List<String>> localTrafficSelector) {
            this.localTrafficSelector = localTrafficSelector;
            return this;
        }

        public Builder setLocalTrafficSelector(@Nullable List<String> localTrafficSelector) {
            this.localTrafficSelector = Input.ofNullable(localTrafficSelector);
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

        public Builder setPeerExternalGateway(@Nullable Input<String> peerExternalGateway) {
            this.peerExternalGateway = peerExternalGateway;
            return this;
        }

        public Builder setPeerExternalGateway(@Nullable String peerExternalGateway) {
            this.peerExternalGateway = Input.ofNullable(peerExternalGateway);
            return this;
        }

        public Builder setPeerExternalGatewayInterface(@Nullable Input<Integer> peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = peerExternalGatewayInterface;
            return this;
        }

        public Builder setPeerExternalGatewayInterface(@Nullable Integer peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = Input.ofNullable(peerExternalGatewayInterface);
            return this;
        }

        public Builder setPeerGcpGateway(@Nullable Input<String> peerGcpGateway) {
            this.peerGcpGateway = peerGcpGateway;
            return this;
        }

        public Builder setPeerGcpGateway(@Nullable String peerGcpGateway) {
            this.peerGcpGateway = Input.ofNullable(peerGcpGateway);
            return this;
        }

        public Builder setPeerIp(@Nullable Input<String> peerIp) {
            this.peerIp = peerIp;
            return this;
        }

        public Builder setPeerIp(@Nullable String peerIp) {
            this.peerIp = Input.ofNullable(peerIp);
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

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRemoteTrafficSelector(@Nullable Input<List<String>> remoteTrafficSelector) {
            this.remoteTrafficSelector = remoteTrafficSelector;
            return this;
        }

        public Builder setRemoteTrafficSelector(@Nullable List<String> remoteTrafficSelector) {
            this.remoteTrafficSelector = Input.ofNullable(remoteTrafficSelector);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
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

        public Builder setSharedSecret(@Nullable Input<String> sharedSecret) {
            this.sharedSecret = sharedSecret;
            return this;
        }

        public Builder setSharedSecret(@Nullable String sharedSecret) {
            this.sharedSecret = Input.ofNullable(sharedSecret);
            return this;
        }

        public Builder setSharedSecretHash(@Nullable Input<String> sharedSecretHash) {
            this.sharedSecretHash = sharedSecretHash;
            return this;
        }

        public Builder setSharedSecretHash(@Nullable String sharedSecretHash) {
            this.sharedSecretHash = Input.ofNullable(sharedSecretHash);
            return this;
        }

        public Builder setTargetVpnGateway(@Nullable Input<String> targetVpnGateway) {
            this.targetVpnGateway = targetVpnGateway;
            return this;
        }

        public Builder setTargetVpnGateway(@Nullable String targetVpnGateway) {
            this.targetVpnGateway = Input.ofNullable(targetVpnGateway);
            return this;
        }

        public Builder setVpnGateway(@Nullable Input<String> vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }

        public Builder setVpnGateway(@Nullable String vpnGateway) {
            this.vpnGateway = Input.ofNullable(vpnGateway);
            return this;
        }

        public Builder setVpnGatewayInterface(@Nullable Input<Integer> vpnGatewayInterface) {
            this.vpnGatewayInterface = vpnGatewayInterface;
            return this;
        }

        public Builder setVpnGatewayInterface(@Nullable Integer vpnGatewayInterface) {
            this.vpnGatewayInterface = Input.ofNullable(vpnGatewayInterface);
            return this;
        }

        public VpnTunnelArgs build() {
            return new VpnTunnelArgs(description, ikeVersion, localTrafficSelector, name, peerExternalGateway, peerExternalGatewayInterface, peerGcpGateway, peerIp, project, region, remoteTrafficSelector, requestId, router, sharedSecret, sharedSecretHash, targetVpnGateway, vpnGateway, vpnGatewayInterface);
        }
    }
}
