// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Details for an outcome with a SUCCESS outcome summary. LINT.IfChange
 * 
 */
public final class SuccessDetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final SuccessDetailResponse Empty = new SuccessDetailResponse();

    /**
     * If a native process other than the app crashed.
     * 
     */
    @InputImport(name="otherNativeCrash", required=true)
    private final Boolean otherNativeCrash;

    public Boolean getOtherNativeCrash() {
        return this.otherNativeCrash;
    }

    public SuccessDetailResponse(Boolean otherNativeCrash) {
        this.otherNativeCrash = Objects.requireNonNull(otherNativeCrash, "expected parameter 'otherNativeCrash' to be non-null");
    }

    private SuccessDetailResponse() {
        this.otherNativeCrash = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuccessDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean otherNativeCrash;

        public Builder() {
    	      // Empty
        }

        public Builder(SuccessDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.otherNativeCrash = defaults.otherNativeCrash;
        }

        public Builder setOtherNativeCrash(Boolean otherNativeCrash) {
            this.otherNativeCrash = Objects.requireNonNull(otherNativeCrash);
            return this;
        }

        public SuccessDetailResponse build() {
            return new SuccessDetailResponse(otherNativeCrash);
        }
    }
}
