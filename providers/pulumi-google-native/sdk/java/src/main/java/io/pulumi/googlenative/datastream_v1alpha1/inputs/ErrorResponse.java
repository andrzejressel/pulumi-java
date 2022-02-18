// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Represent a user-facing Error.
 * 
 */
public final class ErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorResponse Empty = new ErrorResponse();

    /**
     * Additional information about the error.
     * 
     */
    @InputImport(name="details", required=true)
    private final Map<String,String> details;

    public Map<String,String> getDetails() {
        return this.details;
    }

    /**
     * The time when the error occurred.
     * 
     */
    @InputImport(name="errorTime", required=true)
    private final String errorTime;

    public String getErrorTime() {
        return this.errorTime;
    }

    /**
     * A unique identifier for this specific error, allowing it to be traced throughout the system in logs and API responses.
     * 
     */
    @InputImport(name="errorUuid", required=true)
    private final String errorUuid;

    public String getErrorUuid() {
        return this.errorUuid;
    }

    /**
     * A message containing more information about the error that occurred.
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * A title that explains the reason for the error.
     * 
     */
    @InputImport(name="reason", required=true)
    private final String reason;

    public String getReason() {
        return this.reason;
    }

    public ErrorResponse(
        Map<String,String> details,
        String errorTime,
        String errorUuid,
        String message,
        String reason) {
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.errorTime = Objects.requireNonNull(errorTime, "expected parameter 'errorTime' to be non-null");
        this.errorUuid = Objects.requireNonNull(errorUuid, "expected parameter 'errorUuid' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
    }

    private ErrorResponse() {
        this.details = Map.of();
        this.errorTime = null;
        this.errorUuid = null;
        this.message = null;
        this.reason = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> details;
        private String errorTime;
        private String errorUuid;
        private String message;
        private String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.errorTime = defaults.errorTime;
    	      this.errorUuid = defaults.errorUuid;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder setDetails(Map<String,String> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setErrorTime(String errorTime) {
            this.errorTime = Objects.requireNonNull(errorTime);
            return this;
        }

        public Builder setErrorUuid(String errorUuid) {
            this.errorUuid = Objects.requireNonNull(errorUuid);
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

        public ErrorResponse build() {
            return new ErrorResponse(details, errorTime, errorUuid, message, reason);
        }
    }
}
