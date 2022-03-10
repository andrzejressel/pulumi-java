// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LatestOperationResultResponse {
    /**
     * Error code on failure.
     * 
     */
    private final String errorCode;
    /**
     * The error message.
     * 
     */
    private final String errorMessage;
    /**
     * The HttpMethod - PUT/POST/DELETE for the operation.
     * 
     */
    private final String httpMethod;
    /**
     * The URL to use to check long-running operation status
     * 
     */
    private final String operationUrl;
    /**
     * Request URI of the operation.
     * 
     */
    private final String requestUri;
    /**
     * The current status of the operation.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private LatestOperationResultResponse(
        @OutputCustomType.Parameter("errorCode") String errorCode,
        @OutputCustomType.Parameter("errorMessage") String errorMessage,
        @OutputCustomType.Parameter("httpMethod") String httpMethod,
        @OutputCustomType.Parameter("operationUrl") String operationUrl,
        @OutputCustomType.Parameter("requestUri") String requestUri,
        @OutputCustomType.Parameter("status") String status) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpMethod = httpMethod;
        this.operationUrl = operationUrl;
        this.requestUri = requestUri;
        this.status = status;
    }

    /**
     * Error code on failure.
     * 
    */
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The error message.
     * 
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The HttpMethod - PUT/POST/DELETE for the operation.
     * 
    */
    public String getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * The URL to use to check long-running operation status
     * 
    */
    public String getOperationUrl() {
        return this.operationUrl;
    }
    /**
     * Request URI of the operation.
     * 
    */
    public String getRequestUri() {
        return this.requestUri;
    }
    /**
     * The current status of the operation.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatestOperationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String errorMessage;
        private String httpMethod;
        private String operationUrl;
        private String requestUri;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(LatestOperationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
    	      this.httpMethod = defaults.httpMethod;
    	      this.operationUrl = defaults.operationUrl;
    	      this.requestUri = defaults.requestUri;
    	      this.status = defaults.status;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setOperationUrl(String operationUrl) {
            this.operationUrl = Objects.requireNonNull(operationUrl);
            return this;
        }

        public Builder setRequestUri(String requestUri) {
            this.requestUri = Objects.requireNonNull(requestUri);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public LatestOperationResultResponse build() {
            return new LatestOperationResultResponse(errorCode, errorMessage, httpMethod, operationUrl, requestUri, status);
        }
    }
}
