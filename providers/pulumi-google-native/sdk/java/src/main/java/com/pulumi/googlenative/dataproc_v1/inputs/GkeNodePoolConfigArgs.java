// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.GkeNodeConfigArgs;
import com.pulumi.googlenative.dataproc_v1.inputs.GkeNodePoolAutoscalingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of a GKE NodePool used by a Dataproc-on-GKE cluster (https://cloud.google.com/dataproc/docs/concepts/jobs/dataproc-gke#create-a-dataproc-on-gke-cluster).
 * 
 */
public final class GkeNodePoolConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GkeNodePoolConfigArgs Empty = new GkeNodePoolConfigArgs();

    /**
     * Optional. The autoscaler configuration for this NodePool. The autoscaler is enabled only when a valid configuration is present.
     * 
     */
    @Import(name="autoscaling")
    private @Nullable Output<GkeNodePoolAutoscalingConfigArgs> autoscaling;

    /**
     * @return Optional. The autoscaler configuration for this NodePool. The autoscaler is enabled only when a valid configuration is present.
     * 
     */
    public Optional<Output<GkeNodePoolAutoscalingConfigArgs>> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }

    /**
     * Optional. The node pool configuration.
     * 
     */
    @Import(name="config")
    private @Nullable Output<GkeNodeConfigArgs> config;

    /**
     * @return Optional. The node pool configuration.
     * 
     */
    public Optional<Output<GkeNodeConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Optional. The list of Compute Engine zones (https://cloud.google.com/compute/docs/zones#available) where NodePool&#39;s nodes will be located.Note: Currently, only one zone may be specified.If a location is not specified during NodePool creation, Dataproc will choose a location.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return Optional. The list of Compute Engine zones (https://cloud.google.com/compute/docs/zones#available) where NodePool&#39;s nodes will be located.Note: Currently, only one zone may be specified.If a location is not specified during NodePool creation, Dataproc will choose a location.
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    private GkeNodePoolConfigArgs() {}

    private GkeNodePoolConfigArgs(GkeNodePoolConfigArgs $) {
        this.autoscaling = $.autoscaling;
        this.config = $.config;
        this.locations = $.locations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeNodePoolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeNodePoolConfigArgs $;

        public Builder() {
            $ = new GkeNodePoolConfigArgs();
        }

        public Builder(GkeNodePoolConfigArgs defaults) {
            $ = new GkeNodePoolConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaling Optional. The autoscaler configuration for this NodePool. The autoscaler is enabled only when a valid configuration is present.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(@Nullable Output<GkeNodePoolAutoscalingConfigArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        /**
         * @param autoscaling Optional. The autoscaler configuration for this NodePool. The autoscaler is enabled only when a valid configuration is present.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(GkeNodePoolAutoscalingConfigArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        /**
         * @param config Optional. The node pool configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<GkeNodeConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Optional. The node pool configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(GkeNodeConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param locations Optional. The list of Compute Engine zones (https://cloud.google.com/compute/docs/zones#available) where NodePool&#39;s nodes will be located.Note: Currently, only one zone may be specified.If a location is not specified during NodePool creation, Dataproc will choose a location.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations Optional. The list of Compute Engine zones (https://cloud.google.com/compute/docs/zones#available) where NodePool&#39;s nodes will be located.Note: Currently, only one zone may be specified.If a location is not specified during NodePool creation, Dataproc will choose a location.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations Optional. The list of Compute Engine zones (https://cloud.google.com/compute/docs/zones#available) where NodePool&#39;s nodes will be located.Note: Currently, only one zone may be specified.If a location is not specified during NodePool creation, Dataproc will choose a location.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public GkeNodePoolConfigArgs build() {
            return $;
        }
    }

}
