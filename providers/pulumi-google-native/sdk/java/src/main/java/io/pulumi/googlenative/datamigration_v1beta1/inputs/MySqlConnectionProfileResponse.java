// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.SslConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies connection parameters required specifically for MySQL databases.
 * 
 */
public final class MySqlConnectionProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final MySqlConnectionProfileResponse Empty = new MySqlConnectionProfileResponse();

    /**
     * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
     */
    @InputImport(name="cloudSqlId", required=true)
    private final String cloudSqlId;

    public String getCloudSqlId() {
        return this.cloudSqlId;
    }

    /**
     * The IP or hostname of the source MySQL database.
     * 
     */
    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
     */
    @InputImport(name="password", required=true)
    private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * Indicates If this connection profile password is stored.
     * 
     */
    @InputImport(name="passwordSet", required=true)
    private final Boolean passwordSet;

    public Boolean getPasswordSet() {
        return this.passwordSet;
    }

    /**
     * The network port of the source MySQL database.
     * 
     */
    @InputImport(name="port", required=true)
    private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * SSL configuration for the destination to connect to the source database.
     * 
     */
    @InputImport(name="ssl", required=true)
    private final SslConfigResponse ssl;

    public SslConfigResponse getSsl() {
        return this.ssl;
    }

    /**
     * The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
     */
    @InputImport(name="username", required=true)
    private final String username;

    public String getUsername() {
        return this.username;
    }

    public MySqlConnectionProfileResponse(
        String cloudSqlId,
        String host,
        String password,
        Boolean passwordSet,
        Integer port,
        SslConfigResponse ssl,
        String username) {
        this.cloudSqlId = Objects.requireNonNull(cloudSqlId, "expected parameter 'cloudSqlId' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.passwordSet = Objects.requireNonNull(passwordSet, "expected parameter 'passwordSet' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.ssl = Objects.requireNonNull(ssl, "expected parameter 'ssl' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private MySqlConnectionProfileResponse() {
        this.cloudSqlId = null;
        this.host = null;
        this.password = null;
        this.passwordSet = null;
        this.port = null;
        this.ssl = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlConnectionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSqlId;
        private String host;
        private String password;
        private Boolean passwordSet;
        private Integer port;
        private SslConfigResponse ssl;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlConnectionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.passwordSet = defaults.passwordSet;
    	      this.port = defaults.port;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        public Builder setCloudSqlId(String cloudSqlId) {
            this.cloudSqlId = Objects.requireNonNull(cloudSqlId);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPasswordSet(Boolean passwordSet) {
            this.passwordSet = Objects.requireNonNull(passwordSet);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setSsl(SslConfigResponse ssl) {
            this.ssl = Objects.requireNonNull(ssl);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public MySqlConnectionProfileResponse build() {
            return new MySqlConnectionProfileResponse(cloudSqlId, host, password, passwordSet, port, ssl, username);
        }
    }
}
