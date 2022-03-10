// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiDefinitionInfoResponse {
    /**
     * The URL of the API definition.
     * 
     */
    private final @Nullable String url;

    @OutputCustomType.Constructor
    private ApiDefinitionInfoResponse(@OutputCustomType.Parameter("url") @Nullable String url) {
        this.url = url;
    }

    /**
     * The URL of the API definition.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDefinitionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDefinitionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ApiDefinitionInfoResponse build() {
            return new ApiDefinitionInfoResponse(url);
        }
    }
}
