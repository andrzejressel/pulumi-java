// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.LicenseArgs;
import io.pulumi.googlenative.compute_beta.outputs.LicenseResourceRequirementsResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a License resource in the specified project. *Caution* This resource is intended for use only by third-party partners who are creating Cloud Marketplace images.
 * 
 */
@ResourceType(type="google-native:compute/beta:License")
public class License extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Type of resource. Always compute#license for licenses.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of resource. Always compute#license for licenses.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The unique code used to attach this license to images, snapshots, and disks.
     * 
     */
    @OutputExport(name="licenseCode", type=String.class, parameters={})
    private Output<String> licenseCode;

    /**
     * @return The unique code used to attach this license to images, snapshots, and disks.
     * 
     */
    public Output<String> getLicenseCode() {
        return this.licenseCode;
    }
    /**
     * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="resourceRequirements", type=LicenseResourceRequirementsResponse.class, parameters={})
    private Output<LicenseResourceRequirementsResponse> resourceRequirements;

    public Output<LicenseResourceRequirementsResponse> getResourceRequirements() {
        return this.resourceRequirements;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    @OutputExport(name="transferable", type=Boolean.class, parameters={})
    private Output<Boolean> transferable;

    /**
     * @return If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    public Output<Boolean> getTransferable() {
        return this.transferable;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public License(String name, @Nullable LicenseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:License", name, args == null ? LicenseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private License(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:License", name, null, makeResourceOptions(options, id));
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
    public static License get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new License(name, id, options);
    }
}
