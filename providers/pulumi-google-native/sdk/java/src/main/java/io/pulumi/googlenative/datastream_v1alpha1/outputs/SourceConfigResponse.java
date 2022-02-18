// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.MysqlSourceConfigResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.OracleSourceConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SourceConfigResponse {
    /**
     * MySQL data source configuration
     * 
     */
    private final MysqlSourceConfigResponse mysqlSourceConfig;
    /**
     * Oracle data source configuration
     * 
     */
    private final OracleSourceConfigResponse oracleSourceConfig;
    /**
     * Source connection profile identifier.
     * 
     */
    private final String sourceConnectionProfileName;

    @OutputCustomType.Constructor({"mysqlSourceConfig","oracleSourceConfig","sourceConnectionProfileName"})
    private SourceConfigResponse(
        MysqlSourceConfigResponse mysqlSourceConfig,
        OracleSourceConfigResponse oracleSourceConfig,
        String sourceConnectionProfileName) {
        this.mysqlSourceConfig = Objects.requireNonNull(mysqlSourceConfig);
        this.oracleSourceConfig = Objects.requireNonNull(oracleSourceConfig);
        this.sourceConnectionProfileName = Objects.requireNonNull(sourceConnectionProfileName);
    }

    /**
     * MySQL data source configuration
     * 
     */
    public MysqlSourceConfigResponse getMysqlSourceConfig() {
        return this.mysqlSourceConfig;
    }
    /**
     * Oracle data source configuration
     * 
     */
    public OracleSourceConfigResponse getOracleSourceConfig() {
        return this.oracleSourceConfig;
    }
    /**
     * Source connection profile identifier.
     * 
     */
    public String getSourceConnectionProfileName() {
        return this.sourceConnectionProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlSourceConfigResponse mysqlSourceConfig;
        private OracleSourceConfigResponse oracleSourceConfig;
        private String sourceConnectionProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlSourceConfig = defaults.mysqlSourceConfig;
    	      this.oracleSourceConfig = defaults.oracleSourceConfig;
    	      this.sourceConnectionProfileName = defaults.sourceConnectionProfileName;
        }

        public Builder setMysqlSourceConfig(MysqlSourceConfigResponse mysqlSourceConfig) {
            this.mysqlSourceConfig = Objects.requireNonNull(mysqlSourceConfig);
            return this;
        }

        public Builder setOracleSourceConfig(OracleSourceConfigResponse oracleSourceConfig) {
            this.oracleSourceConfig = Objects.requireNonNull(oracleSourceConfig);
            return this;
        }

        public Builder setSourceConnectionProfileName(String sourceConnectionProfileName) {
            this.sourceConnectionProfileName = Objects.requireNonNull(sourceConnectionProfileName);
            return this;
        }

        public SourceConfigResponse build() {
            return new SourceConfigResponse(mysqlSourceConfig, oracleSourceConfig, sourceConnectionProfileName);
        }
    }
}
