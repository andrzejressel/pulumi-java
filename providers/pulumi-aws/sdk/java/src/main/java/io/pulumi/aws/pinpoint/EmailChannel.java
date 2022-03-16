// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.pinpoint.EmailChannelArgs;
import io.pulumi.aws.pinpoint.inputs.EmailChannelState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Pinpoint Email Channel resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Pinpoint Email Channel can be imported using the `application-id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:pinpoint/emailChannel:EmailChannel email application-id
 * ```
 * 
 */
@ResourceType(type="aws:pinpoint/emailChannel:EmailChannel")
public class EmailChannel extends io.pulumi.resources.CustomResource {
    /**
     * The application ID.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> getApplicationId() {
        return this.applicationId;
    }
    /**
     * The ARN of the Amazon SES configuration set that you want to apply to messages that you send through the channel.
     * 
     */
    @Export(name="configurationSet", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationSet;

    /**
     * @return The ARN of the Amazon SES configuration set that you want to apply to messages that you send through the channel.
     * 
     */
    public Output</* @Nullable */ String> getConfigurationSet() {
        return this.configurationSet;
    }
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The email address used to send emails from. You can use email only (`user@example.com`) or friendly address (`User <user@example.com>`). This field comply with [RFC 5322](https://www.ietf.org/rfc/rfc5322.txt).
     * 
     */
    @Export(name="fromAddress", type=String.class, parameters={})
    private Output<String> fromAddress;

    /**
     * @return The email address used to send emails from. You can use email only (`user@example.com`) or friendly address (`User <user@example.com>`). This field comply with [RFC 5322](https://www.ietf.org/rfc/rfc5322.txt).
     * 
     */
    public Output<String> getFromAddress() {
        return this.fromAddress;
    }
    /**
     * The ARN of an identity verified with SES.
     * 
     */
    @Export(name="identity", type=String.class, parameters={})
    private Output<String> identity;

    /**
     * @return The ARN of an identity verified with SES.
     * 
     */
    public Output<String> getIdentity() {
        return this.identity;
    }
    /**
     * Messages per second that can be sent.
     * 
     */
    @Export(name="messagesPerSecond", type=Integer.class, parameters={})
    private Output<Integer> messagesPerSecond;

    /**
     * @return Messages per second that can be sent.
     * 
     */
    public Output<Integer> getMessagesPerSecond() {
        return this.messagesPerSecond;
    }
    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
     * 
     */
    public Output</* @Nullable */ String> getRoleArn() {
        return this.roleArn;
    }

    public interface BuilderApplicator {
        public void apply(EmailChannelArgs.Builder a);
    }
    private static io.pulumi.aws.pinpoint.EmailChannelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.pinpoint.EmailChannelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EmailChannel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailChannel(String name) {
        this(name, EmailChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailChannel(String name, EmailChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailChannel(String name, EmailChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/emailChannel:EmailChannel", name, args == null ? EmailChannelArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EmailChannel(String name, Output<String> id, @Nullable EmailChannelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/emailChannel:EmailChannel", name, state, makeResourceOptions(options, id));
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
    public static EmailChannel get(String name, Output<String> id, @Nullable EmailChannelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EmailChannel(name, id, state, options);
    }
}
