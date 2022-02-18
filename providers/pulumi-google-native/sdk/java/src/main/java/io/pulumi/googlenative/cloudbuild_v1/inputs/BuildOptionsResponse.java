// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.inputs.PoolOptionResponse;
import io.pulumi.googlenative.cloudbuild_v1.inputs.VolumeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Optional arguments to enable specific features of builds.
 * 
 */
public final class BuildOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildOptionsResponse Empty = new BuildOptionsResponse();

    /**
     * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    @InputImport(name="diskSizeGb", required=true)
    private final String diskSizeGb;

    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @InputImport(name="dynamicSubstitutions", required=true)
    private final Boolean dynamicSubstitutions;

    public Boolean getDynamicSubstitutions() {
        return this.dynamicSubstitutions;
    }

    /**
     * A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    @InputImport(name="env", required=true)
    private final List<String> env;

    public List<String> getEnv() {
        return this.env;
    }

    /**
     * Option to define build log streaming behavior to Google Cloud Storage.
     * 
     */
    @InputImport(name="logStreamingOption", required=true)
    private final String logStreamingOption;

    public String getLogStreamingOption() {
        return this.logStreamingOption;
    }

    /**
     * Option to specify the logging mode, which determines if and where build logs are stored.
     * 
     */
    @InputImport(name="logging", required=true)
    private final String logging;

    public String getLogging() {
        return this.logging;
    }

    /**
     * Compute Engine machine type on which to run the build.
     * 
     */
    @InputImport(name="machineType", required=true)
    private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
     * 
     */
    @InputImport(name="pool", required=true)
    private final PoolOptionResponse pool;

    public PoolOptionResponse getPool() {
        return this.pool;
    }

    /**
     * Requested verifiability options.
     * 
     */
    @InputImport(name="requestedVerifyOption", required=true)
    private final String requestedVerifyOption;

    public String getRequestedVerifyOption() {
        return this.requestedVerifyOption;
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`. These variables will be available to all build steps in this build.
     * 
     */
    @InputImport(name="secretEnv", required=true)
    private final List<String> secretEnv;

    public List<String> getSecretEnv() {
        return this.secretEnv;
    }

    /**
     * Requested hash for SourceProvenance.
     * 
     */
    @InputImport(name="sourceProvenanceHash", required=true)
    private final List<String> sourceProvenanceHash;

    public List<String> getSourceProvenanceHash() {
        return this.sourceProvenanceHash;
    }

    /**
     * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @InputImport(name="substitutionOption", required=true)
    private final String substitutionOption;

    public String getSubstitutionOption() {
        return this.substitutionOption;
    }

    /**
     * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
     */
    @InputImport(name="volumes", required=true)
    private final List<VolumeResponse> volumes;

    public List<VolumeResponse> getVolumes() {
        return this.volumes;
    }

    /**
     * This field deprecated; please use `pool.name` instead.
     * 
     */
    @InputImport(name="workerPool", required=true)
    private final String workerPool;

    public String getWorkerPool() {
        return this.workerPool;
    }

    public BuildOptionsResponse(
        String diskSizeGb,
        Boolean dynamicSubstitutions,
        List<String> env,
        String logStreamingOption,
        String logging,
        String machineType,
        PoolOptionResponse pool,
        String requestedVerifyOption,
        List<String> secretEnv,
        List<String> sourceProvenanceHash,
        String substitutionOption,
        List<VolumeResponse> volumes,
        String workerPool) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.dynamicSubstitutions = Objects.requireNonNull(dynamicSubstitutions, "expected parameter 'dynamicSubstitutions' to be non-null");
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.logStreamingOption = Objects.requireNonNull(logStreamingOption, "expected parameter 'logStreamingOption' to be non-null");
        this.logging = Objects.requireNonNull(logging, "expected parameter 'logging' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.pool = Objects.requireNonNull(pool, "expected parameter 'pool' to be non-null");
        this.requestedVerifyOption = Objects.requireNonNull(requestedVerifyOption, "expected parameter 'requestedVerifyOption' to be non-null");
        this.secretEnv = Objects.requireNonNull(secretEnv, "expected parameter 'secretEnv' to be non-null");
        this.sourceProvenanceHash = Objects.requireNonNull(sourceProvenanceHash, "expected parameter 'sourceProvenanceHash' to be non-null");
        this.substitutionOption = Objects.requireNonNull(substitutionOption, "expected parameter 'substitutionOption' to be non-null");
        this.volumes = Objects.requireNonNull(volumes, "expected parameter 'volumes' to be non-null");
        this.workerPool = Objects.requireNonNull(workerPool, "expected parameter 'workerPool' to be non-null");
    }

    private BuildOptionsResponse() {
        this.diskSizeGb = null;
        this.dynamicSubstitutions = null;
        this.env = List.of();
        this.logStreamingOption = null;
        this.logging = null;
        this.machineType = null;
        this.pool = null;
        this.requestedVerifyOption = null;
        this.secretEnv = List.of();
        this.sourceProvenanceHash = List.of();
        this.substitutionOption = null;
        this.volumes = List.of();
        this.workerPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskSizeGb;
        private Boolean dynamicSubstitutions;
        private List<String> env;
        private String logStreamingOption;
        private String logging;
        private String machineType;
        private PoolOptionResponse pool;
        private String requestedVerifyOption;
        private List<String> secretEnv;
        private List<String> sourceProvenanceHash;
        private String substitutionOption;
        private List<VolumeResponse> volumes;
        private String workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.dynamicSubstitutions = defaults.dynamicSubstitutions;
    	      this.env = defaults.env;
    	      this.logStreamingOption = defaults.logStreamingOption;
    	      this.logging = defaults.logging;
    	      this.machineType = defaults.machineType;
    	      this.pool = defaults.pool;
    	      this.requestedVerifyOption = defaults.requestedVerifyOption;
    	      this.secretEnv = defaults.secretEnv;
    	      this.sourceProvenanceHash = defaults.sourceProvenanceHash;
    	      this.substitutionOption = defaults.substitutionOption;
    	      this.volumes = defaults.volumes;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDynamicSubstitutions(Boolean dynamicSubstitutions) {
            this.dynamicSubstitutions = Objects.requireNonNull(dynamicSubstitutions);
            return this;
        }

        public Builder setEnv(List<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setLogStreamingOption(String logStreamingOption) {
            this.logStreamingOption = Objects.requireNonNull(logStreamingOption);
            return this;
        }

        public Builder setLogging(String logging) {
            this.logging = Objects.requireNonNull(logging);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setPool(PoolOptionResponse pool) {
            this.pool = Objects.requireNonNull(pool);
            return this;
        }

        public Builder setRequestedVerifyOption(String requestedVerifyOption) {
            this.requestedVerifyOption = Objects.requireNonNull(requestedVerifyOption);
            return this;
        }

        public Builder setSecretEnv(List<String> secretEnv) {
            this.secretEnv = Objects.requireNonNull(secretEnv);
            return this;
        }

        public Builder setSourceProvenanceHash(List<String> sourceProvenanceHash) {
            this.sourceProvenanceHash = Objects.requireNonNull(sourceProvenanceHash);
            return this;
        }

        public Builder setSubstitutionOption(String substitutionOption) {
            this.substitutionOption = Objects.requireNonNull(substitutionOption);
            return this;
        }

        public Builder setVolumes(List<VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }

        public Builder setWorkerPool(String workerPool) {
            this.workerPool = Objects.requireNonNull(workerPool);
            return this;
        }

        public BuildOptionsResponse build() {
            return new BuildOptionsResponse(diskSizeGb, dynamicSubstitutions, env, logStreamingOption, logging, machineType, pool, requestedVerifyOption, secretEnv, sourceProvenanceHash, substitutionOption, volumes, workerPool);
        }
    }
}
