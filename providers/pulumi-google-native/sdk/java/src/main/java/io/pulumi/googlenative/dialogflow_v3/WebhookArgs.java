// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    @InputImport(name="agentId", required=true)
    private final Input<String> agentId;

    public Input<String> getAgentId() {
        return this.agentId;
    }

    /**
     * Indicates whether the webhook is disabled.
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * The human-readable name of the webhook, unique within the agent.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Configuration for a generic web service.
     * 
     */
    @InputImport(name="genericWebService")
    private final @Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService;

    public Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> getGenericWebService() {
        return this.genericWebService == null ? Input.empty() : this.genericWebService;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
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
     * Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    @InputImport(name="serviceDirectory")
    private final @Nullable Input<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs> serviceDirectory;

    public Input<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs> getServiceDirectory() {
        return this.serviceDirectory == null ? Input.empty() : this.serviceDirectory;
    }

    /**
     * Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public WebhookArgs(
        Input<String> agentId,
        @Nullable Input<Boolean> disabled,
        Input<String> displayName,
        @Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs> serviceDirectory,
        @Nullable Input<String> timeout) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.disabled = disabled;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.genericWebService = genericWebService;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serviceDirectory = serviceDirectory;
        this.timeout = timeout;
    }

    private WebhookArgs() {
        this.agentId = Input.empty();
        this.disabled = Input.empty();
        this.displayName = Input.empty();
        this.genericWebService = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.serviceDirectory = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> agentId;
        private @Nullable Input<Boolean> disabled;
        private Input<String> displayName;
        private @Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs> serviceDirectory;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.genericWebService = defaults.genericWebService;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceDirectory = defaults.serviceDirectory;
    	      this.timeout = defaults.timeout;
        }

        public Builder setAgentId(Input<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Input.of(Objects.requireNonNull(agentId));
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setGenericWebService(@Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService) {
            this.genericWebService = genericWebService;
            return this;
        }

        public Builder setGenericWebService(@Nullable GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs genericWebService) {
            this.genericWebService = Input.ofNullable(genericWebService);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setServiceDirectory(@Nullable Input<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs> serviceDirectory) {
            this.serviceDirectory = serviceDirectory;
            return this;
        }

        public Builder setServiceDirectory(@Nullable GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs serviceDirectory) {
            this.serviceDirectory = Input.ofNullable(serviceDirectory);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public WebhookArgs build() {
            return new WebhookArgs(agentId, disabled, displayName, genericWebService, location, name, project, serviceDirectory, timeout);
        }
    }
}
