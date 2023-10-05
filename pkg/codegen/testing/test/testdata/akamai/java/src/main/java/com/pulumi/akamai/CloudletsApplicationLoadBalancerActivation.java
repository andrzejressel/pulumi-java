// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.CloudletsApplicationLoadBalancerActivationArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.CloudletsApplicationLoadBalancerActivationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/cloudletsApplicationLoadBalancerActivation:CloudletsApplicationLoadBalancerActivation")
public class CloudletsApplicationLoadBalancerActivation extends com.pulumi.resources.CustomResource {
    /**
     * The network you want to activate the application load balancer version on (options are Staging and Production)
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return The network you want to activate the application load balancer version on (options are Staging and Production)
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The conditional origin’s unique identifier
     * 
     */
    @Export(name="originId", refs={String.class}, tree="[0]")
    private Output<String> originId;

    /**
     * @return The conditional origin’s unique identifier
     * 
     */
    public Output<String> originId() {
        return this.originId;
    }
    /**
     * Activation status for this application load balancer
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Activation status for this application load balancer
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Cloudlets application load balancer version you want to activate
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return Cloudlets application load balancer version you want to activate
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudletsApplicationLoadBalancerActivation(String name) {
        this(name, CloudletsApplicationLoadBalancerActivationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudletsApplicationLoadBalancerActivation(String name, CloudletsApplicationLoadBalancerActivationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudletsApplicationLoadBalancerActivation(String name, CloudletsApplicationLoadBalancerActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudletsApplicationLoadBalancerActivation:CloudletsApplicationLoadBalancerActivation", name, args == null ? CloudletsApplicationLoadBalancerActivationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudletsApplicationLoadBalancerActivation(String name, Output<String> id, @Nullable CloudletsApplicationLoadBalancerActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudletsApplicationLoadBalancerActivation:CloudletsApplicationLoadBalancerActivation", name, state, makeResourceOptions(options, id));
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
    public static CloudletsApplicationLoadBalancerActivation get(String name, Output<String> id, @Nullable CloudletsApplicationLoadBalancerActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudletsApplicationLoadBalancerActivation(name, id, state, options);
    }
}
