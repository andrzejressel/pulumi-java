// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1.ConfigArgs;
import io.pulumi.googlenative.apigateway_v1.outputs.ApigatewayApiConfigFileResponse;
import io.pulumi.googlenative.apigateway_v1.outputs.ApigatewayApiConfigGrpcServiceDefinitionResponse;
import io.pulumi.googlenative.apigateway_v1.outputs.ApigatewayApiConfigOpenApiDocumentResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new ApiConfig in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigateway/v1:Config")
public class Config extends io.pulumi.resources.CustomResource {
    /**
     * Created time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Created time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. Display name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
     */
    @Export(name="gatewayServiceAccount", type=String.class, parameters={})
    private Output<String> gatewayServiceAccount;

    /**
     * @return Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
     */
    public Output<String> getGatewayServiceAccount() {
        return this.gatewayServiceAccount;
    }
    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
     */
    @Export(name="grpcServices", type=List.class, parameters={ApigatewayApiConfigGrpcServiceDefinitionResponse.class})
    private Output<List<ApigatewayApiConfigGrpcServiceDefinitionResponse>> grpcServices;

    /**
     * @return Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
     */
    public Output<List<ApigatewayApiConfigGrpcServiceDefinitionResponse>> getGrpcServices() {
        return this.grpcServices;
    }
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
     */
    @Export(name="managedServiceConfigs", type=List.class, parameters={ApigatewayApiConfigFileResponse.class})
    private Output<List<ApigatewayApiConfigFileResponse>> managedServiceConfigs;

    /**
     * @return Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
     */
    public Output<List<ApigatewayApiConfigFileResponse>> getManagedServiceConfigs() {
        return this.managedServiceConfigs;
    }
    /**
     * Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
     */
    @Export(name="openapiDocuments", type=List.class, parameters={ApigatewayApiConfigOpenApiDocumentResponse.class})
    private Output<List<ApigatewayApiConfigOpenApiDocumentResponse>> openapiDocuments;

    /**
     * @return Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
     */
    public Output<List<ApigatewayApiConfigOpenApiDocumentResponse>> getOpenapiDocuments() {
        return this.openapiDocuments;
    }
    /**
     * The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    @Export(name="serviceConfigId", type=String.class, parameters={})
    private Output<String> serviceConfigId;

    /**
     * @return The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    public Output<String> getServiceConfigId() {
        return this.serviceConfigId;
    }
    /**
     * State of the API Config.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the API Config.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Updated time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Updated time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(ConfigArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigateway_v1.ConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigateway_v1.ConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Config(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Config(String name) {
        this(name, ConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Config(String name, ConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Config(String name, ConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:Config", name, args == null ? ConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Config(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:Config", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Config get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Config(name, id, options);
    }
}
