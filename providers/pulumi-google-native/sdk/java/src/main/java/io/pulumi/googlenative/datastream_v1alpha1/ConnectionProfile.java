// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datastream_v1alpha1.ConnectionProfileArgs;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.ForwardSshTunnelConnectivityResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.GcsProfileResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.MysqlProfileResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.NoConnectivitySettingsResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.OracleProfileResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.PrivateConnectivityResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.StaticServiceIpConnectivityResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Use this method to create a connection profile in a project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datastream/v1alpha1:ConnectionProfile")
public class ConnectionProfile extends io.pulumi.resources.CustomResource {
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
     * Forward SSH tunnel connectivity.
     * 
     */
    @OutputExport(name="forwardSshConnectivity", type=ForwardSshTunnelConnectivityResponse.class, parameters={})
    private Output<ForwardSshTunnelConnectivityResponse> forwardSshConnectivity;

    /**
     * @return Forward SSH tunnel connectivity.
     * 
     */
    public Output<ForwardSshTunnelConnectivityResponse> getForwardSshConnectivity() {
        return this.forwardSshConnectivity;
    }
    /**
     * Cloud Storage ConnectionProfile configuration.
     * 
     */
    @OutputExport(name="gcsProfile", type=GcsProfileResponse.class, parameters={})
    private Output<GcsProfileResponse> gcsProfile;

    /**
     * @return Cloud Storage ConnectionProfile configuration.
     * 
     */
    public Output<GcsProfileResponse> getGcsProfile() {
        return this.gcsProfile;
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
     * MySQL ConnectionProfile configuration.
     * 
     */
    @OutputExport(name="mysqlProfile", type=MysqlProfileResponse.class, parameters={})
    private Output<MysqlProfileResponse> mysqlProfile;

    /**
     * @return MySQL ConnectionProfile configuration.
     * 
     */
    public Output<MysqlProfileResponse> getMysqlProfile() {
        return this.mysqlProfile;
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
     * No connectivity option chosen.
     * 
     */
    @OutputExport(name="noConnectivity", type=NoConnectivitySettingsResponse.class, parameters={})
    private Output<NoConnectivitySettingsResponse> noConnectivity;

    /**
     * @return No connectivity option chosen.
     * 
     */
    public Output<NoConnectivitySettingsResponse> getNoConnectivity() {
        return this.noConnectivity;
    }
    /**
     * Oracle ConnectionProfile configuration.
     * 
     */
    @OutputExport(name="oracleProfile", type=OracleProfileResponse.class, parameters={})
    private Output<OracleProfileResponse> oracleProfile;

    /**
     * @return Oracle ConnectionProfile configuration.
     * 
     */
    public Output<OracleProfileResponse> getOracleProfile() {
        return this.oracleProfile;
    }
    /**
     * Private connectivity.
     * 
     */
    @OutputExport(name="privateConnectivity", type=PrivateConnectivityResponse.class, parameters={})
    private Output<PrivateConnectivityResponse> privateConnectivity;

    /**
     * @return Private connectivity.
     * 
     */
    public Output<PrivateConnectivityResponse> getPrivateConnectivity() {
        return this.privateConnectivity;
    }
    /**
     * Static Service IP connectivity.
     * 
     */
    @OutputExport(name="staticServiceIpConnectivity", type=StaticServiceIpConnectivityResponse.class, parameters={})
    private Output<StaticServiceIpConnectivityResponse> staticServiceIpConnectivity;

    /**
     * @return Static Service IP connectivity.
     * 
     */
    public Output<StaticServiceIpConnectivityResponse> getStaticServiceIpConnectivity() {
        return this.staticServiceIpConnectivity;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionProfile(String name, ConnectionProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:ConnectionProfile", name, args == null ? ConnectionProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConnectionProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:ConnectionProfile", name, null, makeResourceOptions(options, id));
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
    public static ConnectionProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionProfile(name, id, options);
    }
}
