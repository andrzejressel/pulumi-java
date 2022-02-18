// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigSoftwareConfig {
    private final Map<String,String> airflowConfigOverrides;
    private final Map<String,String> envVariables;
    private final String imageVersion;
    private final Map<String,String> pypiPackages;
    private final String pythonVersion;
    private final Integer schedulerCount;

    @OutputCustomType.Constructor({"airflowConfigOverrides","envVariables","imageVersion","pypiPackages","pythonVersion","schedulerCount"})
    private GetEnvironmentConfigSoftwareConfig(
        Map<String,String> airflowConfigOverrides,
        Map<String,String> envVariables,
        String imageVersion,
        Map<String,String> pypiPackages,
        String pythonVersion,
        Integer schedulerCount) {
        this.airflowConfigOverrides = Objects.requireNonNull(airflowConfigOverrides);
        this.envVariables = Objects.requireNonNull(envVariables);
        this.imageVersion = Objects.requireNonNull(imageVersion);
        this.pypiPackages = Objects.requireNonNull(pypiPackages);
        this.pythonVersion = Objects.requireNonNull(pythonVersion);
        this.schedulerCount = Objects.requireNonNull(schedulerCount);
    }

    public Map<String,String> getAirflowConfigOverrides() {
        return this.airflowConfigOverrides;
    }
    public Map<String,String> getEnvVariables() {
        return this.envVariables;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }
    public Map<String,String> getPypiPackages() {
        return this.pypiPackages;
    }
    public String getPythonVersion() {
        return this.pythonVersion;
    }
    public Integer getSchedulerCount() {
        return this.schedulerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigSoftwareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> airflowConfigOverrides;
        private Map<String,String> envVariables;
        private String imageVersion;
        private Map<String,String> pypiPackages;
        private String pythonVersion;
        private Integer schedulerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigOverrides = defaults.airflowConfigOverrides;
    	      this.envVariables = defaults.envVariables;
    	      this.imageVersion = defaults.imageVersion;
    	      this.pypiPackages = defaults.pypiPackages;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.schedulerCount = defaults.schedulerCount;
        }

        public Builder setAirflowConfigOverrides(Map<String,String> airflowConfigOverrides) {
            this.airflowConfigOverrides = Objects.requireNonNull(airflowConfigOverrides);
            return this;
        }

        public Builder setEnvVariables(Map<String,String> envVariables) {
            this.envVariables = Objects.requireNonNull(envVariables);
            return this;
        }

        public Builder setImageVersion(String imageVersion) {
            this.imageVersion = Objects.requireNonNull(imageVersion);
            return this;
        }

        public Builder setPypiPackages(Map<String,String> pypiPackages) {
            this.pypiPackages = Objects.requireNonNull(pypiPackages);
            return this;
        }

        public Builder setPythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }

        public Builder setSchedulerCount(Integer schedulerCount) {
            this.schedulerCount = Objects.requireNonNull(schedulerCount);
            return this;
        }

        public GetEnvironmentConfigSoftwareConfig build() {
            return new GetEnvironmentConfigSoftwareConfig(airflowConfigOverrides, envVariables, imageVersion, pypiPackages, pythonVersion, schedulerCount);
        }
    }
}
