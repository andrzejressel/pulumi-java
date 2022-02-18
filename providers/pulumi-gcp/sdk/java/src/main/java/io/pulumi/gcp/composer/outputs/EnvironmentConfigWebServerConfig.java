// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EnvironmentConfigWebServerConfig {
    private final String machineType;

    @OutputCustomType.Constructor({"machineType"})
    private EnvironmentConfigWebServerConfig(String machineType) {
        this.machineType = Objects.requireNonNull(machineType);
    }

    public String getMachineType() {
        return this.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWebServerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWebServerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public EnvironmentConfigWebServerConfig build() {
            return new EnvironmentConfigWebServerConfig(machineType);
        }
    }
}
