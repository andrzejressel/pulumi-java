// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSyncMemberResult {
    /**
     * Database name of the member database in the sync member.
     * 
     */
    private final @Nullable String databaseName;
    /**
     * Database type of the sync member.
     * 
     */
    private final @Nullable String databaseType;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Private endpoint name of the sync member if use private link connection is enabled, for sync members in Azure.
     * 
     */
    private final String privateEndpointName;
    /**
     * Server name of the member database in the sync member
     * 
     */
    private final @Nullable String serverName;
    /**
     * SQL Server database id of the sync member.
     * 
     */
    private final @Nullable String sqlServerDatabaseId;
    /**
     * ARM resource id of the sync agent in the sync member.
     * 
     */
    private final @Nullable String syncAgentId;
    /**
     * Sync direction of the sync member.
     * 
     */
    private final @Nullable String syncDirection;
    /**
     * ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    private final @Nullable String syncMemberAzureDatabaseResourceId;
    /**
     * Sync state of the sync member.
     * 
     */
    private final String syncState;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Whether to use private link connection.
     * 
     */
    private final @Nullable Boolean usePrivateLinkConnection;
    /**
     * User name of the member database in the sync member.
     * 
     */
    private final @Nullable String userName;

    @OutputCustomType.Constructor
    private GetSyncMemberResult(
        @OutputCustomType.Parameter("databaseName") @Nullable String databaseName,
        @OutputCustomType.Parameter("databaseType") @Nullable String databaseType,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateEndpointName") String privateEndpointName,
        @OutputCustomType.Parameter("serverName") @Nullable String serverName,
        @OutputCustomType.Parameter("sqlServerDatabaseId") @Nullable String sqlServerDatabaseId,
        @OutputCustomType.Parameter("syncAgentId") @Nullable String syncAgentId,
        @OutputCustomType.Parameter("syncDirection") @Nullable String syncDirection,
        @OutputCustomType.Parameter("syncMemberAzureDatabaseResourceId") @Nullable String syncMemberAzureDatabaseResourceId,
        @OutputCustomType.Parameter("syncState") String syncState,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("usePrivateLinkConnection") @Nullable Boolean usePrivateLinkConnection,
        @OutputCustomType.Parameter("userName") @Nullable String userName) {
        this.databaseName = databaseName;
        this.databaseType = databaseType;
        this.id = id;
        this.name = name;
        this.privateEndpointName = privateEndpointName;
        this.serverName = serverName;
        this.sqlServerDatabaseId = sqlServerDatabaseId;
        this.syncAgentId = syncAgentId;
        this.syncDirection = syncDirection;
        this.syncMemberAzureDatabaseResourceId = syncMemberAzureDatabaseResourceId;
        this.syncState = syncState;
        this.type = type;
        this.usePrivateLinkConnection = usePrivateLinkConnection;
        this.userName = userName;
    }

    /**
     * Database name of the member database in the sync member.
     * 
    */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * Database type of the sync member.
     * 
    */
    public Optional<String> getDatabaseType() {
        return Optional.ofNullable(this.databaseType);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Private endpoint name of the sync member if use private link connection is enabled, for sync members in Azure.
     * 
    */
    public String getPrivateEndpointName() {
        return this.privateEndpointName;
    }
    /**
     * Server name of the member database in the sync member
     * 
    */
    public Optional<String> getServerName() {
        return Optional.ofNullable(this.serverName);
    }
    /**
     * SQL Server database id of the sync member.
     * 
    */
    public Optional<String> getSqlServerDatabaseId() {
        return Optional.ofNullable(this.sqlServerDatabaseId);
    }
    /**
     * ARM resource id of the sync agent in the sync member.
     * 
    */
    public Optional<String> getSyncAgentId() {
        return Optional.ofNullable(this.syncAgentId);
    }
    /**
     * Sync direction of the sync member.
     * 
    */
    public Optional<String> getSyncDirection() {
        return Optional.ofNullable(this.syncDirection);
    }
    /**
     * ARM resource id of the sync member logical database, for sync members in Azure.
     * 
    */
    public Optional<String> getSyncMemberAzureDatabaseResourceId() {
        return Optional.ofNullable(this.syncMemberAzureDatabaseResourceId);
    }
    /**
     * Sync state of the sync member.
     * 
    */
    public String getSyncState() {
        return this.syncState;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Whether to use private link connection.
     * 
    */
    public Optional<Boolean> getUsePrivateLinkConnection() {
        return Optional.ofNullable(this.usePrivateLinkConnection);
    }
    /**
     * User name of the member database in the sync member.
     * 
    */
    public Optional<String> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncMemberResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String databaseType;
        private String id;
        private String name;
        private String privateEndpointName;
        private @Nullable String serverName;
        private @Nullable String sqlServerDatabaseId;
        private @Nullable String syncAgentId;
        private @Nullable String syncDirection;
        private @Nullable String syncMemberAzureDatabaseResourceId;
        private String syncState;
        private String type;
        private @Nullable Boolean usePrivateLinkConnection;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSyncMemberResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.databaseType = defaults.databaseType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.serverName = defaults.serverName;
    	      this.sqlServerDatabaseId = defaults.sqlServerDatabaseId;
    	      this.syncAgentId = defaults.syncAgentId;
    	      this.syncDirection = defaults.syncDirection;
    	      this.syncMemberAzureDatabaseResourceId = defaults.syncMemberAzureDatabaseResourceId;
    	      this.syncState = defaults.syncState;
    	      this.type = defaults.type;
    	      this.usePrivateLinkConnection = defaults.usePrivateLinkConnection;
    	      this.userName = defaults.userName;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseType(@Nullable String databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointName(String privateEndpointName) {
            this.privateEndpointName = Objects.requireNonNull(privateEndpointName);
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder setSqlServerDatabaseId(@Nullable String sqlServerDatabaseId) {
            this.sqlServerDatabaseId = sqlServerDatabaseId;
            return this;
        }

        public Builder setSyncAgentId(@Nullable String syncAgentId) {
            this.syncAgentId = syncAgentId;
            return this;
        }

        public Builder setSyncDirection(@Nullable String syncDirection) {
            this.syncDirection = syncDirection;
            return this;
        }

        public Builder setSyncMemberAzureDatabaseResourceId(@Nullable String syncMemberAzureDatabaseResourceId) {
            this.syncMemberAzureDatabaseResourceId = syncMemberAzureDatabaseResourceId;
            return this;
        }

        public Builder setSyncState(String syncState) {
            this.syncState = Objects.requireNonNull(syncState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsePrivateLinkConnection(@Nullable Boolean usePrivateLinkConnection) {
            this.usePrivateLinkConnection = usePrivateLinkConnection;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public GetSyncMemberResult build() {
            return new GetSyncMemberResult(databaseName, databaseType, id, name, privateEndpointName, serverName, sqlServerDatabaseId, syncAgentId, syncDirection, syncMemberAzureDatabaseResourceId, syncState, type, usePrivateLinkConnection, userName);
        }
    }
}
