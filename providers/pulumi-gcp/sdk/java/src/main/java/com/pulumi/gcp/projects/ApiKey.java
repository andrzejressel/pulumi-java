// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.projects.ApiKeyArgs;
import com.pulumi.gcp.projects.inputs.ApiKeyState;
import com.pulumi.gcp.projects.outputs.ApiKeyRestrictions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Apikeys Key resource
 * 
 * ## Example Usage
 * ### Android_key
 * A basic example of a android api keys key
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
 *         var basic = new Project(&#34;basic&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;app&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .build());
 * 
 *         var primary = new ApiKey(&#34;primary&#34;, ApiKeyArgs.builder()        
 *             .displayName(&#34;sample-key&#34;)
 *             .project(basic.getName())
 *             .restrictions(ApiKeyRestrictions.builder()
 *                 .androidKeyRestrictions(ApiKeyRestrictionsAndroidKeyRestrictions.builder()
 *                     .allowedApplications(ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplication.builder()
 *                         .packageName(&#34;com.example.app123&#34;)
 *                         .sha1Fingerprint(&#34;1699466a142d4682a5f91b50fdf400f2358e2b0b&#34;)
 *                         .build())
 *                     .build())
 *                 .apiTargets(ApiKeyRestrictionsApiTarget.builder()
 *                     .service(&#34;translate.googleapis.com&#34;)
 *                     .methods(&#34;GET*&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Basic_key
 * A basic example of a api keys key
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
 *         var basic = new Project(&#34;basic&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;app&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .build());
 * 
 *         var primary = new ApiKey(&#34;primary&#34;, ApiKeyArgs.builder()        
 *             .displayName(&#34;sample-key&#34;)
 *             .project(basic.getName())
 *             .restrictions(ApiKeyRestrictions.builder()
 *                 .apiTargets(ApiKeyRestrictionsApiTarget.builder()
 *                     .service(&#34;translate.googleapis.com&#34;)
 *                     .methods(&#34;GET*&#34;)
 *                     .build())
 *                 .browserKeyRestrictions(ApiKeyRestrictionsBrowserKeyRestrictions.builder()
 *                     .allowedReferrers(&#34;.*&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Ios_key
 * A basic example of a ios api keys key
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
 *         var basic = new Project(&#34;basic&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;app&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .build());
 * 
 *         var primary = new ApiKey(&#34;primary&#34;, ApiKeyArgs.builder()        
 *             .displayName(&#34;sample-key&#34;)
 *             .project(basic.getName())
 *             .restrictions(ApiKeyRestrictions.builder()
 *                 .apiTargets(ApiKeyRestrictionsApiTarget.builder()
 *                     .service(&#34;translate.googleapis.com&#34;)
 *                     .methods(&#34;GET*&#34;)
 *                     .build())
 *                 .iosKeyRestrictions(ApiKeyRestrictionsIosKeyRestrictions.builder()
 *                     .allowedBundleIds(&#34;com.google.app.macos&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Minimal_key
 * A minimal example of a api keys key
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
 *         var basic = new Project(&#34;basic&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;app&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .build());
 * 
 *         var primary = new ApiKey(&#34;primary&#34;, ApiKeyArgs.builder()        
 *             .displayName(&#34;sample-key&#34;)
 *             .project(basic.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Server_key
 * A basic example of a server api keys key
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
 *         var basic = new Project(&#34;basic&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;app&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .build());
 * 
 *         var primary = new ApiKey(&#34;primary&#34;, ApiKeyArgs.builder()        
 *             .displayName(&#34;sample-key&#34;)
 *             .project(basic.getName())
 *             .restrictions(ApiKeyRestrictions.builder()
 *                 .apiTargets(ApiKeyRestrictionsApiTarget.builder()
 *                     .service(&#34;translate.googleapis.com&#34;)
 *                     .methods(&#34;GET*&#34;)
 *                     .build())
 *                 .serverKeyRestrictions(ApiKeyRestrictionsServerKeyRestrictions.builder()
 *                     .allowedIps(&#34;127.0.0.1&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Key can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:projects/apiKey:ApiKey default projects/{{project}}/locations/global/keys/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:projects/apiKey:ApiKey default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:projects/apiKey:ApiKey default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:projects/apiKey:ApiKey")
public class ApiKey extends com.pulumi.resources.CustomResource {
    /**
     * Human-readable display name of this API key. Modifiable by user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Human-readable display name of this API key. Modifiable by user.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Output only. An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString`
     * method.
     * 
     */
    @Export(name="keyString", type=String.class, parameters={})
    private Output<String> keyString;

    /**
     * @return Output only. An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString`
     * method.
     * 
     */
    public Output<String> keyString() {
        return this.keyString;
    }
    /**
     * The resource name of the key. The name must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. In another word, the name must match the regular expression: a-z?.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the key. The name must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. In another word, the name must match the regular expression: a-z?.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Key restrictions.
     * 
     */
    @Export(name="restrictions", type=ApiKeyRestrictions.class, parameters={})
    private Output</* @Nullable */ ApiKeyRestrictions> restrictions;

    /**
     * @return Key restrictions.
     * 
     */
    public Output<Optional<ApiKeyRestrictions>> restrictions() {
        return Codegen.optional(this.restrictions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, @Nullable ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, @Nullable ApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
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
    public static ApiKey get(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}
