// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanRunWarningTraceCode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Output only. Defines a warning trace message for ScanRun. Warning traces provide customers with useful information that helps make the scanning process more effective.
 * 
 */
public final class ScanRunWarningTraceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScanRunWarningTraceArgs Empty = new ScanRunWarningTraceArgs();

    /**
     * Indicates the warning code.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<ScanRunWarningTraceCode> code;

    public Input<ScanRunWarningTraceCode> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    public ScanRunWarningTraceArgs(@Nullable Input<ScanRunWarningTraceCode> code) {
        this.code = code;
    }

    private ScanRunWarningTraceArgs() {
        this.code = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunWarningTraceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ScanRunWarningTraceCode> code;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunWarningTraceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder setCode(@Nullable Input<ScanRunWarningTraceCode> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable ScanRunWarningTraceCode code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public ScanRunWarningTraceArgs build() {
            return new ScanRunWarningTraceArgs(code);
        }
    }
}
