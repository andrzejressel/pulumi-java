// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2.VersionArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an agent version. The new version points to the agent instance in the "default" environment.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:Version")
public class Version extends io.pulumi.resources.CustomResource {
    /**
     * The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. The developer-provided description of this version.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. The developer-provided description of this version.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The status of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
     * 
     */
    @Export(name="versionNumber", type=Integer.class, parameters={})
    private Output<Integer> versionNumber;

    /**
     * @return The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
     * 
     */
    public Output<Integer> getVersionNumber() {
        return this.versionNumber;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable VersionArgs.Builder a);
    }
    private static io.pulumi.googlenative.dialogflow_v2.VersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dialogflow_v2.VersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Version(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Version(String name) {
        this(name, VersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Version(String name, @Nullable VersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Version(String name, @Nullable VersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Version", name, args == null ? VersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Version(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Version", name, null, makeResourceOptions(options, id));
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
    public static Version get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Version(name, id, options);
    }
}
