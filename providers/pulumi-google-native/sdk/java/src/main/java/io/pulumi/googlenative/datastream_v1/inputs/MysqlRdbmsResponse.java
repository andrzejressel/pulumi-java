// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlDatabaseResponse;
import java.util.List;
import java.util.Objects;


/**
 * MySQL database structure
 * 
 */
public final class MysqlRdbmsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlRdbmsResponse Empty = new MysqlRdbmsResponse();

    /**
     * Mysql databases on the server
     * 
     */
    @InputImport(name="mysqlDatabases", required=true)
    private final List<MysqlDatabaseResponse> mysqlDatabases;

    public List<MysqlDatabaseResponse> getMysqlDatabases() {
        return this.mysqlDatabases;
    }

    public MysqlRdbmsResponse(List<MysqlDatabaseResponse> mysqlDatabases) {
        this.mysqlDatabases = Objects.requireNonNull(mysqlDatabases, "expected parameter 'mysqlDatabases' to be non-null");
    }

    private MysqlRdbmsResponse() {
        this.mysqlDatabases = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlRdbmsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MysqlDatabaseResponse> mysqlDatabases;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlRdbmsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlDatabases = defaults.mysqlDatabases;
        }

        public Builder setMysqlDatabases(List<MysqlDatabaseResponse> mysqlDatabases) {
            this.mysqlDatabases = Objects.requireNonNull(mysqlDatabases);
            return this;
        }

        public MysqlRdbmsResponse build() {
            return new MysqlRdbmsResponse(mysqlDatabases);
        }
    }
}
