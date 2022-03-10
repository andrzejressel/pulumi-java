// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiResourcePoliciesResponse {
    /**
     * The API level only policies XML as embedded content.
     * 
     */
    private final @Nullable String content;
    /**
     * The content link to the policies.
     * 
     */
    private final @Nullable String contentLink;

    @OutputCustomType.Constructor
    private ApiResourcePoliciesResponse(
        @OutputCustomType.Parameter("content") @Nullable String content,
        @OutputCustomType.Parameter("contentLink") @Nullable String contentLink) {
        this.content = content;
        this.contentLink = contentLink;
    }

    /**
     * The API level only policies XML as embedded content.
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The content link to the policies.
     * 
    */
    public Optional<String> getContentLink() {
        return Optional.ofNullable(this.contentLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourcePoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String contentLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourcePoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setContentLink(@Nullable String contentLink) {
            this.contentLink = contentLink;
            return this;
        }
        public ApiResourcePoliciesResponse build() {
            return new ApiResourcePoliciesResponse(content, contentLink);
        }
    }
}
