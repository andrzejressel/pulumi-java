// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.healthcare.DicomStoreArgs;
import com.pulumi.gcp.healthcare.inputs.DicomStoreState;
import com.pulumi.gcp.healthcare.outputs.DicomStoreNotificationConfig;
import com.pulumi.gcp.healthcare.outputs.DicomStoreStreamConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A DicomStore is a datastore inside a Healthcare dataset that conforms to the DICOM
 * (https://www.dicomstandard.org/about/) standard for Healthcare information exchange
 * 
 * To get more information about DicomStore, see:
 * 
 * * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.dicomStores)
 * * How-to Guides
 *     * [Creating a DICOM store](https://cloud.google.com/healthcare/docs/how-tos/dicom)
 * 
 * ## Example Usage
 * ### Healthcare Dicom Store Basic
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
 *         var topic = new Topic(&#34;topic&#34;);
 * 
 *         var dataset = new Dataset(&#34;dataset&#34;, DatasetArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var default_ = new DicomStore(&#34;default&#34;, DicomStoreArgs.builder()        
 *             .dataset(dataset.getId())
 *             .notificationConfig(DicomStoreNotificationConfig.builder()
 *                 .pubsubTopic(topic.getId())
 *                 .build())
 *             .labels(Map.of(&#34;label1&#34;, &#34;labelvalue1&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Healthcare Dicom Store Bq Stream
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
 *         var topic = new Topic(&#34;topic&#34;);
 * 
 *         var dataset = new Dataset(&#34;dataset&#34;, DatasetArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var bqDataset = new Dataset(&#34;bqDataset&#34;, DatasetArgs.builder()        
 *             .datasetId(&#34;dicom_bq_ds&#34;)
 *             .friendlyName(&#34;test&#34;)
 *             .description(&#34;This is a test description&#34;)
 *             .location(&#34;US&#34;)
 *             .deleteContentsOnDestroy(true)
 *             .build());
 * 
 *         var bqTable = new Table(&#34;bqTable&#34;, TableArgs.builder()        
 *             .deletionProtection(false)
 *             .datasetId(bqDataset.getDatasetId())
 *             .tableId(&#34;dicom_bq_tb&#34;)
 *             .build());
 * 
 *         var default_ = new DicomStore(&#34;default&#34;, DicomStoreArgs.builder()        
 *             .dataset(dataset.getId())
 *             .notificationConfig(DicomStoreNotificationConfig.builder()
 *                 .pubsubTopic(topic.getId())
 *                 .build())
 *             .labels(Map.of(&#34;label1&#34;, &#34;labelvalue1&#34;))
 *             .streamConfigs(DicomStoreStreamConfig.builder()
 *                 .bigqueryDestination(DicomStoreStreamConfigBigqueryDestination.builder()
 *                     .tableUri(Output.tuple(bqDataset.getProject(), bqDataset.getDatasetId(), bqTable.getTableId()).apply(values -&gt; {
 *                         var project = values.t1;
 *                         var datasetId = values.t2;
 *                         var tableId = values.t3;
 *                         return String.format(&#34;bq://%s.%s.%s&#34;, project,datasetId,tableId);
 *                     }))
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * DicomStore can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStore:DicomStore default {{dataset}}/dicomStores/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStore:DicomStore default {{dataset}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/dicomStore:DicomStore")
public class DicomStore extends com.pulumi.resources.CustomResource {
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    @Export(name="dataset", type=String.class, parameters={})
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }
    /**
     * User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="notificationConfig", type=DicomStoreNotificationConfig.class, parameters={})
    private Output</* @Nullable */ DicomStoreNotificationConfig> notificationConfig;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output<Optional<DicomStoreNotificationConfig>> notificationConfig() {
        return Codegen.optional(this.notificationConfig);
    }
    /**
     * The fully qualified name of this dataset
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The fully qualified name of this dataset
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    @Export(name="streamConfigs", type=List.class, parameters={DicomStoreStreamConfig.class})
    private Output</* @Nullable */ List<DicomStoreStreamConfig>> streamConfigs;

    /**
     * @return To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<DicomStoreStreamConfig>>> streamConfigs() {
        return Codegen.optional(this.streamConfigs);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DicomStore(String name) {
        this(name, DicomStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DicomStore(String name, DicomStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DicomStore(String name, DicomStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStore:DicomStore", name, args == null ? DicomStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DicomStore(String name, Output<String> id, @Nullable DicomStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStore:DicomStore", name, state, makeResourceOptions(options, id));
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
    public static DicomStore get(String name, Output<String> id, @Nullable DicomStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DicomStore(name, id, state, options);
    }
}
