// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs;
import com.pulumi.gcp.identityplatform.inputs.TenantOauthIdpConfigState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * OIDC IdP configuration for a Identity Toolkit project within a tenant.
 * 
 * You must enable the
 * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
 * the marketplace prior to using this resource.
 * 
 * ## Example Usage
 * ### Identity Platform Tenant Oauth Idp Config Basic
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
 *         var tenant = new Tenant(&#34;tenant&#34;, TenantArgs.builder()        
 *             .displayName(&#34;tenant&#34;)
 *             .build());
 * 
 *         var tenantOauthIdpConfig = new TenantOauthIdpConfig(&#34;tenantOauthIdpConfig&#34;, TenantOauthIdpConfigArgs.builder()        
 *             .tenant(tenant.getName())
 *             .displayName(&#34;Display Name&#34;)
 *             .clientId(&#34;client-id&#34;)
 *             .issuer(&#34;issuer&#34;)
 *             .enabled(true)
 *             .clientSecret(&#34;secret&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * TenantOauthIdpConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default projects/{{project}}/tenants/{{tenant}}/oauthIdpConfigs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default {{project}}/{{tenant}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default {{tenant}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig")
public class TenantOauthIdpConfig extends com.pulumi.resources.CustomResource {
    /**
     * The client id of an OAuth client.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The client id of an OAuth client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * Human friendly display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human friendly display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * If this config allows users to sign in with the provider.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If this config allows users to sign in with the provider.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * For OIDC Idps, the issuer identifier.
     * 
     */
    @Export(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    /**
     * @return For OIDC Idps, the issuer identifier.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * The name of the OauthIdpConfig. Must start with `oidc.`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the OauthIdpConfig. Must start with `oidc.`.
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
     * The name of the tenant where this OIDC IDP configuration resource exists
     * 
     */
    @Export(name="tenant", type=String.class, parameters={})
    private Output<String> tenant;

    /**
     * @return The name of the tenant where this OIDC IDP configuration resource exists
     * 
     */
    public Output<String> tenant() {
        return this.tenant;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TenantOauthIdpConfig(String name) {
        this(name, TenantOauthIdpConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TenantOauthIdpConfig(String name, TenantOauthIdpConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TenantOauthIdpConfig(String name, TenantOauthIdpConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig", name, args == null ? TenantOauthIdpConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TenantOauthIdpConfig(String name, Output<String> id, @Nullable TenantOauthIdpConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig", name, state, makeResourceOptions(options, id));
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
    public static TenantOauthIdpConfig get(String name, Output<String> id, @Nullable TenantOauthIdpConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TenantOauthIdpConfig(name, id, state, options);
    }
}
