// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.NotificationArgs;
import com.pulumi.gcp.storage.inputs.NotificationState;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new notification configuration on a specified bucket, establishing a flow of event notifications from GCS to a Cloud Pub/Sub topic.
 *  For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/pubsub-notifications)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/notifications).
 * 
 * In order to enable notifications, a special Google Cloud Storage service account unique to the project
 * must exist and have the IAM permission &#34;projects.topics.publish&#34; for a Cloud Pub/Sub topic in the project.
 * This service account is not created automatically when a project is created.
 * To ensure the service account exists and obtain its email address for use in granting the correct IAM permission, use the
 * [`gcp.storage.getProjectServiceAccount`](https://www.terraform.io/docs/providers/google/d/storage_project_service_account.html)
 * datasource&#39;s `email_address` value, and see below for an example of enabling notifications by granting the correct IAM permission.
 * See [the notifications documentation](https://cloud.google.com/storage/docs/gsutil/commands/notification) for more details.
 * 
 * &gt; **NOTE**: This resource can affect your storage IAM policy. If you are using this in the same config as your storage IAM policy resources, consider
 * making this resource dependent on those IAM resources via `depends_on`. This will safeguard against errors due to IAM race conditions.
 * 
 * ## Example Usage
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
 *         final var gcsAccount = Output.of(StorageFunctions.getProjectServiceAccount());
 * 
 *         var topic = new Topic(&#34;topic&#34;);
 * 
 *         var binding = new TopicIAMBinding(&#34;binding&#34;, TopicIAMBindingArgs.builder()        
 *             .topic(topic.getId())
 *             .role(&#34;roles/pubsub.publisher&#34;)
 *             .members(String.format(&#34;serviceAccount:%s&#34;, gcsAccount.apply(getProjectServiceAccountResult -&gt; getProjectServiceAccountResult.getEmailAddress())))
 *             .build());
 * 
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var notification = new Notification(&#34;notification&#34;, NotificationArgs.builder()        
 *             .bucket(bucket.getName())
 *             .payloadFormat(&#34;JSON_API_V1&#34;)
 *             .topic(topic.getId())
 *             .eventTypes(            
 *                 &#34;OBJECT_FINALIZE&#34;,
 *                 &#34;OBJECT_METADATA_UPDATE&#34;)
 *             .customAttributes(Map.of(&#34;new-attribute&#34;, &#34;new-attribute-value&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Storage notifications can be imported using the notification `id` in the format `&lt;bucket_name&gt;/notificationConfigs/&lt;id&gt;` e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:storage/notification:Notification notification default_bucket/notificationConfigs/102
 * ```
 * 
 */
@ResourceType(type="gcp:storage/notification:Notification")
public class Notification extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * A set of key/value attribute pairs to attach to each Cloud PubSub message published for this notification subscription
     * 
     */
    @Export(name="customAttributes", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> customAttributes;

    /**
     * @return A set of key/value attribute pairs to attach to each Cloud PubSub message published for this notification subscription
     * 
     */
    public Output<Optional<Map<String,String>>> customAttributes() {
        return Codegen.optional(this.customAttributes);
    }
    /**
     * List of event type filters for this notification config. If not specified, Cloud Storage will send notifications for all event types. The valid types are: `&#34;OBJECT_FINALIZE&#34;`, `&#34;OBJECT_METADATA_UPDATE&#34;`, `&#34;OBJECT_DELETE&#34;`, `&#34;OBJECT_ARCHIVE&#34;`
     * 
     */
    @Export(name="eventTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventTypes;

    /**
     * @return List of event type filters for this notification config. If not specified, Cloud Storage will send notifications for all event types. The valid types are: `&#34;OBJECT_FINALIZE&#34;`, `&#34;OBJECT_METADATA_UPDATE&#34;`, `&#34;OBJECT_DELETE&#34;`, `&#34;OBJECT_ARCHIVE&#34;`
     * 
     */
    public Output<Optional<List<String>>> eventTypes() {
        return Codegen.optional(this.eventTypes);
    }
    /**
     * The ID of the created notification.
     * 
     */
    @Export(name="notificationId", type=String.class, parameters={})
    private Output<String> notificationId;

    /**
     * @return The ID of the created notification.
     * 
     */
    public Output<String> notificationId() {
        return this.notificationId;
    }
    /**
     * Specifies a prefix path filter for this notification config. Cloud Storage will only send notifications for objects in this bucket whose names begin with the specified prefix.
     * 
     */
    @Export(name="objectNamePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> objectNamePrefix;

    /**
     * @return Specifies a prefix path filter for this notification config. Cloud Storage will only send notifications for objects in this bucket whose names begin with the specified prefix.
     * 
     */
    public Output<Optional<String>> objectNamePrefix() {
        return Codegen.optional(this.objectNamePrefix);
    }
    /**
     * The desired content of the Payload. One of `&#34;JSON_API_V1&#34;` or `&#34;NONE&#34;`.
     * 
     */
    @Export(name="payloadFormat", type=String.class, parameters={})
    private Output<String> payloadFormat;

    /**
     * @return The desired content of the Payload. One of `&#34;JSON_API_V1&#34;` or `&#34;NONE&#34;`.
     * 
     */
    public Output<String> payloadFormat() {
        return this.payloadFormat;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The Cloud PubSub topic to which this subscription publishes. Expects either the
     * topic name, assumed to belong to the default GCP provider project, or the project-level name,
     * i.e. `projects/my-gcp-project/topics/my-topic` or `my-topic`. If the project is not set in the provider,
     * you will need to use the project-level name.
     * 
     */
    @Export(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return The Cloud PubSub topic to which this subscription publishes. Expects either the
     * topic name, assumed to belong to the default GCP provider project, or the project-level name,
     * i.e. `projects/my-gcp-project/topics/my-topic` or `my-topic`. If the project is not set in the provider,
     * you will need to use the project-level name.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Notification(String name) {
        this(name, NotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Notification(String name, NotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Notification(String name, NotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/notification:Notification", name, args == null ? NotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Notification(String name, Output<String> id, @Nullable NotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/notification:Notification", name, state, makeResourceOptions(options, id));
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
    public static Notification get(String name, Output<String> id, @Nullable NotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Notification(name, id, state, options);
    }
}
