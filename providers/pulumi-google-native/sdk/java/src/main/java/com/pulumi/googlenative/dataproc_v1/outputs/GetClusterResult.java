// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc_v1.outputs.ClusterConfigResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.ClusterMetricsResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.ClusterStatusResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.VirtualClusterConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    /**
     * @return The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    private final String clusterName;
    /**
     * @return A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster.
     * 
     */
    private final String clusterUuid;
    /**
     * @return Optional. The cluster config for a cluster of Compute Engine Instances. Note that Dataproc may set default values, and values may change when clusters are updated.Exactly one of ClusterConfig or VirtualClusterConfig must be specified.
     * 
     */
    private final ClusterConfigResponse config;
    /**
     * @return Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    private final ClusterMetricsResponse metrics;
    /**
     * @return The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    private final String project;
    /**
     * @return Cluster status.
     * 
     */
    private final ClusterStatusResponse status;
    /**
     * @return The previous cluster status.
     * 
     */
    private final List<ClusterStatusResponse> statusHistory;
    /**
     * @return Optional. The virtual cluster config, used when creating a Dataproc cluster that does not directly control the underlying compute resources, for example, when creating a Dataproc-on-GKE cluster (https://cloud.google.com/dataproc/docs/concepts/jobs/dataproc-gke#create-a-dataproc-on-gke-cluster). Note that Dataproc may set default values, and values may change when clusters are updated. Exactly one of config or virtualClusterConfig must be specified.
     * 
     */
    private final VirtualClusterConfigResponse virtualClusterConfig;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("clusterUuid") String clusterUuid,
        @CustomType.Parameter("config") ClusterConfigResponse config,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("metrics") ClusterMetricsResponse metrics,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("status") ClusterStatusResponse status,
        @CustomType.Parameter("statusHistory") List<ClusterStatusResponse> statusHistory,
        @CustomType.Parameter("virtualClusterConfig") VirtualClusterConfigResponse virtualClusterConfig) {
        this.clusterName = clusterName;
        this.clusterUuid = clusterUuid;
        this.config = config;
        this.labels = labels;
        this.metrics = metrics;
        this.project = project;
        this.status = status;
        this.statusHistory = statusHistory;
        this.virtualClusterConfig = virtualClusterConfig;
    }

    /**
     * @return The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster.
     * 
     */
    public String clusterUuid() {
        return this.clusterUuid;
    }
    /**
     * @return Optional. The cluster config for a cluster of Compute Engine Instances. Note that Dataproc may set default values, and values may change when clusters are updated.Exactly one of ClusterConfig or VirtualClusterConfig must be specified.
     * 
     */
    public ClusterConfigResponse config() {
        return this.config;
    }
    /**
     * @return Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    public ClusterMetricsResponse metrics() {
        return this.metrics;
    }
    /**
     * @return The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Cluster status.
     * 
     */
    public ClusterStatusResponse status() {
        return this.status;
    }
    /**
     * @return The previous cluster status.
     * 
     */
    public List<ClusterStatusResponse> statusHistory() {
        return this.statusHistory;
    }
    /**
     * @return Optional. The virtual cluster config, used when creating a Dataproc cluster that does not directly control the underlying compute resources, for example, when creating a Dataproc-on-GKE cluster (https://cloud.google.com/dataproc/docs/concepts/jobs/dataproc-gke#create-a-dataproc-on-gke-cluster). Note that Dataproc may set default values, and values may change when clusters are updated. Exactly one of config or virtualClusterConfig must be specified.
     * 
     */
    public VirtualClusterConfigResponse virtualClusterConfig() {
        return this.virtualClusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String clusterUuid;
        private ClusterConfigResponse config;
        private Map<String,String> labels;
        private ClusterMetricsResponse metrics;
        private String project;
        private ClusterStatusResponse status;
        private List<ClusterStatusResponse> statusHistory;
        private VirtualClusterConfigResponse virtualClusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterUuid = defaults.clusterUuid;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
    	      this.metrics = defaults.metrics;
    	      this.project = defaults.project;
    	      this.status = defaults.status;
    	      this.statusHistory = defaults.statusHistory;
    	      this.virtualClusterConfig = defaults.virtualClusterConfig;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterUuid(String clusterUuid) {
            this.clusterUuid = Objects.requireNonNull(clusterUuid);
            return this;
        }
        public Builder config(ClusterConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder metrics(ClusterMetricsResponse metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder status(ClusterStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusHistory(List<ClusterStatusResponse> statusHistory) {
            this.statusHistory = Objects.requireNonNull(statusHistory);
            return this;
        }
        public Builder statusHistory(ClusterStatusResponse... statusHistory) {
            return statusHistory(List.of(statusHistory));
        }
        public Builder virtualClusterConfig(VirtualClusterConfigResponse virtualClusterConfig) {
            this.virtualClusterConfig = Objects.requireNonNull(virtualClusterConfig);
            return this;
        }        public GetClusterResult build() {
            return new GetClusterResult(clusterName, clusterUuid, config, labels, metrics, project, status, statusHistory, virtualClusterConfig);
        }
    }
}
