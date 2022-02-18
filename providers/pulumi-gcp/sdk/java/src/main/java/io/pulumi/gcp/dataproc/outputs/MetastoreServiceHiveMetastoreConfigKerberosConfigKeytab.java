// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MetastoreServiceHiveMetastoreConfigKerberosConfigKeytab {
    /**
     * The relative resource name of a Secret Manager secret version, in the following form:
     * "projects/{projectNumber}/secrets/{secret_id}/versions/{version_id}".
     * 
     */
    private final String cloudSecret;

    @OutputCustomType.Constructor({"cloudSecret"})
    private MetastoreServiceHiveMetastoreConfigKerberosConfigKeytab(String cloudSecret) {
        this.cloudSecret = Objects.requireNonNull(cloudSecret);
    }

    /**
     * The relative resource name of a Secret Manager secret version, in the following form:
     * "projects/{projectNumber}/secrets/{secret_id}/versions/{version_id}".
     * 
     */
    public String getCloudSecret() {
        return this.cloudSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytab defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytab defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSecret = defaults.cloudSecret;
        }

        public Builder setCloudSecret(String cloudSecret) {
            this.cloudSecret = Objects.requireNonNull(cloudSecret);
            return this;
        }

        public MetastoreServiceHiveMetastoreConfigKerberosConfigKeytab build() {
            return new MetastoreServiceHiveMetastoreConfigKerberosConfigKeytab(cloudSecret);
        }
    }
}
