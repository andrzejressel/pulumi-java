// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.SubnetworkArgs;
import io.pulumi.googlenative.compute_v1.outputs.SubnetworkLogConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.SubnetworkSecondaryRangeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a subnetwork in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:Subnetwork")
public class Subnetwork extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @Export(name="enableFlowLogs", type=Boolean.class, parameters={})
    private Output<Boolean> enableFlowLogs;

    /**
     * @return Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    public Output<Boolean> getEnableFlowLogs() {
        return this.enableFlowLogs;
    }
    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @Export(name="externalIpv6Prefix", type=String.class, parameters={})
    private Output<String> externalIpv6Prefix;

    /**
     * @return The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    public Output<String> getExternalIpv6Prefix() {
        return this.externalIpv6Prefix;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    @Export(name="gatewayAddress", type=String.class, parameters={})
    private Output<String> gatewayAddress;

    /**
     * @return The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    public Output<String> getGatewayAddress() {
        return this.gatewayAddress;
    }
    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    @Export(name="ipCidrRange", type=String.class, parameters={})
    private Output<String> ipCidrRange;

    /**
     * @return The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    public Output<String> getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    @Export(name="ipv6AccessType", type=String.class, parameters={})
    private Output<String> ipv6AccessType;

    /**
     * @return The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    public Output<String> getIpv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork. Note this will be for private google access only eventually.
     * 
     */
    @Export(name="ipv6CidrRange", type=String.class, parameters={})
    private Output<String> ipv6CidrRange;

    /**
     * @return The range of internal IPv6 addresses that are owned by this subnetwork. Note this will be for private google access only eventually.
     * 
     */
    public Output<String> getIpv6CidrRange() {
        return this.ipv6CidrRange;
    }
    /**
     * Type of the resource. Always compute#subnetwork for Subnetwork resources.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#subnetwork for Subnetwork resources.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    @Export(name="logConfig", type=SubnetworkLogConfigResponse.class, parameters={})
    private Output<SubnetworkLogConfigResponse> logConfig;

    /**
     * @return This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    public Output<SubnetworkLogConfigResponse> getLogConfig() {
        return this.logConfig;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    @Export(name="privateIpGoogleAccess", type=Boolean.class, parameters={})
    private Output<Boolean> privateIpGoogleAccess;

    /**
     * @return Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    public Output<Boolean> getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess;
    }
    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @Export(name="privateIpv6GoogleAccess", type=String.class, parameters={})
    private Output<String> privateIpv6GoogleAccess;

    /**
     * @return The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    public Output<String> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @Export(name="purpose", type=String.class, parameters={})
    private Output<String> purpose;

    /**
     * @return The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    public Output<String> getPurpose() {
        return this.purpose;
    }
    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    @Export(name="secondaryIpRanges", type=List.class, parameters={SubnetworkSecondaryRangeResponse.class})
    private Output<List<SubnetworkSecondaryRangeResponse>> secondaryIpRanges;

    /**
     * @return An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    public Output<List<SubnetworkSecondaryRangeResponse>> getSecondaryIpRanges() {
        return this.secondaryIpRanges;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @Export(name="stackType", type=String.class, parameters={})
    private Output<String> stackType;

    /**
     * @return The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    public Output<String> getStackType() {
        return this.stackType;
    }
    /**
     * The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(SubnetworkArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_v1.SubnetworkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_v1.SubnetworkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Subnetwork(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subnetwork(String name) {
        this(name, SubnetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subnetwork(String name, SubnetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subnetwork(String name, SubnetworkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Subnetwork", name, args == null ? SubnetworkArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Subnetwork(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Subnetwork", name, null, makeResourceOptions(options, id));
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
    public static Subnetwork get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Subnetwork(name, id, options);
    }
}
