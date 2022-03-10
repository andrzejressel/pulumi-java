// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseDataCollection;
import io.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseEncryptionProperties;
import io.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseEnvironmentImageRequest;
import io.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseVnetConfiguration;
import io.pulumi.azurenative.machinelearningservices.outputs.ContainerResourceRequirementsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ModelResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ServiceResponseBaseResponseError;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ACIServiceResponseResponse {
    /**
     * Whether or not Application Insights is enabled.
     * 
     */
    private final @Nullable Boolean appInsightsEnabled;
    /**
     * Whether or not authentication is enabled on the service.
     * 
     */
    private final @Nullable Boolean authEnabled;
    /**
     * The CName for the service.
     * 
     */
    private final @Nullable String cname;
    /**
     * The compute environment type for the service.
     * Expected value is 'ACI'.
     * 
     */
    private final String computeType;
    /**
     * The container resource requirements.
     * 
     */
    private final @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
    /**
     * Details of the data collection options specified.
     * 
     */
    private final @Nullable ACIServiceResponseResponseDataCollection dataCollection;
    /**
     * The deployment type for the service.
     * 
     */
    private final @Nullable String deploymentType;
    /**
     * The service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encryption properties.
     * 
     */
    private final @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties;
    /**
     * The Environment, models and assets used for inferencing.
     * 
     */
    private final @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
    /**
     * The error details.
     * 
     */
    private final ServiceResponseBaseResponseError error;
    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    private final @Nullable Map<String,String> kvTags;
    /**
     * The name of the Azure location/region.
     * 
     */
    private final @Nullable String location;
    /**
     * Details on the models and configurations.
     * 
     */
    private final Map<String,Object> modelConfigMap;
    /**
     * The list of models.
     * 
     */
    private final @Nullable List<ModelResponse> models;
    /**
     * The service property dictionary. Properties are immutable.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The public Fqdn for the service.
     * 
     */
    private final @Nullable String publicFqdn;
    /**
     * The public IP address for the service.
     * 
     */
    private final @Nullable String publicIp;
    /**
     * The Uri for sending scoring requests.
     * 
     */
    private final String scoringUri;
    /**
     * The public SSL certificate in PEM format to use if SSL is enabled.
     * 
     */
    private final @Nullable String sslCertificate;
    /**
     * Whether or not SSL is enabled.
     * 
     */
    private final @Nullable Boolean sslEnabled;
    /**
     * The public SSL key in PEM format for the certificate.
     * 
     */
    private final @Nullable String sslKey;
    /**
     * The current state of the service.
     * 
     */
    private final String state;
    /**
     * The Uri for sending swagger requests.
     * 
     */
    private final String swaggerUri;
    /**
     * The virtual network configuration.
     * 
     */
    private final @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration;

    @OutputCustomType.Constructor
    private ACIServiceResponseResponse(
        @OutputCustomType.Parameter("appInsightsEnabled") @Nullable Boolean appInsightsEnabled,
        @OutputCustomType.Parameter("authEnabled") @Nullable Boolean authEnabled,
        @OutputCustomType.Parameter("cname") @Nullable String cname,
        @OutputCustomType.Parameter("computeType") String computeType,
        @OutputCustomType.Parameter("containerResourceRequirements") @Nullable ContainerResourceRequirementsResponse containerResourceRequirements,
        @OutputCustomType.Parameter("dataCollection") @Nullable ACIServiceResponseResponseDataCollection dataCollection,
        @OutputCustomType.Parameter("deploymentType") @Nullable String deploymentType,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("encryptionProperties") @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties,
        @OutputCustomType.Parameter("environmentImageRequest") @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest,
        @OutputCustomType.Parameter("error") ServiceResponseBaseResponseError error,
        @OutputCustomType.Parameter("kvTags") @Nullable Map<String,String> kvTags,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("modelConfigMap") Map<String,Object> modelConfigMap,
        @OutputCustomType.Parameter("models") @Nullable List<ModelResponse> models,
        @OutputCustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @OutputCustomType.Parameter("publicFqdn") @Nullable String publicFqdn,
        @OutputCustomType.Parameter("publicIp") @Nullable String publicIp,
        @OutputCustomType.Parameter("scoringUri") String scoringUri,
        @OutputCustomType.Parameter("sslCertificate") @Nullable String sslCertificate,
        @OutputCustomType.Parameter("sslEnabled") @Nullable Boolean sslEnabled,
        @OutputCustomType.Parameter("sslKey") @Nullable String sslKey,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("swaggerUri") String swaggerUri,
        @OutputCustomType.Parameter("vnetConfiguration") @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration) {
        this.appInsightsEnabled = appInsightsEnabled;
        this.authEnabled = authEnabled;
        this.cname = cname;
        this.computeType = computeType;
        this.containerResourceRequirements = containerResourceRequirements;
        this.dataCollection = dataCollection;
        this.deploymentType = deploymentType;
        this.description = description;
        this.encryptionProperties = encryptionProperties;
        this.environmentImageRequest = environmentImageRequest;
        this.error = error;
        this.kvTags = kvTags;
        this.location = location;
        this.modelConfigMap = modelConfigMap;
        this.models = models;
        this.properties = properties;
        this.publicFqdn = publicFqdn;
        this.publicIp = publicIp;
        this.scoringUri = scoringUri;
        this.sslCertificate = sslCertificate;
        this.sslEnabled = sslEnabled;
        this.sslKey = sslKey;
        this.state = state;
        this.swaggerUri = swaggerUri;
        this.vnetConfiguration = vnetConfiguration;
    }

    /**
     * Whether or not Application Insights is enabled.
     * 
    */
    public Optional<Boolean> getAppInsightsEnabled() {
        return Optional.ofNullable(this.appInsightsEnabled);
    }
    /**
     * Whether or not authentication is enabled on the service.
     * 
    */
    public Optional<Boolean> getAuthEnabled() {
        return Optional.ofNullable(this.authEnabled);
    }
    /**
     * The CName for the service.
     * 
    */
    public Optional<String> getCname() {
        return Optional.ofNullable(this.cname);
    }
    /**
     * The compute environment type for the service.
     * Expected value is 'ACI'.
     * 
    */
    public String getComputeType() {
        return this.computeType;
    }
    /**
     * The container resource requirements.
     * 
    */
    public Optional<ContainerResourceRequirementsResponse> getContainerResourceRequirements() {
        return Optional.ofNullable(this.containerResourceRequirements);
    }
    /**
     * Details of the data collection options specified.
     * 
    */
    public Optional<ACIServiceResponseResponseDataCollection> getDataCollection() {
        return Optional.ofNullable(this.dataCollection);
    }
    /**
     * The deployment type for the service.
     * 
    */
    public Optional<String> getDeploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }
    /**
     * The service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encryption properties.
     * 
    */
    public Optional<ACIServiceResponseResponseEncryptionProperties> getEncryptionProperties() {
        return Optional.ofNullable(this.encryptionProperties);
    }
    /**
     * The Environment, models and assets used for inferencing.
     * 
    */
    public Optional<ACIServiceResponseResponseEnvironmentImageRequest> getEnvironmentImageRequest() {
        return Optional.ofNullable(this.environmentImageRequest);
    }
    /**
     * The error details.
     * 
    */
    public ServiceResponseBaseResponseError getError() {
        return this.error;
    }
    /**
     * The service tag dictionary. Tags are mutable.
     * 
    */
    public Map<String,String> getKvTags() {
        return this.kvTags == null ? Map.of() : this.kvTags;
    }
    /**
     * The name of the Azure location/region.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Details on the models and configurations.
     * 
    */
    public Map<String,Object> getModelConfigMap() {
        return this.modelConfigMap;
    }
    /**
     * The list of models.
     * 
    */
    public List<ModelResponse> getModels() {
        return this.models == null ? List.of() : this.models;
    }
    /**
     * The service property dictionary. Properties are immutable.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The public Fqdn for the service.
     * 
    */
    public Optional<String> getPublicFqdn() {
        return Optional.ofNullable(this.publicFqdn);
    }
    /**
     * The public IP address for the service.
     * 
    */
    public Optional<String> getPublicIp() {
        return Optional.ofNullable(this.publicIp);
    }
    /**
     * The Uri for sending scoring requests.
     * 
    */
    public String getScoringUri() {
        return this.scoringUri;
    }
    /**
     * The public SSL certificate in PEM format to use if SSL is enabled.
     * 
    */
    public Optional<String> getSslCertificate() {
        return Optional.ofNullable(this.sslCertificate);
    }
    /**
     * Whether or not SSL is enabled.
     * 
    */
    public Optional<Boolean> getSslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }
    /**
     * The public SSL key in PEM format for the certificate.
     * 
    */
    public Optional<String> getSslKey() {
        return Optional.ofNullable(this.sslKey);
    }
    /**
     * The current state of the service.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The Uri for sending swagger requests.
     * 
    */
    public String getSwaggerUri() {
        return this.swaggerUri;
    }
    /**
     * The virtual network configuration.
     * 
    */
    public Optional<ACIServiceResponseResponseVnetConfiguration> getVnetConfiguration() {
        return Optional.ofNullable(this.vnetConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean appInsightsEnabled;
        private @Nullable Boolean authEnabled;
        private @Nullable String cname;
        private String computeType;
        private @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
        private @Nullable ACIServiceResponseResponseDataCollection dataCollection;
        private @Nullable String deploymentType;
        private @Nullable String description;
        private @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties;
        private @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
        private ServiceResponseBaseResponseError error;
        private @Nullable Map<String,String> kvTags;
        private @Nullable String location;
        private Map<String,Object> modelConfigMap;
        private @Nullable List<ModelResponse> models;
        private @Nullable Map<String,String> properties;
        private @Nullable String publicFqdn;
        private @Nullable String publicIp;
        private String scoringUri;
        private @Nullable String sslCertificate;
        private @Nullable Boolean sslEnabled;
        private @Nullable String sslKey;
        private String state;
        private String swaggerUri;
        private @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsightsEnabled = defaults.appInsightsEnabled;
    	      this.authEnabled = defaults.authEnabled;
    	      this.cname = defaults.cname;
    	      this.computeType = defaults.computeType;
    	      this.containerResourceRequirements = defaults.containerResourceRequirements;
    	      this.dataCollection = defaults.dataCollection;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.encryptionProperties = defaults.encryptionProperties;
    	      this.environmentImageRequest = defaults.environmentImageRequest;
    	      this.error = defaults.error;
    	      this.kvTags = defaults.kvTags;
    	      this.location = defaults.location;
    	      this.modelConfigMap = defaults.modelConfigMap;
    	      this.models = defaults.models;
    	      this.properties = defaults.properties;
    	      this.publicFqdn = defaults.publicFqdn;
    	      this.publicIp = defaults.publicIp;
    	      this.scoringUri = defaults.scoringUri;
    	      this.sslCertificate = defaults.sslCertificate;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.sslKey = defaults.sslKey;
    	      this.state = defaults.state;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.vnetConfiguration = defaults.vnetConfiguration;
        }

        public Builder setAppInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            this.appInsightsEnabled = appInsightsEnabled;
            return this;
        }

        public Builder setAuthEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }

        public Builder setCname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setContainerResourceRequirements(@Nullable ContainerResourceRequirementsResponse containerResourceRequirements) {
            this.containerResourceRequirements = containerResourceRequirements;
            return this;
        }

        public Builder setDataCollection(@Nullable ACIServiceResponseResponseDataCollection dataCollection) {
            this.dataCollection = dataCollection;
            return this;
        }

        public Builder setDeploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptionProperties(@Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties) {
            this.encryptionProperties = encryptionProperties;
            return this;
        }

        public Builder setEnvironmentImageRequest(@Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest) {
            this.environmentImageRequest = environmentImageRequest;
            return this;
        }

        public Builder setError(ServiceResponseBaseResponseError error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setKvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = kvTags;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setModelConfigMap(Map<String,Object> modelConfigMap) {
            this.modelConfigMap = Objects.requireNonNull(modelConfigMap);
            return this;
        }

        public Builder setModels(@Nullable List<ModelResponse> models) {
            this.models = models;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setPublicFqdn(@Nullable String publicFqdn) {
            this.publicFqdn = publicFqdn;
            return this;
        }

        public Builder setPublicIp(@Nullable String publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        public Builder setScoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }

        public Builder setSslCertificate(@Nullable String sslCertificate) {
            this.sslCertificate = sslCertificate;
            return this;
        }

        public Builder setSslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        public Builder setSslKey(@Nullable String sslKey) {
            this.sslKey = sslKey;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSwaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }

        public Builder setVnetConfiguration(@Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration) {
            this.vnetConfiguration = vnetConfiguration;
            return this;
        }
        public ACIServiceResponseResponse build() {
            return new ACIServiceResponseResponse(appInsightsEnabled, authEnabled, cname, computeType, containerResourceRequirements, dataCollection, deploymentType, description, encryptionProperties, environmentImageRequest, error, kvTags, location, modelConfigMap, models, properties, publicFqdn, publicIp, scoringUri, sslCertificate, sslEnabled, sslKey, state, swaggerUri, vnetConfiguration);
        }
    }
}
