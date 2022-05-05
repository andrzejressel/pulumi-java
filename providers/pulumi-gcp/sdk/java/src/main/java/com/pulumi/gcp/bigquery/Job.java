// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.JobArgs;
import com.pulumi.gcp.bigquery.inputs.JobState;
import com.pulumi.gcp.bigquery.outputs.JobCopy;
import com.pulumi.gcp.bigquery.outputs.JobExtract;
import com.pulumi.gcp.bigquery.outputs.JobLoad;
import com.pulumi.gcp.bigquery.outputs.JobQuery;
import com.pulumi.gcp.bigquery.outputs.JobStatus;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Jobs are actions that BigQuery runs on your behalf to load data, export data, query data, or copy data.
 * Once a BigQuery job is created, it cannot be changed or deleted.
 * 
 * To get more information about Job, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/rest/v2/jobs)
 * * How-to Guides
 *     * [BigQuery Jobs Intro](https://cloud.google.com/bigquery/docs/jobs-overview)
 * 
 * ## Example Usage
 * ### Bigquery Job Query
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bar = new Dataset(&#34;bar&#34;, DatasetArgs.builder()        
 *             .datasetId(&#34;job_query_dataset&#34;)
 *             .friendlyName(&#34;test&#34;)
 *             .description(&#34;This is a test description&#34;)
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var foo = new Table(&#34;foo&#34;, TableArgs.builder()        
 *             .deletionProtection(false)
 *             .datasetId(bar.getDatasetId())
 *             .tableId(&#34;job_query_table&#34;)
 *             .build());
 * 
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .jobId(&#34;job_query&#34;)
 *             .labels(Map.of(&#34;example-label&#34;, &#34;example-value&#34;))
 *             .query(JobQuery.builder()
 *                 .query(&#34;SELECT state FROM [lookerdata:cdc.project_tycho_reports]&#34;)
 *                 .destinationTable(JobQueryDestinationTable.builder()
 *                     .projectId(foo.getProject())
 *                     .datasetId(foo.getDatasetId())
 *                     .tableId(foo.getTableId())
 *                     .build())
 *                 .allowLargeResults(true)
 *                 .flattenResults(true)
 *                 .scriptOptions(JobQueryScriptOptions.builder()
 *                     .keyResultStatement(&#34;LAST&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Bigquery Job Query Table Reference
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bar = new Dataset(&#34;bar&#34;, DatasetArgs.builder()        
 *             .datasetId(&#34;job_query_dataset&#34;)
 *             .friendlyName(&#34;test&#34;)
 *             .description(&#34;This is a test description&#34;)
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var foo = new Table(&#34;foo&#34;, TableArgs.builder()        
 *             .deletionProtection(false)
 *             .datasetId(bar.getDatasetId())
 *             .tableId(&#34;job_query_table&#34;)
 *             .build());
 * 
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .jobId(&#34;job_query&#34;)
 *             .labels(Map.of(&#34;example-label&#34;, &#34;example-value&#34;))
 *             .query(JobQuery.builder()
 *                 .query(&#34;SELECT state FROM [lookerdata:cdc.project_tycho_reports]&#34;)
 *                 .destinationTable(JobQueryDestinationTable.builder()
 *                     .tableId(foo.getId())
 *                     .build())
 *                 .defaultDataset(JobQueryDefaultDataset.builder()
 *                     .datasetId(bar.getId())
 *                     .build())
 *                 .allowLargeResults(true)
 *                 .flattenResults(true)
 *                 .scriptOptions(JobQueryScriptOptions.builder()
 *                     .keyResultStatement(&#34;LAST&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Bigquery Job Load
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bar = new Dataset(&#34;bar&#34;, DatasetArgs.builder()        
 *             .datasetId(&#34;job_load_dataset&#34;)
 *             .friendlyName(&#34;test&#34;)
 *             .description(&#34;This is a test description&#34;)
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var foo = new Table(&#34;foo&#34;, TableArgs.builder()        
 *             .deletionProtection(false)
 *             .datasetId(bar.getDatasetId())
 *             .tableId(&#34;job_load_table&#34;)
 *             .build());
 * 
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .jobId(&#34;job_load&#34;)
 *             .labels(Map.of(&#34;my_job&#34;, &#34;load&#34;))
 *             .load(JobLoad.builder()
 *                 .sourceUris(&#34;gs://cloud-samples-data/bigquery/us-states/us-states-by-date.csv&#34;)
 *                 .destinationTable(JobLoadDestinationTable.builder()
 *                     .projectId(foo.getProject())
 *                     .datasetId(foo.getDatasetId())
 *                     .tableId(foo.getTableId())
 *                     .build())
 *                 .skipLeadingRows(1)
 *                 .schemaUpdateOptions(                
 *                     &#34;ALLOW_FIELD_RELAXATION&#34;,
 *                     &#34;ALLOW_FIELD_ADDITION&#34;)
 *                 .writeDisposition(&#34;WRITE_APPEND&#34;)
 *                 .autodetect(true)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Bigquery Job Extract
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var source_oneDataset = new Dataset(&#34;source-oneDataset&#34;, DatasetArgs.builder()        
 *             .datasetId(&#34;job_extract_dataset&#34;)
 *             .friendlyName(&#34;test&#34;)
 *             .description(&#34;This is a test description&#34;)
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var source_oneTable = new Table(&#34;source-oneTable&#34;, TableArgs.builder()        
 *             .deletionProtection(false)
 *             .datasetId(source_oneDataset.getDatasetId())
 *             .tableId(&#34;job_extract_table&#34;)
 *             .schema(&#34;&#34;&#34;
 * [
 *   {
 *     &#34;name&#34;: &#34;name&#34;,
 *     &#34;type&#34;: &#34;STRING&#34;,
 *     &#34;mode&#34;: &#34;NULLABLE&#34;
 *   },
 *   {
 *     &#34;name&#34;: &#34;post_abbr&#34;,
 *     &#34;type&#34;: &#34;STRING&#34;,
 *     &#34;mode&#34;: &#34;NULLABLE&#34;
 *   },
 *   {
 *     &#34;name&#34;: &#34;date&#34;,
 *     &#34;type&#34;: &#34;DATE&#34;,
 *     &#34;mode&#34;: &#34;NULLABLE&#34;
 *   }
 * ]
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var dest = new Bucket(&#34;dest&#34;, BucketArgs.builder()        
 *             .location(&#34;US&#34;)
 *             .forceDestroy(true)
 *             .build());
 * 
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .jobId(&#34;job_extract&#34;)
 *             .extract(JobExtract.builder()
 *                 .destinationUris(dest.getUrl().apply(url -&gt; String.format(&#34;%s/extract&#34;, url)))
 *                 .sourceTable(JobExtractSourceTable.builder()
 *                     .projectId(source_oneTable.getProject())
 *                     .datasetId(source_oneTable.getDatasetId())
 *                     .tableId(source_oneTable.getTableId())
 *                     .build())
 *                 .destinationFormat(&#34;NEWLINE_DELIMITED_JSON&#34;)
 *                 .compression(&#34;GZIP&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Job can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/job:Job default projects/{{project}}/jobs/{{job_id}}/location/{{location}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/job:Job default projects/{{project}}/jobs/{{job_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/job:Job default {{project}}/{{job_id}}/{{location}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/job:Job default {{job_id}}/{{location}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/job:Job default {{project}}/{{job_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/job:Job default {{job_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/job:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * Copies a table.
     * Structure is documented below.
     * 
     */
    @Export(name="copy", type=JobCopy.class, parameters={})
    private Output</* @Nullable */ JobCopy> copy;

    /**
     * @return Copies a table.
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobCopy>> copy() {
        return Codegen.optional(this.copy);
    }
    /**
     * Configures an extract job.
     * Structure is documented below.
     * 
     */
    @Export(name="extract", type=JobExtract.class, parameters={})
    private Output</* @Nullable */ JobExtract> extract;

    /**
     * @return Configures an extract job.
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobExtract>> extract() {
        return Codegen.optional(this.extract);
    }
    /**
     * The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    @Export(name="jobTimeoutMs", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobTimeoutMs;

    /**
     * @return Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    public Output<Optional<String>> jobTimeoutMs() {
        return Codegen.optional(this.jobTimeoutMs);
    }
    /**
     * The type of the job.
     * 
     */
    @Export(name="jobType", type=String.class, parameters={})
    private Output<String> jobType;

    /**
     * @return The type of the job.
     * 
     */
    public Output<String> jobType() {
        return this.jobType;
    }
    /**
     * The labels associated with this job. You can use these to organize and group your jobs.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels associated with this job. You can use these to organize and group your jobs.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Configures a load job.
     * Structure is documented below.
     * 
     */
    @Export(name="load", type=JobLoad.class, parameters={})
    private Output</* @Nullable */ JobLoad> load;

    /**
     * @return Configures a load job.
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobLoad>> load() {
        return Codegen.optional(this.load);
    }
    /**
     * The geographic location of the job. The default value is US.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geographic location of the job. The default value is US.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Configures a query job.
     * Structure is documented below.
     * 
     */
    @Export(name="query", type=JobQuery.class, parameters={})
    private Output</* @Nullable */ JobQuery> query;

    /**
     * @return Configures a query job.
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobQuery>> query() {
        return Codegen.optional(this.query);
    }
    /**
     * The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={JobStatus.class})
    private Output<List<JobStatus>> statuses;

    /**
     * @return The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    public Output<List<JobStatus>> statuses() {
        return this.statuses;
    }
    /**
     * Email address of the user who ran the job.
     * 
     */
    @Export(name="userEmail", type=String.class, parameters={})
    private Output<String> userEmail;

    /**
     * @return Email address of the user who ran the job.
     * 
     */
    public Output<String> userEmail() {
        return this.userEmail;
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
        super("gcp:bigquery/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/job:Job", name, state, makeResourceOptions(options, id));
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
