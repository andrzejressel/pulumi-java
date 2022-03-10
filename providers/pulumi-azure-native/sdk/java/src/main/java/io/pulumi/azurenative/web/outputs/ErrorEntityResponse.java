// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ErrorEntityResponse {
    /**
     * Basic error code.
     * 
     */
    private final @Nullable String code;
    /**
     * Type of error.
     * 
     */
    private final @Nullable String extendedCode;
    /**
     * Inner errors.
     * 
     */
    private final @Nullable List<ErrorEntityResponse> innerErrors;
    /**
     * Any details of the error.
     * 
     */
    private final @Nullable String message;
    /**
     * Message template.
     * 
     */
    private final @Nullable String messageTemplate;
    /**
     * Parameters for the template.
     * 
     */
    private final @Nullable List<String> parameters;

    @OutputCustomType.Constructor
    private ErrorEntityResponse(
        @OutputCustomType.Parameter("code") @Nullable String code,
        @OutputCustomType.Parameter("extendedCode") @Nullable String extendedCode,
        @OutputCustomType.Parameter("innerErrors") @Nullable List<ErrorEntityResponse> innerErrors,
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("messageTemplate") @Nullable String messageTemplate,
        @OutputCustomType.Parameter("parameters") @Nullable List<String> parameters) {
        this.code = code;
        this.extendedCode = extendedCode;
        this.innerErrors = innerErrors;
        this.message = message;
        this.messageTemplate = messageTemplate;
        this.parameters = parameters;
    }

    /**
     * Basic error code.
     * 
    */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * Type of error.
     * 
    */
    public Optional<String> getExtendedCode() {
        return Optional.ofNullable(this.extendedCode);
    }
    /**
     * Inner errors.
     * 
    */
    public List<ErrorEntityResponse> getInnerErrors() {
        return this.innerErrors == null ? List.of() : this.innerErrors;
    }
    /**
     * Any details of the error.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Message template.
     * 
    */
    public Optional<String> getMessageTemplate() {
        return Optional.ofNullable(this.messageTemplate);
    }
    /**
     * Parameters for the template.
     * 
    */
    public List<String> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorEntityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String extendedCode;
        private @Nullable List<ErrorEntityResponse> innerErrors;
        private @Nullable String message;
        private @Nullable String messageTemplate;
        private @Nullable List<String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorEntityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.extendedCode = defaults.extendedCode;
    	      this.innerErrors = defaults.innerErrors;
    	      this.message = defaults.message;
    	      this.messageTemplate = defaults.messageTemplate;
    	      this.parameters = defaults.parameters;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setExtendedCode(@Nullable String extendedCode) {
            this.extendedCode = extendedCode;
            return this;
        }

        public Builder setInnerErrors(@Nullable List<ErrorEntityResponse> innerErrors) {
            this.innerErrors = innerErrors;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setMessageTemplate(@Nullable String messageTemplate) {
            this.messageTemplate = messageTemplate;
            return this;
        }

        public Builder setParameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public ErrorEntityResponse build() {
            return new ErrorEntityResponse(code, extendedCode, innerErrors, message, messageTemplate, parameters);
        }
    }
}
