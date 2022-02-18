// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    @InputImport(name="apiId", required=true)
    private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Optional. Display name.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be created in the same project as this API.
     * 
     */
    @InputImport(name="managedService")
    private final @Nullable Input<String> managedService;

    public Input<String> getManagedService() {
        return this.managedService == null ? Input.empty() : this.managedService;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ApiArgs(
        Input<String> apiId,
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> managedService,
        @Nullable Input<String> project) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.displayName = displayName;
        this.labels = labels;
        this.location = location;
        this.managedService = managedService;
        this.project = project;
    }

    private ApiArgs() {
        this.apiId = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.managedService = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedService;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.managedService = defaults.managedService;
    	      this.project = defaults.project;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedService(@Nullable Input<String> managedService) {
            this.managedService = managedService;
            return this;
        }

        public Builder setManagedService(@Nullable String managedService) {
            this.managedService = Input.ofNullable(managedService);
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

        public ApiArgs build() {
            return new ApiArgs(apiId, displayName, labels, location, managedService, project);
        }
    }
}
