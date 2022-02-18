// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigquery.DataTransferConfigArgs;
import io.pulumi.gcp.bigquery.inputs.DataTransferConfigState;
import io.pulumi.gcp.bigquery.outputs.DataTransferConfigEmailPreferences;
import io.pulumi.gcp.bigquery.outputs.DataTransferConfigScheduleOptions;
import io.pulumi.gcp.bigquery.outputs.DataTransferConfigSensitiveParams;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a data transfer configuration. A transfer configuration
 * contains all metadata needed to perform a data transfer.
 * 
 * To get more information about Config, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/datatransfer/rest/v1/projects.locations.transferConfigs/create)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/bigquery/docs/reference/datatransfer/rest/)
 * 
 * > **Warning:** All arguments including `sensitive_params.secret_access_key` will be stored in the raw
 * state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Config can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/dataTransferConfig:DataTransferConfig default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/dataTransferConfig:DataTransferConfig")
public class DataTransferConfig extends io.pulumi.resources.CustomResource {
    /**
     * The number of days to look back to automatically refresh the data.
     * For example, if dataRefreshWindowDays = 10, then every day BigQuery
     * reingests data for [today-10, today-1], rather than ingesting data for
     * just [today-1]. Only valid if the data source supports the feature.
     * Set the value to 0 to use the default value.
     * 
     */
    @OutputExport(name="dataRefreshWindowDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dataRefreshWindowDays;

    /**
     * @return The number of days to look back to automatically refresh the data.
     * For example, if dataRefreshWindowDays = 10, then every day BigQuery
     * reingests data for [today-10, today-1], rather than ingesting data for
     * just [today-1]. Only valid if the data source supports the feature.
     * Set the value to 0 to use the default value.
     * 
     */
    public Output</* @Nullable */ Integer> getDataRefreshWindowDays() {
        return this.dataRefreshWindowDays;
    }
    /**
     * The data source id. Cannot be changed once the transfer config is created.
     * 
     */
    @OutputExport(name="dataSourceId", type=String.class, parameters={})
    private Output<String> dataSourceId;

    /**
     * @return The data source id. Cannot be changed once the transfer config is created.
     * 
     */
    public Output<String> getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * The BigQuery target dataset id.
     * 
     */
    @OutputExport(name="destinationDatasetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> destinationDatasetId;

    /**
     * @return The BigQuery target dataset id.
     * 
     */
    public Output</* @Nullable */ String> getDestinationDatasetId() {
        return this.destinationDatasetId;
    }
    /**
     * When set to true, no runs are scheduled for a given transfer.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return When set to true, no runs are scheduled for a given transfer.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * The user specified display name for the transfer config.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user specified display name for the transfer config.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Email notifications will be sent according to these preferences to the
     * email address of the user who owns this transfer config.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="emailPreferences", type=DataTransferConfigEmailPreferences.class, parameters={})
    private Output</* @Nullable */ DataTransferConfigEmailPreferences> emailPreferences;

    /**
     * @return Email notifications will be sent according to these preferences to the
     * email address of the user who owns this transfer config.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DataTransferConfigEmailPreferences> getEmailPreferences() {
        return this.emailPreferences;
    }
    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The resource name of the transfer config. Transfer config names have the form
     * projects/{projectId}/locations/{location}/transferConfigs/{configId}. Where configId is usually a uuid, but this is not
     * required. The name is ignored when creating a transfer config.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the transfer config. Transfer config names have the form
     * projects/{projectId}/locations/{location}/transferConfigs/{configId}. Where configId is usually a uuid, but this is not
     * required. The name is ignored when creating a transfer config.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Pub/Sub topic where notifications will be sent after transfer runs
     * associated with this transfer config finish.
     * 
     */
    @OutputExport(name="notificationPubsubTopic", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationPubsubTopic;

    /**
     * @return Pub/Sub topic where notifications will be sent after transfer runs
     * associated with this transfer config finish.
     * 
     */
    public Output</* @Nullable */ String> getNotificationPubsubTopic() {
        return this.notificationPubsubTopic;
    }
    /**
     * Parameters specific to each data source. For more information see the bq tab in the 'Setting up a data transfer'
     * section for each data source. For example the parameters for Cloud Storage transfers are listed here:
     * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    @OutputExport(name="params", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> params;

    /**
     * @return Parameters specific to each data source. For more information see the bq tab in the 'Setting up a data transfer'
     * section for each data source. For example the parameters for Cloud Storage transfers are listed here:
     * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    public Output<Map<String,String>> getParams() {
        return this.params;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Data transfer schedule. If the data source does not support a custom
     * schedule, this should be empty. If it is empty, the default value for
     * the data source will be used. The specified times are in UTC. Examples
     * of valid format: 1st,3rd monday of month 15:30, every wed,fri of jan,
     * jun 13:15, and first sunday of quarter 00:00. See more explanation
     * about the format here:
     * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
     * NOTE: the granularity should be at least 8 hours, or less frequent.
     * 
     */
    @OutputExport(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    /**
     * @return Data transfer schedule. If the data source does not support a custom
     * schedule, this should be empty. If it is empty, the default value for
     * the data source will be used. The specified times are in UTC. Examples
     * of valid format: 1st,3rd monday of month 15:30, every wed,fri of jan,
     * jun 13:15, and first sunday of quarter 00:00. See more explanation
     * about the format here:
     * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
     * NOTE: the granularity should be at least 8 hours, or less frequent.
     * 
     */
    public Output</* @Nullable */ String> getSchedule() {
        return this.schedule;
    }
    /**
     * Options customizing the data transfer schedule.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="scheduleOptions", type=DataTransferConfigScheduleOptions.class, parameters={})
    private Output</* @Nullable */ DataTransferConfigScheduleOptions> scheduleOptions;

    /**
     * @return Options customizing the data transfer schedule.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DataTransferConfigScheduleOptions> getScheduleOptions() {
        return this.scheduleOptions;
    }
    /**
     * Different parameters are configured primarily using the the `params` field on this
     * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
     * in the `params` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="sensitiveParams", type=DataTransferConfigSensitiveParams.class, parameters={})
    private Output</* @Nullable */ DataTransferConfigSensitiveParams> sensitiveParams;

    /**
     * @return Different parameters are configured primarily using the the `params` field on this
     * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
     * in the `params` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DataTransferConfigSensitiveParams> getSensitiveParams() {
        return this.sensitiveParams;
    }
    /**
     * Service account email. If this field is set, transfer config will
     * be created with this service account credentials. It requires that
     * requesting user calling this API has permissions to act as this service account.
     * 
     */
    @OutputExport(name="serviceAccountName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceAccountName;

    /**
     * @return Service account email. If this field is set, transfer config will
     * be created with this service account credentials. It requires that
     * requesting user calling this API has permissions to act as this service account.
     * 
     */
    public Output</* @Nullable */ String> getServiceAccountName() {
        return this.serviceAccountName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataTransferConfig(String name, DataTransferConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/dataTransferConfig:DataTransferConfig", name, args == null ? DataTransferConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataTransferConfig(String name, Input<String> id, @Nullable DataTransferConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/dataTransferConfig:DataTransferConfig", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataTransferConfig get(String name, Input<String> id, @Nullable DataTransferConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataTransferConfig(name, id, state, options);
    }
}
