// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.memcache_v1.enums.InstanceMessageCode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMessageArgs Empty = new InstanceMessageArgs();

    /**
     * A code that correspond to one type of user-facing message.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<InstanceMessageCode> code;

    public Input<InstanceMessageCode> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * Message on memcached instance which will be exposed to users.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    public InstanceMessageArgs(
        @Nullable Input<InstanceMessageCode> code,
        @Nullable Input<String> message) {
        this.code = code;
        this.message = message;
    }

    private InstanceMessageArgs() {
        this.code = Input.empty();
        this.message = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceMessageCode> code;
        private @Nullable Input<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable Input<InstanceMessageCode> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable InstanceMessageCode code) {
            this.code = Input.ofNullable(code);
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

        public InstanceMessageArgs build() {
            return new InstanceMessageArgs(code, message);
        }
    }
}
