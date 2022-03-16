// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.PrincipalPortfolioAssociationArgs;
import io.pulumi.aws.servicecatalog.inputs.PrincipalPortfolioAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Principal Portfolio Association.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_servicecatalog_principal_portfolio_association` can be imported using the accept language, principal ARN, and portfolio ID, separated by a comma, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation example en,arn:aws:iam::123456789012:user/Eleanor,port-68656c6c6f
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation")
public class PrincipalPortfolioAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Export(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Output</* @Nullable */ String> getAcceptLanguage() {
        return this.acceptLanguage;
    }
    /**
     * Portfolio identifier.
     * 
     */
    @Export(name="portfolioId", type=String.class, parameters={})
    private Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Output<String> getPortfolioId() {
        return this.portfolioId;
    }
    /**
     * Principal ARN.
     * 
     */
    @Export(name="principalArn", type=String.class, parameters={})
    private Output<String> principalArn;

    /**
     * @return Principal ARN.
     * 
     */
    public Output<String> getPrincipalArn() {
        return this.principalArn;
    }
    /**
     * Principal type. Setting this argument empty (e.g., `principal_type = ""`) will result in an error. Valid value is `IAM`. Default is `IAM`.
     * 
     */
    @Export(name="principalType", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalType;

    /**
     * @return Principal type. Setting this argument empty (e.g., `principal_type = ""`) will result in an error. Valid value is `IAM`. Default is `IAM`.
     * 
     */
    public Output</* @Nullable */ String> getPrincipalType() {
        return this.principalType;
    }

    public interface BuilderApplicator {
        public void apply(PrincipalPortfolioAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.servicecatalog.PrincipalPortfolioAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.servicecatalog.PrincipalPortfolioAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrincipalPortfolioAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrincipalPortfolioAssociation(String name) {
        this(name, PrincipalPortfolioAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrincipalPortfolioAssociation(String name, PrincipalPortfolioAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrincipalPortfolioAssociation(String name, PrincipalPortfolioAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation", name, args == null ? PrincipalPortfolioAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PrincipalPortfolioAssociation(String name, Output<String> id, @Nullable PrincipalPortfolioAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation", name, state, makeResourceOptions(options, id));
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
    public static PrincipalPortfolioAssociation get(String name, Output<String> id, @Nullable PrincipalPortfolioAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrincipalPortfolioAssociation(name, id, state, options);
    }
}
