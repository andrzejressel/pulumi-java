// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenIdConnectLoginResponse {
    /**
     * The name of the claim that contains the users name.
     * 
     */
    private final @Nullable String nameClaimType;
    /**
     * A list of the scopes that should be requested while authenticating.
     * 
     */
    private final @Nullable List<String> scopes;

    @OutputCustomType.Constructor
    private OpenIdConnectLoginResponse(
        @OutputCustomType.Parameter("nameClaimType") @Nullable String nameClaimType,
        @OutputCustomType.Parameter("scopes") @Nullable List<String> scopes) {
        this.nameClaimType = nameClaimType;
        this.scopes = scopes;
    }

    /**
     * The name of the claim that contains the users name.
     * 
    */
    public Optional<String> getNameClaimType() {
        return Optional.ofNullable(this.nameClaimType);
    }
    /**
     * A list of the scopes that should be requested while authenticating.
     * 
    */
    public List<String> getScopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectLoginResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nameClaimType;
        private @Nullable List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectLoginResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameClaimType = defaults.nameClaimType;
    	      this.scopes = defaults.scopes;
        }

        public Builder setNameClaimType(@Nullable String nameClaimType) {
            this.nameClaimType = nameClaimType;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public OpenIdConnectLoginResponse build() {
            return new OpenIdConnectLoginResponse(nameClaimType, scopes);
        }
    }
}
