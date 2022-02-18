// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * 
 */
public final class AutoscalingPolicyScaleInControlResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyScaleInControlResponse Empty = new AutoscalingPolicyScaleInControlResponse();

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    @InputImport(name="maxScaledInReplicas", required=true)
    private final FixedOrPercentResponse maxScaledInReplicas;

    public FixedOrPercentResponse getMaxScaledInReplicas() {
        return this.maxScaledInReplicas;
    }

    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    @InputImport(name="timeWindowSec", required=true)
    private final Integer timeWindowSec;

    public Integer getTimeWindowSec() {
        return this.timeWindowSec;
    }

    public AutoscalingPolicyScaleInControlResponse(
        FixedOrPercentResponse maxScaledInReplicas,
        Integer timeWindowSec) {
        this.maxScaledInReplicas = Objects.requireNonNull(maxScaledInReplicas, "expected parameter 'maxScaledInReplicas' to be non-null");
        this.timeWindowSec = Objects.requireNonNull(timeWindowSec, "expected parameter 'timeWindowSec' to be non-null");
    }

    private AutoscalingPolicyScaleInControlResponse() {
        this.maxScaledInReplicas = null;
        this.timeWindowSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyScaleInControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse maxScaledInReplicas;
        private Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyScaleInControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledInReplicas(FixedOrPercentResponse maxScaledInReplicas) {
            this.maxScaledInReplicas = Objects.requireNonNull(maxScaledInReplicas);
            return this;
        }

        public Builder setTimeWindowSec(Integer timeWindowSec) {
            this.timeWindowSec = Objects.requireNonNull(timeWindowSec);
            return this;
        }

        public AutoscalingPolicyScaleInControlResponse build() {
            return new AutoscalingPolicyScaleInControlResponse(maxScaledInReplicas, timeWindowSec);
        }
    }
}
