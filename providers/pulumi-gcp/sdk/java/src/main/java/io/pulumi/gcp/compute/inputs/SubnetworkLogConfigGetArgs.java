// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkLogConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkLogConfigGetArgs Empty = new SubnetworkLogConfigGetArgs();

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Toggles the aggregation interval for collecting flow logs. Increasing the
     * interval time will reduce the amount of generated flow logs for long
     * lasting connections. Default is an interval of 5 seconds per connection.
     * Default value is `INTERVAL_5_SEC`.
     * Possible values are `INTERVAL_5_SEC`, `INTERVAL_30_SEC`, `INTERVAL_1_MIN`, `INTERVAL_5_MIN`, `INTERVAL_10_MIN`, and `INTERVAL_15_MIN`.
     * 
     */
    @InputImport(name="aggregationInterval")
    private final @Nullable Input<String> aggregationInterval;

    public Input<String> getAggregationInterval() {
        return this.aggregationInterval == null ? Input.empty() : this.aggregationInterval;
    }

    /**
     * Export filter used to define which VPC flow logs should be logged, as as CEL expression. See
     * https://cloud.google.com/vpc/docs/flow-logs#filtering for details on how to format this field.
     * The default value is 'true', which evaluates to include everything.
     * 
     */
    @InputImport(name="filterExpr")
    private final @Nullable Input<String> filterExpr;

    public Input<String> getFilterExpr() {
        return this.filterExpr == null ? Input.empty() : this.filterExpr;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled.
     * The value of the field must be in [0, 1]. Set the sampling rate of VPC
     * flow logs within the subnetwork where 1.0 means all collected logs are
     * reported and 0.0 means no logs are reported. Default is 0.5 which means
     * half of all collected logs are reported.
     * 
     */
    @InputImport(name="flowSampling")
    private final @Nullable Input<Double> flowSampling;

    public Input<Double> getFlowSampling() {
        return this.flowSampling == null ? Input.empty() : this.flowSampling;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Configures whether metadata fields should be added to the reported VPC
     * flow logs.
     * Default value is `INCLUDE_ALL_METADATA`.
     * Possible values are `EXCLUDE_ALL_METADATA`, `INCLUDE_ALL_METADATA`, and `CUSTOM_METADATA`.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<String> metadata;

    public Input<String> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * List of metadata fields that should be added to reported logs.
     * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" is set to CUSTOM_METADATA.
     * 
     */
    @InputImport(name="metadataFields")
    private final @Nullable Input<List<String>> metadataFields;

    public Input<List<String>> getMetadataFields() {
        return this.metadataFields == null ? Input.empty() : this.metadataFields;
    }

    public SubnetworkLogConfigGetArgs(
        @Nullable Input<String> aggregationInterval,
        @Nullable Input<String> filterExpr,
        @Nullable Input<Double> flowSampling,
        @Nullable Input<String> metadata,
        @Nullable Input<List<String>> metadataFields) {
        this.aggregationInterval = aggregationInterval;
        this.filterExpr = filterExpr;
        this.flowSampling = flowSampling;
        this.metadata = metadata;
        this.metadataFields = metadataFields;
    }

    private SubnetworkLogConfigGetArgs() {
        this.aggregationInterval = Input.empty();
        this.filterExpr = Input.empty();
        this.flowSampling = Input.empty();
        this.metadata = Input.empty();
        this.metadataFields = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aggregationInterval;
        private @Nullable Input<String> filterExpr;
        private @Nullable Input<Double> flowSampling;
        private @Nullable Input<String> metadata;
        private @Nullable Input<List<String>> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder setAggregationInterval(@Nullable Input<String> aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }

        public Builder setAggregationInterval(@Nullable String aggregationInterval) {
            this.aggregationInterval = Input.ofNullable(aggregationInterval);
            return this;
        }

        public Builder setFilterExpr(@Nullable Input<String> filterExpr) {
            this.filterExpr = filterExpr;
            return this;
        }

        public Builder setFilterExpr(@Nullable String filterExpr) {
            this.filterExpr = Input.ofNullable(filterExpr);
            return this;
        }

        public Builder setFlowSampling(@Nullable Input<Double> flowSampling) {
            this.flowSampling = flowSampling;
            return this;
        }

        public Builder setFlowSampling(@Nullable Double flowSampling) {
            this.flowSampling = Input.ofNullable(flowSampling);
            return this;
        }

        public Builder setMetadata(@Nullable Input<String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable String metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMetadataFields(@Nullable Input<List<String>> metadataFields) {
            this.metadataFields = metadataFields;
            return this;
        }

        public Builder setMetadataFields(@Nullable List<String> metadataFields) {
            this.metadataFields = Input.ofNullable(metadataFields);
            return this;
        }

        public SubnetworkLogConfigGetArgs build() {
            return new SubnetworkLogConfigGetArgs(aggregationInterval, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}
