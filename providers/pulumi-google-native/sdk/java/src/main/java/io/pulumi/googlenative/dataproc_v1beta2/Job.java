// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1beta2.JobArgs;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.HadoopJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.HiveJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.JobPlacementResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.JobReferenceResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.JobSchedulingResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.JobStatusResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.PigJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.PrestoJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.PySparkJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.SparkJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.SparkRJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.SparkSqlJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.YarnApplicationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Submits a job to a cluster.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataproc/v1beta2:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
     */
    @OutputExport(name="done", type=Boolean.class, parameters={})
    private Output<Boolean> done;

    /**
     * @return Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
     */
    public Output<Boolean> getDone() {
        return this.done;
    }
    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    @OutputExport(name="driverControlFilesUri", type=String.class, parameters={})
    private Output<String> driverControlFilesUri;

    /**
     * @return If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    public Output<String> getDriverControlFilesUri() {
        return this.driverControlFilesUri;
    }
    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     * 
     */
    @OutputExport(name="driverOutputResourceUri", type=String.class, parameters={})
    private Output<String> driverOutputResourceUri;

    /**
     * @return A URI pointing to the location of the stdout of the job's driver program.
     * 
     */
    public Output<String> getDriverOutputResourceUri() {
        return this.driverOutputResourceUri;
    }
    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    @OutputExport(name="hadoopJob", type=HadoopJobResponse.class, parameters={})
    private Output<HadoopJobResponse> hadoopJob;

    /**
     * @return Optional. Job is a Hadoop job.
     * 
     */
    public Output<HadoopJobResponse> getHadoopJob() {
        return this.hadoopJob;
    }
    /**
     * Optional. Job is a Hive job.
     * 
     */
    @OutputExport(name="hiveJob", type=HiveJobResponse.class, parameters={})
    private Output<HiveJobResponse> hiveJob;

    /**
     * @return Optional. Job is a Hive job.
     * 
     */
    public Output<HiveJobResponse> getHiveJob() {
        return this.hiveJob;
    }
    /**
     * A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
     */
    @OutputExport(name="jobUuid", type=String.class, parameters={})
    private Output<String> jobUuid;

    /**
     * @return A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
     */
    public Output<String> getJobUuid() {
        return this.jobUuid;
    }
    /**
     * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Job is a Pig job.
     * 
     */
    @OutputExport(name="pigJob", type=PigJobResponse.class, parameters={})
    private Output<PigJobResponse> pigJob;

    /**
     * @return Optional. Job is a Pig job.
     * 
     */
    public Output<PigJobResponse> getPigJob() {
        return this.pigJob;
    }
    /**
     * Job information, including how, when, and where to run the job.
     * 
     */
    @OutputExport(name="placement", type=JobPlacementResponse.class, parameters={})
    private Output<JobPlacementResponse> placement;

    /**
     * @return Job information, including how, when, and where to run the job.
     * 
     */
    public Output<JobPlacementResponse> getPlacement() {
        return this.placement;
    }
    /**
     * Optional. Job is a Presto job.
     * 
     */
    @OutputExport(name="prestoJob", type=PrestoJobResponse.class, parameters={})
    private Output<PrestoJobResponse> prestoJob;

    /**
     * @return Optional. Job is a Presto job.
     * 
     */
    public Output<PrestoJobResponse> getPrestoJob() {
        return this.prestoJob;
    }
    /**
     * Optional. Job is a PySpark job.
     * 
     */
    @OutputExport(name="pysparkJob", type=PySparkJobResponse.class, parameters={})
    private Output<PySparkJobResponse> pysparkJob;

    /**
     * @return Optional. Job is a PySpark job.
     * 
     */
    public Output<PySparkJobResponse> getPysparkJob() {
        return this.pysparkJob;
    }
    /**
     * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
     */
    @OutputExport(name="reference", type=JobReferenceResponse.class, parameters={})
    private Output<JobReferenceResponse> reference;

    /**
     * @return Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
     */
    public Output<JobReferenceResponse> getReference() {
        return this.reference;
    }
    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @OutputExport(name="scheduling", type=JobSchedulingResponse.class, parameters={})
    private Output<JobSchedulingResponse> scheduling;

    /**
     * @return Optional. Job scheduling configuration.
     * 
     */
    public Output<JobSchedulingResponse> getScheduling() {
        return this.scheduling;
    }
    /**
     * Optional. Job is a Spark job.
     * 
     */
    @OutputExport(name="sparkJob", type=SparkJobResponse.class, parameters={})
    private Output<SparkJobResponse> sparkJob;

    /**
     * @return Optional. Job is a Spark job.
     * 
     */
    public Output<SparkJobResponse> getSparkJob() {
        return this.sparkJob;
    }
    /**
     * Optional. Job is a SparkR job.
     * 
     */
    @OutputExport(name="sparkRJob", type=SparkRJobResponse.class, parameters={})
    private Output<SparkRJobResponse> sparkRJob;

    /**
     * @return Optional. Job is a SparkR job.
     * 
     */
    public Output<SparkRJobResponse> getSparkRJob() {
        return this.sparkRJob;
    }
    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    @OutputExport(name="sparkSqlJob", type=SparkSqlJobResponse.class, parameters={})
    private Output<SparkSqlJobResponse> sparkSqlJob;

    /**
     * @return Optional. Job is a SparkSql job.
     * 
     */
    public Output<SparkSqlJobResponse> getSparkSqlJob() {
        return this.sparkSqlJob;
    }
    /**
     * The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
     */
    @OutputExport(name="status", type=JobStatusResponse.class, parameters={})
    private Output<JobStatusResponse> status;

    /**
     * @return The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
     */
    public Output<JobStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * The previous job status.
     * 
     */
    @OutputExport(name="statusHistory", type=List.class, parameters={JobStatusResponse.class})
    private Output<List<JobStatusResponse>> statusHistory;

    /**
     * @return The previous job status.
     * 
     */
    public Output<List<JobStatusResponse>> getStatusHistory() {
        return this.statusHistory;
    }
    /**
     * The email address of the user submitting the job. For jobs submitted on the cluster, the address is username@hostname.
     * 
     */
    @OutputExport(name="submittedBy", type=String.class, parameters={})
    private Output<String> submittedBy;

    /**
     * @return The email address of the user submitting the job. For jobs submitted on the cluster, the address is username@hostname.
     * 
     */
    public Output<String> getSubmittedBy() {
        return this.submittedBy;
    }
    /**
     * The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    @OutputExport(name="yarnApplications", type=List.class, parameters={YarnApplicationResponse.class})
    private Output<List<YarnApplicationResponse>> yarnApplications;

    /**
     * @return The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    public Output<List<YarnApplicationResponse>> getYarnApplications() {
        return this.yarnApplications;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1beta2:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Job(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1beta2:Job", name, null, makeResourceOptions(options, id));
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
    public static Job get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
