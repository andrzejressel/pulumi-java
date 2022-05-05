// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataflow.JobArgs;
import com.pulumi.gcp.dataflow.inputs.JobState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:dataflow/job:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * List of experiments that should be used by the job. An example value is `[&#34;enable_stackdriver_agent_metrics&#34;]`.
     * 
     */
    @Export(name="additionalExperiments", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> additionalExperiments;

    /**
     * @return List of experiments that should be used by the job. An example value is `[&#34;enable_stackdriver_agent_metrics&#34;]`.
     * 
     */
    public Output<Optional<List<String>>> additionalExperiments() {
        return Codegen.optional(this.additionalExperiments);
    }
    /**
     * Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
     * 
     */
    @Export(name="enableStreamingEngine", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStreamingEngine;

    /**
     * @return Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
     * 
     */
    public Output<Optional<Boolean>> enableStreamingEngine() {
        return Codegen.optional(this.enableStreamingEngine);
    }
    /**
     * The configuration for VM IPs.  Options are `&#34;WORKER_IP_PUBLIC&#34;` or `&#34;WORKER_IP_PRIVATE&#34;`.
     * 
     */
    @Export(name="ipConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipConfiguration;

    /**
     * @return The configuration for VM IPs.  Options are `&#34;WORKER_IP_PUBLIC&#34;` or `&#34;WORKER_IP_PRIVATE&#34;`.
     * 
     */
    public Output<Optional<String>> ipConfiguration() {
        return Codegen.optional(this.ipConfiguration);
    }
    /**
     * The unique ID of this job.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return The unique ID of this job.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
     * 
     */
    public Output<Optional<String>> kmsKeyName() {
        return Codegen.optional(this.kmsKeyName);
    }
    /**
     * User labels to be specified for the job. Keys and values should follow the restrictions
     * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
     * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
     * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return User labels to be specified for the job. Keys and values should follow the restrictions
     * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
     * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
     * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
     * 
     */
    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The machine type to use for the job.
     * 
     */
    @Export(name="machineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> machineType;

    /**
     * @return The machine type to use for the job.
     * 
     */
    public Output<Optional<String>> machineType() {
        return Codegen.optional(this.machineType);
    }
    /**
     * The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
     * 
     */
    @Export(name="maxWorkers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxWorkers;

    /**
     * @return The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
     * 
     */
    public Output<Optional<Integer>> maxWorkers() {
        return Codegen.optional(this.maxWorkers);
    }
    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by Dataflow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network to which VMs will be assigned. If it is not provided, &#34;default&#34; will be used.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return The network to which VMs will be assigned. If it is not provided, &#34;default&#34; will be used.
     * 
     */
    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * One of &#34;drain&#34; or &#34;cancel&#34;.  Specifies behavior of deletion during `pulumi destroy`.  See above note.
     * 
     */
    @Export(name="onDelete", type=String.class, parameters={})
    private Output</* @Nullable */ String> onDelete;

    /**
     * @return One of &#34;drain&#34; or &#34;cancel&#34;.  Specifies behavior of deletion during `pulumi destroy`.  See above note.
     * 
     */
    public Output<Optional<String>> onDelete() {
        return Codegen.optional(this.onDelete);
    }
    /**
     * Key/Value pairs to be passed to the Dataflow job (as used in the template).
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> parameters;

    /**
     * @return Key/Value pairs to be passed to the Dataflow job (as used in the template).
     * 
     */
    public Output<Optional<Map<String,Object>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region in which the created job should run.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region in which the created job should run.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The Service Account email used to create the job.
     * 
     */
    @Export(name="serviceAccountEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceAccountEmail;

    /**
     * @return The Service Account email used to create the job.
     * 
     */
    public Output<Optional<String>> serviceAccountEmail() {
        return Codegen.optional(this.serviceAccountEmail);
    }
    /**
     * If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
     * 
     */
    @Export(name="skipWaitOnJobTermination", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipWaitOnJobTermination;

    /**
     * @return If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
     * 
     */
    public Output<Optional<Boolean>> skipWaitOnJobTermination() {
        return Codegen.optional(this.skipWaitOnJobTermination);
    }
    /**
     * The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The subnetwork to which VMs will be assigned. Should be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `&#34;googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME&#34;`
     * 
     */
    @Export(name="subnetwork", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetwork;

    /**
     * @return The subnetwork to which VMs will be assigned. Should be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `&#34;googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME&#34;`
     * 
     */
    public Output<Optional<String>> subnetwork() {
        return Codegen.optional(this.subnetwork);
    }
    /**
     * A writeable location on GCS for the Dataflow job to dump its temporary data.
     * 
     */
    @Export(name="tempGcsLocation", type=String.class, parameters={})
    private Output<String> tempGcsLocation;

    /**
     * @return A writeable location on GCS for the Dataflow job to dump its temporary data.
     * 
     */
    public Output<String> tempGcsLocation() {
        return this.tempGcsLocation;
    }
    /**
     * The GCS path to the Dataflow job template.
     * 
     */
    @Export(name="templateGcsPath", type=String.class, parameters={})
    private Output<String> templateGcsPath;

    /**
     * @return The GCS path to the Dataflow job template.
     * 
     */
    public Output<String> templateGcsPath() {
        return this.templateGcsPath;
    }
    /**
     * Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
     * 
     */
    @Export(name="transformNameMapping", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> transformNameMapping;

    /**
     * @return Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
     * 
     */
    public Output<Optional<Map<String,Object>>> transformNameMapping() {
        return Codegen.optional(this.transformNameMapping);
    }
    /**
     * The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The zone in which the created job should run. If it is not provided, the provider zone is used.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    /**
     * @return The zone in which the created job should run. If it is not provided, the provider zone is used.
     * 
     */
    public Output<Optional<String>> zone() {
        return Codegen.optional(this.zone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataflow/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataflow/job:Job", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Job get(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, state, options);
    }
}
