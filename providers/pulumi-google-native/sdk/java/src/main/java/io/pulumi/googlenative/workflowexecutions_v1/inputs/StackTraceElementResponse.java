// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.workflowexecutions_v1.inputs.PositionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A single stack element (frame) where an error occurred.
 * 
 */
public final class StackTraceElementResponse extends io.pulumi.resources.InvokeArgs {

    public static final StackTraceElementResponse Empty = new StackTraceElementResponse();

    /**
     * The source position information of the stack trace element.
     * 
     */
    @InputImport(name="position", required=true)
    private final PositionResponse position;

    public PositionResponse getPosition() {
        return this.position;
    }

    /**
     * The routine where the error occurred.
     * 
     */
    @InputImport(name="routine", required=true)
    private final String routine;

    public String getRoutine() {
        return this.routine;
    }

    /**
     * The step the error occurred at.
     * 
     */
    @InputImport(name="step", required=true)
    private final String step;

    public String getStep() {
        return this.step;
    }

    public StackTraceElementResponse(
        PositionResponse position,
        String routine,
        String step) {
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.routine = Objects.requireNonNull(routine, "expected parameter 'routine' to be non-null");
        this.step = Objects.requireNonNull(step, "expected parameter 'step' to be non-null");
    }

    private StackTraceElementResponse() {
        this.position = null;
        this.routine = null;
        this.step = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackTraceElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PositionResponse position;
        private String routine;
        private String step;

        public Builder() {
    	      // Empty
        }

        public Builder(StackTraceElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.position = defaults.position;
    	      this.routine = defaults.routine;
    	      this.step = defaults.step;
        }

        public Builder setPosition(PositionResponse position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setRoutine(String routine) {
            this.routine = Objects.requireNonNull(routine);
            return this;
        }

        public Builder setStep(String step) {
            this.step = Objects.requireNonNull(step);
            return this;
        }

        public StackTraceElementResponse build() {
            return new StackTraceElementResponse(position, routine, step);
        }
    }
}
