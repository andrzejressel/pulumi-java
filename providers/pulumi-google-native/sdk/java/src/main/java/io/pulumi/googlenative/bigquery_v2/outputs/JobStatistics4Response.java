// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobStatistics4Response {
    /**
     * Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the URIs specified in the 'destinationUris' field.
     * 
     */
    private final List<String> destinationUriFileCounts;
    /**
     * Number of user bytes extracted into the result. This is the byte count as computed by BigQuery for billing purposes.
     * 
     */
    private final String inputBytes;

    @OutputCustomType.Constructor({"destinationUriFileCounts","inputBytes"})
    private JobStatistics4Response(
        List<String> destinationUriFileCounts,
        String inputBytes) {
        this.destinationUriFileCounts = Objects.requireNonNull(destinationUriFileCounts);
        this.inputBytes = Objects.requireNonNull(inputBytes);
    }

    /**
     * Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the URIs specified in the 'destinationUris' field.
     * 
     */
    public List<String> getDestinationUriFileCounts() {
        return this.destinationUriFileCounts;
    }
    /**
     * Number of user bytes extracted into the result. This is the byte count as computed by BigQuery for billing purposes.
     * 
     */
    public String getInputBytes() {
        return this.inputBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatistics4Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destinationUriFileCounts;
        private String inputBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatistics4Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationUriFileCounts = defaults.destinationUriFileCounts;
    	      this.inputBytes = defaults.inputBytes;
        }

        public Builder setDestinationUriFileCounts(List<String> destinationUriFileCounts) {
            this.destinationUriFileCounts = Objects.requireNonNull(destinationUriFileCounts);
            return this;
        }

        public Builder setInputBytes(String inputBytes) {
            this.inputBytes = Objects.requireNonNull(inputBytes);
            return this;
        }

        public JobStatistics4Response build() {
            return new JobStatistics4Response(destinationUriFileCounts, inputBytes);
        }
    }
}
