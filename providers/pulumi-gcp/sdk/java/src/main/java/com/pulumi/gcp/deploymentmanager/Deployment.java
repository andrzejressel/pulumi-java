// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.deploymentmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.deploymentmanager.DeploymentArgs;
import com.pulumi.gcp.deploymentmanager.inputs.DeploymentState;
import com.pulumi.gcp.deploymentmanager.outputs.DeploymentLabel;
import com.pulumi.gcp.deploymentmanager.outputs.DeploymentTarget;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A collection of resources that are deployed and managed together using
 * a configuration file
 * 
 * &gt; **Warning:** This resource is intended only to manage a Deployment resource,
 * and attempts to manage the Deployment&#39;s resources in the provider as well
 * will likely result in errors or unexpected behavior as the two tools
 * fight over ownership. We strongly discourage doing so unless you are an
 * experienced user of both tools.
 * 
 * In addition, due to limitations of the API, the provider will treat
 * deployments in preview as recreate-only for any update operation other
 * than actually deploying an in-preview deployment (i.e. `preview=true` to
 * `preview=false`).
 * 
 * ## Example Usage
 * ### Deployment Manager Deployment Basic
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
 *         var deployment = new Deployment(&#34;deployment&#34;, DeploymentArgs.builder()        
 *             .target(DeploymentTarget.builder()
 *                 .config(DeploymentTargetConfig.builder()
 *                     .content(Files.readString(&#34;path/to/config.yml&#34;))
 *                     .build())
 *                 .build())
 *             .labels(DeploymentLabel.builder()
 *                 .key(&#34;foo&#34;)
 *                 .value(&#34;bar&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Deployment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:deploymentmanager/deployment:Deployment default projects/{{project}}/deployments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:deploymentmanager/deployment:Deployment default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:deploymentmanager/deployment:Deployment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:deploymentmanager/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * Set the policy to use for creating new resources. Only used on
     * create and update. Valid values are `CREATE_OR_ACQUIRE` (default) or
     * `ACQUIRE`. If set to `ACQUIRE` and resources do not already exist,
     * the deployment will fail. Note that updating this field does not
     * actually affect the deployment, just how it is updated.
     * Default value is `CREATE_OR_ACQUIRE`.
     * Possible values are `ACQUIRE` and `CREATE_OR_ACQUIRE`.
     * 
     */
    @Export(name="createPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createPolicy;

    /**
     * @return Set the policy to use for creating new resources. Only used on
     * create and update. Valid values are `CREATE_OR_ACQUIRE` (default) or
     * `ACQUIRE`. If set to `ACQUIRE` and resources do not already exist,
     * the deployment will fail. Note that updating this field does not
     * actually affect the deployment, just how it is updated.
     * Default value is `CREATE_OR_ACQUIRE`.
     * Possible values are `ACQUIRE` and `CREATE_OR_ACQUIRE`.
     * 
     */
    public Output<Optional<String>> createPolicy() {
        return Codegen.optional(this.createPolicy);
    }
    /**
     * Set the policy to use for deleting new resources on update/delete.
     * Valid values are `DELETE` (default) or `ABANDON`. If `DELETE`,
     * resource is deleted after removal from Deployment Manager. If
     * `ABANDON`, the resource is only removed from Deployment Manager
     * and is not actually deleted. Note that updating this field does not
     * actually change the deployment, just how it is updated.
     * Default value is `DELETE`.
     * Possible values are `ABANDON` and `DELETE`.
     * 
     */
    @Export(name="deletePolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> deletePolicy;

    /**
     * @return Set the policy to use for deleting new resources on update/delete.
     * Valid values are `DELETE` (default) or `ABANDON`. If `DELETE`,
     * resource is deleted after removal from Deployment Manager. If
     * `ABANDON`, the resource is only removed from Deployment Manager
     * and is not actually deleted. Note that updating this field does not
     * actually change the deployment, just how it is updated.
     * Default value is `DELETE`.
     * Possible values are `ABANDON` and `DELETE`.
     * 
     */
    public Output<Optional<String>> deletePolicy() {
        return Codegen.optional(this.deletePolicy);
    }
    /**
     * Unique identifier for deployment. Output only.
     * 
     */
    @Export(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    /**
     * @return Unique identifier for deployment. Output only.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }
    /**
     * Optional user-provided description of deployment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Optional user-provided description of deployment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Key-value pairs to apply to this labels.
     * Structure is documented below.
     * 
     */
    @Export(name="labels", type=List.class, parameters={DeploymentLabel.class})
    private Output</* @Nullable */ List<DeploymentLabel>> labels;

    /**
     * @return Key-value pairs to apply to this labels.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<DeploymentLabel>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Output only. URL of the manifest representing the last manifest that was successfully deployed.
     * 
     */
    @Export(name="manifest", type=String.class, parameters={})
    private Output<String> manifest;

    /**
     * @return Output only. URL of the manifest representing the last manifest that was successfully deployed.
     * 
     */
    public Output<String> manifest() {
        return this.manifest;
    }
    /**
     * The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * If set to true, a deployment is created with &#34;shell&#34; resources
     * that are not actually instantiated. This allows you to preview a
     * deployment. It can be updated to false to actually deploy
     * with real resources.
     * ~&gt;**NOTE:** Deployment Manager does not allow update
     * of a deployment in preview (unless updating to preview=false). Thus,
     * the provider will force-recreate deployments if either preview is updated
     * to true or if other fields are updated while preview is true.
     * 
     */
    @Export(name="preview", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> preview;

    /**
     * @return If set to true, a deployment is created with &#34;shell&#34; resources
     * that are not actually instantiated. This allows you to preview a
     * deployment. It can be updated to false to actually deploy
     * with real resources.
     * ~&gt;**NOTE:** Deployment Manager does not allow update
     * of a deployment in preview (unless updating to preview=false). Thus,
     * the provider will force-recreate deployments if either preview is updated
     * to true or if other fields are updated while preview is true.
     * 
     */
    public Output<Optional<Boolean>> preview() {
        return Codegen.optional(this.preview);
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
     * Output only. Server defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Output only. Server defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Parameters that define your deployment, including the deployment
     * configuration and relevant templates.
     * Structure is documented below.
     * 
     */
    @Export(name="target", type=DeploymentTarget.class, parameters={})
    private Output<DeploymentTarget> target;

    /**
     * @return Parameters that define your deployment, including the deployment
     * configuration and relevant templates.
     * Structure is documented below.
     * 
     */
    public Output<DeploymentTarget> target() {
        return this.target;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:deploymentmanager/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:deploymentmanager/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
