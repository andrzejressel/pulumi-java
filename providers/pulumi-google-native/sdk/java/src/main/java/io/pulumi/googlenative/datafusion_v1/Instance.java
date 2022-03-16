// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datafusion_v1.InstanceArgs;
import io.pulumi.googlenative.datafusion_v1.outputs.AcceleratorResponse;
import io.pulumi.googlenative.datafusion_v1.outputs.CryptoKeyConfigResponse;
import io.pulumi.googlenative.datafusion_v1.outputs.NetworkConfigResponse;
import io.pulumi.googlenative.datafusion_v1.outputs.VersionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Data Fusion instance in the specified project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datafusion/v1:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * List of accelerators enabled for this CDF instance.
     * 
     */
    @Export(name="accelerators", type=List.class, parameters={AcceleratorResponse.class})
    private Output<List<AcceleratorResponse>> accelerators;

    /**
     * @return List of accelerators enabled for this CDF instance.
     * 
     */
    public Output<List<AcceleratorResponse>> getAccelerators() {
        return this.accelerators;
    }
    /**
     * Endpoint on which the REST APIs is accessible.
     * 
     */
    @Export(name="apiEndpoint", type=String.class, parameters={})
    private Output<String> apiEndpoint;

    /**
     * @return Endpoint on which the REST APIs is accessible.
     * 
     */
    public Output<String> getApiEndpoint() {
        return this.apiEndpoint;
    }
    /**
     * Available versions that the instance can be upgraded to using UpdateInstanceRequest.
     * 
     */
    @Export(name="availableVersion", type=List.class, parameters={VersionResponse.class})
    private Output<List<VersionResponse>> availableVersion;

    /**
     * @return Available versions that the instance can be upgraded to using UpdateInstanceRequest.
     * 
     */
    public Output<List<VersionResponse>> getAvailableVersion() {
        return this.availableVersion;
    }
    /**
     * The time the instance was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the instance was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     * 
     */
    @Export(name="cryptoKeyConfig", type=CryptoKeyConfigResponse.class, parameters={})
    private Output<CryptoKeyConfigResponse> cryptoKeyConfig;

    /**
     * @return The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     * 
     */
    public Output<CryptoKeyConfigResponse> getCryptoKeyConfig() {
        return this.cryptoKeyConfig;
    }
    /**
     * User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines. This allows users to have fine-grained access control on Dataproc's accesses to cloud resources.
     * 
     */
    @Export(name="dataprocServiceAccount", type=String.class, parameters={})
    private Output<String> dataprocServiceAccount;

    /**
     * @return User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines. This allows users to have fine-grained access control on Dataproc's accesses to cloud resources.
     * 
     */
    public Output<String> getDataprocServiceAccount() {
        return this.dataprocServiceAccount;
    }
    /**
     * A description of this instance.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of this instance.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * If the instance state is DISABLED, the reason for disabling the instance.
     * 
     */
    @Export(name="disabledReason", type=List.class, parameters={String.class})
    private Output<List<String>> disabledReason;

    /**
     * @return If the instance state is DISABLED, the reason for disabling the instance.
     * 
     */
    public Output<List<String>> getDisabledReason() {
        return this.disabledReason;
    }
    /**
     * Display name for an instance.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name for an instance.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Option to enable granular role-based access control.
     * 
     */
    @Export(name="enableRbac", type=Boolean.class, parameters={})
    private Output<Boolean> enableRbac;

    /**
     * @return Option to enable granular role-based access control.
     * 
     */
    public Output<Boolean> getEnableRbac() {
        return this.enableRbac;
    }
    /**
     * Option to enable Stackdriver Logging.
     * 
     */
    @Export(name="enableStackdriverLogging", type=Boolean.class, parameters={})
    private Output<Boolean> enableStackdriverLogging;

    /**
     * @return Option to enable Stackdriver Logging.
     * 
     */
    public Output<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }
    /**
     * Option to enable Stackdriver Monitoring.
     * 
     */
    @Export(name="enableStackdriverMonitoring", type=Boolean.class, parameters={})
    private Output<Boolean> enableStackdriverMonitoring;

    /**
     * @return Option to enable Stackdriver Monitoring.
     * 
     */
    public Output<Boolean> getEnableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring;
    }
    /**
     * Cloud Storage bucket generated by Data Fusion in the customer project.
     * 
     */
    @Export(name="gcsBucket", type=String.class, parameters={})
    private Output<String> gcsBucket;

    /**
     * @return Cloud Storage bucket generated by Data Fusion in the customer project.
     * 
     */
    public Output<String> getGcsBucket() {
        return this.gcsBucket;
    }
    /**
     * The resource labels for instance to use to annotate any related underlying resources such as Compute Engine VMs. The character '=' is not allowed to be used within the labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The resource labels for instance to use to annotate any related underlying resources such as Compute Engine VMs. The character '=' is not allowed to be used within the labels.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of this instance is in the form of projects/{project}/locations/{location}/instances/{instance}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this instance is in the form of projects/{project}/locations/{location}/instances/{instance}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Network configuration options. These are required when a private Data Fusion instance is to be created.
     * 
     */
    @Export(name="networkConfig", type=NetworkConfigResponse.class, parameters={})
    private Output<NetworkConfigResponse> networkConfig;

    /**
     * @return Network configuration options. These are required when a private Data Fusion instance is to be created.
     * 
     */
    public Output<NetworkConfigResponse> getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    @Export(name="options", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> options;

    /**
     * @return Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    public Output<Map<String,String>> getOptions() {
        return this.options;
    }
    /**
     * P4 service account for the customer project.
     * 
     */
    @Export(name="p4ServiceAccount", type=String.class, parameters={})
    private Output<String> p4ServiceAccount;

    /**
     * @return P4 service account for the customer project.
     * 
     */
    public Output<String> getP4ServiceAccount() {
        return this.p4ServiceAccount;
    }
    /**
     * Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion nodes will have private IP addresses and will not be able to access the public internet.
     * 
     */
    @Export(name="privateInstance", type=Boolean.class, parameters={})
    private Output<Boolean> privateInstance;

    /**
     * @return Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion nodes will have private IP addresses and will not be able to access the public internet.
     * 
     */
    public Output<Boolean> getPrivateInstance() {
        return this.privateInstance;
    }
    /**
     * Endpoint on which the Data Fusion UI is accessible.
     * 
     */
    @Export(name="serviceEndpoint", type=String.class, parameters={})
    private Output<String> serviceEndpoint;

    /**
     * @return Endpoint on which the Data Fusion UI is accessible.
     * 
     */
    public Output<String> getServiceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * The current state of this Data Fusion instance.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of this Data Fusion instance.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    public Output<String> getStateMessage() {
        return this.stateMessage;
    }
    /**
     * The name of the tenant project.
     * 
     */
    @Export(name="tenantProjectId", type=String.class, parameters={})
    private Output<String> tenantProjectId;

    /**
     * @return The name of the tenant project.
     * 
     */
    public Output<String> getTenantProjectId() {
        return this.tenantProjectId;
    }
    /**
     * Instance type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Instance type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The time the instance was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time the instance was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Current version of the Data Fusion. Only specifiable in Update.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Current version of the Data Fusion. Only specifiable in Update.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }
    /**
     * Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER instances use this field.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER instances use this field.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    public interface BuilderApplicator {
        public void apply(InstanceArgs.Builder a);
    }
    private static io.pulumi.googlenative.datafusion_v1.InstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.datafusion_v1.InstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Instance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datafusion/v1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datafusion/v1:Instance", name, null, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
