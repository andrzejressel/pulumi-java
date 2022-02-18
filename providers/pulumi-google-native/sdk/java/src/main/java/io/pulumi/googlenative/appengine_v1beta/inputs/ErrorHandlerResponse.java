// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Custom static error page to be served when an error occurs.
 * 
 */
public final class ErrorHandlerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorHandlerResponse Empty = new ErrorHandlerResponse();

    /**
     * Error condition this handler applies to.
     * 
     */
    @InputImport(name="errorCode", required=true)
    private final String errorCode;

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * MIME type of file. Defaults to text/html.
     * 
     */
    @InputImport(name="mimeType", required=true)
    private final String mimeType;

    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * Static file content to be served for this error.
     * 
     */
    @InputImport(name="staticFile", required=true)
    private final String staticFile;

    public String getStaticFile() {
        return this.staticFile;
    }

    public ErrorHandlerResponse(
        String errorCode,
        String mimeType,
        String staticFile) {
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.mimeType = Objects.requireNonNull(mimeType, "expected parameter 'mimeType' to be non-null");
        this.staticFile = Objects.requireNonNull(staticFile, "expected parameter 'staticFile' to be non-null");
    }

    private ErrorHandlerResponse() {
        this.errorCode = null;
        this.mimeType = null;
        this.staticFile = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String mimeType;
        private String staticFile;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.mimeType = defaults.mimeType;
    	      this.staticFile = defaults.staticFile;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }

        public Builder setStaticFile(String staticFile) {
            this.staticFile = Objects.requireNonNull(staticFile);
            return this;
        }

        public ErrorHandlerResponse build() {
            return new ErrorHandlerResponse(errorCode, mimeType, staticFile);
        }
    }
}
