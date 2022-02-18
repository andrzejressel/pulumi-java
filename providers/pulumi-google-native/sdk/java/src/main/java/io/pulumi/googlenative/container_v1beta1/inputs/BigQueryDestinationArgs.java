// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for using BigQuery as the destination of resource usage export.
 * 
 */
public final class BigQueryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BigQueryDestinationArgs Empty = new BigQueryDestinationArgs();

    /**
     * The ID of a BigQuery Dataset.
     * 
     */
    @InputImport(name="datasetId")
    private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    public BigQueryDestinationArgs(@Nullable Input<String> datasetId) {
        this.datasetId = datasetId;
    }

    private BigQueryDestinationArgs() {
        this.datasetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetId;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
        }

        public Builder setDatasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder setDatasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public BigQueryDestinationArgs build() {
            return new BigQueryDestinationArgs(datasetId);
        }
    }
}
