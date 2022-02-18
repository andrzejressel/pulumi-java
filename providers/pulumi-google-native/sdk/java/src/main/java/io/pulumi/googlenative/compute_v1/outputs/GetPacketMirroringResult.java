// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.PacketMirroringFilterResponse;
import io.pulumi.googlenative.compute_v1.outputs.PacketMirroringForwardingRuleInfoResponse;
import io.pulumi.googlenative.compute_v1.outputs.PacketMirroringMirroredResourceInfoResponse;
import io.pulumi.googlenative.compute_v1.outputs.PacketMirroringNetworkInfoResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPacketMirroringResult {
    /**
     * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    private final PacketMirroringForwardingRuleInfoResponse collectorIlb;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    private final String enable;
    /**
     * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    private final PacketMirroringFilterResponse filter;
    /**
     * Type of the resource. Always compute#packetMirroring for packet mirrorings.
     * 
     */
    private final String kind;
    /**
     * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    private final PacketMirroringMirroredResourceInfoResponse mirroredResources;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    private final PacketMirroringNetworkInfoResponse network;
    /**
     * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    private final Integer priority;
    /**
     * URI of the region where the packetMirroring resides.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;

    @OutputCustomType.Constructor({"collectorIlb","creationTimestamp","description","enable","filter","kind","mirroredResources","name","network","priority","region","selfLink"})
    private GetPacketMirroringResult(
        PacketMirroringForwardingRuleInfoResponse collectorIlb,
        String creationTimestamp,
        String description,
        String enable,
        PacketMirroringFilterResponse filter,
        String kind,
        PacketMirroringMirroredResourceInfoResponse mirroredResources,
        String name,
        PacketMirroringNetworkInfoResponse network,
        Integer priority,
        String region,
        String selfLink) {
        this.collectorIlb = Objects.requireNonNull(collectorIlb);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.enable = Objects.requireNonNull(enable);
        this.filter = Objects.requireNonNull(filter);
        this.kind = Objects.requireNonNull(kind);
        this.mirroredResources = Objects.requireNonNull(mirroredResources);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.priority = Objects.requireNonNull(priority);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
    }

    /**
     * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    public PacketMirroringForwardingRuleInfoResponse getCollectorIlb() {
        return this.collectorIlb;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    public String getEnable() {
        return this.enable;
    }
    /**
     * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    public PacketMirroringFilterResponse getFilter() {
        return this.filter;
    }
    /**
     * Type of the resource. Always compute#packetMirroring for packet mirrorings.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    public PacketMirroringMirroredResourceInfoResponse getMirroredResources() {
        return this.mirroredResources;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    public PacketMirroringNetworkInfoResponse getNetwork() {
        return this.network;
    }
    /**
     * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * URI of the region where the packetMirroring resides.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPacketMirroringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringForwardingRuleInfoResponse collectorIlb;
        private String creationTimestamp;
        private String description;
        private String enable;
        private PacketMirroringFilterResponse filter;
        private String kind;
        private PacketMirroringMirroredResourceInfoResponse mirroredResources;
        private String name;
        private PacketMirroringNetworkInfoResponse network;
        private Integer priority;
        private String region;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPacketMirroringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectorIlb = defaults.collectorIlb;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
    	      this.kind = defaults.kind;
    	      this.mirroredResources = defaults.mirroredResources;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setCollectorIlb(PacketMirroringForwardingRuleInfoResponse collectorIlb) {
            this.collectorIlb = Objects.requireNonNull(collectorIlb);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnable(String enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setFilter(PacketMirroringFilterResponse filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMirroredResources(PacketMirroringMirroredResourceInfoResponse mirroredResources) {
            this.mirroredResources = Objects.requireNonNull(mirroredResources);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(PacketMirroringNetworkInfoResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public GetPacketMirroringResult build() {
            return new GetPacketMirroringResult(collectorIlb, creationTimestamp, description, enable, filter, kind, mirroredResources, name, network, priority, region, selfLink);
        }
    }
}
