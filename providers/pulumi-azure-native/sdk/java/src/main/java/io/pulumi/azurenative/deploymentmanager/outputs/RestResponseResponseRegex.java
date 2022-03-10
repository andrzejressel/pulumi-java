// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestResponseResponseRegex {
    /**
     * Indicates whether any or all of the expressions should match with the response content.
     * 
     */
    private final @Nullable String matchQuantifier;
    /**
     * The list of regular expressions.
     * 
     */
    private final @Nullable List<String> matches;

    @OutputCustomType.Constructor
    private RestResponseResponseRegex(
        @OutputCustomType.Parameter("matchQuantifier") @Nullable String matchQuantifier,
        @OutputCustomType.Parameter("matches") @Nullable List<String> matches) {
        this.matchQuantifier = matchQuantifier;
        this.matches = matches;
    }

    /**
     * Indicates whether any or all of the expressions should match with the response content.
     * 
    */
    public Optional<String> getMatchQuantifier() {
        return Optional.ofNullable(this.matchQuantifier);
    }
    /**
     * The list of regular expressions.
     * 
    */
    public List<String> getMatches() {
        return this.matches == null ? List.of() : this.matches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResponseResponseRegex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String matchQuantifier;
        private @Nullable List<String> matches;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResponseResponseRegex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchQuantifier = defaults.matchQuantifier;
    	      this.matches = defaults.matches;
        }

        public Builder setMatchQuantifier(@Nullable String matchQuantifier) {
            this.matchQuantifier = matchQuantifier;
            return this;
        }

        public Builder setMatches(@Nullable List<String> matches) {
            this.matches = matches;
            return this;
        }
        public RestResponseResponseRegex build() {
            return new RestResponseResponseRegex(matchQuantifier, matches);
        }
    }
}
