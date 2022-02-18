// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetIssueModelResult {
    /**
     * The time at which this issue model was created.
     * 
     */
    private final String createTime;
    /**
     * The representative name for the issue model.
     * 
     */
    private final String displayName;
    /**
     * Configs for the input data that used to create the issue model.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig;
    /**
     * Immutable. The resource name of the issue model. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    private final String name;
    /**
     * State of the model.
     * 
     */
    private final String state;
    /**
     * Immutable. The issue model's label statistics on its training data.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats;
    /**
     * The most recent time at which the issue model was updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","displayName","inputDataConfig","name","state","trainingStats","updateTime"})
    private GetIssueModelResult(
        String createTime,
        String displayName,
        GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig,
        String name,
        String state,
        GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.displayName = Objects.requireNonNull(displayName);
        this.inputDataConfig = Objects.requireNonNull(inputDataConfig);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.trainingStats = Objects.requireNonNull(trainingStats);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The time at which this issue model was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The representative name for the issue model.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Configs for the input data that used to create the issue model.
     * 
     */
    public GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse getInputDataConfig() {
        return this.inputDataConfig;
    }
    /**
     * Immutable. The resource name of the issue model. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * State of the model.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Immutable. The issue model's label statistics on its training data.
     * 
     */
    public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse getTrainingStats() {
        return this.trainingStats;
    }
    /**
     * The most recent time at which the issue model was updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIssueModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig;
        private String name;
        private String state;
        private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIssueModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.inputDataConfig = defaults.inputDataConfig;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.trainingStats = defaults.trainingStats;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setInputDataConfig(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig) {
            this.inputDataConfig = Objects.requireNonNull(inputDataConfig);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTrainingStats(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats) {
            this.trainingStats = Objects.requireNonNull(trainingStats);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetIssueModelResult build() {
            return new GetIssueModelResult(createTime, displayName, inputDataConfig, name, state, trainingStats, updateTime);
        }
    }
}
