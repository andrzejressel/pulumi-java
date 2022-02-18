// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dlp_v2.StoredInfoTypeArgs;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2StoredInfoTypeVersionResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dlp/v2:StoredInfoType")
public class StoredInfoType extends io.pulumi.resources.CustomResource {
    /**
     * Current version of the stored info type.
     * 
     */
    @OutputExport(name="currentVersion", type=GooglePrivacyDlpV2StoredInfoTypeVersionResponse.class, parameters={})
    private Output<GooglePrivacyDlpV2StoredInfoTypeVersionResponse> currentVersion;

    /**
     * @return Current version of the stored info type.
     * 
     */
    public Output<GooglePrivacyDlpV2StoredInfoTypeVersionResponse> getCurrentVersion() {
        return this.currentVersion;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Pending versions of the stored info type. Empty if no versions are pending.
     * 
     */
    @OutputExport(name="pendingVersions", type=List.class, parameters={GooglePrivacyDlpV2StoredInfoTypeVersionResponse.class})
    private Output<List<GooglePrivacyDlpV2StoredInfoTypeVersionResponse>> pendingVersions;

    /**
     * @return Pending versions of the stored info type. Empty if no versions are pending.
     * 
     */
    public Output<List<GooglePrivacyDlpV2StoredInfoTypeVersionResponse>> getPendingVersions() {
        return this.pendingVersions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StoredInfoType(String name, StoredInfoTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:StoredInfoType", name, args == null ? StoredInfoTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StoredInfoType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:StoredInfoType", name, null, makeResourceOptions(options, id));
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
    public static StoredInfoType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StoredInfoType(name, id, options);
    }
}
