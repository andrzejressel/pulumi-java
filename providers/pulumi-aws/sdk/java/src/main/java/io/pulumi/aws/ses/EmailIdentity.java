// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.EmailIdentityArgs;
import io.pulumi.aws.ses.inputs.EmailIdentityState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SES email identity resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES email identities can be imported using the email address.
 * 
 * ```sh
 *  $ pulumi import aws:ses/emailIdentity:EmailIdentity example email@example.com
 * ```
 * 
 */
@ResourceType(type="aws:ses/emailIdentity:EmailIdentity")
public class EmailIdentity extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the email identity.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the email identity.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The email address to assign to SES
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address to assign to SES
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }

    public interface BuilderApplicator {
        public void apply(EmailIdentityArgs.Builder a);
    }
    private static io.pulumi.aws.ses.EmailIdentityArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ses.EmailIdentityArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EmailIdentity(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailIdentity(String name) {
        this(name, EmailIdentityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailIdentity(String name, EmailIdentityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailIdentity(String name, EmailIdentityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/emailIdentity:EmailIdentity", name, args == null ? EmailIdentityArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EmailIdentity(String name, Output<String> id, @Nullable EmailIdentityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/emailIdentity:EmailIdentity", name, state, makeResourceOptions(options, id));
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
    public static EmailIdentity get(String name, Output<String> id, @Nullable EmailIdentityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EmailIdentity(name, id, state, options);
    }
}
