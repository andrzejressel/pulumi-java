// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.LogConfigCloudAuditOptionsResponse;
import io.pulumi.googlenative.compute_v1.outputs.LogConfigCounterOptionsResponse;
import io.pulumi.googlenative.compute_v1.outputs.LogConfigDataAccessOptionsResponse;
import java.util.Objects;

@OutputCustomType
public final class LogConfigResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final LogConfigCloudAuditOptionsResponse cloudAudit;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final LogConfigCounterOptionsResponse counter;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final LogConfigDataAccessOptionsResponse dataAccess;

    @OutputCustomType.Constructor({"cloudAudit","counter","dataAccess"})
    private LogConfigResponse(
        LogConfigCloudAuditOptionsResponse cloudAudit,
        LogConfigCounterOptionsResponse counter,
        LogConfigDataAccessOptionsResponse dataAccess) {
        this.cloudAudit = Objects.requireNonNull(cloudAudit);
        this.counter = Objects.requireNonNull(counter);
        this.dataAccess = Objects.requireNonNull(dataAccess);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    public LogConfigCloudAuditOptionsResponse getCloudAudit() {
        return this.cloudAudit;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    public LogConfigCounterOptionsResponse getCounter() {
        return this.counter;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    public LogConfigDataAccessOptionsResponse getDataAccess() {
        return this.dataAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigCloudAuditOptionsResponse cloudAudit;
        private LogConfigCounterOptionsResponse counter;
        private LogConfigDataAccessOptionsResponse dataAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAudit = defaults.cloudAudit;
    	      this.counter = defaults.counter;
    	      this.dataAccess = defaults.dataAccess;
        }

        public Builder setCloudAudit(LogConfigCloudAuditOptionsResponse cloudAudit) {
            this.cloudAudit = Objects.requireNonNull(cloudAudit);
            return this;
        }

        public Builder setCounter(LogConfigCounterOptionsResponse counter) {
            this.counter = Objects.requireNonNull(counter);
            return this;
        }

        public Builder setDataAccess(LogConfigDataAccessOptionsResponse dataAccess) {
            this.dataAccess = Objects.requireNonNull(dataAccess);
            return this;
        }

        public LogConfigResponse build() {
            return new LogConfigResponse(cloudAudit, counter, dataAccess);
        }
    }
}
