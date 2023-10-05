// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GtmPropertyStaticRrSet {
    private @Nullable List<String> rdatas;
    private @Nullable Integer ttl;
    private @Nullable String type;

    private GtmPropertyStaticRrSet() {}
    public List<String> rdatas() {
        return this.rdatas == null ? List.of() : this.rdatas;
    }
    public Optional<Integer> ttl() {
        return Optional.ofNullable(this.ttl);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GtmPropertyStaticRrSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> rdatas;
        private @Nullable Integer ttl;
        private @Nullable String type;
        public Builder() {}
        public Builder(GtmPropertyStaticRrSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rdatas = defaults.rdatas;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder rdatas(@Nullable List<String> rdatas) {
            this.rdatas = rdatas;
            return this;
        }
        public Builder rdatas(String... rdatas) {
            return rdatas(List.of(rdatas));
        }
        @CustomType.Setter
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GtmPropertyStaticRrSet build() {
            final var _resultValue = new GtmPropertyStaticRrSet();
            _resultValue.rdatas = rdatas;
            _resultValue.ttl = ttl;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
