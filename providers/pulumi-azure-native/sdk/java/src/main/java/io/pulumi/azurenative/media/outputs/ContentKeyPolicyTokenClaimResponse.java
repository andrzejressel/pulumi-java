// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentKeyPolicyTokenClaimResponse {
    /**
     * Token claim type.
     * 
     */
    private final @Nullable String claimType;
    /**
     * Token claim value.
     * 
     */
    private final @Nullable String claimValue;

    @OutputCustomType.Constructor
    private ContentKeyPolicyTokenClaimResponse(
        @OutputCustomType.Parameter("claimType") @Nullable String claimType,
        @OutputCustomType.Parameter("claimValue") @Nullable String claimValue) {
        this.claimType = claimType;
        this.claimValue = claimValue;
    }

    /**
     * Token claim type.
     * 
    */
    public Optional<String> getClaimType() {
        return Optional.ofNullable(this.claimType);
    }
    /**
     * Token claim value.
     * 
    */
    public Optional<String> getClaimValue() {
        return Optional.ofNullable(this.claimValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyTokenClaimResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String claimType;
        private @Nullable String claimValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyTokenClaimResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimType = defaults.claimType;
    	      this.claimValue = defaults.claimValue;
        }

        public Builder setClaimType(@Nullable String claimType) {
            this.claimType = claimType;
            return this;
        }

        public Builder setClaimValue(@Nullable String claimValue) {
            this.claimValue = claimValue;
            return this;
        }
        public ContentKeyPolicyTokenClaimResponse build() {
            return new ContentKeyPolicyTokenClaimResponse(claimType, claimValue);
        }
    }
}
