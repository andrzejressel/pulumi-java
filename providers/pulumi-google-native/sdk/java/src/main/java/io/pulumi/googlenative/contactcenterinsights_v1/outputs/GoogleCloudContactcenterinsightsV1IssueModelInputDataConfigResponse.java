// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse {
    /**
     * A filter to reduce the conversations used for training the model to a specific subset.
     * 
     */
    private final String filter;
    /**
     * Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
     * 
     */
    private final String medium;
    /**
     * Number of conversations used in training. Output only.
     * 
     */
    private final String trainingConversationsCount;

    @OutputCustomType.Constructor({"filter","medium","trainingConversationsCount"})
    private GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse(
        String filter,
        String medium,
        String trainingConversationsCount) {
        this.filter = Objects.requireNonNull(filter);
        this.medium = Objects.requireNonNull(medium);
        this.trainingConversationsCount = Objects.requireNonNull(trainingConversationsCount);
    }

    /**
     * A filter to reduce the conversations used for training the model to a specific subset.
     * 
     */
    public String getFilter() {
        return this.filter;
    }
    /**
     * Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
     * 
     */
    public String getMedium() {
        return this.medium;
    }
    /**
     * Number of conversations used in training. Output only.
     * 
     */
    public String getTrainingConversationsCount() {
        return this.trainingConversationsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String medium;
        private String trainingConversationsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.medium = defaults.medium;
    	      this.trainingConversationsCount = defaults.trainingConversationsCount;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setMedium(String medium) {
            this.medium = Objects.requireNonNull(medium);
            return this;
        }

        public Builder setTrainingConversationsCount(String trainingConversationsCount) {
            this.trainingConversationsCount = Objects.requireNonNull(trainingConversationsCount);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse(filter, medium, trainingConversationsCount);
        }
    }
}
