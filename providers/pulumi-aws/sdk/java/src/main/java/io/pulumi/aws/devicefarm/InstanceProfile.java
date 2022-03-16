// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.devicefarm.InstanceProfileArgs;
import io.pulumi.aws.devicefarm.inputs.InstanceProfileState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Device Farm Instance Profiles.
 * ∂
 * > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DeviceFarm Instance Profiles can be imported by their arn
 * 
 * ```sh
 *  $ pulumi import aws:devicefarm/instanceProfile:InstanceProfile example arn:aws:devicefarm:us-west-2:123456789012:instanceprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
 * ```
 * 
 */
@ResourceType(type="aws:devicefarm/instanceProfile:InstanceProfile")
public class InstanceProfile extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of this instance profile.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of this instance profile.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the instance profile.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the instance profile.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    @Export(name="excludeAppPackagesFromCleanups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> excludeAppPackagesFromCleanups;

    /**
     * @return An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    public Output</* @Nullable */ List<String>> getExcludeAppPackagesFromCleanups() {
        return this.excludeAppPackagesFromCleanups;
    }
    /**
     * The name for the instance profile.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the instance profile.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    @Export(name="packageCleanup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> packageCleanup;

    /**
     * @return When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    public Output</* @Nullable */ Boolean> getPackageCleanup() {
        return this.packageCleanup;
    }
    /**
     * When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    @Export(name="rebootAfterUse", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rebootAfterUse;

    /**
     * @return When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getRebootAfterUse() {
        return this.rebootAfterUse;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable InstanceProfileArgs.Builder a);
    }
    private static io.pulumi.aws.devicefarm.InstanceProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.devicefarm.InstanceProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InstanceProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceProfile(String name) {
        this(name, InstanceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/instanceProfile:InstanceProfile", name, args == null ? InstanceProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InstanceProfile(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/instanceProfile:InstanceProfile", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceProfile get(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceProfile(name, id, state, options);
    }
}
