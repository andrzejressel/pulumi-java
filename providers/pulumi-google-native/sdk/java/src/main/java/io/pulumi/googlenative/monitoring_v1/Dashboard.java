// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v1.DashboardArgs;
import io.pulumi.googlenative.monitoring_v1.outputs.ColumnLayoutResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.GridLayoutResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.MosaicLayoutResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.RowLayoutResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new custom dashboard. For examples on how you can use this API to create dashboards, see Managing dashboards by API (https://cloud.google.com/monitoring/dashboards/api-dashboard). This method requires the monitoring.dashboards.create permission on the specified project. For more information about permissions, see Cloud Identity and Access Management (https://cloud.google.com/iam).
 * 
 */
@ResourceType(type="google-native:monitoring/v1:Dashboard")
public class Dashboard extends io.pulumi.resources.CustomResource {
    /**
     * The content is divided into equally spaced columns and the widgets are arranged vertically.
     * 
     */
    @OutputExport(name="columnLayout", type=ColumnLayoutResponse.class, parameters={})
    private Output<ColumnLayoutResponse> columnLayout;

    /**
     * @return The content is divided into equally spaced columns and the widgets are arranged vertically.
     * 
     */
    public Output<ColumnLayoutResponse> getColumnLayout() {
        return this.columnLayout;
    }
    /**
     * The mutable, human-readable name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The mutable, human-readable name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. An etag is returned in the response to GetDashboard, and users are expected to put that etag in the request to UpdateDashboard to ensure that their change will be applied to the same version of the Dashboard configuration. The field should not be passed during dashboard creation.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. An etag is returned in the response to GetDashboard, and users are expected to put that etag in the request to UpdateDashboard to ensure that their change will be applied to the same version of the Dashboard configuration. The field should not be passed during dashboard creation.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Content is arranged with a basic layout that re-flows a simple list of informational elements like widgets or tiles.
     * 
     */
    @OutputExport(name="gridLayout", type=GridLayoutResponse.class, parameters={})
    private Output<GridLayoutResponse> gridLayout;

    /**
     * @return Content is arranged with a basic layout that re-flows a simple list of informational elements like widgets or tiles.
     * 
     */
    public Output<GridLayoutResponse> getGridLayout() {
        return this.gridLayout;
    }
    /**
     * Labels applied to the dashboard
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels applied to the dashboard
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The content is arranged as a grid of tiles, with each content widget occupying one or more grid blocks.
     * 
     */
    @OutputExport(name="mosaicLayout", type=MosaicLayoutResponse.class, parameters={})
    private Output<MosaicLayoutResponse> mosaicLayout;

    /**
     * @return The content is arranged as a grid of tiles, with each content widget occupying one or more grid blocks.
     * 
     */
    public Output<MosaicLayoutResponse> getMosaicLayout() {
        return this.mosaicLayout;
    }
    /**
     * Immutable. The resource name of the dashboard.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the dashboard.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The content is divided into equally spaced rows and the widgets are arranged horizontally.
     * 
     */
    @OutputExport(name="rowLayout", type=RowLayoutResponse.class, parameters={})
    private Output<RowLayoutResponse> rowLayout;

    /**
     * @return The content is divided into equally spaced rows and the widgets are arranged horizontally.
     * 
     */
    public Output<RowLayoutResponse> getRowLayout() {
        return this.rowLayout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dashboard(String name, DashboardArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v1:Dashboard", name, args == null ? DashboardArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Dashboard(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v1:Dashboard", name, null, makeResourceOptions(options, id));
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
    public static Dashboard get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dashboard(name, id, options);
    }
}
