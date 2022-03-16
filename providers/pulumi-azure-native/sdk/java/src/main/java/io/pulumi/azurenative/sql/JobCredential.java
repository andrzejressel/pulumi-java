// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.JobCredentialArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A stored credential that can be used by a job to connect to target databases.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:JobCredential cred1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/credentials/cred1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:JobCredential")
public class JobCredential extends io.pulumi.resources.CustomResource {
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The credential user name.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return The credential user name.
     * 
     */
    public Output<String> getUsername() {
        return this.username;
    }

    public interface BuilderApplicator {
        public void apply(JobCredentialArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.JobCredentialArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.JobCredentialArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public JobCredential(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobCredential(String name) {
        this(name, JobCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobCredential(String name, JobCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobCredential(String name, JobCredentialArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobCredential", name, args == null ? JobCredentialArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private JobCredential(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobCredential", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20170301preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:JobCredential").build())
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
    public static JobCredential get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobCredential(name, id, options);
    }
}
