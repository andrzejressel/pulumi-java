// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GtmGeomapDefaultDatacenter {
    private Integer datacenterId;
    private @Nullable String nickname;

    private GtmGeomapDefaultDatacenter() {}
    public Integer datacenterId() {
        return this.datacenterId;
    }
    public Optional<String> nickname() {
        return Optional.ofNullable(this.nickname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GtmGeomapDefaultDatacenter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer datacenterId;
        private @Nullable String nickname;
        public Builder() {}
        public Builder(GtmGeomapDefaultDatacenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenterId = defaults.datacenterId;
    	      this.nickname = defaults.nickname;
        }

        @CustomType.Setter
        public Builder datacenterId(Integer datacenterId) {
            this.datacenterId = Objects.requireNonNull(datacenterId);
            return this;
        }
        @CustomType.Setter
        public Builder nickname(@Nullable String nickname) {
            this.nickname = nickname;
            return this;
        }
        public GtmGeomapDefaultDatacenter build() {
            final var _resultValue = new GtmGeomapDefaultDatacenter();
            _resultValue.datacenterId = datacenterId;
            _resultValue.nickname = nickname;
            return _resultValue;
        }
    }
}
