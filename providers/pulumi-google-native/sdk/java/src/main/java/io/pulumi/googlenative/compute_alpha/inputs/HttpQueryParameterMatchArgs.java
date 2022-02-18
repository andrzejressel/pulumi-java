// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HttpRouteRuleMatch criteria for a request's query parameter.
 * 
 */
public final class HttpQueryParameterMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpQueryParameterMatchArgs Empty = new HttpQueryParameterMatchArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    @InputImport(name="exactMatch")
    private final @Nullable Input<String> exactMatch;

    public Input<String> getExactMatch() {
        return this.exactMatch == null ? Input.empty() : this.exactMatch;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    @InputImport(name="presentMatch")
    private final @Nullable Input<Boolean> presentMatch;

    public Input<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Input.empty() : this.presentMatch;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For more information about regular expression syntax, see Syntax. Only one of presentMatch, exactMatch, or regexMatch must be set. regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="regexMatch")
    private final @Nullable Input<String> regexMatch;

    public Input<String> getRegexMatch() {
        return this.regexMatch == null ? Input.empty() : this.regexMatch;
    }

    public HttpQueryParameterMatchArgs(
        @Nullable Input<String> exactMatch,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> presentMatch,
        @Nullable Input<String> regexMatch) {
        this.exactMatch = exactMatch;
        this.name = name;
        this.presentMatch = presentMatch;
        this.regexMatch = regexMatch;
    }

    private HttpQueryParameterMatchArgs() {
        this.exactMatch = Input.empty();
        this.name = Input.empty();
        this.presentMatch = Input.empty();
        this.regexMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpQueryParameterMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> exactMatch;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> presentMatch;
        private @Nullable Input<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpQueryParameterMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.name = defaults.name;
    	      this.presentMatch = defaults.presentMatch;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder setExactMatch(@Nullable Input<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder setExactMatch(@Nullable String exactMatch) {
            this.exactMatch = Input.ofNullable(exactMatch);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPresentMatch(@Nullable Input<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder setPresentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Input.ofNullable(presentMatch);
            return this;
        }

        public Builder setRegexMatch(@Nullable Input<String> regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public Builder setRegexMatch(@Nullable String regexMatch) {
            this.regexMatch = Input.ofNullable(regexMatch);
            return this;
        }

        public HttpQueryParameterMatchArgs build() {
            return new HttpQueryParameterMatchArgs(exactMatch, name, presentMatch, regexMatch);
        }
    }
}
