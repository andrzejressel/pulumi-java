// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.composer_v1.inputs.SchedulerResourceResponse;
import io.pulumi.googlenative.composer_v1.inputs.WebServerResourceResponse;
import io.pulumi.googlenative.composer_v1.inputs.WorkerResourceResponse;
import java.util.Objects;


/**
 * The Kubernetes workloads configuration for GKE cluster associated with the Cloud Composer environment. Supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
 * 
 */
public final class WorkloadsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkloadsConfigResponse Empty = new WorkloadsConfigResponse();

    /**
     * Optional. Resources used by Airflow schedulers.
     * 
     */
    @InputImport(name="scheduler", required=true)
    private final SchedulerResourceResponse scheduler;

    public SchedulerResourceResponse getScheduler() {
        return this.scheduler;
    }

    /**
     * Optional. Resources used by Airflow web server.
     * 
     */
    @InputImport(name="webServer", required=true)
    private final WebServerResourceResponse webServer;

    public WebServerResourceResponse getWebServer() {
        return this.webServer;
    }

    /**
     * Optional. Resources used by Airflow workers.
     * 
     */
    @InputImport(name="worker", required=true)
    private final WorkerResourceResponse worker;

    public WorkerResourceResponse getWorker() {
        return this.worker;
    }

    public WorkloadsConfigResponse(
        SchedulerResourceResponse scheduler,
        WebServerResourceResponse webServer,
        WorkerResourceResponse worker) {
        this.scheduler = Objects.requireNonNull(scheduler, "expected parameter 'scheduler' to be non-null");
        this.webServer = Objects.requireNonNull(webServer, "expected parameter 'webServer' to be non-null");
        this.worker = Objects.requireNonNull(worker, "expected parameter 'worker' to be non-null");
    }

    private WorkloadsConfigResponse() {
        this.scheduler = null;
        this.webServer = null;
        this.worker = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulerResourceResponse scheduler;
        private WebServerResourceResponse webServer;
        private WorkerResourceResponse worker;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduler = defaults.scheduler;
    	      this.webServer = defaults.webServer;
    	      this.worker = defaults.worker;
        }

        public Builder setScheduler(SchedulerResourceResponse scheduler) {
            this.scheduler = Objects.requireNonNull(scheduler);
            return this;
        }

        public Builder setWebServer(WebServerResourceResponse webServer) {
            this.webServer = Objects.requireNonNull(webServer);
            return this;
        }

        public Builder setWorker(WorkerResourceResponse worker) {
            this.worker = Objects.requireNonNull(worker);
            return this;
        }

        public WorkloadsConfigResponse build() {
            return new WorkloadsConfigResponse(scheduler, webServer, worker);
        }
    }
}
