// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.VirtualMachineScheduleArgs;
import io.pulumi.azurenative.devtestlab.outputs.DayDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.HourDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.NotificationSettingsResponse;
import io.pulumi.azurenative.devtestlab.outputs.WeekDetailsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A schedule.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devtestlab:VirtualMachineSchedule LabVmsShutdown /subscriptions/{subscriptionId}/resourcegroups/resourceGroupName/providers/microsoft.devtestlab/labs/{labName}/virtualMachines/{vmName}/schedules/LabVmsShutdown 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:VirtualMachineSchedule")
public class VirtualMachineSchedule extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of the schedule.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the schedule.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @Export(name="dailyRecurrence", type=DayDetailsResponse.class, parameters={})
    private Output</* @Nullable */ DayDetailsResponse> dailyRecurrence;

    /**
     * @return If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    public Output</* @Nullable */ DayDetailsResponse> getDailyRecurrence() {
        return this.dailyRecurrence;
    }
    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @Export(name="hourlyRecurrence", type=HourDetailsResponse.class, parameters={})
    private Output</* @Nullable */ HourDetailsResponse> hourlyRecurrence;

    /**
     * @return If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    public Output</* @Nullable */ HourDetailsResponse> getHourlyRecurrence() {
        return this.hourlyRecurrence;
    }
    /**
     * The location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Notification settings.
     * 
     */
    @Export(name="notificationSettings", type=NotificationSettingsResponse.class, parameters={})
    private Output</* @Nullable */ NotificationSettingsResponse> notificationSettings;

    /**
     * @return Notification settings.
     * 
     */
    public Output</* @Nullable */ NotificationSettingsResponse> getNotificationSettings() {
        return this.notificationSettings;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @Export(name="targetResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceId;

    /**
     * @return The resource ID to which the schedule belongs
     * 
     */
    public Output</* @Nullable */ String> getTargetResourceId() {
        return this.targetResourceId;
    }
    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @Export(name="taskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> taskType;

    /**
     * @return The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    public Output</* @Nullable */ String> getTaskType() {
        return this.taskType;
    }
    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Export(name="timeZoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeZoneId;

    /**
     * @return The time zone ID (e.g. Pacific Standard time).
     * 
     */
    public Output</* @Nullable */ String> getTimeZoneId() {
        return this.timeZoneId;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Export(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @Export(name="weeklyRecurrence", type=WeekDetailsResponse.class, parameters={})
    private Output</* @Nullable */ WeekDetailsResponse> weeklyRecurrence;

    /**
     * @return If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    public Output</* @Nullable */ WeekDetailsResponse> getWeeklyRecurrence() {
        return this.weeklyRecurrence;
    }

    public interface BuilderApplicator {
        public void apply(VirtualMachineScheduleArgs.Builder a);
    }
    private static io.pulumi.azurenative.devtestlab.VirtualMachineScheduleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.devtestlab.VirtualMachineScheduleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualMachineSchedule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineSchedule(String name) {
        this(name, VirtualMachineScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineSchedule(String name, VirtualMachineScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineSchedule(String name, VirtualMachineScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:VirtualMachineSchedule", name, args == null ? VirtualMachineScheduleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualMachineSchedule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:VirtualMachineSchedule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:devtestlab/v20160515:VirtualMachineSchedule").build()),
                Output.of(Alias.builder().type("azure-native:devtestlab/v20180915:VirtualMachineSchedule").build())
            ))
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
    public static VirtualMachineSchedule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineSchedule(name, id, options);
    }
}
