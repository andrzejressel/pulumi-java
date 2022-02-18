// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteState extends io.pulumi.resources.ResourceArgs {

    public static final RouteState Empty = new RouteState();

    /**
     * An optional description of this resource. Provide this property
     * when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The destination range of outgoing packets that this route applies to.
     * Only IPv4 is supported.
     * 
     */
    @InputImport(name="destRange")
    private final @Nullable Input<String> destRange;

    public Input<String> getDestRange() {
        return this.destRange == null ? Input.empty() : this.destRange;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network that this route applies to.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * URL to a gateway that should handle matching packets.
     * Currently, you can only specify the internet gateway, using a full or
     * partial valid URL:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway`
     * * `projects/project/global/gateways/default-internet-gateway`
     * * `global/gateways/default-internet-gateway`
     * * The string `default-internet-gateway`.
     * 
     */
    @InputImport(name="nextHopGateway")
    private final @Nullable Input<String> nextHopGateway;

    public Input<String> getNextHopGateway() {
        return this.nextHopGateway == null ? Input.empty() : this.nextHopGateway;
    }

    /**
     * The IP address or URL to a forwarding rule of type
     * loadBalancingScheme=INTERNAL that should handle matching
     * packets.
     * With the GA provider you can only specify the forwarding
     * rule as a partial or full URL. For example, the following
     * are all valid values:
     * * 10.128.0.56
     * * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
     * * regions/region/forwardingRules/forwardingRule
     *   When the beta provider, you can also specify the IP address
     *   of a forwarding rule from the same VPC or any peered VPC.
     *   Note that this can only be used when the destinationRange is
     *   a public (non-RFC 1918) IP CIDR range.
     * 
     */
    @InputImport(name="nextHopIlb")
    private final @Nullable Input<String> nextHopIlb;

    public Input<String> getNextHopIlb() {
        return this.nextHopIlb == null ? Input.empty() : this.nextHopIlb;
    }

    /**
     * URL to an instance that should handle matching packets.
     * You can specify this as a full or partial URL. For example:
     * * `https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance`
     * * `projects/project/zones/zone/instances/instance`
     * * `zones/zone/instances/instance`
     * * Just the instance name, with the zone in `next_hop_instance_zone`.
     * 
     */
    @InputImport(name="nextHopInstance")
    private final @Nullable Input<String> nextHopInstance;

    public Input<String> getNextHopInstance() {
        return this.nextHopInstance == null ? Input.empty() : this.nextHopInstance;
    }

    /**
     * (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     * 
     */
    @InputImport(name="nextHopInstanceZone")
    private final @Nullable Input<String> nextHopInstanceZone;

    public Input<String> getNextHopInstanceZone() {
        return this.nextHopInstanceZone == null ? Input.empty() : this.nextHopInstanceZone;
    }

    /**
     * Network IP address of an instance that should handle matching packets.
     * 
     */
    @InputImport(name="nextHopIp")
    private final @Nullable Input<String> nextHopIp;

    public Input<String> getNextHopIp() {
        return this.nextHopIp == null ? Input.empty() : this.nextHopIp;
    }

    /**
     * URL to a Network that should handle matching packets.
     * 
     */
    @InputImport(name="nextHopNetwork")
    private final @Nullable Input<String> nextHopNetwork;

    public Input<String> getNextHopNetwork() {
        return this.nextHopNetwork == null ? Input.empty() : this.nextHopNetwork;
    }

    /**
     * URL to a VpnTunnel that should handle matching packets.
     * 
     */
    @InputImport(name="nextHopVpnTunnel")
    private final @Nullable Input<String> nextHopVpnTunnel;

    public Input<String> getNextHopVpnTunnel() {
        return this.nextHopVpnTunnel == null ? Input.empty() : this.nextHopVpnTunnel;
    }

    /**
     * The priority of this route. Priority is used to break ties in cases
     * where there is more than one matching route of equal prefix length.
     * In the case of two routes with equal prefix length, the one with the
     * lowest-numbered priority value wins.
     * Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
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
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * A list of instance tags to which this route applies.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RouteState(
        @Nullable Input<String> description,
        @Nullable Input<String> destRange,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> nextHopGateway,
        @Nullable Input<String> nextHopIlb,
        @Nullable Input<String> nextHopInstance,
        @Nullable Input<String> nextHopInstanceZone,
        @Nullable Input<String> nextHopIp,
        @Nullable Input<String> nextHopNetwork,
        @Nullable Input<String> nextHopVpnTunnel,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<List<String>> tags) {
        this.description = description;
        this.destRange = destRange;
        this.name = name;
        this.network = network;
        this.nextHopGateway = nextHopGateway;
        this.nextHopIlb = nextHopIlb;
        this.nextHopInstance = nextHopInstance;
        this.nextHopInstanceZone = nextHopInstanceZone;
        this.nextHopIp = nextHopIp;
        this.nextHopNetwork = nextHopNetwork;
        this.nextHopVpnTunnel = nextHopVpnTunnel;
        this.priority = priority;
        this.project = project;
        this.selfLink = selfLink;
        this.tags = tags;
    }

    private RouteState() {
        this.description = Input.empty();
        this.destRange = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.nextHopGateway = Input.empty();
        this.nextHopIlb = Input.empty();
        this.nextHopInstance = Input.empty();
        this.nextHopInstanceZone = Input.empty();
        this.nextHopIp = Input.empty();
        this.nextHopNetwork = Input.empty();
        this.nextHopVpnTunnel = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> destRange;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> nextHopGateway;
        private @Nullable Input<String> nextHopIlb;
        private @Nullable Input<String> nextHopInstance;
        private @Nullable Input<String> nextHopInstanceZone;
        private @Nullable Input<String> nextHopIp;
        private @Nullable Input<String> nextHopNetwork;
        private @Nullable Input<String> nextHopVpnTunnel;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopInstanceZone = defaults.nextHopInstanceZone;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestRange(@Nullable Input<String> destRange) {
            this.destRange = destRange;
            return this;
        }

        public Builder setDestRange(@Nullable String destRange) {
            this.destRange = Input.ofNullable(destRange);
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

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNextHopGateway(@Nullable Input<String> nextHopGateway) {
            this.nextHopGateway = nextHopGateway;
            return this;
        }

        public Builder setNextHopGateway(@Nullable String nextHopGateway) {
            this.nextHopGateway = Input.ofNullable(nextHopGateway);
            return this;
        }

        public Builder setNextHopIlb(@Nullable Input<String> nextHopIlb) {
            this.nextHopIlb = nextHopIlb;
            return this;
        }

        public Builder setNextHopIlb(@Nullable String nextHopIlb) {
            this.nextHopIlb = Input.ofNullable(nextHopIlb);
            return this;
        }

        public Builder setNextHopInstance(@Nullable Input<String> nextHopInstance) {
            this.nextHopInstance = nextHopInstance;
            return this;
        }

        public Builder setNextHopInstance(@Nullable String nextHopInstance) {
            this.nextHopInstance = Input.ofNullable(nextHopInstance);
            return this;
        }

        public Builder setNextHopInstanceZone(@Nullable Input<String> nextHopInstanceZone) {
            this.nextHopInstanceZone = nextHopInstanceZone;
            return this;
        }

        public Builder setNextHopInstanceZone(@Nullable String nextHopInstanceZone) {
            this.nextHopInstanceZone = Input.ofNullable(nextHopInstanceZone);
            return this;
        }

        public Builder setNextHopIp(@Nullable Input<String> nextHopIp) {
            this.nextHopIp = nextHopIp;
            return this;
        }

        public Builder setNextHopIp(@Nullable String nextHopIp) {
            this.nextHopIp = Input.ofNullable(nextHopIp);
            return this;
        }

        public Builder setNextHopNetwork(@Nullable Input<String> nextHopNetwork) {
            this.nextHopNetwork = nextHopNetwork;
            return this;
        }

        public Builder setNextHopNetwork(@Nullable String nextHopNetwork) {
            this.nextHopNetwork = Input.ofNullable(nextHopNetwork);
            return this;
        }

        public Builder setNextHopVpnTunnel(@Nullable Input<String> nextHopVpnTunnel) {
            this.nextHopVpnTunnel = nextHopVpnTunnel;
            return this;
        }

        public Builder setNextHopVpnTunnel(@Nullable String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Input.ofNullable(nextHopVpnTunnel);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
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

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public RouteState build() {
            return new RouteState(description, destRange, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopInstanceZone, nextHopIp, nextHopNetwork, nextHopVpnTunnel, priority, project, selfLink, tags);
        }
    }
}
