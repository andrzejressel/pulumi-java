// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.PortfolioArgs;
import io.pulumi.aws.servicecatalog.inputs.PortfolioState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a Service Catalog Portfolio.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Service Catalog Portfolios can be imported using the `service catalog portfolio id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/portfolio:Portfolio testfolio port-12344321
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/portfolio:Portfolio")
public class Portfolio extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Description of the portfolio
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the portfolio
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The name of the portfolio.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the portfolio.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Name of the person or organization who owns the portfolio.
     * 
     */
    @Export(name="providerName", type=String.class, parameters={})
    private Output<String> providerName;

    /**
     * @return Name of the person or organization who owns the portfolio.
     * 
     */
    public Output<String> getProviderName() {
        return this.providerName;
    }
    /**
     * Tags to apply to the connection. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the connection. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        public void apply(PortfolioArgs.Builder a);
    }
    private static io.pulumi.aws.servicecatalog.PortfolioArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.servicecatalog.PortfolioArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Portfolio(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Portfolio(String name) {
        this(name, PortfolioArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Portfolio(String name, PortfolioArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Portfolio(String name, PortfolioArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/portfolio:Portfolio", name, args == null ? PortfolioArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Portfolio(String name, Output<String> id, @Nullable PortfolioState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/portfolio:Portfolio", name, state, makeResourceOptions(options, id));
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
    public static Portfolio get(String name, Output<String> id, @Nullable PortfolioState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Portfolio(name, id, state, options);
    }
}
