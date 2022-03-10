// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabasePrincipalResponse {
    /**
     * Application id - relevant only for application principal type.
     * 
     */
    private final @Nullable String appId;
    /**
     * Database principal email if exists.
     * 
     */
    private final @Nullable String email;
    /**
     * Database principal fully qualified name.
     * 
     */
    private final @Nullable String fqn;
    /**
     * Database principal name.
     * 
     */
    private final String name;
    /**
     * Database principal role.
     * 
     */
    private final String role;
    /**
     * The tenant name of the principal
     * 
     */
    private final String tenantName;
    /**
     * Database principal type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private DatabasePrincipalResponse(
        @OutputCustomType.Parameter("appId") @Nullable String appId,
        @OutputCustomType.Parameter("email") @Nullable String email,
        @OutputCustomType.Parameter("fqn") @Nullable String fqn,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("role") String role,
        @OutputCustomType.Parameter("tenantName") String tenantName,
        @OutputCustomType.Parameter("type") String type) {
        this.appId = appId;
        this.email = email;
        this.fqn = fqn;
        this.name = name;
        this.role = role;
        this.tenantName = tenantName;
        this.type = type;
    }

    /**
     * Application id - relevant only for application principal type.
     * 
    */
    public Optional<String> getAppId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * Database principal email if exists.
     * 
    */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * Database principal fully qualified name.
     * 
    */
    public Optional<String> getFqn() {
        return Optional.ofNullable(this.fqn);
    }
    /**
     * Database principal name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Database principal role.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * The tenant name of the principal
     * 
    */
    public String getTenantName() {
        return this.tenantName;
    }
    /**
     * Database principal type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabasePrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String email;
        private @Nullable String fqn;
        private String name;
        private String role;
        private String tenantName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabasePrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.email = defaults.email;
    	      this.fqn = defaults.fqn;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
    	      this.tenantName = defaults.tenantName;
    	      this.type = defaults.type;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setFqn(@Nullable String fqn) {
            this.fqn = fqn;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setTenantName(String tenantName) {
            this.tenantName = Objects.requireNonNull(tenantName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DatabasePrincipalResponse build() {
            return new DatabasePrincipalResponse(appId, email, fqn, name, role, tenantName, type);
        }
    }
}
