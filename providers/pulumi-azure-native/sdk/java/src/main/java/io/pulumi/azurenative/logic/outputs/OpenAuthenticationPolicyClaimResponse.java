// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenAuthenticationPolicyClaimResponse {
    /**
     * The name of the claim.
     * 
     */
    private final @Nullable String name;
    /**
     * The value of the claim.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private OpenAuthenticationPolicyClaimResponse(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The name of the claim.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The value of the claim.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenAuthenticationPolicyClaimResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenAuthenticationPolicyClaimResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public OpenAuthenticationPolicyClaimResponse build() {
            return new OpenAuthenticationPolicyClaimResponse(name, value);
        }
    }
}
