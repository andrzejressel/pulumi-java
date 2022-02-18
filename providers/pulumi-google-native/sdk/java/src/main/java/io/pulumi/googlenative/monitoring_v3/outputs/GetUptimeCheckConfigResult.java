// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.ContentMatcherResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.HttpCheckResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.InternalCheckerResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.MonitoredResourceResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.ResourceGroupResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.TcpCheckResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetUptimeCheckConfigResult {
    /**
     * The type of checkers to use to execute the Uptime check.
     * 
     */
    private final String checkerType;
    /**
     * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    private final List<ContentMatcherResponse> contentMatchers;
    /**
     * A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    private final String displayName;
    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    private final HttpCheckResponse httpCheck;
    /**
     * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    private final List<InternalCheckerResponse> internalCheckers;
    /**
     * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
     * 
     */
    private final Boolean isInternal;
    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service
     * 
     */
    private final MonitoredResourceResponse monitoredResource;
    /**
     * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    private final String name;
    /**
     * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    private final String period;
    /**
     * The group resource associated with the configuration.
     * 
     */
    private final ResourceGroupResponse resourceGroup;
    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    private final List<String> selectedRegions;
    /**
     * Contains information needed to make a TCP check.
     * 
     */
    private final TcpCheckResponse tcpCheck;
    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    private final String timeout;

    @OutputCustomType.Constructor({"checkerType","contentMatchers","displayName","httpCheck","internalCheckers","isInternal","monitoredResource","name","period","resourceGroup","selectedRegions","tcpCheck","timeout"})
    private GetUptimeCheckConfigResult(
        String checkerType,
        List<ContentMatcherResponse> contentMatchers,
        String displayName,
        HttpCheckResponse httpCheck,
        List<InternalCheckerResponse> internalCheckers,
        Boolean isInternal,
        MonitoredResourceResponse monitoredResource,
        String name,
        String period,
        ResourceGroupResponse resourceGroup,
        List<String> selectedRegions,
        TcpCheckResponse tcpCheck,
        String timeout) {
        this.checkerType = Objects.requireNonNull(checkerType);
        this.contentMatchers = Objects.requireNonNull(contentMatchers);
        this.displayName = Objects.requireNonNull(displayName);
        this.httpCheck = Objects.requireNonNull(httpCheck);
        this.internalCheckers = Objects.requireNonNull(internalCheckers);
        this.isInternal = Objects.requireNonNull(isInternal);
        this.monitoredResource = Objects.requireNonNull(monitoredResource);
        this.name = Objects.requireNonNull(name);
        this.period = Objects.requireNonNull(period);
        this.resourceGroup = Objects.requireNonNull(resourceGroup);
        this.selectedRegions = Objects.requireNonNull(selectedRegions);
        this.tcpCheck = Objects.requireNonNull(tcpCheck);
        this.timeout = Objects.requireNonNull(timeout);
    }

    /**
     * The type of checkers to use to execute the Uptime check.
     * 
     */
    public String getCheckerType() {
        return this.checkerType;
    }
    /**
     * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    public List<ContentMatcherResponse> getContentMatchers() {
        return this.contentMatchers;
    }
    /**
     * A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    public HttpCheckResponse getHttpCheck() {
        return this.httpCheck;
    }
    /**
     * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    public List<InternalCheckerResponse> getInternalCheckers() {
        return this.internalCheckers;
    }
    /**
     * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
     * 
     */
    public Boolean getIsInternal() {
        return this.isInternal;
    }
    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service
     * 
     */
    public MonitoredResourceResponse getMonitoredResource() {
        return this.monitoredResource;
    }
    /**
     * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    public String getPeriod() {
        return this.period;
    }
    /**
     * The group resource associated with the configuration.
     * 
     */
    public ResourceGroupResponse getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    public List<String> getSelectedRegions() {
        return this.selectedRegions;
    }
    /**
     * Contains information needed to make a TCP check.
     * 
     */
    public TcpCheckResponse getTcpCheck() {
        return this.tcpCheck;
    }
    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    public String getTimeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUptimeCheckConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkerType;
        private List<ContentMatcherResponse> contentMatchers;
        private String displayName;
        private HttpCheckResponse httpCheck;
        private List<InternalCheckerResponse> internalCheckers;
        private Boolean isInternal;
        private MonitoredResourceResponse monitoredResource;
        private String name;
        private String period;
        private ResourceGroupResponse resourceGroup;
        private List<String> selectedRegions;
        private TcpCheckResponse tcpCheck;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUptimeCheckConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkerType = defaults.checkerType;
    	      this.contentMatchers = defaults.contentMatchers;
    	      this.displayName = defaults.displayName;
    	      this.httpCheck = defaults.httpCheck;
    	      this.internalCheckers = defaults.internalCheckers;
    	      this.isInternal = defaults.isInternal;
    	      this.monitoredResource = defaults.monitoredResource;
    	      this.name = defaults.name;
    	      this.period = defaults.period;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.selectedRegions = defaults.selectedRegions;
    	      this.tcpCheck = defaults.tcpCheck;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCheckerType(String checkerType) {
            this.checkerType = Objects.requireNonNull(checkerType);
            return this;
        }

        public Builder setContentMatchers(List<ContentMatcherResponse> contentMatchers) {
            this.contentMatchers = Objects.requireNonNull(contentMatchers);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setHttpCheck(HttpCheckResponse httpCheck) {
            this.httpCheck = Objects.requireNonNull(httpCheck);
            return this;
        }

        public Builder setInternalCheckers(List<InternalCheckerResponse> internalCheckers) {
            this.internalCheckers = Objects.requireNonNull(internalCheckers);
            return this;
        }

        public Builder setIsInternal(Boolean isInternal) {
            this.isInternal = Objects.requireNonNull(isInternal);
            return this;
        }

        public Builder setMonitoredResource(MonitoredResourceResponse monitoredResource) {
            this.monitoredResource = Objects.requireNonNull(monitoredResource);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeriod(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }

        public Builder setResourceGroup(ResourceGroupResponse resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setSelectedRegions(List<String> selectedRegions) {
            this.selectedRegions = Objects.requireNonNull(selectedRegions);
            return this;
        }

        public Builder setTcpCheck(TcpCheckResponse tcpCheck) {
            this.tcpCheck = Objects.requireNonNull(tcpCheck);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public GetUptimeCheckConfigResult build() {
            return new GetUptimeCheckConfigResult(checkerType, contentMatchers, displayName, httpCheck, internalCheckers, isInternal, monitoredResource, name, period, resourceGroup, selectedRegions, tcpCheck, timeout);
        }
    }
}
