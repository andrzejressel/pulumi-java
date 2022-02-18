// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.ConfigFileResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.ImportFileResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TargetConfigurationResponse {
    /**
     * The configuration to use for this deployment.
     * 
     */
    private final ConfigFileResponse config;
    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    private final List<ImportFileResponse> imports;

    @OutputCustomType.Constructor({"config","imports"})
    private TargetConfigurationResponse(
        ConfigFileResponse config,
        List<ImportFileResponse> imports) {
        this.config = Objects.requireNonNull(config);
        this.imports = Objects.requireNonNull(imports);
    }

    /**
     * The configuration to use for this deployment.
     * 
     */
    public ConfigFileResponse getConfig() {
        return this.config;
    }
    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    public List<ImportFileResponse> getImports() {
        return this.imports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigFileResponse config;
        private List<ImportFileResponse> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder setConfig(ConfigFileResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setImports(List<ImportFileResponse> imports) {
            this.imports = Objects.requireNonNull(imports);
            return this;
        }

        public TargetConfigurationResponse build() {
            return new TargetConfigurationResponse(config, imports);
        }
    }
}
