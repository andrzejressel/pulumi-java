// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.enums.DeploymentPlatform;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The period during which some deployable was active in a runtime.
 * 
 */
public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Address of the runtime element hosting this deployment.
     * 
     */
    @InputImport(name="address")
    private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * Configuration used to create this deployment.
     * 
     */
    @InputImport(name="config")
    private final @Nullable Input<String> config;

    public Input<String> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * Beginning of the lifetime of this deployment.
     * 
     */
    @InputImport(name="deployTime", required=true)
    private final Input<String> deployTime;

    public Input<String> getDeployTime() {
        return this.deployTime;
    }

    /**
     * Platform hosting this deployment.
     * 
     */
    @InputImport(name="platform")
    private final @Nullable Input<DeploymentPlatform> platform;

    public Input<DeploymentPlatform> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    /**
     * End of the lifetime of this deployment.
     * 
     */
    @InputImport(name="undeployTime")
    private final @Nullable Input<String> undeployTime;

    public Input<String> getUndeployTime() {
        return this.undeployTime == null ? Input.empty() : this.undeployTime;
    }

    /**
     * Identity of the user that triggered this deployment.
     * 
     */
    @InputImport(name="userEmail")
    private final @Nullable Input<String> userEmail;

    public Input<String> getUserEmail() {
        return this.userEmail == null ? Input.empty() : this.userEmail;
    }

    public DeploymentArgs(
        @Nullable Input<String> address,
        @Nullable Input<String> config,
        Input<String> deployTime,
        @Nullable Input<DeploymentPlatform> platform,
        @Nullable Input<String> undeployTime,
        @Nullable Input<String> userEmail) {
        this.address = address;
        this.config = config;
        this.deployTime = Objects.requireNonNull(deployTime, "expected parameter 'deployTime' to be non-null");
        this.platform = platform;
        this.undeployTime = undeployTime;
        this.userEmail = userEmail;
    }

    private DeploymentArgs() {
        this.address = Input.empty();
        this.config = Input.empty();
        this.deployTime = Input.empty();
        this.platform = Input.empty();
        this.undeployTime = Input.empty();
        this.userEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> config;
        private Input<String> deployTime;
        private @Nullable Input<DeploymentPlatform> platform;
        private @Nullable Input<String> undeployTime;
        private @Nullable Input<String> userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.config = defaults.config;
    	      this.deployTime = defaults.deployTime;
    	      this.platform = defaults.platform;
    	      this.undeployTime = defaults.undeployTime;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setConfig(@Nullable Input<String> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable String config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setDeployTime(Input<String> deployTime) {
            this.deployTime = Objects.requireNonNull(deployTime);
            return this;
        }

        public Builder setDeployTime(String deployTime) {
            this.deployTime = Input.of(Objects.requireNonNull(deployTime));
            return this;
        }

        public Builder setPlatform(@Nullable Input<DeploymentPlatform> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable DeploymentPlatform platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }

        public Builder setUndeployTime(@Nullable Input<String> undeployTime) {
            this.undeployTime = undeployTime;
            return this;
        }

        public Builder setUndeployTime(@Nullable String undeployTime) {
            this.undeployTime = Input.ofNullable(undeployTime);
            return this;
        }

        public Builder setUserEmail(@Nullable Input<String> userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder setUserEmail(@Nullable String userEmail) {
            this.userEmail = Input.ofNullable(userEmail);
            return this;
        }

        public DeploymentArgs build() {
            return new DeploymentArgs(address, config, deployTime, platform, undeployTime, userEmail);
        }
    }
}
