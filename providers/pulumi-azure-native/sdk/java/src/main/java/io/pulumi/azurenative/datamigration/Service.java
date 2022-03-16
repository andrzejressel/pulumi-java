// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datamigration.ServiceArgs;
import io.pulumi.azurenative.datamigration.outputs.ServiceSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Database Migration Service resource
 * API Version: 2018-04-19.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datamigration:Service DmsSdkService /subscriptions/fc04246f-04c5-437e-ac5e-206a19e7193f/resourceGroups/DmsSdkRg/providers/Microsoft.DataMigration/services/DmsSdkService 
 * ```
 * 
 */
@ResourceType(type="azure-native:datamigration:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * HTTP strong entity tag value. Ignored if submitted
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return HTTP strong entity tag value. Ignored if submitted
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The resource kind. Only 'vm' (the default) is supported.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The resource kind. Only 'vm' (the default) is supported.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
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
     * The resource's provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The resource's provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The public key of the service, used to encrypt secrets sent to the service
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return The public key of the service, used to encrypt secrets sent to the service
     * 
     */
    public Output</* @Nullable */ String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * Service SKU
     * 
     */
    @Export(name="sku", type=ServiceSkuResponse.class, parameters={})
    private Output</* @Nullable */ ServiceSkuResponse> sku;

    /**
     * @return Service SKU
     * 
     */
    public Output</* @Nullable */ ServiceSkuResponse> getSku() {
        return this.sku;
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
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     * 
     */
    @Export(name="virtualSubnetId", type=String.class, parameters={})
    private Output<String> virtualSubnetId;

    /**
     * @return The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     * 
     */
    public Output<String> getVirtualSubnetId() {
        return this.virtualSubnetId;
    }

    public interface BuilderApplicator {
        public void apply(ServiceArgs.Builder a);
    }
    private static io.pulumi.azurenative.datamigration.ServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datamigration.ServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Service(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Service(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:Service", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datamigration/v20171115preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180315preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180331preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180419:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180715preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20210630:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20211030preview:Service").build())
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
    public static Service get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
