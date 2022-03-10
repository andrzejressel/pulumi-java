// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class O365BreakOutCategoryPoliciesResponse {
    /**
     * Flag to control allow category.
     * 
     */
    private final @Nullable Boolean allow;
    /**
     * Flag to control default category.
     * 
     */
    private final @Nullable Boolean $default;
    /**
     * Flag to control optimize category.
     * 
     */
    private final @Nullable Boolean optimize;

    @OutputCustomType.Constructor
    private O365BreakOutCategoryPoliciesResponse(
        @OutputCustomType.Parameter("allow") @Nullable Boolean allow,
        @OutputCustomType.Parameter("default") @Nullable Boolean $default,
        @OutputCustomType.Parameter("optimize") @Nullable Boolean optimize) {
        this.allow = allow;
        this.$default = $default;
        this.optimize = optimize;
    }

    /**
     * Flag to control allow category.
     * 
    */
    public Optional<Boolean> getAllow() {
        return Optional.ofNullable(this.allow);
    }
    /**
     * Flag to control default category.
     * 
    */
    public Optional<Boolean> get$default() {
        return Optional.ofNullable(this.$default);
    }
    /**
     * Flag to control optimize category.
     * 
    */
    public Optional<Boolean> getOptimize() {
        return Optional.ofNullable(this.optimize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(O365BreakOutCategoryPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allow;
        private @Nullable Boolean $default;
        private @Nullable Boolean optimize;

        public Builder() {
    	      // Empty
        }

        public Builder(O365BreakOutCategoryPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.$default = defaults.$default;
    	      this.optimize = defaults.optimize;
        }

        public Builder setAllow(@Nullable Boolean allow) {
            this.allow = allow;
            return this;
        }

        public Builder set$default(@Nullable Boolean $default) {
            this.$default = $default;
            return this;
        }

        public Builder setOptimize(@Nullable Boolean optimize) {
            this.optimize = optimize;
            return this;
        }
        public O365BreakOutCategoryPoliciesResponse build() {
            return new O365BreakOutCategoryPoliciesResponse(allow, $default, optimize);
        }
    }
}
