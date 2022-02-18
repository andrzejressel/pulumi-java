// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.UtilizationReportArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.VmUtilizationInfoResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new UtilizationReport.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1alpha1:UtilizationReport")
public class UtilizationReport extends io.pulumi.resources.CustomResource {
    /**
     * The time the report was created (this refers to the time of the request, not the time the report creation completed).
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the report was created (this refers to the time of the request, not the time the report creation completed).
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The report display name, as assigned by the user.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The report display name, as assigned by the user.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Provides details on the state of the report in case of an error.
     * 
     */
    @OutputExport(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details on the state of the report in case of an error.
     * 
     */
    public Output<StatusResponse> getError() {
        return this.error;
    }
    /**
     * The point in time when the time frame ends. Notice that the time frame is counted backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK then the report covers the week between 2021/01/20 and 2021/01/14.
     * 
     */
    @OutputExport(name="frameEndTime", type=String.class, parameters={})
    private Output<String> frameEndTime;

    /**
     * @return The point in time when the time frame ends. Notice that the time frame is counted backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK then the report covers the week between 2021/01/20 and 2021/01/14.
     * 
     */
    public Output<String> getFrameEndTime() {
        return this.frameEndTime;
    }
    /**
     * The report unique name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The report unique name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Current state of the report.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the report.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The time the state was last set.
     * 
     */
    @OutputExport(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The time the state was last set.
     * 
     */
    public Output<String> getStateTime() {
        return this.stateTime;
    }
    /**
     * Time frame of the report.
     * 
     */
    @OutputExport(name="timeFrame", type=String.class, parameters={})
    private Output<String> timeFrame;

    /**
     * @return Time frame of the report.
     * 
     */
    public Output<String> getTimeFrame() {
        return this.timeFrame;
    }
    /**
     * Total number of VMs included in the report.
     * 
     */
    @OutputExport(name="vmCount", type=Integer.class, parameters={})
    private Output<Integer> vmCount;

    /**
     * @return Total number of VMs included in the report.
     * 
     */
    public Output<Integer> getVmCount() {
        return this.vmCount;
    }
    /**
     * List of utilization information per VM. When sent as part of the request, the "vm_id" field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
     * 
     */
    @OutputExport(name="vms", type=List.class, parameters={VmUtilizationInfoResponse.class})
    private Output<List<VmUtilizationInfoResponse>> vms;

    /**
     * @return List of utilization information per VM. When sent as part of the request, the "vm_id" field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
     * 
     */
    public Output<List<VmUtilizationInfoResponse>> getVms() {
        return this.vms;
    }
    /**
     * Total number of VMs included in the report.
     * 
     */
    @OutputExport(name="vmsCount", type=Integer.class, parameters={})
    private Output<Integer> vmsCount;

    /**
     * @return Total number of VMs included in the report.
     * 
     */
    public Output<Integer> getVmsCount() {
        return this.vmsCount;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UtilizationReport(String name, UtilizationReportArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:UtilizationReport", name, args == null ? UtilizationReportArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UtilizationReport(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:UtilizationReport", name, null, makeResourceOptions(options, id));
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
    public static UtilizationReport get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UtilizationReport(name, id, options);
    }
}
