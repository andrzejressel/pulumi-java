// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingNodeAffinityArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateSchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateSchedulingArgs Empty = new InstanceFromTemplateSchedulingArgs();

    @InputImport(name="automaticRestart")
    private final @Nullable Input<Boolean> automaticRestart;

    public Input<Boolean> getAutomaticRestart() {
        return this.automaticRestart == null ? Input.empty() : this.automaticRestart;
    }

    @InputImport(name="minNodeCpus")
    private final @Nullable Input<Integer> minNodeCpus;

    public Input<Integer> getMinNodeCpus() {
        return this.minNodeCpus == null ? Input.empty() : this.minNodeCpus;
    }

    @InputImport(name="nodeAffinities")
    private final @Nullable Input<List<InstanceFromTemplateSchedulingNodeAffinityArgs>> nodeAffinities;

    public Input<List<InstanceFromTemplateSchedulingNodeAffinityArgs>> getNodeAffinities() {
        return this.nodeAffinities == null ? Input.empty() : this.nodeAffinities;
    }

    @InputImport(name="onHostMaintenance")
    private final @Nullable Input<String> onHostMaintenance;

    public Input<String> getOnHostMaintenance() {
        return this.onHostMaintenance == null ? Input.empty() : this.onHostMaintenance;
    }

    @InputImport(name="preemptible")
    private final @Nullable Input<Boolean> preemptible;

    public Input<Boolean> getPreemptible() {
        return this.preemptible == null ? Input.empty() : this.preemptible;
    }

    public InstanceFromTemplateSchedulingArgs(
        @Nullable Input<Boolean> automaticRestart,
        @Nullable Input<Integer> minNodeCpus,
        @Nullable Input<List<InstanceFromTemplateSchedulingNodeAffinityArgs>> nodeAffinities,
        @Nullable Input<String> onHostMaintenance,
        @Nullable Input<Boolean> preemptible) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
    }

    private InstanceFromTemplateSchedulingArgs() {
        this.automaticRestart = Input.empty();
        this.minNodeCpus = Input.empty();
        this.nodeAffinities = Input.empty();
        this.onHostMaintenance = Input.empty();
        this.preemptible = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> automaticRestart;
        private @Nullable Input<Integer> minNodeCpus;
        private @Nullable Input<List<InstanceFromTemplateSchedulingNodeAffinityArgs>> nodeAffinities;
        private @Nullable Input<String> onHostMaintenance;
        private @Nullable Input<Boolean> preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateSchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder setAutomaticRestart(@Nullable Input<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }

        public Builder setAutomaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Input.ofNullable(automaticRestart);
            return this;
        }

        public Builder setMinNodeCpus(@Nullable Input<Integer> minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder setMinNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = Input.ofNullable(minNodeCpus);
            return this;
        }

        public Builder setNodeAffinities(@Nullable Input<List<InstanceFromTemplateSchedulingNodeAffinityArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder setNodeAffinities(@Nullable List<InstanceFromTemplateSchedulingNodeAffinityArgs> nodeAffinities) {
            this.nodeAffinities = Input.ofNullable(nodeAffinities);
            return this;
        }

        public Builder setOnHostMaintenance(@Nullable Input<String> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder setOnHostMaintenance(@Nullable String onHostMaintenance) {
            this.onHostMaintenance = Input.ofNullable(onHostMaintenance);
            return this;
        }

        public Builder setPreemptible(@Nullable Input<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public Builder setPreemptible(@Nullable Boolean preemptible) {
            this.preemptible = Input.ofNullable(preemptible);
            return this;
        }

        public InstanceFromTemplateSchedulingArgs build() {
            return new InstanceFromTemplateSchedulingArgs(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
