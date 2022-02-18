// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TriggerBuildStepVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildStepVolumeArgs Empty = new TriggerBuildStepVolumeArgs();

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the same
     * build step or with certain reserved volume paths.
     * 
     */
    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    public TriggerBuildStepVolumeArgs(
        Input<String> name,
        Input<String> path) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private TriggerBuildStepVolumeArgs() {
        this.name = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildStepVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildStepVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public TriggerBuildStepVolumeArgs build() {
            return new TriggerBuildStepVolumeArgs(name, path);
        }
    }
}
