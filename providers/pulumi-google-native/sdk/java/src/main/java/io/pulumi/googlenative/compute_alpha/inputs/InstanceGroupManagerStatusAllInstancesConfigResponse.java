// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerStatusAllInstancesConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerStatusAllInstancesConfigResponse Empty = new InstanceGroupManagerStatusAllInstancesConfigResponse();

    /**
     * Current instances' config revision. This value is in RFC3339 text format.
     * 
     */
    @InputImport(name="currentRevision", required=true)
    private final String currentRevision;

    public String getCurrentRevision() {
        return this.currentRevision;
    }

    /**
     * A bit indicating whether instances' config has been applied to all managed instances in managed instance group.
     * 
     */
    @InputImport(name="effective", required=true)
    private final Boolean effective;

    public Boolean getEffective() {
        return this.effective;
    }

    public InstanceGroupManagerStatusAllInstancesConfigResponse(
        String currentRevision,
        Boolean effective) {
        this.currentRevision = Objects.requireNonNull(currentRevision, "expected parameter 'currentRevision' to be non-null");
        this.effective = Objects.requireNonNull(effective, "expected parameter 'effective' to be non-null");
    }

    private InstanceGroupManagerStatusAllInstancesConfigResponse() {
        this.currentRevision = null;
        this.effective = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusAllInstancesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentRevision;
        private Boolean effective;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusAllInstancesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentRevision = defaults.currentRevision;
    	      this.effective = defaults.effective;
        }

        public Builder setCurrentRevision(String currentRevision) {
            this.currentRevision = Objects.requireNonNull(currentRevision);
            return this;
        }

        public Builder setEffective(Boolean effective) {
            this.effective = Objects.requireNonNull(effective);
            return this;
        }

        public InstanceGroupManagerStatusAllInstancesConfigResponse build() {
            return new InstanceGroupManagerStatusAllInstancesConfigResponse(currentRevision, effective);
        }
    }
}
