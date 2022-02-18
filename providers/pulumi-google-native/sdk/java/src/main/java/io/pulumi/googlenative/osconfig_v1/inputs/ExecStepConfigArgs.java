// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.enums.ExecStepConfigInterpreter;
import io.pulumi.googlenative.osconfig_v1.inputs.GcsObjectArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common configurations for an ExecStep.
 * 
 */
public final class ExecStepConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecStepConfigArgs Empty = new ExecStepConfigArgs();

    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    @InputImport(name="allowedSuccessCodes")
    private final @Nullable Input<List<Integer>> allowedSuccessCodes;

    public Input<List<Integer>> getAllowedSuccessCodes() {
        return this.allowedSuccessCodes == null ? Input.empty() : this.allowedSuccessCodes;
    }

    /**
     * A Cloud Storage object containing the executable.
     * 
     */
    @InputImport(name="gcsObject")
    private final @Nullable Input<GcsObjectArgs> gcsObject;

    public Input<GcsObjectArgs> getGcsObject() {
        return this.gcsObject == null ? Input.empty() : this.gcsObject;
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
     * 
     */
    @InputImport(name="interpreter")
    private final @Nullable Input<ExecStepConfigInterpreter> interpreter;

    public Input<ExecStepConfigInterpreter> getInterpreter() {
        return this.interpreter == null ? Input.empty() : this.interpreter;
    }

    /**
     * An absolute path to the executable on the VM.
     * 
     */
    @InputImport(name="localPath")
    private final @Nullable Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath == null ? Input.empty() : this.localPath;
    }

    public ExecStepConfigArgs(
        @Nullable Input<List<Integer>> allowedSuccessCodes,
        @Nullable Input<GcsObjectArgs> gcsObject,
        @Nullable Input<ExecStepConfigInterpreter> interpreter,
        @Nullable Input<String> localPath) {
        this.allowedSuccessCodes = allowedSuccessCodes;
        this.gcsObject = gcsObject;
        this.interpreter = interpreter;
        this.localPath = localPath;
    }

    private ExecStepConfigArgs() {
        this.allowedSuccessCodes = Input.empty();
        this.gcsObject = Input.empty();
        this.interpreter = Input.empty();
        this.localPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecStepConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> allowedSuccessCodes;
        private @Nullable Input<GcsObjectArgs> gcsObject;
        private @Nullable Input<ExecStepConfigInterpreter> interpreter;
        private @Nullable Input<String> localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecStepConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSuccessCodes = defaults.allowedSuccessCodes;
    	      this.gcsObject = defaults.gcsObject;
    	      this.interpreter = defaults.interpreter;
    	      this.localPath = defaults.localPath;
        }

        public Builder setAllowedSuccessCodes(@Nullable Input<List<Integer>> allowedSuccessCodes) {
            this.allowedSuccessCodes = allowedSuccessCodes;
            return this;
        }

        public Builder setAllowedSuccessCodes(@Nullable List<Integer> allowedSuccessCodes) {
            this.allowedSuccessCodes = Input.ofNullable(allowedSuccessCodes);
            return this;
        }

        public Builder setGcsObject(@Nullable Input<GcsObjectArgs> gcsObject) {
            this.gcsObject = gcsObject;
            return this;
        }

        public Builder setGcsObject(@Nullable GcsObjectArgs gcsObject) {
            this.gcsObject = Input.ofNullable(gcsObject);
            return this;
        }

        public Builder setInterpreter(@Nullable Input<ExecStepConfigInterpreter> interpreter) {
            this.interpreter = interpreter;
            return this;
        }

        public Builder setInterpreter(@Nullable ExecStepConfigInterpreter interpreter) {
            this.interpreter = Input.ofNullable(interpreter);
            return this;
        }

        public Builder setLocalPath(@Nullable Input<String> localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder setLocalPath(@Nullable String localPath) {
            this.localPath = Input.ofNullable(localPath);
            return this;
        }

        public ExecStepConfigArgs build() {
            return new ExecStepConfigArgs(allowedSuccessCodes, gcsObject, interpreter, localPath);
        }
    }
}
