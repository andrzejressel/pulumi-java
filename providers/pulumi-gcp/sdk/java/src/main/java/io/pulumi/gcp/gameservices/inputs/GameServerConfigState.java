// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigFleetConfigGetArgs;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigScalingConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerConfigState extends io.pulumi.resources.ResourceArgs {

    public static final GameServerConfigState Empty = new GameServerConfigState();

    /**
     * A unique id for the deployment config.
     * 
     */
    @InputImport(name="configId")
    private final @Nullable Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId == null ? Input.empty() : this.configId;
    }

    /**
     * A unique id for the deployment.
     * 
     */
    @InputImport(name="deploymentId")
    private final @Nullable Input<String> deploymentId;

    public Input<String> getDeploymentId() {
        return this.deploymentId == null ? Input.empty() : this.deploymentId;
    }

    /**
     * The description of the game server config.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The fleet config contains list of fleet specs. In the Single Cloud, there
     * will be only one.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fleetConfigs")
    private final @Nullable Input<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs;

    public Input<List<GameServerConfigFleetConfigGetArgs>> getFleetConfigs() {
        return this.fleetConfigs == null ? Input.empty() : this.fleetConfigs;
    }

    /**
     * Set of labels to group by.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Location of the Deployment.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the ScalingConfig
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
     * Optional. This contains the autoscaling settings.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scalingConfigs")
    private final @Nullable Input<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs;

    public Input<List<GameServerConfigScalingConfigGetArgs>> getScalingConfigs() {
        return this.scalingConfigs == null ? Input.empty() : this.scalingConfigs;
    }

    public GameServerConfigState(
        @Nullable Input<String> configId,
        @Nullable Input<String> deploymentId,
        @Nullable Input<String> description,
        @Nullable Input<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs) {
        this.configId = configId;
        this.deploymentId = deploymentId;
        this.description = description;
        this.fleetConfigs = fleetConfigs;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.scalingConfigs = scalingConfigs;
    }

    private GameServerConfigState() {
        this.configId = Input.empty();
        this.deploymentId = Input.empty();
        this.description = Input.empty();
        this.fleetConfigs = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.scalingConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configId;
        private @Nullable Input<String> deploymentId;
        private @Nullable Input<String> description;
        private @Nullable Input<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.fleetConfigs = defaults.fleetConfigs;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.scalingConfigs = defaults.scalingConfigs;
        }

        public Builder setConfigId(@Nullable Input<String> configId) {
            this.configId = configId;
            return this;
        }

        public Builder setConfigId(@Nullable String configId) {
            this.configId = Input.ofNullable(configId);
            return this;
        }

        public Builder setDeploymentId(@Nullable Input<String> deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        public Builder setDeploymentId(@Nullable String deploymentId) {
            this.deploymentId = Input.ofNullable(deploymentId);
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

        public Builder setFleetConfigs(@Nullable Input<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs) {
            this.fleetConfigs = fleetConfigs;
            return this;
        }

        public Builder setFleetConfigs(@Nullable List<GameServerConfigFleetConfigGetArgs> fleetConfigs) {
            this.fleetConfigs = Input.ofNullable(fleetConfigs);
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

        public Builder setScalingConfigs(@Nullable Input<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs) {
            this.scalingConfigs = scalingConfigs;
            return this;
        }

        public Builder setScalingConfigs(@Nullable List<GameServerConfigScalingConfigGetArgs> scalingConfigs) {
            this.scalingConfigs = Input.ofNullable(scalingConfigs);
            return this;
        }

        public GameServerConfigState build() {
            return new GameServerConfigState(configId, deploymentId, description, fleetConfigs, labels, location, name, project, scalingConfigs);
        }
    }
}
