// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.RegionNetworkEndpointGroupNetworkEndpointType;
import io.pulumi.googlenative.compute_v1.inputs.NetworkEndpointGroupAppEngineArgs;
import io.pulumi.googlenative.compute_v1.inputs.NetworkEndpointGroupCloudFunctionArgs;
import io.pulumi.googlenative.compute_v1.inputs.NetworkEndpointGroupCloudRunArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupArgs Empty = new RegionNetworkEndpointGroupArgs();

    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @InputImport(name="appEngine")
    private final @Nullable Input<NetworkEndpointGroupAppEngineArgs> appEngine;

    public Input<NetworkEndpointGroupAppEngineArgs> getAppEngine() {
        return this.appEngine == null ? Input.empty() : this.appEngine;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @InputImport(name="cloudFunction")
    private final @Nullable Input<NetworkEndpointGroupCloudFunctionArgs> cloudFunction;

    public Input<NetworkEndpointGroupCloudFunctionArgs> getCloudFunction() {
        return this.cloudFunction == null ? Input.empty() : this.cloudFunction;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @InputImport(name="cloudRun")
    private final @Nullable Input<NetworkEndpointGroupCloudRunArgs> cloudRun;

    public Input<NetworkEndpointGroupCloudRunArgs> getCloudRun() {
        return this.cloudRun == null ? Input.empty() : this.cloudRun;
    }

    /**
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    @InputImport(name="defaultPort")
    private final @Nullable Input<Integer> defaultPort;

    public Input<Integer> getDefaultPort() {
        return this.defaultPort == null ? Input.empty() : this.defaultPort;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    @InputImport(name="networkEndpointType")
    private final @Nullable Input<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType;

    public Input<RegionNetworkEndpointGroupNetworkEndpointType> getNetworkEndpointType() {
        return this.networkEndpointType == null ? Input.empty() : this.networkEndpointType;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The target service url used to set up private service connection to a Google API. An example value is: "asia-northeast3-cloudkms.googleapis.com"
     * 
     */
    @InputImport(name="pscTargetService")
    private final @Nullable Input<String> pscTargetService;

    public Input<String> getPscTargetService() {
        return this.pscTargetService == null ? Input.empty() : this.pscTargetService;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @InputImport(name="subnetwork")
    private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    public RegionNetworkEndpointGroupArgs(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<NetworkEndpointGroupAppEngineArgs> appEngine,
        @Nullable Input<NetworkEndpointGroupCloudFunctionArgs> cloudFunction,
        @Nullable Input<NetworkEndpointGroupCloudRunArgs> cloudRun,
        @Nullable Input<Integer> defaultPort,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType,
        @Nullable Input<String> project,
        @Nullable Input<String> pscTargetService,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<String> subnetwork) {
        this.annotations = annotations;
        this.appEngine = appEngine;
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.defaultPort = defaultPort;
        this.description = description;
        this.name = name;
        this.network = network;
        this.networkEndpointType = networkEndpointType;
        this.project = project;
        this.pscTargetService = pscTargetService;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.subnetwork = subnetwork;
    }

    private RegionNetworkEndpointGroupArgs() {
        this.annotations = Input.empty();
        this.appEngine = Input.empty();
        this.cloudFunction = Input.empty();
        this.cloudRun = Input.empty();
        this.defaultPort = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.networkEndpointType = Input.empty();
        this.project = Input.empty();
        this.pscTargetService = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<NetworkEndpointGroupAppEngineArgs> appEngine;
        private @Nullable Input<NetworkEndpointGroupCloudFunctionArgs> cloudFunction;
        private @Nullable Input<NetworkEndpointGroupCloudRunArgs> cloudRun;
        private @Nullable Input<Integer> defaultPort;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType;
        private @Nullable Input<String> project;
        private @Nullable Input<String> pscTargetService;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.appEngine = defaults.appEngine;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.project = defaults.project;
    	      this.pscTargetService = defaults.pscTargetService;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAppEngine(@Nullable Input<NetworkEndpointGroupAppEngineArgs> appEngine) {
            this.appEngine = appEngine;
            return this;
        }

        public Builder setAppEngine(@Nullable NetworkEndpointGroupAppEngineArgs appEngine) {
            this.appEngine = Input.ofNullable(appEngine);
            return this;
        }

        public Builder setCloudFunction(@Nullable Input<NetworkEndpointGroupCloudFunctionArgs> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }

        public Builder setCloudFunction(@Nullable NetworkEndpointGroupCloudFunctionArgs cloudFunction) {
            this.cloudFunction = Input.ofNullable(cloudFunction);
            return this;
        }

        public Builder setCloudRun(@Nullable Input<NetworkEndpointGroupCloudRunArgs> cloudRun) {
            this.cloudRun = cloudRun;
            return this;
        }

        public Builder setCloudRun(@Nullable NetworkEndpointGroupCloudRunArgs cloudRun) {
            this.cloudRun = Input.ofNullable(cloudRun);
            return this;
        }

        public Builder setDefaultPort(@Nullable Input<Integer> defaultPort) {
            this.defaultPort = defaultPort;
            return this;
        }

        public Builder setDefaultPort(@Nullable Integer defaultPort) {
            this.defaultPort = Input.ofNullable(defaultPort);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNetworkEndpointType(@Nullable Input<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType) {
            this.networkEndpointType = networkEndpointType;
            return this;
        }

        public Builder setNetworkEndpointType(@Nullable RegionNetworkEndpointGroupNetworkEndpointType networkEndpointType) {
            this.networkEndpointType = Input.ofNullable(networkEndpointType);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPscTargetService(@Nullable Input<String> pscTargetService) {
            this.pscTargetService = pscTargetService;
            return this;
        }

        public Builder setPscTargetService(@Nullable String pscTargetService) {
            this.pscTargetService = Input.ofNullable(pscTargetService);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }

        public RegionNetworkEndpointGroupArgs build() {
            return new RegionNetworkEndpointGroupArgs(annotations, appEngine, cloudFunction, cloudRun, defaultPort, description, name, network, networkEndpointType, project, pscTargetService, region, requestId, subnetwork);
        }
    }
}
