// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A lightweight description of a file.
 * 
 */
public final class ApigatewayApiConfigFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApigatewayApiConfigFileResponse Empty = new ApigatewayApiConfigFileResponse();

    /**
     * The bytes that constitute the file.
     * 
     */
    @InputImport(name="contents", required=true)
    private final String contents;

    public String getContents() {
        return this.contents;
    }

    /**
     * The file path (full or relative path). This is typically the path of the file when it is uploaded.
     * 
     */
    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    public ApigatewayApiConfigFileResponse(
        String contents,
        String path) {
        this.contents = Objects.requireNonNull(contents, "expected parameter 'contents' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private ApigatewayApiConfigFileResponse() {
        this.contents = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contents;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.path = defaults.path;
        }

        public Builder setContents(String contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public ApigatewayApiConfigFileResponse build() {
            return new ApigatewayApiConfigFileResponse(contents, path);
        }
    }
}
