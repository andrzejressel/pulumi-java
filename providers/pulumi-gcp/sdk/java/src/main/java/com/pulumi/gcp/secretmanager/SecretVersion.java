// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.secretmanager.SecretVersionArgs;
import com.pulumi.gcp.secretmanager.inputs.SecretVersionState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A secret version resource.
 * 
 * &gt; **Warning:** All arguments including `payload.secret_data` will be stored in the raw
 * state as plain-text.
 * 
 * ## Example Usage
 * ### Secret Version Basic
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
 *         var secret_basic = new Secret(&#34;secret-basic&#34;, SecretArgs.builder()        
 *             .secretId(&#34;secret-version&#34;)
 *             .labels(Map.of(&#34;label&#34;, &#34;my-label&#34;))
 *             .replication(SecretReplication.builder()
 *                 .automatic(true)
 *                 .build())
 *             .build());
 * 
 *         var secret_version_basic = new SecretVersion(&#34;secret-version-basic&#34;, SecretVersionArgs.builder()        
 *             .secret(secret_basic.getId())
 *             .secretData(&#34;secret-data&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * SecretVersion can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:secretmanager/secretVersion:SecretVersion default {{name}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:secretmanager/secretVersion:SecretVersion")
public class SecretVersion extends com.pulumi.resources.CustomResource {
    /**
     * The time at which the Secret was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which the Secret was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The time at which the Secret was destroyed. Only present if state is DESTROYED.
     * 
     */
    @Export(name="destroyTime", type=String.class, parameters={})
    private Output<String> destroyTime;

    /**
     * @return The time at which the Secret was destroyed. Only present if state is DESTROYED.
     * 
     */
    public Output<String> destroyTime() {
        return this.destroyTime;
    }
    /**
     * The current state of the SecretVersion.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The current state of the SecretVersion.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The resource name of the SecretVersion. Format: &#39;projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}&#39;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the SecretVersion. Format: &#39;projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}&#39;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Secret Manager secret resource
     * 
     */
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return Secret Manager secret resource
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }
    /**
     * The secret data. Must be no larger than 64KiB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="secretData", type=String.class, parameters={})
    private Output<String> secretData;

    /**
     * @return The secret data. Must be no larger than 64KiB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> secretData() {
        return this.secretData;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretVersion(String name) {
        this(name, SecretVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretVersion(String name, SecretVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretVersion(String name, SecretVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretVersion:SecretVersion", name, args == null ? SecretVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretVersion(String name, Output<String> id, @Nullable SecretVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretVersion:SecretVersion", name, state, makeResourceOptions(options, id));
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
    public static SecretVersion get(String name, Output<String> id, @Nullable SecretVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretVersion(name, id, state, options);
    }
}
