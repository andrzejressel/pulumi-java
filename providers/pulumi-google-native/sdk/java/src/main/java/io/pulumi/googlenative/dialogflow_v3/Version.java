// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3.VersionArgs;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3NluSettingsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a Version in the specified Flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: CreateVersionOperationMetadata - `response`: Version
 * 
 */
@ResourceType(type="google-native:dialogflow/v3:Version")
public class Version extends io.pulumi.resources.CustomResource {
    /**
     * Create time of the version.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Create time of the version.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the version. Limit of 64 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The NLU settings of the flow at version creation.
     * 
     */
    @OutputExport(name="nluSettings", type=GoogleCloudDialogflowCxV3NluSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3NluSettingsResponse> nluSettings;

    /**
     * @return The NLU settings of the flow at version creation.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3NluSettingsResponse> getNluSettings() {
        return this.nluSettings;
    }
    /**
     * The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Version(String name, VersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Version", name, args == null ? VersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Version(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Version", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Version get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Version(name, id, options);
    }
}
