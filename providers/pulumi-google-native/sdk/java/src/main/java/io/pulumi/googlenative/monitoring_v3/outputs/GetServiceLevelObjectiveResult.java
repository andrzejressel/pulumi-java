// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.ServiceLevelIndicatorResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetServiceLevelObjectiveResult {
    /**
     * A calendar period, semantically "since the start of the current ". At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported.
     * 
     */
    private final String calendarPeriod;
    /**
     * Name used for UI elements listing this SLO.
     * 
     */
    private final String displayName;
    /**
     * The fraction of service that must be good in order for this objective to be met. 0 < goal <= 0.999.
     * 
     */
    private final Double goal;
    /**
     * Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
     * 
     */
    private final String name;
    /**
     * A rolling time period, semantically "in the past ". Must be an integer multiple of 1 day no larger than 30 days.
     * 
     */
    private final String rollingPeriod;
    /**
     * The definition of good service, used to measure and calculate the quality of the Service's performance with respect to a single aspect of service quality.
     * 
     */
    private final ServiceLevelIndicatorResponse serviceLevelIndicator;
    /**
     * Labels which have been used to annotate the service-level objective. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    private final Map<String,String> userLabels;

    @OutputCustomType.Constructor({"calendarPeriod","displayName","goal","name","rollingPeriod","serviceLevelIndicator","userLabels"})
    private GetServiceLevelObjectiveResult(
        String calendarPeriod,
        String displayName,
        Double goal,
        String name,
        String rollingPeriod,
        ServiceLevelIndicatorResponse serviceLevelIndicator,
        Map<String,String> userLabels) {
        this.calendarPeriod = Objects.requireNonNull(calendarPeriod);
        this.displayName = Objects.requireNonNull(displayName);
        this.goal = Objects.requireNonNull(goal);
        this.name = Objects.requireNonNull(name);
        this.rollingPeriod = Objects.requireNonNull(rollingPeriod);
        this.serviceLevelIndicator = Objects.requireNonNull(serviceLevelIndicator);
        this.userLabels = Objects.requireNonNull(userLabels);
    }

    /**
     * A calendar period, semantically "since the start of the current ". At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported.
     * 
     */
    public String getCalendarPeriod() {
        return this.calendarPeriod;
    }
    /**
     * Name used for UI elements listing this SLO.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The fraction of service that must be good in order for this objective to be met. 0 < goal <= 0.999.
     * 
     */
    public Double getGoal() {
        return this.goal;
    }
    /**
     * Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * A rolling time period, semantically "in the past ". Must be an integer multiple of 1 day no larger than 30 days.
     * 
     */
    public String getRollingPeriod() {
        return this.rollingPeriod;
    }
    /**
     * The definition of good service, used to measure and calculate the quality of the Service's performance with respect to a single aspect of service quality.
     * 
     */
    public ServiceLevelIndicatorResponse getServiceLevelIndicator() {
        return this.serviceLevelIndicator;
    }
    /**
     * Labels which have been used to annotate the service-level objective. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    public Map<String,String> getUserLabels() {
        return this.userLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLevelObjectiveResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String calendarPeriod;
        private String displayName;
        private Double goal;
        private String name;
        private String rollingPeriod;
        private ServiceLevelIndicatorResponse serviceLevelIndicator;
        private Map<String,String> userLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceLevelObjectiveResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calendarPeriod = defaults.calendarPeriod;
    	      this.displayName = defaults.displayName;
    	      this.goal = defaults.goal;
    	      this.name = defaults.name;
    	      this.rollingPeriod = defaults.rollingPeriod;
    	      this.serviceLevelIndicator = defaults.serviceLevelIndicator;
    	      this.userLabels = defaults.userLabels;
        }

        public Builder setCalendarPeriod(String calendarPeriod) {
            this.calendarPeriod = Objects.requireNonNull(calendarPeriod);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setGoal(Double goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRollingPeriod(String rollingPeriod) {
            this.rollingPeriod = Objects.requireNonNull(rollingPeriod);
            return this;
        }

        public Builder setServiceLevelIndicator(ServiceLevelIndicatorResponse serviceLevelIndicator) {
            this.serviceLevelIndicator = Objects.requireNonNull(serviceLevelIndicator);
            return this;
        }

        public Builder setUserLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }

        public GetServiceLevelObjectiveResult build() {
            return new GetServiceLevelObjectiveResult(calendarPeriod, displayName, goal, name, rollingPeriod, serviceLevelIndicator, userLabels);
        }
    }
}
