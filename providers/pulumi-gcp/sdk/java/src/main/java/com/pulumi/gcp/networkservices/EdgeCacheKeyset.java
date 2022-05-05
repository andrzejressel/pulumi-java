// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networkservices.EdgeCacheKeysetArgs;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetState;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheKeysetPublicKey;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * EdgeCacheKeyset represents a collection of public keys used for validating signed requests.
 * 
 * &gt; **Warning:** All arguments including `public_key.public_key.value` will be stored in the raw
 * state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/language/state/sensitive-data.html).
 * 
 * ## Example Usage
 * ### Network Services Edge Cache Keyset Basic
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
 *         var default_ = new EdgeCacheKeyset(&#34;default&#34;, EdgeCacheKeysetArgs.builder()        
 *             .description(&#34;The default keyset&#34;)
 *             .publicKeys(            
 *                 EdgeCacheKeysetPublicKey.builder()
 *                     .id(&#34;my-public-key&#34;)
 *                     .value(&#34;FHsTyFHNmvNpw4o7-rp-M1yqMyBF8vXSBRkZtkQ0RKY&#34;)
 *                     .build(),
 *                 EdgeCacheKeysetPublicKey.builder()
 *                     .id(&#34;my-public-key-2&#34;)
 *                     .value(&#34;hzd03llxB1u5FOLKFkZ6_wCJqC7jtN0bg7xlBqS6WVM&#34;)
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * EdgeCacheKeyset can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/edgeCacheKeyset:EdgeCacheKeyset default projects/{{project}}/locations/global/edgeCacheKeysets/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/edgeCacheKeyset:EdgeCacheKeyset default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/edgeCacheKeyset:EdgeCacheKeyset default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkservices/edgeCacheKeyset:EdgeCacheKeyset")
public class EdgeCacheKeyset extends com.pulumi.resources.CustomResource {
    /**
     * A human-readable description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the EdgeCache resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
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
     * An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify at least one (1) key, and may have up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    @Export(name="publicKeys", type=List.class, parameters={EdgeCacheKeysetPublicKey.class})
    private Output<List<EdgeCacheKeysetPublicKey>> publicKeys;

    /**
     * @return An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify at least one (1) key, and may have up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    public Output<List<EdgeCacheKeysetPublicKey>> publicKeys() {
        return this.publicKeys;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EdgeCacheKeyset(String name) {
        this(name, EdgeCacheKeysetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EdgeCacheKeyset(String name, EdgeCacheKeysetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EdgeCacheKeyset(String name, EdgeCacheKeysetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/edgeCacheKeyset:EdgeCacheKeyset", name, args == null ? EdgeCacheKeysetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EdgeCacheKeyset(String name, Output<String> id, @Nullable EdgeCacheKeysetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/edgeCacheKeyset:EdgeCacheKeyset", name, state, makeResourceOptions(options, id));
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
    public static EdgeCacheKeyset get(String name, Output<String> id, @Nullable EdgeCacheKeysetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EdgeCacheKeyset(name, id, state, options);
    }
}
