// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import java.util.Objects;


/**
 * Future parameters for the availability SLI.
 * 
 */
public final class AvailabilityCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final AvailabilityCriteriaArgs Empty = new AvailabilityCriteriaArgs();

    public AvailabilityCriteriaArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilityCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilityCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public AvailabilityCriteriaArgs build() {
            return new AvailabilityCriteriaArgs();
        }
    }
}
