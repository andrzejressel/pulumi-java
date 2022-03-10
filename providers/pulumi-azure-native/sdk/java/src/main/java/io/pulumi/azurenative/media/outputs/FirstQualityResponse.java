// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class FirstQualityResponse {
    /**
     * The first quality bitrate.
     * 
     */
    private final Integer bitrate;

    @OutputCustomType.Constructor
    private FirstQualityResponse(@OutputCustomType.Parameter("bitrate") Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * The first quality bitrate.
     * 
    */
    public Integer getBitrate() {
        return this.bitrate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirstQualityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bitrate;

        public Builder() {
    	      // Empty
        }

        public Builder(FirstQualityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrate = defaults.bitrate;
        }

        public Builder setBitrate(Integer bitrate) {
            this.bitrate = Objects.requireNonNull(bitrate);
            return this;
        }
        public FirstQualityResponse build() {
            return new FirstQualityResponse(bitrate);
        }
    }
}
