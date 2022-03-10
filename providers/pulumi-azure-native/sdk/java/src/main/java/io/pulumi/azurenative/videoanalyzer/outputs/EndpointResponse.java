// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointResponse {
    /**
     * The URL of the endpoint.
     * 
     */
    private final @Nullable String endpointUrl;
    /**
     * The type of the endpoint.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private EndpointResponse(
        @OutputCustomType.Parameter("endpointUrl") @Nullable String endpointUrl,
        @OutputCustomType.Parameter("type") String type) {
        this.endpointUrl = endpointUrl;
        this.type = type;
    }

    /**
     * The URL of the endpoint.
     * 
    */
    public Optional<String> getEndpointUrl() {
        return Optional.ofNullable(this.endpointUrl);
    }
    /**
     * The type of the endpoint.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUrl = defaults.endpointUrl;
    	      this.type = defaults.type;
        }

        public Builder setEndpointUrl(@Nullable String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EndpointResponse build() {
            return new EndpointResponse(endpointUrl, type);
        }
    }
}
