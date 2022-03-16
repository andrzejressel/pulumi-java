// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.MonitoredProjectArgs;
import io.pulumi.gcp.monitoring.inputs.MonitoredProjectState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Beta only: Monitored Project allows you to set a project as monitored by a _metrics scope_, which is a term for a project used to group the metrics of multiple projects, potentially across multiple organizations.  This enables you to view these groups in the Monitoring page of the cloud console.
 * 
 * For more information, see:
 * * [Understanding metrics scopes](https://cloud.google.com/monitoring/settings#concept-scope)
 * * [API notes](https://cloud.google.com/monitoring/settings/manage-api)
 * ## Example Usage
 * 
 * ## Import
 * 
 * MonitoredProject can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:monitoring/monitoredProject:MonitoredProject default locations/global/metricsScopes/{{metrics_scope}}/projects/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:monitoring/monitoredProject:MonitoredProject default {{metrics_scope}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:monitoring/monitoredProject:MonitoredProject")
public class MonitoredProject extends io.pulumi.resources.CustomResource {
    /**
     * Output only. The time when this `MonitoredProject` was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time when this `MonitoredProject` was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Required. The resource name of the existing Metrics Scope that will monitor this project. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}
     * 
     */
    @Export(name="metricsScope", type=String.class, parameters={})
    private Output<String> metricsScope;

    /**
     * @return Required. The resource name of the existing Metrics Scope that will monitor this project. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}
     * 
     */
    public Output<String> getMetricsScope() {
        return this.metricsScope;
    }
    /**
     * Immutable. The resource name of the `MonitoredProject`. On input, the resource name includes the scoping project ID and monitored project ID. On output, it contains the equivalent project numbers. Example: `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the `MonitoredProject`. On input, the resource name includes the scoping project ID and monitored project ID. On output, it contains the equivalent project numbers. Example: `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(MonitoredProjectArgs.Builder a);
    }
    private static io.pulumi.gcp.monitoring.MonitoredProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.monitoring.MonitoredProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MonitoredProject(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitoredProject(String name) {
        this(name, MonitoredProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitoredProject(String name, MonitoredProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitoredProject(String name, MonitoredProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/monitoredProject:MonitoredProject", name, args == null ? MonitoredProjectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MonitoredProject(String name, Output<String> id, @Nullable MonitoredProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/monitoredProject:MonitoredProject", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MonitoredProject get(String name, Output<String> id, @Nullable MonitoredProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MonitoredProject(name, id, state, options);
    }
}
