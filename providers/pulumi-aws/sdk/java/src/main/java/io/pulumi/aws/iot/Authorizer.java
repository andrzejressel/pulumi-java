// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iot.AuthorizerArgs;
import io.pulumi.aws.iot.inputs.AuthorizerState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS IoT Authorizer.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IOT Authorizers can be imported using the name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iot/authorizer:Authorizer example example
 * ```
 * 
 */
@ResourceType(type="aws:iot/authorizer:Authorizer")
public class Authorizer extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the authorizer.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the authorizer.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ARN of the authorizer's Lambda function.
     * 
     */
    @Export(name="authorizerFunctionArn", type=String.class, parameters={})
    private Output<String> authorizerFunctionArn;

    /**
     * @return The ARN of the authorizer's Lambda function.
     * 
     */
    public Output<String> getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }
    /**
     * The name of the authorizer.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the authorizer.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
     * 
     */
    @Export(name="signingDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> signingDisabled;

    /**
     * @return Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getSigningDisabled() {
        return this.signingDisabled;
    }
    /**
     * The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
     * 
     */
    @Export(name="tokenKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenKeyName;

    /**
     * @return The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
     * 
     */
    public Output</* @Nullable */ String> getTokenKeyName() {
        return this.tokenKeyName;
    }
    /**
     * The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
     * 
     */
    @Export(name="tokenSigningPublicKeys", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tokenSigningPublicKeys;

    /**
     * @return The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTokenSigningPublicKeys() {
        return this.tokenSigningPublicKeys;
    }

    public interface BuilderApplicator {
        public void apply(AuthorizerArgs.Builder a);
    }
    private static io.pulumi.aws.iot.AuthorizerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iot.AuthorizerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Authorizer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authorizer(String name) {
        this(name, AuthorizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authorizer(String name, AuthorizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authorizer(String name, AuthorizerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/authorizer:Authorizer", name, args == null ? AuthorizerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Authorizer(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/authorizer:Authorizer", name, state, makeResourceOptions(options, id));
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
    public static Authorizer get(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Authorizer(name, id, state, options);
    }
}
