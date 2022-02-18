// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Statistics related to processing hybrid inspect requests.
 * 
 */
public final class GooglePrivacyDlpV2HybridInspectStatisticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2HybridInspectStatisticsResponse Empty = new GooglePrivacyDlpV2HybridInspectStatisticsResponse();

    /**
     * The number of hybrid inspection requests aborted because the job ran out of quota or was ended before they could be processed.
     * 
     */
    @InputImport(name="abortedCount", required=true)
    private final String abortedCount;

    public String getAbortedCount() {
        return this.abortedCount;
    }

    /**
     * The number of hybrid requests currently being processed. Only populated when called via method `getDlpJob`. A burst of traffic may cause hybrid inspect requests to be enqueued. Processing will take place as quickly as possible, but resource limitations may impact how long a request is enqueued for.
     * 
     */
    @InputImport(name="pendingCount", required=true)
    private final String pendingCount;

    public String getPendingCount() {
        return this.pendingCount;
    }

    /**
     * The number of hybrid inspection requests processed within this job.
     * 
     */
    @InputImport(name="processedCount", required=true)
    private final String processedCount;

    public String getProcessedCount() {
        return this.processedCount;
    }

    public GooglePrivacyDlpV2HybridInspectStatisticsResponse(
        String abortedCount,
        String pendingCount,
        String processedCount) {
        this.abortedCount = Objects.requireNonNull(abortedCount, "expected parameter 'abortedCount' to be non-null");
        this.pendingCount = Objects.requireNonNull(pendingCount, "expected parameter 'pendingCount' to be non-null");
        this.processedCount = Objects.requireNonNull(processedCount, "expected parameter 'processedCount' to be non-null");
    }

    private GooglePrivacyDlpV2HybridInspectStatisticsResponse() {
        this.abortedCount = null;
        this.pendingCount = null;
        this.processedCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2HybridInspectStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String abortedCount;
        private String pendingCount;
        private String processedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2HybridInspectStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortedCount = defaults.abortedCount;
    	      this.pendingCount = defaults.pendingCount;
    	      this.processedCount = defaults.processedCount;
        }

        public Builder setAbortedCount(String abortedCount) {
            this.abortedCount = Objects.requireNonNull(abortedCount);
            return this;
        }

        public Builder setPendingCount(String pendingCount) {
            this.pendingCount = Objects.requireNonNull(pendingCount);
            return this;
        }

        public Builder setProcessedCount(String processedCount) {
            this.processedCount = Objects.requireNonNull(processedCount);
            return this;
        }

        public GooglePrivacyDlpV2HybridInspectStatisticsResponse build() {
            return new GooglePrivacyDlpV2HybridInspectStatisticsResponse(abortedCount, pendingCount, processedCount);
        }
    }
}
