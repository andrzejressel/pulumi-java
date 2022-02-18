// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datastream_v1alpha1.RouteArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Use this method to create a route for a private connectivity in a project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datastream/v1alpha1:Route")
public class Route extends io.pulumi.resources.CustomResource {
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
     * Destination address for connection
     * 
     */
    @OutputExport(name="destinationAddress", type=String.class, parameters={})
    private Output<String> destinationAddress;

    /**
     * @return Destination address for connection
     * 
     */
    public Output<String> getDestinationAddress() {
        return this.destinationAddress;
    }
    /**
     * Destination port for connection
     * 
     */
    @OutputExport(name="destinationPort", type=Integer.class, parameters={})
    private Output<Integer> destinationPort;

    /**
     * @return Destination port for connection
     * 
     */
    public Output<Integer> getDestinationPort() {
        return this.destinationPort;
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
    public Route(String name, RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Route(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Route", name, null, makeResourceOptions(options, id));
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
    public static Route get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, options);
    }
}
