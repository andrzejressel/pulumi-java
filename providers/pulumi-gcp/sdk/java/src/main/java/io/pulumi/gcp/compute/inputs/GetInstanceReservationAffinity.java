// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.GetInstanceReservationAffinitySpecificReservation;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceReservationAffinity extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceReservationAffinity Empty = new GetInstanceReservationAffinity();

    @InputImport(name="specificReservations", required=true)
    private final List<GetInstanceReservationAffinitySpecificReservation> specificReservations;

    public List<GetInstanceReservationAffinitySpecificReservation> getSpecificReservations() {
        return this.specificReservations;
    }

    /**
     * The accelerator type resource exposed to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public GetInstanceReservationAffinity(
        List<GetInstanceReservationAffinitySpecificReservation> specificReservations,
        String type) {
        this.specificReservations = Objects.requireNonNull(specificReservations, "expected parameter 'specificReservations' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetInstanceReservationAffinity() {
        this.specificReservations = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceReservationAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceReservationAffinitySpecificReservation> specificReservations;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceReservationAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservations = defaults.specificReservations;
    	      this.type = defaults.type;
        }

        public Builder setSpecificReservations(List<GetInstanceReservationAffinitySpecificReservation> specificReservations) {
            this.specificReservations = Objects.requireNonNull(specificReservations);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetInstanceReservationAffinity build() {
            return new GetInstanceReservationAffinity(specificReservations, type);
        }
    }
}
