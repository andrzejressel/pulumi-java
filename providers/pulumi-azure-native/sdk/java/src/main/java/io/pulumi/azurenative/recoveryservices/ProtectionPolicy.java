// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ProtectionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.outputs.AzureFileShareProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureIaaSVMProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureSqlProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureVmWorkloadProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.GenericProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MabProtectionPolicyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Base class for backup policy. Workload-specific backup policies are derived from this class.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ProtectionPolicy testPolicy1 /Subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/SwaggerTestRg/providers/Microsoft.RecoveryServices/vaults/NetSDKTestRsVault/backupPolicies/testPolicy1 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ProtectionPolicy")
public class ProtectionPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Optional ETag.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Optional ETag.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name associated with the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * ProtectionPolicyResource properties
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return ProtectionPolicyResource properties
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ProtectionPolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.recoveryservices.ProtectionPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.recoveryservices.ProtectionPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ProtectionPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProtectionPolicy(String name) {
        this(name, ProtectionPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectionPolicy(String name, ProtectionPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectionPolicy(String name, ProtectionPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ProtectionPolicy", name, args == null ? ProtectionPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ProtectionPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ProtectionPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20160601:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20201001:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20201201:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210101:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210201:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210201preview:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:ProtectionPolicy").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:ProtectionPolicy").build())
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
    public static ProtectionPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProtectionPolicy(name, id, options);
    }
}
