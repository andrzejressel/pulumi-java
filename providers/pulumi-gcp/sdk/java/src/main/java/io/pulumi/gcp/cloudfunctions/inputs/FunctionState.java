// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerGetArgs;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionState extends io.pulumi.resources.ResourceArgs {

    public static final FunctionState Empty = new FunctionState();

    /**
     * Memory (in MB), available to the function. Default value is `256`. Possible values include `128`, `256`, `512`, `1024`, etc.
     * 
     */
    @InputImport(name="availableMemoryMb")
    private final @Nullable Input<Integer> availableMemoryMb;

    public Input<Integer> getAvailableMemoryMb() {
        return this.availableMemoryMb == null ? Input.empty() : this.availableMemoryMb;
    }

    /**
     * A set of key/value environment variable pairs available during build time.
     * 
     */
    @InputImport(name="buildEnvironmentVariables")
    private final @Nullable Input<Map<String,Object>> buildEnvironmentVariables;

    public Input<Map<String,Object>> getBuildEnvironmentVariables() {
        return this.buildEnvironmentVariables == null ? Input.empty() : this.buildEnvironmentVariables;
    }

    /**
     * Description of the function.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the function that will be executed when the Google Cloud Function is triggered.
     * 
     */
    @InputImport(name="entryPoint")
    private final @Nullable Input<String> entryPoint;

    public Input<String> getEntryPoint() {
        return this.entryPoint == null ? Input.empty() : this.entryPoint;
    }

    /**
     * A set of key/value environment variable pairs to assign to the function.
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable Input<Map<String,Object>> environmentVariables;

    public Input<Map<String,Object>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `trigger_http`.
     * 
     */
    @InputImport(name="eventTrigger")
    private final @Nullable Input<FunctionEventTriggerGetArgs> eventTrigger;

    public Input<FunctionEventTriggerGetArgs> getEventTrigger() {
        return this.eventTrigger == null ? Input.empty() : this.eventTrigger;
    }

    /**
     * URL which triggers function execution. Returned only if `trigger_http` is used.
     * 
     */
    @InputImport(name="httpsTriggerUrl")
    private final @Nullable Input<String> httpsTriggerUrl;

    public Input<String> getHttpsTriggerUrl() {
        return this.httpsTriggerUrl == null ? Input.empty() : this.httpsTriggerUrl;
    }

    /**
     * String value that controls what traffic can reach the function. Allowed values are `ALLOW_ALL`, `ALLOW_INTERNAL_AND_GCLB` and `ALLOW_INTERNAL_ONLY`. Check [ingress documentation](https://cloud.google.com/functions/docs/networking/network-settings#ingress_settings) to see the impact of each settings value. Changes to this field will recreate the cloud function.
     * 
     */
    @InputImport(name="ingressSettings")
    private final @Nullable Input<String> ingressSettings;

    public Input<String> getIngressSettings() {
        return this.ingressSettings == null ? Input.empty() : this.ingressSettings;
    }

    /**
     * A set of key/value label pairs to assign to the function. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,Object>> labels;

    public Input<Map<String,Object>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The limit on the maximum number of function instances that may coexist at a given time.
     * 
     */
    @InputImport(name="maxInstances")
    private final @Nullable Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances == null ? Input.empty() : this.maxInstances;
    }

    /**
     * The limit on the minimum number of function instances that may coexist at a given time.
     * 
     */
    @InputImport(name="minInstances")
    private final @Nullable Input<Integer> minInstances;

    public Input<Integer> getMinInstances() {
        return this.minInstances == null ? Input.empty() : this.minInstances;
    }

    /**
     * A user-defined name of the function. Function names must be unique globally.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Project of the function. If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Region of function. If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The runtime in which the function is going to run.
     * Eg. `"nodejs10"`, `"nodejs12"`, `"nodejs14"`, `"python37"`, `"python38"`, `"python39"`, `"dotnet3"`, `"go113"`, `"java11"`, `"ruby27"`, etc. Check the [official doc](https://cloud.google.com/functions/docs/concepts/exec#runtimes) for the up-to-date list.
     * 
     */
    @InputImport(name="runtime")
    private final @Nullable Input<String> runtime;

    public Input<String> getRuntime() {
        return this.runtime == null ? Input.empty() : this.runtime;
    }

    /**
     * If provided, the self-provided service account to run the function with.
     * 
     */
    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    /**
     * The GCS bucket containing the zip archive which contains the function.
     * 
     */
    @InputImport(name="sourceArchiveBucket")
    private final @Nullable Input<String> sourceArchiveBucket;

    public Input<String> getSourceArchiveBucket() {
        return this.sourceArchiveBucket == null ? Input.empty() : this.sourceArchiveBucket;
    }

    /**
     * The source archive object (file) in archive bucket.
     * 
     */
    @InputImport(name="sourceArchiveObject")
    private final @Nullable Input<String> sourceArchiveObject;

    public Input<String> getSourceArchiveObject() {
        return this.sourceArchiveObject == null ? Input.empty() : this.sourceArchiveObject;
    }

    /**
     * Represents parameters related to source repository where a function is hosted.
     * Cannot be set alongside `source_archive_bucket` or `source_archive_object`. Structure is documented below.
     * 
     */
    @InputImport(name="sourceRepository")
    private final @Nullable Input<FunctionSourceRepositoryGetArgs> sourceRepository;

    public Input<FunctionSourceRepositoryGetArgs> getSourceRepository() {
        return this.sourceRepository == null ? Input.empty() : this.sourceRepository;
    }

    /**
     * Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `event_trigger`.
     * 
     */
    @InputImport(name="triggerHttp")
    private final @Nullable Input<Boolean> triggerHttp;

    public Input<Boolean> getTriggerHttp() {
        return this.triggerHttp == null ? Input.empty() : this.triggerHttp;
    }

    /**
     * The VPC Network Connector that this cloud function can connect to. It should be set up as fully-qualified URI. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    @InputImport(name="vpcConnector")
    private final @Nullable Input<String> vpcConnector;

    public Input<String> getVpcConnector() {
        return this.vpcConnector == null ? Input.empty() : this.vpcConnector;
    }

    /**
     * The egress settings for the connector, controlling what traffic is diverted through it. Allowed values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`. Defaults to `PRIVATE_RANGES_ONLY`. If unset, this field preserves the previously set value.
     * 
     */
    @InputImport(name="vpcConnectorEgressSettings")
    private final @Nullable Input<String> vpcConnectorEgressSettings;

    public Input<String> getVpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings == null ? Input.empty() : this.vpcConnectorEgressSettings;
    }

    public FunctionState(
        @Nullable Input<Integer> availableMemoryMb,
        @Nullable Input<Map<String,Object>> buildEnvironmentVariables,
        @Nullable Input<String> description,
        @Nullable Input<String> entryPoint,
        @Nullable Input<Map<String,Object>> environmentVariables,
        @Nullable Input<FunctionEventTriggerGetArgs> eventTrigger,
        @Nullable Input<String> httpsTriggerUrl,
        @Nullable Input<String> ingressSettings,
        @Nullable Input<Map<String,Object>> labels,
        @Nullable Input<Integer> maxInstances,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> runtime,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> sourceArchiveBucket,
        @Nullable Input<String> sourceArchiveObject,
        @Nullable Input<FunctionSourceRepositoryGetArgs> sourceRepository,
        @Nullable Input<Integer> timeout,
        @Nullable Input<Boolean> triggerHttp,
        @Nullable Input<String> vpcConnector,
        @Nullable Input<String> vpcConnectorEgressSettings) {
        this.availableMemoryMb = availableMemoryMb;
        this.buildEnvironmentVariables = buildEnvironmentVariables;
        this.description = description;
        this.entryPoint = entryPoint;
        this.environmentVariables = environmentVariables;
        this.eventTrigger = eventTrigger;
        this.httpsTriggerUrl = httpsTriggerUrl;
        this.ingressSettings = ingressSettings;
        this.labels = labels;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.name = name;
        this.project = project;
        this.region = region;
        this.runtime = runtime;
        this.serviceAccountEmail = serviceAccountEmail;
        this.sourceArchiveBucket = sourceArchiveBucket;
        this.sourceArchiveObject = sourceArchiveObject;
        this.sourceRepository = sourceRepository;
        this.timeout = timeout;
        this.triggerHttp = triggerHttp;
        this.vpcConnector = vpcConnector;
        this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
    }

    private FunctionState() {
        this.availableMemoryMb = Input.empty();
        this.buildEnvironmentVariables = Input.empty();
        this.description = Input.empty();
        this.entryPoint = Input.empty();
        this.environmentVariables = Input.empty();
        this.eventTrigger = Input.empty();
        this.httpsTriggerUrl = Input.empty();
        this.ingressSettings = Input.empty();
        this.labels = Input.empty();
        this.maxInstances = Input.empty();
        this.minInstances = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.runtime = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.sourceArchiveBucket = Input.empty();
        this.sourceArchiveObject = Input.empty();
        this.sourceRepository = Input.empty();
        this.timeout = Input.empty();
        this.triggerHttp = Input.empty();
        this.vpcConnector = Input.empty();
        this.vpcConnectorEgressSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availableMemoryMb;
        private @Nullable Input<Map<String,Object>> buildEnvironmentVariables;
        private @Nullable Input<String> description;
        private @Nullable Input<String> entryPoint;
        private @Nullable Input<Map<String,Object>> environmentVariables;
        private @Nullable Input<FunctionEventTriggerGetArgs> eventTrigger;
        private @Nullable Input<String> httpsTriggerUrl;
        private @Nullable Input<String> ingressSettings;
        private @Nullable Input<Map<String,Object>> labels;
        private @Nullable Input<Integer> maxInstances;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> runtime;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> sourceArchiveBucket;
        private @Nullable Input<String> sourceArchiveObject;
        private @Nullable Input<FunctionSourceRepositoryGetArgs> sourceRepository;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<Boolean> triggerHttp;
        private @Nullable Input<String> vpcConnector;
        private @Nullable Input<String> vpcConnectorEgressSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemoryMb = defaults.availableMemoryMb;
    	      this.buildEnvironmentVariables = defaults.buildEnvironmentVariables;
    	      this.description = defaults.description;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.eventTrigger = defaults.eventTrigger;
    	      this.httpsTriggerUrl = defaults.httpsTriggerUrl;
    	      this.ingressSettings = defaults.ingressSettings;
    	      this.labels = defaults.labels;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.runtime = defaults.runtime;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.sourceArchiveBucket = defaults.sourceArchiveBucket;
    	      this.sourceArchiveObject = defaults.sourceArchiveObject;
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.timeout = defaults.timeout;
    	      this.triggerHttp = defaults.triggerHttp;
    	      this.vpcConnector = defaults.vpcConnector;
    	      this.vpcConnectorEgressSettings = defaults.vpcConnectorEgressSettings;
        }

        public Builder setAvailableMemoryMb(@Nullable Input<Integer> availableMemoryMb) {
            this.availableMemoryMb = availableMemoryMb;
            return this;
        }

        public Builder setAvailableMemoryMb(@Nullable Integer availableMemoryMb) {
            this.availableMemoryMb = Input.ofNullable(availableMemoryMb);
            return this;
        }

        public Builder setBuildEnvironmentVariables(@Nullable Input<Map<String,Object>> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = buildEnvironmentVariables;
            return this;
        }

        public Builder setBuildEnvironmentVariables(@Nullable Map<String,Object> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = Input.ofNullable(buildEnvironmentVariables);
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

        public Builder setEntryPoint(@Nullable Input<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setEntryPoint(@Nullable String entryPoint) {
            this.entryPoint = Input.ofNullable(entryPoint);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,Object>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,Object> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setEventTrigger(@Nullable Input<FunctionEventTriggerGetArgs> eventTrigger) {
            this.eventTrigger = eventTrigger;
            return this;
        }

        public Builder setEventTrigger(@Nullable FunctionEventTriggerGetArgs eventTrigger) {
            this.eventTrigger = Input.ofNullable(eventTrigger);
            return this;
        }

        public Builder setHttpsTriggerUrl(@Nullable Input<String> httpsTriggerUrl) {
            this.httpsTriggerUrl = httpsTriggerUrl;
            return this;
        }

        public Builder setHttpsTriggerUrl(@Nullable String httpsTriggerUrl) {
            this.httpsTriggerUrl = Input.ofNullable(httpsTriggerUrl);
            return this;
        }

        public Builder setIngressSettings(@Nullable Input<String> ingressSettings) {
            this.ingressSettings = ingressSettings;
            return this;
        }

        public Builder setIngressSettings(@Nullable String ingressSettings) {
            this.ingressSettings = Input.ofNullable(ingressSettings);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,Object>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,Object> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMaxInstances(@Nullable Input<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Input.ofNullable(maxInstances);
            return this;
        }

        public Builder setMinInstances(@Nullable Input<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = Input.ofNullable(minInstances);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRuntime(@Nullable Input<String> runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setRuntime(@Nullable String runtime) {
            this.runtime = Input.ofNullable(runtime);
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder setSourceArchiveBucket(@Nullable Input<String> sourceArchiveBucket) {
            this.sourceArchiveBucket = sourceArchiveBucket;
            return this;
        }

        public Builder setSourceArchiveBucket(@Nullable String sourceArchiveBucket) {
            this.sourceArchiveBucket = Input.ofNullable(sourceArchiveBucket);
            return this;
        }

        public Builder setSourceArchiveObject(@Nullable Input<String> sourceArchiveObject) {
            this.sourceArchiveObject = sourceArchiveObject;
            return this;
        }

        public Builder setSourceArchiveObject(@Nullable String sourceArchiveObject) {
            this.sourceArchiveObject = Input.ofNullable(sourceArchiveObject);
            return this;
        }

        public Builder setSourceRepository(@Nullable Input<FunctionSourceRepositoryGetArgs> sourceRepository) {
            this.sourceRepository = sourceRepository;
            return this;
        }

        public Builder setSourceRepository(@Nullable FunctionSourceRepositoryGetArgs sourceRepository) {
            this.sourceRepository = Input.ofNullable(sourceRepository);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setTriggerHttp(@Nullable Input<Boolean> triggerHttp) {
            this.triggerHttp = triggerHttp;
            return this;
        }

        public Builder setTriggerHttp(@Nullable Boolean triggerHttp) {
            this.triggerHttp = Input.ofNullable(triggerHttp);
            return this;
        }

        public Builder setVpcConnector(@Nullable Input<String> vpcConnector) {
            this.vpcConnector = vpcConnector;
            return this;
        }

        public Builder setVpcConnector(@Nullable String vpcConnector) {
            this.vpcConnector = Input.ofNullable(vpcConnector);
            return this;
        }

        public Builder setVpcConnectorEgressSettings(@Nullable Input<String> vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }

        public Builder setVpcConnectorEgressSettings(@Nullable String vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = Input.ofNullable(vpcConnectorEgressSettings);
            return this;
        }

        public FunctionState build() {
            return new FunctionState(availableMemoryMb, buildEnvironmentVariables, description, entryPoint, environmentVariables, eventTrigger, httpsTriggerUrl, ingressSettings, labels, maxInstances, minInstances, name, project, region, runtime, serviceAccountEmail, sourceArchiveBucket, sourceArchiveObject, sourceRepository, timeout, triggerHttp, vpcConnector, vpcConnectorEgressSettings);
        }
    }
}
