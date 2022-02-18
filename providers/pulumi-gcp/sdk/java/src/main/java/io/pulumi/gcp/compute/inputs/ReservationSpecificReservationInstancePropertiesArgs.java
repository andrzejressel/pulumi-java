// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationInstancePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesArgs Empty = new ReservationSpecificReservationInstancePropertiesArgs();

    /**
     * Guest accelerator type and count.
     * Structure is documented below.
     * 
     */
    @InputImport(name="guestAccelerators")
    private final @Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators;

    public Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Input.empty() : this.guestAccelerators;
    }

    /**
     * The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * 
     */
    @InputImport(name="localSsds")
    private final @Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds;

    public Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> getLocalSsds() {
        return this.localSsds == null ? Input.empty() : this.localSsds;
    }

    /**
     * The name of the machine type to reserve.
     * 
     */
    @InputImport(name="machineType", required=true)
    private final Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType;
    }

    /**
     * The minimum CPU platform for the reservation. For example,
     * `"Intel Skylake"`. See
     * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
     * for information on available CPU platforms.
     * 
     */
    @InputImport(name="minCpuPlatform")
    private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    public ReservationSpecificReservationInstancePropertiesArgs(
        @Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds,
        Input<String> machineType,
        @Nullable Input<String> minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.minCpuPlatform = minCpuPlatform;
    }

    private ReservationSpecificReservationInstancePropertiesArgs() {
        this.guestAccelerators = Input.empty();
        this.localSsds = Input.empty();
        this.machineType = Input.empty();
        this.minCpuPlatform = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds;
        private Input<String> machineType;
        private @Nullable Input<String> minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder setGuestAccelerators(@Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder setGuestAccelerators(@Nullable List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Input.ofNullable(guestAccelerators);
            return this;
        }

        public Builder setLocalSsds(@Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds) {
            this.localSsds = localSsds;
            return this;
        }

        public Builder setLocalSsds(@Nullable List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs> localSsds) {
            this.localSsds = Input.ofNullable(localSsds);
            return this;
        }

        public Builder setMachineType(Input<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Input.of(Objects.requireNonNull(machineType));
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public ReservationSpecificReservationInstancePropertiesArgs build() {
            return new ReservationSpecificReservationInstancePropertiesArgs(guestAccelerators, localSsds, machineType, minCpuPlatform);
        }
    }
}
