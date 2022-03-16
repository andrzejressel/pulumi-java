// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.BackendServiceIamMemberArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceIamMemberState;
import io.pulumi.gcp.compute.outputs.BackendServiceIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/backendServiceIamMember:BackendServiceIamMember")
public class BackendServiceIamMember extends io.pulumi.resources.CustomResource {
    @Export(name="condition", type=BackendServiceIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ BackendServiceIamMemberCondition> condition;

    public Output</* @Nullable */ BackendServiceIamMemberCondition> getCondition() {
        return this.condition;
    }
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(BackendServiceIamMemberArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.BackendServiceIamMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.BackendServiceIamMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BackendServiceIamMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackendServiceIamMember(String name) {
        this(name, BackendServiceIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackendServiceIamMember(String name, BackendServiceIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackendServiceIamMember(String name, BackendServiceIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendServiceIamMember:BackendServiceIamMember", name, args == null ? BackendServiceIamMemberArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BackendServiceIamMember(String name, Output<String> id, @Nullable BackendServiceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendServiceIamMember:BackendServiceIamMember", name, state, makeResourceOptions(options, id));
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
    public static BackendServiceIamMember get(String name, Output<String> id, @Nullable BackendServiceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackendServiceIamMember(name, id, state, options);
    }
}
