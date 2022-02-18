// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.InstanceFromMachineImageSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFromMachineImageScheduling {
    private final @Nullable Boolean automaticRestart;
    private final @Nullable Integer minNodeCpus;
    private final @Nullable List<InstanceFromMachineImageSchedulingNodeAffinity> nodeAffinities;
    private final @Nullable String onHostMaintenance;
    private final @Nullable Boolean preemptible;

    @OutputCustomType.Constructor({"automaticRestart","minNodeCpus","nodeAffinities","onHostMaintenance","preemptible"})
    private InstanceFromMachineImageScheduling(
        @Nullable Boolean automaticRestart,
        @Nullable Integer minNodeCpus,
        @Nullable List<InstanceFromMachineImageSchedulingNodeAffinity> nodeAffinities,
        @Nullable String onHostMaintenance,
        @Nullable Boolean preemptible) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
    }

    public Optional<Boolean> getAutomaticRestart() {
        return Optional.ofNullable(this.automaticRestart);
    }
    public Optional<Integer> getMinNodeCpus() {
        return Optional.ofNullable(this.minNodeCpus);
    }
    public List<InstanceFromMachineImageSchedulingNodeAffinity> getNodeAffinities() {
        return this.nodeAffinities == null ? List.of() : this.nodeAffinities;
    }
    public Optional<String> getOnHostMaintenance() {
        return Optional.ofNullable(this.onHostMaintenance);
    }
    public Optional<Boolean> getPreemptible() {
        return Optional.ofNullable(this.preemptible);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean automaticRestart;
        private @Nullable Integer minNodeCpus;
        private @Nullable List<InstanceFromMachineImageSchedulingNodeAffinity> nodeAffinities;
        private @Nullable String onHostMaintenance;
        private @Nullable Boolean preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder setAutomaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }

        public Builder setMinNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder setNodeAffinities(@Nullable List<InstanceFromMachineImageSchedulingNodeAffinity> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder setOnHostMaintenance(@Nullable String onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder setPreemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public InstanceFromMachineImageScheduling build() {
            return new InstanceFromMachineImageScheduling(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
