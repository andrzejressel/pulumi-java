// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressArgs Empty = new AddressArgs();

    /**
     * The static external IP address represented by this resource. Only
     * IPv4 is supported. An address may only be specified for INTERNAL
     * address types. The IP address must be inside the specified subnetwork,
     * if any.
     * 
     */
    @InputImport(name="address")
    private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * The type of address to reserve.
     * Default value is `EXTERNAL`.
     * Possible values are `INTERNAL` and `EXTERNAL`.
     * 
     */
    @InputImport(name="addressType")
    private final @Nullable Input<String> addressType;

    public Input<String> getAddressType() {
        return this.addressType == null ? Input.empty() : this.addressType;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Labels to apply to this address.  A list of key->value pairs.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
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
     * The URL of the network in which to reserve the address. This field
     * can only be used with INTERNAL type with the VPC_PEERING and
     * IPSEC_INTERCONNECT purposes.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The networking tier used for configuring this address. If this field is not
     * specified, it is assumed to be PREMIUM.
     * Possible values are `PREMIUM` and `STANDARD`.
     * 
     */
    @InputImport(name="networkTier")
    private final @Nullable Input<String> networkTier;

    public Input<String> getNetworkTier() {
        return this.networkTier == null ? Input.empty() : this.networkTier;
    }

    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    @InputImport(name="prefixLength")
    private final @Nullable Input<Integer> prefixLength;

    public Input<Integer> getPrefixLength() {
        return this.prefixLength == null ? Input.empty() : this.prefixLength;
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
     * The purpose of this resource, which can be one of the following values:
     * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
     *   ranges, internal load balancers, and similar resources.
     * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
     *   internal load balancers.
     * * VPC_PEERING for addresses that are reserved for VPC peer networks.
     * * IPSEC_INTERCONNECT for addresses created from a private IP range
     *   that are reserved for a VLAN attachment in an IPsec-encrypted Cloud
     *   Interconnect configuration. These addresses are regional resources.
     * * PRIVATE_SERVICE_CONNECT for a private network address that is used
     *   to configure Private Service Connect. Only global internal addresses
     *   can use this purpose.
     *   This should only be set when using an Internal address.
     * 
     */
    @InputImport(name="purpose")
    private final @Nullable Input<String> purpose;

    public Input<String> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The URL of the subnetwork in which to reserve the address. If an IP
     * address is specified, it must be within the subnetwork's IP range.
     * This field can only be used with INTERNAL type with
     * GCE_ENDPOINT/DNS_RESOLVER purposes.
     * 
     */
    @InputImport(name="subnetwork")
    private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    public AddressArgs(
        @Nullable Input<String> address,
        @Nullable Input<String> addressType,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> networkTier,
        @Nullable Input<Integer> prefixLength,
        @Nullable Input<String> project,
        @Nullable Input<String> purpose,
        @Nullable Input<String> region,
        @Nullable Input<String> subnetwork) {
        this.address = address;
        this.addressType = addressType;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.prefixLength = prefixLength;
        this.project = project;
        this.purpose = purpose;
        this.region = region;
        this.subnetwork = subnetwork;
    }

    private AddressArgs() {
        this.address = Input.empty();
        this.addressType = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.networkTier = Input.empty();
        this.prefixLength = Input.empty();
        this.project = Input.empty();
        this.purpose = Input.empty();
        this.region = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> addressType;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> networkTier;
        private @Nullable Input<Integer> prefixLength;
        private @Nullable Input<String> project;
        private @Nullable Input<String> purpose;
        private @Nullable Input<String> region;
        private @Nullable Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressType = defaults.addressType;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.prefixLength = defaults.prefixLength;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setAddressType(@Nullable Input<String> addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder setAddressType(@Nullable String addressType) {
            this.addressType = Input.ofNullable(addressType);
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

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNetworkTier(@Nullable Input<String> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder setNetworkTier(@Nullable String networkTier) {
            this.networkTier = Input.ofNullable(networkTier);
            return this;
        }

        public Builder setPrefixLength(@Nullable Input<Integer> prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder setPrefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = Input.ofNullable(prefixLength);
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

        public Builder setPurpose(@Nullable Input<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder setPurpose(@Nullable String purpose) {
            this.purpose = Input.ofNullable(purpose);
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

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }

        public AddressArgs build() {
            return new AddressArgs(address, addressType, description, labels, name, network, networkTier, prefixLength, project, purpose, region, subnetwork);
        }
    }
}
