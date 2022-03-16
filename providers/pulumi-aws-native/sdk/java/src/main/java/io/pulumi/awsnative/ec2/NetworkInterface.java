// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.NetworkInterfaceArgs;
import io.pulumi.awsnative.ec2.outputs.NetworkInterfaceInstanceIpv6Address;
import io.pulumi.awsnative.ec2.outputs.NetworkInterfacePrivateIpAddressSpecification;
import io.pulumi.awsnative.ec2.outputs.NetworkInterfaceTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::EC2::NetworkInterface resource creates network interface
 * 
 */
@ResourceType(type="aws-native:ec2:NetworkInterface")
public class NetworkInterface extends io.pulumi.resources.CustomResource {
    /**
     * A description for the network interface.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the network interface.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A list of security group IDs associated with this network interface.
     * 
     */
    @Export(name="groupSet", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> groupSet;

    /**
     * @return A list of security group IDs associated with this network interface.
     * 
     */
    public Output</* @Nullable */ List<String>> getGroupSet() {
        return this.groupSet;
    }
    /**
     * Indicates the type of network interface.
     * 
     */
    @Export(name="interfaceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> interfaceType;

    /**
     * @return Indicates the type of network interface.
     * 
     */
    public Output</* @Nullable */ String> getInterfaceType() {
        return this.interfaceType;
    }
    /**
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify specific IPv6 addresses, use the Ipv6Addresses property and don't specify this property.
     * 
     */
    @Export(name="ipv6AddressCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ipv6AddressCount;

    /**
     * @return The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify specific IPv6 addresses, use the Ipv6Addresses property and don't specify this property.
     * 
     */
    public Output</* @Nullable */ Integer> getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }
    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate with the network interface. If you're specifying a number of IPv6 addresses, use the Ipv6AddressCount property and don't specify this property.
     * 
     */
    @Export(name="ipv6Addresses", type=List.class, parameters={NetworkInterfaceInstanceIpv6Address.class})
    private Output</* @Nullable */ List<NetworkInterfaceInstanceIpv6Address>> ipv6Addresses;

    /**
     * @return One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate with the network interface. If you're specifying a number of IPv6 addresses, use the Ipv6AddressCount property and don't specify this property.
     * 
     */
    public Output</* @Nullable */ List<NetworkInterfaceInstanceIpv6Address>> getIpv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * Returns the primary private IP address of the network interface.
     * 
     */
    @Export(name="primaryPrivateIpAddress", type=String.class, parameters={})
    private Output<String> primaryPrivateIpAddress;

    /**
     * @return Returns the primary private IP address of the network interface.
     * 
     */
    public Output<String> getPrimaryPrivateIpAddress() {
        return this.primaryPrivateIpAddress;
    }
    /**
     * Assigns a single private IP address to the network interface, which is used as the primary private IP address. If you want to specify multiple private IP address, use the PrivateIpAddresses property.
     * 
     */
    @Export(name="privateIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateIpAddress;

    /**
     * @return Assigns a single private IP address to the network interface, which is used as the primary private IP address. If you want to specify multiple private IP address, use the PrivateIpAddresses property.
     * 
     */
    public Output</* @Nullable */ String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * Assigns a list of private IP addresses to the network interface. You can specify a primary private IP address by setting the value of the Primary property to true in the PrivateIpAddressSpecification property. If you want EC2 to automatically assign private IP addresses, use the SecondaryPrivateIpAddressCount property and do not specify this property.
     * 
     */
    @Export(name="privateIpAddresses", type=List.class, parameters={NetworkInterfacePrivateIpAddressSpecification.class})
    private Output</* @Nullable */ List<NetworkInterfacePrivateIpAddressSpecification>> privateIpAddresses;

    /**
     * @return Assigns a list of private IP addresses to the network interface. You can specify a primary private IP address by setting the value of the Primary property to true in the PrivateIpAddressSpecification property. If you want EC2 to automatically assign private IP addresses, use the SecondaryPrivateIpAddressCount property and do not specify this property.
     * 
     */
    public Output</* @Nullable */ List<NetworkInterfacePrivateIpAddressSpecification>> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }
    /**
     * The number of secondary private IPv4 addresses to assign to a network interface. When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one private IP address using privateIpAddresses
     * 
     */
    @Export(name="secondaryPrivateIpAddressCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> secondaryPrivateIpAddressCount;

    /**
     * @return The number of secondary private IPv4 addresses to assign to a network interface. When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one private IP address using privateIpAddresses
     * 
     */
    public Output</* @Nullable */ Integer> getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }
    /**
     * Returns the secondary private IP addresses of the network interface.
     * 
     */
    @Export(name="secondaryPrivateIpAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> secondaryPrivateIpAddresses;

    /**
     * @return Returns the secondary private IP addresses of the network interface.
     * 
     */
    public Output<List<String>> getSecondaryPrivateIpAddresses() {
        return this.secondaryPrivateIpAddresses;
    }
    /**
     * Indicates whether traffic to or from the instance is validated.
     * 
     */
    @Export(name="sourceDestCheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sourceDestCheck;

    /**
     * @return Indicates whether traffic to or from the instance is validated.
     * 
     */
    public Output</* @Nullable */ Boolean> getSourceDestCheck() {
        return this.sourceDestCheck;
    }
    /**
     * The ID of the subnet to associate with the network interface.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet to associate with the network interface.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     * 
     */
    @Export(name="tags", type=List.class, parameters={NetworkInterfaceTag.class})
    private Output</* @Nullable */ List<NetworkInterfaceTag>> tags;

    /**
     * @return An arbitrary set of tags (key-value pairs) for this network interface.
     * 
     */
    public Output</* @Nullable */ List<NetworkInterfaceTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(NetworkInterfaceArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.NetworkInterfaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.NetworkInterfaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NetworkInterface(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterface(String name) {
        this(name, NetworkInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInterface", name, args == null ? NetworkInterfaceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NetworkInterface(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInterface", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkInterface get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterface(name, id, options);
    }
}
