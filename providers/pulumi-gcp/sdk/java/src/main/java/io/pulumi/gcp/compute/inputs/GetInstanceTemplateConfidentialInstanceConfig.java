// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetInstanceTemplateConfidentialInstanceConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateConfidentialInstanceConfig Empty = new GetInstanceTemplateConfidentialInstanceConfig();

    @InputImport(name="enableConfidentialCompute", required=true)
    private final Boolean enableConfidentialCompute;

    public Boolean getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public GetInstanceTemplateConfidentialInstanceConfig(Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
    }

    private GetInstanceTemplateConfidentialInstanceConfig() {
        this.enableConfidentialCompute = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateConfidentialInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateConfidentialInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder setEnableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }

        public GetInstanceTemplateConfidentialInstanceConfig build() {
            return new GetInstanceTemplateConfidentialInstanceConfig(enableConfidentialCompute);
        }
    }
}
