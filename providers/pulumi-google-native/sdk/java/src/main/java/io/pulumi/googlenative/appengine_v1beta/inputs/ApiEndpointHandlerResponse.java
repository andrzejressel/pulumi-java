// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Uses Google Cloud Endpoints to handle requests.
 * 
 */
public final class ApiEndpointHandlerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiEndpointHandlerResponse Empty = new ApiEndpointHandlerResponse();

    /**
     * Path to the script from the application root directory.
     * 
     */
    @InputImport(name="scriptPath", required=true)
    private final String scriptPath;

    public String getScriptPath() {
        return this.scriptPath;
    }

    public ApiEndpointHandlerResponse(String scriptPath) {
        this.scriptPath = Objects.requireNonNull(scriptPath, "expected parameter 'scriptPath' to be non-null");
    }

    private ApiEndpointHandlerResponse() {
        this.scriptPath = null;
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
