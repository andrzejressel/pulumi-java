// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RouterInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterInterfaceResponse Empty = new RouterInterfaceResponse();

    /**
     * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
     * 
     */
    @InputImport(name="ipRange", required=true)
    private final String ipRange;

    public String getIpRange() {
        return this.ipRange;
    }

    /**
     * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    @InputImport(name="linkedInterconnectAttachment", required=true)
    private final String linkedInterconnectAttachment;

    public String getLinkedInterconnectAttachment() {
        return this.linkedInterconnectAttachment;
    }

    /**
     * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    @InputImport(name="linkedVpnTunnel", required=true)
    private final String linkedVpnTunnel;

    public String getLinkedVpnTunnel() {
        return this.linkedVpnTunnel;
    }

    /**
     * The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    @InputImport(name="managementType", required=true)
    private final String managementType;

    public String getManagementType() {
        return this.managementType;
    }

    /**
     * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
     * 
     */
    @InputImport(name="privateIpAddress", required=true)
    private final String privateIpAddress;

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="redundantInterface", required=true)
    private final String redundantInterface;

    public String getRedundantInterface() {
        return this.redundantInterface;
    }

    /**
     * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
     * 
     */
    @InputImport(name="subnetwork", required=true)
    private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    public RouterInterfaceResponse(
        String ipRange,
        String linkedInterconnectAttachment,
        String linkedVpnTunnel,
        String managementType,
        String name,
        String privateIpAddress,
        String redundantInterface,
        String subnetwork) {
        this.ipRange = Objects.requireNonNull(ipRange, "expected parameter 'ipRange' to be non-null");
        this.linkedInterconnectAttachment = Objects.requireNonNull(linkedInterconnectAttachment, "expected parameter 'linkedInterconnectAttachment' to be non-null");
        this.linkedVpnTunnel = Objects.requireNonNull(linkedVpnTunnel, "expected parameter 'linkedVpnTunnel' to be non-null");
        this.managementType = Objects.requireNonNull(managementType, "expected parameter 'managementType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
        this.redundantInterface = Objects.requireNonNull(redundantInterface, "expected parameter 'redundantInterface' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private RouterInterfaceResponse() {
        this.ipRange = null;
        this.linkedInterconnectAttachment = null;
        this.linkedVpnTunnel = null;
        this.managementType = null;
        this.name = null;
        this.privateIpAddress = null;
        this.redundantInterface = null;
        this.subnetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipRange;
        private String linkedInterconnectAttachment;
        private String linkedVpnTunnel;
        private String managementType;
        private String name;
        private String privateIpAddress;
        private String redundantInterface;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRange = defaults.ipRange;
    	      this.linkedInterconnectAttachment = defaults.linkedInterconnectAttachment;
    	      this.linkedVpnTunnel = defaults.linkedVpnTunnel;
    	      this.managementType = defaults.managementType;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.redundantInterface = defaults.redundantInterface;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setLinkedInterconnectAttachment(String linkedInterconnectAttachment) {
            this.linkedInterconnectAttachment = Objects.requireNonNull(linkedInterconnectAttachment);
            return this;
        }

        public Builder setLinkedVpnTunnel(String linkedVpnTunnel) {
            this.linkedVpnTunnel = Objects.requireNonNull(linkedVpnTunnel);
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

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setRedundantInterface(String redundantInterface) {
            this.redundantInterface = Objects.requireNonNull(redundantInterface);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public RouterInterfaceResponse build() {
            return new RouterInterfaceResponse(ipRange, linkedInterconnectAttachment, linkedVpnTunnel, managementType, name, privateIpAddress, redundantInterface, subnetwork);
        }
    }
}
