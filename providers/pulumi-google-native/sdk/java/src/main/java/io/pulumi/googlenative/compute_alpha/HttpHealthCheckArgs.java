// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HttpHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHealthCheckArgs Empty = new HttpHealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @InputImport(name="checkIntervalSec")
    private final @Nullable Input<Integer> checkIntervalSec;

    public Input<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec == null ? Input.empty() : this.checkIntervalSec;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @InputImport(name="healthyThreshold")
    private final @Nullable Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Input.empty() : this.healthyThreshold;
    }

    /**
     * The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
     */
    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The TCP port number for the HTTP health check request. The default value is 80.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
     * 
     */
    @InputImport(name="requestPath")
    private final @Nullable Input<String> requestPath;

    public Input<String> getRequestPath() {
        return this.requestPath == null ? Input.empty() : this.requestPath;
    }

    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @InputImport(name="timeoutSec")
    private final @Nullable Input<Integer> timeoutSec;

    public Input<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Input.empty() : this.timeoutSec;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @InputImport(name="unhealthyThreshold")
    private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public HttpHealthCheckArgs(
        @Nullable Input<Integer> checkIntervalSec,
        @Nullable Input<String> description,
        @Nullable Input<Integer> healthyThreshold,
        @Nullable Input<String> host,
        @Nullable Input<String> name,
        @Nullable Input<Integer> port,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<String> requestPath,
        @Nullable Input<Integer> timeoutSec,
        @Nullable Input<Integer> unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.description = description;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.name = name;
        this.port = port;
        this.project = project;
        this.requestId = requestId;
        this.requestPath = requestPath;
        this.timeoutSec = timeoutSec;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private HttpHealthCheckArgs() {
        this.checkIntervalSec = Input.empty();
        this.description = Input.empty();
        this.healthyThreshold = Input.empty();
        this.host = Input.empty();
        this.name = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.requestPath = Input.empty();
        this.timeoutSec = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> checkIntervalSec;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> healthyThreshold;
        private @Nullable Input<String> host;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> requestPath;
        private @Nullable Input<Integer> timeoutSec;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.description = defaults.description;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.requestPath = defaults.requestPath;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setCheckIntervalSec(@Nullable Input<Integer> checkIntervalSec) {
            this.checkIntervalSec = checkIntervalSec;
            return this;
        }

        public Builder setCheckIntervalSec(@Nullable Integer checkIntervalSec) {
            this.checkIntervalSec = Input.ofNullable(checkIntervalSec);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Input<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Input.ofNullable(healthyThreshold);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRequestPath(@Nullable Input<String> requestPath) {
            this.requestPath = requestPath;
            return this;
        }

        public Builder setRequestPath(@Nullable String requestPath) {
            this.requestPath = Input.ofNullable(requestPath);
            return this;
        }

        public Builder setTimeoutSec(@Nullable Input<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }

        public Builder setTimeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Input.ofNullable(timeoutSec);
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.ofNullable(unhealthyThreshold);
            return this;
        }

        public HttpHealthCheckArgs build() {
            return new HttpHealthCheckArgs(checkIntervalSec, description, healthyThreshold, host, name, port, project, requestId, requestPath, timeoutSec, unhealthyThreshold);
        }
    }
}
