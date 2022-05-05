// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sourcerepo;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.sourcerepo.RepositoryArgs;
import com.pulumi.gcp.sourcerepo.inputs.RepositoryState;
import com.pulumi.gcp.sourcerepo.outputs.RepositoryPubsubConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A repository (or repo) is a Git repository storing versioned source content.
 * 
 * To get more information about Repository, see:
 * 
 * * [API documentation](https://cloud.google.com/source-repositories/docs/reference/rest/v1/projects.repos)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/source-repositories/)
 * 
 * ## Example Usage
 * ### Sourcerepo Repository Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var my_repo = new Repository(&#34;my-repo&#34;);
 * 
 *         }
 * }
 * ```
 * ### Sourcerepo Repository Full
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testAccount = new Account(&#34;testAccount&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-account&#34;)
 *             .displayName(&#34;Test Service Account&#34;)
 *             .build());
 * 
 *         var topic = new Topic(&#34;topic&#34;);
 * 
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .pubsubConfigs(RepositoryPubsubConfig.builder()
 *                 .topic(topic.getId())
 *                 .messageFormat(&#34;JSON&#34;)
 *                 .serviceAccountEmail(testAccount.getEmail())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Repository can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:sourcerepo/repository:Repository default projects/{{project}}/repos/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sourcerepo/repository:Repository default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:sourcerepo/repository:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
    /**
     * Resource name of the repository, of the form `{{repo}}`.
     * The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the repository, of the form `{{repo}}`.
     * The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * 
     */
    @Export(name="pubsubConfigs", type=List.class, parameters={RepositoryPubsubConfig.class})
    private Output</* @Nullable */ List<RepositoryPubsubConfig>> pubsubConfigs;

    /**
     * @return How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<RepositoryPubsubConfig>>> pubsubConfigs() {
        return Codegen.optional(this.pubsubConfigs);
    }
    /**
     * The disk usage of the repo, in bytes.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return The disk usage of the repo, in bytes.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * URL to clone the repository from Google Cloud Source Repositories.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return URL to clone the repository from Google Cloud Source Repositories.
     * 
     */
    public Output<String> url() {
        return this.url;
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
    public Repository(String name, @Nullable RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, @Nullable RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sourcerepo/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sourcerepo/repository:Repository", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Repository get(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
