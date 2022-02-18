// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class InstanceFromTemplateConfidentialInstanceConfig {
    private final Boolean enableConfidentialCompute;

    @OutputCustomType.Constructor({"enableConfidentialCompute"})
    private InstanceFromTemplateConfidentialInstanceConfig(Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
    }

    public Boolean getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateConfidentialInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateConfidentialInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder setEnableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }

        public InstanceFromTemplateConfidentialInstanceConfig build() {
            return new InstanceFromTemplateConfidentialInstanceConfig(enableConfidentialCompute);
        }
    }
}
