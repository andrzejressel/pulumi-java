// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.kms.inputs.RegistryCredentialGetArgs;
import io.pulumi.gcp.kms.inputs.RegistryEventNotificationConfigItemGetArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryState extends io.pulumi.resources.ResourceArgs {

    public static final RegistryState Empty = new RegistryState();

    /**
     * List of public key certificates to authenticate devices.
     * 
     */
    @InputImport(name="credentials")
    private final @Nullable Input<List<RegistryCredentialGetArgs>> credentials;

    public Input<List<RegistryCredentialGetArgs>> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * List of configurations for event notifications, such as PubSub topics to publish device events to.
     * 
     */
    @InputImport(name="eventNotificationConfigs")
    private final @Nullable Input<List<RegistryEventNotificationConfigItemGetArgs>> eventNotificationConfigs;

    public Input<List<RegistryEventNotificationConfigItemGetArgs>> getEventNotificationConfigs() {
        return this.eventNotificationConfigs == null ? Input.empty() : this.eventNotificationConfigs;
    }

    /**
     * Activate or deactivate HTTP.
     * 
     */
    @InputImport(name="httpConfig")
    private final @Nullable Input<Map<String,Object>> httpConfig;

    public Input<Map<String,Object>> getHttpConfig() {
        return this.httpConfig == null ? Input.empty() : this.httpConfig;
    }

    /**
     * The default logging verbosity for activity from devices in this registry. Specifies which events should be written to
     * logs. For example, if the LogLevel is ERROR, only events that terminate in errors will be logged. LogLevel is inclusive;
     * enabling INFO logging will also enable ERROR logging. Default value: "NONE" Possible values: ["NONE", "ERROR", "INFO",
     * "DEBUG"]
     * 
     */
    @InputImport(name="logLevel")
    private final @Nullable Input<String> logLevel;

    public Input<String> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    /**
     * Activate or deactivate MQTT.
     * 
     */
    @InputImport(name="mqttConfig")
    private final @Nullable Input<Map<String,Object>> mqttConfig;

    public Input<Map<String,Object>> getMqttConfig() {
        return this.mqttConfig == null ? Input.empty() : this.mqttConfig;
    }

    /**
     * A unique name for the resource, required by device registry.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region in which the created registry should reside. If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * A PubSub topic to publish device state updates.
     * 
     */
    @InputImport(name="stateNotificationConfig")
    private final @Nullable Input<Map<String,Object>> stateNotificationConfig;

    public Input<Map<String,Object>> getStateNotificationConfig() {
        return this.stateNotificationConfig == null ? Input.empty() : this.stateNotificationConfig;
    }

    public RegistryState(
        @Nullable Input<List<RegistryCredentialGetArgs>> credentials,
        @Nullable Input<List<RegistryEventNotificationConfigItemGetArgs>> eventNotificationConfigs,
        @Nullable Input<Map<String,Object>> httpConfig,
        @Nullable Input<String> logLevel,
        @Nullable Input<Map<String,Object>> mqttConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<Map<String,Object>> stateNotificationConfig) {
        this.credentials = credentials;
        this.eventNotificationConfigs = eventNotificationConfigs;
        this.httpConfig = httpConfig;
        this.logLevel = logLevel;
        this.mqttConfig = mqttConfig;
        this.name = name;
        this.project = project;
        this.region = region;
        this.stateNotificationConfig = stateNotificationConfig;
    }

    private RegistryState() {
        this.credentials = Input.empty();
        this.eventNotificationConfigs = Input.empty();
        this.httpConfig = Input.empty();
        this.logLevel = Input.empty();
        this.mqttConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.stateNotificationConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RegistryCredentialGetArgs>> credentials;
        private @Nullable Input<List<RegistryEventNotificationConfigItemGetArgs>> eventNotificationConfigs;
        private @Nullable Input<Map<String,Object>> httpConfig;
        private @Nullable Input<String> logLevel;
        private @Nullable Input<Map<String,Object>> mqttConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<Map<String,Object>> stateNotificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.eventNotificationConfigs = defaults.eventNotificationConfigs;
    	      this.httpConfig = defaults.httpConfig;
    	      this.logLevel = defaults.logLevel;
    	      this.mqttConfig = defaults.mqttConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.stateNotificationConfig = defaults.stateNotificationConfig;
        }

        public Builder setCredentials(@Nullable Input<List<RegistryCredentialGetArgs>> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable List<RegistryCredentialGetArgs> credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setEventNotificationConfigs(@Nullable Input<List<RegistryEventNotificationConfigItemGetArgs>> eventNotificationConfigs) {
            this.eventNotificationConfigs = eventNotificationConfigs;
            return this;
        }

        public Builder setEventNotificationConfigs(@Nullable List<RegistryEventNotificationConfigItemGetArgs> eventNotificationConfigs) {
            this.eventNotificationConfigs = Input.ofNullable(eventNotificationConfigs);
            return this;
        }

        public Builder setHttpConfig(@Nullable Input<Map<String,Object>> httpConfig) {
            this.httpConfig = httpConfig;
            return this;
        }

        public Builder setHttpConfig(@Nullable Map<String,Object> httpConfig) {
            this.httpConfig = Input.ofNullable(httpConfig);
            return this;
        }

        public Builder setLogLevel(@Nullable Input<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setLogLevel(@Nullable String logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }

        public Builder setMqttConfig(@Nullable Input<Map<String,Object>> mqttConfig) {
            this.mqttConfig = mqttConfig;
            return this;
        }

        public Builder setMqttConfig(@Nullable Map<String,Object> mqttConfig) {
            this.mqttConfig = Input.ofNullable(mqttConfig);
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

        public Builder setStateNotificationConfig(@Nullable Input<Map<String,Object>> stateNotificationConfig) {
            this.stateNotificationConfig = stateNotificationConfig;
            return this;
        }

        public Builder setStateNotificationConfig(@Nullable Map<String,Object> stateNotificationConfig) {
            this.stateNotificationConfig = Input.ofNullable(stateNotificationConfig);
            return this;
        }

        public RegistryState build() {
            return new RegistryState(credentials, eventNotificationConfigs, httpConfig, logLevel, mqttConfig, name, project, region, stateNotificationConfig);
        }
    }
}
