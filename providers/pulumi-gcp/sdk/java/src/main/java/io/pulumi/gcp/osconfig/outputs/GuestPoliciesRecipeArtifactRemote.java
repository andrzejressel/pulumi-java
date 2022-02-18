// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesRecipeArtifactRemote {
    /**
     * Must be provided if allowInsecure is false. SHA256 checksum in hex format, to compare to the checksum of the artifact.
     * If the checksum is not empty and it doesn't match the artifact then the recipe installation fails before running any
     * of the steps.
     * 
     */
    private final @Nullable String checkSum;
    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"checkSum","uri"})
    private GuestPoliciesRecipeArtifactRemote(
        @Nullable String checkSum,
        @Nullable String uri) {
        this.checkSum = checkSum;
        this.uri = uri;
    }

    /**
     * Must be provided if allowInsecure is false. SHA256 checksum in hex format, to compare to the checksum of the artifact.
     * If the checksum is not empty and it doesn't match the artifact then the recipe installation fails before running any
     * of the steps.
     * 
     */
    public Optional<String> getCheckSum() {
        return Optional.ofNullable(this.checkSum);
    }
    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifactRemote defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String checkSum;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifactRemote defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkSum = defaults.checkSum;
    	      this.uri = defaults.uri;
        }

        public Builder setCheckSum(@Nullable String checkSum) {
            this.checkSum = checkSum;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public GuestPoliciesRecipeArtifactRemote build() {
            return new GuestPoliciesRecipeArtifactRemote(checkSum, uri);
        }
    }
}
