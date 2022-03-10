// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ErrorDetailResponse {
    /**
     * Error code.
     * 
     */
    private final String code;
    /**
     * Error message.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor
    private ErrorDetailResponse(
        @OutputCustomType.Parameter("code") String code,
        @OutputCustomType.Parameter("message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Error code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Error message.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public ErrorDetailResponse build() {
            return new ErrorDetailResponse(code, message);
        }
    }
}
