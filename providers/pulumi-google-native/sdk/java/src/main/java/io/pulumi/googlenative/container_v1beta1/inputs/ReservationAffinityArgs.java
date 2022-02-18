// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.enums.ReservationAffinityConsumeReservationType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [ReservationAffinity](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) is the configuration of desired reservation which instances could take capacity from.
 * 
 */
public final class ReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationAffinityArgs Empty = new ReservationAffinityArgs();

    /**
     * Corresponds to the type of reservation consumption.
     * 
     */
    @InputImport(name="consumeReservationType")
    private final @Nullable Input<ReservationAffinityConsumeReservationType> consumeReservationType;

    public Input<ReservationAffinityConsumeReservationType> getConsumeReservationType() {
        return this.consumeReservationType == null ? Input.empty() : this.consumeReservationType;
    }

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify "googleapis.com/reservation-name" as the key and specify the name of your reservation as its value.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Corresponds to the label value(s) of reservation resource(s).
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ReservationAffinityArgs(
        @Nullable Input<ReservationAffinityConsumeReservationType> consumeReservationType,
        @Nullable Input<String> key,
        @Nullable Input<List<String>> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    private ReservationAffinityArgs() {
        this.consumeReservationType = Input.empty();
        this.key = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ReservationAffinityConsumeReservationType> consumeReservationType;
        private @Nullable Input<String> key;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setConsumeReservationType(@Nullable Input<ReservationAffinityConsumeReservationType> consumeReservationType) {
            this.consumeReservationType = consumeReservationType;
            return this;
        }

        public Builder setConsumeReservationType(@Nullable ReservationAffinityConsumeReservationType consumeReservationType) {
            this.consumeReservationType = Input.ofNullable(consumeReservationType);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public ReservationAffinityArgs build() {
            return new ReservationAffinityArgs(consumeReservationType, key, values);
        }
    }
}
