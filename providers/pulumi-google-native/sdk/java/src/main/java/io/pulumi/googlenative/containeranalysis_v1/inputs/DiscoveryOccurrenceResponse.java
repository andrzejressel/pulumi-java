// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.StatusResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Provides information about the analysis status of a discovered resource.
 * 
 */
public final class DiscoveryOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiscoveryOccurrenceResponse Empty = new DiscoveryOccurrenceResponse();

    /**
     * The status of discovery for the resource.
     * 
     */
    @InputImport(name="analysisStatus", required=true)
    private final String analysisStatus;

    public String getAnalysisStatus() {
        return this.analysisStatus;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
     * 
     */
    @InputImport(name="analysisStatusError", required=true)
    private final StatusResponse analysisStatusError;

    public StatusResponse getAnalysisStatusError() {
        return this.analysisStatusError;
    }

    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    @InputImport(name="continuousAnalysis", required=true)
    private final String continuousAnalysis;

    public String getContinuousAnalysis() {
        return this.continuousAnalysis;
    }

    /**
     * The CPE of the resource being scanned.
     * 
     */
    @InputImport(name="cpe", required=true)
    private final String cpe;

    public String getCpe() {
        return this.cpe;
    }

    /**
     * The last time this resource was scanned.
     * 
     */
    @InputImport(name="lastScanTime", required=true)
    private final String lastScanTime;

    public String getLastScanTime() {
        return this.lastScanTime;
    }

    public DiscoveryOccurrenceResponse(
        String analysisStatus,
        StatusResponse analysisStatusError,
        String continuousAnalysis,
        String cpe,
        String lastScanTime) {
        this.analysisStatus = Objects.requireNonNull(analysisStatus, "expected parameter 'analysisStatus' to be non-null");
        this.analysisStatusError = Objects.requireNonNull(analysisStatusError, "expected parameter 'analysisStatusError' to be non-null");
        this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis, "expected parameter 'continuousAnalysis' to be non-null");
        this.cpe = Objects.requireNonNull(cpe, "expected parameter 'cpe' to be non-null");
        this.lastScanTime = Objects.requireNonNull(lastScanTime, "expected parameter 'lastScanTime' to be non-null");
    }

    private DiscoveryOccurrenceResponse() {
        this.analysisStatus = null;
        this.analysisStatusError = null;
        this.continuousAnalysis = null;
        this.cpe = null;
        this.lastScanTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analysisStatus;
        private StatusResponse analysisStatusError;
        private String continuousAnalysis;
        private String cpe;
        private String lastScanTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
    	      this.cpe = defaults.cpe;
    	      this.lastScanTime = defaults.lastScanTime;
        }

        public Builder setAnalysisStatus(String analysisStatus) {
            this.analysisStatus = Objects.requireNonNull(analysisStatus);
            return this;
        }

        public Builder setAnalysisStatusError(StatusResponse analysisStatusError) {
            this.analysisStatusError = Objects.requireNonNull(analysisStatusError);
            return this;
        }

        public Builder setContinuousAnalysis(String continuousAnalysis) {
            this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis);
            return this;
        }

        public Builder setCpe(String cpe) {
            this.cpe = Objects.requireNonNull(cpe);
            return this;
        }

        public Builder setLastScanTime(String lastScanTime) {
            this.lastScanTime = Objects.requireNonNull(lastScanTime);
            return this;
        }

        public DiscoveryOccurrenceResponse build() {
            return new DiscoveryOccurrenceResponse(analysisStatus, analysisStatusError, continuousAnalysis, cpe, lastScanTime);
        }
    }
}
