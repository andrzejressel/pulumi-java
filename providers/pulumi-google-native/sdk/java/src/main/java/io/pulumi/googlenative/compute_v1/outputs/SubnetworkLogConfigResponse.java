// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SubnetworkLogConfigResponse {
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
     * 
     */
    private final String aggregationInterval;
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled.
     * 
     */
    private final Boolean enable;
    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
     * 
     */
    private final String filterExpr;
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    private final Double flowSampling;
    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    private final String metadata;
    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
     * 
     */
    private final List<String> metadataFields;

    @OutputCustomType.Constructor({"aggregationInterval","enable","filterExpr","flowSampling","metadata","metadataFields"})
    private SubnetworkLogConfigResponse(
        String aggregationInterval,
        Boolean enable,
        String filterExpr,
        Double flowSampling,
        String metadata,
        List<String> metadataFields) {
        this.aggregationInterval = Objects.requireNonNull(aggregationInterval);
        this.enable = Objects.requireNonNull(enable);
        this.filterExpr = Objects.requireNonNull(filterExpr);
        this.flowSampling = Objects.requireNonNull(flowSampling);
        this.metadata = Objects.requireNonNull(metadata);
        this.metadataFields = Objects.requireNonNull(metadataFields);
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
     * 
     */
    public String getAggregationInterval() {
        return this.aggregationInterval;
    }
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled.
     * 
     */
    public Boolean getEnable() {
        return this.enable;
    }
    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
     * 
     */
    public String getFilterExpr() {
        return this.filterExpr;
    }
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    public Double getFlowSampling() {
        return this.flowSampling;
    }
    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    public String getMetadata() {
        return this.metadata;
    }
    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
     * 
     */
    public List<String> getMetadataFields() {
        return this.metadataFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationInterval;
        private Boolean enable;
        private String filterExpr;
        private Double flowSampling;
        private String metadata;
        private List<String> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.enable = defaults.enable;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder setAggregationInterval(String aggregationInterval) {
            this.aggregationInterval = Objects.requireNonNull(aggregationInterval);
            return this;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setFilterExpr(String filterExpr) {
            this.filterExpr = Objects.requireNonNull(filterExpr);
            return this;
        }

        public Builder setFlowSampling(Double flowSampling) {
            this.flowSampling = Objects.requireNonNull(flowSampling);
            return this;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMetadataFields(List<String> metadataFields) {
            this.metadataFields = Objects.requireNonNull(metadataFields);
            return this;
        }

        public SubnetworkLogConfigResponse build() {
            return new SubnetworkLogConfigResponse(aggregationInterval, enable, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}
