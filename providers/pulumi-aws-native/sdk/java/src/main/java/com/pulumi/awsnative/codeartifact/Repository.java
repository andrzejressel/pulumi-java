// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeartifact;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.codeartifact.RepositoryArgs;
import com.pulumi.awsnative.codeartifact.outputs.RepositoryTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The resource schema to create a CodeArtifact repository.
 * 
 */
@ResourceType(type="aws-native:codeartifact:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the repository.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the repository.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A text description of the repository.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A text description of the repository.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the domain that contains the repository.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The name of the domain that contains the repository.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The 12-digit account ID of the AWS account that owns the domain.
     * 
     */
    @Export(name="domainOwner", type=String.class, parameters={})
    private Output<String> domainOwner;

    /**
     * @return The 12-digit account ID of the AWS account that owns the domain.
     * 
     */
    public Output<String> domainOwner() {
        return this.domainOwner;
    }
    /**
     * A list of external connections associated with the repository.
     * 
     */
    @Export(name="externalConnections", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> externalConnections;

    /**
     * @return A list of external connections associated with the repository.
     * 
     */
    public Output<Optional<List<String>>> externalConnections() {
        return Codegen.optional(this.externalConnections);
    }
    /**
     * The name of the repository. This is used for GetAtt
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the repository. This is used for GetAtt
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The access control resource policy on the provided repository.
     * 
     */
    @Export(name="permissionsPolicyDocument", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> permissionsPolicyDocument;

    /**
     * @return The access control resource policy on the provided repository.
     * 
     */
    public Output<Optional<Object>> permissionsPolicyDocument() {
        return Codegen.optional(this.permissionsPolicyDocument);
    }
    /**
     * The name of the repository.
     * 
     */
    @Export(name="repositoryName", type=String.class, parameters={})
    private Output<String> repositoryName;

    /**
     * @return The name of the repository.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={RepositoryTag.class})
    private Output</* @Nullable */ List<RepositoryTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<RepositoryTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A list of upstream repositories associated with the repository.
     * 
     */
    @Export(name="upstreams", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> upstreams;

    /**
     * @return A list of upstream repositories associated with the repository.
     * 
     */
    public Output<Optional<List<String>>> upstreams() {
        return Codegen.optional(this.upstreams);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(String name, RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codeartifact:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codeartifact:Repository", name, null, makeResourceOptions(options, id));
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
    public static Repository get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, options);
    }
}
