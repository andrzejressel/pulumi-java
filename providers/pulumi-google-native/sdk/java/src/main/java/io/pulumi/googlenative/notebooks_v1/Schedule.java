// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.notebooks_v1.ScheduleArgs;
import io.pulumi.googlenative.notebooks_v1.outputs.ExecutionResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.ExecutionTemplateResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Scheduled Notebook in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:notebooks/v1:Schedule")
public class Schedule extends io.pulumi.resources.CustomResource {
    /**
     * Time the schedule was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the schedule was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Cron-tab formatted schedule by which the job will execute. Format: minute, hour, day of month, month, day of week, e.g. 0 0 * * WED = every Wednesday More examples: https://crontab.guru/examples.html
     * 
     */
    @OutputExport(name="cronSchedule", type=String.class, parameters={})
    private Output<String> cronSchedule;

    /**
     * @return Cron-tab formatted schedule by which the job will execute. Format: minute, hour, day of month, month, day of week, e.g. 0 0 * * WED = every Wednesday More examples: https://crontab.guru/examples.html
     * 
     */
    public Output<String> getCronSchedule() {
        return this.cronSchedule;
    }
    /**
     * A brief description of this environment.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A brief description of this environment.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Display name used for UI purposes. Name can only contain alphanumeric characters, hyphens '-', and underscores '_'.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name used for UI purposes. Name can only contain alphanumeric characters, hyphens '-', and underscores '_'.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Notebook Execution Template corresponding to this schedule.
     * 
     */
    @OutputExport(name="executionTemplate", type=ExecutionTemplateResponse.class, parameters={})
    private Output<ExecutionTemplateResponse> executionTemplate;

    /**
     * @return Notebook Execution Template corresponding to this schedule.
     * 
     */
    public Output<ExecutionTemplateResponse> getExecutionTemplate() {
        return this.executionTemplate;
    }
    /**
     * The name of this schedule. Format: `projects/{project_id}/locations/{location}/schedules/{schedule_id}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this schedule. Format: `projects/{project_id}/locations/{location}/schedules/{schedule_id}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The most recent execution names triggered from this schedule and their corresponding states.
     * 
     */
    @OutputExport(name="recentExecutions", type=List.class, parameters={ExecutionResponse.class})
    private Output<List<ExecutionResponse>> recentExecutions;

    /**
     * @return The most recent execution names triggered from this schedule and their corresponding states.
     * 
     */
    public Output<List<ExecutionResponse>> getRecentExecutions() {
        return this.recentExecutions;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    /**
     * Timezone on which the cron_schedule. The value of this field must be a time zone name from the tz database. TZ Database: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return Timezone on which the cron_schedule. The value of this field must be a time zone name from the tz database. TZ Database: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }
    /**
     * Time the schedule was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the schedule was last updated.
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
    public Schedule(String name, ScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Schedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Schedule", name, null, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, options);
    }
}
