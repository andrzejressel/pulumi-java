// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.importexport.JobArgs;
import io.pulumi.azurenative.importexport.outputs.IdentityDetailsResponse;
import io.pulumi.azurenative.importexport.outputs.JobDetailsResponse;
import io.pulumi.azurenative.importexport.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains the job information.
 * API Version: 2020-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:importexport:Job myJob /subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/myResourceGroup/providers/Microsoft.ImportExport/jobs/myJob 
 * ```
 * 
 */
@ResourceType(type="azure-native:importexport:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the job identity details
     * 
     */
    @Export(name="identity", type=IdentityDetailsResponse.class, parameters={})
    private Output</* @Nullable */ IdentityDetailsResponse> identity;

    /**
     * @return Specifies the job identity details
     * 
     */
    public Output</* @Nullable */ IdentityDetailsResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Specifies the Azure location where the job is created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the Azure location where the job is created.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Specifies the name of the job.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the job.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the job properties
     * 
     */
    @Export(name="properties", type=JobDetailsResponse.class, parameters={})
    private Output<JobDetailsResponse> properties;

    /**
     * @return Specifies the job properties
     * 
     */
    public Output<JobDetailsResponse> getProperties() {
        return this.properties;
    }
    /**
     * SystemData of ImportExport Jobs.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return SystemData of ImportExport Jobs.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Specifies the tags that are assigned to the job.
     * 
     */
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return Specifies the tags that are assigned to the job.
     * 
     */
    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }
    /**
     * Specifies the type of the job resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the job resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(JobArgs.Builder a);
    }
    private static io.pulumi.azurenative.importexport.JobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.importexport.JobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Job(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:importexport:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Job(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:importexport:Job", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:importexport/v20161101:Job").build()),
                Output.of(Alias.builder().type("azure-native:importexport/v20200801:Job").build()),
                Output.of(Alias.builder().type("azure-native:importexport/v20210101:Job").build())
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
    public static Job get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
