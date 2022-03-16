// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.endpoints.ServiceArgs;
import io.pulumi.gcp.endpoints.inputs.ServiceState;
import io.pulumi.gcp.endpoints.outputs.ServiceApi;
import io.pulumi.gcp.endpoints.outputs.ServiceEndpoint;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource creates and rolls out a Cloud Endpoints service using OpenAPI or gRPC.  View the relevant docs for [OpenAPI](https://cloud.google.com/endpoints/docs/openapi/) and [gRPC](https://cloud.google.com/endpoints/docs/grpc/).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:endpoints/service:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * A list of API objects.
     * 
     */
    @Export(name="apis", type=List.class, parameters={ServiceApi.class})
    private Output<List<ServiceApi>> apis;

    /**
     * @return A list of API objects.
     * 
     */
    public Output<List<ServiceApi>> getApis() {
        return this.apis;
    }
    /**
     * The autogenerated ID for the configuration that is rolled out as part of the creation of this resource. Must be provided
     * to compute engine instances as a tag.
     * 
     */
    @Export(name="configId", type=String.class, parameters={})
    private Output<String> configId;

    /**
     * @return The autogenerated ID for the configuration that is rolled out as part of the creation of this resource. Must be provided
     * to compute engine instances as a tag.
     * 
     */
    public Output<String> getConfigId() {
        return this.configId;
    }
    /**
     * The address at which the service can be found - usually the same as the service name.
     * 
     */
    @Export(name="dnsAddress", type=String.class, parameters={})
    private Output<String> dnsAddress;

    /**
     * @return The address at which the service can be found - usually the same as the service name.
     * 
     */
    public Output<String> getDnsAddress() {
        return this.dnsAddress;
    }
    /**
     * A list of Endpoint objects.
     * 
     */
    @Export(name="endpoints", type=List.class, parameters={ServiceEndpoint.class})
    private Output<List<ServiceEndpoint>> endpoints;

    /**
     * @return A list of Endpoint objects.
     * 
     */
    public Output<List<ServiceEndpoint>> getEndpoints() {
        return this.endpoints;
    }
    /**
     * The full text of the Service Config YAML file (Example located here). If provided, must also provide
     * protoc_output_base64. open_api config must not be provided.
     * 
     */
    @Export(name="grpcConfig", type=String.class, parameters={})
    private Output</* @Nullable */ String> grpcConfig;

    /**
     * @return The full text of the Service Config YAML file (Example located here). If provided, must also provide
     * protoc_output_base64. open_api config must not be provided.
     * 
     */
    public Output</* @Nullable */ String> getGrpcConfig() {
        return this.grpcConfig;
    }
    /**
     * The full text of the OpenAPI YAML configuration as described here. Either this, or both of grpc_config and
     * protoc_output_base64 must be specified.
     * 
     */
    @Export(name="openapiConfig", type=String.class, parameters={})
    private Output</* @Nullable */ String> openapiConfig;

    /**
     * @return The full text of the OpenAPI YAML configuration as described here. Either this, or both of grpc_config and
     * protoc_output_base64 must be specified.
     * 
     */
    public Output</* @Nullable */ String> getOpenapiConfig() {
        return this.openapiConfig;
    }
    /**
     * The project ID that the service belongs to. If not provided, provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project ID that the service belongs to. If not provided, provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The full contents of the Service Descriptor File generated by protoc. This should be a compiled .pb file,
     * base64-encoded.
     * 
     */
    @Export(name="protocOutputBase64", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocOutputBase64;

    /**
     * @return The full contents of the Service Descriptor File generated by protoc. This should be a compiled .pb file,
     * base64-encoded.
     * 
     */
    public Output</* @Nullable */ String> getProtocOutputBase64() {
        return this.protocOutputBase64;
    }
    /**
     * The name of the service. Usually of the form $apiname.endpoints.$projectid.cloud.goog.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return The name of the service. Usually of the form $apiname.endpoints.$projectid.cloud.goog.
     * 
     */
    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public interface BuilderApplicator {
        public void apply(ServiceArgs.Builder a);
    }
    private static io.pulumi.gcp.endpoints.ServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.endpoints.ServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Service(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:endpoints/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:endpoints/service:Service", name, state, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}
