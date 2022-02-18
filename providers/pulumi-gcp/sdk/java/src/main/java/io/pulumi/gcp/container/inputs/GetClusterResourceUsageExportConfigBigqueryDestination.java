// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterResourceUsageExportConfigBigqueryDestination extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterResourceUsageExportConfigBigqueryDestination Empty = new GetClusterResourceUsageExportConfigBigqueryDestination();

    @InputImport(name="datasetId", required=true)
    private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    public GetClusterResourceUsageExportConfigBigqueryDestination(String datasetId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
    }

    private GetClusterResourceUsageExportConfigBigqueryDestination() {
        this.datasetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResourceUsageExportConfigBigqueryDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResourceUsageExportConfigBigqueryDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public GetClusterResourceUsageExportConfigBigqueryDestination build() {
            return new GetClusterResourceUsageExportConfigBigqueryDestination(datasetId);
        }
    }
}
