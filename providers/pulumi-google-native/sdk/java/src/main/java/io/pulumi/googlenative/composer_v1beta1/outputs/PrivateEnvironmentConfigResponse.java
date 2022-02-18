// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.composer_v1beta1.outputs.PrivateClusterConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateEnvironmentConfigResponse {
    /**
     * Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
     * 
     */
    private final String cloudComposerConnectionSubnetwork;
    /**
     * Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    private final String cloudComposerNetworkIpv4CidrBlock;
    /**
     * The IP range reserved for the tenant project's Cloud Composer network. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    private final String cloudComposerNetworkIpv4ReservedRange;
    /**
     * Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from web_server_ipv4_cidr_block
     * 
     */
    private final String cloudSqlIpv4CidrBlock;
    /**
     * Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final Boolean enablePrivateEnvironment;
    /**
     * Optional. When enabled, IPs from public (non-RFC1918) ranges can be used for `IPAllocationPolicy.cluster_ipv4_cidr_block` and `IPAllocationPolicy.service_ipv4_cidr_block`.
     * 
     */
    private final Boolean enablePrivatelyUsedPublicIps;
    /**
     * Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    private final PrivateClusterConfigResponse privateClusterConfig;
    /**
     * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final String webServerIpv4CidrBlock;
    /**
     * The IP range reserved for the tenant project's App Engine VMs. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final String webServerIpv4ReservedRange;

    @OutputCustomType.Constructor({"cloudComposerConnectionSubnetwork","cloudComposerNetworkIpv4CidrBlock","cloudComposerNetworkIpv4ReservedRange","cloudSqlIpv4CidrBlock","enablePrivateEnvironment","enablePrivatelyUsedPublicIps","privateClusterConfig","webServerIpv4CidrBlock","webServerIpv4ReservedRange"})
    private PrivateEnvironmentConfigResponse(
        String cloudComposerConnectionSubnetwork,
        String cloudComposerNetworkIpv4CidrBlock,
        String cloudComposerNetworkIpv4ReservedRange,
        String cloudSqlIpv4CidrBlock,
        Boolean enablePrivateEnvironment,
        Boolean enablePrivatelyUsedPublicIps,
        PrivateClusterConfigResponse privateClusterConfig,
        String webServerIpv4CidrBlock,
        String webServerIpv4ReservedRange) {
        this.cloudComposerConnectionSubnetwork = Objects.requireNonNull(cloudComposerConnectionSubnetwork);
        this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
        this.cloudComposerNetworkIpv4ReservedRange = Objects.requireNonNull(cloudComposerNetworkIpv4ReservedRange);
        this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
        this.enablePrivateEnvironment = Objects.requireNonNull(enablePrivateEnvironment);
        this.enablePrivatelyUsedPublicIps = Objects.requireNonNull(enablePrivatelyUsedPublicIps);
        this.privateClusterConfig = Objects.requireNonNull(privateClusterConfig);
        this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
        this.webServerIpv4ReservedRange = Objects.requireNonNull(webServerIpv4ReservedRange);
    }

    /**
     * Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
     * 
     */
    public String getCloudComposerConnectionSubnetwork() {
        return this.cloudComposerConnectionSubnetwork;
    }
    /**
     * Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    public String getCloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock;
    }
    /**
     * The IP range reserved for the tenant project's Cloud Composer network. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    public String getCloudComposerNetworkIpv4ReservedRange() {
        return this.cloudComposerNetworkIpv4ReservedRange;
    }
    /**
     * Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from web_server_ipv4_cidr_block
     * 
     */
    public String getCloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock;
    }
    /**
     * Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Boolean getEnablePrivateEnvironment() {
        return this.enablePrivateEnvironment;
    }
    /**
     * Optional. When enabled, IPs from public (non-RFC1918) ranges can be used for `IPAllocationPolicy.cluster_ipv4_cidr_block` and `IPAllocationPolicy.service_ipv4_cidr_block`.
     * 
     */
    public Boolean getEnablePrivatelyUsedPublicIps() {
        return this.enablePrivatelyUsedPublicIps;
    }
    /**
     * Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    public PrivateClusterConfigResponse getPrivateClusterConfig() {
        return this.privateClusterConfig;
    }
    /**
     * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public String getWebServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock;
    }
    /**
     * The IP range reserved for the tenant project's App Engine VMs. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public String getWebServerIpv4ReservedRange() {
        return this.webServerIpv4ReservedRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudComposerConnectionSubnetwork;
        private String cloudComposerNetworkIpv4CidrBlock;
        private String cloudComposerNetworkIpv4ReservedRange;
        private String cloudSqlIpv4CidrBlock;
        private Boolean enablePrivateEnvironment;
        private Boolean enablePrivatelyUsedPublicIps;
        private PrivateClusterConfigResponse privateClusterConfig;
        private String webServerIpv4CidrBlock;
        private String webServerIpv4ReservedRange;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEnvironmentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerConnectionSubnetwork = defaults.cloudComposerConnectionSubnetwork;
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudComposerNetworkIpv4ReservedRange = defaults.cloudComposerNetworkIpv4ReservedRange;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.enablePrivateEnvironment = defaults.enablePrivateEnvironment;
    	      this.enablePrivatelyUsedPublicIps = defaults.enablePrivatelyUsedPublicIps;
    	      this.privateClusterConfig = defaults.privateClusterConfig;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
    	      this.webServerIpv4ReservedRange = defaults.webServerIpv4ReservedRange;
        }

        public Builder setCloudComposerConnectionSubnetwork(String cloudComposerConnectionSubnetwork) {
            this.cloudComposerConnectionSubnetwork = Objects.requireNonNull(cloudComposerConnectionSubnetwork);
            return this;
        }

        public Builder setCloudComposerNetworkIpv4CidrBlock(String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
            return this;
        }

        public Builder setCloudComposerNetworkIpv4ReservedRange(String cloudComposerNetworkIpv4ReservedRange) {
            this.cloudComposerNetworkIpv4ReservedRange = Objects.requireNonNull(cloudComposerNetworkIpv4ReservedRange);
            return this;
        }

        public Builder setCloudSqlIpv4CidrBlock(String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
            return this;
        }

        public Builder setEnablePrivateEnvironment(Boolean enablePrivateEnvironment) {
            this.enablePrivateEnvironment = Objects.requireNonNull(enablePrivateEnvironment);
            return this;
        }

        public Builder setEnablePrivatelyUsedPublicIps(Boolean enablePrivatelyUsedPublicIps) {
            this.enablePrivatelyUsedPublicIps = Objects.requireNonNull(enablePrivatelyUsedPublicIps);
            return this;
        }

        public Builder setPrivateClusterConfig(PrivateClusterConfigResponse privateClusterConfig) {
            this.privateClusterConfig = Objects.requireNonNull(privateClusterConfig);
            return this;
        }

        public Builder setWebServerIpv4CidrBlock(String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
            return this;
        }

        public Builder setWebServerIpv4ReservedRange(String webServerIpv4ReservedRange) {
            this.webServerIpv4ReservedRange = Objects.requireNonNull(webServerIpv4ReservedRange);
            return this;
        }

        public PrivateEnvironmentConfigResponse build() {
            return new PrivateEnvironmentConfigResponse(cloudComposerConnectionSubnetwork, cloudComposerNetworkIpv4CidrBlock, cloudComposerNetworkIpv4ReservedRange, cloudSqlIpv4CidrBlock, enablePrivateEnvironment, enablePrivatelyUsedPublicIps, privateClusterConfig, webServerIpv4CidrBlock, webServerIpv4ReservedRange);
        }
    }
}
