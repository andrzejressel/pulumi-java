// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.refactorspaces.ApplicationArgs;
import io.pulumi.awsnative.refactorspaces.enums.ApplicationProxyType;
import io.pulumi.awsnative.refactorspaces.outputs.ApplicationApiGatewayProxyInput;
import io.pulumi.awsnative.refactorspaces.outputs.ApplicationTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of AWS::RefactorSpaces::Application Resource Type
 * 
 */
@ResourceType(type="aws-native:refactorspaces:Application")
public class Application extends io.pulumi.resources.CustomResource {
    @Export(name="apiGatewayId", type=String.class, parameters={})
    private Output<String> apiGatewayId;

    public Output<String> getApiGatewayId() {
        return this.apiGatewayId;
    }
    @Export(name="apiGatewayProxy", type=ApplicationApiGatewayProxyInput.class, parameters={})
    private Output</* @Nullable */ ApplicationApiGatewayProxyInput> apiGatewayProxy;

    public Output</* @Nullable */ ApplicationApiGatewayProxyInput> getApiGatewayProxy() {
        return this.apiGatewayProxy;
    }
    @Export(name="applicationIdentifier", type=String.class, parameters={})
    private Output<String> applicationIdentifier;

    public Output<String> getApplicationIdentifier() {
        return this.applicationIdentifier;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="environmentIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentIdentifier;

    public Output</* @Nullable */ String> getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @Export(name="nlbArn", type=String.class, parameters={})
    private Output<String> nlbArn;

    public Output<String> getNlbArn() {
        return this.nlbArn;
    }
    @Export(name="nlbName", type=String.class, parameters={})
    private Output<String> nlbName;

    public Output<String> getNlbName() {
        return this.nlbName;
    }
    @Export(name="proxyType", type=ApplicationProxyType.class, parameters={})
    private Output</* @Nullable */ ApplicationProxyType> proxyType;

    public Output</* @Nullable */ ApplicationProxyType> getProxyType() {
        return this.proxyType;
    }
    @Export(name="proxyUrl", type=String.class, parameters={})
    private Output<String> proxyUrl;

    public Output<String> getProxyUrl() {
        return this.proxyUrl;
    }
    @Export(name="stageName", type=String.class, parameters={})
    private Output<String> stageName;

    public Output<String> getStageName() {
        return this.stageName;
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ApplicationTag.class})
    private Output</* @Nullable */ List<ApplicationTag>> tags;

    /**
     * @return Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    public Output</* @Nullable */ List<ApplicationTag>> getTags() {
        return this.tags;
    }
    @Export(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    public Output</* @Nullable */ String> getVpcId() {
        return this.vpcId;
    }
    @Export(name="vpcLinkId", type=String.class, parameters={})
    private Output<String> vpcLinkId;

    public Output<String> getVpcLinkId() {
        return this.vpcLinkId;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ApplicationArgs.Builder a);
    }
    private static io.pulumi.awsnative.refactorspaces.ApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.refactorspaces.ApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Application(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, @Nullable ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, @Nullable ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Application(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Application", name, null, makeResourceOptions(options, id));
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
    public static Application get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
