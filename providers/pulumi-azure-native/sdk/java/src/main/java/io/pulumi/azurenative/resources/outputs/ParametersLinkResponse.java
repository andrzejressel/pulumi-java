// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParametersLinkResponse {
    /**
     * If included, must match the ContentVersion in the template.
     * 
     */
    private final @Nullable String contentVersion;
    /**
     * The URI of the parameters file.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor
    private ParametersLinkResponse(
        @OutputCustomType.Parameter("contentVersion") @Nullable String contentVersion,
        @OutputCustomType.Parameter("uri") String uri) {
        this.contentVersion = contentVersion;
        this.uri = uri;
    }

    /**
     * If included, must match the ContentVersion in the template.
     * 
    */
    public Optional<String> getContentVersion() {
        return Optional.ofNullable(this.contentVersion);
    }
    /**
     * The URI of the parameters file.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParametersLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentVersion;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ParametersLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentVersion = defaults.contentVersion;
    	      this.uri = defaults.uri;
        }

        public Builder setContentVersion(@Nullable String contentVersion) {
            this.contentVersion = contentVersion;
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ParametersLinkResponse build() {
            return new ParametersLinkResponse(contentVersion, uri);
        }
    }
}
