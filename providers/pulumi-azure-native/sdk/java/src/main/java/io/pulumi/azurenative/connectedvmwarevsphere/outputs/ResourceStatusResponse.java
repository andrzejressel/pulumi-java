// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceStatusResponse {
    /**
     * The last update time for this condition.
     * 
     */
    private final String lastUpdatedAt;
    /**
     * A human readable message indicating details about the status.
     * 
     */
    private final String message;
    /**
     * The reason for the condition's status.
     * 
     */
    private final String reason;
    /**
     * Severity with which to treat failures of this type of condition.
     * 
     */
    private final String severity;
    /**
     * Status of the condition.
     * 
     */
    private final String status;
    /**
     * The type of the condition.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ResourceStatusResponse(
        @OutputCustomType.Parameter("lastUpdatedAt") String lastUpdatedAt,
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("reason") String reason,
        @OutputCustomType.Parameter("severity") String severity,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type) {
        this.lastUpdatedAt = lastUpdatedAt;
        this.message = message;
        this.reason = reason;
        this.severity = severity;
        this.status = status;
        this.type = type;
    }

    /**
     * The last update time for this condition.
     * 
    */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * A human readable message indicating details about the status.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The reason for the condition's status.
     * 
    */
    public String getReason() {
        return this.reason;
    }
    /**
     * Severity with which to treat failures of this type of condition.
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * Status of the condition.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The type of the condition.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdatedAt;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceStatusResponse build() {
            return new ResourceStatusResponse(lastUpdatedAt, message, reason, severity, status, type);
        }
    }
}
