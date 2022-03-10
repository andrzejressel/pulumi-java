// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.StoredProcedureParameterResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlServerStoredProcedureActivityResponse {
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object storedProcedureName;
    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     * 
     */
    private final @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;
    /**
     * Type of activity.
     * Expected value is 'SqlServerStoredProcedure'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor
    private SqlServerStoredProcedureActivityResponse(
        @OutputCustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @OutputCustomType.Parameter("storedProcedureName") Object storedProcedureName,
        @OutputCustomType.Parameter("storedProcedureParameters") @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.policy = policy;
        this.storedProcedureName = storedProcedureName;
        this.storedProcedureParameters = storedProcedureParameters;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Stored procedure name. Type: string (or Expression with resultType string).
     * 
    */
    public Object getStoredProcedureName() {
        return this.storedProcedureName;
    }
    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     * 
    */
    public Map<String,StoredProcedureParameterResponse> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Map.of() : this.storedProcedureParameters;
    }
    /**
     * Type of activity.
     * Expected value is 'SqlServerStoredProcedure'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerStoredProcedureActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private Object storedProcedureName;
        private @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerStoredProcedureActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storedProcedureName = defaults.storedProcedureName;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setStoredProcedureName(Object storedProcedureName) {
            this.storedProcedureName = Objects.requireNonNull(storedProcedureName);
            return this;
        }

        public Builder setStoredProcedureParameters(@Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public SqlServerStoredProcedureActivityResponse build() {
            return new SqlServerStoredProcedureActivityResponse(dependsOn, description, linkedServiceName, name, policy, storedProcedureName, storedProcedureParameters, type, userProperties);
        }
    }
}
