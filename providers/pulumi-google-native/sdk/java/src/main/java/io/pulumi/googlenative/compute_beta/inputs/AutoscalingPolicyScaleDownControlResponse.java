// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * 
 */
public final class AutoscalingPolicyScaleDownControlResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyScaleDownControlResponse Empty = new AutoscalingPolicyScaleDownControlResponse();

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    @InputImport(name="maxScaledDownReplicas", required=true)
    private final FixedOrPercentResponse maxScaledDownReplicas;

    public FixedOrPercentResponse getMaxScaledDownReplicas() {
        return this.maxScaledDownReplicas;
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

    public AutoscalingPolicyScaleDownControlResponse(
        FixedOrPercentResponse maxScaledDownReplicas,
        Integer timeWindowSec) {
        this.maxScaledDownReplicas = Objects.requireNonNull(maxScaledDownReplicas, "expected parameter 'maxScaledDownReplicas' to be non-null");
        this.timeWindowSec = Objects.requireNonNull(timeWindowSec, "expected parameter 'timeWindowSec' to be non-null");
    }

    private AutoscalingPolicyScaleDownControlResponse() {
        this.maxScaledDownReplicas = null;
        this.timeWindowSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyScaleDownControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse maxScaledDownReplicas;
        private Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyScaleDownControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledDownReplicas(FixedOrPercentResponse maxScaledDownReplicas) {
            this.maxScaledDownReplicas = Objects.requireNonNull(maxScaledDownReplicas);
            return this;
        }

        public Builder setTimeWindowSec(Integer timeWindowSec) {
            this.timeWindowSec = Objects.requireNonNull(timeWindowSec);
            return this;
        }

        public AutoscalingPolicyScaleDownControlResponse build() {
            return new AutoscalingPolicyScaleDownControlResponse(maxScaledDownReplicas, timeWindowSec);
        }
    }
}
