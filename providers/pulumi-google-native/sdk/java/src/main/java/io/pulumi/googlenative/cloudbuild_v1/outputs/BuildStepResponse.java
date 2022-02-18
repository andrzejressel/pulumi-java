// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.TimeSpanResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.VolumeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BuildStepResponse {
    /**
     * A list of arguments that will be presented to the step when it is started. If the image used to run the step's container has an entrypoint, the `args` are used as arguments to that entrypoint. If the image does not define an entrypoint, the first element in args is used as the entrypoint, and the remainder will be used as arguments.
     * 
     */
    private final List<String> args;
    /**
     * Working directory to use when running this step's container. If this value is a relative path, it is relative to the build's working directory. If this value is absolute, it may be outside the build's working directory, in which case the contents of the path may not be persisted across build step executions, unless a `volume` for that path is specified. If the build specifies a `RepoSource` with `dir` and a step with a `dir`, which specifies an absolute path, the `RepoSource` `dir` is ignored for the step's execution.
     * 
     */
    private final String dir;
    /**
     * Entrypoint to be used instead of the build step image's default entrypoint. If unset, the image's default entrypoint is used.
     * 
     */
    private final String entrypoint;
    /**
     * A list of environment variable definitions to be used when running a step. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    private final List<String> env;
    /**
     * The name of the container image that will run this particular build step. If the image is available in the host's Docker daemon's cache, it will be run directly. If not, the host will attempt to pull the image first, using the builder service account's credentials if necessary. The Docker daemon's cache will already have the latest versions of all of the officially supported build steps ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)). The Docker daemon will also have cached many of the layers for some popular images, like "ubuntu", "debian", but they will be refreshed at the time you attempt to use them. If you built an image in a previous build step, it will be stored in the host's Docker daemon's cache and is available to use as the name for a later build step.
     * 
     */
    private final String name;
    /**
     * Stores timing information for pulling this build step's builder image only.
     * 
     */
    private final TimeSpanResponse pullTiming;
    /**
     * A shell script to be executed in the step. When script is provided, the user cannot specify the entrypoint or args.
     * 
     */
    private final String script;
    /**
     * A list of environment variables which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`.
     * 
     */
    private final List<String> secretEnv;
    /**
     * Status of the build step. At this time, build step status is only updated on build completion; step status is not updated in real-time as the build progresses.
     * 
     */
    private final String status;
    /**
     * Time limit for executing this build step. If not defined, the step has no time limit and will be allowed to continue to run until either it completes or the build itself times out.
     * 
     */
    private final String timeout;
    /**
     * Stores timing information for executing this build step.
     * 
     */
    private final TimeSpanResponse timing;
    /**
     * List of volumes to mount into the build step. Each volume is created as an empty volume prior to execution of the build step. Upon completion of the build, volumes and their contents are discarded. Using a named volume in only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
     */
    private final List<VolumeResponse> volumes;
    /**
     * The ID(s) of the step(s) that this build step depends on. This build step will not start until all the build steps in `wait_for` have completed successfully. If `wait_for` is empty, this build step will start when all previous build steps in the `Build.Steps` list have completed successfully.
     * 
     */
    private final List<String> waitFor;

    @OutputCustomType.Constructor({"args","dir","entrypoint","env","name","pullTiming","script","secretEnv","status","timeout","timing","volumes","waitFor"})
    private BuildStepResponse(
        List<String> args,
        String dir,
        String entrypoint,
        List<String> env,
        String name,
        TimeSpanResponse pullTiming,
        String script,
        List<String> secretEnv,
        String status,
        String timeout,
        TimeSpanResponse timing,
        List<VolumeResponse> volumes,
        List<String> waitFor) {
        this.args = Objects.requireNonNull(args);
        this.dir = Objects.requireNonNull(dir);
        this.entrypoint = Objects.requireNonNull(entrypoint);
        this.env = Objects.requireNonNull(env);
        this.name = Objects.requireNonNull(name);
        this.pullTiming = Objects.requireNonNull(pullTiming);
        this.script = Objects.requireNonNull(script);
        this.secretEnv = Objects.requireNonNull(secretEnv);
        this.status = Objects.requireNonNull(status);
        this.timeout = Objects.requireNonNull(timeout);
        this.timing = Objects.requireNonNull(timing);
        this.volumes = Objects.requireNonNull(volumes);
        this.waitFor = Objects.requireNonNull(waitFor);
    }

    /**
     * A list of arguments that will be presented to the step when it is started. If the image used to run the step's container has an entrypoint, the `args` are used as arguments to that entrypoint. If the image does not define an entrypoint, the first element in args is used as the entrypoint, and the remainder will be used as arguments.
     * 
     */
    public List<String> getArgs() {
        return this.args;
    }
    /**
     * Working directory to use when running this step's container. If this value is a relative path, it is relative to the build's working directory. If this value is absolute, it may be outside the build's working directory, in which case the contents of the path may not be persisted across build step executions, unless a `volume` for that path is specified. If the build specifies a `RepoSource` with `dir` and a step with a `dir`, which specifies an absolute path, the `RepoSource` `dir` is ignored for the step's execution.
     * 
     */
    public String getDir() {
        return this.dir;
    }
    /**
     * Entrypoint to be used instead of the build step image's default entrypoint. If unset, the image's default entrypoint is used.
     * 
     */
    public String getEntrypoint() {
        return this.entrypoint;
    }
    /**
     * A list of environment variable definitions to be used when running a step. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    public List<String> getEnv() {
        return this.env;
    }
    /**
     * The name of the container image that will run this particular build step. If the image is available in the host's Docker daemon's cache, it will be run directly. If not, the host will attempt to pull the image first, using the builder service account's credentials if necessary. The Docker daemon's cache will already have the latest versions of all of the officially supported build steps ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)). The Docker daemon will also have cached many of the layers for some popular images, like "ubuntu", "debian", but they will be refreshed at the time you attempt to use them. If you built an image in a previous build step, it will be stored in the host's Docker daemon's cache and is available to use as the name for a later build step.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Stores timing information for pulling this build step's builder image only.
     * 
     */
    public TimeSpanResponse getPullTiming() {
        return this.pullTiming;
    }
    /**
     * A shell script to be executed in the step. When script is provided, the user cannot specify the entrypoint or args.
     * 
     */
    public String getScript() {
        return this.script;
    }
    /**
     * A list of environment variables which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`.
     * 
     */
    public List<String> getSecretEnv() {
        return this.secretEnv;
    }
    /**
     * Status of the build step. At this time, build step status is only updated on build completion; step status is not updated in real-time as the build progresses.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Time limit for executing this build step. If not defined, the step has no time limit and will be allowed to continue to run until either it completes or the build itself times out.
     * 
     */
    public String getTimeout() {
        return this.timeout;
    }
    /**
     * Stores timing information for executing this build step.
     * 
     */
    public TimeSpanResponse getTiming() {
        return this.timing;
    }
    /**
     * List of volumes to mount into the build step. Each volume is created as an empty volume prior to execution of the build step. Upon completion of the build, volumes and their contents are discarded. Using a named volume in only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
     */
    public List<VolumeResponse> getVolumes() {
        return this.volumes;
    }
    /**
     * The ID(s) of the step(s) that this build step depends on. This build step will not start until all the build steps in `wait_for` have completed successfully. If `wait_for` is empty, this build step will start when all previous build steps in the `Build.Steps` list have completed successfully.
     * 
     */
    public List<String> getWaitFor() {
        return this.waitFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private String dir;
        private String entrypoint;
        private List<String> env;
        private String name;
        private TimeSpanResponse pullTiming;
        private String script;
        private List<String> secretEnv;
        private String status;
        private String timeout;
        private TimeSpanResponse timing;
        private List<VolumeResponse> volumes;
        private List<String> waitFor;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.dir = defaults.dir;
    	      this.entrypoint = defaults.entrypoint;
    	      this.env = defaults.env;
    	      this.name = defaults.name;
    	      this.pullTiming = defaults.pullTiming;
    	      this.script = defaults.script;
    	      this.secretEnv = defaults.secretEnv;
    	      this.status = defaults.status;
    	      this.timeout = defaults.timeout;
    	      this.timing = defaults.timing;
    	      this.volumes = defaults.volumes;
    	      this.waitFor = defaults.waitFor;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setDir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }

        public Builder setEntrypoint(String entrypoint) {
            this.entrypoint = Objects.requireNonNull(entrypoint);
            return this;
        }

        public Builder setEnv(List<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPullTiming(TimeSpanResponse pullTiming) {
            this.pullTiming = Objects.requireNonNull(pullTiming);
            return this;
        }

        public Builder setScript(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setSecretEnv(List<String> secretEnv) {
            this.secretEnv = Objects.requireNonNull(secretEnv);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setTiming(TimeSpanResponse timing) {
            this.timing = Objects.requireNonNull(timing);
            return this;
        }

        public Builder setVolumes(List<VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }

        public Builder setWaitFor(List<String> waitFor) {
            this.waitFor = Objects.requireNonNull(waitFor);
            return this;
        }

        public BuildStepResponse build() {
            return new BuildStepResponse(args, dir, entrypoint, env, name, pullTiming, script, secretEnv, status, timeout, timing, volumes, waitFor);
        }
    }
}
