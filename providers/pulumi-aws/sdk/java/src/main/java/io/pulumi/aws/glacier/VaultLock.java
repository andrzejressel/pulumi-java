// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glacier.VaultLockArgs;
import io.pulumi.aws.glacier.inputs.VaultLockState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Glacier Vault Lock. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html) for a full explanation of the Glacier Vault Lock functionality.
 * 
 * > **NOTE:** This resource allows you to test Glacier Vault Lock policies by setting the `complete_lock` argument to `false`. When testing policies in this manner, the Glacier Vault Lock automatically expires after 24 hours and this provider will show this resource as needing recreation after that time. To permanently apply the policy, set the `complete_lock` argument to `true`. When changing `complete_lock` to `true`, it is expected the resource will show as recreating.
 * 
 * !> **WARNING:** Once a Glacier Vault Lock is completed, it is immutable. The deletion of the Glacier Vault Lock is not be possible and attempting to remove it from this provider will return an error. Set the `ignore_deletion_error` argument to `true` and apply this configuration before attempting to delete this resource via this provider or remove this resource from this provider's management.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glacier Vault Locks can be imported using the Glacier Vault name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glacier/vaultLock:VaultLock example example-vault
 * ```
 * 
 */
@ResourceType(type="aws:glacier/vaultLock:VaultLock")
public class VaultLock extends io.pulumi.resources.CustomResource {
    /**
     * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
     * 
     */
    @Export(name="completeLock", type=Boolean.class, parameters={})
    private Output<Boolean> completeLock;

    /**
     * @return Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
     * 
     */
    public Output<Boolean> getCompleteLock() {
        return this.completeLock;
    }
    /**
     * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
     * 
     */
    @Export(name="ignoreDeletionError", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreDeletionError;

    /**
     * @return Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getIgnoreDeletionError() {
        return this.ignoreDeletionError;
    }
    /**
     * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * The name of the Glacier Vault.
     * 
     */
    @Export(name="vaultName", type=String.class, parameters={})
    private Output<String> vaultName;

    /**
     * @return The name of the Glacier Vault.
     * 
     */
    public Output<String> getVaultName() {
        return this.vaultName;
    }

    public interface BuilderApplicator {
        public void apply(VaultLockArgs.Builder a);
    }
    private static io.pulumi.aws.glacier.VaultLockArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glacier.VaultLockArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VaultLock(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VaultLock(String name) {
        this(name, VaultLockArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VaultLock(String name, VaultLockArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VaultLock(String name, VaultLockArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glacier/vaultLock:VaultLock", name, args == null ? VaultLockArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VaultLock(String name, Output<String> id, @Nullable VaultLockState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glacier/vaultLock:VaultLock", name, state, makeResourceOptions(options, id));
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
    public static VaultLock get(String name, Output<String> id, @Nullable VaultLockState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VaultLock(name, id, state, options);
    }
}
