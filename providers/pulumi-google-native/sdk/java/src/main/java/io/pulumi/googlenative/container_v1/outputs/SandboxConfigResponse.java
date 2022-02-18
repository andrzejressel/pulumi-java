// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SandboxConfigResponse {
    /**
     * Type of the sandbox to use for the node.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private SandboxConfigResponse(String type) {
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Type of the sandbox to use for the node.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SandboxConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SandboxConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public SandboxConfigResponse build() {
            return new SandboxConfigResponse(type);
        }
    }
}
