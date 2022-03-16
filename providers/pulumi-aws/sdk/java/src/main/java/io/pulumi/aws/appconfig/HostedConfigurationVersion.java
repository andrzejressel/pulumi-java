// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appconfig.HostedConfigurationVersionArgs;
import io.pulumi.aws.appconfig.inputs.HostedConfigurationVersionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AppConfig Hosted Configuration Version resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AppConfig Hosted Configuration Versions can be imported by using the application ID, configuration profile ID, and version number separated by a slash (`/`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion example 71abcde/11xxxxx/2
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion")
public class HostedConfigurationVersion extends io.pulumi.resources.CustomResource {
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
     * The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The configuration profile ID.
     * 
     */
    @Export(name="configurationProfileId", type=String.class, parameters={})
    private Output<String> configurationProfileId;

    /**
     * @return The configuration profile ID.
     * 
     */
    public Output<String> getConfigurationProfileId() {
        return this.configurationProfileId;
    }
    /**
     * The content of the configuration or the configuration data.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return The content of the configuration or the configuration data.
     * 
     */
    public Output<String> getContent() {
        return this.content;
    }
    /**
     * A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
     * 
     */
    public Output<String> getContentType() {
        return this.contentType;
    }
    /**
     * A description of the configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the configuration.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The version number of the hosted configuration.
     * 
     */
    @Export(name="versionNumber", type=Integer.class, parameters={})
    private Output<Integer> versionNumber;

    /**
     * @return The version number of the hosted configuration.
     * 
     */
    public Output<Integer> getVersionNumber() {
        return this.versionNumber;
    }

    public interface BuilderApplicator {
        public void apply(HostedConfigurationVersionArgs.Builder a);
    }
    private static io.pulumi.aws.appconfig.HostedConfigurationVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appconfig.HostedConfigurationVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HostedConfigurationVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedConfigurationVersion(String name) {
        this(name, HostedConfigurationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedConfigurationVersion(String name, HostedConfigurationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedConfigurationVersion(String name, HostedConfigurationVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, args == null ? HostedConfigurationVersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HostedConfigurationVersion(String name, Output<String> id, @Nullable HostedConfigurationVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, state, makeResourceOptions(options, id));
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
    public static HostedConfigurationVersion get(String name, Output<String> id, @Nullable HostedConfigurationVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HostedConfigurationVersion(name, id, state, options);
    }
}
