// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.athena.NamedQueryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Athena::NamedQuery
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:athena:NamedQuery")
public class NamedQuery extends io.pulumi.resources.CustomResource {
    /**
     * The database to which the query belongs.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The database to which the query belongs.
     * 
     */
    public Output<String> getDatabase() {
        return this.database;
    }
    /**
     * The query description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The query description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The query name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The query name.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The unique ID of the query.
     * 
     */
    @Export(name="namedQueryId", type=String.class, parameters={})
    private Output<String> namedQueryId;

    /**
     * @return The unique ID of the query.
     * 
     */
    public Output<String> getNamedQueryId() {
        return this.namedQueryId;
    }
    /**
     * The contents of the query with all query statements.
     * 
     */
    @Export(name="queryString", type=String.class, parameters={})
    private Output<String> queryString;

    /**
     * @return The contents of the query with all query statements.
     * 
     */
    public Output<String> getQueryString() {
        return this.queryString;
    }
    /**
     * The name of the workgroup that contains the named query.
     * 
     */
    @Export(name="workGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> workGroup;

    /**
     * @return The name of the workgroup that contains the named query.
     * 
     */
    public Output</* @Nullable */ String> getWorkGroup() {
        return this.workGroup;
    }

    public interface BuilderApplicator {
        public void apply(NamedQueryArgs.Builder a);
    }
    private static io.pulumi.awsnative.athena.NamedQueryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.athena.NamedQueryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NamedQuery(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamedQuery(String name) {
        this(name, NamedQueryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamedQuery(String name, NamedQueryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamedQuery(String name, NamedQueryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:NamedQuery", name, args == null ? NamedQueryArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NamedQuery(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:NamedQuery", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NamedQuery get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NamedQuery(name, id, options);
    }
}
