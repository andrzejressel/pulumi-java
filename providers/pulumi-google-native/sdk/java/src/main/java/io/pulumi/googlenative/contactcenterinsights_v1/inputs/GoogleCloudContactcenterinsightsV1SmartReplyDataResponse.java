// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Agent Assist Smart Reply data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1SmartReplyDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1SmartReplyDataResponse Empty = new GoogleCloudContactcenterinsightsV1SmartReplyDataResponse();

    /**
     * The system's confidence score that this reply is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    @InputImport(name="confidenceScore", required=true)
    private final Double confidenceScore;

    public Double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Map that contains metadata about the Smart Reply and the document from which it originates.
     * 
     */
    @InputImport(name="metadata", required=true)
    private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    @InputImport(name="queryRecord", required=true)
    private final String queryRecord;

    public String getQueryRecord() {
        return this.queryRecord;
    }

    /**
     * The content of the reply.
     * 
     */
    @InputImport(name="reply", required=true)
    private final String reply;

    public String getReply() {
        return this.reply;
    }

    public GoogleCloudContactcenterinsightsV1SmartReplyDataResponse(
        Double confidenceScore,
        Map<String,String> metadata,
        String queryRecord,
        String reply) {
        this.confidenceScore = Objects.requireNonNull(confidenceScore, "expected parameter 'confidenceScore' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.queryRecord = Objects.requireNonNull(queryRecord, "expected parameter 'queryRecord' to be non-null");
        this.reply = Objects.requireNonNull(reply, "expected parameter 'reply' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1SmartReplyDataResponse() {
        this.confidenceScore = null;
        this.metadata = Map.of();
        this.queryRecord = null;
        this.reply = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1SmartReplyDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String reply;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1SmartReplyDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.reply = defaults.reply;
        }

        public Builder setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = Objects.requireNonNull(confidenceScore);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setQueryRecord(String queryRecord) {
            this.queryRecord = Objects.requireNonNull(queryRecord);
            return this;
        }

        public Builder setReply(String reply) {
            this.reply = Objects.requireNonNull(reply);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1SmartReplyDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1SmartReplyDataResponse(confidenceScore, metadata, queryRecord, reply);
        }
    }
}
