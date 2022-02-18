// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL database.
 * 
 */
public final class MysqlDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlDatabaseArgs Empty = new MysqlDatabaseArgs();

    /**
     * Database name.
     * 
     */
    @InputImport(name="databaseName")
    private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * Tables in the database.
     * 
     */
    @InputImport(name="mysqlTables")
    private final @Nullable Input<List<MysqlTableArgs>> mysqlTables;

    public Input<List<MysqlTableArgs>> getMysqlTables() {
        return this.mysqlTables == null ? Input.empty() : this.mysqlTables;
    }

    public MysqlDatabaseArgs(
        @Nullable Input<String> databaseName,
        @Nullable Input<List<MysqlTableArgs>> mysqlTables) {
        this.databaseName = databaseName;
        this.mysqlTables = mysqlTables;
    }

    private MysqlDatabaseArgs() {
        this.databaseName = Input.empty();
        this.mysqlTables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> databaseName;
        private @Nullable Input<List<MysqlTableArgs>> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder setDatabaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder setMysqlTables(@Nullable Input<List<MysqlTableArgs>> mysqlTables) {
            this.mysqlTables = mysqlTables;
            return this;
        }

        public Builder setMysqlTables(@Nullable List<MysqlTableArgs> mysqlTables) {
            this.mysqlTables = Input.ofNullable(mysqlTables);
            return this;
        }

        public MysqlDatabaseArgs build() {
            return new MysqlDatabaseArgs(databaseName, mysqlTables);
        }
    }
}
