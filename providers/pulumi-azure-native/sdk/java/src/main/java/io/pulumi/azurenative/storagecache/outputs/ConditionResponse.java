// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConditionResponse {
    /**
     * The issue requiring attention.
     * 
     */
    private final String message;
    /**
     * The time when the condition was raised.
     * 
     */
    private final String timestamp;

    @OutputCustomType.Constructor
    private ConditionResponse(
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("timestamp") String timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    /**
     * The issue requiring attention.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The time when the condition was raised.
     * 
    */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.timestamp = defaults.timestamp;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        public ConditionResponse build() {
            return new ConditionResponse(message, timestamp);
        }
    }
}
