// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentArgs Empty = new GameServerDeploymentArgs();

    @InputImport(name="deploymentId", required=true)
    private final Input<String> deploymentId;

    public Input<String> getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Human readable description of the game server delpoyment.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * ETag of the resource.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The labels associated with this game server deployment. Each label is a key-value pair.
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
     * The resource name of the game server deployment, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
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

    public GameServerDeploymentArgs(
        Input<String> deploymentId,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private GameServerDeploymentArgs() {
        this.deploymentId = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deploymentId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setDeploymentId(Input<String> deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder setDeploymentId(String deploymentId) {
            this.deploymentId = Input.of(Objects.requireNonNull(deploymentId));
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

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
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

        public GameServerDeploymentArgs build() {
            return new GameServerDeploymentArgs(deploymentId, description, etag, labels, location, name, project);
        }
    }
}
