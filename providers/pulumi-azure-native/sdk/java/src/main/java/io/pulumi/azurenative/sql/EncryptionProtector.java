// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.EncryptionProtectorArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The server encryption protector.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:EncryptionProtector current /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-7398/providers/Microsoft.Sql/servers/sqlcrudtest-4645/encryptionProtector/current 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:EncryptionProtector")
public class EncryptionProtector extends io.pulumi.resources.CustomResource {
    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
     */
    @Export(name="autoRotationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoRotationEnabled;

    /**
     * @return Key auto rotation opt-in flag. Either true or false.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoRotationEnabled() {
        return this.autoRotationEnabled;
    }
    /**
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> getKind() {
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
     * The name of the server key.
     * 
     */
    @Export(name="serverKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverKeyName;

    /**
     * @return The name of the server key.
     * 
     */
    public Output</* @Nullable */ String> getServerKeyName() {
        return this.serverKeyName;
    }
    /**
     * The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     * 
     */
    @Export(name="serverKeyType", type=String.class, parameters={})
    private Output<String> serverKeyType;

    /**
     * @return The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     * 
     */
    public Output<String> getServerKeyType() {
        return this.serverKeyType;
    }
    /**
     * Subregion of the encryption protector.
     * 
     */
    @Export(name="subregion", type=String.class, parameters={})
    private Output<String> subregion;

    /**
     * @return Subregion of the encryption protector.
     * 
     */
    public Output<String> getSubregion() {
        return this.subregion;
    }
    /**
     * Thumbprint of the server key.
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    /**
     * @return Thumbprint of the server key.
     * 
     */
    public Output<String> getThumbprint() {
        return this.thumbprint;
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
     * The URI of the server key.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return The URI of the server key.
     * 
     */
    public Output<String> getUri() {
        return this.uri;
    }

    public interface BuilderApplicator {
        public void apply(EncryptionProtectorArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.EncryptionProtectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.EncryptionProtectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EncryptionProtector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EncryptionProtector(String name) {
        this(name, EncryptionProtectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptionProtector(String name, EncryptionProtectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptionProtector(String name, EncryptionProtectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:EncryptionProtector", name, args == null ? EncryptionProtectorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EncryptionProtector(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:EncryptionProtector", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:EncryptionProtector").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:EncryptionProtector").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:EncryptionProtector").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:EncryptionProtector").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:EncryptionProtector").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:EncryptionProtector").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:EncryptionProtector").build())
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
    public static EncryptionProtector get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionProtector(name, id, options);
    }
}
