// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.SqlResourceSqlRoleAssignmentArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB Role Assignment
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:SqlResourceSqlRoleAssignment myRoleAssignmentId /subscriptions/mySubscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.DocumentDB/databaseAccounts/myAccountName/sqlRoleAssignments/myRoleAssignmentId 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:SqlResourceSqlRoleAssignment")
public class SqlResourceSqlRoleAssignment extends io.pulumi.resources.CustomResource {
    /**
     * The name of the database account.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The unique identifier for the associated AAD principal in the AAD graph to which access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant associated with the subscription.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalId;

    /**
     * @return The unique identifier for the associated AAD principal in the AAD graph to which access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant associated with the subscription.
     * 
     */
    public Output</* @Nullable */ String> getPrincipalId() {
        return this.principalId;
    }
    /**
     * The unique identifier for the associated Role Definition.
     * 
     */
    @Export(name="roleDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleDefinitionId;

    /**
     * @return The unique identifier for the associated Role Definition.
     * 
     */
    public Output</* @Nullable */ String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The data plane resource path for which access is being granted through this Role Assignment.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return The data plane resource path for which access is being granted through this Role Assignment.
     * 
     */
    public Output</* @Nullable */ String> getScope() {
        return this.scope;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SqlResourceSqlRoleAssignmentArgs.Builder a);
    }
    private static io.pulumi.azurenative.documentdb.SqlResourceSqlRoleAssignmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.documentdb.SqlResourceSqlRoleAssignmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SqlResourceSqlRoleAssignment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlResourceSqlRoleAssignment(String name) {
        this(name, SqlResourceSqlRoleAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlResourceSqlRoleAssignment(String name, SqlResourceSqlRoleAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlResourceSqlRoleAssignment(String name, SqlResourceSqlRoleAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlRoleAssignment", name, args == null ? SqlResourceSqlRoleAssignmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SqlResourceSqlRoleAssignment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlRoleAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:SqlResourceSqlRoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:SqlResourceSqlRoleAssignment").build())
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
    public static SqlResourceSqlRoleAssignment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlResourceSqlRoleAssignment(name, id, options);
    }
}
