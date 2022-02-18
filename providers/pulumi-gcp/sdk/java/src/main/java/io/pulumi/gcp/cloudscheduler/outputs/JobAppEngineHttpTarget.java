// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudscheduler.outputs.JobAppEngineHttpTargetAppEngineRouting;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobAppEngineHttpTarget {
    /**
     * App Engine Routing setting for the job.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobAppEngineHttpTargetAppEngineRouting appEngineRouting;
    /**
     * HTTP request body.
     * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
     * It is an error to set body on a job with an incompatible HttpMethod.
     * A base64-encoded string.
     * 
     */
    private final @Nullable String body;
    /**
     * This map contains the header field names and values.
     * Repeated headers are not supported, but a header value can contain commas.
     * 
     */
    private final @Nullable Map<String,String> headers;
    /**
     * Which HTTP method to use for the request.
     * 
     */
    private final @Nullable String httpMethod;
    /**
     * The relative URI.
     * The relative URL must begin with "/" and must be a valid HTTP relative URL.
     * It can contain a path, query string arguments, and \# fragments.
     * If the relative URL is empty, then the root path "/" will be used.
     * No spaces are allowed, and the maximum length allowed is 2083 characters
     * 
     */
    private final String relativeUri;

    @OutputCustomType.Constructor({"appEngineRouting","body","headers","httpMethod","relativeUri"})
    private JobAppEngineHttpTarget(
        @Nullable JobAppEngineHttpTargetAppEngineRouting appEngineRouting,
        @Nullable String body,
        @Nullable Map<String,String> headers,
        @Nullable String httpMethod,
        String relativeUri) {
        this.appEngineRouting = appEngineRouting;
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.relativeUri = Objects.requireNonNull(relativeUri);
    }

    /**
     * App Engine Routing setting for the job.
     * Structure is documented below.
     * 
     */
    public Optional<JobAppEngineHttpTargetAppEngineRouting> getAppEngineRouting() {
        return Optional.ofNullable(this.appEngineRouting);
    }
    /**
     * HTTP request body.
     * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
     * It is an error to set body on a job with an incompatible HttpMethod.
     * A base64-encoded string.
     * 
     */
    public Optional<String> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * This map contains the header field names and values.
     * Repeated headers are not supported, but a header value can contain commas.
     * 
     */
    public Map<String,String> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * Which HTTP method to use for the request.
     * 
     */
    public Optional<String> getHttpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    /**
     * The relative URI.
     * The relative URL must begin with "/" and must be a valid HTTP relative URL.
     * It can contain a path, query string arguments, and \# fragments.
     * If the relative URL is empty, then the root path "/" will be used.
     * No spaces are allowed, and the maximum length allowed is 2083 characters
     * 
     */
    public String getRelativeUri() {
        return this.relativeUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAppEngineHttpTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobAppEngineHttpTargetAppEngineRouting appEngineRouting;
        private @Nullable String body;
        private @Nullable Map<String,String> headers;
        private @Nullable String httpMethod;
        private String relativeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAppEngineHttpTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.relativeUri = defaults.relativeUri;
        }

        public Builder setAppEngineRouting(@Nullable JobAppEngineHttpTargetAppEngineRouting appEngineRouting) {
            this.appEngineRouting = appEngineRouting;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = body;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHttpMethod(@Nullable String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setRelativeUri(String relativeUri) {
            this.relativeUri = Objects.requireNonNull(relativeUri);
            return this;
        }

        public JobAppEngineHttpTarget build() {
            return new JobAppEngineHttpTarget(appEngineRouting, body, headers, httpMethod, relativeUri);
        }
    }
}
