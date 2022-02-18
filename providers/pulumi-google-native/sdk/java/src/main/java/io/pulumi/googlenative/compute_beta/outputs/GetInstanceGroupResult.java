// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.NamedPortResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceGroupResult {
    /**
     * The creation timestamp for this instance group in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The fingerprint of the named ports. The system uses this fingerprint to detect conflicts when multiple users change the named ports concurrently.
     * 
     */
    private final String fingerprint;
    /**
     * The resource type, which is always compute#instanceGroup for instance groups.
     * 
     */
    private final String kind;
    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    private final String name;
    /**
     *  Assigns a name to a port number. For example: {name: "http", port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: "http", port: 80},{name: "http", port: 8080}] Named ports apply to all instances in this instance group.
     * 
     */
    private final List<NamedPortResponse> namedPorts;
    /**
     * The URL of the network to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    private final String network;
    /**
     * The URL of the region where the instance group is located (for regional resources).
     * 
     */
    private final String region;
    /**
     * The URL for this instance group. The server generates this URL.
     * 
     */
    private final String selfLink;
    /**
     * The total number of instances in the instance group.
     * 
     */
    private final Integer size;
    /**
     * The URL of the subnetwork to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    private final String subnetwork;
    /**
     * The URL of the zone where the instance group is located (for zonal resources).
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"creationTimestamp","description","fingerprint","kind","name","namedPorts","network","region","selfLink","size","subnetwork","zone"})
    private GetInstanceGroupResult(
        String creationTimestamp,
        String description,
        String fingerprint,
        String kind,
        String name,
        List<NamedPortResponse> namedPorts,
        String network,
        String region,
        String selfLink,
        Integer size,
        String subnetwork,
        String zone) {
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.namedPorts = Objects.requireNonNull(namedPorts);
        this.network = Objects.requireNonNull(network);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.size = Objects.requireNonNull(size);
        this.subnetwork = Objects.requireNonNull(subnetwork);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The creation timestamp for this instance group in RFC3339 text format.
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
     * The fingerprint of the named ports. The system uses this fingerprint to detect conflicts when multiple users change the named ports concurrently.
     * 
     */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The resource type, which is always compute#instanceGroup for instance groups.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     *  Assigns a name to a port number. For example: {name: "http", port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: "http", port: 80},{name: "http", port: 8080}] Named ports apply to all instances in this instance group.
     * 
     */
    public List<NamedPortResponse> getNamedPorts() {
        return this.namedPorts;
    }
    /**
     * The URL of the network to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The URL of the region where the instance group is located (for regional resources).
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * The URL for this instance group. The server generates this URL.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The total number of instances in the instance group.
     * 
     */
    public Integer getSize() {
        return this.size;
    }
    /**
     * The URL of the subnetwork to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    public String getSubnetwork() {
        return this.subnetwork;
    }
    /**
     * The URL of the zone where the instance group is located (for zonal resources).
     * 
     */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String kind;
        private String name;
        private List<NamedPortResponse> namedPorts;
        private String network;
        private String region;
        private String selfLink;
        private Integer size;
        private String subnetwork;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.subnetwork = defaults.subnetwork;
    	      this.zone = defaults.zone;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamedPorts(List<NamedPortResponse> namedPorts) {
            this.namedPorts = Objects.requireNonNull(namedPorts);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
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

        public Builder setSize(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetInstanceGroupResult build() {
            return new GetInstanceGroupResult(creationTimestamp, description, fingerprint, kind, name, namedPorts, network, region, selfLink, size, subnetwork, zone);
        }
    }
}
