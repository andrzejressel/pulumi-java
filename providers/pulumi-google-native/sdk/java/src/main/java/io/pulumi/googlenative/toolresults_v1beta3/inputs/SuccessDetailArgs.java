// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for an outcome with a SUCCESS outcome summary. LINT.IfChange
 * 
 */
public final class SuccessDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final SuccessDetailArgs Empty = new SuccessDetailArgs();

    /**
     * If a native process other than the app crashed.
     * 
     */
    @InputImport(name="otherNativeCrash")
    private final @Nullable Input<Boolean> otherNativeCrash;

    public Input<Boolean> getOtherNativeCrash() {
        return this.otherNativeCrash == null ? Input.empty() : this.otherNativeCrash;
    }

    public SuccessDetailArgs(@Nullable Input<Boolean> otherNativeCrash) {
        this.otherNativeCrash = otherNativeCrash;
    }

    private SuccessDetailArgs() {
        this.otherNativeCrash = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuccessDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> otherNativeCrash;

        public Builder() {
    	      // Empty
        }

        public Builder(SuccessDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.otherNativeCrash = defaults.otherNativeCrash;
        }

        public Builder setOtherNativeCrash(@Nullable Input<Boolean> otherNativeCrash) {
            this.otherNativeCrash = otherNativeCrash;
            return this;
        }

        public Builder setOtherNativeCrash(@Nullable Boolean otherNativeCrash) {
            this.otherNativeCrash = Input.ofNullable(otherNativeCrash);
            return this;
        }

        public SuccessDetailArgs build() {
            return new SuccessDetailArgs(otherNativeCrash);
        }
    }
}
