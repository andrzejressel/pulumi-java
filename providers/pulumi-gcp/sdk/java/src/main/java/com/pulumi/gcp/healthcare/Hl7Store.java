// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.healthcare.Hl7StoreArgs;
import com.pulumi.gcp.healthcare.inputs.Hl7StoreState;
import com.pulumi.gcp.healthcare.outputs.Hl7StoreNotificationConfig;
import com.pulumi.gcp.healthcare.outputs.Hl7StoreNotificationConfigs;
import com.pulumi.gcp.healthcare.outputs.Hl7StoreParserConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Hl7V2Store is a datastore inside a Healthcare dataset that conforms to the FHIR (https://www.hl7.org/hl7V2/STU3/)
 * standard for Healthcare information exchange
 * 
 * To get more information about Hl7V2Store, see:
 * 
 * * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.hl7V2Stores)
 * * How-to Guides
 *     * [Creating a HL7v2 Store](https://cloud.google.com/healthcare/docs/how-tos/hl7v2)
 * 
 * ## Example Usage
 * ### Healthcare Hl7 V2 Store Basic
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
 *         var store = new Hl7Store(&#34;store&#34;, Hl7StoreArgs.builder()        
 *             .dataset(dataset.getId())
 *             .notificationConfigs(Hl7StoreNotificationConfigs.builder()
 *                 .pubsubTopic(topic.getId())
 *                 .build())
 *             .labels(Map.of(&#34;label1&#34;, &#34;labelvalue1&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Healthcare Hl7 V2 Store Parser Config
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
 *         var dataset = new Dataset(&#34;dataset&#34;, DatasetArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var store = new Hl7Store(&#34;store&#34;, Hl7StoreArgs.builder()        
 *             .dataset(dataset.getId())
 *             .parserConfig(Hl7StoreParserConfig.builder()
 *                 .allowNullHeader(false)
 *                 .segmentTerminator(&#34;Jw==&#34;)
 *                 .schema(&#34;&#34;&#34;
 * {
 *   &#34;schemas&#34;: [{
 *     &#34;messageSchemaConfigs&#34;: {
 *       &#34;ADT_A01&#34;: {
 *         &#34;name&#34;: &#34;ADT_A01&#34;,
 *         &#34;minOccurs&#34;: 1,
 *         &#34;maxOccurs&#34;: 1,
 *         &#34;members&#34;: [{
 *             &#34;segment&#34;: {
 *               &#34;type&#34;: &#34;MSH&#34;,
 *               &#34;minOccurs&#34;: 1,
 *               &#34;maxOccurs&#34;: 1
 *             }
 *           },
 *           {
 *             &#34;segment&#34;: {
 *               &#34;type&#34;: &#34;EVN&#34;,
 *               &#34;minOccurs&#34;: 1,
 *               &#34;maxOccurs&#34;: 1
 *             }
 *           },
 *           {
 *             &#34;segment&#34;: {
 *               &#34;type&#34;: &#34;PID&#34;,
 *               &#34;minOccurs&#34;: 1,
 *               &#34;maxOccurs&#34;: 1
 *             }
 *           },
 *           {
 *             &#34;segment&#34;: {
 *               &#34;type&#34;: &#34;ZPD&#34;,
 *               &#34;minOccurs&#34;: 1,
 *               &#34;maxOccurs&#34;: 1
 *             }
 *           },
 *           {
 *             &#34;segment&#34;: {
 *               &#34;type&#34;: &#34;OBX&#34;
 *             }
 *           },
 *           {
 *             &#34;group&#34;: {
 *               &#34;name&#34;: &#34;PROCEDURE&#34;,
 *               &#34;members&#34;: [{
 *                   &#34;segment&#34;: {
 *                     &#34;type&#34;: &#34;PR1&#34;,
 *                     &#34;minOccurs&#34;: 1,
 *                     &#34;maxOccurs&#34;: 1
 *                   }
 *                 },
 *                 {
 *                   &#34;segment&#34;: {
 *                     &#34;type&#34;: &#34;ROL&#34;
 *                   }
 *                 }
 *               ]
 *             }
 *           },
 *           {
 *             &#34;segment&#34;: {
 *               &#34;type&#34;: &#34;PDA&#34;,
 *               &#34;maxOccurs&#34;: 1
 *             }
 *           }
 *         ]
 *       }
 *     }
 *   }],
 *   &#34;types&#34;: [{
 *     &#34;type&#34;: [{
 *         &#34;name&#34;: &#34;ZPD&#34;,
 *         &#34;primitive&#34;: &#34;VARIES&#34;
 *       }
 * 
 *     ]
 *   }],
 *   &#34;ignoreMinOccurs&#34;: true
 * }
 *                 &#34;&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Healthcare Hl7 V2 Store Unschematized
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
 *         var dataset = new Dataset(&#34;dataset&#34;, DatasetArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var store = new Hl7Store(&#34;store&#34;, Hl7StoreArgs.builder()        
 *             .dataset(dataset.getId())
 *             .parserConfig(Hl7StoreParserConfig.builder()
 *                 .allowNullHeader(false)
 *                 .segmentTerminator(&#34;Jw==&#34;)
 *                 .version(&#34;V2&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Hl7V2Store can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7Store:Hl7Store default {{dataset}}/hl7V2Stores/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7Store:Hl7Store default {{dataset}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/hl7Store:Hl7Store")
public class Hl7Store extends com.pulumi.resources.CustomResource {
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
     * User-supplied key-value pairs used to organize HL7v2 stores.
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
     * @return User-supplied key-value pairs used to organize HL7v2 stores.
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
     * The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * - 
     * (Optional, Deprecated)
     * A nested object resource
     * Structure is documented below.
     * 
     * @deprecated
     * This field has been replaced by notificationConfigs
     * 
     */
    @Deprecated /* This field has been replaced by notificationConfigs */
    @Export(name="notificationConfig", type=Hl7StoreNotificationConfig.class, parameters={})
    private Output</* @Nullable */ Hl7StoreNotificationConfig> notificationConfig;

    /**
     * @return -
     * (Optional, Deprecated)
     * A nested object resource
     * Structure is documented below.
     * 
     */
    public Output<Optional<Hl7StoreNotificationConfig>> notificationConfig() {
        return Codegen.optional(this.notificationConfig);
    }
    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    @Export(name="notificationConfigs", type=List.class, parameters={Hl7StoreNotificationConfigs.class})
    private Output</* @Nullable */ List<Hl7StoreNotificationConfigs>> notificationConfigs;

    /**
     * @return A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<Hl7StoreNotificationConfigs>>> notificationConfigs() {
        return Codegen.optional(this.notificationConfigs);
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="parserConfig", type=Hl7StoreParserConfig.class, parameters={})
    private Output<Hl7StoreParserConfig> parserConfig;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output<Hl7StoreParserConfig> parserConfig() {
        return this.parserConfig;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hl7Store(String name) {
        this(name, Hl7StoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hl7Store(String name, Hl7StoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hl7Store(String name, Hl7StoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/hl7Store:Hl7Store", name, args == null ? Hl7StoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Hl7Store(String name, Output<String> id, @Nullable Hl7StoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/hl7Store:Hl7Store", name, state, makeResourceOptions(options, id));
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
    public static Hl7Store get(String name, Output<String> id, @Nullable Hl7StoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Hl7Store(name, id, state, options);
    }
}
