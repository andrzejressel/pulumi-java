// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details. You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).
 * 
 */
public final class StatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusArgs Empty = new StatusArgs();

    /**
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<Integer> code;

    public Input<Integer> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    @InputImport(name="details")
    private final @Nullable Input<List<Map<String,String>>> details;

    public Input<List<Map<String,String>>> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    public StatusArgs(
        @Nullable Input<Integer> code,
        @Nullable Input<List<Map<String,String>>> details,
        @Nullable Input<String> message) {
        this.code = code;
        this.details = details;
        this.message = message;
    }

    private StatusArgs() {
        this.code = Input.empty();
        this.details = Input.empty();
        this.message = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> code;
        private @Nullable Input<List<Map<String,String>>> details;
        private @Nullable Input<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable Input<Integer> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable Integer code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setDetails(@Nullable Input<List<Map<String,String>>> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable List<Map<String,String>> details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public StatusArgs build() {
            return new StatusArgs(code, details, message);
        }
    }
}
