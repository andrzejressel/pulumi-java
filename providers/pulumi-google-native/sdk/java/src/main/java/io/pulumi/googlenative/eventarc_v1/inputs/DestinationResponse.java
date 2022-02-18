// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.eventarc_v1.inputs.CloudRunResponse;
import io.pulumi.googlenative.eventarc_v1.inputs.GKEResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a target of an invocation over HTTP.
 * 
 */
public final class DestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DestinationResponse Empty = new DestinationResponse();

    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    @InputImport(name="cloudFunction", required=true)
    private final String cloudFunction;

    public String getCloudFunction() {
        return this.cloudFunction;
    }

    /**
     * Cloud Run fully-managed resource that receives the events. The resource should be in the same project as the trigger.
     * 
     */
    @InputImport(name="cloudRun", required=true)
    private final CloudRunResponse cloudRun;

    public CloudRunResponse getCloudRun() {
        return this.cloudRun;
    }

    /**
     * A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
     */
    @InputImport(name="gke", required=true)
    private final GKEResponse gke;

    public GKEResponse getGke() {
        return this.gke;
    }

    public DestinationResponse(
        String cloudFunction,
        CloudRunResponse cloudRun,
        GKEResponse gke) {
        this.cloudFunction = Objects.requireNonNull(cloudFunction, "expected parameter 'cloudFunction' to be non-null");
        this.cloudRun = Objects.requireNonNull(cloudRun, "expected parameter 'cloudRun' to be non-null");
        this.gke = Objects.requireNonNull(gke, "expected parameter 'gke' to be non-null");
    }

    private DestinationResponse() {
        this.cloudFunction = null;
        this.cloudRun = null;
        this.gke = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudFunction;
        private CloudRunResponse cloudRun;
        private GKEResponse gke;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.gke = defaults.gke;
        }

        public Builder setCloudFunction(String cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }

        public Builder setCloudRun(CloudRunResponse cloudRun) {
            this.cloudRun = Objects.requireNonNull(cloudRun);
            return this;
        }

        public Builder setGke(GKEResponse gke) {
            this.gke = Objects.requireNonNull(gke);
            return this;
        }

        public DestinationResponse build() {
            return new DestinationResponse(cloudFunction, cloudRun, gke);
        }
    }
}
