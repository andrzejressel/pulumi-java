// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudsearch_v1.outputs.DataSourceRestrictionResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.FacetOptionsResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.QueryInterpretationConfigResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.ScoringConfigResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.SortOptionsResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.SourceConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSearchApplicationResult {
    /**
     * Retrictions applied to the configurations. The maximum number of elements is 10.
     * 
     */
    private final List<DataSourceRestrictionResponse> dataSourceRestrictions;
    /**
     * The default fields for returning facet results. The sources specified here also have been included in data_source_restrictions above.
     * 
     */
    private final List<FacetOptionsResponse> defaultFacetOptions;
    /**
     * The default options for sorting the search results
     * 
     */
    private final SortOptionsResponse defaultSortOptions;
    /**
     * Display name of the Search Application. The maximum length is 300 characters.
     * 
     */
    private final String displayName;
    /**
     * Indicates whether audit logging is on/off for requests made for the search application in query APIs.
     * 
     */
    private final Boolean enableAuditLog;
    /**
     * Name of the Search Application. Format: searchapplications/{application_id}.
     * 
     */
    private final String name;
    /**
     * IDs of the Long Running Operations (LROs) currently running for this schema. Output only field.
     * 
     */
    private final List<String> operationIds;
    /**
     * The default options for query interpretation
     * 
     */
    private final QueryInterpretationConfigResponse queryInterpretationConfig;
    /**
     * With each result we should return the URI for its thumbnail (when applicable)
     * 
     */
    private final Boolean returnResultThumbnailUrls;
    /**
     * Configuration for ranking results.
     * 
     */
    private final ScoringConfigResponse scoringConfig;
    /**
     * Configuration for a sources specified in data_source_restrictions.
     * 
     */
    private final List<SourceConfigResponse> sourceConfig;

    @OutputCustomType.Constructor({"dataSourceRestrictions","defaultFacetOptions","defaultSortOptions","displayName","enableAuditLog","name","operationIds","queryInterpretationConfig","returnResultThumbnailUrls","scoringConfig","sourceConfig"})
    private GetSearchApplicationResult(
        List<DataSourceRestrictionResponse> dataSourceRestrictions,
        List<FacetOptionsResponse> defaultFacetOptions,
        SortOptionsResponse defaultSortOptions,
        String displayName,
        Boolean enableAuditLog,
        String name,
        List<String> operationIds,
        QueryInterpretationConfigResponse queryInterpretationConfig,
        Boolean returnResultThumbnailUrls,
        ScoringConfigResponse scoringConfig,
        List<SourceConfigResponse> sourceConfig) {
        this.dataSourceRestrictions = Objects.requireNonNull(dataSourceRestrictions);
        this.defaultFacetOptions = Objects.requireNonNull(defaultFacetOptions);
        this.defaultSortOptions = Objects.requireNonNull(defaultSortOptions);
        this.displayName = Objects.requireNonNull(displayName);
        this.enableAuditLog = Objects.requireNonNull(enableAuditLog);
        this.name = Objects.requireNonNull(name);
        this.operationIds = Objects.requireNonNull(operationIds);
        this.queryInterpretationConfig = Objects.requireNonNull(queryInterpretationConfig);
        this.returnResultThumbnailUrls = Objects.requireNonNull(returnResultThumbnailUrls);
        this.scoringConfig = Objects.requireNonNull(scoringConfig);
        this.sourceConfig = Objects.requireNonNull(sourceConfig);
    }

    /**
     * Retrictions applied to the configurations. The maximum number of elements is 10.
     * 
     */
    public List<DataSourceRestrictionResponse> getDataSourceRestrictions() {
        return this.dataSourceRestrictions;
    }
    /**
     * The default fields for returning facet results. The sources specified here also have been included in data_source_restrictions above.
     * 
     */
    public List<FacetOptionsResponse> getDefaultFacetOptions() {
        return this.defaultFacetOptions;
    }
    /**
     * The default options for sorting the search results
     * 
     */
    public SortOptionsResponse getDefaultSortOptions() {
        return this.defaultSortOptions;
    }
    /**
     * Display name of the Search Application. The maximum length is 300 characters.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Indicates whether audit logging is on/off for requests made for the search application in query APIs.
     * 
     */
    public Boolean getEnableAuditLog() {
        return this.enableAuditLog;
    }
    /**
     * Name of the Search Application. Format: searchapplications/{application_id}.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * IDs of the Long Running Operations (LROs) currently running for this schema. Output only field.
     * 
     */
    public List<String> getOperationIds() {
        return this.operationIds;
    }
    /**
     * The default options for query interpretation
     * 
     */
    public QueryInterpretationConfigResponse getQueryInterpretationConfig() {
        return this.queryInterpretationConfig;
    }
    /**
     * With each result we should return the URI for its thumbnail (when applicable)
     * 
     */
    public Boolean getReturnResultThumbnailUrls() {
        return this.returnResultThumbnailUrls;
    }
    /**
     * Configuration for ranking results.
     * 
     */
    public ScoringConfigResponse getScoringConfig() {
        return this.scoringConfig;
    }
    /**
     * Configuration for a sources specified in data_source_restrictions.
     * 
     */
    public List<SourceConfigResponse> getSourceConfig() {
        return this.sourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSearchApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DataSourceRestrictionResponse> dataSourceRestrictions;
        private List<FacetOptionsResponse> defaultFacetOptions;
        private SortOptionsResponse defaultSortOptions;
        private String displayName;
        private Boolean enableAuditLog;
        private String name;
        private List<String> operationIds;
        private QueryInterpretationConfigResponse queryInterpretationConfig;
        private Boolean returnResultThumbnailUrls;
        private ScoringConfigResponse scoringConfig;
        private List<SourceConfigResponse> sourceConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSearchApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceRestrictions = defaults.dataSourceRestrictions;
    	      this.defaultFacetOptions = defaults.defaultFacetOptions;
    	      this.defaultSortOptions = defaults.defaultSortOptions;
    	      this.displayName = defaults.displayName;
    	      this.enableAuditLog = defaults.enableAuditLog;
    	      this.name = defaults.name;
    	      this.operationIds = defaults.operationIds;
    	      this.queryInterpretationConfig = defaults.queryInterpretationConfig;
    	      this.returnResultThumbnailUrls = defaults.returnResultThumbnailUrls;
    	      this.scoringConfig = defaults.scoringConfig;
    	      this.sourceConfig = defaults.sourceConfig;
        }

        public Builder setDataSourceRestrictions(List<DataSourceRestrictionResponse> dataSourceRestrictions) {
            this.dataSourceRestrictions = Objects.requireNonNull(dataSourceRestrictions);
            return this;
        }

        public Builder setDefaultFacetOptions(List<FacetOptionsResponse> defaultFacetOptions) {
            this.defaultFacetOptions = Objects.requireNonNull(defaultFacetOptions);
            return this;
        }

        public Builder setDefaultSortOptions(SortOptionsResponse defaultSortOptions) {
            this.defaultSortOptions = Objects.requireNonNull(defaultSortOptions);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEnableAuditLog(Boolean enableAuditLog) {
            this.enableAuditLog = Objects.requireNonNull(enableAuditLog);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperationIds(List<String> operationIds) {
            this.operationIds = Objects.requireNonNull(operationIds);
            return this;
        }

        public Builder setQueryInterpretationConfig(QueryInterpretationConfigResponse queryInterpretationConfig) {
            this.queryInterpretationConfig = Objects.requireNonNull(queryInterpretationConfig);
            return this;
        }

        public Builder setReturnResultThumbnailUrls(Boolean returnResultThumbnailUrls) {
            this.returnResultThumbnailUrls = Objects.requireNonNull(returnResultThumbnailUrls);
            return this;
        }

        public Builder setScoringConfig(ScoringConfigResponse scoringConfig) {
            this.scoringConfig = Objects.requireNonNull(scoringConfig);
            return this;
        }

        public Builder setSourceConfig(List<SourceConfigResponse> sourceConfig) {
            this.sourceConfig = Objects.requireNonNull(sourceConfig);
            return this;
        }

        public GetSearchApplicationResult build() {
            return new GetSearchApplicationResult(dataSourceRestrictions, defaultFacetOptions, defaultSortOptions, displayName, enableAuditLog, name, operationIds, queryInterpretationConfig, returnResultThumbnailUrls, scoringConfig, sourceConfig);
        }
    }
}
