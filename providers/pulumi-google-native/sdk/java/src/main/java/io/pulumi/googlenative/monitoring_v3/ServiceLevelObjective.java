// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v3.ServiceLevelObjectiveArgs;
import io.pulumi.googlenative.monitoring_v3.outputs.ServiceLevelIndicatorResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a ServiceLevelObjective for the given Service.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:monitoring/v3:ServiceLevelObjective")
public class ServiceLevelObjective extends io.pulumi.resources.CustomResource {
    /**
     * A calendar period, semantically "since the start of the current ". At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported.
     * 
     */
    @OutputExport(name="calendarPeriod", type=String.class, parameters={})
    private Output<String> calendarPeriod;

    /**
     * @return A calendar period, semantically "since the start of the current ". At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported.
     * 
     */
    public Output<String> getCalendarPeriod() {
        return this.calendarPeriod;
    }
    /**
     * Name used for UI elements listing this SLO.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Name used for UI elements listing this SLO.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The fraction of service that must be good in order for this objective to be met. 0 < goal <= 0.999.
     * 
     */
    @OutputExport(name="goal", type=Double.class, parameters={})
    private Output<Double> goal;

    /**
     * @return The fraction of service that must be good in order for this objective to be met. 0 < goal <= 0.999.
     * 
     */
    public Output<Double> getGoal() {
        return this.goal;
    }
    /**
     * Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A rolling time period, semantically "in the past ". Must be an integer multiple of 1 day no larger than 30 days.
     * 
     */
    @OutputExport(name="rollingPeriod", type=String.class, parameters={})
    private Output<String> rollingPeriod;

    /**
     * @return A rolling time period, semantically "in the past ". Must be an integer multiple of 1 day no larger than 30 days.
     * 
     */
    public Output<String> getRollingPeriod() {
        return this.rollingPeriod;
    }
    /**
     * The definition of good service, used to measure and calculate the quality of the Service's performance with respect to a single aspect of service quality.
     * 
     */
    @OutputExport(name="serviceLevelIndicator", type=ServiceLevelIndicatorResponse.class, parameters={})
    private Output<ServiceLevelIndicatorResponse> serviceLevelIndicator;

    /**
     * @return The definition of good service, used to measure and calculate the quality of the Service's performance with respect to a single aspect of service quality.
     * 
     */
    public Output<ServiceLevelIndicatorResponse> getServiceLevelIndicator() {
        return this.serviceLevelIndicator;
    }
    /**
     * Labels which have been used to annotate the service-level objective. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    @OutputExport(name="userLabels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> userLabels;

    /**
     * @return Labels which have been used to annotate the service-level objective. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    public Output<Map<String,String>> getUserLabels() {
        return this.userLabels;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceLevelObjective(String name, ServiceLevelObjectiveArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:ServiceLevelObjective", name, args == null ? ServiceLevelObjectiveArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceLevelObjective(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:ServiceLevelObjective", name, null, makeResourceOptions(options, id));
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
    public static ServiceLevelObjective get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceLevelObjective(name, id, options);
    }
}
