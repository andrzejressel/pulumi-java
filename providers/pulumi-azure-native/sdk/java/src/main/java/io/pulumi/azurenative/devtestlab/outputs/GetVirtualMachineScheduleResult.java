// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.DayDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.HourDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.NotificationSettingsResponse;
import io.pulumi.azurenative.devtestlab.outputs.WeekDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualMachineScheduleResult {
    /**
     * The creation date of the schedule.
     * 
     */
    private final String createdDate;
    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    private final @Nullable DayDetailsResponse dailyRecurrence;
    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    private final @Nullable HourDetailsResponse hourlyRecurrence;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Notification settings.
     * 
     */
    private final @Nullable NotificationSettingsResponse notificationSettings;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    private final @Nullable String status;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource ID to which the schedule belongs
     * 
     */
    private final @Nullable String targetResourceId;
    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    private final @Nullable String taskType;
    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    private final @Nullable String timeZoneId;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;
    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    private final @Nullable WeekDetailsResponse weeklyRecurrence;

    @OutputCustomType.Constructor
    private GetVirtualMachineScheduleResult(
        @OutputCustomType.Parameter("createdDate") String createdDate,
        @OutputCustomType.Parameter("dailyRecurrence") @Nullable DayDetailsResponse dailyRecurrence,
        @OutputCustomType.Parameter("hourlyRecurrence") @Nullable HourDetailsResponse hourlyRecurrence,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("notificationSettings") @Nullable NotificationSettingsResponse notificationSettings,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("status") @Nullable String status,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("targetResourceId") @Nullable String targetResourceId,
        @OutputCustomType.Parameter("taskType") @Nullable String taskType,
        @OutputCustomType.Parameter("timeZoneId") @Nullable String timeZoneId,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uniqueIdentifier") String uniqueIdentifier,
        @OutputCustomType.Parameter("weeklyRecurrence") @Nullable WeekDetailsResponse weeklyRecurrence) {
        this.createdDate = createdDate;
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.id = id;
        this.location = location;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.provisioningState = provisioningState;
        this.status = status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
        this.weeklyRecurrence = weeklyRecurrence;
    }

    /**
     * The creation date of the schedule.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
    */
    public Optional<DayDetailsResponse> getDailyRecurrence() {
        return Optional.ofNullable(this.dailyRecurrence);
    }
    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
    */
    public Optional<HourDetailsResponse> getHourlyRecurrence() {
        return Optional.ofNullable(this.hourlyRecurrence);
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Notification settings.
     * 
    */
    public Optional<NotificationSettingsResponse> getNotificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource ID to which the schedule belongs
     * 
    */
    public Optional<String> getTargetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }
    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
    */
    public Optional<String> getTaskType() {
        return Optional.ofNullable(this.taskType);
    }
    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
    */
    public Optional<String> getTimeZoneId() {
        return Optional.ofNullable(this.timeZoneId);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
    */
    public Optional<WeekDetailsResponse> getWeeklyRecurrence() {
        return Optional.ofNullable(this.weeklyRecurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable DayDetailsResponse dailyRecurrence;
        private @Nullable HourDetailsResponse hourlyRecurrence;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable NotificationSettingsResponse notificationSettings;
        private String provisioningState;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceId;
        private @Nullable String taskType;
        private @Nullable String timeZoneId;
        private String type;
        private String uniqueIdentifier;
        private @Nullable WeekDetailsResponse weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDailyRecurrence(@Nullable DayDetailsResponse dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder setHourlyRecurrence(@Nullable HourDetailsResponse hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        public Builder setTaskType(@Nullable String taskType) {
            this.taskType = taskType;
            return this;
        }

        public Builder setTimeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }

        public Builder setWeeklyRecurrence(@Nullable WeekDetailsResponse weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }
        public GetVirtualMachineScheduleResult build() {
            return new GetVirtualMachineScheduleResult(createdDate, dailyRecurrence, hourlyRecurrence, id, location, name, notificationSettings, provisioningState, status, tags, targetResourceId, taskType, timeZoneId, type, uniqueIdentifier, weeklyRecurrence);
        }
    }
}
