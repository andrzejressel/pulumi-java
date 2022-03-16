// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.MigrationConfigArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in List or Get Migration Config operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicebus:MigrationConfig sdk-Namespace-41 /subscriptions/SubscriptionId/resourceGroups/ResourceGroup/providers/Microsoft.ServiceBus/namespaces/sdk-Namespace-41/migrationConfigs/$default 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicebus:MigrationConfig")
public class MigrationConfig extends io.pulumi.resources.CustomResource {
    /**
     * State in which Standard to Premium Migration is, possible values : Unknown, Reverting, Completing, Initiating, Syncing, Active
     * 
     */
    @Export(name="migrationState", type=String.class, parameters={})
    private Output<String> migrationState;

    /**
     * @return State in which Standard to Premium Migration is, possible values : Unknown, Reverting, Completing, Initiating, Syncing, Active
     * 
     */
    public Output<String> getMigrationState() {
        return this.migrationState;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Number of entities pending to be replicated.
     * 
     */
    @Export(name="pendingReplicationOperationsCount", type=Double.class, parameters={})
    private Output<Double> pendingReplicationOperationsCount;

    /**
     * @return Number of entities pending to be replicated.
     * 
     */
    public Output<Double> getPendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * Name to access Standard Namespace after migration
     * 
     */
    @Export(name="postMigrationName", type=String.class, parameters={})
    private Output<String> postMigrationName;

    /**
     * @return Name to access Standard Namespace after migration
     * 
     */
    public Output<String> getPostMigrationName() {
        return this.postMigrationName;
    }
    /**
     * Provisioning state of Migration Configuration
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of Migration Configuration
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    @Export(name="targetNamespace", type=String.class, parameters={})
    private Output<String> targetNamespace;

    /**
     * @return Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    public Output<String> getTargetNamespace() {
        return this.targetNamespace;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(MigrationConfigArgs.Builder a);
    }
    private static io.pulumi.azurenative.servicebus.MigrationConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.servicebus.MigrationConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MigrationConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MigrationConfig(String name) {
        this(name, MigrationConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MigrationConfig(String name, MigrationConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MigrationConfig(String name, MigrationConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:MigrationConfig", name, args == null ? MigrationConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MigrationConfig(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:MigrationConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicebus/v20170401:MigrationConfig").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20180101preview:MigrationConfig").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210101preview:MigrationConfig").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210601preview:MigrationConfig").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20211101:MigrationConfig").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MigrationConfig get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MigrationConfig(name, id, options);
    }
}
