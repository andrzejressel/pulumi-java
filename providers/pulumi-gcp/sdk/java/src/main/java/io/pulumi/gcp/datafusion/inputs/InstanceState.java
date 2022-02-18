// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datafusion.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The time the instance was created in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
     * 
     */
    @InputImport(name="dataprocServiceAccount")
    private final @Nullable Input<String> dataprocServiceAccount;

    public Input<String> getDataprocServiceAccount() {
        return this.dataprocServiceAccount == null ? Input.empty() : this.dataprocServiceAccount;
    }

    /**
     * An optional description of the instance.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Option to enable Stackdriver Logging.
     * 
     */
    @InputImport(name="enableStackdriverLogging")
    private final @Nullable Input<Boolean> enableStackdriverLogging;

    public Input<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Input.empty() : this.enableStackdriverLogging;
    }

    /**
     * Option to enable Stackdriver Monitoring.
     * 
     */
    @InputImport(name="enableStackdriverMonitoring")
    private final @Nullable Input<Boolean> enableStackdriverMonitoring;

    public Input<Boolean> getEnableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring == null ? Input.empty() : this.enableStackdriverMonitoring;
    }

    /**
     * The resource labels for instance to use to annotate any related underlying resources,
     * such as Compute Engine VMs.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * 
     */
    @InputImport(name="networkConfig")
    private final @Nullable Input<InstanceNetworkConfigGetArgs> networkConfig;

    public Input<InstanceNetworkConfigGetArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<Map<String,String>> options;

    public Input<Map<String,String>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * Specifies whether the Data Fusion instance should be private. If set to
     * true, all Data Fusion nodes will have private IP addresses and will not be
     * able to access the public internet.
     * 
     */
    @InputImport(name="privateInstance")
    private final @Nullable Input<Boolean> privateInstance;

    public Input<Boolean> getPrivateInstance() {
        return this.privateInstance == null ? Input.empty() : this.privateInstance;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the Data Fusion instance.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Service account which will be used to access resources in the customer project.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Endpoint on which the Data Fusion UI and REST APIs are accessible.
     * 
     */
    @InputImport(name="serviceEndpoint")
    private final @Nullable Input<String> serviceEndpoint;

    public Input<String> getServiceEndpoint() {
        return this.serviceEndpoint == null ? Input.empty() : this.serviceEndpoint;
    }

    /**
     * The current state of this Data Fusion instance. - CREATING: Instance is being created - RUNNING: Instance is running and
     * ready for requests - FAILED: Instance creation failed - DELETING: Instance is being deleted - UPGRADING: Instance is
     * being upgraded - RESTARTING: Instance is being restarted
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    @InputImport(name="stateMessage")
    private final @Nullable Input<String> stateMessage;

    public Input<String> getStateMessage() {
        return this.stateMessage == null ? Input.empty() : this.stateMessage;
    }

    /**
     * Represents the type of Data Fusion instance. Each type is configured with
     * the default settings for processing and memory.
     * - BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
     *   using point and click UI. However, there are certain limitations, such as fewer number
     *   of concurrent pipelines, no support for streaming pipelines, etc.
     * - ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
     *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
     * - DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
     *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
     *   pipelines at low cost.
     *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The time the instance was last updated in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    /**
     * Current version of the Data Fusion.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public InstanceState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> dataprocServiceAccount,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableStackdriverLogging,
        @Nullable Input<Boolean> enableStackdriverMonitoring,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<InstanceNetworkConfigGetArgs> networkConfig,
        @Nullable Input<Map<String,String>> options,
        @Nullable Input<Boolean> privateInstance,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<String> serviceEndpoint,
        @Nullable Input<String> state,
        @Nullable Input<String> stateMessage,
        @Nullable Input<String> type,
        @Nullable Input<String> updateTime,
        @Nullable Input<String> version) {
        this.createTime = createTime;
        this.dataprocServiceAccount = dataprocServiceAccount;
        this.description = description;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.enableStackdriverMonitoring = enableStackdriverMonitoring;
        this.labels = labels;
        this.name = name;
        this.networkConfig = networkConfig;
        this.options = options;
        this.privateInstance = privateInstance;
        this.project = project;
        this.region = region;
        this.serviceAccount = serviceAccount;
        this.serviceEndpoint = serviceEndpoint;
        this.state = state;
        this.stateMessage = stateMessage;
        this.type = type;
        this.updateTime = updateTime;
        this.version = version;
    }

    private InstanceState() {
        this.createTime = Input.empty();
        this.dataprocServiceAccount = Input.empty();
        this.description = Input.empty();
        this.enableStackdriverLogging = Input.empty();
        this.enableStackdriverMonitoring = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.networkConfig = Input.empty();
        this.options = Input.empty();
        this.privateInstance = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.serviceAccount = Input.empty();
        this.serviceEndpoint = Input.empty();
        this.state = Input.empty();
        this.stateMessage = Input.empty();
        this.type = Input.empty();
        this.updateTime = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> dataprocServiceAccount;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableStackdriverLogging;
        private @Nullable Input<Boolean> enableStackdriverMonitoring;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<InstanceNetworkConfigGetArgs> networkConfig;
        private @Nullable Input<Map<String,String>> options;
        private @Nullable Input<Boolean> privateInstance;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<String> serviceEndpoint;
        private @Nullable Input<String> state;
        private @Nullable Input<String> stateMessage;
        private @Nullable Input<String> type;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dataprocServiceAccount = defaults.dataprocServiceAccount;
    	      this.description = defaults.description;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.enableStackdriverMonitoring = defaults.enableStackdriverMonitoring;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.options = defaults.options;
    	      this.privateInstance = defaults.privateInstance;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDataprocServiceAccount(@Nullable Input<String> dataprocServiceAccount) {
            this.dataprocServiceAccount = dataprocServiceAccount;
            return this;
        }

        public Builder setDataprocServiceAccount(@Nullable String dataprocServiceAccount) {
            this.dataprocServiceAccount = Input.ofNullable(dataprocServiceAccount);
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

        public Builder setEnableStackdriverLogging(@Nullable Input<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Input.ofNullable(enableStackdriverLogging);
            return this;
        }

        public Builder setEnableStackdriverMonitoring(@Nullable Input<Boolean> enableStackdriverMonitoring) {
            this.enableStackdriverMonitoring = enableStackdriverMonitoring;
            return this;
        }

        public Builder setEnableStackdriverMonitoring(@Nullable Boolean enableStackdriverMonitoring) {
            this.enableStackdriverMonitoring = Input.ofNullable(enableStackdriverMonitoring);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setNetworkConfig(@Nullable Input<InstanceNetworkConfigGetArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable InstanceNetworkConfigGetArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setOptions(@Nullable Input<Map<String,String>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable Map<String,String> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setPrivateInstance(@Nullable Input<Boolean> privateInstance) {
            this.privateInstance = privateInstance;
            return this;
        }

        public Builder setPrivateInstance(@Nullable Boolean privateInstance) {
            this.privateInstance = Input.ofNullable(privateInstance);
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

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setServiceEndpoint(@Nullable Input<String> serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            return this;
        }

        public Builder setServiceEndpoint(@Nullable String serviceEndpoint) {
            this.serviceEndpoint = Input.ofNullable(serviceEndpoint);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setStateMessage(@Nullable Input<String> stateMessage) {
            this.stateMessage = stateMessage;
            return this;
        }

        public Builder setStateMessage(@Nullable String stateMessage) {
            this.stateMessage = Input.ofNullable(stateMessage);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public InstanceState build() {
            return new InstanceState(createTime, dataprocServiceAccount, description, enableStackdriverLogging, enableStackdriverMonitoring, labels, name, networkConfig, options, privateInstance, project, region, serviceAccount, serviceEndpoint, state, stateMessage, type, updateTime, version);
        }
    }
}
