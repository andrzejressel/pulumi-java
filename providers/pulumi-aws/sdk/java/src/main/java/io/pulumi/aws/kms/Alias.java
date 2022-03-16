// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kms.AliasArgs;
import io.pulumi.aws.kms.inputs.AliasState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an alias for a KMS customer master key. AWS Console enforces 1-to-1 mapping between aliases & keys,
 * but API (hence this provider too) allows you to create as many aliases as
 * the [account limits](http://docs.aws.amazon.com/kms/latest/developerguide/limits.html) allow you.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * KMS aliases can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kms/alias:Alias a alias/my-key-alias
 * ```
 * 
 */
@ResourceType(type="aws:kms/alias:Alias")
public class Alias extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the key alias.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the key alias.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates an unique alias beginning with the specified prefix.
     * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates an unique alias beginning with the specified prefix.
     * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The Amazon Resource Name (ARN) of the target key identifier.
     * 
     */
    @Export(name="targetKeyArn", type=String.class, parameters={})
    private Output<String> targetKeyArn;

    /**
     * @return The Amazon Resource Name (ARN) of the target key identifier.
     * 
     */
    public Output<String> getTargetKeyArn() {
        return this.targetKeyArn;
    }
    /**
     * Identifier for the key for which the alias is for, can be either an ARN or key_id.
     * 
     */
    @Export(name="targetKeyId", type=String.class, parameters={})
    private Output<String> targetKeyId;

    /**
     * @return Identifier for the key for which the alias is for, can be either an ARN or key_id.
     * 
     */
    public Output<String> getTargetKeyId() {
        return this.targetKeyId;
    }

    public interface BuilderApplicator {
        public void apply(AliasArgs.Builder a);
    }
    private static io.pulumi.aws.kms.AliasArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.kms.AliasArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Alias(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/alias:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Alias(String name, Output<String> id, @Nullable AliasState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/alias:Alias", name, state, makeResourceOptions(options, id));
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
    public static Alias get(String name, Output<String> id, @Nullable AliasState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, state, options);
    }
}
