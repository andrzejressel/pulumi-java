// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.DiagnosticArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PollingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PollingOptionsArgs Empty = new PollingOptionsArgs();

    /**
     * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
     * 
     */
    @InputImport(name="diagnostics")
    private final @Nullable Input<List<DiagnosticArgs>> diagnostics;

    public Input<List<DiagnosticArgs>> getDiagnostics() {
        return this.diagnostics == null ? Input.empty() : this.diagnostics;
    }

    /**
     * JsonPath expression that determines if the request failed.
     * 
     */
    @InputImport(name="failCondition")
    private final @Nullable Input<String> failCondition;

    public Input<String> getFailCondition() {
        return this.failCondition == null ? Input.empty() : this.failCondition;
    }

    /**
     * JsonPath expression that determines if the request is completed.
     * 
     */
    @InputImport(name="finishCondition")
    private final @Nullable Input<String> finishCondition;

    public Input<String> getFinishCondition() {
        return this.finishCondition == null ? Input.empty() : this.finishCondition;
    }

    /**
     * JsonPath expression that evaluates to string, it indicates where to poll.
     * 
     */
    @InputImport(name="pollingLink")
    private final @Nullable Input<String> pollingLink;

    public Input<String> getPollingLink() {
        return this.pollingLink == null ? Input.empty() : this.pollingLink;
    }

    /**
     * JsonPath expression, after polling is completed, indicates where to fetch the resource.
     * 
     */
    @InputImport(name="targetLink")
    private final @Nullable Input<String> targetLink;

    public Input<String> getTargetLink() {
        return this.targetLink == null ? Input.empty() : this.targetLink;
    }

    public PollingOptionsArgs(
        @Nullable Input<List<DiagnosticArgs>> diagnostics,
        @Nullable Input<String> failCondition,
        @Nullable Input<String> finishCondition,
        @Nullable Input<String> pollingLink,
        @Nullable Input<String> targetLink) {
        this.diagnostics = diagnostics;
        this.failCondition = failCondition;
        this.finishCondition = finishCondition;
        this.pollingLink = pollingLink;
        this.targetLink = targetLink;
    }

    private PollingOptionsArgs() {
        this.diagnostics = Input.empty();
        this.failCondition = Input.empty();
        this.finishCondition = Input.empty();
        this.pollingLink = Input.empty();
        this.targetLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PollingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DiagnosticArgs>> diagnostics;
        private @Nullable Input<String> failCondition;
        private @Nullable Input<String> finishCondition;
        private @Nullable Input<String> pollingLink;
        private @Nullable Input<String> targetLink;

        public Builder() {
    	      // Empty
        }

        public Builder(PollingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnostics = defaults.diagnostics;
    	      this.failCondition = defaults.failCondition;
    	      this.finishCondition = defaults.finishCondition;
    	      this.pollingLink = defaults.pollingLink;
    	      this.targetLink = defaults.targetLink;
        }

        public Builder setDiagnostics(@Nullable Input<List<DiagnosticArgs>> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder setDiagnostics(@Nullable List<DiagnosticArgs> diagnostics) {
            this.diagnostics = Input.ofNullable(diagnostics);
            return this;
        }

        public Builder setFailCondition(@Nullable Input<String> failCondition) {
            this.failCondition = failCondition;
            return this;
        }

        public Builder setFailCondition(@Nullable String failCondition) {
            this.failCondition = Input.ofNullable(failCondition);
            return this;
        }

        public Builder setFinishCondition(@Nullable Input<String> finishCondition) {
            this.finishCondition = finishCondition;
            return this;
        }

        public Builder setFinishCondition(@Nullable String finishCondition) {
            this.finishCondition = Input.ofNullable(finishCondition);
            return this;
        }

        public Builder setPollingLink(@Nullable Input<String> pollingLink) {
            this.pollingLink = pollingLink;
            return this;
        }

        public Builder setPollingLink(@Nullable String pollingLink) {
            this.pollingLink = Input.ofNullable(pollingLink);
            return this;
        }

        public Builder setTargetLink(@Nullable Input<String> targetLink) {
            this.targetLink = targetLink;
            return this;
        }

        public Builder setTargetLink(@Nullable String targetLink) {
            this.targetLink = Input.ofNullable(targetLink);
            return this;
        }

        public PollingOptionsArgs build() {
            return new PollingOptionsArgs(diagnostics, failCondition, finishCondition, pollingLink, targetLink);
        }
    }
}
