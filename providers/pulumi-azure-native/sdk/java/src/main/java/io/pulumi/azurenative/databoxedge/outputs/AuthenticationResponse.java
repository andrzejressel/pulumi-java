// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.SymmetricKeyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthenticationResponse {
    /**
     * Symmetric key for authentication.
     * 
     */
    private final @Nullable SymmetricKeyResponse symmetricKey;

    @OutputCustomType.Constructor
    private AuthenticationResponse(@OutputCustomType.Parameter("symmetricKey") @Nullable SymmetricKeyResponse symmetricKey) {
        this.symmetricKey = symmetricKey;
    }

    /**
     * Symmetric key for authentication.
     * 
    */
    public Optional<SymmetricKeyResponse> getSymmetricKey() {
        return Optional.ofNullable(this.symmetricKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SymmetricKeyResponse symmetricKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.symmetricKey = defaults.symmetricKey;
        }

        public Builder setSymmetricKey(@Nullable SymmetricKeyResponse symmetricKey) {
            this.symmetricKey = symmetricKey;
            return this;
        }
        public AuthenticationResponse build() {
            return new AuthenticationResponse(symmetricKey);
        }
    }
}
