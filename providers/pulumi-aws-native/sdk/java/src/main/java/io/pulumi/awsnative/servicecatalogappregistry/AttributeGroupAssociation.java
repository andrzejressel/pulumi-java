// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.servicecatalogappregistry.AttributeGroupAssociationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Schema for AWS::ServiceCatalogAppRegistry::AttributeGroupAssociation.
 * 
 */
@ResourceType(type="aws-native:servicecatalogappregistry:AttributeGroupAssociation")
public class AttributeGroupAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The name or the Id of the Application.
     * 
     */
    @Export(name="application", type=String.class, parameters={})
    private Output<String> application;

    /**
     * @return The name or the Id of the Application.
     * 
     */
    public Output<String> getApplication() {
        return this.application;
    }
    @Export(name="applicationArn", type=String.class, parameters={})
    private Output<String> applicationArn;

    public Output<String> getApplicationArn() {
        return this.applicationArn;
    }
    /**
     * The name or the Id of the AttributeGroup.
     * 
     */
    @Export(name="attributeGroup", type=String.class, parameters={})
    private Output<String> attributeGroup;

    /**
     * @return The name or the Id of the AttributeGroup.
     * 
     */
    public Output<String> getAttributeGroup() {
        return this.attributeGroup;
    }
    @Export(name="attributeGroupArn", type=String.class, parameters={})
    private Output<String> attributeGroupArn;

    public Output<String> getAttributeGroupArn() {
        return this.attributeGroupArn;
    }

    public interface BuilderApplicator {
        public void apply(AttributeGroupAssociationArgs.Builder a);
    }
    private static io.pulumi.awsnative.servicecatalogappregistry.AttributeGroupAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.servicecatalogappregistry.AttributeGroupAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AttributeGroupAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AttributeGroupAssociation(String name) {
        this(name, AttributeGroupAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AttributeGroupAssociation(String name, AttributeGroupAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttributeGroupAssociation(String name, AttributeGroupAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalogappregistry:AttributeGroupAssociation", name, args == null ? AttributeGroupAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AttributeGroupAssociation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalogappregistry:AttributeGroupAssociation", name, null, makeResourceOptions(options, id));
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
    public static AttributeGroupAssociation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttributeGroupAssociation(name, id, options);
    }
}
