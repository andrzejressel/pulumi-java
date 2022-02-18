// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class SuccessDetailResponse {
    /**
     * If a native process other than the app crashed.
     * 
     */
    private final Boolean otherNativeCrash;

    @OutputCustomType.Constructor({"otherNativeCrash"})
    private SuccessDetailResponse(Boolean otherNativeCrash) {
        this.otherNativeCrash = Objects.requireNonNull(otherNativeCrash);
    }

    /**
     * If a native process other than the app crashed.
     * 
     */
    public Boolean getOtherNativeCrash() {
        return this.otherNativeCrash;
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
