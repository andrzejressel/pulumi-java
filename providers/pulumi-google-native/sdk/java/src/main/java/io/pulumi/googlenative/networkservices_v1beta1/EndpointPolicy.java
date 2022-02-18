// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkservices_v1beta1.EndpointPolicyArgs;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.EndpointMatcherResponse;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.TrafficPortSelectorResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new EndpointPolicy in a given project and location.
 * 
 */
@ResourceType(type="google-native:networkservices/v1beta1:EndpointPolicy")
public class EndpointPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    @OutputExport(name="authorizationPolicy", type=String.class, parameters={})
    private Output<String> authorizationPolicy;

    /**
     * @return Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    public Output<String> getAuthorizationPolicy() {
        return this.authorizationPolicy;
    }
    /**
     * Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    @OutputExport(name="clientTlsPolicy", type=String.class, parameters={})
    private Output<String> clientTlsPolicy;

    /**
     * @return Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    public Output<String> getClientTlsPolicy() {
        return this.clientTlsPolicy;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    @OutputExport(name="endpointMatcher", type=EndpointMatcherResponse.class, parameters={})
    private Output<EndpointMatcherResponse> endpointMatcher;

    /**
     * @return A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    public Output<EndpointMatcherResponse> getEndpointMatcher() {
        return this.endpointMatcher;
    }
    /**
     * Optional. Set of label tags associated with the EndpointPolicy resource.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the EndpointPolicy resource.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    @OutputExport(name="serverTlsPolicy", type=String.class, parameters={})
    private Output<String> serverTlsPolicy;

    /**
     * @return Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    public Output<String> getServerTlsPolicy() {
        return this.serverTlsPolicy;
    }
    /**
     * Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    @OutputExport(name="trafficPortSelector", type=TrafficPortSelectorResponse.class, parameters={})
    private Output<TrafficPortSelectorResponse> trafficPortSelector;

    /**
     * @return Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    public Output<TrafficPortSelectorResponse> getTrafficPortSelector() {
        return this.trafficPortSelector;
    }
    /**
     * The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EndpointPolicy(String name, EndpointPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkservices/v1beta1:EndpointPolicy", name, args == null ? EndpointPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EndpointPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkservices/v1beta1:EndpointPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EndpointPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EndpointPolicy(name, id, options);
    }
}
