// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NodeTemplateServerBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTemplateServerBindingArgs Empty = new NodeTemplateServerBindingArgs();

    /**
     * Type of server binding policy. If `RESTART_NODE_ON_ANY_SERVER`,
     * nodes using this template will restart on any physical server
     * following a maintenance event.
     * If `RESTART_NODE_ON_MINIMAL_SERVER`, nodes using this template
     * will restart on the same physical server following a maintenance
     * event, instead of being live migrated to or restarted on a new
     * physical server. This option may be useful if you are using
     * software licenses tied to the underlying server characteristics
     * such as physical sockets or cores, to avoid the need for
     * additional licenses when maintenance occurs. However, VMs on such
     * nodes will experience outages while maintenance is applied.
     * Possible values are `RESTART_NODE_ON_ANY_SERVER` and `RESTART_NODE_ON_MINIMAL_SERVERS`.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public NodeTemplateServerBindingArgs(Input<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NodeTemplateServerBindingArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateServerBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateServerBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public NodeTemplateServerBindingArgs build() {
            return new NodeTemplateServerBindingArgs(type);
        }
    }
}
