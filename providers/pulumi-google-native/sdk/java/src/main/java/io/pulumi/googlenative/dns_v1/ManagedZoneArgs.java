// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.enums.ManagedZoneVisibility;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneCloudLoggingConfigArgs;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneDnsSecConfigArgs;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneForwardingConfigArgs;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZonePeeringConfigArgs;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZonePrivateVisibilityConfigArgs;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneReverseLookupConfigArgs;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneServiceDirectoryConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneArgs Empty = new ManagedZoneArgs();

    @InputImport(name="clientOperationId")
    private final @Nullable Input<String> clientOperationId;

    public Input<String> getClientOperationId() {
        return this.clientOperationId == null ? Input.empty() : this.clientOperationId;
    }

    @InputImport(name="cloudLoggingConfig")
    private final @Nullable Input<ManagedZoneCloudLoggingConfigArgs> cloudLoggingConfig;

    public Input<ManagedZoneCloudLoggingConfigArgs> getCloudLoggingConfig() {
        return this.cloudLoggingConfig == null ? Input.empty() : this.cloudLoggingConfig;
    }

    /**
     * The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    @InputImport(name="creationTime")
    private final @Nullable Input<String> creationTime;

    public Input<String> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    @InputImport(name="dnsName")
    private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    /**
     * DNSSEC configuration.
     * 
     */
    @InputImport(name="dnssecConfig")
    private final @Nullable Input<ManagedZoneDnsSecConfigArgs> dnssecConfig;

    public Input<ManagedZoneDnsSecConfigArgs> getDnssecConfig() {
        return this.dnssecConfig == null ? Input.empty() : this.dnssecConfig;
    }

    /**
     * The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    @InputImport(name="forwardingConfig")
    private final @Nullable Input<ManagedZoneForwardingConfigArgs> forwardingConfig;

    public Input<ManagedZoneForwardingConfigArgs> getForwardingConfig() {
        return this.forwardingConfig == null ? Input.empty() : this.forwardingConfig;
    }

    /**
     * Unique identifier for the resource; defined by the server (output only)
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * User labels.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    @InputImport(name="nameServerSet")
    private final @Nullable Input<String> nameServerSet;

    public Input<String> getNameServerSet() {
        return this.nameServerSet == null ? Input.empty() : this.nameServerSet;
    }

    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    @InputImport(name="nameServers")
    private final @Nullable Input<List<String>> nameServers;

    public Input<List<String>> getNameServers() {
        return this.nameServers == null ? Input.empty() : this.nameServers;
    }

    /**
     * The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    @InputImport(name="peeringConfig")
    private final @Nullable Input<ManagedZonePeeringConfigArgs> peeringConfig;

    public Input<ManagedZonePeeringConfigArgs> getPeeringConfig() {
        return this.peeringConfig == null ? Input.empty() : this.peeringConfig;
    }

    /**
     * For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    @InputImport(name="privateVisibilityConfig")
    private final @Nullable Input<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig;

    public Input<ManagedZonePrivateVisibilityConfigArgs> getPrivateVisibilityConfig() {
        return this.privateVisibilityConfig == null ? Input.empty() : this.privateVisibilityConfig;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    @InputImport(name="reverseLookupConfig")
    private final @Nullable Input<ManagedZoneReverseLookupConfigArgs> reverseLookupConfig;

    public Input<ManagedZoneReverseLookupConfigArgs> getReverseLookupConfig() {
        return this.reverseLookupConfig == null ? Input.empty() : this.reverseLookupConfig;
    }

    /**
     * This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    @InputImport(name="serviceDirectoryConfig")
    private final @Nullable Input<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig;

    public Input<ManagedZoneServiceDirectoryConfigArgs> getServiceDirectoryConfig() {
        return this.serviceDirectoryConfig == null ? Input.empty() : this.serviceDirectoryConfig;
    }

    /**
     * The zone's visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    @InputImport(name="visibility")
    private final @Nullable Input<ManagedZoneVisibility> visibility;

    public Input<ManagedZoneVisibility> getVisibility() {
        return this.visibility == null ? Input.empty() : this.visibility;
    }

    public ManagedZoneArgs(
        @Nullable Input<String> clientOperationId,
        @Nullable Input<ManagedZoneCloudLoggingConfigArgs> cloudLoggingConfig,
        @Nullable Input<String> creationTime,
        @Nullable Input<String> description,
        @Nullable Input<String> dnsName,
        @Nullable Input<ManagedZoneDnsSecConfigArgs> dnssecConfig,
        @Nullable Input<ManagedZoneForwardingConfigArgs> forwardingConfig,
        @Nullable Input<String> id,
        @Nullable Input<String> kind,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> nameServerSet,
        @Nullable Input<List<String>> nameServers,
        @Nullable Input<ManagedZonePeeringConfigArgs> peeringConfig,
        @Nullable Input<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig,
        @Nullable Input<String> project,
        @Nullable Input<ManagedZoneReverseLookupConfigArgs> reverseLookupConfig,
        @Nullable Input<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig,
        @Nullable Input<ManagedZoneVisibility> visibility) {
        this.clientOperationId = clientOperationId;
        this.cloudLoggingConfig = cloudLoggingConfig;
        this.creationTime = creationTime;
        this.description = description;
        this.dnsName = dnsName;
        this.dnssecConfig = dnssecConfig;
        this.forwardingConfig = forwardingConfig;
        this.id = id;
        this.kind = kind;
        this.labels = labels;
        this.name = name;
        this.nameServerSet = nameServerSet;
        this.nameServers = nameServers;
        this.peeringConfig = peeringConfig;
        this.privateVisibilityConfig = privateVisibilityConfig;
        this.project = project;
        this.reverseLookupConfig = reverseLookupConfig;
        this.serviceDirectoryConfig = serviceDirectoryConfig;
        this.visibility = visibility;
    }

    private ManagedZoneArgs() {
        this.clientOperationId = Input.empty();
        this.cloudLoggingConfig = Input.empty();
        this.creationTime = Input.empty();
        this.description = Input.empty();
        this.dnsName = Input.empty();
        this.dnssecConfig = Input.empty();
        this.forwardingConfig = Input.empty();
        this.id = Input.empty();
        this.kind = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.nameServerSet = Input.empty();
        this.nameServers = Input.empty();
        this.peeringConfig = Input.empty();
        this.privateVisibilityConfig = Input.empty();
        this.project = Input.empty();
        this.reverseLookupConfig = Input.empty();
        this.serviceDirectoryConfig = Input.empty();
        this.visibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientOperationId;
        private @Nullable Input<ManagedZoneCloudLoggingConfigArgs> cloudLoggingConfig;
        private @Nullable Input<String> creationTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> dnsName;
        private @Nullable Input<ManagedZoneDnsSecConfigArgs> dnssecConfig;
        private @Nullable Input<ManagedZoneForwardingConfigArgs> forwardingConfig;
        private @Nullable Input<String> id;
        private @Nullable Input<String> kind;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> nameServerSet;
        private @Nullable Input<List<String>> nameServers;
        private @Nullable Input<ManagedZonePeeringConfigArgs> peeringConfig;
        private @Nullable Input<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<ManagedZoneReverseLookupConfigArgs> reverseLookupConfig;
        private @Nullable Input<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig;
        private @Nullable Input<ManagedZoneVisibility> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.cloudLoggingConfig = defaults.cloudLoggingConfig;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.dnsName = defaults.dnsName;
    	      this.dnssecConfig = defaults.dnssecConfig;
    	      this.forwardingConfig = defaults.forwardingConfig;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nameServerSet = defaults.nameServerSet;
    	      this.nameServers = defaults.nameServers;
    	      this.peeringConfig = defaults.peeringConfig;
    	      this.privateVisibilityConfig = defaults.privateVisibilityConfig;
    	      this.project = defaults.project;
    	      this.reverseLookupConfig = defaults.reverseLookupConfig;
    	      this.serviceDirectoryConfig = defaults.serviceDirectoryConfig;
    	      this.visibility = defaults.visibility;
        }

        public Builder setClientOperationId(@Nullable Input<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }

        public Builder setClientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Input.ofNullable(clientOperationId);
            return this;
        }

        public Builder setCloudLoggingConfig(@Nullable Input<ManagedZoneCloudLoggingConfigArgs> cloudLoggingConfig) {
            this.cloudLoggingConfig = cloudLoggingConfig;
            return this;
        }

        public Builder setCloudLoggingConfig(@Nullable ManagedZoneCloudLoggingConfigArgs cloudLoggingConfig) {
            this.cloudLoggingConfig = Input.ofNullable(cloudLoggingConfig);
            return this;
        }

        public Builder setCreationTime(@Nullable Input<String> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
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

        public Builder setDnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder setDnssecConfig(@Nullable Input<ManagedZoneDnsSecConfigArgs> dnssecConfig) {
            this.dnssecConfig = dnssecConfig;
            return this;
        }

        public Builder setDnssecConfig(@Nullable ManagedZoneDnsSecConfigArgs dnssecConfig) {
            this.dnssecConfig = Input.ofNullable(dnssecConfig);
            return this;
        }

        public Builder setForwardingConfig(@Nullable Input<ManagedZoneForwardingConfigArgs> forwardingConfig) {
            this.forwardingConfig = forwardingConfig;
            return this;
        }

        public Builder setForwardingConfig(@Nullable ManagedZoneForwardingConfigArgs forwardingConfig) {
            this.forwardingConfig = Input.ofNullable(forwardingConfig);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setNameServerSet(@Nullable Input<String> nameServerSet) {
            this.nameServerSet = nameServerSet;
            return this;
        }

        public Builder setNameServerSet(@Nullable String nameServerSet) {
            this.nameServerSet = Input.ofNullable(nameServerSet);
            return this;
        }

        public Builder setNameServers(@Nullable Input<List<String>> nameServers) {
            this.nameServers = nameServers;
            return this;
        }

        public Builder setNameServers(@Nullable List<String> nameServers) {
            this.nameServers = Input.ofNullable(nameServers);
            return this;
        }

        public Builder setPeeringConfig(@Nullable Input<ManagedZonePeeringConfigArgs> peeringConfig) {
            this.peeringConfig = peeringConfig;
            return this;
        }

        public Builder setPeeringConfig(@Nullable ManagedZonePeeringConfigArgs peeringConfig) {
            this.peeringConfig = Input.ofNullable(peeringConfig);
            return this;
        }

        public Builder setPrivateVisibilityConfig(@Nullable Input<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig) {
            this.privateVisibilityConfig = privateVisibilityConfig;
            return this;
        }

        public Builder setPrivateVisibilityConfig(@Nullable ManagedZonePrivateVisibilityConfigArgs privateVisibilityConfig) {
            this.privateVisibilityConfig = Input.ofNullable(privateVisibilityConfig);
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

        public Builder setReverseLookupConfig(@Nullable Input<ManagedZoneReverseLookupConfigArgs> reverseLookupConfig) {
            this.reverseLookupConfig = reverseLookupConfig;
            return this;
        }

        public Builder setReverseLookupConfig(@Nullable ManagedZoneReverseLookupConfigArgs reverseLookupConfig) {
            this.reverseLookupConfig = Input.ofNullable(reverseLookupConfig);
            return this;
        }

        public Builder setServiceDirectoryConfig(@Nullable Input<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig) {
            this.serviceDirectoryConfig = serviceDirectoryConfig;
            return this;
        }

        public Builder setServiceDirectoryConfig(@Nullable ManagedZoneServiceDirectoryConfigArgs serviceDirectoryConfig) {
            this.serviceDirectoryConfig = Input.ofNullable(serviceDirectoryConfig);
            return this;
        }

        public Builder setVisibility(@Nullable Input<ManagedZoneVisibility> visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder setVisibility(@Nullable ManagedZoneVisibility visibility) {
            this.visibility = Input.ofNullable(visibility);
            return this;
        }

        public ManagedZoneArgs build() {
            return new ManagedZoneArgs(clientOperationId, cloudLoggingConfig, creationTime, description, dnsName, dnssecConfig, forwardingConfig, id, kind, labels, name, nameServerSet, nameServers, peeringConfig, privateVisibilityConfig, project, reverseLookupConfig, serviceDirectoryConfig, visibility);
        }
    }
}
