// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.enums.ConnectionProfileProvider;
import io.pulumi.googlenative.datamigration_v1.enums.ConnectionProfileState;
import io.pulumi.googlenative.datamigration_v1.inputs.CloudSqlConnectionProfileArgs;
import io.pulumi.googlenative.datamigration_v1.inputs.MySqlConnectionProfileArgs;
import io.pulumi.googlenative.datamigration_v1.inputs.PostgreSqlConnectionProfileArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileArgs Empty = new ConnectionProfileArgs();

    /**
     * A CloudSQL database connection profile.
     * 
     */
    @InputImport(name="cloudsql")
    private final @Nullable Input<CloudSqlConnectionProfileArgs> cloudsql;

    public Input<CloudSqlConnectionProfileArgs> getCloudsql() {
        return this.cloudsql == null ? Input.empty() : this.cloudsql;
    }

    @InputImport(name="connectionProfileId", required=true)
    private final Input<String> connectionProfileId;

    public Input<String> getConnectionProfileId() {
        return this.connectionProfileId;
    }

    /**
     * The connection profile display name.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * A MySQL database connection profile.
     * 
     */
    @InputImport(name="mysql")
    private final @Nullable Input<MySqlConnectionProfileArgs> mysql;

    public Input<MySqlConnectionProfileArgs> getMysql() {
        return this.mysql == null ? Input.empty() : this.mysql;
    }

    /**
     * The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A PostgreSQL database connection profile.
     * 
     */
    @InputImport(name="postgresql")
    private final @Nullable Input<PostgreSqlConnectionProfileArgs> postgresql;

    public Input<PostgreSqlConnectionProfileArgs> getPostgresql() {
        return this.postgresql == null ? Input.empty() : this.postgresql;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The database provider.
     * 
     */
    @InputImport(name="provider")
    private final @Nullable Input<ConnectionProfileProvider> provider;

    public Input<ConnectionProfileProvider> getProvider() {
        return this.provider == null ? Input.empty() : this.provider;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The current connection profile state (e.g. DRAFT, READY, or FAILED).
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<ConnectionProfileState> state;

    public Input<ConnectionProfileState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public ConnectionProfileArgs(
        @Nullable Input<CloudSqlConnectionProfileArgs> cloudsql,
        Input<String> connectionProfileId,
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<MySqlConnectionProfileArgs> mysql,
        @Nullable Input<String> name,
        @Nullable Input<PostgreSqlConnectionProfileArgs> postgresql,
        @Nullable Input<String> project,
        @Nullable Input<ConnectionProfileProvider> provider,
        @Nullable Input<String> requestId,
        @Nullable Input<ConnectionProfileState> state) {
        this.cloudsql = cloudsql;
        this.connectionProfileId = Objects.requireNonNull(connectionProfileId, "expected parameter 'connectionProfileId' to be non-null");
        this.displayName = displayName;
        this.labels = labels;
        this.location = location;
        this.mysql = mysql;
        this.name = name;
        this.postgresql = postgresql;
        this.project = project;
        this.provider = provider;
        this.requestId = requestId;
        this.state = state;
    }

    private ConnectionProfileArgs() {
        this.cloudsql = Input.empty();
        this.connectionProfileId = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.mysql = Input.empty();
        this.name = Input.empty();
        this.postgresql = Input.empty();
        this.project = Input.empty();
        this.provider = Input.empty();
        this.requestId = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CloudSqlConnectionProfileArgs> cloudsql;
        private Input<String> connectionProfileId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<MySqlConnectionProfileArgs> mysql;
        private @Nullable Input<String> name;
        private @Nullable Input<PostgreSqlConnectionProfileArgs> postgresql;
        private @Nullable Input<String> project;
        private @Nullable Input<ConnectionProfileProvider> provider;
        private @Nullable Input<String> requestId;
        private @Nullable Input<ConnectionProfileState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudsql = defaults.cloudsql;
    	      this.connectionProfileId = defaults.connectionProfileId;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.mysql = defaults.mysql;
    	      this.name = defaults.name;
    	      this.postgresql = defaults.postgresql;
    	      this.project = defaults.project;
    	      this.provider = defaults.provider;
    	      this.requestId = defaults.requestId;
    	      this.state = defaults.state;
        }

        public Builder setCloudsql(@Nullable Input<CloudSqlConnectionProfileArgs> cloudsql) {
            this.cloudsql = cloudsql;
            return this;
        }

        public Builder setCloudsql(@Nullable CloudSqlConnectionProfileArgs cloudsql) {
            this.cloudsql = Input.ofNullable(cloudsql);
            return this;
        }

        public Builder setConnectionProfileId(Input<String> connectionProfileId) {
            this.connectionProfileId = Objects.requireNonNull(connectionProfileId);
            return this;
        }

        public Builder setConnectionProfileId(String connectionProfileId) {
            this.connectionProfileId = Input.of(Objects.requireNonNull(connectionProfileId));
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMysql(@Nullable Input<MySqlConnectionProfileArgs> mysql) {
            this.mysql = mysql;
            return this;
        }

        public Builder setMysql(@Nullable MySqlConnectionProfileArgs mysql) {
            this.mysql = Input.ofNullable(mysql);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPostgresql(@Nullable Input<PostgreSqlConnectionProfileArgs> postgresql) {
            this.postgresql = postgresql;
            return this;
        }

        public Builder setPostgresql(@Nullable PostgreSqlConnectionProfileArgs postgresql) {
            this.postgresql = Input.ofNullable(postgresql);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProvider(@Nullable Input<ConnectionProfileProvider> provider) {
            this.provider = provider;
            return this;
        }

        public Builder setProvider(@Nullable ConnectionProfileProvider provider) {
            this.provider = Input.ofNullable(provider);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setState(@Nullable Input<ConnectionProfileState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable ConnectionProfileState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public ConnectionProfileArgs build() {
            return new ConnectionProfileArgs(cloudsql, connectionProfileId, displayName, labels, location, mysql, name, postgresql, project, provider, requestId, state);
        }
    }
}
