// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.TargetPoolSessionAffinity;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetPoolArgs Empty = new TargetPoolArgs();

    /**
     * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1]. backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    @InputImport(name="backupPool")
    private final @Nullable Input<String> backupPool;

    public Input<String> getBackupPool() {
        return this.backupPool == null ? Input.empty() : this.backupPool;
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
     * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of the field must be in [0, 1]. If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below this number, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    @InputImport(name="failoverRatio")
    private final @Nullable Input<Double> failoverRatio;

    public Input<Double> getFailoverRatio() {
        return this.failoverRatio == null ? Input.empty() : this.failoverRatio;
    }

    /**
     * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
     * 
     */
    @InputImport(name="healthChecks")
    private final @Nullable Input<List<String>> healthChecks;

    public Input<List<String>> getHealthChecks() {
        return this.healthChecks == null ? Input.empty() : this.healthChecks;
    }

    /**
     * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
     * 
     */
    @InputImport(name="instances")
    private final @Nullable Input<List<String>> instances;

    public Input<List<String>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
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

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Session affinity option, must be one of the following values: NONE: Connections from the same client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
     * 
     */
    @InputImport(name="sessionAffinity")
    private final @Nullable Input<TargetPoolSessionAffinity> sessionAffinity;

    public Input<TargetPoolSessionAffinity> getSessionAffinity() {
        return this.sessionAffinity == null ? Input.empty() : this.sessionAffinity;
    }

    public TargetPoolArgs(
        @Nullable Input<String> backupPool,
        @Nullable Input<String> description,
        @Nullable Input<Double> failoverRatio,
        @Nullable Input<List<String>> healthChecks,
        @Nullable Input<List<String>> instances,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<TargetPoolSessionAffinity> sessionAffinity) {
        this.backupPool = backupPool;
        this.description = description;
        this.failoverRatio = failoverRatio;
        this.healthChecks = healthChecks;
        this.instances = instances;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.sessionAffinity = sessionAffinity;
    }

    private TargetPoolArgs() {
        this.backupPool = Input.empty();
        this.description = Input.empty();
        this.failoverRatio = Input.empty();
        this.healthChecks = Input.empty();
        this.instances = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.sessionAffinity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backupPool;
        private @Nullable Input<String> description;
        private @Nullable Input<Double> failoverRatio;
        private @Nullable Input<List<String>> healthChecks;
        private @Nullable Input<List<String>> instances;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<TargetPoolSessionAffinity> sessionAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPool = defaults.backupPool;
    	      this.description = defaults.description;
    	      this.failoverRatio = defaults.failoverRatio;
    	      this.healthChecks = defaults.healthChecks;
    	      this.instances = defaults.instances;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.sessionAffinity = defaults.sessionAffinity;
        }

        public Builder setBackupPool(@Nullable Input<String> backupPool) {
            this.backupPool = backupPool;
            return this;
        }

        public Builder setBackupPool(@Nullable String backupPool) {
            this.backupPool = Input.ofNullable(backupPool);
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

        public Builder setFailoverRatio(@Nullable Input<Double> failoverRatio) {
            this.failoverRatio = failoverRatio;
            return this;
        }

        public Builder setFailoverRatio(@Nullable Double failoverRatio) {
            this.failoverRatio = Input.ofNullable(failoverRatio);
            return this;
        }

        public Builder setHealthChecks(@Nullable Input<List<String>> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }

        public Builder setHealthChecks(@Nullable List<String> healthChecks) {
            this.healthChecks = Input.ofNullable(healthChecks);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<String> instances) {
            this.instances = Input.ofNullable(instances);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
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

        public Builder setSessionAffinity(@Nullable Input<TargetPoolSessionAffinity> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        public Builder setSessionAffinity(@Nullable TargetPoolSessionAffinity sessionAffinity) {
            this.sessionAffinity = Input.ofNullable(sessionAffinity);
            return this;
        }

        public TargetPoolArgs build() {
            return new TargetPoolArgs(backupPool, description, failoverRatio, healthChecks, instances, name, project, region, requestId, sessionAffinity);
        }
    }
}
