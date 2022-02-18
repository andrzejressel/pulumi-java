// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database instance operation error.
 * 
 */
public final class OperationErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final OperationErrorArgs Empty = new OperationErrorArgs();

    /**
     * Identifies the specific error that occurred.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * This is always `sql#operationError`.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Additional information about the error encountered.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    public OperationErrorArgs(
        @Nullable Input<String> code,
        @Nullable Input<String> kind,
        @Nullable Input<String> message) {
        this.code = code;
        this.kind = kind;
        this.message = message;
    }

    private OperationErrorArgs() {
        this.code = Input.empty();
        this.kind = Input.empty();
        this.message = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> code;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
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

        public OperationErrorArgs build() {
            return new OperationErrorArgs(code, kind, message);
        }
    }
}
