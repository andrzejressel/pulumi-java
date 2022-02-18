// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datastream_v1.PrivateConnectionArgs;
import io.pulumi.googlenative.datastream_v1.outputs.ErrorResponse;
import io.pulumi.googlenative.datastream_v1.outputs.VpcPeeringConfigResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Use this method to create a private connectivity configuration.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datastream/v1:PrivateConnection")
public class PrivateConnection extends io.pulumi.resources.CustomResource {
    /**
     * The create time of the resource.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time of the resource.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Display name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * In case of error, the details of the error in a user-friendly format.
     * 
     */
    @OutputExport(name="error", type=ErrorResponse.class, parameters={})
    private Output<ErrorResponse> error;

    /**
     * @return In case of error, the details of the error in a user-friendly format.
     * 
     */
    public Output<ErrorResponse> getError() {
        return this.error;
    }
    /**
     * Labels.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource's name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource's name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The state of the Private Connection.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the Private Connection.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The update time of the resource.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time of the resource.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * VPC Peering Config.
     * 
     */
    @OutputExport(name="vpcPeeringConfig", type=VpcPeeringConfigResponse.class, parameters={})
    private Output<VpcPeeringConfigResponse> vpcPeeringConfig;

    /**
     * @return VPC Peering Config.
     * 
     */
    public Output<VpcPeeringConfigResponse> getVpcPeeringConfig() {
        return this.vpcPeeringConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateConnection(String name, PrivateConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1:PrivateConnection", name, args == null ? PrivateConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1:PrivateConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static PrivateConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateConnection(name, id, options);
    }
}
