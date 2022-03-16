// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ADLSGen2FileDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An ADLS Gen 2 file data set.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:ADLSGen2FileDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:ADLSGen2FileDataSet")
public class ADLSGen2FileDataSet extends io.pulumi.resources.CustomResource {
    /**
     * Unique id for identifying a data set resource
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return Unique id for identifying a data set resource
     * 
     */
    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    /**
     * File path within the file system.
     * 
     */
    @Export(name="filePath", type=String.class, parameters={})
    private Output<String> filePath;

    /**
     * @return File path within the file system.
     * 
     */
    public Output<String> getFilePath() {
        return this.filePath;
    }
    /**
     * File system to which the file belongs.
     * 
     */
    @Export(name="fileSystem", type=String.class, parameters={})
    private Output<String> fileSystem;

    /**
     * @return File system to which the file belongs.
     * 
     */
    public Output<String> getFileSystem() {
        return this.fileSystem;
    }
    /**
     * Kind of data set.
     * Expected value is 'AdlsGen2File'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is 'AdlsGen2File'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource group of storage account
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account
     * 
     */
    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set
     * 
     */
    @Export(name="storageAccountName", type=String.class, parameters={})
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set
     * 
     */
    public Output<String> getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account
     * 
     */
    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ADLSGen2FileDataSetArgs.Builder a);
    }
    private static io.pulumi.azurenative.datashare.ADLSGen2FileDataSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datashare.ADLSGen2FileDataSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ADLSGen2FileDataSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ADLSGen2FileDataSet(String name) {
        this(name, ADLSGen2FileDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ADLSGen2FileDataSet(String name, ADLSGen2FileDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ADLSGen2FileDataSet(String name, ADLSGen2FileDataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen2FileDataSet", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private ADLSGen2FileDataSet(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen2FileDataSet", name, null, makeResourceOptions(options, id));
    }

    private static ADLSGen2FileDataSetArgs makeArgs(ADLSGen2FileDataSetArgs args) {
        var builder = args == null ? ADLSGen2FileDataSetArgs.builder() : ADLSGen2FileDataSetArgs.builder(args);
        return builder
            .kind("AdlsGen2File")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:ADLSGen2FileDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:ADLSGen2FileDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:ADLSGen2FileDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:ADLSGen2FileDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:ADLSGen2FileDataSet").build())
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
    public static ADLSGen2FileDataSet get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ADLSGen2FileDataSet(name, id, options);
    }
}
