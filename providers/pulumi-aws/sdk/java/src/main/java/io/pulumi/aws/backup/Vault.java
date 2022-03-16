// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.VaultArgs;
import io.pulumi.aws.backup.inputs.VaultState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Backup vault resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Backup vault can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:backup/vault:Vault test-vault TestVault
 * ```
 * 
 */
@ResourceType(type="aws:backup/vault:Vault")
public class Vault extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the vault.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The server-side encryption key that is used to protect your backups.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output<String> kmsKeyArn;

    /**
     * @return The server-side encryption key that is used to protect your backups.
     * 
     */
    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * Name of the backup vault to create.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the backup vault to create.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of recovery points that are stored in a backup vault.
     * 
     */
    @Export(name="recoveryPoints", type=Integer.class, parameters={})
    private Output<Integer> recoveryPoints;

    /**
     * @return The number of recovery points that are stored in a backup vault.
     * 
     */
    public Output<Integer> getRecoveryPoints() {
        return this.recoveryPoints;
    }
    /**
     * Metadata that you can assign to help organize the resources that you create. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Metadata that you can assign to help organize the resources that you create. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable VaultArgs.Builder a);
    }
    private static io.pulumi.aws.backup.VaultArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.backup.VaultArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Vault(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vault(String name) {
        this(name, VaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vault(String name, @Nullable VaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vault(String name, @Nullable VaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vault:Vault", name, args == null ? VaultArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Vault(String name, Output<String> id, @Nullable VaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vault:Vault", name, state, makeResourceOptions(options, id));
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
    public static Vault get(String name, Output<String> id, @Nullable VaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Vault(name, id, state, options);
    }
}
