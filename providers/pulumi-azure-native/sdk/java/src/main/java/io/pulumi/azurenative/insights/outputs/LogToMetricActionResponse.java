// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.CriteriaResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LogToMetricActionResponse {
    /**
     * Criteria of Metric
     * 
     */
    private final List<CriteriaResponse> criteria;
    /**
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is 'Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.LogToMetricAction'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor
    private LogToMetricActionResponse(
        @OutputCustomType.Parameter("criteria") List<CriteriaResponse> criteria,
        @OutputCustomType.Parameter("odataType") String odataType) {
        this.criteria = criteria;
        this.odataType = odataType;
    }

    /**
     * Criteria of Metric
     * 
    */
    public List<CriteriaResponse> getCriteria() {
        return this.criteria;
    }
    /**
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is 'Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.LogToMetricAction'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogToMetricActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CriteriaResponse> criteria;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(LogToMetricActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.odataType = defaults.odataType;
        }

        public Builder setCriteria(List<CriteriaResponse> criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public LogToMetricActionResponse build() {
            return new LogToMetricActionResponse(criteria, odataType);
        }
    }
}
