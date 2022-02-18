// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetRegionInstanceGroupInstanceNamedPort;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRegionInstanceGroupInstance {
    /**
     * URL to the instance.
     * 
     */
    private final String instance;
    /**
     * List of named ports in the group, as a list of resources, each containing:
     * 
     */
    private final List<GetRegionInstanceGroupInstanceNamedPort> namedPorts;
    /**
     * String description of current state of the instance.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"instance","namedPorts","status"})
    private GetRegionInstanceGroupInstance(
        String instance,
        List<GetRegionInstanceGroupInstanceNamedPort> namedPorts,
        String status) {
        this.instance = Objects.requireNonNull(instance);
        this.namedPorts = Objects.requireNonNull(namedPorts);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * URL to the instance.
     * 
     */
    public String getInstance() {
        return this.instance;
    }
    /**
     * List of named ports in the group, as a list of resources, each containing:
     * 
     */
    public List<GetRegionInstanceGroupInstanceNamedPort> getNamedPorts() {
        return this.namedPorts;
    }
    /**
     * String description of current state of the instance.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instance;
        private List<GetRegionInstanceGroupInstanceNamedPort> namedPorts;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstanceGroupInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.namedPorts = defaults.namedPorts;
    	      this.status = defaults.status;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setNamedPorts(List<GetRegionInstanceGroupInstanceNamedPort> namedPorts) {
            this.namedPorts = Objects.requireNonNull(namedPorts);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public GetRegionInstanceGroupInstance build() {
            return new GetRegionInstanceGroupInstance(instance, namedPorts, status);
        }
    }
}
