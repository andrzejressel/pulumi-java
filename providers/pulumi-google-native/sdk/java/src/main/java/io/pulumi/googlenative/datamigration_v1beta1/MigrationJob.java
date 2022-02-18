// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datamigration_v1beta1.MigrationJobArgs;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.DatabaseTypeResponse;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.ReverseSshConnectivityResponse;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.StaticIpConnectivityResponse;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.StatusResponse;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.VpcPeeringConnectivityResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new migration job in a given project and location.
 * 
 */
@ResourceType(type="google-native:datamigration/v1beta1:MigrationJob")
public class MigrationJob extends io.pulumi.resources.CustomResource {
    /**
     * The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The resource name (URI) of the destination connection profile.
     * 
     */
    @OutputExport(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return The resource name (URI) of the destination connection profile.
     * 
     */
    public Output<String> getDestination() {
        return this.destination;
    }
    /**
     * The database engine type and provider of the destination.
     * 
     */
    @OutputExport(name="destinationDatabase", type=DatabaseTypeResponse.class, parameters={})
    private Output<DatabaseTypeResponse> destinationDatabase;

    /**
     * @return The database engine type and provider of the destination.
     * 
     */
    public Output<DatabaseTypeResponse> getDestinationDatabase() {
        return this.destinationDatabase;
    }
    /**
     * The migration job display name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The migration job display name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    @OutputExport(name="dumpPath", type=String.class, parameters={})
    private Output<String> dumpPath;

    /**
     * @return The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    public Output<String> getDumpPath() {
        return this.dumpPath;
    }
    /**
     * The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @OutputExport(name="duration", type=String.class, parameters={})
    private Output<String> duration;

    /**
     * @return The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Output<String> getDuration() {
        return this.duration;
    }
    /**
     * If the migration job is completed, the time when it was completed.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return If the migration job is completed, the time when it was completed.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The error details in case of state FAILED.
     * 
     */
    @OutputExport(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return The error details in case of state FAILED.
     * 
     */
    public Output<StatusResponse> getError() {
        return this.error;
    }
    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current migration job phase.
     * 
     */
    @OutputExport(name="phase", type=String.class, parameters={})
    private Output<String> phase;

    /**
     * @return The current migration job phase.
     * 
     */
    public Output<String> getPhase() {
        return this.phase;
    }
    /**
     * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    @OutputExport(name="reverseSshConnectivity", type=ReverseSshConnectivityResponse.class, parameters={})
    private Output<ReverseSshConnectivityResponse> reverseSshConnectivity;

    /**
     * @return The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    public Output<ReverseSshConnectivityResponse> getReverseSshConnectivity() {
        return this.reverseSshConnectivity;
    }
    /**
     * The resource name (URI) of the source connection profile.
     * 
     */
    @OutputExport(name="source", type=String.class, parameters={})
    private Output<String> source;

    /**
     * @return The resource name (URI) of the source connection profile.
     * 
     */
    public Output<String> getSource() {
        return this.source;
    }
    /**
     * The database engine type and provider of the source.
     * 
     */
    @OutputExport(name="sourceDatabase", type=DatabaseTypeResponse.class, parameters={})
    private Output<DatabaseTypeResponse> sourceDatabase;

    /**
     * @return The database engine type and provider of the source.
     * 
     */
    public Output<DatabaseTypeResponse> getSourceDatabase() {
        return this.sourceDatabase;
    }
    /**
     * The current migration job state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current migration job state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * static ip connectivity data (default, no additional details needed).
     * 
     */
    @OutputExport(name="staticIpConnectivity", type=StaticIpConnectivityResponse.class, parameters={})
    private Output<StaticIpConnectivityResponse> staticIpConnectivity;

    /**
     * @return static ip connectivity data (default, no additional details needed).
     * 
     */
    public Output<StaticIpConnectivityResponse> getStaticIpConnectivity() {
        return this.staticIpConnectivity;
    }
    /**
     * The migration job type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The migration job type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The details of the VPC network that the source database is located in.
     * 
     */
    @OutputExport(name="vpcPeeringConnectivity", type=VpcPeeringConnectivityResponse.class, parameters={})
    private Output<VpcPeeringConnectivityResponse> vpcPeeringConnectivity;

    /**
     * @return The details of the VPC network that the source database is located in.
     * 
     */
    public Output<VpcPeeringConnectivityResponse> getVpcPeeringConnectivity() {
        return this.vpcPeeringConnectivity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MigrationJob(String name, MigrationJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1beta1:MigrationJob", name, args == null ? MigrationJobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MigrationJob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1beta1:MigrationJob", name, null, makeResourceOptions(options, id));
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
    public static MigrationJob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MigrationJob(name, id, options);
    }
}
