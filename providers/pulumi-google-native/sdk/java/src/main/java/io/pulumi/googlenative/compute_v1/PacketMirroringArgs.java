// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.PacketMirroringEnable;
import io.pulumi.googlenative.compute_v1.inputs.PacketMirroringFilterArgs;
import io.pulumi.googlenative.compute_v1.inputs.PacketMirroringForwardingRuleInfoArgs;
import io.pulumi.googlenative.compute_v1.inputs.PacketMirroringMirroredResourceInfoArgs;
import io.pulumi.googlenative.compute_v1.inputs.PacketMirroringNetworkInfoArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringArgs Empty = new PacketMirroringArgs();

    /**
     * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    @InputImport(name="collectorIlb")
    private final @Nullable Input<PacketMirroringForwardingRuleInfoArgs> collectorIlb;

    public Input<PacketMirroringForwardingRuleInfoArgs> getCollectorIlb() {
        return this.collectorIlb == null ? Input.empty() : this.collectorIlb;
    }

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
     * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    @InputImport(name="enable")
    private final @Nullable Input<PacketMirroringEnable> enable;

    public Input<PacketMirroringEnable> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<PacketMirroringFilterArgs> filter;

    public Input<PacketMirroringFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    @InputImport(name="mirroredResources")
    private final @Nullable Input<PacketMirroringMirroredResourceInfoArgs> mirroredResources;

    public Input<PacketMirroringMirroredResourceInfoArgs> getMirroredResources() {
        return this.mirroredResources == null ? Input.empty() : this.mirroredResources;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<PacketMirroringNetworkInfoArgs> network;

    public Input<PacketMirroringNetworkInfoArgs> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
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

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    public PacketMirroringArgs(
        @Nullable Input<PacketMirroringForwardingRuleInfoArgs> collectorIlb,
        @Nullable Input<String> description,
        @Nullable Input<PacketMirroringEnable> enable,
        @Nullable Input<PacketMirroringFilterArgs> filter,
        @Nullable Input<PacketMirroringMirroredResourceInfoArgs> mirroredResources,
        @Nullable Input<String> name,
        @Nullable Input<PacketMirroringNetworkInfoArgs> network,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId) {
        this.collectorIlb = collectorIlb;
        this.description = description;
        this.enable = enable;
        this.filter = filter;
        this.mirroredResources = mirroredResources;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
    }

    private PacketMirroringArgs() {
        this.collectorIlb = Input.empty();
        this.description = Input.empty();
        this.enable = Input.empty();
        this.filter = Input.empty();
        this.mirroredResources = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PacketMirroringForwardingRuleInfoArgs> collectorIlb;
        private @Nullable Input<String> description;
        private @Nullable Input<PacketMirroringEnable> enable;
        private @Nullable Input<PacketMirroringFilterArgs> filter;
        private @Nullable Input<PacketMirroringMirroredResourceInfoArgs> mirroredResources;
        private @Nullable Input<String> name;
        private @Nullable Input<PacketMirroringNetworkInfoArgs> network;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectorIlb = defaults.collectorIlb;
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
    	      this.mirroredResources = defaults.mirroredResources;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
        }

        public Builder setCollectorIlb(@Nullable Input<PacketMirroringForwardingRuleInfoArgs> collectorIlb) {
            this.collectorIlb = collectorIlb;
            return this;
        }

        public Builder setCollectorIlb(@Nullable PacketMirroringForwardingRuleInfoArgs collectorIlb) {
            this.collectorIlb = Input.ofNullable(collectorIlb);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnable(@Nullable Input<PacketMirroringEnable> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable PacketMirroringEnable enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setFilter(@Nullable Input<PacketMirroringFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable PacketMirroringFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setMirroredResources(@Nullable Input<PacketMirroringMirroredResourceInfoArgs> mirroredResources) {
            this.mirroredResources = mirroredResources;
            return this;
        }

        public Builder setMirroredResources(@Nullable PacketMirroringMirroredResourceInfoArgs mirroredResources) {
            this.mirroredResources = Input.ofNullable(mirroredResources);
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

        public Builder setNetwork(@Nullable Input<PacketMirroringNetworkInfoArgs> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable PacketMirroringNetworkInfoArgs network) {
            this.network = Input.ofNullable(network);
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

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
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

        public PacketMirroringArgs build() {
            return new PacketMirroringArgs(collectorIlb, description, enable, filter, mirroredResources, name, network, priority, project, region, requestId);
        }
    }
}
