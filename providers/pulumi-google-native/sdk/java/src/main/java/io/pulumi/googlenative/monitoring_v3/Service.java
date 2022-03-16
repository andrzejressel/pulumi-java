// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v3.ServiceArgs;
import io.pulumi.googlenative.monitoring_v3.outputs.AppEngineResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.CloudEndpointsResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.ClusterIstioResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.CustomResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.IstioCanonicalServiceResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.MeshIstioResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.TelemetryResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a Service.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:monitoring/v3:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * Type used for App Engine services.
     * 
     */
    @Export(name="appEngine", type=AppEngineResponse.class, parameters={})
    private Output<AppEngineResponse> appEngine;

    /**
     * @return Type used for App Engine services.
     * 
     */
    public Output<AppEngineResponse> getAppEngine() {
        return this.appEngine;
    }
    /**
     * Type used for Cloud Endpoints services.
     * 
     */
    @Export(name="cloudEndpoints", type=CloudEndpointsResponse.class, parameters={})
    private Output<CloudEndpointsResponse> cloudEndpoints;

    /**
     * @return Type used for Cloud Endpoints services.
     * 
     */
    public Output<CloudEndpointsResponse> getCloudEndpoints() {
        return this.cloudEndpoints;
    }
    /**
     * Type used for Istio services that live in a Kubernetes cluster.
     * 
     */
    @Export(name="clusterIstio", type=ClusterIstioResponse.class, parameters={})
    private Output<ClusterIstioResponse> clusterIstio;

    /**
     * @return Type used for Istio services that live in a Kubernetes cluster.
     * 
     */
    public Output<ClusterIstioResponse> getClusterIstio() {
        return this.clusterIstio;
    }
    /**
     * Custom service type.
     * 
     */
    @Export(name="custom", type=CustomResponse.class, parameters={})
    private Output<CustomResponse> custom;

    /**
     * @return Custom service type.
     * 
     */
    public Output<CustomResponse> getCustom() {
        return this.custom;
    }
    /**
     * Name used for UI elements listing this Service.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Name used for UI elements listing this Service.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/)
     * 
     */
    @Export(name="istioCanonicalService", type=IstioCanonicalServiceResponse.class, parameters={})
    private Output<IstioCanonicalServiceResponse> istioCanonicalService;

    /**
     * @return Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/)
     * 
     */
    public Output<IstioCanonicalServiceResponse> getIstioCanonicalService() {
        return this.istioCanonicalService;
    }
    /**
     * Type used for Istio services scoped to an Istio mesh.
     * 
     */
    @Export(name="meshIstio", type=MeshIstioResponse.class, parameters={})
    private Output<MeshIstioResponse> meshIstio;

    /**
     * @return Type used for Istio services scoped to an Istio mesh.
     * 
     */
    public Output<MeshIstioResponse> getMeshIstio() {
        return this.meshIstio;
    }
    /**
     * Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration for how to query telemetry on a Service.
     * 
     */
    @Export(name="telemetry", type=TelemetryResponse.class, parameters={})
    private Output<TelemetryResponse> telemetry;

    /**
     * @return Configuration for how to query telemetry on a Service.
     * 
     */
    public Output<TelemetryResponse> getTelemetry() {
        return this.telemetry;
    }
    /**
     * Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    @Export(name="userLabels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> userLabels;

    /**
     * @return Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    public Output<Map<String,String>> getUserLabels() {
        return this.userLabels;
    }

    public interface BuilderApplicator {
        public void apply(ServiceArgs.Builder a);
    }
    private static io.pulumi.googlenative.monitoring_v3.ServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.monitoring_v3.ServiceArgs.builder();
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
        super("google-native:monitoring/v3:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Service(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:Service", name, null, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
