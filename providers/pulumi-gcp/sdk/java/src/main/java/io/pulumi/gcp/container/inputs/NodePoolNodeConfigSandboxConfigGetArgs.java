// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NodePoolNodeConfigSandboxConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigSandboxConfigGetArgs Empty = new NodePoolNodeConfigSandboxConfigGetArgs();

    @InputImport(name="sandboxType", required=true)
    private final Input<String> sandboxType;

    public Input<String> getSandboxType() {
        return this.sandboxType;
    }

    public NodePoolNodeConfigSandboxConfigGetArgs(Input<String> sandboxType) {
        this.sandboxType = Objects.requireNonNull(sandboxType, "expected parameter 'sandboxType' to be non-null");
    }

    private NodePoolNodeConfigSandboxConfigGetArgs() {
        this.sandboxType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigSandboxConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigSandboxConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder setSandboxType(Input<String> sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }

        public Builder setSandboxType(String sandboxType) {
            this.sandboxType = Input.of(Objects.requireNonNull(sandboxType));
            return this;
        }

        public NodePoolNodeConfigSandboxConfigGetArgs build() {
            return new NodePoolNodeConfigSandboxConfigGetArgs(sandboxType);
        }
    }
}
