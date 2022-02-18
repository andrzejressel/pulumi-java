// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.InstancePropertiesPatchResponse;
import java.util.Objects;


public final class InstanceGroupManagerAllInstancesConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerAllInstancesConfigResponse Empty = new InstanceGroupManagerAllInstancesConfigResponse();

    /**
     * Properties for instances that are created using this instances config. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting instances_config, you must update your instances to use it; for example, you can use the applyUpdatesToInstances method.
     * 
     */
    @InputImport(name="properties", required=true)
    private final InstancePropertiesPatchResponse properties;

    public InstancePropertiesPatchResponse getProperties() {
        return this.properties;
    }

    public InstanceGroupManagerAllInstancesConfigResponse(InstancePropertiesPatchResponse properties) {
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private InstanceGroupManagerAllInstancesConfigResponse() {
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePropertiesPatchResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder setProperties(InstancePropertiesPatchResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public InstanceGroupManagerAllInstancesConfigResponse build() {
            return new InstanceGroupManagerAllInstancesConfigResponse(properties);
        }
    }
}
