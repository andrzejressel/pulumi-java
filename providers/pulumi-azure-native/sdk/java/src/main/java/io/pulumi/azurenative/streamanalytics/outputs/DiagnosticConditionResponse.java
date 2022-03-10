// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiagnosticConditionResponse {
    /**
     * The opaque diagnostic code.
     * 
     */
    private final String code;
    /**
     * The human-readable message describing the condition in detail. Localized in the Accept-Language of the client request.
     * 
     */
    private final String message;
    /**
     * The UTC timestamp of when the condition started. Customers should be able to find a corresponding event in the ops log around this time.
     * 
     */
    private final String since;

    @OutputCustomType.Constructor
    private DiagnosticConditionResponse(
        @OutputCustomType.Parameter("code") String code,
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("since") String since) {
        this.code = code;
        this.message = message;
        this.since = since;
    }

    /**
     * The opaque diagnostic code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * The human-readable message describing the condition in detail. Localized in the Accept-Language of the client request.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The UTC timestamp of when the condition started. Customers should be able to find a corresponding event in the ops log around this time.
     * 
    */
    public String getSince() {
        return this.since;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;
        private String since;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.since = defaults.since;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setSince(String since) {
            this.since = Objects.requireNonNull(since);
            return this;
        }
        public DiagnosticConditionResponse build() {
            return new DiagnosticConditionResponse(code, message, since);
        }
    }
}
