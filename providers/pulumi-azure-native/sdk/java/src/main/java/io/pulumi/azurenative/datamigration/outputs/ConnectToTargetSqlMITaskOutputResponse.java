// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConnectToTargetSqlMITaskOutputResponse {
    /**
     * List of agent jobs on the target server.
     * 
     */
    private final List<String> agentJobs;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * List of logins on the target server.
     * 
     */
    private final List<String> logins;
    /**
     * Target server brand version
     * 
     */
    private final String targetServerBrandVersion;
    /**
     * Target server version
     * 
     */
    private final String targetServerVersion;
    /**
     * Validation errors
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @OutputCustomType.Constructor
    private ConnectToTargetSqlMITaskOutputResponse(
        @OutputCustomType.Parameter("agentJobs") List<String> agentJobs,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("logins") List<String> logins,
        @OutputCustomType.Parameter("targetServerBrandVersion") String targetServerBrandVersion,
        @OutputCustomType.Parameter("targetServerVersion") String targetServerVersion,
        @OutputCustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.agentJobs = agentJobs;
        this.id = id;
        this.logins = logins;
        this.targetServerBrandVersion = targetServerBrandVersion;
        this.targetServerVersion = targetServerVersion;
        this.validationErrors = validationErrors;
    }

    /**
     * List of agent jobs on the target server.
     * 
    */
    public List<String> getAgentJobs() {
        return this.agentJobs;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of logins on the target server.
     * 
    */
    public List<String> getLogins() {
        return this.logins;
    }
    /**
     * Target server brand version
     * 
    */
    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    /**
     * Target server version
     * 
    */
    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }
    /**
     * Validation errors
     * 
    */
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMITaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> agentJobs;
        private String id;
        private List<String> logins;
        private String targetServerBrandVersion;
        private String targetServerVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMITaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentJobs = defaults.agentJobs;
    	      this.id = defaults.id;
    	      this.logins = defaults.logins;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setAgentJobs(List<String> agentJobs) {
            this.agentJobs = Objects.requireNonNull(agentJobs);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogins(List<String> logins) {
            this.logins = Objects.requireNonNull(logins);
            return this;
        }

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public Builder setValidationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public ConnectToTargetSqlMITaskOutputResponse build() {
            return new ConnectToTargetSqlMITaskOutputResponse(agentJobs, id, logins, targetServerBrandVersion, targetServerVersion, validationErrors);
        }
    }
}
