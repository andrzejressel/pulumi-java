// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.securityhub.StandardsSubscriptionArgs;
import io.pulumi.aws.securityhub.inputs.StandardsSubscriptionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Subscribes to a Security Hub standard.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Security Hub standards subscriptions can be imported using the standards subscription ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/standardsSubscription:StandardsSubscription cis arn:aws:securityhub:eu-west-1:123456789012:subscription/cis-aws-foundations-benchmark/v/1.2.0
 * ```
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/standardsSubscription:StandardsSubscription pci_321 arn:aws:securityhub:eu-west-1:123456789012:subscription/pci-dss/v/3.2.1
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/standardsSubscription:StandardsSubscription")
public class StandardsSubscription extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of a standard - see below.
     * 
     */
    @Export(name="standardsArn", type=String.class, parameters={})
    private Output<String> standardsArn;

    /**
     * @return The ARN of a standard - see below.
     * 
     */
    public Output<String> getStandardsArn() {
        return this.standardsArn;
    }

    public interface BuilderApplicator {
        public void apply(StandardsSubscriptionArgs.Builder a);
    }
    private static io.pulumi.aws.securityhub.StandardsSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.securityhub.StandardsSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StandardsSubscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StandardsSubscription(String name) {
        this(name, StandardsSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StandardsSubscription(String name, StandardsSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StandardsSubscription(String name, StandardsSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/standardsSubscription:StandardsSubscription", name, args == null ? StandardsSubscriptionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private StandardsSubscription(String name, Output<String> id, @Nullable StandardsSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/standardsSubscription:StandardsSubscription", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static StandardsSubscription get(String name, Output<String> id, @Nullable StandardsSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StandardsSubscription(name, id, state, options);
    }
}
