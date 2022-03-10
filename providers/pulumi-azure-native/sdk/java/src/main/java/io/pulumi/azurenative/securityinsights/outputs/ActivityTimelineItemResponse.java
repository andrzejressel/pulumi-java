// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ActivityTimelineItemResponse {
    /**
     * The grouping bucket end time.
     * 
     */
    private final String bucketEndTimeUTC;
    /**
     * The grouping bucket start time.
     * 
     */
    private final String bucketStartTimeUTC;
    /**
     * The activity timeline content.
     * 
     */
    private final String content;
    /**
     * The time of the first activity in the grouping bucket.
     * 
     */
    private final String firstActivityTimeUTC;
    /**
     * The entity query kind
     * Expected value is 'Activity'.
     * 
     */
    private final String kind;
    /**
     * The time of the last activity in the grouping bucket.
     * 
     */
    private final String lastActivityTimeUTC;
    /**
     * The activity query id.
     * 
     */
    private final String queryId;
    /**
     * The activity timeline title.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor
    private ActivityTimelineItemResponse(
        @OutputCustomType.Parameter("bucketEndTimeUTC") String bucketEndTimeUTC,
        @OutputCustomType.Parameter("bucketStartTimeUTC") String bucketStartTimeUTC,
        @OutputCustomType.Parameter("content") String content,
        @OutputCustomType.Parameter("firstActivityTimeUTC") String firstActivityTimeUTC,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("lastActivityTimeUTC") String lastActivityTimeUTC,
        @OutputCustomType.Parameter("queryId") String queryId,
        @OutputCustomType.Parameter("title") String title) {
        this.bucketEndTimeUTC = bucketEndTimeUTC;
        this.bucketStartTimeUTC = bucketStartTimeUTC;
        this.content = content;
        this.firstActivityTimeUTC = firstActivityTimeUTC;
        this.kind = kind;
        this.lastActivityTimeUTC = lastActivityTimeUTC;
        this.queryId = queryId;
        this.title = title;
    }

    /**
     * The grouping bucket end time.
     * 
    */
    public String getBucketEndTimeUTC() {
        return this.bucketEndTimeUTC;
    }
    /**
     * The grouping bucket start time.
     * 
    */
    public String getBucketStartTimeUTC() {
        return this.bucketStartTimeUTC;
    }
    /**
     * The activity timeline content.
     * 
    */
    public String getContent() {
        return this.content;
    }
    /**
     * The time of the first activity in the grouping bucket.
     * 
    */
    public String getFirstActivityTimeUTC() {
        return this.firstActivityTimeUTC;
    }
    /**
     * The entity query kind
     * Expected value is 'Activity'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The time of the last activity in the grouping bucket.
     * 
    */
    public String getLastActivityTimeUTC() {
        return this.lastActivityTimeUTC;
    }
    /**
     * The activity query id.
     * 
    */
    public String getQueryId() {
        return this.queryId;
    }
    /**
     * The activity timeline title.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityTimelineItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketEndTimeUTC;
        private String bucketStartTimeUTC;
        private String content;
        private String firstActivityTimeUTC;
        private String kind;
        private String lastActivityTimeUTC;
        private String queryId;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityTimelineItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketEndTimeUTC = defaults.bucketEndTimeUTC;
    	      this.bucketStartTimeUTC = defaults.bucketStartTimeUTC;
    	      this.content = defaults.content;
    	      this.firstActivityTimeUTC = defaults.firstActivityTimeUTC;
    	      this.kind = defaults.kind;
    	      this.lastActivityTimeUTC = defaults.lastActivityTimeUTC;
    	      this.queryId = defaults.queryId;
    	      this.title = defaults.title;
        }

        public Builder setBucketEndTimeUTC(String bucketEndTimeUTC) {
            this.bucketEndTimeUTC = Objects.requireNonNull(bucketEndTimeUTC);
            return this;
        }

        public Builder setBucketStartTimeUTC(String bucketStartTimeUTC) {
            this.bucketStartTimeUTC = Objects.requireNonNull(bucketStartTimeUTC);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setFirstActivityTimeUTC(String firstActivityTimeUTC) {
            this.firstActivityTimeUTC = Objects.requireNonNull(firstActivityTimeUTC);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLastActivityTimeUTC(String lastActivityTimeUTC) {
            this.lastActivityTimeUTC = Objects.requireNonNull(lastActivityTimeUTC);
            return this;
        }

        public Builder setQueryId(String queryId) {
            this.queryId = Objects.requireNonNull(queryId);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public ActivityTimelineItemResponse build() {
            return new ActivityTimelineItemResponse(bucketEndTimeUTC, bucketStartTimeUTC, content, firstActivityTimeUTC, kind, lastActivityTimeUTC, queryId, title);
        }
    }
}
