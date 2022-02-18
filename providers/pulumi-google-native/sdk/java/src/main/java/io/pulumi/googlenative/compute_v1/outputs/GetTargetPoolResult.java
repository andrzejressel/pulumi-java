// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTargetPoolResult {
    /**
     * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1]. backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    private final String backupPool;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of the field must be in [0, 1]. If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below this number, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    private final Double failoverRatio;
    /**
     * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
     * 
     */
    private final List<String> healthChecks;
    /**
     * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
     * 
     */
    private final List<String> instances;
    /**
     * Type of the resource. Always compute#targetPool for target pools.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * URL of the region where the target pool resides.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Session affinity option, must be one of the following values: NONE: Connections from the same client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
     * 
     */
    private final String sessionAffinity;

    @OutputCustomType.Constructor({"backupPool","creationTimestamp","description","failoverRatio","healthChecks","instances","kind","name","region","selfLink","sessionAffinity"})
    private GetTargetPoolResult(
        String backupPool,
        String creationTimestamp,
        String description,
        Double failoverRatio,
        List<String> healthChecks,
        List<String> instances,
        String kind,
        String name,
        String region,
        String selfLink,
        String sessionAffinity) {
        this.backupPool = Objects.requireNonNull(backupPool);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.failoverRatio = Objects.requireNonNull(failoverRatio);
        this.healthChecks = Objects.requireNonNull(healthChecks);
        this.instances = Objects.requireNonNull(instances);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
    }

    /**
     * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1]. backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    public String getBackupPool() {
        return this.backupPool;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of the field must be in [0, 1]. If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below this number, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    public Double getFailoverRatio() {
        return this.failoverRatio;
    }
    /**
     * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
     * 
     */
    public List<String> getHealthChecks() {
        return this.healthChecks;
    }
    /**
     * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
     * 
     */
    public List<String> getInstances() {
        return this.instances;
    }
    /**
     * Type of the resource. Always compute#targetPool for target pools.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * URL of the region where the target pool resides.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Session affinity option, must be one of the following values: NONE: Connections from the same client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
     * 
     */
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPool;
        private String creationTimestamp;
        private String description;
        private Double failoverRatio;
        private List<String> healthChecks;
        private List<String> instances;
        private String kind;
        private String name;
        private String region;
        private String selfLink;
        private String sessionAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPool = defaults.backupPool;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.failoverRatio = defaults.failoverRatio;
    	      this.healthChecks = defaults.healthChecks;
    	      this.instances = defaults.instances;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.sessionAffinity = defaults.sessionAffinity;
        }

        public Builder setBackupPool(String backupPool) {
            this.backupPool = Objects.requireNonNull(backupPool);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFailoverRatio(Double failoverRatio) {
            this.failoverRatio = Objects.requireNonNull(failoverRatio);
            return this;
        }

        public Builder setHealthChecks(List<String> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }

        public Builder setInstances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSessionAffinity(String sessionAffinity) {
            this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
            return this;
        }

        public GetTargetPoolResult build() {
            return new GetTargetPoolResult(backupPool, creationTimestamp, description, failoverRatio, healthChecks, instances, kind, name, region, selfLink, sessionAffinity);
        }
    }
}
