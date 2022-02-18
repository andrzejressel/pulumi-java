// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A context rule provides information about the context for an individual API element.
 * 
 */
public final class ContextRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContextRuleArgs Empty = new ContextRuleArgs();

    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
     */
    @InputImport(name="allowedRequestExtensions")
    private final @Nullable Input<List<String>> allowedRequestExtensions;

    public Input<List<String>> getAllowedRequestExtensions() {
        return this.allowedRequestExtensions == null ? Input.empty() : this.allowedRequestExtensions;
    }

    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
     */
    @InputImport(name="allowedResponseExtensions")
    private final @Nullable Input<List<String>> allowedResponseExtensions;

    public Input<List<String>> getAllowedResponseExtensions() {
        return this.allowedResponseExtensions == null ? Input.empty() : this.allowedResponseExtensions;
    }

    /**
     * A list of full type names of provided contexts.
     * 
     */
    @InputImport(name="provided")
    private final @Nullable Input<List<String>> provided;

    public Input<List<String>> getProvided() {
        return this.provided == null ? Input.empty() : this.provided;
    }

    /**
     * A list of full type names of requested contexts.
     * 
     */
    @InputImport(name="requested")
    private final @Nullable Input<List<String>> requested;

    public Input<List<String>> getRequested() {
        return this.requested == null ? Input.empty() : this.requested;
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @InputImport(name="selector")
    private final @Nullable Input<String> selector;

    public Input<String> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    public ContextRuleArgs(
        @Nullable Input<List<String>> allowedRequestExtensions,
        @Nullable Input<List<String>> allowedResponseExtensions,
        @Nullable Input<List<String>> provided,
        @Nullable Input<List<String>> requested,
        @Nullable Input<String> selector) {
        this.allowedRequestExtensions = allowedRequestExtensions;
        this.allowedResponseExtensions = allowedResponseExtensions;
        this.provided = provided;
        this.requested = requested;
        this.selector = selector;
    }

    private ContextRuleArgs() {
        this.allowedRequestExtensions = Input.empty();
        this.allowedResponseExtensions = Input.empty();
        this.provided = Input.empty();
        this.requested = Input.empty();
        this.selector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContextRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedRequestExtensions;
        private @Nullable Input<List<String>> allowedResponseExtensions;
        private @Nullable Input<List<String>> provided;
        private @Nullable Input<List<String>> requested;
        private @Nullable Input<String> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(ContextRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRequestExtensions = defaults.allowedRequestExtensions;
    	      this.allowedResponseExtensions = defaults.allowedResponseExtensions;
    	      this.provided = defaults.provided;
    	      this.requested = defaults.requested;
    	      this.selector = defaults.selector;
        }

        public Builder setAllowedRequestExtensions(@Nullable Input<List<String>> allowedRequestExtensions) {
            this.allowedRequestExtensions = allowedRequestExtensions;
            return this;
        }

        public Builder setAllowedRequestExtensions(@Nullable List<String> allowedRequestExtensions) {
            this.allowedRequestExtensions = Input.ofNullable(allowedRequestExtensions);
            return this;
        }

        public Builder setAllowedResponseExtensions(@Nullable Input<List<String>> allowedResponseExtensions) {
            this.allowedResponseExtensions = allowedResponseExtensions;
            return this;
        }

        public Builder setAllowedResponseExtensions(@Nullable List<String> allowedResponseExtensions) {
            this.allowedResponseExtensions = Input.ofNullable(allowedResponseExtensions);
            return this;
        }

        public Builder setProvided(@Nullable Input<List<String>> provided) {
            this.provided = provided;
            return this;
        }

        public Builder setProvided(@Nullable List<String> provided) {
            this.provided = Input.ofNullable(provided);
            return this;
        }

        public Builder setRequested(@Nullable Input<List<String>> requested) {
            this.requested = requested;
            return this;
        }

        public Builder setRequested(@Nullable List<String> requested) {
            this.requested = Input.ofNullable(requested);
            return this;
        }

        public Builder setSelector(@Nullable Input<String> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable String selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public ContextRuleArgs build() {
            return new ContextRuleArgs(allowedRequestExtensions, allowedResponseExtensions, provided, requested, selector);
        }
    }
}
