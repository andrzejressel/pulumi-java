// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.LogConfigCloudAuditOptionsResponse;
import io.pulumi.googlenative.compute_v1.inputs.LogConfigCounterOptionsResponse;
import io.pulumi.googlenative.compute_v1.inputs.LogConfigDataAccessOptionsResponse;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogConfigResponse Empty = new LogConfigResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="cloudAudit", required=true)
    private final LogConfigCloudAuditOptionsResponse cloudAudit;

    public LogConfigCloudAuditOptionsResponse getCloudAudit() {
        return this.cloudAudit;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="counter", required=true)
    private final LogConfigCounterOptionsResponse counter;

    public LogConfigCounterOptionsResponse getCounter() {
        return this.counter;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="dataAccess", required=true)
    private final LogConfigDataAccessOptionsResponse dataAccess;

    public LogConfigDataAccessOptionsResponse getDataAccess() {
        return this.dataAccess;
    }

    public LogConfigResponse(
        LogConfigCloudAuditOptionsResponse cloudAudit,
        LogConfigCounterOptionsResponse counter,
        LogConfigDataAccessOptionsResponse dataAccess) {
        this.cloudAudit = Objects.requireNonNull(cloudAudit, "expected parameter 'cloudAudit' to be non-null");
        this.counter = Objects.requireNonNull(counter, "expected parameter 'counter' to be non-null");
        this.dataAccess = Objects.requireNonNull(dataAccess, "expected parameter 'dataAccess' to be non-null");
    }

    private LogConfigResponse() {
        this.cloudAudit = null;
        this.counter = null;
        this.dataAccess = null;
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
