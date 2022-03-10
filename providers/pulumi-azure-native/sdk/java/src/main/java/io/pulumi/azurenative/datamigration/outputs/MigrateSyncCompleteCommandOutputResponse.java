// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MigrateSyncCompleteCommandOutputResponse {
    /**
     * List of errors that happened during the command execution
     * 
     */
    private final List<ReportableExceptionResponse> errors;
    /**
     * Result identifier
     * 
     */
    private final String id;

    @OutputCustomType.Constructor
    private MigrateSyncCompleteCommandOutputResponse(
        @OutputCustomType.Parameter("errors") List<ReportableExceptionResponse> errors,
        @OutputCustomType.Parameter("id") String id) {
        this.errors = errors;
        this.id = id;
    }

    /**
     * List of errors that happened during the command execution
     * 
    */
    public List<ReportableExceptionResponse> getErrors() {
        return this.errors;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSyncCompleteCommandOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReportableExceptionResponse> errors;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSyncCompleteCommandOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.id = defaults.id;
        }

        public Builder setErrors(List<ReportableExceptionResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public MigrateSyncCompleteCommandOutputResponse build() {
            return new MigrateSyncCompleteCommandOutputResponse(errors, id);
        }
    }
}
