// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ReplicationMigrationItemArgs;
import io.pulumi.azurenative.recoveryservices.outputs.MigrationItemPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Migration item.
 * API Version: 2018-07-10.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ReplicationMigrationItem virtualmachine1 /Subscriptions/cb53d0c3-bd59-4721-89bc-06916a9147ef/resourceGroups/resourcegroup1/providers/Microsoft.RecoveryServices/vaults/migrationvault/replicationFabrics/vmwarefabric1/replicationProtectionContainers/vmwareContainer1/replicationMigrationItems/virtualmachine1 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ReplicationMigrationItem")
public class ReplicationMigrationItem extends io.pulumi.resources.CustomResource {
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The migration item properties.
     * 
     */
    @Export(name="properties", type=MigrationItemPropertiesResponse.class, parameters={})
    private Output<MigrationItemPropertiesResponse> properties;

    /**
     * @return The migration item properties.
     * 
     */
    public Output<MigrationItemPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ReplicationMigrationItemArgs.Builder a);
    }
    private static io.pulumi.azurenative.recoveryservices.ReplicationMigrationItemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.recoveryservices.ReplicationMigrationItemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ReplicationMigrationItem(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationMigrationItem(String name) {
        this(name, ReplicationMigrationItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationMigrationItem(String name, ReplicationMigrationItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationMigrationItem(String name, ReplicationMigrationItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationMigrationItem", name, args == null ? ReplicationMigrationItemArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ReplicationMigrationItem(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationMigrationItem", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180110:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180710:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211101:ReplicationMigrationItem").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:ReplicationMigrationItem").build())
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
    public static ReplicationMigrationItem get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationMigrationItem(name, id, options);
    }
}
