// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApiEndpointHandlerResponse {
    /**
     * Path to the script from the application root directory.
     * 
     */
    private final String scriptPath;

    @OutputCustomType.Constructor({"scriptPath"})
    private ApiEndpointHandlerResponse(String scriptPath) {
        this.scriptPath = Objects.requireNonNull(scriptPath);
    }

    /**
     * Path to the script from the application root directory.
     * 
     */
    public String getScriptPath() {
        return this.scriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiEndpointHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiEndpointHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptPath = defaults.scriptPath;
        }

        public Builder setScriptPath(String scriptPath) {
            this.scriptPath = Objects.requireNonNull(scriptPath);
            return this;
        }

        public ApiEndpointHandlerResponse build() {
            return new ApiEndpointHandlerResponse(scriptPath);
        }
    }
}
