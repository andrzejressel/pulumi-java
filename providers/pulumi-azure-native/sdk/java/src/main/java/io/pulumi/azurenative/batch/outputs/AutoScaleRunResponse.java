// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.AutoScaleRunErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoScaleRunResponse {
    private final @Nullable AutoScaleRunErrorResponse error;
    private final String evaluationTime;
    /**
     * Each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     * 
     */
    private final @Nullable String results;

    @OutputCustomType.Constructor
    private AutoScaleRunResponse(
        @OutputCustomType.Parameter("error") @Nullable AutoScaleRunErrorResponse error,
        @OutputCustomType.Parameter("evaluationTime") String evaluationTime,
        @OutputCustomType.Parameter("results") @Nullable String results) {
        this.error = error;
        this.evaluationTime = evaluationTime;
        this.results = results;
    }

    public Optional<AutoScaleRunErrorResponse> getError() {
        return Optional.ofNullable(this.error);
    }
    public String getEvaluationTime() {
        return this.evaluationTime;
    }
    /**
     * Each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     * 
    */
    public Optional<String> getResults() {
        return Optional.ofNullable(this.results);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoScaleRunErrorResponse error;
        private String evaluationTime;
        private @Nullable String results;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.evaluationTime = defaults.evaluationTime;
    	      this.results = defaults.results;
        }

        public Builder setError(@Nullable AutoScaleRunErrorResponse error) {
            this.error = error;
            return this;
        }

        public Builder setEvaluationTime(String evaluationTime) {
            this.evaluationTime = Objects.requireNonNull(evaluationTime);
            return this;
        }

        public Builder setResults(@Nullable String results) {
            this.results = results;
            return this;
        }
        public AutoScaleRunResponse build() {
            return new AutoScaleRunResponse(error, evaluationTime, results);
        }
    }
}
