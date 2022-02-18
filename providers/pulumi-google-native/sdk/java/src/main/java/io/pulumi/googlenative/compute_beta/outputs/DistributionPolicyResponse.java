// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.DistributionPolicyZoneConfigurationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DistributionPolicyResponse {
    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    private final String targetShape;
    /**
     * Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    private final List<DistributionPolicyZoneConfigurationResponse> zones;

    @OutputCustomType.Constructor({"targetShape","zones"})
    private DistributionPolicyResponse(
        String targetShape,
        List<DistributionPolicyZoneConfigurationResponse> zones) {
        this.targetShape = Objects.requireNonNull(targetShape);
        this.zones = Objects.requireNonNull(zones);
    }

    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    public String getTargetShape() {
        return this.targetShape;
    }
    /**
     * Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    public List<DistributionPolicyZoneConfigurationResponse> getZones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetShape;
        private List<DistributionPolicyZoneConfigurationResponse> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetShape = defaults.targetShape;
    	      this.zones = defaults.zones;
        }

        public Builder setTargetShape(String targetShape) {
            this.targetShape = Objects.requireNonNull(targetShape);
            return this;
        }

        public Builder setZones(List<DistributionPolicyZoneConfigurationResponse> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }

        public DistributionPolicyResponse build() {
            return new DistributionPolicyResponse(targetShape, zones);
        }
    }
}
