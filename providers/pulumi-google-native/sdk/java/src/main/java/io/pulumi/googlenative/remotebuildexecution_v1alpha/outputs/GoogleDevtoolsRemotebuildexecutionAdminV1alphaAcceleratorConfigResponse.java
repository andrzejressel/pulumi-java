// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse {
    /**
     * The number of guest accelerator cards exposed to each VM.
     * 
     */
    private final String acceleratorCount;
    /**
     * The type of accelerator to attach to each VM, e.g. "nvidia-tesla-k80" for nVidia Tesla K80.
     * 
     */
    private final String acceleratorType;

    @OutputCustomType.Constructor({"acceleratorCount","acceleratorType"})
    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse(
        String acceleratorCount,
        String acceleratorType) {
        this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
        this.acceleratorType = Objects.requireNonNull(acceleratorType);
    }

    /**
     * The number of guest accelerator cards exposed to each VM.
     * 
     */
    public String getAcceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * The type of accelerator to attach to each VM, e.g. "nvidia-tesla-k80" for nVidia Tesla K80.
     * 
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorCount;
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(String acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse(acceleratorCount, acceleratorType);
        }
    }
}
