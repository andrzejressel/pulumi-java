// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.logging.BillingAccountSinkArgs;
import io.pulumi.gcp.logging.inputs.BillingAccountSinkState;
import io.pulumi.gcp.logging.outputs.BillingAccountSinkBigqueryOptions;
import io.pulumi.gcp.logging.outputs.BillingAccountSinkExclusion;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.sinks)
 * * How-to Guides
 *     * [Exporting Logs](https://cloud.google.com/logging/docs/export)
 * 
 * > **Note** You must have the "Logs Configuration Writer" IAM role (`roles/logging.configWriter`)
 * [granted on the billing account](https://cloud.google.com/billing/reference/rest/v1/billingAccounts/getIamPolicy) to
 * the credentials used with this provider. [IAM roles granted on a billing account](https://cloud.google.com/billing/docs/how-to/billing-access) are separate from the
 * typical IAM roles granted on a project.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Billing account logging sinks can be imported using this format
 * 
 * ```sh
 *  $ pulumi import gcp:logging/billingAccountSink:BillingAccountSink my_sink billingAccounts/{{billing_account_id}}/sinks/{{sink_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:logging/billingAccountSink:BillingAccountSink")
public class BillingAccountSink extends io.pulumi.resources.CustomResource {
    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @OutputExport(name="bigqueryOptions", type=BillingAccountSinkBigqueryOptions.class, parameters={})
    private Output<BillingAccountSinkBigqueryOptions> bigqueryOptions;

    /**
     * @return Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    public Output<BillingAccountSinkBigqueryOptions> getBigqueryOptions() {
        return this.bigqueryOptions;
    }
    /**
     * The billing account exported to the sink.
     * 
     */
    @OutputExport(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    /**
     * @return The billing account exported to the sink.
     * 
     */
    public Output<String> getBillingAccount() {
        return this.billingAccount;
    }
    /**
     * A description of this exclusion.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this exclusion.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    @OutputExport(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    public Output<String> getDestination() {
        return this.destination;
    }
    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    @OutputExport(name="exclusions", type=List.class, parameters={BillingAccountSinkExclusion.class})
    private Output</* @Nullable */ List<BillingAccountSinkExclusion>> exclusions;

    /**
     * @return Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<BillingAccountSinkExclusion>> getExclusions() {
        return this.exclusions;
    }
    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @OutputExport(name="filter", type=String.class, parameters={})
    private Output</* @Nullable */ String> filter;

    /**
     * @return An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    public Output</* @Nullable */ String> getFilter() {
        return this.filter;
    }
    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    @OutputExport(name="writerIdentity", type=String.class, parameters={})
    private Output<String> writerIdentity;

    /**
     * @return The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    public Output<String> getWriterIdentity() {
        return this.writerIdentity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingAccountSink(String name, BillingAccountSinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/billingAccountSink:BillingAccountSink", name, args == null ? BillingAccountSinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BillingAccountSink(String name, Input<String> id, @Nullable BillingAccountSinkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/billingAccountSink:BillingAccountSink", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BillingAccountSink get(String name, Input<String> id, @Nullable BillingAccountSinkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BillingAccountSink(name, id, state, options);
    }
}
