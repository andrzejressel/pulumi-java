// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserDefinedFunctionResourceResponse {
    /**
     * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    private final String inlineCode;
    /**
     * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    private final String resourceUri;

    @OutputCustomType.Constructor({"inlineCode","resourceUri"})
    private UserDefinedFunctionResourceResponse(
        String inlineCode,
        String resourceUri) {
        this.inlineCode = Objects.requireNonNull(inlineCode);
        this.resourceUri = Objects.requireNonNull(resourceUri);
    }

    /**
     * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    public String getInlineCode() {
        return this.inlineCode;
    }
    /**
     * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    public String getResourceUri() {
        return this.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedFunctionResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inlineCode;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedFunctionResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineCode = defaults.inlineCode;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setInlineCode(String inlineCode) {
            this.inlineCode = Objects.requireNonNull(inlineCode);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public UserDefinedFunctionResourceResponse build() {
            return new UserDefinedFunctionResourceResponse(inlineCode, resourceUri);
        }
    }
}
