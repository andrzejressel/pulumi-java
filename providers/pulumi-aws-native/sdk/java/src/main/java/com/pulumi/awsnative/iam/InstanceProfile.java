// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iam;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iam.InstanceProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IAM::InstanceProfile
 * 
 */
@ResourceType(type="aws-native:iam:InstanceProfile")
public class InstanceProfile extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the instance profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the instance profile to create.
     * 
     */
    @Export(name="instanceProfileName", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceProfileName;

    /**
     * @return The name of the instance profile to create.
     * 
     */
    public Output<Optional<String>> instanceProfileName() {
        return Codegen.optional(this.instanceProfileName);
    }
    /**
     * The path to the instance profile.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    /**
     * @return The path to the instance profile.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * The name of the role to associate with the instance profile. Only one role can be assigned to an EC2 instance at a time, and all applications on the instance share the same role and permissions.
     * 
     */
    @Export(name="roles", type=List.class, parameters={String.class})
    private Output<List<String>> roles;

    /**
     * @return The name of the role to associate with the instance profile. Only one role can be assigned to an EC2 instance at a time, and all applications on the instance share the same role and permissions.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
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
    public InstanceProfile(String name, InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(String name, InstanceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:InstanceProfile", name, args == null ? InstanceProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceProfile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:InstanceProfile", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceProfile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceProfile(name, id, options);
    }
}
