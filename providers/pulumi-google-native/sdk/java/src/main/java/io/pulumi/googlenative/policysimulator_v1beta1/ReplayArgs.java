// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.policysimulator_v1beta1.inputs.GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplayArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplayArgs Empty = new ReplayArgs();

    /**
     * The configuration used for the `Replay`.
     * 
     */
    @InputImport(name="config", required=true)
    private final Input<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config;

    public Input<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> getConfig() {
        return this.config;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ReplayArgs(
        Input<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config,
        @Nullable Input<String> location,
        @Nullable Input<String> project) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.location = location;
        this.project = project;
    }

    private ReplayArgs() {
        this.config = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setConfig(Input<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs config) {
            this.config = Input.of(Objects.requireNonNull(config));
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public ReplayArgs build() {
            return new ReplayArgs(config, location, project);
        }
    }
}
