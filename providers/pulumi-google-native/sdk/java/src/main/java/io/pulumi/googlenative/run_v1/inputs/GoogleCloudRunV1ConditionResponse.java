// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Condition defines a generic condition for a Resource.
 * 
 */
public final class GoogleCloudRunV1ConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunV1ConditionResponse Empty = new GoogleCloudRunV1ConditionResponse();

    /**
     * Optional. Last time the condition transitioned from one status to another.
     * 
     */
    @InputImport(name="lastTransitionTime", required=true)
    private final String lastTransitionTime;

    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    /**
     * Optional. Human readable message indicating details about the current status.
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * Optional. One-word CamelCase reason for the condition's last transition.
     * 
     */
    @InputImport(name="reason", required=true)
    private final String reason;

    public String getReason() {
        return this.reason;
    }

    /**
     * Optional. How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    @InputImport(name="severity", required=true)
    private final String severity;

    public String getSeverity() {
        return this.severity;
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * "Ready": True when the Resource is ready.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudRunV1ConditionResponse(
        String lastTransitionTime,
        String message,
        String reason,
        String severity,
        String status,
        String type) {
        this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime, "expected parameter 'lastTransitionTime' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudRunV1ConditionResponse() {
        this.lastTransitionTime = null;
        this.message = null;
        this.reason = null;
        this.severity = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunV1ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastTransitionTime;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunV1ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
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

        public GoogleCloudRunV1ConditionResponse build() {
            return new GoogleCloudRunV1ConditionResponse(lastTransitionTime, message, reason, severity, status, type);
        }
    }
}
