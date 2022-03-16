// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.ActiveReceiptRuleSetArgs;
import io.pulumi.aws.ses.inputs.ActiveReceiptRuleSetState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to designate the active SES receipt rule set
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet")
public class ActiveReceiptRuleSet extends io.pulumi.resources.CustomResource {
    /**
     * The SES receipt rule set ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The SES receipt rule set ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the rule set
     * 
     */
    @Export(name="ruleSetName", type=String.class, parameters={})
    private Output<String> ruleSetName;

    /**
     * @return The name of the rule set
     * 
     */
    public Output<String> getRuleSetName() {
        return this.ruleSetName;
    }

    public interface BuilderApplicator {
        public void apply(ActiveReceiptRuleSetArgs.Builder a);
    }
    private static io.pulumi.aws.ses.ActiveReceiptRuleSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ses.ActiveReceiptRuleSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ActiveReceiptRuleSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActiveReceiptRuleSet(String name) {
        this(name, ActiveReceiptRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActiveReceiptRuleSet(String name, ActiveReceiptRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActiveReceiptRuleSet(String name, ActiveReceiptRuleSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet", name, args == null ? ActiveReceiptRuleSetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ActiveReceiptRuleSet(String name, Output<String> id, @Nullable ActiveReceiptRuleSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet", name, state, makeResourceOptions(options, id));
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
    public static ActiveReceiptRuleSet get(String name, Output<String> id, @Nullable ActiveReceiptRuleSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ActiveReceiptRuleSet(name, id, state, options);
    }
}
